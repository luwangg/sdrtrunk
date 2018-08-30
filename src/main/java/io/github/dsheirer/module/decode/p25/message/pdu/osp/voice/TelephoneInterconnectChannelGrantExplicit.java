/*******************************************************************************
 * sdr-trunk
 * Copyright (C) 2014-2018 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by  the Free Software Foundation, either version 3 of the License, or  (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without even the implied
 * warranty of  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License  along with this program.
 * If not, see <http://www.gnu.org/licenses/>
 *
 ******************************************************************************/
package io.github.dsheirer.module.decode.p25.message.pdu.osp.voice;

import io.github.dsheirer.alias.AliasList;
import io.github.dsheirer.bits.BinaryMessage;
import io.github.dsheirer.bits.CorrectedBinaryMessage;
import io.github.dsheirer.edac.CRCP25;
import io.github.dsheirer.identifier.IIdentifier;
import io.github.dsheirer.identifier.integer.channel.APCO25ExplicitChannel;
import io.github.dsheirer.identifier.integer.channel.IAPCO25Channel;
import io.github.dsheirer.identifier.integer.talkgroup.APCO25AnyTalkgroup;
import io.github.dsheirer.module.decode.p25.message.FrequencyBandReceiver;
import io.github.dsheirer.module.decode.p25.message.pdu.PDUMessage;
import io.github.dsheirer.module.decode.p25.reference.DataUnitID;
import io.github.dsheirer.module.decode.p25.reference.ServiceOptions;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TelephoneInterconnectChannelGrantExplicit extends PDUMessage implements FrequencyBandReceiver
{
    public static final int[] ADDRESS = {88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105,
        106, 107, 108, 109, 110, 111};
    public static final int[] SERVICE_OPTIONS = {128, 129, 130, 131, 132, 133, 134, 135};
    public static final int[] DOWNLINK_FREQUENCY_BAND = {160, 161, 162, 163};
    public static final int[] DOWNLINK_CHANNEL_NUMBER = {164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175};
    public static final int[] UPLINK_FREQUENCY_BAND = {176, 177, 178, 179};
    public static final int[] UPLINK_CHANNEL_NUMBER = {180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191};
    public static final int[] CALL_TIMER = {192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207};
    public static final int[] MULTIPLE_BLOCK_CRC = {224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236,
        237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255};

    private ServiceOptions mServiceOptions;
    private IIdentifier mAnyAddress;
    private IAPCO25Channel mChannel;

    public TelephoneInterconnectChannelGrantExplicit(CorrectedBinaryMessage message, int nac, long timestamp)
    {
        super(message, nac, timestamp);

        /* Header block is already error detected/corrected - perform error
         * detection correction on the intermediate and final data blocks */
//        mMessage = CRCP25.correctPDU1(mMessage);
//        mCRC[1] = mMessage.getCRC();
    }



    public String getEventType()
    {
        return Opcode.TELEPHONE_INTERCONNECT_VOICE_CHANNEL_GRANT.getDescription();
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(getMessageStub());
        sb.append(" ").append(getServiceOptions());
        sb.append(" ADDR:");
        sb.append(getAddress());
        sb.append(" CALL TIMER:");
        sb.append(mTimeDurationFormat.format(new Date(getCallTimer())));
        sb.append(" CHAN:" + getChannel());

        return sb.toString();
    }

    public ServiceOptions getServiceOptions()
    {
        if(mServiceOptions == null)
        {
            mServiceOptions = new ServiceOptions(mMessage.getInt(SERVICE_OPTIONS));
        }

        return mServiceOptions;
    }

    public IIdentifier getAddress()
    {
        if(mAnyAddress == null)
        {
            mAnyAddress = APCO25AnyTalkgroup.create(mMessage.getInt(ADDRESS));
        }

        return mAnyAddress;
    }

    /*
     * Call timer in milliseconds
     */
    public long getCallTimer()
    {
        int timer = getMessage().getInt(CALL_TIMER);

        return timer / 100;
    }

    public IAPCO25Channel getChannel()
    {
        if(mChannel == null)
        {
            mChannel = APCO25ExplicitChannel.create(mMessage.getInt(DOWNLINK_FREQUENCY_BAND),
                mMessage.getInt(DOWNLINK_CHANNEL_NUMBER), mMessage.getInt(UPLINK_FREQUENCY_BAND),
                mMessage.getInt(UPLINK_CHANNEL_NUMBER));
        }

        return mChannel;
    }

    @Override
    public List<IAPCO25Channel> getChannels()
    {
        List<IAPCO25Channel> channels = new ArrayList<>();
        channels.add(getChannel());
        return channels;
    }
}

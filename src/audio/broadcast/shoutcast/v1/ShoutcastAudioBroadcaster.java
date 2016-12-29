/*******************************************************************************
 * sdrtrunk
 * Copyright (C) 2014-2016 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 ******************************************************************************/
package audio.broadcast.shoutcast.v1;

import audio.broadcast.AudioBroadcaster;
import audio.broadcast.BroadcastConfiguration;
import audio.broadcast.shoutcast.ShoutcastMetadataUpdater;
import audio.metadata.AudioMetadata;
import controller.ThreadPoolManager;

public abstract class ShoutcastAudioBroadcaster extends AudioBroadcaster
{
    private ShoutcastMetadataUpdater mMetadataUpdater;

    public ShoutcastAudioBroadcaster(ThreadPoolManager threadPoolManager, BroadcastConfiguration broadcastConfiguration)
    {
        super(threadPoolManager, broadcastConfiguration);
    }

    @Override
    protected void broadcastMetadata(AudioMetadata metadata)
    {
        if(mMetadataUpdater == null)
        {
            mMetadataUpdater = new ShoutcastMetadataUpdater(getThreadPoolManager(),
                (ShoutcastV1Configuration)getBroadcastConfiguration());
        }

        mMetadataUpdater.update(metadata);
    }
}

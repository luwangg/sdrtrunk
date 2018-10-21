package io.github.dsheirer.module.decode.p25.message.tsbk;

import io.github.dsheirer.module.decode.p25.reference.Direction;
import io.github.dsheirer.module.decode.p25.reference.Vendor;

import java.util.EnumSet;

public enum Opcode
{
    //Vendor: standard, Outbound Service Packet (OSP)
    OSP_GROUP_VOICE_CHANNEL_GRANT("GRP_VCH_GRANT", 0),
    OSP_RESERVED_01("RESERVED_01", 1),
    OSP_GROUP_VOICE_CHANNEL_GRANT_UPDATE("GRP_VCH_GRNT_UPD", 2),
    OSP_GROUP_VOICE_CHANNEL_GRANT_UPDATE_EXPLICIT("GRP_VCH_GRNT_UPX", 3),
    OSP_UNIT_TO_UNIT_VOICE_CHANNEL_GRANT("UU_VCH_GRANT", 4),
    OSP_UNIT_TO_UNIT_ANSWER_REQUEST("UU_ANS_REQ", 5),
    OSP_UNIT_TO_UNIT_VOICE_CHANNEL_GRANT_UPDATE("UU_VCH_GRANT_UPD", 6),
    OSP_RESERVED_07("RESERVED_07", 7),
    OSP_TELEPHONE_INTERCONNECT_VOICE_CHANNEL_GRANT("TEL_INT_VCH_GRNT", 8),
    OSP_TELEPHONE_INTERCONNECT_VOICE_CHANNEL_GRANT_UPDATE("TEL_INT_VCH_GRNU", 9),
    OSP_TELEPHONE_INTERCONNECT_ANSWER_REQUEST("TEL_INT_ANS_RQST", 10),
    OSP_RESERVED_0B("RESERVED_0B", 11),
    OSP_RESERVED_0C("RESERVED_0C", 12),
    OSP_RESERVED_0D("RESERVED_0D", 13),
    OSP_RESERVED_0E("RESERVED_0E", 14),
    OSP_RESERVED_0F("RESERVED_0F", 15),
    OSP_INDIVIDUAL_DATA_CHANNEL_GRANT("IND_DCH_GRANT", 16),               //OBSOLETE
    OSP_GROUP_DATA_CHANNEL_GRANT("GRP_DCH_GRANT", 17),                    //OBSOLETE
    OSP_GROUP_DATA_CHANNEL_ANNOUNCEMENT("GRP_DCH_ANNOUNCE", 18),          //OBSOLETE
    OSP_GROUP_DATA_CHANNEL_ANNOUNCEMENT_EXPLICIT("GRP_DCH_ANNC_EXP", 19), //OBSOLETE
    OSP_SNDCP_DATA_CHANNEL_GRANT("SNDCP_DCH_GRANT", 20),
    OSP_SNDCP_DATA_PAGE_REQUEST("SNDCP_DCH_PAG_RQ", 21),
    OSP_SNDCP_DATA_CHANNEL_ANNOUNCEMENT_EXPLICIT("SNDCP_DCH_ANN_EX", 22),
    OSP_RESERVED_17("RESERVED_17", 23),
    OSP_STATUS_UPDATE("STATUS_UPDATE", 24),
    OSP_RESERVED_19("RESERVED_19", 25),
    OSP_STATUS_QUERY("OSP_STATUS_QUERY", 26),
    OSP_RESERVED_1B("RESERVED_1B", 27),
    OSP_MESSAGE_UPDATE("MESSAGE_UPDATE", 28),
    OSP_RADIO_UNIT_MONITOR_COMMAND("RADIO_MONITR_CMD", 29),
    OSP_RESERVED_1E("RESERVED_1E", 30),
    OSP_CALL_ALERT("CALL_ALERT", 31),
    OSP_ACKNOWLEDGE_RESPONSE("ACK_RESPONSE_FNE", 32),
    OSP_QUEUED_RESPONSE("QUEUED_RESPONSE", 33),
    OSP_RESERVED_22("RESERVED_22", 34),
    OSP_RESERVED_23("RESERVED_23", 35),
    OSP_EXTENDED_FUNCTION_COMMAND("EXTNDED_FUNC_CMD", 36),
    OSP_RESERVED_25("RESERVED_25", 37),
    OSP_RESERVED_26("RESERVED_26", 38),
    OSP_DENY_RESPONSE("DENY_RESPONSE", 39),
    OSP_GROUP_AFFILIATION_RESPONSE("GRP_AFFIL_RESP", 40),
    OSP_SECONDARY_CONTROL_CHANNEL_BROADCAST_EXPLICIT("SCCB_CCH_BCST_EX", 41),
    OSP_GROUP_AFFILIATION_QUERY("GRP_AFFIL_QUERY", 42),
    OSP_LOCATION_REGISTRATION_RESPONSE("LOCN_REG_RESPONS", 43),
    OSP_UNIT_REGISTRATION_RESPONSE("UNIT_REG_RESPONS", 44),
    OSP_UNIT_REGISTRATION_COMMAND("UNIT_REG_COMMAND", 45),
    OSP_AUTHENTICATION_COMMAND("AUTH_COMMAND", 46),
    OSP_UNIT_DEREGISTRATION_ACKNOWLEDGE("DE_REGIST_ACK", 47),
    OSP_TDMA_SYNC_BROADCAST("TDMA_SYNC_BCST", 48),
    OSP_AUTHENTICATION_DEMAND("AUTH_DEMAND", 49),
    OSP_AUTHENTICATION_FNE_RESPONSE("AUTH_FNE_RESP", 50),
    OSP_IDENTIFIER_UPDATE_TDMA("IDEN_UPDATE_TDMA", 51),
    OSP_IDENTIFIER_UPDATE_VHF_UHF_BANDS("IDEN_UPDATE_VUHF", 52),
    OSP_TIME_DATE_ANNOUNCEMENT("TIME_DATE_ANNOUN", 53),
    OSP_ROAMING_ADDRESS_COMMAND("ROAM_ADDR_CMD", 54),
    OSP_ROAMING_ADDRESS_UPDATE("ROAM_ADDR_UPDATE", 55),
    OSP_SYSTEM_SERVICE_BROADCAST("SYS_SVC_BCAST", 56),
    OSP_SECONDARY_CONTROL_CHANNEL_BROADCAST("SEC_CCH_BROADCST", 57),
    OSP_RFSS_STATUS_BROADCAST("RFSS_STATUS_BCST", 58),
    OSP_NETWORK_STATUS_BROADCAST("NET_STATUS_BCAST", 59),
    OSP_ADJACENT_STATUS_BROADCAST("ADJ SITE STATUS", 60),
    OSP_IDENTIFIER_UPDATE("IDEN_UPDATE", 61),
    OSP_PROTECTION_PARAMETER_BROADCAST("ENCRYPT_PAR_BCST", 62),
    OSP_PROTECTION_PARAMETER_UPDATE("ENCRYPT_PAR_UPDT", 63),
    OSP_UNKNOWN("OSP UNKNOWN", -1),

    //Vendor: standard, Inbound Service Packet (ISP)
    ISP_GROUP_VOICE_SERVICE_REQUEST("GRP_V_REQ", 0),
    ISP_RESERVED_01("RESERVED_01", 1),
    ISP_RESERVED_02("RESERVED_02", 2),
    ISP_RESERVED_03("RESERVED_03", 3),
    ISP_UNIT_TO_UNIT_VOICE_SERVICE_REQUEST("UU_V_REQ", 4),
    ISP_UNIT_TO_UNIT_ANSWER_RESPONSE("UU_ANS_RSP", 5),
    ISP_RESERVED_06("RESERVED_06", 6),
    ISP_RESERVED_07("RESERVED_07", 7),
    ISP_TELEPHONE_INTERCONNECT_EXPLICIT_DIAL_REQUEST("TELE_INT_DIAL_REQ", 8),
    ISP_TELEPHONE_INTERCONNECT_PSTN_REQUEST("TELE_INT_PSTN_REQ", 9),
    ISP_TELEPHONE_INTERCONNECT_ANSWER_RESPONSE("TELE_INT_ANS_RSP", 10),
    ISP_RESERVED_0B("RESERVED_07", 11),
    ISP_RESERVED_0C("RESERVED_07", 12),
    ISP_RESERVED_0D("RESERVED_07", 13),
    ISP_RESERVED_0E("RESERVED_07", 14),
    ISP_RESERVED_0F("RESERVED_07", 15),
    ISP_INDIVIDUAL_DATA_SERVICE_REQUEST("IND_DATA_REQ", 16),  //OBSOLETE
    ISP_GROUP_DATA_SERVICE_REQUEST("GRP_DATA_REQ", 17),       //OBSOLETE
    ISP_SNDCP_DATA_CHANNEL_REQUEST("SN-DATA_CHN_REQ", 18),
    ISP_SNDCP_DATA_PAGE_RESPONSE("SN-DATA_PAGE_RES", 19),
    ISP_SNDCP_RECONNECT_REQUEST("SN-REC_REQ", 20),
    ISP_RESERVED_15("RESERVED_15", 21),
    ISP_RESERVED_16("RESERVED_16", 22),
    ISP_RESERVED_17("RESERVED_17", 23),
    ISP_STATUS_UPDATE_REQUEST("STS_UPDT_REQ", 24),
    ISP_STATUS_QUERY_RESPONSE("STS_Q_RSP", 25),
    ISP_STATUS_QUERY_REQUEST("STS_Q_REQ", 26),
    ISP_RESERVED_1B("RESERVED_1B", 27),
    ISP_MESSAGE_UPDATE_REQUEST("MSG_UPDT_REQ", 28),
    ISP_RADIO_UNIT_MONITOR_REQUEST("RAD_MON_REQ", 29),
    ISP_RESERVED_1E("RESERVED_1E", 30),
    ISP_CALL_ALERT_REQUEST("CALL_ALRT_REQ", 31),
    ISP_UNIT_ACKNOWLEDGE_RESPONSE("ACK_RSP_U", 32),
    ISP_RESERVED_21("RESERVED_21", 33),
    ISP_RESERVED_22("RESERVED_22", 34),
    ISP_CANCEL_SERVICE_REQUEST("CAN_SRV_REQ", 35),
    ISP_EXTENDED_FUNCTION_RESPONSE("EXT_FNCT_RSP", 36),
    ISP_RESERVED_25("RESERVED_25", 37),
    ISP_RESERVED_26("RESERVED_26", 38),
    ISP_EMERGENCY_ALARM_REQUEST("EMRG_ALRM_REQ", 39),
    ISP_GROUP_AFFILIATION_REQUEST("GRP_AFF_REQ", 40),
    ISP_GROUP_AFFILIATION_QUERY_RESPONSE("GRP_AFF_Q_RSP", 41),
    ISP_RESERVED_2A("RESERVED_2A", 42),
    ISP_UNIT_DE_REGISTRATION_REQUEST("U_DE_REG_REQ", 43),
    ISP_UNIT_REGISTRATION_REQUEST("U_REG_REQ", 44),
    ISP_LOCATION_REGISTRATION_REQUEST("LOC_REG_REQ", 45),
    ISP_AUTHENTICATION_QUERY_OBSOLETE("AUTH_Q", 46),               //OBSOLETE
    ISP_AUTHENTICATION_RESPONSE_OBSOLETE("AUTH_RSP", 47),          //OBSOLETE
    ISP_PROTECTION_PARAMETER_REQUEST("P_PARM_REQ", 48),
    ISP_RESERVED_31("RESERVED_31", 49),
    ISP_IDENTIFIER_UPDATE_REQUEST("IDEN_UP_REQ", 50),
    ISP_RESERVED_33("RESERVED_33", 51),
    ISP_RESERVED_34("RESERVED_34", 52),
    ISP_RESERVED_35("RESERVED_35", 53),
    ISP_ROAMING_ADDRESS_REQUEST("ROAM_ADDR_REQ", 54),
    ISP_ROAMING_ADDRESS_RESPONSE("ROAM_ADDR_RSP", 55),
    ISP_AUTHENTICATION_RESPONSE("AUTH_RESP", 56),
    ISP_AUTHENTICATION_RESPONSE_MUTUAL("AUTH_RESP_M", 57),
    ISP_AUTHENTICATION_FNE_RESULT("AUTH_FNE_RST", 58),
    ISP_AUTHENTICATION_SU_DEMAND("AUTH_SU_DMD", 59),
    ISP_RESERVED_3C("RESERVED_3C", 60),
    ISP_RESERVED_3D("RESERVED_3D", 61),
    ISP_RESERVED_3E("RESERVED_3E", 62),
    ISP_RESERVED_3F("RESERVED_3F", 63),
    ISP_UNKNOWN("ISP UNKNOWN", -1),

    //Vendor: motorola, Inbound Service Packet (ISP)
    MOTOROLA_ISP_UNKNOWN("MOTOROLA ISP UNKNOWN OPCODE", -1),

    //Vendor: motorola, Outbound Service Packet (OSP)
    MOTOROLA_OSP_PATCH_GROUP_ADD( "PATCH GROUP ADD", 0x00 ),
    MOTOROLA_OSP_PATCH_GROUP_DELETE( "PATCH GROUP DELE", 0x01 ),
    MOTOROLA_OSP_PATCH_GROUP_CHANNEL_GRANT( "PTCH GRP VCHN GR", 0x02 ),
    MOTOROLA_OSP_PATCH_GROUP_CHANNEL_GRANT_UPDATE( "PTCH GRP VCH UPD",0x03 ),
    MOTOROLA_OSP_TRAFFIC_CHANNEL_ID( "CHANNEL CWID", 0x05 ),
    MOTOROLA_OSP_SYSTEM_LOADING( "SYSTEM LOADING", 0x09 ),
    MOTOROLA_OSP_CONTROL_CHANNEL_ID( "CCH BASE STAT ID", 0x0B ),
    MOTOROLA_OSP_CONTROL_CHANNEL_PLANNED_SHUTDOWN( "CCH PLND SHUTDWN", 0x0E ),
    MOTOROLA_OSP_UNKNOWN("MOTOROLA OSP UNKNOWN OPCODE", -1),

    //Vendor: unknown, Inbound Service Packet (ISP)
    UNKNOWN_VENDOR_ISP("UNKNOWN VENDOR/OPCODE ISP", -1),

    //Vendor: unknown, Outbound Service Packet (OSP)
    UNKNOWN_VENDOR_OSP("UNKNOWN VENDOR/OPCODE OSP", -1);

    private String mLabel;
    private int mCode;

    public static final EnumSet<Opcode> STANDARD_OUTBOUND_OPCODES = EnumSet.range(OSP_GROUP_VOICE_CHANNEL_GRANT,
            OSP_PROTECTION_PARAMETER_UPDATE);
    public static final EnumSet<Opcode> STANDARD_INBOUND_OPCODES = EnumSet.range(ISP_GROUP_VOICE_SERVICE_REQUEST,
            ISP_RESERVED_3F);

    Opcode(String label, int code)
    {
        mLabel = label;
        mCode = code;
    }

    public String getLabel()
    {
        return mLabel;
    }

    /**
     * Numeric value for the opcode
     */
    public int getCode()
    {
        return mCode;
    }

    @Override
    public String toString()
    {
        return mLabel;
    }

    @Deprecated //use the ISP/OSP version of this method instead
    public static Opcode fromValue(int value)
    {
        if(0 <= value && value <= 63)
        {
            return values()[value];
        }

        return OSP_UNKNOWN;
    }

   public static Opcode fromValue(int value, Direction direction, Vendor vendor)
    {
        switch(vendor)
        {
            case STANDARD:
                if(direction == Direction.OUTBOUND)
                {
                    if(0 <= value && value <= 63)
                    {
                        for(Opcode outboundOpcode: STANDARD_OUTBOUND_OPCODES)
                        {
                            if(outboundOpcode.getCode() == value)
                            {
                                return outboundOpcode;
                            }
                        }
                    }

                    return OSP_UNKNOWN;
                }
                else
                {
                    if(0 <= value && value <= 63)
                    {
                        for(Opcode inboundOpcode: STANDARD_INBOUND_OPCODES)
                        {
                            if(inboundOpcode.getCode() == value)
                            {
                                return inboundOpcode;
                            }
                        }
                    }

                    return ISP_UNKNOWN;
                }
            case MOTOROLA:
                if(direction == Direction.INBOUND)
                {
                    return MOTOROLA_ISP_UNKNOWN;
                }
                else
                {
                    switch(value)
                    {
                        case 0x00:
                            return MOTOROLA_OSP_PATCH_GROUP_ADD;
                        case 0x01:
                            return MOTOROLA_OSP_PATCH_GROUP_DELETE;
                        case 0x02:
                            return MOTOROLA_OSP_PATCH_GROUP_CHANNEL_GRANT;
                        case 0x03:
                            return MOTOROLA_OSP_PATCH_GROUP_CHANNEL_GRANT_UPDATE;
                        case 0x05:
                            return MOTOROLA_OSP_TRAFFIC_CHANNEL_ID;
                        case 0x09:
                            return MOTOROLA_OSP_SYSTEM_LOADING;
                        case 0x0B:
                            return MOTOROLA_OSP_CONTROL_CHANNEL_ID;
                        case 0x0E:
                            return MOTOROLA_OSP_CONTROL_CHANNEL_PLANNED_SHUTDOWN;
                        default:
                            return MOTOROLA_OSP_UNKNOWN;
                    }
                }
            default:
                if(direction == Direction.INBOUND)
                {
                    return UNKNOWN_VENDOR_ISP;
                }
                else
                {
                    return UNKNOWN_VENDOR_OSP;
                }
        }
    }
}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * zone status change event, corresponding to event type DH_ALARM_DEFENCE_STATE_CHANGE_EVENT
 * \else
 * 7@GxW4L,1d;/JB<~, 6TS&JB<~@`PMSDK_ALARM_DEFENCE_STATE_CHANGE_EVENT
 * \endif
 */
public class ALARM_DEFENCE_STATUS_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zone ID#,as alarm input channel no.(from 0)
	 * \else
	 * 7@GxID#,<41(>/JdHkM(5@:E(4S0?*J<)
	 * \endif
	 */
    public int                     nChannelID;
    
    /**
     * \if ENGLISH_LANG
     * event time
     * \else
     * JB<~7"Iz5DJ1<d
     * \endif
     */
    public NET_TIME                stuTime = new NET_TIME();
    
    /**
     * \if ENGLISH_LANG
     * zone changed status, EM_DEFENCE_STATE_TYPE
     * \else
     * 7@Gx1d;/:s5DW4L,, EM_DEFENCE_STATE_TYPE
     * \endif
     */
    public int   emStatus;
}

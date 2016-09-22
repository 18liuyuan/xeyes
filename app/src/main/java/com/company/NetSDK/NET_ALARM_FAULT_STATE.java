package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm fault state, INetSDK.QueryDevStatecorresponding to command SDK_DEVSTATE_ALARM_FAULT_STATE
 * \else
 * 1(>/9JUOW4L,, INetSDK.QueryDevState6TS&C|AnSDK_DEVSTATE_ALARM_FAULT_STATE
 * \endif
 */
public class NET_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Input parameter
	 * \else
	 * JdHk2NJ}
	 * \endif
	 */
	public NET_IN_ALARM_FAULT_STATE stuIn   = new NET_IN_ALARM_FAULT_STATE();
	
	/**
	 * \if ENGLISH_LANG
	 * Output parameter
	 * \else
	 * Jd3v2NJ}
	 * \endif
	 */
	public NET_OUT_ALARM_FAULT_STATE stuOut = new NET_OUT_ALARM_FAULT_STATE();
}


package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status, INetSDK.QueryDevStatecorresponding to command SDK_DEVSTATE_ALARMSUBSYSTEM_STATE
 * \else
 * 1(>/WSO5M3W4L,, INetSDK.QueryDevState6TS&C|AnSDK_DEVSTATE_ALARMSUBSYSTEM_STATE
 * \endif
 */
public class NET_ALARM_SUBSYSTEM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid Sub System Number
	 * \else
	 * SPP'WSO5M38vJ}
	 * \endif
	 */
	public int		nMaxAlarmSubSystem;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub System Status Info, EM_ALARM_SUBSYSTEM_STATE_TYPE
	 * \else
	 * WSO5M3W4L,PEO", EM_ALARM_SUBSYSTEM_STATE_TYPE
	 * \endif
	 */
	public int emState[] = new int[FinalVar.SDK_MAX_ALARM_SUBSYSTEM_NUM];  
}

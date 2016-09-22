package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Local Alarm Event(6TSDK_ALARM_ALARM_EX upgrade)
 * \else
 * 1>5X1(>/JB<~(6TSDK_ALARM_ALARM_EXI}<6)
 * \endif
 */
public class ALARM_ALARM_INFO_EX2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: start 1: stop
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int                 nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor Type {@link com.company.NetSDK.NET_SENSE_METHOD NET_SENSE_METHOD}
	 * \else
	 * 4+8PFw@`PM {@link com.company.NetSDK.NET_SENSE_METHOD NET_SENSE_METHOD}
	 * \endif
	 */
	public int                 emSenseType;
}

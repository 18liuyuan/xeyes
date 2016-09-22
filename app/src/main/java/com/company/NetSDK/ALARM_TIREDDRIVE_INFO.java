package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fatigue Driving Alarm
 * \else
 * F#@M<]J;1(>/
 * \endif
 */
public class ALARM_TIREDDRIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * struct size
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * 3VPx<]J;J1<d#,5%N;7VVS
	 * \endif
	 */
	public int               nDriveTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * drive time, unit:minute
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();
}

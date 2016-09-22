package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vandal-proof Alarm Event
 * \else
 * 7@2p1(>/JB<~
 * \endif
 */
public class ALARM_CHASSISINTRUDED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension Module Alarm Event
 * \else
 * @)U9D#?i1(>/JB<~
 * \endif
 */
public class ALARM_ALARMEXTENDED_INFO implements Serializable {
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
	 * 0:start 1:stop
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
}

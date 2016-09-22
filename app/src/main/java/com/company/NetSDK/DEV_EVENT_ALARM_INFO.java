package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_ALARM_LOCALALARM and EVENT_ALARM_MOTIONALARM's data
 * \else
 * 1(>/JB<~@`PM EVENT_ALARM_LOCALALARM(Mb2?1(>/)#,EVENT_ALARM_MOTIONALARM(6/<l1(>/)1(>/)
 * \endif
 */
public class DEV_EVENT_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * evnent name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * evnet ID 
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int                 nEventID;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm status
 * \else
 * 1(>/W4L,
 * \endif
 */
public class ALARMCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel. It begins from 0. 
	 * \else
	 * 1(>/M(5@:E#,4S0?*J<
	 * \endif
	 */
	public int					nAlarmNo;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:activate alarm,0:stop alarm  
	 * \else
	 * 1#:4%7"1(>/#,0#:M#V91(>/
	 * \endif
	 */
	public int					nAction;
}

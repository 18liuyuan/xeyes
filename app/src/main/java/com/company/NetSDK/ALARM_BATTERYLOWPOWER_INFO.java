package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Voltage Overlow Alarm
 * \else
 * 5g3X5gQ99}5M1(>/
 * \endif
 */
public class ALARM_BATTERYLOWPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:Start 1:Stop 
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * Surplus Power %#,Unit%
	 * \else
	 * J#S`5gA?0Y7V1H#,5%N;%
	 * \endif
	 */
	public int               nBatteryLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Time 
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();                            
}

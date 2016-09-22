package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IO control command. Corresponding to QueryIOControlState
 * \else
 * IO?XVFC|An#,6TS&  QueryIOControlState=S?Z
 * \endif
 */
public class SDK_IOTYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control alarm input 
	 * \else
	 * ?XVF1(>/JdHk
	 * \endif
	 */
	public static final int     SDK_ALARMINPUT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm output 
	 * \else
	 * ?XVF1(>/Jd3v
	 * \endif
	 */
	public static final int     SDK_ALARMOUTPUT = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm decoder output
	 * \else
	 * ?XVF1(>/=bBkFwJd3v
	 * \endif
	 */
	public static final int     SDK_DECODER_ALARMOUT = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Control wireless alarm output 
	 * \else
	 * ?XVFN^O_1(>/Jd3v
	 * \endif
	 */
	public static final int     SDK_WIRELESS_ALARMOUT = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation type(auto/manual/close). Use TRIGGER_MODE_CONTROL structure
	 * \else
	 * 1(>/4%7"7=J=#(JV6/,WT6/,9X1U#)#,J9SC TRIGGER_MODE_CONTROL =a99Le
	 * \endif
	 */
	public static final int     SDK_ALARM_TRIGGER_MODE = 7;
}

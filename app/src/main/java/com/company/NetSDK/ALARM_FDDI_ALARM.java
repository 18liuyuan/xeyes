package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Optical Fiber Code Ability Alarm
 * \else
 * 9bOK1`BkD\A&1(>/
 * \endif
 */
public class ALARM_FDDI_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Optical Fiber Amounts 
	 * \else
	 * 9bOKJ}D?
	 * \endif
	 */
	public int         nFDDINum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optical Fiber Alarm
	 * \else
	 * 9bOK1(>/
	 * \endif
	 */
	public byte        bAlarm[] = new byte[256];
}

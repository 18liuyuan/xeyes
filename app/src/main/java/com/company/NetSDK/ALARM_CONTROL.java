package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm IO control
 * \else
 * 1(>/?XVF@`
 * \endif
 */
public class ALARM_CONTROL implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Port status
	 * \else
	 * 6K?ZW4L,
	 * \endif
	 */
	public short		state;
}

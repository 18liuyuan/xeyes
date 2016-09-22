package com.company.NetSDK;

import java.io.Serializable;

public class CFG_NET_TIME_EX implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Year 
	 * \else
	 * Dj
	 * \endif
	 */
	public int				dwYear;
	
 	/**
	 * \if ENGLISH_LANG
	 * Month 
	 * \else
	 * TB
	 * \endif
	 */
	public int				dwMonth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Day 
	 * \else
	 * HU
	 * \endif
	 */
	public int				dwDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * J1
	 * \endif
	 */
	public int				dwHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Minute 
	 * \else
	 * 7V
	 * \endif
	 */
	public int				dwMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Second 
	 * \else
	 * Ck
	 * \endif
	 */
	public int				dwSecond;
	
 	/**
	 * \if ENGLISH_LANG
	 * Millisecond
	 * \else
	 * :ACk
	 * \endif
	 */
	public int             dwMillisecond;
}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * class of time
 * \else
 * J1<d@`
 * \endif
 */
public class NET_TIME implements Serializable {
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
	public long				dwYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month
	 * \else
	 * TB
	 * \endif
	 */
	public long				dwMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Day
	 * \else
	 * HU
	 * \endif
	 */
	public long				dwDay;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * J1
	 * \endif
	 */
	public long				dwHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute
	 * \else
	 * 7V
	 * \endif
	 */
	public long				dwMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Second
	 * \else
	 * Ck
	 * \endif
	 */
	public long				dwSecond;
	
	public String toString() {
		 String time = String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				 dwYear,dwMonth,dwDay,
				dwHour,dwMinute,dwSecond);
		 return time;
	 }
}

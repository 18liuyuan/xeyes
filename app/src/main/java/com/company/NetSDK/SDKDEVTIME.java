package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The time definition in the log information
 * \else
 * HUV>PEO"@o5DJ1<d6(Re
 * \endif
 */
public class SDKDEVTIME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Second	1-60	
	 * \else
	 * Ck	1-60	
	 * \endif
	 */
	public int				second;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute	1-60
	 * \else
	 * 7V	1-60
	 * \endif
	 */
	public int				minute;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour		1-24		
	 * \else
	 * J1	1-24
	 * \endif
	 */
	public int				hour;
	
	/**
	 * \if ENGLISH_LANG
	 * Date		1-31
	 * \else
	 * HU	1-31	
	 * \endif
	 */
	public int				day;
	
	/**
	 * \if ENGLISH_LANG
	 * Month	1-12	
	 * \else
	 * TB	1-12	
	 * \endif
	 */
	public int				month;
	
	/**
	 * \if ENGLISH_LANG
	 * Year	2000-2063
	 * \else
	 * Dj	2000-2063
	 * \endif
	 */
	public int				year;
}

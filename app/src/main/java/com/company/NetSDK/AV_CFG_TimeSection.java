package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period
 * \else
 * J1<d6N
 * \endif
 */
public class AV_CFG_TimeSection implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Sub Mask
	 * \else
	 * QZBk
	 * \endif
	 */
	public int			nMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin hour
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public int			nBeginHour;
	
	public int			nBeginMinute;
	
	public int			nBeginSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * End hour
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public int			nEndHour;
	
	public int			nEndMinute;
	
	public int			nEndSecond;
}

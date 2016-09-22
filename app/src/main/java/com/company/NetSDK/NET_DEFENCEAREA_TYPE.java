package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Armed Zone Type
 * \else
 * 7@Gx@`PM
 * \endif
 */
public class NET_DEFENCEAREA_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Armed Zone
	 * \else
	 * N4V*@`PM7@Gx
	 * \endif
	 */
	public static final int NET_DEFENCEAREA_TYPE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * On/Off Armed Zone
	 * \else
	 * ?*9XA?7@Gx
	 * \endif
	 */
	public static final int NET_DEFENCEAREA_TYPE_ALARM = 1;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Type
 * \else
 * ETB7W4L,@`PM
 * \endif
 */
public class NET_BYPASS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Status
	 * \else
	 * N4V*W4L,
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_UNKNOW = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * ETB7
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_BYPASS = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * U}3#
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_NORMAL = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Isolate
	 * \else
	 * 8t@k
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_ISOLATED = 3;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * burning error code
 * \else
 * ?LB<4mNsBk
 * \endif
 */

public class NET_BURN_ERROR_CODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * normal
	 * \else
	 * U}3#
	 * \endif
	 */
	public static final int BURN_CODE_NORMAL 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown error
	 * \else
	 * N4V*4mNs
	 * \endif
	 */
	public static final int BURN_CODE_UNKNOWN_ERROR  = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * burning full
	 * \else
	 * ?LB<Bz
	 * \endif
	 */
	public static final int BURN_CODE_SPACE_FULL  = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * start burning error
	 * \else
	 * ?*J<?LB<3v4m
	 * \endif
	 */
	public static final int BURN_CODE_START_ERROR  = 3;
	
	
	/**
	 * \if ENGLISH_LANG
	 * stop burning error
	 * \else
	 * M#V93v4m
	 * \endif
	 */
	public static final int BURN_CODE_STOP_ERROR  = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * burning error
	 * \else
	 * ?LB<3v4m
	 * \endif
	 */
	public static final int BURN_CODE_WRITE_ERROR  = 5;
	
}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power current status type
 * \else
 * 5gT45gAwW4L,@`PM
 * \endif
 */
public class EM_CURRENT_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * N4V*
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNKNOWN 		= 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too high
	 * \else
	 * 5gAw9}TX
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_OVER_CURRENT 	= 1 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current normal
	 * \else
	 * 5gAwU}3#
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_NORMAL			= 2 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too low
	 * \else
	 * 5gT4G7Aw
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNDER_CURRENT  = 3 ;
}

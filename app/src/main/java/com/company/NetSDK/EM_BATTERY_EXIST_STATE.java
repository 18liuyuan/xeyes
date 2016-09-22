package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * battery in-place status
 * \else
 * 5g3XTZN;W4L,
 * \endif
 */
public class EM_BATTERY_EXIST_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * N4V*
	 * \endif
	 */
	public final static int 	EM_BATTERY_EXIST_STATE_UNKNOWN = 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * battery in-place
	 * \else
	 * 5g3XTZN;
	 * \endif
	 */
	public final static int    	EM_BATTERY_EXIST_STATE_EXIST   = 1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * battery lost
	 * \else
	 * 5g3X6*J'
	 * \endif
	 */
	public final static int     EM_BATTERY_EXIST_STATE_MISSING = 2 ; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activation Type 
 * \else
 * TFL(A*6/@`PM
 * \endif
 */
public class CFG_LINK_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * No Activation
	 * \else
	 * N^A*6/
	 * \endif
	 */
	public static final int LINK_TYPE_NONE = 0;						    		

	/**
	 * \if ENGLISH_LANG
	 * Activitation Preset Point
	 * \else
	 * A*6/T$VC5c
	 * \endif
	 */
	public static final int LINK_TYPE_PRESET = 1;								

	/**
	 * \if ENGLISH_LANG
	 * Activation Tour
	 * \else
	 * A*6/Q2:=
	 * \endif
	 */
	public static final int LINK_TYPE_TOUR = 2;									

	/**
	 * \if ENGLISH_LANG
	 * Activation Pattern
	 * \else
	 * A*6/9l<#
	 * \endif
	 */
	public static final int LINK_TYPE_PATTERN = 3;								
}

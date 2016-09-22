package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Electronic Fence Type
 * \else
 * 5gWSN'@8@`PMC6>Y
 * \endif
 */
public class ENCLOSURE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Speed Zone
	 * \else
	 * O^KYGx
	 * \endif
	 */
	public static final int ENCLOSURE_LIMITSPEED = 0x01;                    
 	/**
	 * \if ENGLISH_LANG
	 * Driver Zone
	 * \else
	 * <]J;Gx
	 * \endif
	 */
	public static final int ENCLOSURE_DRIVEALLOW = 0x02;                    
 	/**
	 * \if ENGLISH_LANG
	 * Forbidden Zone
	 * \else
	 * ={V9Gx
	 * \endif
	 */
	public static final int ENCLOSURE_FORBIDDRIVE = 0x04;                   
 	/**
	 * \if ENGLISH_LANG
	 * Loading Area
	 * \else
	 * W0;uGx
	 * \endif
	 */
	public static final int ENCLOSURE_LOADGOODS = 0x08;                     
 	/**
	 * \if ENGLISH_LANG
	 * Unloading Area
	 * \else
	 * P6;uGx
	 * \endif
	 */
	public static final int ENCLOSURE_UPLOADGOODS = 0x10;                   
}

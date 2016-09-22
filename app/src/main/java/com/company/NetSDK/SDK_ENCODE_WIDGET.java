package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD attribute structure
 * \else
 * OSDJtPT=a99
 * \endif
 */
public class SDK_ENCODE_WIDGET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front ground 
	 * \else
	 * No<~5DG0>0#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H
	 * \endif
	 */
	public int				rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Back ground 
	 * \else
	 * No<~5D13>0#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H
	 * \endif
	 */
	public int				rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position 
	 * \else
	 * N;VC
	 * \endif
	 */
	public SDK_RECT				rcRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Show
	 * \else
	 * OTJ>J9D\
	 * \endif
	 */
	public byte				bShow;
	
	/**
	 * \if ENGLISH_LANG
	 * Extend Function Mask#,0-Not Display#,1-Display 
	 * \else
	 * @)U9J9D\ #,QZBk  bit0 1mJ>JG7qOTJ>PGFZ<8#,0-2;OTJ> 1-OTJ> 
	 * \endif
	 */
	public byte                bExtFuncMask;
}

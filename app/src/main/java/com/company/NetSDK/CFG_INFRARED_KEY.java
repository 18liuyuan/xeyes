package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel buttons
 * \else
 * :lMbCf0e04<|
 * \endif
 */
public class CFG_INFRARED_KEY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Panel buttons name
	 * \else
	 * Cf0e04<|C{3F
	 * \endif
	 */
	public char       szName[] = new char[FinalVar.CFG_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 *  Panel buttons to display text, buttons label
	 * \else
	 * Cf0e04<|OTJ>NDWV#,04E%label
	 * \endif
	 */
	public char			szText[] = new char[FinalVar.CFG_COMMON_STRING_64];
	
}
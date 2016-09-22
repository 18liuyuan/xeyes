package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The language types device supported 
 * \else
 * Ih18V'3VSoQTVV@`
 * \endif
 */
public class SDK_DEV_LANGUAGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The language amount supported
	 * \else
	 * V'3VSoQT8vJ}
	 * \endif
	 */
	public int					dwLanguageNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Enumeration value please refer to SDK_LANGUAGE_TYPE
	 * \else
	 * C6>YV5#,Oj<{ DK_LANGUAGE_TYPE
	 * \endif
	 */
	public byte					byLanguageType[] = new byte[252];	
}

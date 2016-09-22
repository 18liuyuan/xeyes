package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activation type 
 * \else
 * 4%7"7=J=
 * \endif
 */
public class TRIGGER_MODE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Activation way(0:close.1:manual.2:auto); The SDK reserves the original setup if you do not set channel here. 
	 * \else
	 * 4%7"7=J=(09X1U1JV6/2WT6/);2;IhVC5DM(5@#,sdkD,HO=+1#3VT-@45DIhVC
	 * \endif
	 */
	public short		mode;
}

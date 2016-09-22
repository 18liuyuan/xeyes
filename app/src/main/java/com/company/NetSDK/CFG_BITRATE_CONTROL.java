package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * BkAw?XVFD#J=
 * \endif
 */
public class CFG_BITRATE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control Bit Rate
	 * \else
	 * 9L6(BkAw
	 * \endif
	 */
	public static final int     BITRATE_CBR = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Variable Bit Rate
	 * \else
	 * ?I1dBkAw
	 * \endif
	 */
	public static final int     BITRATE_VBR = 1;
}

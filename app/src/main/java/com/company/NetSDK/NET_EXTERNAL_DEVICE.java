package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External device info
 * \else
 * Mb=SIh18PEO"
 * \endif
 */
public class NET_EXTERNAL_DEVICE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * External device type, NET_EXT_DEV_TYPE
	 * \else
	 * MbIh@`PM, NET_EXT_DEV_TYPE
	 * \endif
	 */
	public int			   emType;
	
	/**
	 * \if ENGLISH_LANG
	 * External device ID.
	 * \else
	 * Ih18ID#,N(R;1`:E
	 * \endif
	 */
	public byte				szDevID[] = new byte[FinalVar.DH_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * IR button name
	 * \else
	 * Ih18C{3F
	 * \endif
	 */
	public byte				szDevName[] = new byte[FinalVar.DH_DEV_ID_LEN_EX];
}
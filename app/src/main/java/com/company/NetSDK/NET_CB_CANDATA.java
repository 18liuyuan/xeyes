package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * <`L}CANW\O_J}>]
 * \endif
 */
public class NET_CB_CANDATA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * FUM(J}>]3$6H
	 * \endif
	 */
	public int					nDataLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * FUM(J}>]DZH]
	 * \endif
	 */
	public char[]				pDataContent;
}

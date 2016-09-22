package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * 6K?ZPr:E
 * \endif
 */
public class NET_CB_ExChangeData implements Serializable {
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
	public int					nDataLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public String				pRevData;
}

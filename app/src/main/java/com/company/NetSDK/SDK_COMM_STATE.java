package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial port status
 * \else
 * 4.?Z;y1>JtPT
 * \endif
 */
public class SDK_COMM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * JG7q?*Ft
	 * \endif
	 */
	public int					uBeOpened;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2(LXBJ
	 * \endif
	 */
	public int					uBaudRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * J}>]N;
	 * \endif
	 */
	public int					uDataBites;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * M#V9N;
	 * \endif
	 */
	public int					uStopBits;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * P#QiN;
	 * \endif
	 */
	public int					uParity;
}

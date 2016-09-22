package com.company.NetSDK;

import java.io.Serializable;

public class GPS_POINT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H)Hg6+>-120.1782746H1mJ>N*300178274
	 * \endif
	 */
	public int         dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * latidude
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)Hg11N330.1833826H1mJ>N*120183382
	 * \endif
	 */
	public int         dwLatidude; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Crossing information
 * \else
 * B7?ZPEO"
 * \endif
 */
public class CROSSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Crossing ID
	 * \else
	 * B7?ZPrAP:E
	 * \endif
	 */
	public byte				szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Latitude(0-180 Degree, 30.183382 degree==120183382)
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)Hg11N330#(.#)1833826H1mJ>N*120183382)
	 * \endif
	 */
	public int 				dwLatitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * Longitude(0-360 Degree, 120.178274 degree==300178274)
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H) Hg6+>-120#(.#)1782746H1mJ>N*300178274#)
	 * \endif
	 */
	public int				dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * limit speed(KM/H)
	 * \else
	 * B7?ZO^KYV5,5%N;Km/h 01mJ>2;O^KY,FdK{1mJ>O^KYV5IOO^
	 * \endif
	 */
	public short			wSpeedLimit;
}

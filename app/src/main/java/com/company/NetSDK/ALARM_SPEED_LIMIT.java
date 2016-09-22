package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of speed limit (SDK_DEVSTATE_SPEED_LIMIT)
 * \else
 * O^KY1(>/;rB7?ZO^KY1(>/ (SDK_DEVSTATE_SPEED_LIMIT)
 * \endif
 */
public class ALARM_SPEED_LIMIT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * alarm type oLowerSpeed, UpperSpeed	
	 * \else
	 * O^KY1(>/@`1p#:LowerSpeed, UpperSpeed
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_SPEEDLIMIT_TYPE_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * limit speed KM/H 
	 * \else
	 * O^KY 5%N;KM/H 
	 * \endif
	 */
	public int                 iSpeedLimit;
	
 	/**
	 * \if ENGLISH_LANG
	 * speed KM/H
	 * \else
	 * KY6H 5%N;KM/H
	 * \endif
	 */
	public int                 iSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * crossing ID
	 * \else
	 * B7?ZPrAP:E
	 * \endif
	 */
	public byte                szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID];
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H)Hg6+>-120.1782746H1mJ>N*300178274
	 * \endif
	 */
	public int                 dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)Hg11N330.1833826H1mJ>N*120183382
	 * \endif
	 */
	public int                 dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 1(>/7"IzJ1<d
	 * \endif
	 */
	public SDKDEVTIME          stTime = new SDKDEVTIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-in real time,1-to fill 
	 * \else
	 * 0-J5J1 1-294+ 
	 * \endif
	 */
	public byte                bOffline;
}

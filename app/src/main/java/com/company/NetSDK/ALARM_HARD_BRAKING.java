package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of hard braking
 * \else
 * <1I2351(>/
 * \endif
 */
public class ALARM_HARD_BRAKING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * 51G0J1<d
	 * \endif
	 */
	public NET_TIME        stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)Hg11N330.1833826H1mJ>N*120183382
	 * \endif
	 */
	public int           dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H)Hg6+>-120.1782746H1mJ>N*300178274
	 * \endif
	 */
	public int           dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * driver id
	 * \else
	 * <]J;T1ID
	 * \endif
	 */
	public byte            szDriverNo[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * 51G0KY6H
	 * \endif
	 */
	public int           dwCurSpeed;
}

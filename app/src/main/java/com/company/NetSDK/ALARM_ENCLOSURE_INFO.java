package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Electronic Fence Alarm
 * \else
 * 5gWSN'@81(>/
 * \endif
 */
public class ALARM_ENCLOSURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Effective Electronic Fence Types Number 
	 * \else
	 * SPP'5gWSN'@8@`PM8vJ}
	 * \endif
	 */
	public int           nTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic Fence Type, Details As Follows ENCLOSURE_TYPE
	 * \else
	 * 5gWSN'@8@`PM, <{ENCLOSURE_TYPE
	 * \endif
	 */
	public byte          bType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Effective Alarm Types Number 
	 * \else
	 * SPP'1(>/@`PM8vJ}
	 * \endif
	 */
	public int           nAlarmTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Types#,Details As Follows  ENCLOSURE_ALARM_TYPE
	 * \else
	 * 1(>/@`PM#,<{ ENCLOSURE_ALARM_TYPE
	 * \endif
	 */
	public byte          bAlarmType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * Driver Job Number 
	 * \else
	 * K>;z9$:E
	 * \endif
	 */
	public byte          szDriverId[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic FenceID 
	 * \else
	 * 5gWSN'@8ID
	 * \endif
	 */
	public int          unEnclosureId;
	
 	/**
	 * \if ENGLISH_LANG
	 * Speed Limit#,Unit km/h 
	 * \else
	 * O^KY#,5%N;km/h
	 * \endif
	 */
	public int          unLimitSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Current Speed 
	 * \else
	 * 51G0KY6H
	 * \endif
	 */
	public int          unCurrentSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring time 
	 * \else
	 * 1(>/7"IzJ1<d
	 * \endif
	 */
	public NET_TIME      stAlarmTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * Longitude(Unit is 1/1,000,000!c#,Ranges From 0-360!c)As East Longitude120.178274!cMeans 300178274 
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H)Hg6+>-120.1782746H1mJ>N*300178274
	 * \endif
	 */
	public int         dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * Latitude(Unit is 1/1,000,000!c#,Ranges From0-180!c)As North Latitude 30.183382!cMeans120183382 
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)Hg11N330.1833826H1mJ>N*120183382
	 * \endif
	 */
	public int         dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-live 1-send 
	 * \else
	 * 0-J5J1 1-294+ 
	 * \endif
	 */
	public byte          bOffline;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure config
 * \else
 * 5gWSN'@8EdVC
 * \endif
 */
public class SDKDEV_ENCLOSURE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mask
	 * \else
	 * 5gWSN'@8@`PMQZBk#,<{ ENCLOSURE_TYPE
	 * \endif
	 */
	public int          unType;

	/**
	 * \if ENGLISH_LANG
	 * front 4 bit means country, province, city, town
	 * \else
	 * G0KDN;7V1p4z1m9z<R!"J!!"JP;rGx!"OX(0-255)#,:s4bytes1#At
	 * \endif
	 */
	public byte          bRegion[] = new byte[8];

	/**
	 * \if ENGLISH_LANG
	 * rect id
	 * \else
	 * R;8vGxSrRTR;8vID1jJ6
	 * \endif
	 */
	public int          unId;

	/**
	 * \if ENGLISH_LANG
	 * speed limit(km/h)
	 * \else
	 * O^KY#,5%N;km/h
	 * \endif
	 */
	public int          unSpeedLimit;

	/**
	 * \if ENGLISH_LANG
	 * rect point number
	 * \else
	 * 5gWSN'@8GxSr6%5cJ}
	 * \endif
	 */
	public int          unPointNum;

	/**
	 * \if ENGLISH_LANG
	 * rect point info
	 * \else
	 * 5gWSN'@8GxSrPEO"
	 * \endif
	 */
	public GPS_POINT     stPoints[] = new GPS_POINT[128];

	/**
	 * \if ENGLISH_LANG
	 * station name
	 * \else
	 * 5gWSN'@80|N'5D35U>U>5cC{3F
	 * \endif
	 */
	public byte          szStationName[] = new byte[FinalVar.SDK_STATION_NAME_LEN];
	
	public SDKDEV_ENCLOSURE_CFG() {
		for (int i = 0; i < 128; i++) {
			stPoints[i] = new GPS_POINT();
		}
	}
}

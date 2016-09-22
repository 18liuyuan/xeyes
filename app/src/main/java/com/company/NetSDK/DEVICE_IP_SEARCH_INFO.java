package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to SearchDevicesByIPs
 * \else
 * 6TS& SearchDevicesByIPs =S?Z
 * \endif
 */
public class DEVICE_IP_SEARCH_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IPs number for search
	 * \else
	 * 51G0KQKw5DIP8vJ}
	 * \endif
	 */
	public int                 nIpNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The IPs for search
	 * \else
	 * >_Le4}KQKw5DIPPEO"
	 * \endif
	 */
	public byte                szIP[][] = new byte[FinalVar.SDK_MAX_SAERCH_IP_NUM][64];  
}

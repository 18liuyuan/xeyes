package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_VEHICLE_WIFI_AP_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * to enable wift, 0:disable 1:enable
	 * \else
	 * JG7qFtSCwifi9&D\, 0:2;J9D\ 1:J9D\
	 * \endif
	 */
	public boolean        bEnable;

	/**
	 * \if ENGLISH_LANG
	 * get number of DHDEV_VEHICLE_WIFI_AP_CFG
	 * \else
	 * =bNv5C5=5DDHDEV_VEHICLE_WIFI_AP_CFG=a99LeSPP'8vJ}
	 * \endif
	 */
	public int         nRetWifiApNum;

	/**
	 * \if ENGLISH_LANG
	 * apply number of DHDEV_VEHICLE_SINGLE_WIFI_AP_CFG
	 * \else
	 * IjGk5DDHDEV_VEHICLE_SINGLE_WIFI_AP_CFG8vJ}
	 * \endif
	 */
	public int         nMaxWifiApNum;
	
	/**
	 * \if ENGLISH_LANG
	 * a WIFI AP configuration
	 * \else
	 * 5%8vWIFI APEdVC
	 * \endif
	 */
	public SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG pWifiAp[];
	
	public SDKDEV_VEHICLE_WIFI_AP_CFG_EX(int nMaxWifiApNum) {
		this.nMaxWifiApNum = nMaxWifiApNum;
		pWifiAp = new SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG[nMaxWifiApNum];
		for (int i = 0; i < nMaxWifiApNum; i++) {
			pWifiAp[i] = new SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG();
		}
	}
}

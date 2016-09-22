package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_DEV_GPS_MODE_CFG configuration
 * \else
 * SDK_DEV_GPS_MODE_CFG EdVC=a99
 * \endif
 */
public class SDKDEV_GPS_MODE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * GPS mode
	 * \else
	 * GPS6(N;D#J=#,<{GPS_MODE
	 * \endif
	 */
	public byte                byGPSMode; 
}

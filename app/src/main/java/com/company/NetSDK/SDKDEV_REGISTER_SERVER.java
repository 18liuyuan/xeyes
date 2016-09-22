package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto register service
 * \else
 * Vw6/W"2a7~Nq
 * \endif
 */
public class SDKDEV_REGISTER_SERVER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max IP amount supported.
	 * \else
	 * V'3V5DWn4sipJ}
	 * \endif
	 */
	public byte                bServerNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Registration server IP, port info.
	 * \else
	 * W"2a7~NqFwip#,6K?ZPEO".
	 * \endif
	 */
	public SDKDEV_SERVER_INFO   lstServer[] = new SDKDEV_SERVER_INFO[FinalVar.SDK_MAX_REGISTER_SERVER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
    public byte                bEnable;
    
    /**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * Ih18id
	 * \endif
	 */
    public byte                szDeviceID[] = new byte[32];
    
    public SDKDEV_REGISTER_SERVER() {
    	for (int i = 0; i < FinalVar.SDK_MAX_REGISTER_SERVER_NUM; i++) {
    		lstServer[i] = new SDKDEV_SERVER_INFO();
    	}
    }
}

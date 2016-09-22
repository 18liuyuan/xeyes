package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto register parameter configuration
 * \else
 * Vw6/W"2a2NJ}EdVC
 * \endif
 */
public class SDKDEV_SERVER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Registration server IP
	 * \else
	 * W"2a7~NqFwIP 
	 * \endif
	 */
	public byte                szServerIp[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Port No. 
	 * \else
	 * 6K?Z:E
	 * \endif
	 */
	public int                 nServerPort;
    public byte                bServerIpExEn;
    public byte                szServerIpEx[] = new byte[60];
}

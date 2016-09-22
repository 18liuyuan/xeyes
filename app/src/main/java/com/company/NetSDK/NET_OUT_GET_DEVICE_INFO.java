package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.QueryDevInfo , NET_QUERY_DEV_REMOTE_DEVICE_INFO inquire the output parameter of remote device information 
 * \else
 * INetSDK.QueryDevInfo , NET_QUERY_DEV_REMOTE_DEVICE_INFO 2iQ/T63LIh18PEO"Jd3v2NJ}
 * \endif
 */
public class NET_OUT_GET_DEVICE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device information, the member of this structur,  dwSize, should be assigned by user
	 * \else
	 * Ih18PEO"#,8C=a99LeDZ2?3IT1 dwSize PhSC;'83V5
	 * \endif
	 */
	public SDK_REMOTE_DEVICE            stuInfo = new SDK_REMOTE_DEVICE(); 
}

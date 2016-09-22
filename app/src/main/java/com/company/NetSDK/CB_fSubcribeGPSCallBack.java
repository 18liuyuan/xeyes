package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * GPS subscription callback
 * \else
 * GPS6)TD;X5w
 * \endif
 */
public interface CB_fSubcribeGPSCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * GPS subscription callback
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param gpsInfo GPS info

	 * \else
	 * GPS6)TD;X5w:/J}
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param gpsInfo GPSPEO"
	 */

	public void invoke(long lLoginID, GPS_Info gpsInfo);
}

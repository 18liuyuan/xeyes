package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnection callback function original shape 
 * \else
 * MxBg6OO_4&@m=S?Z
 * \endif
 */
public interface CB_fDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when network disconnect
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchDVRIP ip of device
	 * @param nDVRPort port of device
	 * \else
	 * MxBg6OO_;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pchDVRIP Ih18IP
	 * @param nDVRPort Ih186K?Z
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort);
}

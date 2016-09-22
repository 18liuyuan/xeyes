package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism register device call
 * \else
 * Rl2=W"2aIh18;X5w:/J}
 * \endif
 */
public interface CB_fHaveLogin {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronism register device call
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchDVRIP device ip
	 * @param nDVRPort device port
	 * @param bOnline on line or not
	 * @param stuDeviceInfo device info
	 * @param nError error info
	 * \else
	 * MxBg6OO_;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pchDVRIP Ih18IP
	 * @param nDVRPort Ih186K?Z
	 * @param bOnline JG7qTZO_
	 * @param stuDeviceInfo Ih18PEO"
	 * @param nError 3v4mPEO"
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort, boolean bOnline, NET_DEVICEINFO_Ex stuDeviceInfo, int nError);
}

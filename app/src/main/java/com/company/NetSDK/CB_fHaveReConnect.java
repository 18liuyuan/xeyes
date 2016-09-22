package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network re-connection callback function original shape
 * \else
 * MxBgA,=S;V84;X5w:/J}T-PN
 * \endif
 */
public interface CB_fHaveReConnect {
	/**
	 * \if ENGLISH_LANG
	 * Network re-connection callback function original shape
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchDVRIP ip of device
	 * @param nDVRPort port of device
	 * \else
	 * MxBgA,=S;V84;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pchDVRIP Ih18IP
	 * @param nDVRPort Ih186K?Z
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort);
}

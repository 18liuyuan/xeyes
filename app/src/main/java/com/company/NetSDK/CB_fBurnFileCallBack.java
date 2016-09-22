package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Burning device callback function
 * \else
 * ?LB<Ih18;X5w:/J}T-PN
 * \endif
 */
public interface CB_fBurnFileCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Burning device callback function
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lUploadHandle return from {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}
	 * @param nTotalSize file total size
	 * @param nSendSize	sent file length
	 * \else
	 * ?LB<Ih18;X5w:/J}T-PN
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}5D75;XV5
	 * @param nTotalSize ND<~W\924sP!
	 * @param nSendSize	RQ7"KMND<~4sP!
	 * \endif
	 */
	public void invoke(long lLoginID, long lUploadHandle, int nTotalSize, int nSendSize);
}

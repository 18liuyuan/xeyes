package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback progress recall function 
 * \else
 * ;X7E=x6H;X5w
 * \endif
 */
public interface CB_fDecPlayBackPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback progress recall function 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nEncoderID encoder NO.
	 * @param dwTotalSize playback data total size
	 * @param dwPlaySize played data size
	 * \else
	 * ;X7E=x6H;X5w
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param nEncoderID 1`BkFw1`:E
	 * @param dwTotalSize ;X7EJ}>]5DW\4sP! 
	 * @param dwPlaySize RQ;X7EJ}>]5D4sP! 
	 * \endif
	 */
	public void invoke(long lLoginID , int nEncoderID , int dwTotalSize , int dwPlaySize);
}

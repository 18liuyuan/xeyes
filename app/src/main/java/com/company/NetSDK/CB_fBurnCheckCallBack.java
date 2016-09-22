package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Writing calibration call function
 * \else
 * ?LB<P#Qi;X5w:/J}T-PN
 * \endif
 */
public interface CB_fBurnCheckCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Writing calibration call function
	 * @param lLoginID  login handle, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or{@link com.company.NetSDK.INetSDK#Login() Login} return value 
	 * @param lAttachHandle writing handle, {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState} return value 
	 * @param pstState writing status info#,see {@link com.company.NetSDK.NET_CB_BURN_CHECK_STATE NET_CB_BURN_CHECK_STATE}
	 * \else
	 * ?LB<P#Qi;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param lAttachHandle ?LB<>d1z, {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState}5D75;XV5
	 * @param pstState ?LB<W4L,PEO"#,Oj<{ {@link com.company.NetSDK.NET_CB_BURN_CHECK_STATE NET_CB_BURN_CHECK_STATE}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_BURN_CHECK_STATE pstState);

}

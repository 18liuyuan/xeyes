package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnect deal interface
 * \else
 * <`L}CANW\O_J}>];X5w:/J}T-PN
 * \endif
 */
public interface CB_fAttachCANCB {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when network disconnect
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lAttachHandle return from {@link com.company.NetSDK.INetSDK#AttachCAN() AttachCAN}
	 * @param pBuf data info {@link com.company.NetSDK.NET_CB_CANDATA NET_CB_CANDATA}
	 * \else
	 * <`L}CANW\O_J}>];X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachCAN() AttachCAN}75;XV5
	 * @param pBuf J}>]PEO"#,{@link com.company.NetSDK.NET_CB_CANDATA NET_CB_CANDATA}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_CANDATA pBuf);
}

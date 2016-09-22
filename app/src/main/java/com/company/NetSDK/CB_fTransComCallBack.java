package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Transparent COM callback function original shape
 * \else
 * M8Cw4.?Z;X5w 
 * \endif
 */
public interface CB_fTransComCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Transparent COM callback function original shape
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lTransComChannel handle, return from{@link com.company.NetSDK.INetSDK#CreateTransComChannel() CreateTransComChannel}
	 * @param pBuffer Transparent data buffer 
	 * @param dwBufSize Transparent data buffer length 
	 * \else
	 * M8Cw4.?Z;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param lTransComChannel {@link com.company.NetSDK.INetSDK#CreateTransComChannel() CreateTransComChannel}5D75;XV5 
	 * @param pBuffer M8CwJ}>];:3e 
	 * @param dwBufSize M8CwJ}>];:3e3$6H
	 * \endif
	 */
	public void invoke(long lLoginID, long lTransComChannel, byte pBuffer[], int dwBufSize);
}

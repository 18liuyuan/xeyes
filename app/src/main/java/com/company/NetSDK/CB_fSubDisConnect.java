package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The prototype of dynamic sub connection offline call function 
 * \else
 * 6/L,WSA,=S6O?*;X5w:/J}T-PN
 * \endif
 */
public interface CB_fSubDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * The prototype of dynamic sub connection offline call function 
	 * @param emInterfaceType interrace type
	 * <table>
	 * <tr><td>enumeration value</td><td>meaning</td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>unknown interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>real time monitoring interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>multi-image preview interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>playback interface</td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>download interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>download intelligent image interface</td></tr>
	 * </table>
	 * @param bOnline Online or not 
	 * @param lOperateHandle interface returned operation handle,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param lLoginID login handle, return from{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * \else
	 * 6/L,WSA,=S6O?*;X5w:/J}T-PN
	 * @param emInterfaceType =S?Z@`PM
	 * <table>
	 * <tr><td>C6>YV5 </td><td>:,Re </td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>N4V*=S?Z </td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>J5J1<`JS=S?Z </td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>6`;-CfT$@@=S?Z </td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>;X7E=S?Z </td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>OBTX=S?Z </td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>OBTXVGD\M<F,=S?Z </td></tr>
	 * </table>
	 * @param bOnline JG7qTZO_ 
	 * @param lOperateHandle =S?Z75;X5D2YWw>d1z,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param lLoginID 5GB=>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}75;XV5
	 * \endif
	 */
	public void invoke(int emInterfaceType, boolean bOnline, long lOperateHandle, long lLoginID);
}

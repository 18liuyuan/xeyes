package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Monitor disconnect callback function
 * \else
 * JSF5<`JS6O?*;X5w:/J}
 * \endif
 */
public interface CB_fRealPlayDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * Monitor disconnect callback function
	 * @param lOperateHandle handle, return from {@link com.company.NetSDK.INetSDK#StartRealPlay() StartRealPlay}
	 * @param dwEventType event type#,EM_REALPLAY_DISCONNECT_EVENT_TYPE,as: 
	 * <pre>
	 * <tr><td>enumerated type</td><td>meaning</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>means advanced user occupy resource of low-level user</td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>net in prohibit </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>dynamic sub connection disconnect</td></tr>
	 * </pre>
	 * \else
	 * JSF5<`JS6O?*;X5w:/J}
	 * @param lOperateHandle <`?X>d1z ,{@link com.company.NetSDK.INetSDK#StartRealPlay() StartRealPlay}75;XV5
	 * @param dwEventType JB<~@`PM,EM_REALPLAY_DISCONNECT_EVENT_TYPE#,<{OB1m#: C6>Y@`PM RbRe 
	 * <pre>
	 * <tr><td>C6>Y@`PM</td><td>RbRe</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>1mJ>8_<6SC;'G@U<5M<6SC;'WJT4 </td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>={V9HkMx </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>6/L,WSA4=S6O?* </td></tr>
	 * </pre>
	 * \endif
	 */
	public void invoke(long lOperateHandle, int dwEventType);
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm event type depends on alarm type analyzed
 * \else
 * 1(>/JB<~@`PM8y>]netsdk.h=bNv3v@45D1(>/@`PM
 * \endif
 */
public interface CB_fALARMEvent {
	/**
	 * \if ENGLISH_LANG
	 * alarm event type depends on alarm type analyzed
	 * @param dwAlarmType alarm type 
	 * @param pAlarmInfo alarm parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering
	 * @param dwBufSize buffering size 
	 * @see {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \else
	 * 1(>/JB<~;X5w:/J}
	 * @param dwAlarmType 1(>/@`PM
	 * @param pAlarmInfo 1(>/2NJ} 
	 * @param dwStructSize =a99Le4sP! 
	 * @param pBuffer ;:3e 
	 * @param dwBufSize ;:3e4sP!
	 * @see {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \endif
	 */
	public int invoke(double dwAlarmType, Object pAlarmInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}

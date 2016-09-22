package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the gateway type
 * \else
 * MFKMMx9X@`PM
 * \endif
 */
public class EM_PUSH_GATEWAY_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * N4V*
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Apple push gateway, ApplePush
	 * \else
	 * F;9{MFKMMx9X, ApplePush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_APPLE_PUSH = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android DAHUA push gateway, AndroidDahuaPush
	 * \else
	 * 02W?4s;*MFKMMx9X, AndroidDahuaPush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_SDKPUSH = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android aurora push gateway, AndroidJPush
	 * \else
	 * 02W?<+9bMFKMMx9X, AndroidJPush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_JPUSH = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android GCM gateway, AndroidGCM
	 * \else
	 * 02W?GCMMx9X, AndroidGCM
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_GCM = 4; 
}

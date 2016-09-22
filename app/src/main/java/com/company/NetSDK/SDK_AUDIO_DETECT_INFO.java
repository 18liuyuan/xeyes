package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detection alarm setup 
 * \else
 * PBRtF5<l2b1(>/EdVC
 * \endif
 */
public class SDK_AUDIO_DETECT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable alarm input 
	 * \else
	 * 1(>/JdHkJ9D\
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * Min volume
	 * \else
	 * RtA?5DWnP!V5
	 * \endif
	 */
	public int                 Volume_min; 
	
	/**
	 * \if ENGLISH_LANG
	 * Max volume
	 * \else
	 * RtA?5DWn4sV5
	 * \endif
	 */
	public int                 Volume_max; 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process way 
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE(); 
	
	public SDK_AUDIO_DETECT_INFO() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}

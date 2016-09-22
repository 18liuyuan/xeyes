package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Source Structure
 * \else
 * B<OqT4
 * \endif
 */
public class AV_CFG_RecordSource implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Channel No. 
	 * \else
	 * JSF5M(5@:E
	 * \endif
	 */
	public int				nVideoChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Stream 	
	 * \else
	 * JSF5BkAw
	 * \endif
	 */
	public int				nVideoStream;
	
 	/**
	 * \if ENGLISH_LANG
	 * Audio Channle No. 
	 * \else
	 * RtF5M(5@:E
	 * \endif
	 */
	public int				nAudioChannle;
	
 	/**
	 * \if ENGLISH_LANG
	 * AudioStream 
	 * \else
	 * RtF5BkAw
	 * \endif
	 */
	public int				nAudioStream;
}


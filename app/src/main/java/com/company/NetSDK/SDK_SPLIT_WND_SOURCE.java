package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 *  source of window display info 
 * \else
 * 40?ZOTJ>T4PEO"
 * \endif
 */
public class SDK_SPLIT_WND_SOURCE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable 
	 * \else
	 * OTJ>T4JG7qSPP'
	 * \endif
	 */
	public boolean                 bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 *  device ID
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public byte[]                  szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 *  control ID
	 * \else
	 * ?XVFID
	 * \endif
	 */
	public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     
    
	/**
	 * \if ENGLISH_LANG
	 * video channel ID
	 * \else
	 * JSF5M(5@:E
	 * \endif
	 */
	public int                     nVideoChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  video stream type
	 * \else
	 * JSF5BkAw@`PM
	 * \endif
	 */
	public int                     nVideoStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  audio channel ID
	 * \else
	 * RtF5M(5@
	 * \endif
	 */
	public int                     nAudioChannel; 
    
	/**
	 * \if ENGLISH_LANG
	 * audio stream type
	 * \else
	 * RtF5BkAw@`PM
	 * \endif
	 */
	public int                     nAudioStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  unique channel,read only
	 * \else
	 * Ih18DZM3R;1`:E5DN(R;M(5@:E, V;6A
	 * \endif
	 */
	public int                     nUniqueChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  support remote device
	 * \else
	 *  JG7qT63LIh18
	 * \endif
	 */
	public boolean                 bRemoteDevice;                 
    
	/**
	 * \if ENGLISH_LANG
	 *  info of remote device
	 * \else
	 * T63LIh18PEO"
	 * \endif
	 */
	public SDK_REMOTE_DEVICE       stuRemoteDevice = new SDK_REMOTE_DEVICE();                
}

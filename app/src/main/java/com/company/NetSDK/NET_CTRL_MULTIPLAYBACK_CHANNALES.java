package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param SDK_CTRL_MULTIPLAYBACK_CHANNALES 
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_MULTIPLAYBACK_CHANNALES C|An2NJ} 
 * \endif
 */
public class NET_CTRL_MULTIPLAYBACK_CHANNALES implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Playback Handle#,CLIENT_MultiPlayBack Returns the Value
	 * \else
	 * ;X7E>d1z#,CLIENT_MultiPlayBack=S?Z75;XV5
	 * \endif
	 */
	public long     	lPlayBackHandle; 
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel ID
	 * \else
	 * T$@@M(5@:E
	 * \endif
	 */
	public int        	nChannels[] = new int[FinalVar.SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel Number 
	 * \else
	 * T$@@M(5@J} 
	 * \endif
	 */
	public int      	nChannelNum; 
}

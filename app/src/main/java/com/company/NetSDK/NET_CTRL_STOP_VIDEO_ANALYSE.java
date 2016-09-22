package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_STOP_VIDEO_ANALYSE 
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_STOP_VIDEO_ANALYSE C|An2NJ}
 * \endif
 */
public class NET_CTRL_STOP_VIDEO_ANALYSE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID  
	 * \else
	 * M(5@:E  
	 * \endif
	 */
	public int                 nChannelId;  
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice port SDK_CTRL_START_ALARMBELL!"SDK_CTRL_STOP_ALARMBELL command parameter
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_START_ALARMBELL!"SDK_CTRL_STOP_ALARMBELLC|An2NJ}
 * \endif
 */
public class NET_CTRL_ALARMBELL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID (start from 0) 
	 * \else
	 * M(5@:E(0?*J<)      
	 * \endif
	 */
	public int					nChannelID;			
}

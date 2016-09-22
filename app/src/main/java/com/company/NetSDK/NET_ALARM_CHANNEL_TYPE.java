package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding INetSDK.QueryDevState() Interface's SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE Command Parameter 
 * \else
 * 6TS&INetSDK.QueryDevState()=S?Z5D SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATEC|An2NJ}
 * ;qH!1(>/M(5@W4L,
 * \endif
 */
public class NET_ALARM_CHANNEL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All channels (including all of the following)
	 * \else
	 * KySPM(5@#(0|:,RTOBKySP#)
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input channel 
	 * \else
	 * 1(>/JdHkM(5@
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMIN = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output channel 
	 * \else
	 * 1(>/Jd3vM(5@
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMOUT = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Signal channel 
	 * \else
	 * >/:EM(5@
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMBELL = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm input channel 
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMIN = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module and alarm output channel
	 * \else
	 * @)U9D#?i1(>/Jd3vM(5@
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMOUT = 5; 
}

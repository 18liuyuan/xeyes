package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detection alarm
 * \else
 * PB5DRtF5<l2b1(>/PEO"
 * \endif
 */
public class SDK_NEW_SOUND_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * The alarm channel number 
	 * \else
	 * 1(>/5DM(5@8vJ}
	 * \endif
	 */
	public int                         channelcount;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm information
	 * \else
	 * 1(>/PEO" 
	 * \endif
	 */
	public NET_NEW_SOUND_ALARM_STATE   SoundAlarmInfo[] = new NET_NEW_SOUND_ALARM_STATE[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	public SDK_NEW_SOUND_ALARM_STATE() {
		for (int i = 0; i < FinalVar.SDK_MAX_ALARM_IN_NUM; i++) {
			SoundAlarmInfo[i] = new NET_NEW_SOUND_ALARM_STATE();
		}
	}
}

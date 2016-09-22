package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detect alarm
 * \else
 * PBRtF5<l2b1(>/PEO"
 * \endif
 */
public class NET_NEW_SOUND_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel No. 
	 * \else
	 * 1(>/M(5@:E
	 * \endif
	 */
	public int                 channel;                        
	/**
	 * \if ENGLISH_LANG
	 * Alarm type#;0#:Audio value is too long#,1#:Audio value is too high 
	 * \else
	 * 1(>/@`PM#;0#:RtF5V59}5M#,1#:RtF5V59}8_
	 * \endif
	 */
	public int                 alarmType;                      
	/**
	 * \if ENGLISH_LANG
	 * Volume value 
	 * \else
	 * RtA?V5
	 * \endif
	 */
	public int        			volume;                        
	/**
	 * \if ENGLISH_LANG
	 * Audio alarm status, 0:Audio alarm occurred , 1: Audio alarm disappear 
	 * \else
	 * RtF51(>/W4L,, 0: RtF51(>/3vOV, 1: RtF51(>/O{J'
	 * \endif
	 */
	public byte                byState;                        
}

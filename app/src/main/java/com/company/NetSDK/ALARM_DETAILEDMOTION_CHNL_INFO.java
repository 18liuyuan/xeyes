package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Detailed Motion Detection Alarm Info
 * \else
 * OjO86/<l1(>/PEO"
 * \endif
 */

public class ALARM_DETAILEDMOTION_CHNL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * If Alarm TRUE/FALSE 
	 * \else
	 * JG7q1(>/ TRUE/FALSE
	 * \endif
	 */
	public boolean               bAlarm;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Level,Unit ,Calculate By the Small Grid Numbers of Motion Detect Divide Total Numbers of Small Grid
	 * \else
	 * 1(>/<61p#,5%N;G'7VV.#,RT6/<l7"IzP!8qJ}3}RTW\P!8qJ}<FKc
	 * \endif
	 */
	public int                nLevel;        
}

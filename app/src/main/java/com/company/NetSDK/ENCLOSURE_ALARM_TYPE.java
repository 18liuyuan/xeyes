package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Types
 * \else
 * 1(>/@`PM
 * \endif
 */
public class ENCLOSURE_ALARM_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Drive In
	 * \else
	 * J;Hk
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEIN = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Drive Out
	 * \else
	 * J;3v
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEOUT = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed
	 * \else
	 * 3,KY
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_OVERSPEED = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed Disapper
	 * \else
	 * 3,KYO{J'
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_SPEEDCLEAR = 3;
}

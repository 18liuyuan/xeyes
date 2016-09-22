package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor Alarm Way
 * \else
 * 4+8PFw1(>/7=J=
 * \endif
 */
public class CFG_ALARM_SENSE_METHOD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The Number of Supported Sensors Way
	 * \else
	 * V'3V5D4+8PFw7=J=J}
	 * \endif
	 */
	public int                 nSupportSenseMethodNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported Sensor Way
	 * \else
	 * V'3V5D4+8PFw7=J=
	 * \endif
	 */
	public int                 emSupportSenseMethod[] = new int[FinalVar.MAX_ALARM_SENSE_METHOD_NUM];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm disarm state info
 * \else
 * 1(>/2<377@W4L,PEO"
 * \endif
 */
public class ALARM_ARM_DISARM_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm-disarm,0 means disarm,1 means arm, 2 means ForceOn
	 * \else
	 * 2<377@W4L,#,01mJ>377@#,11mJ>2<7@#,21mJ>G?VF2<7@
	 * \endif
	 */
	public byte                bState;
}

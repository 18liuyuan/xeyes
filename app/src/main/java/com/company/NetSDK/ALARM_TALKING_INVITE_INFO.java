package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Event Type SDK_ALARM_TALKING_INVITE(Device request talk event)Corresponding Data Description Info
 * \else
 * 1(>/JB<~@`PMSDK_ALARM_TALKING_INVITE(Ih18GkGs6T7=7"Fp6T=2JB<~)6TS&5DJ}>]ChJvPEO"
 * \endif
 */
public class ALARM_TALKING_INVITE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device Expected Talk Start Party
	 * \else
	 * Ih18O#M{5D6T=27"Fp7=
	 * \endif
	 */
	public int                  emCaller;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Trigger Time
	 * \else
	 * JB<~4%7"J1<d
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power Failure Event
 * \else
 * 5gT49JUOJB<~
 * \endif
 */
public class ALARM_POWERFAULT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Power Type {@link com.company.NetSDK.EM_POWER_TYPE EM_POWER_TYPE}
	 * \else
	 * 5gT4@`PM {@link com.company.NetSDK.EM_POWER_TYPE EM_POWER_TYPE}
	 * \endif
	 */
	public int            emPowerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Power Failure Event {@link com.company.NetSDK.EM_POWERFAULT_EVENT_TYPE EM_POWERFAULT_EVENT_TYPE}
	 * \else
	 * 5gT49JUOJB<~ {@link com.company.NetSDK.EM_POWERFAULT_EVENT_TYPE EM_POWERFAULT_EVENT_TYPE}
	 * \endif
	 */
	public int            emPowerFaultEvent;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME                 stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * 0:start 1: stop
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int                      nAction;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status Type
 * \else
 * 1(>/WSO5M3W4L,@`PM
 * \endif
 */
public class EM_ALARM_SUBSYSTEM_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * N4V*
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_UNKNOWN 			= 		0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Activated
	 * \else
	 * RQ<$;n
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_ACTIVE 			= 		1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not activated
	 * \else
	 * N4<$;n
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_INACTIVE 			=     	2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not distributed
	 * \else
	 * N47VEd
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_UNDISTRIBUTED     =     	3 ;
}

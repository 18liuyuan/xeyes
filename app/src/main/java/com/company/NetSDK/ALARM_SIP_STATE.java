package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIP Status Changes Alarm
 * \else
 * SIPW4L,8D1d1(>/
 * \endif
 */
public class ALARM_SIP_STATE implements Serializable {
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
	public int     nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Registration Succeed,1:Not Registered,2:Invalid,3:Registering,4:Communicating 
	 * \else
	 * 0:W"2a3I9&,1:N4W"2a,2:N^P',3:W"2aVP,4:M(;0VP
	 * \endif
	 */
	public byte    byStatus;                         
}

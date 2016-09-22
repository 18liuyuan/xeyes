package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * disk alarm
 * \else
 * S2EL1(>/
 * \endif
 */
public class ALARM_DISK_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * S2ELM(5@:E
	 * \endif
	 */
	public int                nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * number, 0: main trank,1: extern trank1, 2: extern trank2 
	 * \else
	 * 4EELAPUs:E, 0: Vw9q#,1: @)U99q1,  2: @)U99q2 
	 * \endif
	 */
	public int                nHDDNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * state, 0: Unknown, 1: Running, 2: Offline, 3: Warning, 4: Failed
	 * \else
	 * S2ELW4L,, 0: Unknown, 1: Running, 2: Offline, 3: Warning, 4: Failed
	 * \endif
	 */
	public int                nHDDState;                           
}

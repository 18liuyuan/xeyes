package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm channel number
 * \else
 * 1(>/M(5@J}
 * \endif
 */
public class NET_ALARM_CHANNEL_COUNT implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local alarm input channel no.
	 * \else
	 * 1>5X1(>/JdHkM(5@J}
	 * \endif
	 */
	public int nLocalAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Local alarm output channel no.
	 * \else
	 * 1>5X1(>/Jd3vM(5@J}
	 * \endif
	 */
	public int nLocalAlarmOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm input channel no.
	 * \else
	 * T63L1(>/JdHkM(5@J}
	 * \endif
	 */
	public int nRemoteAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm output channel no.
	 * \else
	 * T63L1(>/Jd3vM(5@J}
	 * \endif
	 */
	public int nRemoteAlarmOut;
}
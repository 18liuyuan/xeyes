package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Emergency storage configuration
 * \else
 * =t<14f4"EdVC
 * \endif
 */
public class SDKDEV_URGENCY_RECORD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not. 1=enable.0=disable
	 * \else
	 * JG7qJ9D\#,1J9D\#,02;J9D\
	 * \endif
	 */
	public boolean    bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Max record time. Unit is second.
	 * \else
	 * Wn4sB<OqJ1<d#,5%N;Ck
	 * \endif
	 */
	public int    nMaxRecordTime;
}

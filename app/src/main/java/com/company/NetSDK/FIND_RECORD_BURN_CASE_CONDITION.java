package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Case Record Query Conditions
 * \else
 * ?LB<08<~<GB<2iQ/Lu<~
 * \endif
 */
public class FIND_RECORD_BURN_CASE_CONDITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Start Time
	 * \else
	 * FpJ<J1<d
	 * \endif
	 */
	public NET_TIME		stuStartTime 	= new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End Time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME		stuEndTime		= new NET_TIME();
}

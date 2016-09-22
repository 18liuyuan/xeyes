package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video polling
 * \else
 * JSF5BVQ2
 * \endif
 */
public class SDK_VIDEOGROUP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Polling enabled
	 * \else
	 * BVQ2J9D\
	 * \endif
	 */
	public boolean                bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Polling interval in seconds, 5-300
	 * \else
	 * BVQ2<d8t#,5%N;Ck, 5-300
	 * \endif
	 */
	public int                 nTourPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * The polling channel mask form
	 * \else
	 * BVQ25DM(5@#,QZBkPNJ=1mJ>
	 * \endif
	 */
	public int               dwChannelMask;
}

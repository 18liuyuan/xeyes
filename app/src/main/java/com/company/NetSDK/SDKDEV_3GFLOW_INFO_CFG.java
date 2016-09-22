package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 3G Flow info config
 * \else
 * 3GAwA?PEO"EdVC
 * \endif
 */
public class SDKDEV_3GFLOW_INFO_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * strategy, 0: charged by flow every month 1:charged by time every month
	 * \else
	 * AwA?J9SC2_BT, 0:04AwA?0|TB 1:04J1<d0|TB
	 * \endif
	 */
	public int                 nStrategy;
	
	/**
	 * \if ENGLISH_LANG
	 * up limit, by flow: MB, by time: h
	 * \else
	 * AwA?J9SCIOO^, 04AwA?: 5%N;MB 04J1<d: 5%N;P!J1
	 * \endif
	 */
	public int                 nUpLimit;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 3G traffic exceeds the threshold status information
 * \else
 * 3GAwA?3,3vcPV5W4L,PEO" 
 * \endif
 */
public class SDKDEV_3GFLOW_EXCEED_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 3G traffic exceeds a threshold state, and 0 indicates that does not exceed the threshold, 1 represents beyond threshold 
	 * \else
	 * 3GAwA?3,3vcPV5W4L,#,01mJ>N43,3v7'V5#,11mJ>3,3v7'V5
	 * \endif
	 */
	public byte                bState; 
}

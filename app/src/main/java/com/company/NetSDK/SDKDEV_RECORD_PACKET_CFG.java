package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The length of the video package configuration
 * \else
 * B<Oq4r0|3$6HEdVC
 * \endif
 */
public class SDKDEV_RECORD_PACKET_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:by time,1:by size
	 * \else
	 * 0:04J1<d#,1#:044sP!
	 * \endif
	 */
	public int                 nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * nType = 0:(minutes),nType = 1:(KB)
	 * \else
	 * nType = 0J1:5%N;7VVS#,nType = 1J1:5%N;KB
	 * \endif
	 */
	public int                 nValue; 
}

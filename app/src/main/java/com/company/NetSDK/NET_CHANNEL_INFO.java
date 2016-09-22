package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * representation channel file info
 * \else
 *  S3IdM(5@ND<~PEO"
 * \endif
 */
public class NET_CHANNEL_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * real channel ID
	 * \else
	 * UfJ5M(5@:E
	 * \endif
	 */
	public int                      nRealChannel;                    
	
	/**
	 * \if ENGLISH_LANG
	 * record file length
	 * \else
	 * M(5@B<OqND<~W\3$6H 
	 * \endif
	 */
	public int                      nFileLen;                         
}

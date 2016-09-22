package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flow statistics status info of the channel 
 * \else
 * M(5@5DAwA?W4L,PEO"
 * \endif
 */
public class SDKDEV_USE_CHANNEL_STATE implements Serializable {
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
	public int				nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel use purpose 
	 * \else
	 * M(5@SCM>
	 * \endif
	 */
	public byte				szUseType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Flow value(Unit#:kb/s)
	 * \else
	 * AwA?4sP!(5%N;#:kb/s)
	 * \endif
	 */
	public int				dwStreamSize;			
}

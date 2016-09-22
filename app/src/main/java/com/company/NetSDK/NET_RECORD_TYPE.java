package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file type
 * \else
 * B<OqND<~@`PM
 * \endif
 */
public class NET_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All the video
	 * \else
	 * KySPB<Oq
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * common  video
	 * \else
	 * FUM(B<Oq
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_NORMAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm video
	 * \else
	 * Mb2?1(>/B<Oq
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALARM = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * DM alarm video
	 * \else
	 * 6/<l1(>/B<Oq
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_MOTION = 3; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General alarm info expansion structure
 * \else
 * FUM(1(>/PEO"
 * \endif
 */
public class NET_CLIENT_STATE_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * M(5@J}
	 * \endif
	 */
	public int					channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount 
	 * \else
	 * 1(>/JdHk?ZJ} 
	 * \endif
	 */
	public int					alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm 
	 * \else
	 * Mb2?1(>/
	 * \endif
	 */
	public byte					alarm[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detect 
	 * \else
	 * 6/L,<l2b
	 * \endif
	 */
	public byte					motiondection[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss 
	 * \else
	 * JSF56*J'
	 * \endif
	 */
	public byte					videolost[] = new byte[32];
}

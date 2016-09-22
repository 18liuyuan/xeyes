package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device channel quantity info
 * \else
 * Ih18M(5@J}A?PEO"
 * \endif
 */
public class NET_DEV_CHN_COUNT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input channel
	 * \else
	 * JSF5JdHkM(5@
	 * \endif
	 */
	public NET_CHN_COUNT_INFO	stuVideoIn = new NET_CHN_COUNT_INFO();					

	/**
	 * \if ENGLISH_LANG
	 * Video output channel
	 * \else
	 * JSF5Jd3vM(5@
	 * \endif
	 */
	public NET_CHN_COUNT_INFO	stuVideoOut = new NET_CHN_COUNT_INFO();				
}

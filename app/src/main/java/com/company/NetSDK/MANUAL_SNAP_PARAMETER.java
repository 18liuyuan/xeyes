package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Manual snap parameter
 * \else
 * JV6/W%ED2NJ}
 * \endif
 */
public class MANUAL_SNAP_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snap channel,start with 0
	 * \else
	 * W%M<M(5@,4S0?*J<
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * snap sequence string
	 * \else
	 * W%M<PrAP:EWV7{4.
	 * \endif
	 */
	public byte                bySequence[] = new byte[64]; 
}

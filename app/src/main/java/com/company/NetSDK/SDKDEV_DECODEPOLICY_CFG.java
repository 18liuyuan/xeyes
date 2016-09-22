package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decode policy configuration
 * \else
 * ;zFwO`9X5DEdVC
 * \endif
 */
public class SDKDEV_DECODEPOLICY_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * (read only):minimal delay time(ms)
	 * \else
	 * Bk;:3eJ1<d76N'(V;6A)#:WnP!;:3eJ1<d(5%N;#:ms)
	 * \endif
	 */
	public int                 nMinTime;

	/**
	 * \if ENGLISH_LANG
	 * (read only):maximal delay time(ms)
	 * \else
	 * Bk;:3eJ1<d76N'(V;6A)#:Wn4s;:3eJ1<d(5%N;#:ms)
	 * \endif
	 */
	public int                 nMaxTime;

	/**
	 * \if ENGLISH_LANG
	 * device decode delay time(ms)
	 * \else
	 * D?1jIh18=bBk;:3eJ1<d(5%N;#:ms)
	 * \endif
	 */
	public int                 nDeocdeBufTime;
}

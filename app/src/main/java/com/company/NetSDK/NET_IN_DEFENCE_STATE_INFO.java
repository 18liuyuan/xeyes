package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Input Parameter
 * \else
 * 7@GxW4L,PEO"5DJdHk2NJ}
 * \endif
 */
public class NET_IN_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number, -1means search all zones
	 * \else
	 * 7@GxSPP'8vJ}, -11mJ>2iQ/KySP7@Gx
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number to search
	 * \else
	 * 4}2iQ/5D7@Gx:E
	 * \endif
	 */
	public int             anDefence[] = new int[FinalVar.SDK_MAX_ALARMIN]; 
}
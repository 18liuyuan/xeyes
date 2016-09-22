package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Output Parameter
 * \else
 * 7@GxW4L,PEO"5DJd3v2NJ}
 * \endif
 */
public class NET_OUT_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number
	 * \else
	 * 7@GxSPP'8vJ}
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone status info, EM_DEFENCE_STATE_TYPE
	 * \else
	 * 7@GxW4L,PEO", EM_DEFENCE_STATE_TYPE
	 * \endif
	 */
	public int anDefenceState[] = new int[FinalVar.SDK_MAX_ALARMIN];  
}


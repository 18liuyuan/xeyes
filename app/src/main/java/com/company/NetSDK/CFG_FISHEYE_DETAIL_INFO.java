package com.company.NetSDK;

import java.io.Serializable;

public class CFG_FISHEYE_DETAIL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * module number
	 * \else
	 * D#?iJ}
	 * \endif
	 */
	public int                nModeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * detailed module info  
	 * \else
	 * >_LeD#?iPEO"  
	 * \endif
	 */
	public CFG_FISHEYE_MODE_INFO stuModes[] = new CFG_FISHEYE_MODE_INFO[FinalVar.CFG_MAX_FISHEYE_MODE_NUM];
	
	public CFG_FISHEYE_DETAIL_INFO() {
		for (int i = 0; i < FinalVar.CFG_MAX_FISHEYE_MODE_NUM; i++) {
			stuModes[i] = new CFG_FISHEYE_MODE_INFO();
		}
	}
}

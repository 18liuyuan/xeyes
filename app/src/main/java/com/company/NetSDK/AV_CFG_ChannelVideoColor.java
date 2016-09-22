package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel video input color config 
 * \else
 * M(5@JSF5JdHkQUI+EdVC
 * \endif
 */
public class AV_CFG_ChannelVideoColor implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel color config amount
	 * \else
	 * M(5@QUI+EdVCJ}
	 * \endif
	 */
	public int			nColorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel color config. Each input video has several corresponding color setups.
	 * \else
	 * M(5@QUI+EdVC, C?8vM(5@6TS&6`8vQUI+EdVC
	 * \endif
	 */
	public AV_CFG_VideoColor	stuColor[] = new AV_CFG_VideoColor[FinalVar.AV_CFG_Max_VideoColor];
	
	public AV_CFG_ChannelVideoColor() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_VideoColor; i++) {
			stuColor[i] = new AV_CFG_VideoColor();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Voice-activated audio channel configuration
 * \else
 * SoRt<$@xRtF5M(5@EdVC
 * \endif
 */
public class CFG_AUDIO_SPIRIT_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Voice incentives linked video channel number
	 * \else
	 * SoRt<$@xA*6/JSF5M(5@:E
	 * \endif
	 */
	public int				nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice incentive priorities, 1 ~ 10
	 * \else
	 * SoRt<$@xSEOH<6, 1~10
	 * \endif
	 */
	public int				nPriority;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding video camera preset point, consistent with the 0 to 255 PTZ
	 * \else
	 *  6TS&5DJSF5IcOq;z5DT$VC5c, SkTFL(R;VB0~255
	 * \endif
	 */
	public int				nPreset;
	
}
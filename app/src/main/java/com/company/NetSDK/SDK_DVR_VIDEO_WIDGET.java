package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video OSD overlay
 * \else
 * JSF5OSD5~<SEdVC
 * \endif
 */
public class SDK_DVR_VIDEO_WIDGET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front ground
	 * \else
	 * No<~5DG0>0#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H
	 * \endif
	 */
	public int   rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Background
	 * \else
	 * No<~5D13>0#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H
	 * \endif
	 */
	public int   rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position
	 * \else
	 * N;VC,No<~1_>`SkU{3$5D1H@}*8191 
	 * \endif
	 */
	public RECT    rcRelativePos = new RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Blend
	 * \else
	 * T$@@5~<SJ9D\
	 * \endif
	 */
	public boolean    bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode Blend
	 * \else
	 * 1`Bk5~<SJ9D\
	 * \endif
	 */
	public boolean    bEncodeBlend;
}

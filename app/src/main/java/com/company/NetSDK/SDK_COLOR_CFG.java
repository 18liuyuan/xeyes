package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Attribute
 * \else
 * ;-CfQUI+JtPT
 * \endif
 */
public class SDK_COLOR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Scehdule
	 * \else
	 * J1<d1m
	 * \endif
	 */
	public SDK_TSECT			stSect = new SDK_TSECT();

	/**
	 * \if ENGLISH_LANG
	 * Brightness; 0-100 
	 * \else
	 * AA6H#;0-100
	 * \endif
	 */
	public byte				byBrightness;			

	/**
	 * \if ENGLISH_LANG
	 * Contrast; 0-100 
	 * \else
	 * 6T1H6H#;0-100
	 * \endif
	 */
	public byte				byContrast;				

	/**
	 * \if ENGLISH_LANG
	 * Saturation; 0-100 
	 * \else
	 * 1%:M6H#;0-100
	 * \endif
	 */
	public byte				bySaturation;			

	/**
	 * \if ENGLISH_LANG
	 * Hue 
	 * \else
	 * I+6H#;0-100
	 * \endif
	 */
	public byte				byHue;					

	/**
	 * \if ENGLISH_LANG
	 * gain 
	 * \else
	 * TvRfJ9D\
	 * \endif
	 */
	public byte				byGainEn;				

	/**
	 * \if ENGLISH_LANG
	 * gain:0-100 
	 * \else
	 * TvRf#;0-100
	 * \endif
	 */
	public byte				byGain;					

	/**
	 * \if ENGLISH_LANG
	 * value 0-100 
	 * \else
	 * Y$BmV5 0-100
	 * \endif
	 */
	public byte				byGamma;                
}

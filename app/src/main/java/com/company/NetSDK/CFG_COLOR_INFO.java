package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Info
 * \else
 * ;-CfQUI+JtPT
 * \endif
 */
public class CFG_COLOR_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Brightness,0-100 
	 * \else
	 * AA6H(0-100)
	 * \endif
	 */
	public int					nBrightness;				

	/**
	 * \if ENGLISH_LANG
	 * Contrast,0-100 
	 * \else
	 * 6T1H6H(0-100)
	 * \endif
	 */
	public int					nContrast;					

	/**
	 * \if ENGLISH_LANG
	 * Saturation,0-100 
	 * \else
	 * 1%:M6H(0-100)
	 * \endif
	 */
	public int					nSaturation;				

	/**
	 * \if ENGLISH_LANG
	 * Hue,0-100 
	 * \else
	 * I+6H(0-100)
	 * \endif
	 */
	public int					nHue;						

	/**
	 * \if ENGLISH_LANG
	 * Gain,0-100 
	 * \else
	 * TvRf(0-100)
	 * \endif
	 */
	public int					nGain;						

	/**
	 * \if ENGLISH_LANG
	 * Gain Enable 
	 * \else
	 * TvRfJ9D\
	 * \endif
	 */
	public boolean				bGainEn;					
}

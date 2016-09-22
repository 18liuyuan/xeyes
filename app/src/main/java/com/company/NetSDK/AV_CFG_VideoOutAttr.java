package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Out Attribute Structure
 * \else
 * JSF5Jd3vJtPT
 * \endif
 */
public class AV_CFG_VideoOutAttr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Left, Ratio, 0~100 
	 * \else
	 * Ws1_>`, 1HBJ, 0~100
	 * \endif
	 */
	public int				nMarginLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * MarginT op, Ratio, 0~100 
	 * \else
	 * IO1_>`, 1HBJ, 0~100
	 * \endif
	 */
	public int				nMarginTop;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Right, Ratio, 0~100
	 * \else
	 * SR1_>`, 1HBJ, 0~100
	 * \endif
	 */
	public int				nMarginRight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Bottom, Ratio, 0~100 
	 * \else
	 * OB1_>`, 1HBJ, 0~100
	 * \endif
	 */
	public int				nMarginBottom;
	
 	/**
	 * \if ENGLISH_LANG
	 * Brightness, 0~100 
	 * \else
	 * AA6H, 0~100
	 * \endif
	 */
	public int				nBrightness;
	
 	/**
	 * \if ENGLISH_LANG
	 * Contrast, 0~100 
	 * \else
	 * 6T1H6H, 0~100
	 * \endif
	 */
	public int				nContrast;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saturation, 0~100 
	 * \else
	 * 1%:M6H, 0~100
	 * \endif
	 */
	public int				nSaturation;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hue, 0~100 
	 * \else
	 * I+5w, 0~100
	 * \endif
	 */
	public int				nHue;
	
 	/**
	 * \if ENGLISH_LANG
	 * Horizontal Resolution 
	 * \else
	 * K.F=7V1fBJ
	 * \endif
	 */
	public int				nWidth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Vertical Resolution
	 * \else
	 * 49V17V1fBJ
	 * \endif
	 */
	public int				nHeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Color Depth 
	 * \else
	 * QUI+In6H
	 * \endif
	 */
	public int				nBPP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI 
	 * \else
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI
	 * \endif
	 */
	public int				nFormat;
	
 	/**
	 * \if ENGLISH_LANG
	 * Refresh Rate 
	 * \else
	 * K"PBF5BJ
	 * \endif
	 */
	public int				nRefreshRate;
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture Out Gain 
	 * \else
	 * Jd3vM<OqTvG?
	 * \endif
	 */
	public boolean			bIQIMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Scan mode, 0-progressive, 1-interlacing
	 * \else
	 * I(ChD#J=, 0-VpPP, 1-8tPP
	 * \endif
	 */
	public int				nScanFormat;
}

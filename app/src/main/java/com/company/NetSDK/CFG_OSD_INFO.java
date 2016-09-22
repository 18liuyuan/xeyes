package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD info
 * \else
 * OSDPEO"
 * \endif
 */
public class CFG_OSD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Dsiplay Ability 
	 * \else
	 * D\A&
	 * \endif
	 */
	public boolean				abShowEnable;

	/**
	 * \if ENGLISH_LANG
	 * Foreground Color 
	 * \else
	 * G0>0QUI+
	 * \endif
	 */
	public CFG_RGBA				stuFrontColor = new CFG_RGBA();				

	/**
	 * \if ENGLISH_LANG
	 * Background Color 
	 * \else
	 * 13>0QUI+
	 * \endif
	 */
	public CFG_RGBA				stuBackColor = new CFG_RGBA();				

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * >XPNGxSr
	 * \endif
	 */
	public CFG_RECT				stuRect = new CFG_RECT();					

	/**
	 * \if ENGLISH_LANG
	 * Rectangle Area 
	 * \else
	 * OTJ>J9D\
	 * \endif
	 */
	public boolean				bShowEnable;				
}

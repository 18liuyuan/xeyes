package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Activation Configuration
 * \else
 * A*6/TFL(PEO"
 * \endif
 */
public class CFG_PTZ_LINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Activation Type , CFG_LINK_TYPE
	 * \else
	 * A*6/@`PM, CFG_LINK_TYPE
	 * \endif
	 */
	public int					emType;						

	/**
	 * \if ENGLISH_LANG
	 * Value reffered to Preset Number,Tour Pattern Number and etc 
	 * \else
	 * A*6/H!V57V1p6TS&T$VC5c:E#,Q2:=:E5H5H
	 * \endif
	 */
	public int					nValue;						
}

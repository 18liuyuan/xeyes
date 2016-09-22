package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Structure of multi-screen preview capability
 * \else
 * 6`;-CfT$@@D\A&=a99Le
 * \endif
 */
public class SDK_MULTIPLAY_EN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support 
	 * \else
	 * 1 V'3V#;0 2;V'3V
	 * \endif
	 */
	public int			nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-screen preview mask, this parameter does not work 
	 * \else
	 * 6`;-CfT$@@QZBk
	 * \endif
	 */
	public int			dwMultiPlayMask;
}

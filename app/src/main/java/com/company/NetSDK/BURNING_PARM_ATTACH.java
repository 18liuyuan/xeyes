package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Annex burn, INetSDK.ControlDevice(SDK_BURNING_ATTACH)
 * \else
 *  8=<~?LB<, INetSDK.ControlDevice(SDK_BURNING_ATTACH)
 * \endif
 */
public class BURNING_PARM_ATTACH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether,0:Not; 1:Yes
	 * \else
	 * JG7qN*8=<~?LB<#,0:2;JG; 1:JG
	 * \endif
	 */
	public int				bAttachBurn;
}

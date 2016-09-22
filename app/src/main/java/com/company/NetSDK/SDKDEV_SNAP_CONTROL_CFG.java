package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap control configuration
 * \else
 * W%M<?XVFEdVC
 * \endif
 */
public class SDKDEV_SNAP_CONTROL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * every channel's snap on-off: 0 Autumn(other configuration and event will control whether snap picture ); 1: turn on snap; 2: turn off snap
	 * \else
	 * C?8vM(5@6TS&W%M<?*9X 0:WT6/(Tr1mJ>JG7qW%M<#,SIFdK{EdVC:MJB<~?XVF); 1:W%M<?*Ft; 2:W%M<9X1U
	 * \endif
	 */
	public byte                bySnapState[] = new byte[32]; 
}

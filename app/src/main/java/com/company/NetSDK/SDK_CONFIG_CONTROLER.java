package com.company.NetSDK;

import java.io.Serializable;

public class SDK_CONFIG_CONTROLER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com attribution
	 * \else
	 * 4.?ZJtPT
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled light group,light number start from 1,such as[1,3,8,0?-0]present control light number 1,3,8 light
	 * \else
	 * J\?X5FJ}Wi#(5FPr:E4S1?*J<<FJ}#,1HHg[1,3,8,0!-0]1mJ>?XVFPr:EN*1,3,85D5F
	 * \endif
	 */
	public byte                bLightGroup[] = new byte[FinalVar.SDK_MAX_LIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Controller address
	 * \else
	 * ?XVFFw5XV7
	 * \endif
	 */
	public byte                bDeviceAddr; 
	
	/**
	 * \if ENGLISH_LANG
	 * Com Type 0:485 COM, 1:232 COM
	 * \else
	 * 4.?Z@`PM 0:4854.?Z, 1:2324.?Z
	 * \endif
	 */
	public byte                bComPortType; 
}

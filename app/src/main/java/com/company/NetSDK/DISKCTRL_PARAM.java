package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD operation
 * \else
 * S2EL2YWw, INetSDK.ControlDevice(sdk_CTRL_DISK)
 * \endif
 */
public class DISKCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of information structure DH_HARDDISK_STATE. It begins from 0. 
	 * \else
	 * N*S2ELPEO"=a99LeDH_HARDDISK_STATE@o5DJ}WistDisksOB1j#,4S0?*J<
	 * \endif
	 */
	public int					nIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type
	 * 0 -  clear data, 1 - set as read-write HDD , 2 -  set as read-only HDD
	 * 3 - set as redundant , 4 - restore error , 5 -set as snapshot disk  
	 * \else
	 * 2YWw@`PM#,
	 * 0 - Ge3}J}>], 1 - IhN*6AP4EL, 2 - IhN*V;6AEL
	 * 3 - IhN*H_S`EL, 4 - ;V844mNs, 5 - IhN*?lUUEL#,7 - 5/3vSD?(#(6TSD?(2YWwSPP'#)
	 * \endif
	 */
	public 	int					ctrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * diskInfo, replace nIndex
	 * \else
	 * 4EELPEO", SISZ4EELK3Pr?ID\8D1d5<VBOB1j2;W<, SC@44zLfOB1j
	 * \endif
	 */
	public NET_DEV_DISKSTATE stuDisk = new NET_DEV_DISKSTATE();
}

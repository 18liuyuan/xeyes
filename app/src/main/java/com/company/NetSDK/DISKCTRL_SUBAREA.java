package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice(SDK_CTRL_DISK_SUBAREA)
 * \else
 * INetSDK.ControlDevice(SDK_CTRL_DISK_SUBAREA)
 * \endif
 */
public class DISKCTRL_SUBAREA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of pre-partition
	 * \else
	 * T$7VGx5D8vJ}
	 * \endif
	 */
	public byte	bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of informaiton structure DH_HARDDISK_STATE. It begins from 0. 
	 * \else
	 * N*S2ELPEO"=a99LeDH_HARDDISK_STATE@o5DJ}WistDisksOB1j#,4S0?*J<
	 * \endif
	 */
	public byte	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * partition Size(Percentage)
	 * \else
	 * 7VGx4sP!#(0Y7V1H#)
	 * \endif
	 */
	public byte	bSubareaSize[] = new byte[32];
}

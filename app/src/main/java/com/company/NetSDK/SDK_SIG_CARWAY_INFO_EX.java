package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vehicle detector redundancy info
 * \else
 * 35<lFwH_S`PEO"
 * \endif
 */
public class SDK_SIG_CARWAY_INFO_EX implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The vehicle detector generates the snap signal redundancy info
	 * \else
	 * SI35<lFw2zIzW%EDPE:EH_S`PEO"
	 * \endif
	 */
	public byte                byRedundance[] = new byte[8];                
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * explosion proof alarm configuration
 * \else
 * 7@1,:P1(>/JB<~EdVC
 * \endif
 */
public class SDKDEV_EXPLOSION_PROOF_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * explosion proof alarm configuration enable
	 * \else
	 * 7@1,:P1(>/J9D\
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * handle method
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX(); 
}

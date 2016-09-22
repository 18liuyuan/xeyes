package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ACC power off configuration
 * \else
 * ACC6OO_1(>/JB<~EdVC
 * \endif
 */
public class SDKDEV_ACC_POWEROFF_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off configuration enable
	 * \else
	 * ACC6OO_1(>/J9D\
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off delay time(m)
	 * \else
	 * ACC6OO_1(>/QSJ1J1<d,5%N;7VVS
	 * \endif
	 */
	public int                 nDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * handle method
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX();
}

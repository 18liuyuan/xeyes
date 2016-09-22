package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_DELETECFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * Ih1875;X5D4mNsBk
	 * \endif
	 */
	public int           nError;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * Ih18JG7qVXFt
	 * \endif
	 */
	public int           nRestart;

	/**
	 * \if ENGLISH_LANG
	 * Option. Please refer to enumeration NET_EM_CONFIGOPTION
	 * \else
	 * Q!On >_Le<{C6>YNET_EM_CONFIGOPTION
	 * \endif
	 */
	public int         dwOptionMask;
}

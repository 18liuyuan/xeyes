package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232 Serial port configuration
 * \else
 * 2324.?ZEdVC
 * \endif
 */
public class SDK_RS232_CFG implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial port Property
	 * \else
	 * 4.?ZJtPT
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Serial port functions,Correspond"SDKDEV_COMM_CFG""s232FuncName"(Function name list)
	 * \else
	 * 4.?Z9&D\#,6TS&"SDKDEV_COMM_CFG"VP"s232FuncName"(9&D\C{AP1m)5DOB1j
	 * \endif
	 */
	public byte                byFunction;
}

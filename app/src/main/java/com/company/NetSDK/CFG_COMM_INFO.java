package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Info Structur
 * \else
 * 4.?ZPEO"=a99Le
 * \endif
 */
public class CFG_COMM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial Port Protocol 
	 * \else
	 * P-RiC{3F
	 * \endif
	 */
	public char             szProtocolName[] = new char[FinalVar.MAX_PROTOCOL_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial Port Attribute 
	 * \else
	 * 4.?ZJtPT
	 * \endif
	 */
	public CFG_COMM_PROP    stuAttribute = new CFG_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * 4.?Z5XV7
	 * \endif
	 */
	public int              nAddress;
}

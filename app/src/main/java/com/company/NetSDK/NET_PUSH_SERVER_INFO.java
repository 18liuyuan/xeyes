package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the server configuration
 * \else
 * MFKM7~NqFwEdVC
 * \endif
 */
public class NET_PUSH_SERVER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Address
	 * \else
	 * 5XV7
	 * \endif
	 */
	public byte                           szAddress[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 6K?Z
	 * \endif
	 */
    public int                             nPort;
}

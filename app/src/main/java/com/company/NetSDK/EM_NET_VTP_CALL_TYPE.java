package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video phone call
 * \else
 *  JSF55g;0:t=P@`PM
 * \endif
 */
public class EM_NET_VTP_CALL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SIP calling
	 * \else
	 * SIP:t=P
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_TYPE_SIP = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * GSM calling
	 * \else
	 * GSM:t=P
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_TYPE_GSM = 1; 
}

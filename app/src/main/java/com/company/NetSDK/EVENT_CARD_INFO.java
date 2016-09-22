package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event report with card info
 * \else
 * 6K?ZPr:E
 * \endif
 */
public class EVENT_CARD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Card no. string
	 * \else
	 * ?(F,Pr:EWV7{4.
	 * \endif
	 */
	public byte szCardNumber[] = new byte[FinalVar.SDK_EVENT_CARD_LEN];     
}

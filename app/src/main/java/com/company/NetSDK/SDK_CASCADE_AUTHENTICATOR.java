package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Even the authentication information
 * \else
 * <6A*H(O^QiV$PEO"
 * \endif
 */
public class SDK_CASCADE_AUTHENTICATOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte				szUser[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Passwd
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte				szPwd[] = new byte[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial no.
	 * \else
	 * Ih18PrAP:E
	 * \endif
	 */
	public byte				szSerialNo[] = new byte[FinalVar.SDK_SERIALNO_LEN];
}

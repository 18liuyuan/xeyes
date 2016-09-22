package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * encrypt algorithm
 * \else
 * <SC\Kc7(2NJ}
 * \endif
 */
public class ALGO_PARAM_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt length, for example: wEncryptLenth = 128,the effictive encprypt key vlue only include byAesKey[0]~[15] in the  ENCRYPT_KEY_INFO struct
	 * when the encrypt algorithm is AES,it only support 3 kind length such as 128,192,256
	 * when the encrypt algorithm is DES,it has a fixed value 64
	 * when the encrypt algorithm is DES,it means the encrypt key's number(2 or 3 encrypt key)
	 * \else
	 * C\T?3$6H#,51G0N*AESKc7(@`PMJ1#,1mJ>C\T?N;J}(D?G0V'3V128#,192#,256N;H}VV, Hg: wEncryptLenthN*128#,TrC\T?PEO"ENCRYPT_KEY_INFO@o5DbyAesKey[0]~[15])
	 * N*DESKc7(@`PMJ1#,C\T?3$6H9L6(N*64N;
	 * N*3DESKc7(@`PMJ1#,1mJ>C\T?5D8vJ}(2;r38vC\T?)
	 * \endif
	 */
	public short       wEncryptLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * work mode, see EM_ENCRYPT_ALOG_WORKMODE 
	 * \else
	 * 9$WwD#J=,2N?<C6>Y@`PM EM_ENCRYPT_ALOG_WORKMODE 
	 * \endif
	 */
	public byte       byAlgoWorkMode; 
}

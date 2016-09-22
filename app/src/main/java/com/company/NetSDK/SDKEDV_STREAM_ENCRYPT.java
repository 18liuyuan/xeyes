package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream encrypt configuration
 * \else
 * BkAw<SC\EdVCPEO"
 * \endif
 */
public class SDKEDV_STREAM_ENCRYPT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm type:00: AES,01:DES,02: 3DES
	 * \else
	 * <SC\Kc7(@`PM#:00: AES!"01:DES!"02: 3DES
	 * \endif
	 */
	public byte                    byEncrptAlgoType;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm param
	 * \else
	 * <SC\Kc7(2NJ}
	 * \endif
	 */
	public ALGO_PARAM_INFO         stuEncrptAlgoparam = new ALGO_PARAM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * each channel's encrypt key's info
	 * \else
	 * 8wM(5@5DC\T?PEO"
	 * \endif
	 */
	public ENCRYPT_KEY_INFO        stuEncryptKeys[] = new ENCRYPT_KEY_INFO[32];

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan enable
	 * \else
	 * <SC\<F;.J9D\
	 * \endif
	 */
	public byte                    byEncrptPlanEnable;

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan beginning time
	 * \else
	 * <SC\<F;.5D?*J<J1<d
	 * \endif
	 */
	public NET_TIME                stuPreTime = new NET_TIME();
    
    public SDKEDV_STREAM_ENCRYPT() {
    	for (int i = 0; i < 32; i++) {
    		stuEncryptKeys[i] = new ENCRYPT_KEY_INFO();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * encrypt key info
 * \else
 * >_LeC\T?PEO"368vWV=Z
 * \endif
 */
public class ENCRYPT_KEY_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt enable, 0: not encrypt, 1:encrypt
	 * \else
	 * JG7q<SC\0:2;<SC\, 1:<SC\
	 * \endif
	 */
    public byte        byEncryptEnable;
    
    /**
     * \if ENGLISH_LANG
     * des key
     * \else
     * desC\T?
     * \endif
     */
    public byte    byDesKey[] = new byte[8];
    
    /**
     * \if ENGLISH_LANG
     * 3des key
     * \else
     * 3desC\T?
     * \endif
     */
    public byte    by3DesKey[][] = new byte[3][8];
    
    /**
     * \if ENGLISH_LANG
     * aes key
     * \else
     * aesC\T?
     * \endif
     */
    public byte    byAesKey[] = new byte[32];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video watermark configuration
 * \else
 * M<OsK.S!EdVC
 * \endif
 */
public class SDKDEV_WATERMAKE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public int                 nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit stream(1!+n)0-all bit streams
	 * \else
	 * BkAw(1!+n)0-KySPBkAw
	 * \endif
	 */
	public int                 nStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Data type(1-character,2-picture)
	 * \else
	 * J}>]@`PM(1-NDWV#,2-M<F,) 
	 * \endif
	 */
	public int                 nKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Character
	 * \else
	 * NDWV
	 * \endif
	 */
	public byte                szLetterData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_LETTER];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture data
	 * \else
	 * M<F,J}>]
	 * \endif
	 */
	public byte                szData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}

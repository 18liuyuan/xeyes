package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Watermark Congiguration
 * \else
 * K.S!EdVC
 * \endif
 */
public class CFG_WATERMARK_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ChannelID(from 0) 
	 * \else
	 * M(5@:E(0?*J<)
	 * \endif
	 */
	public int 					nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Type(1!+n)0-all 
	 * \else
	 * BkAw@`PM(1!+n)#,0#-KySPBkAw
	 * \endif
	 */
	public int					nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data Type1-Character#,2-Picture 
	 * \else
	 * J}>]@`PM#,1#-NDWV#,2#-M<F,
	 * \endif
	 */
	public int					nDataType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Character Watermark Data 
	 * \else
	 * WV7{4.K.S!J}>]
	 * \endif
	 */
	public byte[]				pData = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}


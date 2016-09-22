package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * array
 * \else
 * J}Wi
 * \endif
 */
public class AV_CFG_SpliceScreen implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Splice screen name
	 * \else
	 * F4=SFAC{3F
	 * \endif
	 */
	public byte[]  	    szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];	
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * KyJt5gJSG=C{3F
	 * \endif
	 */
	public byte[]       szWallName = new byte[FinalVar.AV_CFG_Monitor_Name_Len];// KyJt5gJSG=C{3F
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number
	 * \else
	 * KyJtGxSrPr:E
	 * \endif
	 */
	public int			nBlockID;			
	
	/**
	 * \if ENGLISH_LANG
	 * Zone axis
	 * \else
	 * GxSrWx1j(0~8191)
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();							// GxSrWx1j(0~8191)
}

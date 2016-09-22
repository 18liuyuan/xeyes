package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * =bBkFw;-CfWi:OPEO"
 * \endif
 */
public class DEC_COMBIN_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Combin ID
	 * \else
	 * Wi:OID
	 * \endif
	 */
	public int				nCombinID;
	
	/**
	 * \if ENGLISH_LANG
	 * Partition number
	 * \else
	 * ;-Cf7V8nJ} 
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Display channel
	 * \else
	 * OTJ>M(5@
	 * \endif
	 */
	public byte            bDisChn[]		= new byte[16];
}

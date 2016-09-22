package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice Call Linkage Information
 * \else
 * SoRt:t=PA*6/PEO"
 * \endif
 */
public class CFG_TALKBACK_INFO implements Serializable{
	
	private static final long 	serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Enable
	 * \else
	 * SoRt:t=PJ9D\
	 * \endif
	 */
	public boolean		bCallEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Calls Originating
	 * \else
	 * SoRt:t=P7"Fp7=
	 * \endif
	 * @see EM_CALLER_TYPE
	 */
	public int		emCallerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Protocol
	 * \else
	 * SoRt:t=PP-Ri
	 * \endif
	 * @see EM_CALLER_PROTOCOL_TYPE
	 */
	public int		emCallerProtocol;
}

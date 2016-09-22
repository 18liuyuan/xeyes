package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour Information
 * \else
 * =bBkFwBVQ2PEO"
 * \endif
 */
public class DEC_TOUR_COMBIN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour Interval(s)
	 * \else
	 * BVQ2<d8t(Ck)
	 * \endif
	 */
	public int				nTourTime;
	
	/**
	 * \if ENGLISH_LANG
	 * the number of combination
	 * \else
	 * Wi:O8vJ}
	 * \endif
	 */
	public int				nCombinNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Combination Table
	 * \else
	 * Wi:O1m
	 * \endif
	 */
	public byte			bCombinID[]		= new byte[FinalVar.DEC_COMBIN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Combination option state,0:close;1:open
	 * \else
	 * Wi:OOn5DJ9D\W4L,#,0#:9X#;1#:?*
	 * \endif
	 */
	public byte			bCombinState[] 	= new byte[FinalVar.DEC_COMBIN_NUM];
}

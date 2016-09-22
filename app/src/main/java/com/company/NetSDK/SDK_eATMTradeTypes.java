package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Trade type
 * \else
 * =;RW@`PM
 * \endif
 */
public class SDK_eATMTradeTypes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * INSERTCARD
	 * \else
	 * 2e?( 
	 * \endif
	 */
	public static final int TRADE_TYPE_INC = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * WITHDRAWCARD
	 * \else
	 * MK?(
	 * \endif
	 */
	public static final int TRADE_TYPE_WDC = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * CHECKTIME
	 * \else
	 * P#J1
	 * \endif
	 */
	public static final int TRADE_TYPE_CKT = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * QUERY
	 * \else
	 * 2iQ/
	 * \endif
	 */
	public static final int TRADE_TYPE_INQ = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Withdrawal
	 * \else
	 * H!?n
	 * \endif
	 */
	public static final int TRADE_TYPE_CWD = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Change password
	 * \else
	 * 8DC\
	 * \endif
	 */
	public static final int TRADE_TYPE_PIN = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * Treansfer
	 * \else
	 * W*UJ
	 * \endif
	 */
	public static final int TRADE_TYPE_TFR = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saving
	 * \else
	 * 4f?n
	 * \endif
	 */
	public static final int TRADE_TYPE_DEP = 7;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card search
	 * \else
	 * N^?(2iQ/
	 * \endif
	 */
	public static final int TRADE_TYPE_NCINQ = 8;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card saving
	 * \else
	 * N^?(4f?n
	 * \endif
	 */
	public static final int TRADE_TYPE_NCDEP = 9;
	
 	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * FdK|
	 * \endif
	 */
	public static final int TRADE_TYPE_OTHERS = 10;
	
 	/**
	 * \if ENGLISH_LANG
	 * Total
	 * \else
	 * W\
	 * \endif
	 */
	public static final int TRADE_TYPE_ALL = 11;
}

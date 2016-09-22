package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New Record Set Operation(Insert)Parameter
 * \else
 * <GB<</PBTv2YWw(insert)JdHk2NJ}
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_IN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Information Type
	 * \else
	 * <GB<</PEO"@`PM
	 * 1:=;M(0WC{5%UK;'<GB<,6TS& FIND_RECORD_TRAFFICREDLIST_CONDITION
	 * 2:=;M(:ZC{5%UK:E<GB<,6TS& FIND_RECORD_TRAFFICREDLIST_CONDITION
	 * 3:?LB<08<~<GB<,6TS& FIND_RECORD_BURN_CASE_CONDITION 
	 * 4:CE={?(,6TS& NET_RECORDSET_ACCESS_CTL_CARD
	 * 5:CE={C\Bk,6TS& NET_RECORDSET_ACCESS_CTL_PWD
	 * 6:CE={3vHk<GB<,6TS& NET_RECORDSET_ACCESS_CTL_CARDREC
	 * 7:<YHU<GB<</, 6TS& NET_RECORDSET_HOLIDAY
	 * \endif
	 */
	public int		nType;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information Cache,The EM_NET_RECORD_TYPE Note is Details
	 * \else
	 * <GB<</PEO";:4f#,Oj<{EM_NET_RECORD_TYPEW"JM
	 * \endif
	 */
	public Object	pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information Cache Size
	 * \else
	 * <GB<</PEO";:4f4sP!
	 * \endif
	 */
	public int		nBufLen;
}

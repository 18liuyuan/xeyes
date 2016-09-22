package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record Information
 * \else
 * CE={?(<GB<</PEO"
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * <GB<</1`:E#,V;6A
	 * \endif
	 */
	public int		nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Creat Time
	 * \else
	 * 44=(J1<d
	 * \endif
	 */
	public NET_TIME	stuCreateTime 		= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Card number
	 * \else
	 * ?(:E
	 * \endif
	 */
	public char     szCardNo[] 			= new char[FinalVar.SDK_MAX_CARDNO_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * SC;'ID
	 * \endif
	 */
	public char     szUserID[]			= new char[FinalVar.SDK_MAX_USERID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Stetue
	 * \else
	 * ?(W4L,.0:U}3#.1:9RJ'.2:W"Oz.4:63=a
	 * \endif
	 */
	public int		nStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type
	 * \else
	 * ?(@`PM.1:R;0c?(.2:VIP?(.3:@41v?(.4:Q2B_?(.5::ZC{5%?(.6:P2FH?(.0xff:D8?(
	 * \endif
	 */
	public int		nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Password
	 * \else
	 * ?(C\Bk
	 * \endif
	 */
	public char		szPsw[]				= new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * SPP'5DCEJ}D?
	 * \endif
	 */
	public int		nDoorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * SPH(O^5DCEPr:E#,<4CFG_CMD_ACCESS_EVENTEdVC5DJ}WiOB1j
	 * \endif
	 */
	public int		sznDoors[] 			= new int[FinalVar.SDK_MAX_DOOR_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the Number of Effective Open Time
	 * \else
	 * SPP'5D5D?*CEJ1<d6NJ}D?
	 * \endif
	 */
	public int		nTimeSectionNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Time Segment Index,That is CFG_ACCESS_TIMESCHEDULE_INFO Array subscript
	 * \else
	 * ?*CEJ1<d6NKwR}#,<4CFG_ACCESS_TIMESCHEDULE_INFO5DJ}WiOB1j
	 * \endif
	 */
	public int	 	sznTimeSectionNo[] 	= new int[FinalVar.SDK_MAX_TIMESECTION_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Frequency of Use
	 * \else
	 * J9SC4NJ}
	 * \endif
	 */
	public int		nUserTime; 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Start Time 
	 * \else
	 * ?*J<SPP'FZ
	 * \endif
	 */
	public NET_TIME	stuValidStartTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid End Time
	 * \else
	 * =aJxSPP'FZ
	 * \endif
	 */
	public NET_TIME	stuValidEndTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Wether Valid,True =Valid,False=Invalid
	 * \else
	 * JG7qSPP',trueSPP';falseN^P'
	 * \endif
	 */
	public boolean	bIsValid;
}

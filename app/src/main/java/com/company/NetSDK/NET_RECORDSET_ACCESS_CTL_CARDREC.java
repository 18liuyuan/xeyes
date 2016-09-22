package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control card Record Information
 * \else
 * CE={K"?(<GB<<GB<</PEO"
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARDREC implements Serializable {
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
	public int			nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Number
	 * \else
	 * ?(:E
	 * \endif
	 */
	public char			szCardNo[] 	= new char[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public char			szPwd[] 	= new char[FinalVar.SDK_MAX_CARDPWD_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Time
	 * \else
	 * K"?(J1<d
	 * \endif
	 */
	public NET_TIME		stuTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Result,True is Succes,False is Fail
	 * \else
	 * K"?(=a9{#,TRUE1mJ>3I9&#,FALSE1mJ>J'0\
	 * \endif
	 */
	public boolean		bStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Door Method
	 * \else
	 * ?*CE7=J=
	 * 1:C\Bk?*Kx
	 * 2:K"?(?*Kx
	 * 3:OHK"?(:sC\Bk?*Kx
	 * 4:OHC\Bk:sK"?(?*Kx
	 * 5:T63L?*Kx#,HgM(9}JRDZ;z;rU_F=L(6TCE?Z;z?*Kx
	 * 6:?*Kx04E%=xPP?*Kx
	 * \endif
	 */
	public int			nMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript 
	 * \else
	 * CE:E#,<4CFG_CMD_ACCESS_EVENTEdVCCFG_ACCESS_EVENT_INFO5DJ}WiOB1j
	 * \endif
	 */
	public int			nDoor; 
}

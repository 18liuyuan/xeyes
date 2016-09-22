package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Normal COnfiguration 
 * \else
 * FUM(EdVC (CFG_CMD_DEV_GENERRAL) General 
 * \endif
 */
public class CFG_DEV_DISPOSITION_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device No.#,Mainly for Remoter Indentify Different Device 0~998 
	 * \else
	 * 1>;z1`:E#,VwR*SCSZR#?XFwGx7V2;M,Ih18	0~998
	 * \endif
	 */
	public int 				nLocalNo;
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Name Or No. 
	 * \else
	 * ;zFwC{3F;r1`:E
	 * \endif
	 */
	public byte[]			szMachineName = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Address is Road Code 
	 * \else
	 * ;zFw2?Jp5X5c<45@B71`Bk
	 * \endif
	 */
	public byte[]			szMachineAddress = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * Machine Group Or Machine Affiliated Unit Default Empty#,User Can Put Different Machines As One Group#,Easy Management#,Repeatability
	 * \else
	 * ;zFw7VWi;r=PIh18KyJt5%N;	D,HON*?U#,SC;'?IRT=+2;M,5DIh181`N*R;Wi#,1cSZ9\@m#,?IVX84!#
	 * \endif
	 */
	public byte[]			szMachineGroup = new byte[256];
	
 	/**
	 * \if ENGLISH_LANG
	 * device no. , only one in platform with interne
	 * \else
	 * ;zFw1`:E, A*MxF=L(DZN(R;
	 * \endif
	 */
	public byte[]			szMachineID = new byte[64];
}

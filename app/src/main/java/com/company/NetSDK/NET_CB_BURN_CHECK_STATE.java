package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CB_fBurnCheckCallBack parameter
 * \else
 * CB_fBurnCheckCallBack 2NJ}
 * \endif
 */
public class NET_CB_BURN_CHECK_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Info Type
	 * "Checking": Calibrating
	 * "CheckResult": Result
	 * \else
	 * O{O"@`PM
	 * "Checking": P#QiVP
	 * "CheckResult": P#Qi=a9{	
	 * \endif
	 */
	public char             	szType[] = new char[32];
																					 
	/**
	 * \if ENGLISH_LANG
	 * Result, for "CheckResult", TRUE-successful, FALSE-failed
	 * \else
	 * P#Qi=a9{, SCSZ"CheckResult", TRUE-3I9&, FALSE-J'0\
	 * \endif
	 */
	public boolean				bCheckResult;
	
	/**
	 * \if ENGLISH_LANG
	 * Progress, for "Checking", percentage, 0~100
	 * \else
	 * P#Qi=x6H, SCSZ"Checking", 0Y7V1H, 0~100
	 * \endif
	 */
	public byte				byProgress;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Configuration
 * \else
 * 4.?ZEdVC
 * \endif
 */
public class CFG_COMMGROUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial Ports Numk
	 * \else
	 * 4.?Z8vJ}
	 * \endif
	 */
	public int    nCommNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Serial Port Array 
	 * \else
	 * 4.?ZPEO"
	 * \endif
	 */
	public CFG_COMM_INFO    stuComms[] = new CFG_COMM_INFO[FinalVar.MAX_COMM_NUM];
	
	public CFG_COMMGROUP_INFO() {
		for (int i = 0; i < FinalVar.MAX_COMM_NUM; i++) {
			stuComms[i] = new CFG_COMM_INFO();
		}
	}
}

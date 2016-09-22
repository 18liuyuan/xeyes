package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Reserved 
 * \else
 * JSF5Uo6OH+>V1m=a99Le
 * \endif
 */
public class CFG_VIDEODIAGNOSIS_GLOBAL implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Caller allocate global config number  according to capacity  
	 * \else
	 * 5wSCU_7VEdH+>VEdVC8vJ}  8y>]D\A&</;qH!
	 * \endif
	 */
	public int									nTotalGlobalNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Return actual global config number 
	 * \else
	 * 75;XJ5<JH+>VEdVC8vJ}
	 * \endif
	 */
	public int									nReturnGlobalNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis global config caller allocate memory nGlobalCount8vCFG_VIDEODIAGNOSIS_GLOBAL_CHNNL 
	 * \else
	 * JSF5Uo6OH+>VEdVC 5wSCU_7VEdDZ4fnGlobalCount8vCFG_VIDEODIAGNOSIS_GLOBAL_CHNNL
	 * \endif
	 */
	public CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL[]	pstGlobals;
	
	public CFG_VIDEODIAGNOSIS_GLOBAL(int nTotalGlobalNum) {
		this.nTotalGlobalNum = nTotalGlobalNum;
		pstGlobals = new CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL[nTotalGlobalNum];
		for (int i = 0; i < nTotalGlobalNum; i++) {
			pstGlobals[i] = new CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL();
		}
	}
}

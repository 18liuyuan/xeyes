package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_DOFINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                 nCount;                          // 2iQ/75;XHKJ}M3<FPEO"8vJ}
	public SDK_NUMBERSTAT      pstuNumberStat[];                 // 75;XHKJ}M3<FPEO"J}Wi
    
    public NET_OUT_DOFINDNUMBERSTAT(int nMaxStat) {
    	pstuNumberStat = new SDK_NUMBERSTAT[nMaxStat];
    	for (int i = 0; i < nMaxStat; i++) {
    		pstuNumberStat[i] = new SDK_NUMBERSTAT();
    	}
    }
}

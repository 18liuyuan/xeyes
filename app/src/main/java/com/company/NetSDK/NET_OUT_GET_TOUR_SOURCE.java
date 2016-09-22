package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_SPLIT_TOUR_SOURCE[]  pstuWndSrcs;            // 40?ZBVQ2PEO"J}Wi, SC;'7VEdDZ4f
    public int                     nMaxWndCount;           	// 40?ZWn4sJ}Wi, SC;'LnP4
    public int                     nRetWndCount;			// 75;X5D40?ZJ}A?
	
    public NET_OUT_GET_TOUR_SOURCE(int maxWndCount, int maxSrcCount) {
    	this.nMaxWndCount = maxWndCount;
    	pstuWndSrcs = new NET_SPLIT_TOUR_SOURCE[maxWndCount];
    	
    	for(int i = 0; i < nMaxWndCount; ++i) {
    		pstuWndSrcs[i] = new NET_SPLIT_TOUR_SOURCE(maxSrcCount);
    	}
	}           
}

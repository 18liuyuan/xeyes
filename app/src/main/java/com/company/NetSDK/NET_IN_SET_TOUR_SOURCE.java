package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                     nChannel;               // Jd3vM(5@:E
    public int                     nWindow;                // 40?Z:E
    public SDK_SPLIT_SOURCE[]      pstuSrcs;               // OTJ>T4J}Wi, ?I=xPP40?ZBVQ2
    public int                     nSrcCount;              // OTJ>T4J}A?
	public NET_IN_SET_TOUR_SOURCE(int nSrcCount) {
		this.nSrcCount = nSrcCount;
		
		pstuSrcs = new SDK_SPLIT_SOURCE[nSrcCount];
		for (int i = 0; i < pstuSrcs.length; i++) {
			pstuSrcs[i] = new SDK_SPLIT_SOURCE(); 
		}
	}
}

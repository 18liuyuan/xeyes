package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_PREPULLSRC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int             nChannel;                   // JSF5Jd3vM(5@
    public int             nWindow;                    // 40?Z:E
    public int             nSrcCount;                  // T$@-AwT4J}A?
    public SDK_SPLIT_SOURCE[] pSources;                  // T$@-AwT4PEO"
	
    public NET_IN_SPLIT_SET_PREPULLSRC(int sourceCount){
    	this.nSrcCount = sourceCount;
    	pSources = new SDK_SPLIT_SOURCE[sourceCount];
    	for (int i = 0; i < sourceCount; ++i) {
    		pSources[i] = new SDK_SPLIT_SOURCE();
    	}
    } 
}

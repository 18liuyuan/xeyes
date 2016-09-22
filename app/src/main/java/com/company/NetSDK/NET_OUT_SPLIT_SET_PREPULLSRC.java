package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_SET_PREPULLSRC implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int             nResultCount;               // =a9{J}A?, SkT$@-AwT4J}A?O`M,
    public NET_SPLIT_SET_PREPULLSRC_RESULT[] pResults;  // =a9{
    
    public NET_OUT_SPLIT_SET_PREPULLSRC(int preResultCount) {
    	pResults = new NET_SPLIT_SET_PREPULLSRC_RESULT[preResultCount];
    	
    	for(int i = 0; i < preResultCount; ++i) {
    		pResults[i] = new NET_SPLIT_SET_PREPULLSRC_RESULT();
    	}
    }
}

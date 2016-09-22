package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    public NET_SPLIT_CLOSE_WINDOW_RESULT[] pstuResults;         // =a9{J}Wi, SC;'7VEdDZ4f. Hg9{2;PhR*75;X=a9{, ?IRTN*NULL
    public int                 nMaxResultCount;                // =a9{J}WiWn4sJ}A?, SC;'LnP4.
    public int                 nRetResultCount;                // 75;X5D=a9{J}A?
    
    public NET_OUT_SPLIT_CLOSE_WINDOWS(int maxResultCount) {
    	this.nMaxResultCount = maxResultCount;
    	
    	pstuResults = new NET_SPLIT_CLOSE_WINDOW_RESULT[maxResultCount];
    	for (int i = 0; i < maxResultCount; ++i ) {
    		pstuResults[i] = new NET_SPLIT_CLOSE_WINDOW_RESULT();
    	}
    }
}

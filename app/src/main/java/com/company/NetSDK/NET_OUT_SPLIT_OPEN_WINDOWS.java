package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_OPEN_WINDOWS implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public NET_SPLIT_WINDOW_INFO[]  pstuWindows;                // 40?ZPEO", SC;'7VEdDZ4f

	public int                 nMaxWindowCount;                // 40?ZPEO"Wn4sJ}A?, SC;'JdHk
    public int                 nRetWindowCount;                // ?*40J}A?
    
    public NET_OUT_SPLIT_OPEN_WINDOWS(int maxWindowCount) {
    	this.nMaxWindowCount = maxWindowCount;
    	pstuWindows = new  NET_SPLIT_WINDOW_INFO[maxWindowCount];
    	for (int i = 0; i < maxWindowCount; ++i ) {
    		pstuWindows[i] = new  NET_SPLIT_WINDOW_INFO();
    	}
    }
}

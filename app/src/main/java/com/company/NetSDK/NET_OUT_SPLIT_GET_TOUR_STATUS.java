package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SPLIT_GET_TOUR_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_WINDOW_TOUR_STATUS_INFO[] pstuStatus;            // W4L,PEO"V8Uk,  SC;'7VEdDZ4f. 2iQ/40?Z:EN*-1J11mJ>6`8v40?Z5DPEO"J}Wi.
    public int                 nMaxStatusCount;                // W4L,PEO"Wn4sJ}A?, SC;'JdHk
    public int                 nRetStatusCount;					// W4L,PEO"J5<JJ}A?, 2iQ/5C5=
    
	public NET_OUT_SPLIT_GET_TOUR_STATUS(int nMaxStatusCount) {
		this.nMaxStatusCount = nMaxStatusCount;
		
		pstuStatus = new NET_WINDOW_TOUR_STATUS_INFO[nMaxStatusCount];
		for(int i = 0; i < nMaxStatusCount; ++i) {
			pstuStatus[i] =  new NET_WINDOW_TOUR_STATUS_INFO();
		}
	}                
}

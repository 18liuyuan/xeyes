package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_OPEN_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 	nChannel;                       // Jd3vM(5@:E;rHZ:OFAPiDbM(5@:E, pszCompositeIDN*NULLJ1SPP'
    public String         		pszCompositeID;                 // HZ:OFAid
    public int                	nWindowNum;                     // 40?ZJ}A?
    public NET_RECT[]           pstuWindowRects;                // 40?ZGxSrJ}Wi
    public boolean              bDirectable;                    // BzWcV1M(Lu<~
	
    public NET_IN_SPLIT_OPEN_WINDOWS(int windowNumber) {
    	this.nWindowNum = windowNumber;
    	
    	pstuWindowRects = new NET_RECT[windowNumber];
    	
    	for(int i = 0; i < windowNumber; ++i ) {
    		pstuWindowRects[i] = new NET_RECT();
    	}
    }
}

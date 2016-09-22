package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nChannel;                       // Jd3vM(5@:E;rHZ:OFAPiDbM(5@:E, pszCompositeIDN*NULLJ1SPP'
    public String         	   pszCompositeID;                 // HZ:OFAID
    public int[]               pnWindows;                      // 40?Z:EJ}WiV8Uk
    public int                 nWindowCount;                   // 40?ZJ}A?
    
    public NET_IN_SPLIT_CLOSE_WINDOWS( int windowCount) {
    	this.nWindowCount = windowCount;
    	pnWindows = new int[windowCount];
    }
}

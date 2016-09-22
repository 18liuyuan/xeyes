package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_RADIOMETRY_DOFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                         nFound;                             // J5<J2iQ/5=5D5cJ}
    public NET_RADIOMETRY_QUERY[]      stInfo = new NET_RADIOMETRY_QUERY[FinalVar.NET_RADIOMETRY_DOFIND_MAX];  // NB6HM3<FPEO"
	
    public NET_OUT_RADIOMETRY_DOFIND() {
    	for (int i = 0; i < stInfo.length; i++) {
			stInfo[i] = new NET_RADIOMETRY_QUERY();
		}
	}
}

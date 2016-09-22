package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_FIREWARNING_INFO_DETAIL implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                 		nChannel;                     // JSF5M(5@:E
    public int				   		nWarningInfoCount;			  // 1(>/PEO"8vJ}
    public NET_FIREWARNING_INFO 	stuFireWarningInfo[] = new NET_FIREWARNING_INFO[FinalVar.MAX_FIREWARNING_INFO_NUM]; // >_Le1(>/PEO"

    public ALARM_FIREWARNING_INFO_DETAIL() {
    	for(int i = 0; i < FinalVar.MAX_FIREWARNING_INFO_NUM; ++i) {
        	stuFireWarningInfo[i] = new NET_FIREWARNING_INFO();
    	}
    }
}

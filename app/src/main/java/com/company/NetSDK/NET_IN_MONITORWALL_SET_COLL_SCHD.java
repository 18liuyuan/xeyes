package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_SET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int                 nCollectionNum;                 // T$08J}
    public MONITORWALL_COLLECTION_SCHEDULE[] stuCollShedule = new MONITORWALL_COLLECTION_SCHEDULE[FinalVar.SDK_MAX_COLLECTION_NUM];  // T$08J1<d1m
    public int                 nMonitorWallID;                 // 5gJSG=ID

    public NET_IN_MONITORWALL_SET_COLL_SCHD() {
    	for (int i = 0 ; i < FinalVar.SDK_MAX_COLLECTION_NUM; ++i) {
    		stuCollShedule[i] = new MONITORWALL_COLLECTION_SCHEDULE();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

public class NET_MONITORWALL_STATUS_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public int         	 nInterval;                      // BVQ2J1<d<d8t
	public int        	 nCollectionNum;                 // T$08BVQ2J}
	public byte[][]      szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];         // T$08BVQ2WiDZH]
	public byte[]        szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];     // 51G0OTJ>5DT$08C{3F
}

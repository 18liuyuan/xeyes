package com.company.NetSDK;

import java.io.Serializable;

public class NET_ROAD_LIST_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                     szCity[] = new byte[32];             // 35A>Ky4&5D3GJPPEO"
	public byte                     szRoadList[][] = new byte[2048][256];  // 5@B71`BkPEO"
	public int                      nRoadNum;               // 5@B7PEO"8vJ}, V8J>szRoadList5D5Z1N,
}

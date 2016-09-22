package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_FINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                 nChannelID;                 // R*=xPP2iQ/5DM(5@:E
	public NET_TIME            stStartTime = new NET_TIME();                // ?*J<J1<d T]J1>+H75=P!J1
	public NET_TIME            stEndTime = new NET_TIME();                  // =aJxJ1<d T]J1>+H75=P!J1
	public int                 nGranularityType;           // 2iQ/A#6H0:7VVS,1:P!J1,2:HU,3:V\,4:TB,5:<>,6:Dj
	public int                 nWaittime;                  // 5H4}=SJUJ}>]5D3,J1J1<d
}

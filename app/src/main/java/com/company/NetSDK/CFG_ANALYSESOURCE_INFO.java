package com.company.NetSDK;

import java.io.Serializable;

public class CFG_ANALYSESOURCE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean				bEnable;								// JSF57VNvJ9D\
	public int					nChannelID;								// VGD\7VNv5DG06KJSF5M(5@:E
	public int					nStreamType;							// VGD\7VNv5DG06KJSF5BkAw@`PM#,0:W%M<BkAw; 1:VwBkAw; 2:WSBkAw1; 3:WSBkAw2; 4:WSBkAw3; 5:NoLeAw
	public byte				    szRemoteDevice[] = new byte[FinalVar.MAX_NAME_LEN];			// Ih18C{
	public boolean				abDeviceInfo;				        	// Ih18PEO"JG7qSPP'
	public AV_CFG_RemoteDevice  stuDeviceInfo;					        // Ih18PEO"
	public int                  emSourceType;                         // JSF57VNvT4@`PM#,Oj<{ CFG_VIDEO_SOURCE_TYPE
	public CFG_SOURCE_FILE_INFO stuSourceFile = new CFG_SOURCE_FILE_INFO();                          // 51JSF57VNvT4@`PMN*CFG_VIDEO_SOURCE_FILESTREAMJ1#,SPP'
	
	public CFG_ANALYSESOURCE_INFO(int nMaxVideoInputs) {
		stuDeviceInfo  = new AV_CFG_RemoteDevice(nMaxVideoInputs);
	}
}

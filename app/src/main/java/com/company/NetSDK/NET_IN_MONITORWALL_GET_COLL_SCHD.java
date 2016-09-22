package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_GET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean                bAllCollections;                // TRUE-2iQ/KySPT$08, 2;PhR*V86(T$08C{3F. FALSE-2iQ/C{3FKy6TS&5DT$08
	public int             		  nCollectionNum;                 // T$08J}, bAllCollectionsN*FALSEJ1SPP'
	public byte[][]               szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];   // T$08C{3F
	public int                 	  nMonitorWallID;                 // 5gJSG=ID
}

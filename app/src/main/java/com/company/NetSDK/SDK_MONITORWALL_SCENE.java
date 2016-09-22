package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * tv wall scheme tour status info 
 * \else
 * 5gJSG=T$08BVQ2W4L,PEO"
 * \endif
 */
public class SDK_MONITORWALL_SCENE implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];        // 51G0T$08C{3F
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     // ?XVFID
    public SDK_MONITORWALL         stuMonitorWall;                 // 5gJSG=EdVC    
    public SDK_SPLIT_SCENE[]       pstuSplitScene;                 // F4=SFA3!>0PEO"J}Wi, SC;'7VEdDZ4f
    public int                     nMaxSplitSceneCount;            // F4=SFA3!>0J}Wi4sP!, SC;'LnP4
    public int                     nRetSplitSceneCount;            // 75;X5DF4=SFA3!>0J}A?

    public SDK_MONITORWALL_SCENE(int splitSceneCount, int blockCount, int OutputCount, int windowCount) {
    	stuMonitorWall = new SDK_MONITORWALL(blockCount, OutputCount);
    	
    	this.nMaxSplitSceneCount = splitSceneCount;
    	pstuSplitScene = new SDK_SPLIT_SCENE[nMaxSplitSceneCount];
    	
    	for(int i = 0; i < nMaxSplitSceneCount; ++i) {
    		pstuSplitScene[i] =  new SDK_SPLIT_SCENE(windowCount);
    	}
    }
}

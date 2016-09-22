package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_CAMERA_STATEINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                         nValidNum;              // 2iQ/5=5DIcOq;zM(5@W4L,SPP'8vJ},SIsdk75;X
    public int                         nMaxNum;                // pCameraStateInfo J}WiWn4s8vJ},SISC;'LnP4
    public NET_CAMERA_STATE_INFO       pCameraStateInfo[];       // IcOq;zM(5@PEO"J}Wi,SISC;'7VEd
    
    public NET_OUT_GET_CAMERA_STATEINFO(int nMaxNum) {
    	this.nMaxNum = nMaxNum;
    	pCameraStateInfo = new NET_CAMERA_STATE_INFO[nMaxNum];
    	for (int i = 0; i < nMaxNum; i++) {
    		pCameraStateInfo[i] = new NET_CAMERA_STATE_INFO();
    	}
    }
}

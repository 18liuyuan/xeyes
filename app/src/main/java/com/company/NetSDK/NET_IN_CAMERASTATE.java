package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input arguments of AttachCameraState
 * \else
 * AttachCameraState()JdHk2NJ}
 * \endif
 */
public class NET_IN_CAMERASTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channels, -1 means all channel
	 * \else
	 * 9[2l5DM(5@:E,J}WiT*KXVP#,SPR;8vJG-1#,Tr9[2lKySPM(5@
	 * \endif
	 */
	public int                        pChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * number of channels
	 * \else
	 * pChannelsV8Uk3$6H
	 * \endif
	 */
	public int                        nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * callback function for state
	 * \else
	 * W4L,;X5w:/J}
	 * \endif
	 */
    public CB_fCameraStateCallBack    cbCamera; 
    
    public NET_IN_CAMERASTATE(int nChannels) {
    	this.nChannels = nChannels;
    	pChannels = new int[nChannels];
    }
}

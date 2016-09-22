package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.MatrixGetCameras's interface output param
 * \else
 * INetSDK.MatrixGetCameras=S?Z5DJd3v2NJ}
 * \endif
 */
public class SDK_OUT_MATRIX_GET_CAMERAS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * array
	 * \else
	 * OTJ>T4PEO"J}Wi, SC;'7VEdDZ4f
	 * \endif
	 */
	public SDK_MATRIX_CAMERA_INFO  pstuCameras[]; 
	
	/**
	 * \if ENGLISH_LANG
	 * size of source array
	 * \else
	 * OTJ>T4J}Wi4sP!
	 * \endif
	 */
    public int                     nMaxCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * valid number of pstuCameras
	 * \else
	 * 75;X5DOTJ>T4J}A?, pstuCameras5DSPP'8vJ}
	 * \endif
	 */
    public int                     nRetCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * the real channel number of device
	 * \else
	 * Ih18J5<JM(5@8vJ}
	 * \endif
	 */
    public int					   nRealChannelCount;				   
    
    
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount) {
    	this.nMaxCameraCount = nMaxCameraCount;
    	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
    	for (int i = 0; i < this.nMaxCameraCount; i++) {
    		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO();
    	}
    }
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount, int nMaxVideoInputCount)
    {
    	if(nMaxCameraCount > 0)
    	{
    		this.nMaxCameraCount = nMaxCameraCount;
        	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
        	for (int i = 0; i < this.nMaxCameraCount; i++) {
        		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO(nMaxVideoInputCount);
        	}
    	}
    }
}

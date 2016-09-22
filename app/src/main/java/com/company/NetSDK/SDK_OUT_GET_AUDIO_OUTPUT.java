package com.company.NetSDK;

import java.io.Serializable;

public class SDK_OUT_GET_AUDIO_OUTPUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int  				emMode;                // RtF5Jd3vD#J=, SDK_AUDIO_OUTPUT_MODE
    public int                  nWindow;               // Jd3v40?Z:E, emModeN*SDK_AUDIO_FORCEJ1SPP'
    public int[]                pMultiWindows;         // Jd3v40?Z:EAP1m, emModeN*SDK_AUDIO_MULTIJ1SPP', SC;'7VEdDZ4f
    public int                  nMaxMultiWindowCount;  // Jd3v40?Z:EAP1mWn4sJ}A?, SC;'LnP4
    public int                  nRetMultiWindowCount;  // Jd3v40?Z:EJ}A?, emModeN*SDK_AUDIO_MULTIJ1SPP'
	
    public SDK_OUT_GET_AUDIO_OUTPUT(int nMaxMultiWindowCount) {
		this.nMaxMultiWindowCount = nMaxMultiWindowCount;
		
		pMultiWindows = new int[nMaxMultiWindowCount];
	}
}

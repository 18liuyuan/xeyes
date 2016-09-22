package com.company.NetSDK;

import java.io.Serializable;

public class NET_WM_SET_FISHEYE_INIT_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public boolean                         bUseRegion;         // N*TRUEJ1,J9SCRTOB3IT1=xPP3uJ<;/,N*FALSEJ1RTOB3IT1N^P'
    public int                             nCircular;          // ;7PNF+RF(ScQ[OTJ>D#J=VP4xT-J<M<J1SPRbRe!#Hg1+3!"1+85HD#J=5D1;-Cf)
    public int                             nPanorama;          // H+>0F+RF(ScQ[OTJ>D#J=4xH+>0J1SPRbRe,Hg1P!"2P5HD#J=)
	public int                             nFishEyeRegionNum;  // ScQ[=CU}40?ZGxSr2NJ}8vJ}(J}Wi8vJ}5HSZJ5<J5D=CU}D#J=.Hg1+3,TrSP48vT*KX)
    public NET_WM_FISH_EYE_REGION_PARAM[]    stFishEyeRegions = new NET_WM_FISH_EYE_REGION_PARAM[FinalVar.MAX_FISH_EYE_REGION_NUM];    // ScQ[=CU}40?ZGxSr2NJ}PEO"
	public NET_WM_SET_FISHEYE_INIT_PARAM(int fishEyeRegionNum) {
		this.nFishEyeRegionNum = fishEyeRegionNum;
		for(int i = 0; i< fishEyeRegionNum; ++i) {
			stFishEyeRegions[i] = new NET_WM_FISH_EYE_REGION_PARAM();
		}
	}  
}

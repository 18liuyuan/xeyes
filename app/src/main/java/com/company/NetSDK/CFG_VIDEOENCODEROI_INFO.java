package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding ROI(Region of Intrest)Configuration
 * \else
 * JSF51`BkROI(Region of Intrest)EdVC
 * \endif
 */
public class CFG_VIDEOENCODEROI_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Region Number
	 * \else
	 * SE;/GxSr8vJ}
	 * \endif
	 */
	public int				nRegionNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimization Regions Coordinate System[0~8191]
	 * \else
	 * SE;/GxSr V'3V6`8vSE;/GxSr#,J9SCO`6TWx1jLeO5#,H!V5>yN*0~8191
	 * \endif
	 */
	public CFG_RECT[]		stRegions = new CFG_RECT[FinalVar.MAX_QUALITY_REGION_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Image Quality Value1~6 1:the lowes 6:the highest 
	 * \else
	 * M<OqVJA? H!V51~6#,V5T=4s#,M<OqVJA?T=:C
	 * \endif
	 */
	public byte				byQuality;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Main Stream1 Enable 
	 * \else
	 * SE;/VwBkAwJSF51`Bk
	 * \endif
	 */
	public boolean			bMain;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream1 Enable 
	 * \else
	 * SE;/8(BkAw1JSF51`Bk
	 * \endif
	 */
	public boolean			bExtra1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream2 Enable 
	 * \else
	 * SE;/8(BkAw2JSF51`Bk
	 * \endif
	 */
	public boolean			bExtra2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream3 Enable 
	 * \else
	 * SE;/8(BkAw3JSF51`Bk
	 * \endif
	 */
	public boolean			bExtra3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Snapshot Enable 
	 * \else
	 * SE;/W%M<1`Bk
	 * \endif
	 */
	public boolean			bSnapshot;
	
	public CFG_VIDEOENCODEROI_INFO() {
		for (int i = 0; i < FinalVar.MAX_QUALITY_REGION_NUM; ++i) {
			stRegions[i] = new CFG_RECT();
		}
	}
}

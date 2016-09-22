package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoding object - overlay sensor information
 * \else
 * 1`BkNo<~-5~<S4+8PFwPEO"
 * \endif
 */
public class AV_CFG_VideoWidgetSensorInfo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay the preview video 
	 * \else
	 * 5~<S5=T$@@JSF5
	 * \endif
	 */
	public boolean		bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Stack to the main stream of video coding 
	 * \else
	 * 5~<S5=VwBkAwJSF51`Bk
	 * \endif
	 */
	public boolean		bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Area, coordinates ranging from 0 to 8191
	 * \else
	 * GxSr, Wx1jH!V50~8191
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * The Description number of stacking area 
	 * \else
	 * 5~<SGxSrChJvJ}D?
	 * \endif
	 */
	public int			nDescriptionNum;

	/**
	 * \if ENGLISH_LANG
	 * Stacking area description information 
	 * \else
	 * 5~<SGxSrChJvPEO"
	 * \endif
	 */
	public AV_CFG_VideoWidgetSensorInfo_Description 
		stuDescription[] = new AV_CFG_VideoWidgetSensorInfo_Description[FinalVar.AV_CFG_Max_Description_Num];
	
	public AV_CFG_VideoWidgetSensorInfo() {
		for (int i=0 ; i<FinalVar.AV_CFG_Max_Description_Num ; i++) {
			stuDescription[i] = new AV_CFG_VideoWidgetSensorInfo_Description();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SPLIT_SET_MULTI_SOURCE implements Serializable {

	/**
	 * SplitSetMultiSource input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output control method#, value corresponding to EM_VIDEO_OUT_CTRL_TYPE
	 * \else
	 *  JSF5Jd3v?XVF7=J=, V56TS&@`EM_VIDEO_OUT_CTRL_TYPE
	 * \endif
	 */
	public 	int  emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logical channel number,Effective When emCtrlType is EM_VIDEO_OUT_CTRL_CHANNEL
	 * \else
	 *  JSF5Jd3vB_<-M(5@:E, emCtrlTypeN*EM_VIDEO_OUT_CTRL_CHANNELJ1SPP'
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID,When emCtrlType is EM_VIDEO_OUT_CTRL_COMPOSITE_ID
	 * \else
	 *  F4=SFAID, emCtrlTypeN*EM_VIDEO_OUT_CTRL_COMPOSITE_IDJ1SPP'SPP'
	 * \endif
	 */
	public String szCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to change segmentation model 
	 * \else
	 *  JG7q8D1d7V8nD#J=
	 * \endif
	 */
	public boolean bSplitModeEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Segmentation model,Enable when bSplitModeEnable=TRUE#,  value corresponding to SDK_SPLIT_MODE
	 * \else
	 *  7V8nD#J=, bSplitModeEnable=TRUEJ1SPP',V56TS&SDK_SPLIT_MODE
	 * \endif
	 */
	public int 	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 *  Segmentation group number,Effective when bSplitModeEnable=TRUE
	 * \else
	 *  7V8n7VWi:E, bSplitModeEnable=TRUEJ1SPP'
	 * \endif
	 */
	public int   nGroupID;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number Array
	 * \else
	 *  40?Z:EJ}Wi
	 * \endif
	 */
	public int szWindows[];
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number
	 * \else
	 *  40?ZJ}A?
	 * \endif
	 */
	public int nWindowCount;
	
	/**
	 * \if ENGLISH_LANG
	 *  Video source information, corresponding to each window, the number with the number of window 
	 * \else
	 *  JSF5T4PEO", 7V1p6TS&C?8v40?Z, J}A?M,40?ZJ}
	 * \endif
	 */
	public SDK_SPLIT_SOURCE szStuSources[];
	
	
	public NET_IN_SPLIT_SET_MULTI_SOURCE(int nWindowCount)
	{
		this.nWindowCount = nWindowCount;
		
		if(nWindowCount > 0)
		{
			szWindows = new int[nWindowCount];
			szStuSources = new SDK_SPLIT_SOURCE[nWindowCount];
			for(int i = 0; i < nWindowCount; i++)
			{
				szStuSources[i] = new SDK_SPLIT_SOURCE();
			}
			
		}
		
	}
}


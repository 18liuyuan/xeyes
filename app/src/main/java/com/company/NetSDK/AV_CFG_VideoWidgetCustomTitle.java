package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Self-defined title
 * \else
 * 1`BkNo<~-WT6(Re1jLb
 * \endif
 */
public class AV_CFG_VideoWidgetCustomTitle implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to main stream 
	 * \else
	 * 5~<S5=VwBkAw
	 * \endif
	 */
	public boolean				bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * 5~<S5=8(BkAw1
	 * \endif
	 */
	public boolean				bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * 5~<S5=8(BkAw2
	 * \endif
	 */
	public boolean				bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * 5~<S5=8(BkAw3
	 * \endif
	 */
	public boolean				bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * 5~<S5=W%M<
	 * \endif
	 */
	public boolean				bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * G0>0I+
	 * \endif
	 */
	public AV_CFG_Color			stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * 13>0I+
	 * \endif
	 */
	public AV_CFG_Color			stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
	 * \else
	 * GxSr, Wx1jH!V50~8191, =vJ9SCleft:MtopV5, 5c(left,top)S&:M(right,bottom)IhVC3IM,Qy5D5c
	 * \endif
	 */
	public AV_CFG_Rect			stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Title contents
	 * \else
	 * 1jLbDZH]
	 * \endif
	 */
	public byte			szText[] = new byte[FinalVar.AV_CFG_Custom_Title_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * 5~<S5=T$@@JSF5
	 * \endif
	 */
	public boolean				bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Title type "Rtinfo" real-time recorder information, "Custom" custom overlay, temperature and humidity overlay, "Title": credit information "Check" check code
	 * \else
	 * 1jLb@`PM "Rtinfo" J5J1?LB<PEO" "Custom" WT6(Re5~<S!"NBJ*6H5~<S "Title" :F,M7PEO" "Check"  P#QiBk
	 * \endif
	 */
    public byte         szType[] = new byte[FinalVar.AV_CFG_Custom_TitleType_Len];
}

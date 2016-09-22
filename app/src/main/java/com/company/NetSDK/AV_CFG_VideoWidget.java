package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video encode widget config
 * \else
 * JSF51`BkNo<~EdVC
 * \endif
 */
public class AV_CFG_VideoWidget implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel title
	 * \else
	 * M(5@1jLb
	 * \endif
	 */
	public AV_CFG_VideoWidgetChannelTitle	stuChannelTitle = new AV_CFG_VideoWidgetChannelTitle();	

	/**
	 * \if ENGLISH_LANG
	 * Time title
	 * \else
	 * J1<d1jLb
	 * \endif
	 */
	public AV_CFG_VideoWidgetTimeTitle		stuTimeTitle = new AV_CFG_VideoWidgetTimeTitle();

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount
	 * \else
	 * GxSr828GJ}A?
	 * \endif
	 */
	public int								nConverNum;		

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone
	 * \else
	 * 828GGxSr
	 * \endif
	 */
	public AV_CFG_VideoWidgetCover			stuCovers[] = new AV_CFG_VideoWidgetCover[FinalVar.AV_CFG_Max_Video_Widget_Cover];

	/**
	 * \if ENGLISH_LANG
	 *  Self-defined title amount
	 * \else
	 * WT6(Re1jLbJ}A?
	 * \endif
	 */
	public int								nCustomTitleNum;	

	/**
	 * \if ENGLISH_LANG
	 * Self-defined title
	 * \else
	 * WT6(Re1jLb
	 * \endif
	 */
	public AV_CFG_VideoWidgetCustomTitle	stuCustomTitle[] = new AV_CFG_VideoWidgetCustomTitle[FinalVar.AV_CFG_Max_Video_Widget_Custom_Title];

	/**
	 * \if ENGLISH_LANG
	 * The number of sensor information overlay area
	 * \else
	 * 4+8PFwPEO"5~<SGxSrJ}D?
	 * \endif
	 */
	public int								nSensorInfo;	
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor information overlay zone information
	 * \else
	 * 4+8PFwPEO"5~<SGxSrPEO"
	 * \endif
	 */
	public AV_CFG_VideoWidgetSensorInfo		stuSensorInfo[] = new AV_CFG_VideoWidgetSensorInfo[FinalVar.AV_CFG_Max_Video_Widget_Sensor_Info];		
	
	/**
	 * \if ENGLISH_LANG
	 * Font size scale
	 * when fFontSizeScale!Y0 , nFontSize not work
	 * when fFontSizeScale=0 , nFontSize work
	 * \else
	 * 5~<SWVLe4sP!7E4s1H@}
	 * 51fFontSizeScale!Y0J1,nFontSize2;FpWwSC
     * 51fFontSizeScale=0J1,nFontSizeFpWwSC
	 * \endif
	 */
	public double                           fFontSizeScale;            

	/**
	 * \if ENGLISH_LANG
	 * Main Stream Font Size(unit px),work with fFontSizeScale
	 * \else
	 * 5~<S5=VwBkAwIO5DH+>VWVLe4sP!,5%N; px.:MfFontSizeScale92M,WwSC
	 * \endif
	 */
	public int                        nFontSize;                
	/**
	 * \if ENGLISH_LANG
	 * Extra1 Stream Font Size(unit px)
	 * \else
	 * 5~<S5=8(BkAw1IO5DH+>VWVLe4sP!,5%N; px
	 * \endif
	 */
	public int      nFontSizeExtra1;     
	/**
	 * \if ENGLISH_LANG
	 * Extra2 Stream Font Size(unit px)
	 * \else
	 * 5~<S5=8(BkAw2IO5DH+>VWVLe4sP!,5%N; px
	 * \endif
	 */
	public int                        nFontSizeExtra2;        
	/**
	 * \if ENGLISH_LANG
	 * Extra3 Stream Font Size(unit px)
	 * \else
	 * 5~<S5=8(BkAw3IO5DH+>VWVLe4sP!,5%N; px
	 * \endif
	 */
	public int                        nFontSizeExtra3;         
	/**
	 * \if ENGLISH_LANG
	 * SnapShot Font Size(unit px)
	 * \else
	 * 5~<S5=W%M<AwIO5DH+>VWVLe4sP!, 5%N; px
	 * \endif
	 */
	public int                        nFontSizeSnapshot;      
	/**
	 * \if ENGLISH_LANG
	 * Merge SnapShot Font Size(unit px)
	 * \else
	 * 5~<S5=W%M<AwIO:O3IM<F,5DWVLe4sP!,5%N; px
	 * \endif
	 */
	public int                        nFontSizeMergeSnapshot;  

	public AV_CFG_VideoWidget() {
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Cover;i++) {
			stuCovers[i] = new AV_CFG_VideoWidgetCover();
		}
		
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Custom_Title; i++) {
			stuCustomTitle[i] = new AV_CFG_VideoWidgetCustomTitle();
		}
		
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Sensor_Info; i++) {
			stuSensorInfo[i] = new AV_CFG_VideoWidgetSensorInfo();
		}
	}
}

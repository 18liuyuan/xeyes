package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dynamic Monitoring alarm linkage configuration
 * \else
 * 6/L,<l2b1(>/EdVC
 * \endif
 */
public class CFG_MOTION_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number(from 0) 
	 * \else
	 * 1(>/M(5@:E(0?*J<), nVersion=1J1#,4KWV6NN^P'
	 * \endif
	 */
	public int					 nChannelID;									

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				 bEnable;									    

	/**
	 * \if ENGLISH_LANG
	 * SenseLevel1~6#,min:1 max:6
	 * \else
	 * AiCt6H1!+6
	 * \endif
	 */
	public int					 nSenseLevel;								    

	/**
	 * \if ENGLISH_LANG
	 * The number of rows of the dynamic detection area 
	 * \else
	 * 6/L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public int					 nMotionRow;									

	/**
	 * \if ENGLISH_LANG
	 * The number of lines of the dynamic detection area 
	 * \else
	 * 6/L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public int					 nMotionCol;									

	/**
	 * \if ENGLISH_LANG
	 * Detection area#,max: 32*32 areas 
	 * \else
	 * <l2bGxSr#,Wn6`32*32?iGxSr
	 * \endif
	 */
	public byte				 	byRegion[][] = new byte[FinalVar.MAX_MOTION_ROW][FinalVar.MAX_MOTION_COL];	    

	/**
	 * \if ENGLISH_LANG
	 * Alarm linkage 
	 * \else
	 * 1(>/A*6/
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();							    

	/**
	 * \if ENGLISH_LANG
	 * Incident response period 
	 * \else
	 * JB<~OlS&J1<d6N
	 * \endif
	 */
	public CFG_TIME_SECTION	 	stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];   

	/**
	 * \if ENGLISH_LANG
	 * 0, 1, depends on capacity set, read only, when equat to 1 and lower to be valid 
	 * \else
	 * 0, 1, SID\A&</H76(, V;6A, 5HSZ1J1RTOBWV6NSPP'
	 * \endif
	 */
	public int			         nVersion;                                      

	/**
	 * \if ENGLISH_LANG
	 * real only#,depends on nSenseLevel valid or not 
	 * \else
	 * V;6A#,>v6(nSenseLevelJG7qSPP'
	 * \endif
	 */
	public boolean                 bSenseLevelEn;                                 

	/**
	 * \if ENGLISH_LANG
	 * real only#,area occupy enable#, depends on nVolumeRatio valid or not 
	 * \else
	 * V;6A#,Cf;}U<SC1HJ9D\#, >v6(nVolumeRatioJG7qSPP'
	 * \endif
	 */
	public boolean                 bVRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * area occupy ratio,1-100
	 * \else
	 * Cf;}U<SC1H,1-100
	 * \endif
	 */
	public int                  nVolumeRatio;                                  

	/**
	 * \if ENGLISH_LANG
	 * real only#,sensitivity enable#,depends on nSubRatio valid or not 
	 * \else
	 * V;6A#,AiCt6HJ9D\#,>v6(nSubRatioV5JG7qSPP'
	 * \endif
	 */
	public boolean                 bSRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * motion detect difference threshold, 1-100 
	 * \else
	 * 6/<l5D2P2ncPV5, 1-100
	 * \endif
	 */
	public int                  nSubRatio;                                     

	/**
	 * \if ENGLISH_LANG
	 * real only#,0: nMotionRow, nMotionCol and byRegion text valid, 1: window text
	 * \else
	 * V;6A#,0: nMotionRow, nMotionCol:MbyRegionWV6NSPP', 1: OBCfJSF540?ZWV6N 
	 * \endif
	 */
	public boolean                 abWindow;                                      

	/**
	 * \if ENGLISH_LANG
	 * video window 
	 * \else
	 * JSF540?Z8vJ}
	 * \endif
	 */
	public int                  nWindowCount;                                  

	/**
	 * \if ENGLISH_LANG
	 * video window group 
	 * \else
	 * JSF540?ZJ}Wi
	 * \endif
	 */
	public CFG_MOTION_WINDOW    stuWindows[] = new CFG_MOTION_WINDOW[FinalVar.MAX_MOTION_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Read only: 1, onRegionCount, stuRegion valid
	 * 0, onMotionRow, nMotionCol, byRegion valid
	 * \else
	 * V;6A#,1#:nRegionCount#,stuRegionSPP'
	 * 0#:nMotionRow#,nMotionCol#,byRegionSPP'
	 * \endif
	 */
	public boolean                 abDetectRegion;
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone quantity
	 * \else
	 * H}4z6/L,<l2bGxSr8vJ}
	 * \endif
	 */
	public int                  nRegionCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone
	 * \else
	 * H}4z6/L,<l2bGxSr
	 * \endif
	 */
	public CFG_DETECT_REGION    stuRegion[] = new CFG_DETECT_REGION[FinalVar.MAX_MOTION_WINDOW];
	
	public CFG_MOTION_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_MOTION_WINDOW; i++) {
			stuWindows[i] = new CFG_MOTION_WINDOW();
			stuRegion[i] = new CFG_DETECT_REGION();
		}
	}
}

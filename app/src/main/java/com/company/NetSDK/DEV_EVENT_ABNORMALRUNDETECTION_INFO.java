package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_ABNORMALRUNDETECTION's data
 * \else
 * JB<~@`PMEVENT_IVS_ABNORMALRUNDETECTION(Rl3#1<E\JB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_ABNORMALRUNDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int                 nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * have being detected object
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT(); 
	
	/**
	 * \if ENGLISH_LANG
	 * speed ,km/h
	 * \else
	 * NoLeTK6/KY6H,km/h
	 * \endif
	 */
	public double              dbSpeed; 
	
	/**
	 * \if ENGLISH_LANG
	 * triggerSpeed,km/h
	 * \else
	 * 4%7"KY6H,km/h
	 * \endif
	 */
	public double              dbTriggerSpeed; 
	
	/**
	 * \if ENGLISH_LANG
	 * detect region's point number
	 * \else
	 * 9fTr<l2bGxSr6%5cJ}
	 * \endif
	 */
	public int                 nDetectRegionNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * detect region info
	 * \else
	 * 9fTr<l2bGxSr
	 * \endif
	 */
	public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * track line point number
	 * \else
	 * NoLeTK6/9l<#6%5cJ}
	 * \endif
	 */
	public int                 nTrackLineNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * track line info
	 * \else
	 * NoLeTK6/9l<#
	 * \endif
	 */
	public SDK_POINT            TrackLine[] = new SDK_POINT[FinalVar.SDK_MAX_TRACK_LINE_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * JB<~6TS&ND<~PEO"
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * JB<~6/Ww#,01mJ>Bv3eJB<~,11mJ>3VPxPTJB<~?*J<,21mJ>3VPxPTJB<~=aJx;
	 * \endif
	 */
	public byte                bEventAction; 
	
	/**
	 * \if ENGLISH_LANG
	 * type, 0-run fast, 1-sudden speedup, 2-sudden speed-down
	 * \else
	 * Rl3#1<E\@`PM, 0-?lKY1<E\, 1-M;H;<SKY, 2-M;H;<uKY
	 * \endif
	 */
	public byte                bRunType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
	 * \endif
	 */
	public byte                byImageIndex; 
	
	/**
	 * \if ENGLISH_LANG
	 * flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * W%M<1jV>(04N;)#,>_Le<{NET_RESERVED_COMMON
	 * \endif
	 */
	public int               dwSnapFlagMask; 
	
	/**
	 * \if ENGLISH_LANG
	 * the source device's index,-1 means data in invalid
	 * \else
	 * JB<~T4Ih18IO5Dindex,-11mJ>J}>]N^P'
	 * \endif
	 */
	public int                 nSourceIndex; 
	
	/**
	 * \if ENGLISH_LANG
	 * the source device's sign(exclusive),field said local device does not exist or is empty
	 * \else
	 * JB<~T4Ih18N(R;1jJ6,WV6N2;4fTZ;rU_N*?U1mJ>1>5XIh18
	 * \endif
	 */
	public byte                szSourceDevice[] = new byte[FinalVar.MAX_PATH]; 
	
	/**
	 * \if ENGLISH_LANG
	 * event trigger accumilated times 
	 * \else
	 * JB<~4%7"@[<F4NJ}
	 * \endif
	 */
	public int        nOccurrenceCount; 
	
	public DEV_EVENT_ABNORMALRUNDETECTION_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
			DetectRegion[i] = new SDK_POINT();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_TRACK_LINE_NUM; i++) {
			TrackLine[i] = new SDK_POINT();
		}
	}
}

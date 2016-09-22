package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_INREGIONDETECTION's data
 * \else
 * JB<~@`PMEVENT_IVS_INREGIONDETECTION(GxSrDZ<l2bJB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_INREGIONDETECTION_INFO implements Serializable {
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
	 * have being detected objects number
	 * \else
	 * <l2b5=5DNoLe8vJ}
	 * \endif
	 */
    public int                 nObjectNum;
    
    /**
	 * \if ENGLISH_LANG
	 * have being detected objects
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * track line number
	 * \else
	 * 9l<#J}(Sk<l2b5=5DNoLe8vJ}6TS&)
	 * \endif
	 */
    public int                 nTrackNum;
    
    /**
	 * \if ENGLISH_LANG
	 * track lines info
	 * \else
	 * 9l<#PEO"(Sk<l2b5=5DNoLe6TS&)
	 * \endif
	 */
    public SDK_POLY_POINTS      stuTrackInfo[] = new SDK_POLY_POINTS[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * detect regions number
	 * \else
	 * 9fTr<l2bGxSr6%5cJ}
	 * \endif
	 */
    public int                 nDetectRegionNum;
    
    /**
	 * \if ENGLISH_LANG
	 * detect regions
	 * \else
	 * 9fTr<l2bGxSr
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
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
    
    public DEV_EVENT_INREGIONDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    		stuTrackInfo[i] = new SDK_POLY_POINTS();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    }
}

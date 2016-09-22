package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type EVENT_IVS_DENSITYDETECTION(Population amount detect) corresponding data block description info
 * \else
 * JB<~@`PMEVENT_IVS_DENSITYDETECTION(HKT1C\6H<l2b)6TS&J}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_DENSITYDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
    public double              PTS;
    
    /**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
    public int                 nEventID;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object amount
	 * \else
	 * <l2b5=5DNoLe8vJ}
	 * \endif
	 */
    public int                 nObjectNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object list
	 * \else
	 * <l2b5=5DNoLeAP1m
	 * \endif
	 */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * JB<~6TS&ND<~PEO"
	 * \endif
	 */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
	 * \if ENGLISH_LANG
	 * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
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
	 * Acme amount of the rule detect zone
	 * \else
	 * 9fTr<l2bGxSr6%5cJ}
	 * \endif
	 */
    public int                 nDetectRegionNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * 9fTr<l2bGxSr
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Snap flag(by bit).please refer to NET_RESERVED_COMMON
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
    
    public DEV_EVENT_DENSITYDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    }
}

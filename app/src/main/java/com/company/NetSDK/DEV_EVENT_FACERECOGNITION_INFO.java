package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_FACERECOGNITION's data
 * \else
 * JB<~@`PMEVENT_IVS_FACERECOGNITION(HKA3J61p)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_FACERECOGNITION_INFO implements Serializable {
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
	 * event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
    public int                 nEventID;
    
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
     * have being detected object
     * \else
     * <l2b5=5DNoLe
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * candidate number
     * \else
     * 51G0HKA3F%Ed5=5D:rQ!6TOsJ}A?
     * \endif
     */
    public int                 nCandidateNum;
    
    /**
     * \if ENGLISH_LANG
     * candidate info
     * \else
     * 51G0HKA3F%Ed5=5D:rQ!6TOsPEO"
     * \endif
     */
    public CANDIDATE_INFO      stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];
    
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
     * The existence panorama
     * \else
     * H+>0M<JG7q4fTZ
     * \endif
     */
    public boolean                bGlobalScenePic;
    
    /**
     * \if ENGLISH_LANG
     * Panoramic Photos
     * \else
     * H+>0M<F,PEO"
     * \endif
     */
    public SDK_PIC_INFO         stuGlobalScenePicInfo = new SDK_PIC_INFO();
    
    /**
     * \if ENGLISH_LANG
     * Snapshot current face aadevice address  
     * \else
     * W%ED51G0HKA35DIh185XV7#,Hg#:1u?5B737:E
     * \endif
     */
    public byte                szSnapDevAddress[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times 
     * \else
     * JB<~4%7"@[<F4NJ}
     * \endif
     */
    public int        nOccurrenceCount;
    
    public DEV_EVENT_FACERECOGNITION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
    		stuCandidates[i] = new CANDIDATE_INFO();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_TRAFFICSNAPSHOT's data
 * \else
 * JB<~@`PMEVENT_TRAFFICSNAPSHOT(=;M(W%EDJB<~)6TS&5D@`
 * \endif
 */
public class DEV_EVENT_TRAFFICSNAPSHOT_INFO implements Serializable {
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
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte					szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)t
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double				PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX			UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int					nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way number being snapshotting
	 * \else
	 * 4%7"W%ED5D355@8vJ}
	 * \endif
	 */
	public byte                	bCarWayCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way info being snapshotting
	 * \else
	 * 6K4%7"W%ED5D355@O`9XPEO"
	 * \endif
	 */
	public SDK_CARWAY_INFO      	stuCarWayInfo[] = new SDK_CARWAY_INFO[FinalVar.SDK_MAX_CARWAY_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
	 * \else
	 * JB<~6TS&ND<~PEO"
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  	stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * JB<~6/Ww#,01mJ>Bv3eJB<~,11mJ>3VPxPTJB<~?*J<,21mJ>3VPxPTJB<~=aJx;
	 * \endif
	 */
	public byte                	bEventAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no., within same time(second) may have multiple pictures, from 0 to
	 * \else
	 * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * W%M<1jV>(04N;)#,>_Le<{NET_RESERVED_COMMON	
	 * \endif
	 */
	public int               	dwSnapFlagMask;
    
    public DEV_EVENT_TRAFFICSNAPSHOT_INFO() {
    	for(int i=0 ; i<FinalVar.SDK_MAX_CARWAY_NUM ; i++) {
    		stuCarWayInfo[i] = new SDK_CARWAY_INFO();
    	}
    }
}

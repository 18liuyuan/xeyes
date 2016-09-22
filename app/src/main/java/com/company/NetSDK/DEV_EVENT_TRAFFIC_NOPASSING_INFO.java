package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_TRAFFIC_NOPASSING's data
 * \else
 * JB<~@`PMEVENT_IVS_TRAFFIC_NOPASSING(=;M(N%UB-={V9M(PPJB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFIC_NOPASSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
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
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Trigger Type, 0 vehicle inspection device, 1 radar, 2 video
	 * \else
	 * TriggerType:4%7"@`PM#,035<lFw#,1@W4o#,2JSF5
	 * \endif
	 */
	public int                 nTriggerType;

	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public int               PTS;

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
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public int                 UTCMS;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 5W2c2zIz5D4%7"W%EDV!1j<G
	 * \endif
	 */
	public int                 nMark;

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 1mJ>W%EDPr:E#,Hg3,2,1,11mJ>W%ED=aJx,01mJ>Rl3#=aJx
	 * \endif
	 */
	public int                 nSequence;

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
	 * TrafficCar info
	 * \else
	 * =;M(35A>PEO"
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

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
	 * picture resolution
	 * \else
	 * 6TS&M<F,5D7V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

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
	 * Corresponding lane number
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Object to be detected
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * car body information
	 * \else
	 * 35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Video analysis frame number
	 * \else
	 * JSF57VNvV!Pr:E
	 * \endif
	 */
	public int                 nFrameSequence;

	/**
	 * \if ENGLISH_LANG
	 * Data source address of the video analysis
	 * \else
	 * JSF57VNv5DJ}>]T45XV7
	 * \endif
	 */
	public int                 nSource;

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 9+92PEO"
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
}

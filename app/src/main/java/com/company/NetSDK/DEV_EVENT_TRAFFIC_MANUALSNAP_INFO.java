package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFIC_MANUALSNAP's data
 * \else
 * JB<~@`PMEVENT_IVS_TRAFFIC_MANUALSNAP(=;M(JV6/W%EDJB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFIC_MANUALSNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte				szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double			PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX		UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int				nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Lane number
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap number
	 * \else
	 * JV6/W%EDPr:E 
	 * \endif
	 */
	public byte            	szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected object
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected vehicle
	 * \else
	 * <l2b5=5D35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT    stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * TrafficCar info
	 * \else
	 * 1mJ>=;M(35A>5DJ}>]?b<GB<
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
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
	 * Picture no. from 0,at the smae time may havemultiple pictures
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
    
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * 6TS&M<F,5D7V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();
}

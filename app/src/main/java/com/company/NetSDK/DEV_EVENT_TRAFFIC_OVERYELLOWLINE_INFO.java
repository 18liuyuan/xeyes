package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_TRAFFIC_OVERYELLOWLINE's data
 * \else
 * JB<~@`PMEVENT_IVS_TRAFFIC_OVERYELLOWLINE(=;M(N%UB-Q9;FO_)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO implements Serializable {
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
	 * vehicle info
	 * \else
	 * 35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Corresponding Lane number
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int                 nLane;

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
	 * speed,km/h
	 * \else
	 * 35A>J5<JKY6H#,km/h
	 * \endif
	 */
	public int                 nSpeed;

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
	 * true:corresponding alarm recording; false: no corresponding alarm recording
	 * \else
	 * rue:SP6TS&5D1(>/B<Oq; false:N^6TS&5D1(>/B<Oq
	 * \endif
	 */
	public boolean                bIsExistAlarmRecord;

	/**
	 * \if ENGLISH_LANG
	 * Video size
	 * \else
	 * B<Oq4sP!
	 * \endif
	 */
	public int               dwAlarmRecordSize;

	/**
	 * \if ENGLISH_LANG
	 * Video Path
	 * \else
	 * B<OqB7>6
	 * \endif
	 */
	public byte                szAlarmRecordPath[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * =;M(35A>PEO"
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Acme amount of the rule detect zone
	 * \else
	 * 9fTr<l2bGxSr6%5cJ}
	 * \endif
	 */
	public int                 nDetectNum;

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
	 * public info
	 * \else
	 * 9+92PEO"
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
}

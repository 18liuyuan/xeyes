package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFICGATE's data
 * \else
 * JB<~@`PMEVENT_IVS_TRAFFICGATE(=;M(?(?ZJB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFICGATE_INFO implements Serializable {
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
	 * PTS(ms)
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
	 * Have being detected object
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT		stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int					nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * The car's actual rate(Km/h)
	 * \else
	 * 35A>J5<JKY6HKm/h
	 * \endif
	 */
	public int					nSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate upper limit(km/h)
	 * \else
	 * KY6HIOO^ 5%N;#:km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate lower limit(km/h) 
	 * \else
	 * KY6HOBO^ 5%N;#:km/h 
	 * \endif
	 */
	public int					nSpeedLowerLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: Retrograde; 
	 * Second byte:Overline; the third byte:Overspeed; 
	 * The forth byte:UnderSpeed;the five byte: crash red light;the six byte:passing(trafficgate)
	 * The seven byte: OverYellowLine; the eight byte: WrongRunningRoute; the nine byte: YellowVehicleInRoute; default: trafficgate
	 * </pre>
	 * \else
	 * <pre>
	 * N%749fTrQZBk,5ZR;N;:DfPP; 
	 * 5Z6~N;:Q9O_PPJ;; 5ZH}N;:3,KYPPJ;; 
	 * 5ZKDN;#:G7KYPPJ;; 5ZNeN;:43:l5F;5ZAyN;:4)9}B7?Z(?(?ZJB<~)
	 * 5ZF_N;: Q9;FO_; 5Z0KN;: SP35U<5@; 5Z>EN;: ;FEFU<5@;7qTrD,HON*:=;M(?(?ZJB<~
	 * </pre>
	 * \endif
	 */
	public int					dwBreakingRule;
	
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
	 * Vehicle info
	 * \else
	 * 35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap sequence string  
	 * \else
	 * JV6/W%EDPr:E            
	 * \endif
	 */
	public byte                szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 1mJ>W%EDPr:E#,Hg3,2,1,11mJ>W%ED=aJx,01mJ>Rl3#=aJx
	 * \endif
	 */
	public int                 nSequence;
	
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
	 * Snap flag from device
	 * \else
	 * Ih182zIz5DW%ED1jJ6
	 * \endif
	 */
	public byte                bSnapFlag[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap mode,0-normal 1-globle 2-near 4-snap on the same side 8-snap on the reverse side 16-plant picture
	 * \else
	 * W%ED7=J=#,0-N47V@` 1-H+>0 2-=|>0 4-M,OrW%ED 8-74OrW%ED 16-:EEFM<Oq
	 * \endif
	 */
	public byte                bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed percentage
	 * \else
	 * 3,KY0Y7V1H
	 * \endif
	 */
	public byte                byOverSpeedPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed percentage
	 * \else
	 * G7KY0Y7V1H
	 * \endif
	 */
	public byte                byUnderSpeedingPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Red light margin, sr
	 * \else
	 * :l5FH]Pm<d8tJ1<d,5%N;#:Ck
	 * \endif
	 */
	public byte                byRedLightMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Drive direction,0-"Approach",where the car is more near,1-"Leave",means where if mor far to the car
	 * \else
	 * PPJ;7=Or#,0-IOPP(<435A>@kIh182?Jp5cT=@4T==|)#,1-OBPP(<435A>@kIh182?Jp5cT=@4T=T6)
	 * \endif
	 */
	public byte                byDriveDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Road way number
	 * \else
	 * 5@B71`:E
	 * \endif
	 */
	public byte                szRoadwayNo[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * N%UB4zBk
	 * \endif
	 */
	public byte                szViolationCode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation desc
	 * \else
	 * N%UBChJv
	 * \endif
	 */
	public byte                szViolationDesc[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * 6TS&M<F,5D7V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Car type,"Motor", "Light-duty", "Medium", "Oversize", "Huge", "Other" 
	 * \else
	 * 35A>4sP!@`PM#,"Motor" D&MP3535 "Light-duty" P!PM35 "Medium" VPPM35 "Oversize" 4sPM35 "Huge" 3,4s35 "Other" FdK{@`PM
	 * \endif
	 */
	public byte                szVehicleType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Car length, m
	 * \else
	 * 35A>3$6H, 5%N;CW
	 * \endif
	 */
	public byte                byVehicleLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no.,  within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
	 * \endif
	 */
	public byte				byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed margin, km/h 
	 * \else
	 * O^8_KY?mO^V5	5%N;#:km/h 
	 * \endif
	 */
	public int                 nOverSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed margin, km/h 
	 * \else
	 * O^5MKY?mO^V5	5%N;#:km/h 
	 * \endif
	 */
	public int                 nUnderSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * "DrivingDirection" : ["Approach", "Shanghai", "Hangzhou"],
	 * "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car
	 * the second and third param means the location of the driving direction
	 * </pre>
	 * \else
	 * <pre>
	 * "DrivingDirection" : ["Approach", "IO:#", ":<V]"],PPJ;7=Or
	 * "Approach"-IOPP#,<435A>@kIh182?Jp5cT=@4T==|#;"Leave"-OBPP#,
	 * <435A>@kIh182?Jp5cT=@4T=T6#,5Z6~:M5ZH}8v2NJ}7V1p4z1mIOPP:M
	 * OBPP5DA=8v5X5c#,UTF-81`Bk
	 * </pre>
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][FinalVar.SDK_MAX_DRIVINGDIRECTION];

	/**
	 * \if ENGLISH_LANG
	 * Machine name
	 * \else
	 * 1>5X;rT63LIh18C{3F
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine address
	 * \else
	 * ;zFw2?Jp5X5c!"5@B71`Bk
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine group
	 * \else
	 * ;zFw7VWi!"Ih18KyJt5%N;
	 * \endif
	 */
	public byte                szMachineGroup[] = new byte[256];
	
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
	 * The vehicle detector generates the snap signal redundancy info
	 * \else
	 * SI35<lFw2zIzW%EDPE:EH_S`PEO"
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO_EX stuSigInfo = new SDK_SIG_CARWAY_INFO_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * ND<~B7>6
	 * \endif
	 */
	public byte                szFilePath[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * The begin time of red light
	 * \else
	 * :l5F?*J<UTCJ1<d
	 * \endif
	 */
	public NET_TIME_EX			RedLightUTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Device address,OSD superimposed onto the image,from TrafficSnapshot.DeviceAddress,'\0'means end.
	 * \else
	 * Ih185XV7,OSD5~<S5=M<F,IO5D,@4T4SZEdVCTrafficSnapshot.DeviceAddress,'\0'=aJx
	 * \endif
	 */
	public byte[]              szDeviceAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture exposure time#,unit is ms
	 * \else
	 * 51G0M<F,FX9bJ1<d#,5%N;N*:ACk
	 * \endif
	 */
	public float               fActualShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture gain#,range 0~100
	 * \else
	 * 51G0M<F,TvRf#,76N'N*0~100
	 * \endif
	 */
	public byte                byActualGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Card quantity
	 * \else
	 * ?(F,8vJ}
	 * \endif
	 */
	public byte                bRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ?(F,PEO"
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];   
    
    public DEV_EVENT_TRAFFICGATE_INFO() {
    	for (int i=0 ; i<FinalVar.SDK_EVENT_MAX_CARD_NUM ; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The media file information searched by SDK_MEDIA_QUERY_TRAFFICCAR
 * \else
 * SDK_MEDIA_QUERY_TRAFFICCAR2iQ/3v@45DmediaND<~PEO"
 * \endif
 */
public class MEDIAFILE_TRAFFICCAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel number
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int        ch;
	
	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * ND<~B7>6
	 * \endif
	 */
	public char			szFilePath[] 		= new char[128];
	
	/**
	 * \if ENGLISH_LANG
	 * File length
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
	public int        size;

	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME            starttime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME            endtime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Working directory serial number
	 * \else
	 * 9$WwD?B<1`:E
	 * \endif
	 */
	public int        nWorkDirSN;

	/**
	 * \if ENGLISH_LANG
	 * File type.  1:jpg file
	 * \else
	 * ND<~@`PM  1#:jpgM<F,
	 * \endif
	 */
	public byte                nFileType;

	/**
	 * \if ENGLISH_LANG
	 * File location index
	 * \else
	 * ND<~6(N;KwR}
	 * \endif
	 */
	public byte                bHint;

	/**
	 * \if ENGLISH_LANG
	 * drive number
	 * \else
	 * 4EEL:E
	 * \endif
	 */
	public byte                bDriveNo;

	/**
	 * \if ENGLISH_LANG
	 * cluster number
	 * \else
	 * 4X:E
	 * \endif
	 */
	public int        nCluster;

	/**
	 * \if ENGLISH_LANG
	 * flags
	 * \else
	 * M<F,@`PM, 0-FUM(, 1-:O3I, 2-?YM<
	 * \endif
	 */
	public byte                byPictureType;

	//RTOBJG=;M(35A>PEO"
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle plate number
	 * \else
	 * 35EF:EBk
	 * \endif
	 */
	public char			szPlateNumber[] 	= new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate type: "Unknown" =Unknown; "Normal"=Blue and black plate. "Yellow"=Yellow plate. "DoubleYellow"=Double-layer yellow plate
	 * "Police"=Police plate ; "Armed"= =Military police plate; "Military"=Army plate; "DoubleMilitary"=Army double-layer 
	 * "SAR" =HK SAR or Macao SAR plate; "Trainning" =rehearsal plate; "Personal"=Personal plate; "Agri"=Agricultural plate
	 * "Embassy"=Embassy plate; "Moto"=Moto plate ; "Tractor"=Tractor plate; "Other"=Other plate 
	 * \else
	 * :EEF@`PM"Unknown" N4V*; "Normal" @6EF:ZEF; "Yellow" ;FEF; "DoubleYellow" K+2c;FN2EF
	 * "Police" >/EF; "Armed" Nd>/EF; "Military" 2?6S:EEF; "DoubleMilitary" 2?6SK+2c
	 * "SAR" 8[0DLXGx:EEF; "Trainning" =LA735:EEF; "Personal" 8vPT:EEF; "Agri" E)SCEF
	 * "Embassy" J99]:EEF; "Moto" D&MP35:EEF; "Tractor" MO@-;z:EEF; "Other" FdK{:EEF
	 * \endif
	 */
	public char			szPlateType[] 		= new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate color:"Blue","Yellow", "White","Black"
	 * \else
	 * 35EFQUI+:"Blue","Yellow", "White","Black"
	 * \endif
	 */
	public char			szPlateColor[] 		= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * 35ImQUI+:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \endif
	 */
	public char			szVehicleColor[] 	= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Speed. The unit is Km/H
	 * \else
	 * 35KY,5%N;Km/H
	 * \endif
	 */
	public int                 nSpeed;

	/**
	 * \if ENGLISH_LANG
	 * Activation event amount
	 * \else
	 * 9XA*5DJB<~8vJ}
	 * \endif
	 */
	public int                 nEventsNum;

	/**
	 * \if ENGLISH_LANG
	 * Activation event list. The number refers to the corresponding event. Please refer to Intelligent Analytics Event Type.
	 * \else
	 * 9XA*5DJB<~AP1m,J}WiV51mJ>O`S&5DJB<~#,Oj<{"VGD\7VNvJB<~@`PM"
	 * \endif
	 */
	public int                 nEvents[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 * Detailed offense type subnet mask. The first bit means redlight offense, the second bit is illegal straight/left-turn/right-turn driving.
	 * The third bit is the wrong way driving; the four bit is illegal U-turn. Otherwise default value is intersection accident. 
	 * \else
	 * >_LeN%UB@`PMQZBk,5ZR;N;:43:l5F; 5Z6~N;:2;049f6(355@PPJ;;
	 * 5ZH}N;:DfPP; 5ZKDN;#:N%UB5tM7;7qTrD,HON*:=;M(B7?ZJB<~
	 * \endif
	 */	
	public long			dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle type:"Light-duty"=small;"Medium"=medium; "Oversize"=large
	 * \else
	 * 35A>4sP!@`PM:"Light-duty":P!PM35;"Medium":VPPM35; "Oversize":4sPM35
	 * \endif
	 */
	public char			szVehicleSize[] 	= new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Local or remote channel name
	 * \else
	 * 1>5X;rT63L5DM(5@C{3F
	 * \endif
	 */
	public char			szChannelName[]		= new char[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Local or remote device name
	 * \else
	 * 1>5X;rT63LIh18C{3F
	 * \endif
	 */
	public char			szMachineName[] 	= new char[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * up limit of speed, km/h
	 * \else
	 * KY6HIOO^ 5%N;: km/h
	 * \endif
	 */
	public int                 nSpeedUpperLimit;

	/**
	 * \if ENGLISH_LANG
	 * lower limit of speed km/h
	 * \else
	 * KY6HOBO^ 5%N;: km/h
	 * \endif
	 */
	public int                 nSpeedLowerLimit;

	/**
	 * \if ENGLISH_LANG
	 * id of event group
	 * \else
	 * JB<~@o5DWi1`:E
	 * \endif
	 */
	public int                 nGroupID;

	/**
	 * \if ENGLISH_LANG
	 * total count of the event group
	 * \else
	 * R;8vJB<~WiDZ5DW%EDUEJ}
	 * \endif
	 */
	public byte                byCountInGroup;

	/**
	 * \if ENGLISH_LANG
	 * the index of this event
	 * \else
	 * R;8vJB<~WiDZ5DW%EDPr:E
	 * \endif
	 */
	public byte                byIndexInGroup;

	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * 355@,2N<{MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public byte                byLane;
	
	/**
	 * \if ENGLISH_LANG
	 * direction,MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \else
	 * 355@7=Or,2N<{MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public int			nDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * machine address
	 * \else
	 * ;zFw2?Jp5X5c
	 * \endif
	 */
	public char      	szMachineAddress[] 	= new char[FinalVar.MAX_PATH];
}

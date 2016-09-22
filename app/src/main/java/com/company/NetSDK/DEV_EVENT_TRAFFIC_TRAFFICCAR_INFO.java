package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TrafficCar
 * \else
 * =;M(35A>PEO"
 * \endif
 */
public class DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Plate number
	 * \else
	 * 35EF:EBk
	 * \endif
	 */
	public byte               szPlateNumber[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * Plate type
	 * \else
	 * :EEF@`PM	2N<{VideoAnalyseRuleVP35EF@`PM6(Re
	 * \endif
	 */
	public byte               szPlateType[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * plate color, "Blue","Yellow", "White","Black"
	 * \else
	 * 35EFQUI+	"Blue","Yellow", "White","Black"
	 * \endif
	 */
	public byte               szPlateColor[] 	= new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * vehicle color, "White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * 35ImQUI+	"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \endif
	 */
	public byte               szVehicleColor[] = new byte[32];          
	/**
	 * \if ENGLISH_LANG
	 * speed, Km/H
	 * \else
	 * KY6H	5%N;Km/H
	 * \endif
	 */
	public int                nSpeed;                          		 
	/**
	 * \if ENGLISH_LANG
	 * trigger event type
	 * \else
	 * 4%7"5DO`9XJB<~	2N<{JB<~AP1mEvent List#,V;0|:,=;M(O`9XJB<~!#
	 * \endif
	 */
	public byte               szEvent[] = new byte[64];                 
	/**
	 * \if ENGLISH_LANG
	 * violation code, see TrafficGlobal.ViolationCode
	 * \else
	 * N%UB4zBk	Oj<{TrafficGlobal.ViolationCode
	 * \endif
	 */
	public byte               szViolationCode[] = new byte[32];         
	/**
	 * \if ENGLISH_LANG
	 * violation describe
	 * \else
	 * N%UBChJv
	 * \endif
	 */
	public byte               szViolationDesc[] = new byte[64];         
	/**
	 * \if ENGLISH_LANG
	 * lower speed limit
	 * \else
	 * KY6HOBO^
	 * \endif
	 */
	public int                nLowerSpeedLimit;                
	/**
	 * \if ENGLISH_LANG
	 * upper speed limit
	 * \else
	 * KY6HIOO^
	 * \endif
	 */
	public int                nUpperSpeedLimit;                
	/**
	 * \if ENGLISH_LANG
	 * over speed margin, km/h 
	 * \else
	 * O^8_KY?mO^V5	5%N;#:km/h
	 * \endif
	 */
	public int                nOverSpeedMargin;                 
	/**
	 * \if ENGLISH_LANG
	 * under speed margin, km/h 
	 * \else
	 * O^5MKY?mO^V5	5%N;#:km/h 
	 * \endif
	 */
	public int                nUnderSpeedMargin;               
	/**
	 * \if ENGLISH_LANG
	 * lane
	 * \else
	 * 355@	2N<{JB<~AP1mEvent ListVP?(?Z:MB7?ZJB<~!#
	 * \endif
	 */
	public int                nLane;                           
	/**
	 * \if ENGLISH_LANG
	 * vehicle size, see VideoAnalyseRule's describe
	 * \else
	 * 35A>4sP!,-11mJ>N4V*#,7qTr04N;
	 * 5Z0N;:"Light-duty", P!PM35
	 * 5Z1N;:"Medium", VPPM35
	 * 5Z2N;:"Oversize", 4sPM35
	 * 5Z3N;:"Minisize", N"PM35
	 * 5Z4N;:"Largesize", 3$35
	 * \endif
	 */
	public int                nVehicleSize;                    

	/**
	 * \if ENGLISH_LANG
	 * vehicle length, (m)
	 * \else
	 * 35A>3$6H	5%N;CW
	 * \endif
	 */
	public float             fVehicleLength;                  
	/**
	 * \if ENGLISH_LANG
	 * snap mode 0-normal,1-globle,2-near,4-snap on the same side,8-snap on the reverse side,16-plant picture
	 * \else
	 * W%ED7=J=	0-N47V@`#,1-H+>0#,2-=|>0#,4-M,OrW%ED#,8-74OrW%ED#,16-:EEFM<Oq
	 * \endif
	 */
	public int                nSnapshotMode;                   
	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * 1>5X;rT63L5DM(5@C{3F#,?IRTJG5X5cPEO"	@4T4SZM(5@1jLbEdVCChannelTitle.Name 
	 * \endif
	 */
	public byte               szChannelName[] = new byte[32];               
	/**
	 * \if ENGLISH_LANG
	 * Machine name
	 * \else
	 * 1>5X;rT63LIh18C{3F	@4T4SZFUM(EdVCGeneral.MachineName
	 * \endif
	 */
	public byte               szMachineName[] = new byte[256];              
	/**
	 * \if ENGLISH_LANG
	 * machine group
	 * \else
	 * ;zFw7VWi;r=PIh18KyJt5%N;	D,HON*?U#,SC;'?IRT=+2;M,5DIh181`N*R;Wi#,1cSZ9\@m#,?IVX84!#
	 * \endif
	 */
	public byte               szMachineGroup[] = new byte[256];             
	/**
	 * \if ENGLISH_LANG
	 * road way number	
	 * \else
	 * 5@B71`:E
	 * \endif
	 */
	public byte               szRoadwayNo[] = new byte[64];                 
	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection: for example ["Approach", "Shanghai", "Hangzhou"]
	 * "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car
	 * the second and third param means the location of the driving direction
	 * \else
     * "DrivingDirection" : ["Approach", "IO:#", ":<V]"],PPJ;7=Or
     * "Approach"-IOPP#,<435A>@kIh182?Jp5cT=@4T==|#;"Leave"-OBPP#,
     * <435A>@kIh182?Jp5cT=@4T=T6#,5Z6~:M5ZH}8v2NJ}7V1p4z1mIOPP:M
     * OBPP5DA=8v5X5c
	 * \endif
	 */
	public byte               szDrivingDirection[][] = new byte[3][FinalVar.SDK_MAX_DRIVINGDIRECTION];    
	/**
	 * \if ENGLISH_LANG
	 * device address,OSD superimposed onto the image,from TrafficSnapshot.DeviceAddress,'\0'means end.
	 * \else
	 * Ih185XV7,OSD5~<S5=M<F,IO5D,@4T4SZEdVCTrafficSnapshot.DeviceAddress,'\0'=aJx
	 * \endif
	 */
	public byte[]             szDeviceAddress;                 
	/**
	 * \if ENGLISH_LANG
	 * Vehicle mark, such as "Unknown"-unknown, "Audi"-Audi, "Honda"-Honda ...
	 * \else
	 * 35A>1jJ6, @}Hg "Unknown"-N4V*, "Audi"-0B5O, "Honda"-1>Lo ...
	 * \endif
	 */
	public byte			   szVehicleSign[] = new byte[32];				
	/**
	 * \if ENGLISH_LANG
	 * Vehicle detector generated snapshot signal redundant info
	 * \else
	 * SI35<lFw2zIzW%EDPE:EH_S`PEO"
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO_EX stuSigInfo = new SDK_SIG_CARWAY_INFO_EX();                   
	/**
	 * \if ENGLISH_LANG
	 * Device allocation location
	 * \else
	 * Ih182?Jp5X5c
	 * \endif
	 */
	public byte[]			   szMachineAddr;					
	/**
	 * \if ENGLISH_LANG
	 * Current picture exposure time#,unit is ms
	 * \else
	 * 51G0M<F,FX9bJ1<d#,5%N;N*:ACk
	 * \endif
	 */
	public float              fActualShutter;                  
	/**
	 * \if ENGLISH_LANG
	 * Current picture gain#,range is 0~100
	 * \else
	 * 51G0M<F,TvRf#,76N'N*0~100
	 * \endif
	 */
	public byte               byActualGain;                    
	/**
	 * \if ENGLISH_LANG
	 * 0-S to N 1-SW to NE 2-W to E 3-NW to SE 4-N to S 5-NE to SW 6-E to W 7-SE to NW 8-Unknown
	 * \else
	 * 0-DOOr11 1-NwDOOr6+11 2-NwOr6+ 3-Nw11Or6+DO 4-11OrDO 5-6+11OrNwDO 6-6+OrNw 7-6+DOOrNw11 8-N4V*
	 * \endif
	 */
	public byte			   byDirection;						
	/**
	 * \if ENGLISH_LANG
	 * Detailed addreaa, as szDeviceAddress compensation
	 * \else
	 * OjO85XV7, WwN*szDeviceAddress5D293d
	 * \endif
	 */
	public byte[]			   szDetailedAddress;				
}

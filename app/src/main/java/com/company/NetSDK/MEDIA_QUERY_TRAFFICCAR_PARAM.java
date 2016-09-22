package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The corresponding search criteria of  SDK_MEDIA_QUERY_TRAFFICCAR
 * \else
 * SDK_MEDIA_QUERY_TRAFFICCAR6TS&5D2iQ/Lu<~
 * \endif
 */
public class MEDIA_QUERY_TRAFFICCAR_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The channel number begins with 0. -1 is to search information of all channels .
	 * \else
	 * M(5@:E4S0?*J<#,-11mJ>2iQ/KySPM(5@
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time 	
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME			StartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME			EndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * File type:0=search any type.1=search jpg file
	 * \else
	 * ND<~@`PM#,0:HNRb@`PM, 1:jpgM<F,, 2:davND<~
	 * \endif
	 */
	public int					nMediaTyp;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type,please refer to Intelligent Analytics Event Type. 0 means search any event. 
	 * \else
	 * JB<~@`PM#,Oj<{"VGD\7VNvJB<~@`PM", 0:1mJ>2iQ/HNRbJB<~#,4K2NJ}7OFz#,GkJ9SCpEventTypes
	 * \endif
	 */
	public int					nEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle plate. "\0" is to search any plate number.
	 * \else
	 * 35EF:E, "\0"Tr1mJ>2iQ/HNRb35EF:E
	 * \endif
	 */
	public char				szPlateNumber[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * The searched vehicle speed range. Max speed unit is km/h
	 * \else
	 * 2iQ/5D35KY76N'; KY6HIOO^ 5%N;: km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * The searched vehicle speed range. Min speed unit is km/h
	 * \else
	 * 2iQ/5D35KY76N'; KY6HOBO^ 5%N;: km/h 
	 * \endif
	 */
	public int					nSpeedLowerLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Search according to the speed or not.  TRUE: search according to the speed.nSpeedUpperLimit and nSpeedLowerLimit is valid.
	 * \else
	 * JG7q04KY6H2iQ/; TRUE:04KY6H2iQ/,nSpeedUpperLimit:MnSpeedLowerLimitSPP'!#
	 * \endif
	 */
	public boolean				bSpeedLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * Illegal type:
	 * When event type is EVENT_IVS_TRAFFICGATE
	 * bit1: Retrograde;   bit2: Overline; 
	 * bit3: Overspend; 	bit4:Under speed; 
	 * bit5: RunRedLight;
	 * When event type is EVENT_IVS_TRAFFICJUNCTION
	 * bit1: RunRedLight;  bit2: WrongLan;  
	 * bit3: Retrograde; 	bit4:UTurn;
	 * bit5: Overline;
	 * </pre>
	 * \else
	 * N%UB@`PM#:
	 * <pre>
	 * 51JB<~@`PMN* EVENT_IVS_TRAFFICGATEJ1
	 * 5ZR;N;:DfPP;  5Z6~N;:Q9O_PPJ;; 5ZH}N;:3,KYPPJ;; 
	 * 5ZKDN;#:G7KYPPJ;; 5ZNeN;:43:l5F;
	 * 51JB<~@`PMN* EVENT_IVS_TRAFFICJUNCTION
	 * 5ZR;N;:43:l5F;  5Z6~N;:2;049f6(355@PPJ;;  
	 * 5ZH}N;:DfPP; 5ZKDN;#:N%UB5tM7;
	 * 5ZNeN;:Q9O_PPJ;;
	 * </pre>
	 * \endif
	 */
	public int					dwBreakingRule;
	
	/**
	 * \if ENGLISH_LANG
	 * Plate type,"Unknown" ,"Normal" ,"Yellow" ,"DoubleYellow" ,"Police" ,"Armed","Military","DoubleMilitary"
	 * ,"SAR", "Trainning", "Personal", "Agri", "Embassy", "Moto", "Tractor", "Other"
	 * \else
 	 * 35EF@`PM#,"Unknown" N4V*,"Normal" @6EF:ZEF,"Yellow" ;FEF,"DoubleYellow" K+2c;FN2EF,"Police" >/EF"Armed" Nd>/EF,
     * "Military" 2?6S:EEF,"DoubleMilitary" 2?6SK+2c,"SAR" 8[0DLXGx:EEF,"Trainning" =LA735:EEF
	 * "Personal" 8vPT:EEF,"Agri" E)SCEF,"Embassy" J99]:EEF,"Moto" D&MP35:EEF,"Tractor" MO@-;z:EEF,"Other" FdK{:EEF
	 * \endif
	 */
	public char                szPlateType[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Plate color, "Blue","Yellow", "White","Black"
	 * \else
	 * 35EFQUI+, "Blue"@6I+,"Yellow";FI+, "White"0WI+,"Black":ZI+
	 * \endif
	 */
	public char                szPlateColor[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 * 35ImQUI+:"White"0WI+, "Black":ZI+, "Red":lI+, "Yellow";FI+, "Gray";RI+, "Blue"@6I+,"Green"BLI+
	 * \endif
	 */
	public char				szVehicleColor[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle type:"Light-duty";"Medium"; "Oversize";"Unknown"
	 * \else
	 * 35A>4sP!@`PM:"Light-duty":P!PM35;"Medium":VPPM35; "Oversize":4sPM35; "Unknown": N4V*
	 * \endif
	 */
	public char				szVehicleSize[] = new char[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Id of event group(it works when >= 0)
	 * \else
	 * JB<~Wi1`:E(4KV5>=0J1SPP')
	 * \endif
	 */
	public int                 nGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Lane number(it works when >= 0)
	 * \else
	 * 355@:E(4KV5>=0J11mJ>>_Le355@#,-11mJ>KySP355@#,<42;OB7"4KWV6N)
	 * \endif
	 */
	public short               byLane;
	
	/**
	 * \if ENGLISH_LANG
	 * File flag, 0xFF-use nFileFlagEx, 0-all record, 1-timing file, 2-manual, 3-event, 4-important, 5-mosaic
	 * \else
	 * ND<~1jV>, 0xFF-J9SCnFileFlagEx, 0-1mJ>KySPB<Oq, 1-6(J1ND<~, 2-JV6/ND<~, 3-JB<~ND<~, 4-VXR*ND<~, 5-:O3IND<~
	 * \endif
	 */
	public byte				byFileFlag;
	
	/**
	 * \if ENGLISH_LANG
	 * During search, it goes to other page#,0-No#,1-Yes
	 * \else
	 * JG7qPhR*TZ2iQ/9}3LVPKfRbLxW*#,0-2;PhR*#,1-PhR*
	 * \endif
	 */
	public byte				byRandomAccess;
	
	/**
	 * \if ENGLISH_LANG
	 * File flag, bit0-timing, bit1-manual, bit2-event, bit3-important, bit4-mosaic, 0xFFFFFFFF-all
	 * \else
	 * ND<~1jV>, 04N;1mJ>: bit0-6(J1ND<~, bit1-JV6/ND<~, bit2-JB<~ND<~, bit3-VXR*ND<~, bit4-:O3IND<~, bit5-:ZC{5%M<F, 0xFFFFFFFF-KySPB<Oq
	 * \endif
	 */
	public int					nFileFlagEx;
	
	/**
	 * \if ENGLISH_LANG
	 * Direction(to the direction of car)	0-north 1-northeast 2-east 3-southeast 4-south 5-southwest 6-west 7-northwest 8-unknown -1-all directions
	 * \else
	 * 355@7=Or#(35?*My5D7=Or#)	0-11 1-6+11 2-6+ 3-6+DO 4-DO 5-NwDO 6-Nw 7-Nw11 8-N4V* -1-KySP7=Or
	 * \endif
	 */
	public int					nDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Working directory list,can inquire multiple directory at a atime,separated by ";",example "/mnt/dvr/sda0;/mnt/dvr/sda1",if szDirs==null or szDirs == "" ,means search all
	 * \else
	 * 9$WwD?B<AP1m,R;4N?I2iQ/6`8vD?B<,N*?U1mJ>2iQ/KySPD?B<!#D?B<V.<dRT7V:E7V8t#,Hg!0/mnt/dvr/sda0;/mnt/dvr/sda1!1,szDirs==null ;r"" 1mJ>2iQ/KySP
	 * \endif
	 */
	public String              szDirs;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type to search group indicator,event type, see"IVS analysis event type"#,if as NULL then search all events#(buffer shall be applied by user#)
	 * \else
	 * 4}2iQ/5DJB<~@`PMJ}WiV8Uk,JB<~@`PM,Oj<{"VGD\7VNvJB<~@`PM"#,HtN*NULLTrHON*2iQ/KySPJB<~#(;:3ePhSISC;'IjGk#)
	 * \endif
	 */
	public int                 pEventTypes[];
	
	/**
	 * \if ENGLISH_LANG
	 * Event type group size
	 * \else
	 * JB<~@`PMJ}Wi4sP!
	 * \endif
	 */
	public int                 nEventTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Device address, NULL means field no use
	 * \else
	 * Ih185XV7, NULL1mJ>8CWV6N2;FpWwSC
	 * \endif
	 */
	public String				pszDeviceAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Device deploy location, NULL means field no use
	 * \else
	 * ;zFw2?Jp5X5c, NULL1mJ>8CWV6N2;FpWwSC
	 * \endif
	 */
	public String				pszMachineAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle mark, such as "Unknown"-unknown, "Audi"-Audi, "Honda"-Honda... NULL means field no use
	 * \else
	 * 35A>1jJ6, @}Hg "Unknown"-N4V*, "Audi"-0B5O, "Honda"-1>Lo... NULL1mJ>8CWV6N2;FpWwSC
	 * \endif
	 */
	public String				pszVehicleSign;
	
	public MEDIA_QUERY_TRAFFICCAR_PARAM(int nEventNum) {
		nEventTypeNum = nEventNum;
		pEventTypes = new int[nEventTypeNum];
	}
}

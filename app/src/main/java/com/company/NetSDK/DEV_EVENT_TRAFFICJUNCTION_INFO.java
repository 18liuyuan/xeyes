package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of EVENT_IVS_TRAFFICJUNCTION's data
 * \else
 * JB<~@`PMEVENT_IVS_TRAFFICJUNCTION(=;M(B7?ZJB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFICJUNCTION_INFO implements Serializable {
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
	 * Have being detected object
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: crash red light; 
	 * secend byte:break the rule of driving road number; 
	 * the third byte:converse; the forth byte:break rule to turn around;
	 * the five byte:traffic jam; the six byte:traffic vacancy; 
	 * the seven byte: Overline; defalt:trafficJunction    
	 * </pre>
	 * \else
	 * <pre>
  	 * N%749fTrQZBk,5ZR;N;:43:l5F; 
     * 5Z6~N;:2;049f6(355@PPJ;;
     * 5ZH}N;:DfPP; 5ZKDN;#:N%UB5tM7;
	 * 5ZNeN;:=;M(6BH{; 5ZAyN;:=;M(Rl3#?UOP
     * 5ZF_N;:Q9O_PPJ;; 7qTrD,HON*:=;M(B7?ZJB<~
     * </pre>
	 * \endif
	 */
	public int				dwBreakingRule;
	
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
	 * Event file info
	 * \else
	 * JB<~6TS&ND<~PEO"
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  	stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 1mJ>W%EDPr:E#,Hg3,2,1,11mJ>W%ED=aJx,01mJ>Rl3#=aJx
	 * \endif
	 */
	public int                 	nSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Car's speed (km/h)
	 * \else
	 * 6K35A>J5<JKY6HKm/h  
	 * \endif
	 */
	public int                 	nSpeed;
	
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
	 * Picture no.,, within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info
	 * \else
	 * 35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT       	stuVehicle = new SDK_MSG_OBJECT();
	
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
	public SDK_RESOLUTION_INFO 	stuResolution = new SDK_RESOLUTION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/6TS&5DT-J<B<OqND<~PEO"
	 * \endif
	 */
	public byte                	szRecordFile[] = new byte[FinalVar.SDK_COMMON_STRING_128];
	
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
	 * Card quantity
	 * \else
	 * ?(F,8vJ}
	 * \endif
	 */
	public int               	dwRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ?(F,PEO"
	 * \endif
	 */
    public EVENT_CARD_INFO     	stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];
    
    public byte 				byDirection;
    public byte					byLightState;
    
    public DEV_EVENT_TRAFFICJUNCTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
    }
}

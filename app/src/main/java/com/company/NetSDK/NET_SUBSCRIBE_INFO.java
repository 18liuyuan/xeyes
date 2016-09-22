package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Subscription type
 * \else
 * 6)TD@`PM
 * \endif
 */
public class NET_SUBSCRIBE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Event code
	 * \else
	 * JB<~Bk
	 * \endif
	 */
	public int                             nCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Event sub-types, EM_EVENT_SUB_CODE_UNKNOWN as invalid
	 * Effective only VideoAbnormalDetection, alarmLocal and other alarm events include a variety of types 
	 * \else
	 * JB<~WS@`PM EM_EVENT_SUB_CODE, EM_EVENT_SUB_CODE_UNKNOWNN*N^P'
	 * =v6TVideoAbnormalDetection,AlarmLocal5H0|:,6`VV@`PM5D1(>/JB<~SPP'
	 * \endif
	 */
	public int                             emSubCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscribe to the number of channels, without channel concept is 0
	 * \else
	 * 6)TD5DM(5@J}A?, HtN^M(5@8EDnTrN*0
	 * \endif
	 */
    public int                             nChnNum;
    
    /**
     * \if ENGLISH_LANG
     * Channel number collection
     * \else
     * M(5@:E</:O
     * \endif
     */
    public int                             nIndexs[] = new int[FinalVar.MAX_MOBILE_CHANNEL_NUM];
    
    /**
     * \if ENGLISH_LANG
     * phone number for no answered
     * Event is effective when to subscribe to "CallNoAnswered" 
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFG is valid
     * \else
     * N^S&4p:EBk#(Ih18:t=PUbP):EBk#,N^S&4pJ1#,=+OrJV;zMFKMO{O"#)
     * 6)TD"CallNoAnswered "JB<~J1SPP'
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFGJ1SPP'
     * \endif
     */
    public byte                            szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_16];
    
    public byte                            szSound[] = new byte[FinalVar.SDK_COMMON_STRING_64];
}

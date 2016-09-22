package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Input parameter about the status informations of subscribe to video phone
 * \else
 * 6)TDJSF55g;0W4L,PEO" JdHk2NJ}
 * \endif
 */
public class NET_IN_VTP_CALL_STATE_ATTACH implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The call type for checking, EM_NET_VTP_CALL_TYPE
	 * \else
	 * 4}2iQ/5D:t=P@`PM, EM_NET_VTP_CALL_TYPE
	 * \endif
	 */
    public int        emCallType; 
    
    /**
     * \if ENGLISH_LANG
     * The device ID for forward, NULL means not formard
     * \else
     * W*7"D?1jIh18ID,N*NULL1mJ>2;W*7"
     * \endif
     */
    public String     szTargetID; 
}

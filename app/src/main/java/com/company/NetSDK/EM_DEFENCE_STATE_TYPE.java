package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Type
 * \else
 * 7@GxW4L,@`PM
 * \endif
 */
public class EM_DEFENCE_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * N4V*
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_UNKNOWN  = 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * ETB7
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_BYPASS   = 1 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Open, for alarm under disarming
	 * \else
	 * 4r?*, V8377@Gi?vOB7"Iz1(>/
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_OPEN     = 2 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Close
	 * \else
	 * 9X1U
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_CLOSE    = 3 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Alarm, for alarm under arming
	 * \else
	 * 1(>/, V82<7@Gi?vOB7"Iz1(>/
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_ALARMING = 4 ; 
}

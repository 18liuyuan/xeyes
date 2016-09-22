package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Failure Type
 * \else
 * 9JUO@`PM
 * \endif
 */
public class EM_ALARM_FAULT_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All Types
	 * \else
	 * KySP@`PM
	 * \endif
	 */
    public static final int EM_ALARM_FAULT_STATE_ALL = 0;
    
    /**
     * \if ENGLISH_LANG
     * Connection Failure
     * \else
     * A,=S9JUO
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_CONNECTFAULT = 1; 
    
    /**
     * \if ENGLISH_LANG
     * Bell Failure
     * \else
     * >/:E9JUO
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_BELLFAULT = 2; 
    
    /**
     * \if ENGLISH_LANG
     * Keyboard Failure
     * \else
     * <|EL9JUO
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_KBFAULT = 3; 
    
    /**
     * \if ENGLISH_LANG
     * Keyboard Vandal-proof
     * \else
     * <|EL7@2p
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_KBTAMPER = 4; 
    
    /**
     * \if ENGLISH_LANG
     * Sensor Short circuit
     * \else
     * 4+8PFw6LB7
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_SENSORSHORTOUT = 5; 
    
    /**
     * \if ENGLISH_LANG
     * Sensor Vandal-proof
     * \else
     * 4+8PFw7@2p
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_SENSORTAMPER = 6;
}

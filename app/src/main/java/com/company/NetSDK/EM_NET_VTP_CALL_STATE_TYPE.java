package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video phone call
 * \else
 * JSF55g;0:t=PW4L,@`PM
 * \endif
 */
public class EM_NET_VTP_CALL_STATE_TYPE implements Serializable {
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
	public final static int EM_NET_VTP_CALL_STATE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial State
	 * \else
	 * 3uJ<W4L,
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_IDLE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling(the opposite side not response)
	 * \else
	 * Vw=P:t=PW4L,(6T7=N4;XS&)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLING = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of called
	 * \else
	 * 1;=P:t=PW4L,
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLED = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling back (the opposite side responsed but no answer)
	 * \else
	 * Vw=P;XAeW4L,(6T7=;XS&, 5+C;SP=SL})
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_RINGING = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of answering 
	 * \else
	 * M(;0VPW4L,
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING = 5; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2 states in the call 
	 * \else
	 * M(;0VP2W4L,(M(;0C=Le1d8|:s5DM(;0VPW4L,)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING2 = 6; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of call off
	 * \else
	 * M(;09R6OW4L,
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_DISCONNECT = 7; 
}

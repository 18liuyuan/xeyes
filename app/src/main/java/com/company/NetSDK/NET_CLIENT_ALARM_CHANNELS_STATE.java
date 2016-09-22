package com.company.NetSDK;

import java.io.Serializable;

public class NET_CLIENT_ALARM_CHANNELS_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The type of query alarm channel, NET_ALARM_CHANNEL_TYPE
	 * \else
	 * 2iQ/1(>/M(5@5D@`PM, NET_ALARM_CHANNEL_TYPE
	 * \endif
	 */
	public int                         emType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input number, specified by the user 
	 * \else
	 * 1(>/JdHk8vJ}#,SISC;'V86(
	 * \endif
	 */
	public int                         nAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of returned alarm input 
	 * \else
	 * 1(>/JdHk8vJ}#,SISC;'V86(
	 * \endif
	 */
	public int                         nAlarmInRetCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm state of input arrays, memory allocated by the user, each element represents a channel status, TRUE for input, FALSE for no input 
	 * \else
	 * 1(>/JdHkW4L,J}Wi#,SISC;'7VEdDZ4f#,C?8vT*KX1mJ>R;8vM(5@W4L,,TRUEN*SPJdHk,FALSEN*N^JdHk
	 * \endif
	 */
	public boolean                     pbAlarmInState[];
	
	/**
	 * \if ENGLISH_LANG
	 * The number of alarm output,specified by the user 
	 * \else
	 * 1(>/Jd3v8vJ}#,SISC;'V86(
	 * \endif
	 */
    public int                         nAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of alarm output 
     * \else
     * 1(>/Jd3v8vJ}
     * \endif
     */
    public int                         nAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state of output arrays, memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * 1(>/Jd3vW4L,J}Wi#,SISC;'7VEdDZ4f#,C?8vT*KX1mJ>R;8vM(5@W4L,,TRUEN*SPJd3v,FALSEN*Jd3v
     * \endif
     */
    public boolean                     pbAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * Alarm Number,specified by the user 
     * \else
     * >/:E8vJ}#,SISC;'V86(
     * \endif
     */
    public int                         nAlarmBellCount;
    
    /**
     * \if ENGLISH_LANG
     * Returned Alarm Number 
     * \else
     * >/:E75;X8vJ}
     * \endif
     */
    public int                         nAlarmBellRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state array, allocate memory by the user, each element represents a channel status, TRUE for output, FALSE for no output
     * \else
     * >/:EW4L,J}Wi#,SISC;'7VEdDZ4f#,C?8vT*KX1mJ>R;8vM(5@W4L,,TRUEN*SPJd3v,FALSEN*N^Jd3v
     * \endif
     */
    public boolean                     pbAlarmBellState[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input number, specified by the user 
     * \else
     * @)U9D#?i1(>/JdHk8vJ}#,SISC;'V86(
     * \endif
     */
    public int                         nExAlarmInCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of returned extension module alarm input 
     * \else
     * @)U9D#?i1(>/JdHk75;X8vJ}
     * \endif
     */
    public int                         nExAlarmInRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input state array#,Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * @)U9D#?i1(>/JdHkW4L,J}Wi#,SISC;'7VEdDZ4f#,C?8vT*KX1mJ>R;8vM(5@W4L,,TRUEN*SPJd3v,FALSEN*N^Jd3v
     * \endif
     */
    public boolean                     pbExAlarmInState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm input effective channels 
     * \else
     * @)U9D#?i1(>/JdHkSPP'M(5@5DN;VC
     * \endif
     */
    public int                         pnExAlarmInDestionation[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number, specified by the user
     * \else
     * @)U9D#?i1(>/Jd3v8vJ}#,SISC;'V86(
     * \endif
     */
    public int                         nExAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number 
     * \else
     * @)U9D#?i1(>/Jd3v8vJ}
     * \endif
     */
    public int                         nExAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output state array#,Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * @)U9D#?i1(>/Jd3vW4L,J}Wi#,SISC;'7VEdDZ4f#,C?8vT*KX1mJ>R;8vM(5@W4L,,TRUEN*SPJd3v,FALSEN*N^Jd3v
     * \endif
     */
    public boolean                     pbExAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm output effective channels
     * \else
     * @)U9D#?i1(>/Jd3vSPP'M(5@5DN;VC
     * \endif
     */
    public int                         pnExAlarmOutDestionation[];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio talk_speak param
 * \else
 * SoRt6T=2:0;02NJ}	
 * \endif
 */
public class NET_SPEAK_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:talk back(default), 1: propaganda,from propaganda ro talk back,need afresh to configure
	 * \else
	 * 0#:6T=2#(D,HOD#J=#)#,1#::0;0#;4S:0;0GP;;5=6T=2R*VXPBIhVC
	 * \endif
	 */
	public int             nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Reproducer channel
	 * \else
	 * QoIyFwM(5@:E#,:0;0J1SPP'
	 * \endif
	 */
	public int             nSpeakerChannel;      
	
	/**
	 * 
	 * 
	 */
	public int 			   nEnableWait;
}

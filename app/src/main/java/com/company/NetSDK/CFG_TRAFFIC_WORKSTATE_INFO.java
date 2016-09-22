package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Working State
 * \else
 * Ih189$WwW4L,PEO"
 * \endif
 */
public class CFG_TRAFFIC_WORKSTATE_INFO implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int						nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types, CFG_TRAFFIC_SNAP_MODE
	 * \else
	 * W%EDD#J=, CFG_TRAFFIC_SNAP_MODE
	 * \endif
	 */
	public int                  	emSnapMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Match Mode: 0-Non-realtime#,; 1-Realtime
	 * \else
	 * W%EDF%EdD#J=: 0-7GJ5J1F%Ed7=J=#,OH1(>/:sW%ED#,W%EDV!2;JG1(>/V!;  1-J5J1F%EdD#J=#,1(>/V!:MW%EDV!JGM,R;V! 
	 * \endif
	 */
	public int						nMatchMode;
}

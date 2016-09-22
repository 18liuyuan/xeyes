package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Change Event Info
 * \else
 * ETB7W4L,1d;/JB<~5DPEO"
 * \endif
 */
public class ALARM_BYPASSMODE_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                     nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME                stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Armed Zone Type {@link com.company.NetSDK.NET_DEFENCEAREA_TYPE NET_DEFENCEAREA_TYPE}
	 * \else
	 * 7@Gx@`PM {@link com.company.NetSDK.NET_DEFENCEAREA_TYPE NET_DEFENCEAREA_TYPE}
	 * \endif
	 */
	public int                     emDefenceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether as extension (channel) armed zone or not, 1: extension channel, 0: non-extension channel
	 * \else
	 * JG7qN*@)U9(M(5@)7@Gx, 1:@)U9M(5@, 0: 7G@)U9M(5@
	 * \endif
	 */
	public int                     nIsExtend;
	
	/**
	 * \if ENGLISH_LANG
	 * Mode After Change {@link com.company.NetSDK.NET_BYPASS_MODE NET_BYPASS_MODE}
	 * \else
	 * 1d;/:s5DD#J= {@link com.company.NetSDK.NET_BYPASS_MODE NET_BYPASS_MODE}
	 * \endif
	 */
	public int                    emMode;
	
	/**
	 * \if ENGLISH_LANG
	 * ID number, remote control number or keypad address, emTriggerMode=0 when belong to NET_EM_TRIGGER_MODE_NET
	 * \else
	 * ID:E, R#?XFw1`:E;r<|EL5XV7, emTriggerModeN*NET_EM_TRIGGER_MODE_NET@`PMJ1N*0
	 * \endif
	 */
	public int                     dwID; 
	
	/**
	 * \if ENGLISH_LANG
	 * trigger mode, NET_EM_TRIGGER_MODE
	 * \else
	 * 4%7"7=J=, NET_EM_TRIGGER_MODE
	 * \endif
	 */
	public int                     emTriggerMode; 
}

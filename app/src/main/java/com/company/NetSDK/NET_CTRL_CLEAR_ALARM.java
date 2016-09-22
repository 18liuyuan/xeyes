package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_CLEAR_ALARM
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_CLEAR_ALARM C|An2NJ}
 * \endif
 */
public class NET_CTRL_CLEAR_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Defence Area's ID
	 * \else
	 * 7@GxM(5@:E
	 * \endif
	 */
	public int		nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Type
	 * \else
	 * JB<~@`PM
	 * \endif
	 */
	public int		emAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Landing Equipment Such As Password, Do not Use Encryption Disappear the Police, Direct Assignment of NULL
	 * \else
	 * 5GB=Ih185DC\Bk,Hg2;J9SC<SC\O{>/,V1=S83V5N*NULL
	 * \endif
	 */
	public String	szDevPwd;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall output channel info
 * \else
 * 5gJSG=
 * \endif
 */
public class AV_CFG_MonitorWallTVOut implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID. It is "null" or "Local"(local device)
	 * \else
	 * Ih18ID, N*?U;r"Local"1mJ>1>5XIh18
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * M(5@ID
	 * \endif
	 */
	public int		nChannelID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Screen name
	 * \else
	 * FAD;C{3F
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];

}

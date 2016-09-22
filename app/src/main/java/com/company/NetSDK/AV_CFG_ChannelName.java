package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel Name Structure
 * \else
 * M(5@C{3F
 * \endif
 */
public class AV_CFG_ChannelName implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera Unique Number 
	 * \else
	 * IcOqM7N(R;1`:E 
	 * \endif
	 */
	public int				nSerial;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * M(5@C{
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.AV_CFG_Channel_Name_Len];
}

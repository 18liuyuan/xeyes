package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * available according to the source of information
 * \else
 * ?ISC5DOTJ>T4PEO"
 * \endif
 */
public class SDK_MATRIX_CAMERA_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public byte                szDevID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * ?XVFID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * channel ID, DeviceID is unique
	 * \else
	 * M(5@:E, DeviceIDIh18DZN(R;
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * unique channel
	 * \else
	 * Ih18DZM3R;1`:E5DN(R;M(5@:E
	 * \endif
	 */
	public int                 nUniqueChannel;

	/**
	 * \if ENGLISH_LANG
	 * support remote device or not
	 * \else
	 * JG7qT63LIh18
	 * \endif
	 */
	public boolean                bRemoteDevice;

	/**
	 * \if ENGLISH_LANG
	 * info of remote device
	 * \else
	 * T63LIh18PEO"
	 * \endif
	 */
	public SDK_REMOTE_DEVICE    stuRemoteDevice;
	
	/**
	 * \if ENGLISH_LANG
	 * stream type, NET_STREAM_TYPE
	 * \else
	 * JSF5BkAw@`PM, NET_STREAM_TYPE
	 * \endif
	 */
	public int                 emStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Types, NET_LOGIC_CHN_TYPE
	 * \else
	 * M(5@@`PM, NET_LOGIC_CHN_TYPE
	 * \endif
	 */
	public int                 emChannelType;
	
	public SDK_MATRIX_CAMERA_INFO()
	{
		 stuRemoteDevice = new SDK_REMOTE_DEVICE();
	}
	
	public SDK_MATRIX_CAMERA_INFO(int nMaxVideoInputCount)
	{
		if(nMaxVideoInputCount > 0)
		{
			stuRemoteDevice = new SDK_REMOTE_DEVICE(nMaxVideoInputCount);
		}
	}
	
}

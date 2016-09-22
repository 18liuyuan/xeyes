package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search log parameter
 * \else
 * 2iQ/HUV>2NJ}
 * \endif
 */
public class QUERY_DEVICE_LOG_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Searched log type ,enumeration value, as: SDK_LOG_QUERY_TYPE
	 * \else
	 * 2iQ/HUV>@`PM, C6>YV5#,<{SDK_LOG_QUERY_TYPE
	 * \endif
	 */
	public int					emLogType;
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log start time
	 * \else
	 * 2iQ/HUV>5D?*J<J1<d
	 * \endif
	 */
	public NET_TIME			stuStartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log end time.
	 * \else
	 * 2iQ/HUV>5D=aJxJ1<d
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The search begins from which log in one period. It shall begin with 0 if it is the first time search.
	 * \else
	 * TZJ1<d6NVP4S5Z<8LuHUV>?*J<2iQ/#,?*J<5ZR;4N2iQ/?IIhN*0
	 * \endif
	 */
	public int					nStartNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The ended log serial number in one search,the max returning number is 1024 
	 * \else
	 * R;4N2iQ/VP5=5Z<8LuHUV>=aJx,HUV>75;XLuJ}5DWn4sV5N*1024
	 * \endif
	 */
	public int					nEndNum;
	
	/**
	 * \if ENGLISH_LANG
	 * log struct type,0:SDK_DEVICE_LOG_ITEM;1: SDK_DEVICE_LOG_ITEM_EX
	 * \else
	 * HUV>J}>]=a99Le@`PM,0:1mJ>DH_DEVICE_LOG_ITEM#;1:1mJ> SDK_DEVICE_LOG_ITEM_EX
	 * \endif
	 */
	public byte                nLogStuType;
            
	/**
	 * \if ENGLISH_LANG
	 * Channel no. 0:Compatible with previous all channel numbers. The channel No. begins with 1.1: The first channel.
	 * \else
	 * M(5@:E,0:<fH]V.G01mJ>KySPM(5@:E#,KyRTM(5@:E4S1?*J<; 1:5ZR;8vM(5@
	 * \endif
	 */
	public int        			nChannelID;
}

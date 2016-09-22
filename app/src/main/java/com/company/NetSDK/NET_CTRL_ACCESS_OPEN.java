package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_ACCESS_OPEN
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_ACCESS_OPEN C|An2NJ}
 * \endif
 */
public class NET_CTRL_ACCESS_OPEN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID (start from 0) 
	 * \else
	 * M(5@:E(0?*J<)
	 * \endif
	 */
	public int					nChannelID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Target ID, NULL equals to not transmit
	 * \else
	 * W*7"D?1jIh18ID,N*NULL1mJ>2;W*7"
	 * \endif
	 */
    public String               szTargetID;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice's param: SDK_CTRL_SET_BYPASS 
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_SET_BYPASS C|An2NJ}
 * \endif
 */
public class NET_CTRL_SET_BYPASS implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Login Device Password
	 * \else
	 * 5GHkIh185DC\Bk
	 * \endif
	 */
	public String				szDevPwd; 
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Statue, NET_BYPASS_MODE
	 * \else
	 * M(5@W4L,, NET_BYPASS_MODE
	 * \endif
	 */
	public int					emMode; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channnel Number
	 * \else
	 * 1>5X1(>/JdHkM(5@8vJ}
	 * \endif
	 */
	public int					nLocalCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channnel ID 
	 * \else
	 * 1>5X1(>/JdHkM(5@:E
	 * \endif
	 */
	public int					pnLocal[]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Number
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@8vJ}
	 * \endif
	 */
	public int					nExtendedCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel ID
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@:E
	 * \endif
	 */
	public int					pnExtended[]; 
}

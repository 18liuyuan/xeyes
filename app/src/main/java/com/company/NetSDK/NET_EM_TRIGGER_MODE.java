package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * trigger mode
 * \else
 * 4%7"7=J=
 * \endif
 */
public class NET_EM_TRIGGER_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int NET_EM_TRIGGER_MODE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Network user(Platform;rWeb)
	 * \else
	 * MxBgSC;'(F=L(;rWeb)
	 * \endif
	 */
	public static final int	NET_EM_TRIGGER_MODE_NET = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * keyboard
	 * \else
	 * <|EL
	 * \endif
	 */
	public static final int NET_EM_TRIGGER_MODE_KEYBOARD = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * remote control
	 * \else
	 * R#?XFw
	 * \endif
	 */
	public static final int NET_EM_TRIGGER_MODE_REMOTECONTROL = 3; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm and disarm control
 * \else
 * 1(>/2<377@?XVF, INetSDK.ControlDevice(SDK_CTRL_ARMED)
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm state, 0 means disarm, 1 means arm, 2 means forced arm
	 * \else
	 * 2<377@W4L,#,01mJ>377@#,11mJ>2<7@#,21mJ>G?VF2<7@
	 * \endif
	 */
	public byte             bState; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's Password
	 * \else
	 * SC;'C\Bk
	 * \endif
	 */
	public String			szDevPwd; 
	
	/**
	 * \if ENGLISH_LANG
	 * Contextual Mode, NET_SCENE_MODE
	 * \else
	 * Gi>0D#J=, NET_SCENE_MODE
	 * \endif
	 */
	public int 	            emSceneMode; 
	
	/**
	 * \if ENGLISH_LANG
	 * Forwarding the Target Device ID,Null=Non Forward
	 * \else
	 * W*7"D?1jIh18ID,N*NULL1mJ>2;W*7"
	 * \endif
	 */
	public String			szDevID; 
}

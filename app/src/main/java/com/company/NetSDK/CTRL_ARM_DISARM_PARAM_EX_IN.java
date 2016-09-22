package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion input parameter
 * \else
 * 1(>/2<377@?XVF@)U9JdHk2NJ}
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_IN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm/disarm status, NET_ALARM_MODE
	 * \else
	 * 2<377@W4L,, NET_ALARM_MODE
	 * \endif
	 */
	public int      emState; 
	
	/**
	 * \if ENGLISH_LANG
	 * user password
	 * \else
	 * SC;'C\Bk
	 * \endif
	 */
    public String         szDevPwd; 
    
    /**
     * \if ENGLISH_LANG
     * scene mode, NET_SCENE_MODE
     * \else
     * Gi>0D#J=, NET_SCENE_MODE
     * \endif
     */
    public int      emSceneMode; 
    
    /**
     * \if ENGLISH_LANG
     * transfer target device ID, as NULL means not transfer
     * \else
     * W*7"D?1jIh18ID,N*NULL1mJ>2;W*7"
     * \endif
     */
    public String         szDevID; 
}

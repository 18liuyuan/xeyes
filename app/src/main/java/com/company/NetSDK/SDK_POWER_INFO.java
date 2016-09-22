package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power info
 * \else
 * 5gT4W4L,
 * \endif
 */
public class SDK_POWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Power is on or not
	 * \else
	 * 5gT4W4L,, 0-9X1U, 1-4r?*, 2-4r?*5+SP9JUO
	 * \endif
	 */
	 public boolean                bPowerOn; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * power current status
	 * \else
	 * 5gT45gAwW4L, , EM_CURRENT_STATE_TYPE
	 * \endif
	 */
	 public int  emCurrentState;            
}

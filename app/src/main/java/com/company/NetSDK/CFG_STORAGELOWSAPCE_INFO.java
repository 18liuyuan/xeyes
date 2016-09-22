package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Limit HDD Alarm Linkage Configuration
 * \else
 * 4f4"Ih18?U<d2;Wc1(>/EdVC
 * \endif
 */
public class CFG_STORAGELOWSAPCE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Lower Limit, Percentage(0~99) 
	 * \else
	 * S2ELJ#S`H]A?OBO^#,0Y7VJ}(0~99)
	 * \endif
	 */
	public int					nLowerLimit;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler 
	 * \else
	 * 1(>/A*6/	
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
}

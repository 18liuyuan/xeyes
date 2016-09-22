package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VIDEO LOST  
 * \else
 * JSF56*J'1(>/EdVC 
 * \endif
 */
public class CFG_VIDEOLOST_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * ChannelID(from 0)  
	 * \else
	 * 1(>/M(5@:E(0?*J<), nVersion=1J1#,4KWV6NN^P'
	 * \endif
	 */
	public int					 nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				 bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler  
	 * \else
	 * J91(>/A*6/
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Respond Period  
	 * \else
	 * JB<~OlS&J1<d6N
	 * \endif
	 */
	public CFG_TIME_SECTION	 	stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_VIDEOLOST_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
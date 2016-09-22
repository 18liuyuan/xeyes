package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Tampering Configuration 
 * \else
 * JSF5UZ521(>/EdVC
 * \endif
 */
public class CFG_SHELTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID1~Maximum Number of Channels	
	 * \else
	 * 1(>/M(5@:E(0?*J<)
	 * \endif
	 */
	public int					nChannelID;									

	/**
	 * \if ENGLISH_LANG
	 * Occlusion Detection Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;									

	/**
	 * \if ENGLISH_LANG
	 * level of sensitivity 1~6#,Min 1#,Max 6
	 * \else
	 * AiCt6H
	 * \endif
	 */
	public int					nSenseLevel;								

	/**
	 * \if ENGLISH_LANG
	 * Event Handler 
	 * \else
	 * 1(>/A*6/
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
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_SHELTER_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}

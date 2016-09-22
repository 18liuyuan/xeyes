package com.company.NetSDK;

import java.io.Serializable;

public class CFG_SCENE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * emCFG_SCENE_MODE
	 * \else
	 * emCFG_SCENE_MODE
	 * \endif
	 */
	public int               emName;							// D#J=C{
	public int				 nAlarmInChannelsCount;				// 1(>/M(5@8vJ}
	public int				 nRetAlarmInChannelsCount;			// J5<J75;X5D1(>/M(5@8vJ}
	public int   			 pnAlarmInChannels[];					// FtSC5D1(>/JdHkM(5@:EAP1m#,PhSC;'7VEdDZ4f
	
	public CFG_SCENE_INFO(int alarmInChnNum) {
		nAlarmInChannelsCount = alarmInChnNum;
		pnAlarmInChannels = new int[alarmInChnNum];
	}
}

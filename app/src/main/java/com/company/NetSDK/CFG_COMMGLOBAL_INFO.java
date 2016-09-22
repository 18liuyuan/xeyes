package com.company.NetSDK;

import java.io.Serializable;

public class CFG_COMMGLOBAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean				bEnable;								// TRUE: 2<7@; FALSE: 377@; WwSCSZU{L(Ih18#,2;Gx7VM(5@
	public boolean				bSceneEnable;							// JG7qFtSCGi>0D#J=
	
	/**
	 * \if ENGLISH_LANG
	 * emCFG_SCENE_MODE
	 * \else
	 * emCFG_SCENE_MODE
	 * \endif
	 */
	public int              	emCurrentScene;							// 51G0Q!Tq5DGi>0D#J=
	public int					nSceneCount;							// Gi>0D#J=SPP'8vJ}
	public CFG_SCENE_INFO		stuScense[] = new CFG_SCENE_INFO[FinalVar.MAX_SCENE_COUNT];			// Gi>0D#J=6(Re#,C?8vD#J=6TS&R;8vEdVC
	
	public CFG_COMMGLOBAL_INFO(int alarmInChnNum) {
		for (int i = 0; i < FinalVar.MAX_SCENE_COUNT; i++) {
			stuScense[i] = new CFG_SCENE_INFO(alarmInChnNum);
		}
	}
}

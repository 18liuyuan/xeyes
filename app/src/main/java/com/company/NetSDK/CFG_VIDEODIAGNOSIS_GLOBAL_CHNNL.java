package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video diagnosis global list(CFG_CMD_VIDEODIAGNOSIS_GLOBAL), each channel supports one diagnosis config 
 * \else
 * JSF5Uo6OH+>V1m(CFG_CMD_VIDEODIAGNOSIS_GLOBAL),C?8vM(5@V'3VR;8vUo6OEdVC 
 * \endif
 */
public class CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Plan name is valid or not 
	 * \else
	 * <F;.C{3FJG7qSPP' 
	 * \endif
	 */
	public boolean					abProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Plan name#,Ansi code
	 * \else
	 * <F;.C{3F#,Ansi1`Bk
	 * \endif
	 */
	public byte[]					szProjectName = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name is valid or not
	 * \else
	 * J5J1<F;.C{3FJG7qSPP'
	 * \endif
	 */
	public boolean					abRealProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name#,Ansi code
	 * \else
	 * J5J1<F;.C{3F#,Ansi1`Bk
	 * \endif
	 */
	public byte[]					szRealProjectName = new byte[FinalVar.MAX_PATH];
}

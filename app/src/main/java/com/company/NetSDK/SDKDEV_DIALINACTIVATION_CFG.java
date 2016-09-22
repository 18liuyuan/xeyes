package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Dailing triggers the wireless connection)
 * \else
 * (2&:E<$;nN^O_A,=SEdVC)
 * \endif
 */
public class SDKDEV_DIALINACTIVATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public int               dwEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * Sender amount
	 * \else
	 * 7"KMU_8vJ}
	 * \endif
	 */
	public int               dwCallerNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone
	 * \else
	 * 7"KMU_, R;0cN*JV;z:EBk
	 * \endif
	 */
	public byte              SZCaller[][] = new byte[FinalVar.SDK_MMS_DIALINACTIVATION_NUM][32];
}

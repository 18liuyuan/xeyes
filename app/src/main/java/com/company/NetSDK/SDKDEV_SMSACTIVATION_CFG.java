package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Message triggers wireless connection configuration)
 * \else
 * (6LPE<$;nN^O_A,=SEdVC)
 * \endif
 */
public class SDKDEV_SMSACTIVATION_CFG implements Serializable {
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
	 * 6LPE7"KMU_8vJ}
	 * \endif
	 */
	public int               dwSenderNum;

	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone number
	 * \else
	 * 6LPE7"KMU_#,R;0cN*JV;z:EBk
	 * \endif
	 */
	public byte              SZSender[][] = new byte[FinalVar.SDK_MMS_SMSACTIVATION_NUM][32];
}

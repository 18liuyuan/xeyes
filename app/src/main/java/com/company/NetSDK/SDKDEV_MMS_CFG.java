package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * According to the mobile function
 * (Event triggers message)MMS Configuration Structure
 * \else
 * RTOBJGmobile9&D\O`9X
 * (JB<~4%7"6`C=Le2JPE/6LPE7"KM)MMSEdVC=a99Le
 * \endif
 */
public class SDKDEV_MMS_CFG implements Serializable {
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
	 * Receiver amount
	 * \else
	 * 6LPE=SJUU_8vJ}
	 * \endif
	 */
	public int               dwReceiverNum;

	/**
	 * \if ENGLISH_LANG
	 * Receiver,normally cellphone
	 * \else
	 * 6LPE=SJUU_#,R;0cN*JV;z:EBk
	 * \endif
	 */
	public byte				SZReceiver[][] = new byte[FinalVar.SDK_MMS_RECEIVER_NUM][32];
	
	/**
	 * \if ENGLISH_LANG
	 * Message type 0:MMS;1:SMS
	 * \else
	 * 6LPEPEO"@`PM 0:MMS#;1:SMS
	 * \endif
	 */
	public byte                byType;

	/**
	 * \if ENGLISH_LANG
	 * Message title
	 * \else
	 * 6LPEPEO"1jLb
	 * \endif
	 */
	public byte                SZTitle[] = new byte[32];
}

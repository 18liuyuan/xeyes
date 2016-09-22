package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm decoder control 
 * \else
 * 1(>/=bBkFw?XVF
 * \endif
 */
public class DECODER_ALARM_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder. It begins from 0.
	 * \else
	 * 1(>/=bBkFw:E#,4S0?*J<
	 * \endif
	 */
	public int					decoderNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output port. It begin from o.
	 * \else
	 * 1(>/Jd3v?Z#,4S0?*J<
	 * \endif
	 */
	public short				alarmChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output status;1:open,0:close.
	 * \else
	 * 1(>/Jd3vW4L,#;1#:4r?*#,0#:9X1U
	 * \endif
	 */
	public short				alarmState;
}

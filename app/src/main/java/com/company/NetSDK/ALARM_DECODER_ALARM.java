package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarming Decoder Alarm
 * \else
 * 1(>/=bBkFw1(>/
 * \endif
 */
public class ALARM_DECODER_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Current Alarming Decoder Numbers 
	 * \else
	 * 7"Iz1(>/5D1(>/=bBkFw8vJ} 
	 * \endif
	 */
	public int                 nAlarmDecoderNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarming Decoder Alarm 
	 * \else
	 * >/=bBkFw1(>/ 
	 * \endif
	 */
	public ALARM_DECODER       stuAlarmDecoder[] = new ALARM_DECODER[FinalVar.MAX_ALARM_DECODER_NUM];
	
	public ALARM_DECODER_ALARM() {
		for (int i = 0; i < FinalVar.MAX_ALARM_DECODER_NUM; i++) {
			stuAlarmDecoder[i] = new ALARM_DECODER();
		}
	}
}

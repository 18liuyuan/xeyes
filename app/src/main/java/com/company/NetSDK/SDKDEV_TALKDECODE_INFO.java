package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio encode information
 * \else
 * SoRt1`BkPEO"
 * \endif
 */
public class SDKDEV_TALKDECODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Encode type
	 * \else
	 * 1`Bk@`PM
	 * \endif
	 */
	public int					encodeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit:8/16
	 * \else
	 * 6N;J}#,Hg8;r1
	 * \endif
	 */
	public int					nAudioBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate such as 8000 or 16000
	 * \else
	 * 2IQyBJ#,Hg8000;r16000
	 * \endif
	 */
	public int					dwSampleRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Pack Period,Unit ms
	 * \else
	 * 4r0|V\FZ, 5%N;ms
	 * \endif
	 */
	public int                  nPacketPeriod;
}

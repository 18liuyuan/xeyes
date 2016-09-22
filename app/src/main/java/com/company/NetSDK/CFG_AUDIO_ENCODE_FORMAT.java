package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio Format
 * \else
 * RtF58qJ=
 * \endif
 */
public class CFG_AUDIO_ENCODE_FORMAT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ability
	 * \else
	 * D\A&
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abDepth;
	public boolean				abFrequency;
	public boolean				abMode;
	public boolean				abFrameType;
	public boolean				abPacketPeriod;

	/**
	 * \if ENGLISH_LANG
	 * Audio Compression Format#,CFG_AUDIO_FORMAT 
	 * \else
	 * RtF5Q9KuD#J=, CFG_AUDIO_FORMAT
	 * \endif
	 */
	public int					emCompression;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Depth 
	 * \else
	 * RtF52IQyIn6H
	 * \endif
	 */
	public int					nDepth;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Frequency 
	 * \else
	 * RtF52IQyF5BJ
	 * \endif
	 */
	public int					nFrequency;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Mode 
	 * \else
	 * RtF51`BkD#J=
	 * \endif
	 */
	public int					nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Mode, 0-DHAV, 1-PS 
	 * \else
	 * RtF54r0|D#J=, 0-DHAV, 1-PS
	 * \endif
	 */
	public int					nFrameType;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Period, ms 
	 * \else
	 * RtF54r0|V\FZ, ms
	 * \endif
	 */
	public int					nPacketPeriod;
}

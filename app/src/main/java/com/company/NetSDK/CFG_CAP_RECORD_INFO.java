package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ability of record information
 * \else
 * B<OqD\A&PEO"
 * \endif
 */
public class CFG_CAP_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video does plan to support the holidat function
	 * \else
	 * B<Oq<F;.JG7qV'3V<YHU9&D\
	 * \endif
	 */
	public boolean  bSupportHoliday;
	
	/**
	 * \if ENGLISH_LANG
	 * whether to support setting extra stream video mode
	 * \else
	 * JG7qV'3VIhVC8(BkAwB<OqD#J=
	 * \endif
	 */
	public boolean  bSupportExtraRecordMode;
	
	/**
	 * \if ENGLISH_LANG
	 * max record time
	 * \else
	 * Wn4sT$B<J1<d
	 * \endif
	 */
	public int dwMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * total access code stream(kbps)
	 * \else
	 * Wn4s=SHkW\BkAw,5%N;kbps
	 * \endif
	 */
	public int dwMaxRemoteBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * maximum access to the bare code stream (include decause,resolution,frame rate,deep calculated on 16bpp)
	 * \else
	 * Wn4s=SHk5BkAw#(0|@(B7J}!"7V1fBJ!"V!BJ#,I+In0416bpp<FKc#)
	 * \endif
	 */
	public int dwMaxRemoteRawBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Maximum number of video stream 
	 * \else
	 * Wn4sB<OqBkAw8vJ}
	 * \endif
	 */
	public int dwMaxStreams;
}

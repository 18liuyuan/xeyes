package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio talk way
 * \else
 * 6T=27=J=
 * \endif
 */
public class EM_USEDEV_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Set client-end mode to begin audio talk 
	 * \else
	 * IhVC?M;'6K7=J==xPPSoRt6T=2
	 * \endif
	 */
	public static final int     SDK_TALK_CLIENT_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Set server mode to begin audio talk
	 * \else
	 * IhVC7~NqFw7=J==xPPSoRt6T=2
	 * \endif
	 */
	public static final int     SDK_TALK_SERVER_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Set encode format for audio talk
	 * \else
	 * IhVCSoRt6T=21`Bk8qJ=
	 * \endif
	 */
	public static final int     SDK_TALK_ENCODE_TYPE = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Set alarm subscribe way 
	 * \else
	 * IhVC1(>/6)TD7=J=
	 * \endif
	 */
	public static final int     SDK_ALARM_LISTEN_MODE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Set user right to realize configuration management
	 * \else
	 * IhVCM(9}H(O^=xPPEdVC9\@m
	 * \endif
	 */
	public static final int     SDK_CONFIG_AUTHORITY_MODE = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Set talking channel(0~MaxChannel-1)
	 * \else
	 * IhVC6T=2M(5@(0~MaxChannel-1)
	 * \endif
	 */
	public static final int     SDK_TALK_TALK_CHANNEL = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Set the stream type of the record for query(0-both main and extra stream,1-only main stream,2-only extra stream)  
	 * \else
	 * IhVC4}2iQ/<004J1<d;X7E5DB<OqBkAw@`PM(0-Vw8(BkAw,1-VwBkAw,2-8(BkAw) 
	 * \endif
	 */
	public static final int     SDK_RECORD_STREAM_TYPE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Set speaking parameter,corresponding to NET_SPEAK_PARAM
	 * \else
	 * IhVCSoRt6T=2:0;02NJ}#,6TS&=a99Le  NET_SPEAK_PARAM
	 * \endif
	 */
	public static final int     SDK_TALK_SPEAK_PARAM = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Set by time video playback and download the video file TYPE (see.net RECORD TYPE)
	 * \else
	 * IhVC04J1<dB<Oq;X7E<0OBTX5DB<OqND<~@`PM(Oj<{NET_RECORD_TYPE)
	 * \endif
	 */
    public static final int     SDK_RECORD_TYPE = 8; 
    
    /**
	 * \if ENGLISH_LANG
	 * Set voice intercom parameters of three generations of equipment and the corresponding structure NET TALK the EX
	 * \else
	 * IhVCH}4zIh185DSoRt6T=22NJ}, 6TS&=a99LeNET_TALK_EX
	 * \endif
	 */
    public static final int     SDK_TALK_MODE3 = 9;
    
    /**
	 * \if ENGLISH_LANG
	 * set real time playback function(0-off#,1-on)
	 * \else
	 * IhVCJ5J1;X7E9&D\(0-9X1U#,1?*Ft)
	 * \endif
	 */
    public static final int     SDK_PLAYBACK_REALTIME_MODE = 10; 
    
    /**
	 * \if ENGLISH_LANG
	 * Judge the voice intercom if it was a forwarding mode, (corresponding to  NET_TALK_TRANSFER_PARAM)
	 * \else
	 * IhVCSoRt6T=2JG7qN*W*7"D#J=, 6TS&=a99Le NET_TALK_TRANSFER_PARAM
	 * \endif
	 */
    public static final int     SDK_TALK_TRANSFER_MODE = 11; 
}

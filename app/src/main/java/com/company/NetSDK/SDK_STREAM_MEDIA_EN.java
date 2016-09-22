package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIP,RTSP Ability
 * \else
 * SIP,RTSPD\A&
 * \endif
 */
public class SDK_STREAM_MEDIA_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Stream type capability set 
	 * 0 N^ ;1 SIP;2 RTSP 
	 * \else
	 * BkAw@`PMD\A&</  0,N^ 1,SIP 2,RTSP
	 * \endif
	 */
	public int			nStreamType;			
}

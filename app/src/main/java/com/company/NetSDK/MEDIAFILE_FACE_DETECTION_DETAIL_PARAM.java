package com.company.NetSDK;

import java.io.Serializable;

public class MEDIAFILE_FACE_DETECTION_DETAIL_PARAM implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * object ID
	 * \else
	 * NoLeID
	 * \endif
	 */
	public long			    dwObjectId;
	
	/**
	 * \if ENGLISH_LANG
	 * frame no.
	 * \else
	 * V!Pr:E
	 * \endif
	 */
	public long             dwFrameSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 7"IzJ1<d
	 * \endif
	 */
	public NET_TIME_EX      stTime = new NET_TIME_EX();
}

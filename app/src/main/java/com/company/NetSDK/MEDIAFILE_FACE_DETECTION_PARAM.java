package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_FILE_QUERY_FACE_DETECTION corresponding face recognition service search parameter
 * \else
 * SDK_FILE_QUERY_FACE_DETECTION 6TS&5DHKA3J61p7~Nq2iQ/2NJ}
 * \endif
 */
public class MEDIAFILE_FACE_DETECTION_PARAM implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * FpJ<J1<d
	 * \endif
	 */
	public NET_TIME            stuStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME            stuEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * picture type#,see  EM_FACEPIC_TYPE
	 * \else
	 * M<F,@`PM#,Oj<{ EM_FACEPIC_TYPE
	 * \endif
	 */
	public int     emPicType;

	/**
	 * \if ENGLISH_LANG
	 * if has detailed info
	 * \else
	 * JG7qSPOjO8PEO"
	 * \endif
	 */
	public boolean                bDetailEnable;

	/**
	 * \if ENGLISH_LANG
	 * parameter detailed info
	 * \else
	 * 2NJ}OjO8PEO"
	 * \endif
	 */
	public MEDIAFILE_FACE_DETECTION_DETAIL_PARAM stuDetail = new MEDIAFILE_FACE_DETECTION_DETAIL_PARAM();
}

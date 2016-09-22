package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Media file search criteria
 * \else
 * 6KmediaND<~2iQ/Lu<~
 * \endif
 */
public class EM_FILE_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle information 
	 * \else
	 * =;M(35A>PEO"
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_TRAFFICCAR = 0;							 
	/**
	 * \if ENGLISH_LANG
	 * ATM information
	 * \else
	 * ATMPEO"
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_ATM = 1;									 
	/**
	 * \if ENGLISH_LANG
	 * ATM transaction information 
	 * \else
	 * ATM=;RWPEO" 
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_ATMTXN = 2;								 
	/**
	 * \if ENGLISH_LANG
	 * Face info, corresponding to MEDIAFILE_FACERECOGNITION_PARAM and MEDIAFILE_FACERECOGNITION_INFO
	 * \else
	 * 6KHKA3PEO" MEDIAFILE_FACERECOGNITION_PARAM :M  MEDIAFILE_FACERECOGNITION_INFO
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_FACE = 3;  								 
	/**
	 * \if ENGLISH_LANG
	 * File info, corresponding to NET_IN_MEDIA_QUERY_FILE and NET_OUT_MEDIAFILE_FILE
	 * \else
	 * ND<~PEO"6TS& NET_IN_MEDIA_QUERY_FILE :M NET_OUT_MEDIAFILE_FILE
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_FILE = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info, extension DH_FILE_QUERY_TRAFFICCAR, support more fields
	 * \else
	 * =;M(35A>PEO", @)U9SDK_FILE_QUERY_TRAFFICCAR, V'3V8|6`5DWV6N
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_TRAFFICCAR_EX = 5;

	/**
	 * \if ENGLISH_LANG
	 * Face recignition event info MEDIAFILE_FACE_DETECTION_PARAM and MEDIAFILE_FACE_DETECTION_INFO
	 * \else
	 * HKA3<l2bJB<~PEO" MEDIAFILE_FACE_DETECTION_PARAM :M MEDIAFILE_FACE_DETECTION_INFO
	 * \endif
	 */
	public static final int     SDK_FILE_QUERY_FACE_DETECTION = 6;	
}

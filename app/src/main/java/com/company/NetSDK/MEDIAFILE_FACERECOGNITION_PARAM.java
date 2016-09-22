package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_FILE_QUERY_FACE Corresponding face recognition service search parameter
 * \else
 * SDK_FILE_QUERY_FACE6TS&5DHKA3J61p7~Nq2iQ/2NJ}
 * \endif
 */
public class MEDIAFILE_FACERECOGNITION_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME            stStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * closing time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME            stEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Place to support fuzzy matching
	 * \else
	 * 5X5c#,V'3VD#:}F%Ed
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * To query the type of alarm, see EM_FACERECOGNITION_ALARM_TYPE
	 * \else
	 * 4}2iQ/1(>/@`PM#,Oj<{ EM_FACERECOGNITION_ALARM_TYPE
	 * \endif
	 */
	public int                 nAlarmType;

	/**
	 * \if ENGLISH_LANG
	 * staff info is valid or not
	 * \else
	 * HKT1PEO"JG7qSPP'
	 * \endif
	 */
	public boolean                abPersonInfo;

	/**
	 * \if ENGLISH_LANG
	 * staff info
	 * \else
	 * HKT1PEO"
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO stPersonInfo = new FACERECOGNITION_PERSON_INFO();

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelId;

	/**
	 * \if ENGLISH_LANG
	 * staff group
	 * \else
	 * HKT1WiJ}
	 * \endif
	 */
	public int                 nGroupIdNum;

	/**
	 * \if ENGLISH_LANG
	 * staff group ID
	 * \else
	 * HKT1WiID
	 * \endif
	 */
	public byte                szGroupId[][] = new byte[FinalVar.MAX_GOURP_NUM][FinalVar.SDK_COMMON_STRING_64];
}

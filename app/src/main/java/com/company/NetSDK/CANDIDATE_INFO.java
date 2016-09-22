package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cadidate person info
 * \else
 * :rQ!HKT1PEO"
 * \endif
 */
public class CANDIDATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * person info
	 * \else
	 * HKT1PEO"
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO  stPersonInfo = new FACERECOGNITION_PERSON_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * similarity
	 * \else
	 * :M2iQ/M<F,5DO`KF6H,0Y7V1H1mJ>#,1~100
	 * \endif
	 */
	public byte                         bySimilarity;
	
	/**
	 * \if ENGLISH_LANG
	 * Range officer's database, see EM_FACE_DB_TYPE
	 * \else
	 * HKT1KyJtJ}>]?b76N'#,Oj<{EM_FACE_DB_TYPE
	 * \endif
	 */
	public byte                         byRange;
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that the query time staff appeared
	 * \else
	 * 51byRangeN*@zJ7J}>]?bJ1SPP'#,1mJ>2iQ/HKT13vOV5DJ1<d
	 * \endif
	 */
	public NET_TIME                     stTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that people place a query appears
	 * \else
	 * 51byRangeN*@zJ7J}>]?bJ1SPP'#,1mJ>2iQ/HKT13vOV5D5X5c
	 * \endif
	 */
	public byte                         szAddress[] = new byte[FinalVar.MAX_PATH];
}

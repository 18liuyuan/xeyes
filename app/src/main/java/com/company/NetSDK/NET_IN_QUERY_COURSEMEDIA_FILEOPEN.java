package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * ?*J<2iQ/?N3LJSF5PEO"Hk2N
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILEOPEN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time 
	 * \else
	 *  2iQ/?*J<J1<d
	 * \endif
	 */
	public NET_TIME	stuStartTime = new NET_TIME();                     
   
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 2iQ/=aJxJ1<d
	 * \endif
	 */
	public NET_TIME stuEndTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * 2iQ/9X<|WV
	 * \endif
	 */
	public byte[] szKeyWord = new byte[FinalVar.SDK_COMMON_STRING_128]; 
}

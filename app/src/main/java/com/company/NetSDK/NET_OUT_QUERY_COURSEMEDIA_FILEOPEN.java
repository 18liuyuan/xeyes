package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record output parameter
 * \else
 * ?*J<2iQ/?N3LJSF5PEO"3v2N
 * \endif
 */
public class NET_OUT_QUERY_COURSEMEDIA_FILEOPEN implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * total number of result
	 * \else
	 *  2iQ/5=5DW\8vJ}
	 * \endif
	 */
	public int                   ntotalNum; 
    
	/**
	 * \if ENGLISH_LANG
	 * find id
	 * \else
	 * 2iQ/ID:E
	 * \endif
	 */
	public int                   nfindID;

}

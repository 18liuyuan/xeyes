package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * 2iQ/?N3LJSF5PEO"Hk2N
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILE implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * find ID
	 * \else
	 * 2iQ/ID:E
	 * \endif
	 * @see The nfindID field of NET_OUT_QUERY_COURSEMEDIA_FILEOPEN 
	 */
	public int                     nfindID;
	
	/**
	 * \if ENGLISH_LANG
	 * start find offset
	 * \else
	 * ?*J<2iQ/F+RF
	 * \endif
	 */
    public int                     nOffset;
    
	/**
	 * \if ENGLISH_LANG
	 * find count
	 * \else
	 * PhR*2iQ/5D8vJ}
	 * \endif
	 */
    public int                     nCount; 
}

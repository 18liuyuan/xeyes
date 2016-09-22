package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.QueryDevInfo , NET_QUERY_RECENCY_JNNCTION_CAR_INFO port input parameter
 * \else
 * INetSDK.QueryDevInfo , NET_QUERY_RECENCY_JNNCTION_CAR_INFO=S?ZJdHk2NJ}
 * \endif
 */
public class NET_IN_GET_RECENCY_JUNCTION_CAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snapshot channel no.
	 * \else
	 * W%EDM(5@:E
	 * \endif
	 */
    public int                  nChannel;
    
    /**
	 * \if ENGLISH_LANG
	 * get vehicle info type#,newest or latest, NET_RECENCY_CAR_INFO
	 * \else
	 * ;qH!35A>PEO"5D@`PM#,WnPB5D;9JGWn>I5D, NET_RECENCY_CAR_INFO
	 * \endif
	 */
    public int    				emRecencyType;
    
    /**
	 * \if ENGLISH_LANG
	 * no. vehicle info, from 1#,if it is 0, it alsomeans no. 1
	 * \else
	 * 5Z<88v35A>PEO",4S1?*J<#,Hg9{N*0R21mJ>5Z18v
	 * \endif
	 */
    public int                  nIndex;
}

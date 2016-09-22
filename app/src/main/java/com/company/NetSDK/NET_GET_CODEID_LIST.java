package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get code info
 * \else
 * ;qH!6TBkPEO"
 * \endif
 */
public class NET_GET_CODEID_LIST implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Start index symbol, start first search may set to 0
	 * \else
	 * ?*J<5DKwR}:E,?*J<5ZR;4N2iQ/?IIhN*0
	 * \endif
	 */
    public int	nStartIndex;            
    
    /**
     * \if ENGLISH_LANG
     * The gotten code items, this value issmaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * 1>4N;qH!5D6TBkLuJ},4KV5P!SZ5HSZD\A&</VPnMaxPageSizeWV6N5DV5
     * \endif
     * @see CFG_CAP_LOWRATEWPAN
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actual returned code items
     * \else
     * J5<J75;X5D6TBkLuJ}
     * \endif
     */
    public int	nRetCodeIDNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get code content, allocated by user, cannot be lower than nQueryNum
     * \else
     * ;qH!6TBk5DDZH], 8vJ}2;D\P!SZ nQueryNum
     * \endif
     */
    public NET_CODEID_INFO[]    pstuCodeIDInfo; 
    
    public NET_GET_CODEID_LIST(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuCodeIDInfo = new NET_CODEID_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuCodeIDInfo[i] = new  NET_CODEID_INFO();
    	}
    }
}

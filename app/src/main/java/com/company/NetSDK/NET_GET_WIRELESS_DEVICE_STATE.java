package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get wireless devices info
 * \else
 * ;qH!N^O_Ih18W4L,
 * \endif
 */
public class NET_GET_WIRELESS_DEVICE_STATE implements Serializable{
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
     * The gotten state items, this value is smaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * 1>4N;qH!5DIh18W4L,LuJ},4KV5P!SZ5HSZD\A&</VPnMaxPageSizeWV6N5DV5
     * \endif
     * @see CFG_CAP_LOWRATEWPAN
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actually returned items
     * \else
     * J5<J75;X5DIh18W4L,LuJ}
     * \endif
     */
    public int	nRetQueryNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get state content, allocated by user, cannot be lower than nQueryNum
     * \else
     * ;qH!Ih18W4L,5DDZH], 8vJ}2;D\P!SZ nQueryNum
     * \endif
     */
    public NET_WIRELESS_DEVICE_INFO[]    pstuDeviceInfo; 
    
    public NET_GET_WIRELESS_DEVICE_STATE(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuDeviceInfo = new NET_WIRELESS_DEVICE_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuDeviceInfo[i] = new  NET_WIRELESS_DEVICE_INFO();
    	}
    }
}

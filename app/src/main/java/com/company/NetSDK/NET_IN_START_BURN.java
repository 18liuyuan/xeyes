package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_START_BURN implements Serializable{
	/**
	 * StartBurn input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  burning device mask, by bit means multiple burning device group
	 * \else
	 * ?LB<Ih18QZBk, 04N;1mJ>6`8v?LB<Ih18Wi:O
	 * \endif
	 */
    public int                  nDevMask;           
    
    /**
	 * \if ENGLISH_LANG
	 *  burning channel group
	 * \else
	 *  ?LB<M(5@J}Wi
	 * \endif
	 */
    public int                  szChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM]; 
    
    /**
	 * \if ENGLISH_LANG
	 *  burning channel group
	 * \else
	 * ?LB<M(5@J}
	 * \endif
	 */
    public int                  nChannelCount;                          
    
    /**
  	 * \if ENGLISH_LANG
  	 *   burning mode#,value corresponding to NET_BURN_MODE
  	 * \else
  	 * ?LB<D#J=, V56TS&NET_BURN_MODE
  	 * \endif
  	 */
    public int        			emMode;          
    
    /**
  	 * \if ENGLISH_LANG
  	 *  burning stream format#,value corresponding to NET_BURN_RECORD_PACK
  	 * \else
  	 * ?LB<Aw8qJ=, V56TS&NET_BURN_RECORD_PACK
  	 * \endif
  	 */
    public int 				    emPack;                                 
}

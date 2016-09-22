package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CAN list
 * \else
 * CANAP1m
 * \endif
 */
public class CFG_CANFILTER_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * The number of CAN
	 * \else
	 * CAN8vJ}
	 * \endif
	 */
	public int						nCANCount;			 
	
	/**
	 * \if ENGLISH_LANG
	 * Equipment Return CAN Count 
	 * \else
	 * Ih1875;XCAN8vJ}
	 * \endif
	 */
	public int						nRetCANCount;		 
	
	/**
	 * \if ENGLISH_LANG
	 * CAN info
	 * \else
	 * CANPEO"
	 * \endif
	 */
	public CFG_CANFILTER_INFO		stuCANFilter[]  = new CFG_CANFILTER_INFO[FinalVar.MAX_CAN_COUNT];
	
	public CFG_CANFILTER_LIST() {
		for (int i=0 ; i < FinalVar.MAX_CAN_COUNT; i++) {
			stuCANFilter[i] = new CFG_CANFILTER_INFO();
		}
	}
}

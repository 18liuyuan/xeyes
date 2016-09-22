package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_BURN_GET_STATE implements Serializable {

	/**
	 * BurnGetState output param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * burning status, corresponding to Class NET_BURN_STATE
	 * \else
	 *  ?LB<W4L,, 6TS&@`NET_BURN_STATE
	 * \endif
	 */
	public 	int emState;
	
	/**
	 * \if ENGLISH_LANG
	 *  burning error code, corresponding to  NET_BURN_ERROR_CODE
	 * \else
	 *  ?LB<4mNsBk, 6TS&NET_BURN_ERROR_CODE
	 * \endif
	 */
	public int  emErrorCode;       
	
	/**
	 * \if ENGLISH_LANG
	 *  burning device mask, by bit means multiple device group
	 * \else
	 *  ?LB<Ih18QZBk, 04N;1mJ>6`8v?LB<Ih18Wi:O
	 * \endif
	 */
	public int  nDevMask;       
	      
	/**
	 * \if ENGLISH_LANG
	 *  burning error code
	 * \else
	 *  ?LB<M(5@J}Wi
	 * \endif
	 */
	 public int              nChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM];
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning channel number
	 * \else
	 *  ?LB<M(5@J}
	 * \endif
	 */
	 public int                  nChannelCount; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning mode#, corresponding to NET_BURN_MODE
	 * \else
	 * ?LB<D#J=, 6TS"@`NET_BURN_MODE
	 * \endif
	 */
	 public int 				 emMode;     
	  
	 /**
	 * \if ENGLISH_LANG
	 * urning stream format#, corresponding to NET_BURN_RECORD_PACK
	 * \else
	 * ?LB<Aw8qJ=, 6TS"@`NET_BURN_RECORD_PACK
	 * \endif
	 */
	 public int					 emPack;        

	 /**
	 * \if ENGLISH_LANG
	 * current burning file no
	 * \else
	 * 51G0?LB<ND<~1`:E
	 * \endif
	 */
	 public int                  nFileIndex;        
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning start time
	 * \else
	 * ?LB<?*J<J1<d
	 * \endif
	 */
	 public NET_TIME             stuStartTime = new NET_TIME();
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning device status
	 * \else
	 *  ?LB<Ih18W4L,
	 * \endif
	 */
	 public NET_BURN_DEV_STATE          stuDevState[] = new NET_BURN_DEV_STATE[FinalVar.SDK_MAX_BURNING_DEV_NUM]; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning remain time, unit second, -1 means invalid
	 * \else
	 *  ?LB<J#S`J1<d, 5%N;Ck, -14z1mN^P'
	 * \endif
	 */
	 public int                  nRemainTime;
	 
	 public NET_OUT_BURN_GET_STATE()
	 {
		 for(int i = 0; i < FinalVar.SDK_MAX_BURNING_DEV_NUM; i++)
		 {
			 stuDevState[i] = new NET_BURN_DEV_STATE();
		 }
	 }
	 
}

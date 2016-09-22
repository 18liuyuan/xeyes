package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AttachSplitTourport input parameter 
 * \else
 * AttachSplitTour=S?ZJdHk2NJ}
 * \endif
 */
public class NET_IN_ATTACH_SPLIT_TOUR implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * output channel no., pszCompsiteIDis NULL, it is valid 
	 * \else
	 * Jd3vM(5@:E, pszCompsiteIDN*NULLJ1SPP'
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * splicing video wall ID
	 * \else
	 * F4=SFAID
	 * \endif
	 */
	public String         	   pszCompositeID; 
	
	/**
	 * \if ENGLISH_LANG
	 * tour status call interface 
	 * \else
	 * BVQ2W4L,;X5w:/J}
	 * \endif
	 */
	public CB_fTourStatusCallBack cbStatus;  
}

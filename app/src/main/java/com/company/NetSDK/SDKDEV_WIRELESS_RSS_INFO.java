package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless network signal intensity structure
 * \else
 * N^O_MxBgPE:EG?6H=a99Le
 * \endif
 */
public class SDKDEV_WIRELESS_RSS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TD-SCDMA intensity,range:0#-100 
	 * \else
	 * TD-SCDMAG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwTDSCDMA;
	
	/**
	 * \if ENGLISH_LANG
	 * WCDMA intensity,range:0#-100 
	 * \else
	 * WCDMAG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwWCDMA;
	
	/**
	 * \if ENGLISH_LANG
	 * CDMA1x intensity,intensity:0#-100 
	 * \else
	 * CDMA1xG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwCDMA1x;
	
	/**
	 * \if ENGLISH_LANG
	 * EDGE intensity,range:0#-100 
	 * \else
	 * EDGEG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwEDGE;
	
	/**
	 * \if ENGLISH_LANG
	 * EVDO intensity,range:0#-100 
	 * \else
	 * EVDOG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwEVDO;
	
	/**
	 * \if ENGLISH_LANG
	 * Current type
	 * <pre>
	 *  0	Device does not support this item
	 *  1   TD-SCDMA
	 *  2	WCDMA
	 *  3	CDMA_1x
	 *  4	EDGE
	 *  5	EVDO
	 *  6	TD-LTE
	 *  </pre>
	 * \else
	 * 51G0@`PM
	 * <pre>
	 *  0	Ih182;V'3VUbR;On
	 *  1   TD-SCDMA
	 *  2	WCDMA
	 *  3	CDMA_1x
	 *  4	EDGE
	 *  5	EVDO
	 *  6	TD-LTE
	 *  </pre>
	 * \endif
	 */
	public int				nCurrentType;
												
	/**
	 * \if ENGLISH_LANG
	 * TD-LTE intensity,range:0#-100 
	 * \else
	 * TD-LTEG?6H,76N':0#-100
	 * \endif
	 */
	public int				dwTDLTE;				
}

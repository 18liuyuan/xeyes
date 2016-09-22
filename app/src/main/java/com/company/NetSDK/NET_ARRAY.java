package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General long character ended with '\0'
 * \else
 * M(SC1d3$WV7{4.RT!.\0!/=aJx
 * \endif
 */
public class NET_ARRAY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Buffer zone. Now the min value is 260 byte.Caller shall apply for the memory. The filling in data shall ended with '\0'. 
	 * \else
	 * ;:3eGx D?G0WnP!260WV=Z#,5wSCU_IjGkDZ4f Ln3dJ}>]1#V$JG'\0'=aJx
	 * \endif
	 */
	public byte[]             pArray;
	
	/**
	 * \if ENGLISH_LANG
	 * Buffer space length
	 * \else
	 * ;:3e?U<d3$6H
	 * \endif
	 */
	public int                dwArrayLen;                     
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * DSP1(>/
 * \endif
 */
public class DSP_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:DSP normal;1:DSP abnormal
	 * \else
	 * 0,DSPU}3# 1,DSPRl3#
	 * \endif
	 */
	public boolean                bError;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. 0=there is no error. Other value=there error.(For each alarm, there is one valid bit.)
	 * <pre>
	 * bit 	DSP alarm 
	 * 1 	bit DSP load failed  
	 * 2 	bit DSP error 
	 * 3 	bit Wrong format  
	 * 4 	bit Does not support current resolution 
	 * 5 	bit Does not support current data format. 
	 * 6 	bit Can not find I frame. 
	 * </pre>
	 * \else
	 * 04N;1mJ>#,7G01mJ>SP4K4mNs#,01mJ>C;SP!#(D?G0C?4N1(>/V;SPR;N;SPP')
	 * <pre>
	 * bit 	DSP1(>/
	 * 1  	DSP<STXJ'0\ 
	 * 2  	DSP4mNs
	 * 3  	VFJ=2;6T 
	 * 4  	7V1fBJ2;V'3V
	 * 5  	J}>]8qJ=2;V'3V
	 * 6  	UR2;5=IV!
	 * </pre>
	 * \endif
	 */
	public int               dwErrorMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decoded channel No. of alarm. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format
	 * \else
	 * 04N;1mJ>#,1(>/5D=bBkM(5@:E#,dwErrorMaskN*DSP4mNs#,VFJ=2;6T#,7V1fBJ2;V'3V#,J}>]8qJ=2;V'3VJ14KOnSPP'
	 * \endif
	 */
	public int               dwDecChnnelMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decode channel No. of alarm for 33-64-channel. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format.
	 * \else
	 * 04N;1mJ>,33-64M(5@5D1(>/5D=bBkM(5@:E, dwErrorMaskN*DSP4mNs#,VFJ=2;6T#,7V1fBJ2;V'3V#,J}>]8qJ=2;V'3VJ14KOnSPP'
	 * \endif
	 */
	public int               dwDecChnnelMask1;
}

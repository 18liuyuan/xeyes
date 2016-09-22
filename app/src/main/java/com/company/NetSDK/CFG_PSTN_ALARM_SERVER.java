package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telephone Alarm Center Linkage Information
 * \else
 * 5g;01(>/VPPDA*6/PEO"
 * \endif
 */
public class CFG_PSTN_ALARM_SERVER implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  Whether to Report to the Call Center
	 * \else
	 * JG7qIO1(VA5g;01(>/VPPD	
	 * \endif
	 */
	public boolean				bNeedReport; 
	
	/**
	 * \if ENGLISH_LANG
	 *  The Number of Telephone Alarm Server
	 * \else
	 * 5g;01(>/7~NqFw8vJ}	
	 * \endif
	 */
	public int					nServerCount;				
	
	/**
	 * \if ENGLISH_LANG
	 * Report to the Alarm Center Subscript
	 * \else
	 * IO1(5D1(>/VPPDOB1j
	 * \endif
	 * @see Oj<{EdVC CFG_PSTN_ALARM_CENTER_INFO
	 */
	public byte[] 				byDestination = new byte[FinalVar.MAX_PSTN_SERVER_NUM]; 
}

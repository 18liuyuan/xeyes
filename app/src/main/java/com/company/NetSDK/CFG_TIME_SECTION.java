package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period information
 * \else
 * J1<d6NPEO"
 * \endif
 */
public class CFG_TIME_SECTION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot and Record Type Mask 
	 * <pre>
	 * Mask 		Record Type 
	 * Bit0 		Active Detection Record 
	 * Bit1 		Alarm Record 
	 * Bit2 		Timing Record 
	 * Bit3 R		ecord when motion detection and alarming occur at the same time 
	 * Bit4~Bit15 	Reserved 
	 * Bit16 		Active Detection Snapshot 
	 * Bit17 		Alarming Snapshot 
	 * Bit18 		Timing Snapshot 
	 * Bit19~Bit31 	Reserved 
	 * </pre>
	 * \else
	 * B<OqQZBk#,04N;7V1pN*6/L,<l2bB<Oq!"1(>/B<Oq!"6(J1B<Oq!"Bit3~Bit151#At!"Bit166/L,<l2bW%M<!"Bit171(>/W%M<!"Bit186(J1W%M<
	 * \endif
	 */
	public int					dwRecordMask; 
	public int					nBeginHour;
	public int					nBeginMin;
	public int					nBeginSec;
	public int					nEndHour;
	public int					nEndMin;
	public int					nEndSec;
}

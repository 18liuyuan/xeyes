package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Mode
 * \else
 * B<OqD#J=
 * \endif
 */
public class AV_CFG_RecordMode implements Serializable {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Mode, 0-Auto Record#,1-Mannul Record#,2-Shutdown Record 
	 * \else
	 * B<OqD#J=, 0-WT6/B<Oq#,1-JV6/B<Oq#,2-9X1UB<Oq 
	 * \endif
	 */
	public int					nMode;
}
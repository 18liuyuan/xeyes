package com.company.NetSDK;

import java.io.Serializable;

public class POINTEANBLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset range[1,80], invalid setting is 0.
	 * \else
	 * T$VF5c5DSPP'76N'1UGx<d[1,80]#,N^P'IhVCN*0!#
	 * \endif
	 */
	public byte             bPoint;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid or not,0 invalid,1 valid
	 * \else
	 * JG7qSPP',0N^P'#,1SPP'
	 * \endif
	 */
	public byte             bEnable;
}

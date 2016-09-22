package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Motion detection alarm
 * \else
 * 6/L,<l2b1(>/
 * \endif
 */
public class SDK_MOTION_DETECT_CFG_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection alarm enabling
	 * \else
	 * 6/L,<l2b1(>/J9D\
	 * \endif
	 */
	public byte                byMotionEn;

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity
	 * \else
	 * AiCt6H
	 * \endif
	 */
	public short                wSenseLevel;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area rows
	 * \else
	 * 6/L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public short                wMotionRow;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area lines
	 * \else
	 * 6/L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public short                wMotionCol;
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection area,most 32*32
	 * \else
	 * <l2bGxSr#,Wn6`32*32?iGxSr
	 * \endif
	 */
    public byte                byDetected[][] = new byte[FinalVar.SDK_MOTION_ROW][FinalVar.SDK_MOTION_COL];
    
    /**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
    public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Handle method
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
    public SDK_MSG_HANDLE_EX        struHandle = new SDK_MSG_HANDLE_EX();
    
    public SDK_MOTION_DETECT_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
    			stSect[i][j] = new SDK_TSECT();
    		}
    	}
    }
}

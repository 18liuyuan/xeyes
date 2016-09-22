package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DefenceArea Type
 * \else
 * 7@Gx@`PM
 * \endif
 */
public class EM_CFG_DEFENCEAREATYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * N4V*
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Unknown = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Real-time DefenceArea 
	 * \else
	 * <4J17@Gx 
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InTime = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay DefenceArea
	 * \else
	 * QSJ17@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Delay = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Fullday DefenceArea
	 * \else
	 * 24P!J17@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDay = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * ;p>/7@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Fire = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 24P!J1SPIy7@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySound = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 24P!J1N^Iy7@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySlient = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 3vHk7@Gx1
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance1 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 3vHk7@Gx2
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance2 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * DZ2?7@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InSide = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * Mb2?7@Gx
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_OutSide = 10;
}

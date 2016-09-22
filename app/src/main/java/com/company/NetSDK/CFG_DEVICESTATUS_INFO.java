package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Status Info
 * \else
 * Ih18W4L,PEO"
 * \endif
 */
public class CFG_DEVICESTATUS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Power Num 
	 * \else
	 * 5gT48vJ}
	 * \endif
	 */
	public int			nPowerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Power Status,1:Normal 2:Abnormal 3:Unknowm 
	 * \else
	 * 5gT4W4L,#,1:U}3# 2:Rl3# 3:N4V*
	 * \endif
	 */
	public byte[] 		byPowerStatuc = new byte[FinalVar.MAX_POWER_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Number 
	 * \else
	 * CPU8vJ}
	 * \endif
	 */
	public int			nCPUNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Temperature 
	 * \else
	 * CPUNB6H
	 * \endif
	 */
	public int[]		nCPUTemperature = new int[FinalVar.MAX_CPU_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Number
	 * \else
	 * 7gIH8vJ}
	 * \endif
	 */
	public int			nFanNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Rotato Speed 
	 * \else
	 * 7gIHW*KY
	 * \endif
	 */
	public int[]		nRotatoSpeed = new int[FinalVar.MAX_FUN_NUM];
}
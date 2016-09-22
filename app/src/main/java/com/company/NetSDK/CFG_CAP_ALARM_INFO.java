package com.company.NetSDK;

import java.io.Serializable;

public class CFG_CAP_ALARM_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device support PIR alarm or not(thermal sensors),a kind of external alarm
	 * \else
	 * Ih18JG7qV'3VPIR(HKLeHHJ=8PS&Fw)1(>/,Mb2?1(>/5DR;VV
	 * \endif
	 */
	public boolean                 bAlarmPir;
	
	/**
	 * \if ENGLISH_LANG
	 * Device support flash light of not
	 * \else
	 * Ih18JG7qV'3V299b5F
	 * \endif
	 */
	public boolean                 bFlashLight;
	
	/**
	 * \if ENGLISH_LANG
	 * DefenceArea Type Number ,0 Indicates No Such Alarm Input does not Use as a DefenceArea
	 * \else
	 * 7@Gx@`PMVV@`J},N*01mJ>N^4KWV6NJ11(>/JdHk2;WwN*7@GxJ9SC!#
	 * \endif
	 */
	public int					 nDefenceAreaTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported DefenceArea Type 
	 * \else
	 * V'3V7@Gx@`PM , EM_CFG_DEFENCEAREATYPE
	 * \endif
	 */
	public int     			emDefenceAreaType[] = new int[FinalVar.MAX_ALARM_DEFENCE_TYPE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Delay DefenceArea Maximum Time,Unit:Second, Only Support Delay DefenceArea is Effective
	 * \else
	 * QSJ17@Gx5DWn4sQSJ1J1<d,5%N;N*Ck#,V;SPV'3VQSJ17@GxJ14KWV6N2ESPP'!#
	 * \endif
	 */
	public int				 	 nMaxDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel,In Order to Maintain Compatibility, 0 Indicates that Each Channel  Support All Types of Sensors
	 * \else
	 * 1(>/M(5@J},N*AK1#3V<fH]PT,4KN*0J11mJ>C?8vM(5@V'3VKySP@`PM5D4+8PFw
	 * \endif
	 */
	public int					 nAlarmChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Set
	 * \else
	 * 1(>/M(5@</:O
	 * \endif
	 */
	public CFG_ALARM_SENSE_METHOD stuAlarmChannel[] = new CFG_ALARM_SENSE_METHOD[FinalVar.MAX_ALARM_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Number of Alarm
	 * \else
	 * >/:E8vJ}
	 * \endif
	 */
	public int					 nAlarmBellCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum number of alarms backup center,The default is 0 when no such field,0 indicates no support for alternate Alarm Center
	 * \else
	 * Wn4s18SC1(>/VPPDJ},N^4KWV6NJ1D,HON*0,01mJ>2;V'3V18SC1(>/VPPD
	 * \endif
	 */
	public int					 nMaxBackupAlarmServer;
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum number of Phone alarms  center, he default is 0 when no such field,0 indicates no support for Phone Alarm Center
	 * \else
	 * Wn4s5g;01(>/VPPDJ}, N^4KWV6NJ1D,HON*0,01mJ>2;V'3V5g;01(>/VPPD!#
	 * \endif
	 */
	public int					 nMaxPSTNAlarmServer;
	
	public CFG_CAP_ALARM_INFO() {
		for (int i = 0; i < FinalVar.MAX_ALARM_CHANNEL_NUM; i++) {
			stuAlarmChannel[i] = new CFG_ALARM_SENSE_METHOD();
		}
	}
}

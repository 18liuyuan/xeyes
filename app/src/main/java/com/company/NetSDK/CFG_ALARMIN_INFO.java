package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External Alarm Configuration
 * \else
 * Mb2?1(>/EdVC
 * \endif
 */
public class CFG_ALARMIN_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No.(0 Start) 
	 * \else
	 * 1(>/M(5@:E(0?*J<)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable Switch 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Name 
	 * \else
	 * 1(>/M(5@C{3F
	 * \endif
	 */
	public char					szChnName[] = new char[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor Name. 0:Normal Closed,1:Normal Open
	 * \else
	 * 1(>/Fw@`PM,0:3#1U,1:3#?*
	 * \endif
	 */
	public int					nAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Linkage 
	 * \else
	 * 1(>/A*6/
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
	/**
	 * \if ENGLISH_LANG
	 * Event Respond Time Section 
	 * \else
	 * JB<~OlS&J1<d6N
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];

	public boolean				abDevID;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID 
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public char					szDevID[] = new char[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * sensor trigger mode, 0: highly effective#,1 low effective; sensor grounding or power#,and group with nAlarmType 
	 * \else
	 * 4+8PFw4%7"D#J=, 0:8_SPP',15MSPP'; >_Le1mOVN*4+8PFw=S5Xor5gT4,SknAlarmTypeWi:OJ9SC
	 * \endif
	 */
	public int                  nPole;                                      
	                                                                
	/**
	 * \if ENGLISH_LANG
	 * sensor type, EM_SENSE_METHOD
	 * \else
	 * 4+8PFw8PS&7=J=, EM_SENSE_METHOD
	 * \endif
	 */
	public int				     emSense;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm enable control, EM_CTRL_ENABLE
	 * \else
	 * 1(>/J9D\?XVF7=J=, EM_CTRL_ENABLE
	 * \endif
	 */
	public int                   emCtrl;
	
	/**
	 * \if ENGLISH_LANG
	 * delay disarm , in s,0~300,emCtrl value is EM_CTRL_NORMAL or EM_CTRL_ALWAYS_EN effective 
	 * \else
	 * QSJ1377@J1<d,5%N;N*Ck,0~300,emCtrlV5N*EM_CTRL_NORMAL;rEM_CTRL_ALWAYS_EN J1SPP'.
	 * \endif
	 */
	public int                  nDisDelay;     
	
	/**
	 * \if ENGLISH_LANG
	 * DefenceArea Type , Specific Types Supported by Querying the Ability to Obtain
	 * \else
	 * 7@Gx@`PM, >_LeV'3V5D@`PMM(9}2iQ/D\A&;q5C
	 * \endif 
	 * @see EM_CFG_DEFENCEAREATYPE
	 */
	public int 					emDefenceAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Protection Time, DefenceArea Type is"Delay"(Delay DefenceArea)is Effective, Unit: Second,  Maximum Time by Querying the Ability to Obtain
	 * \else
	 * QSJ12<7@J1<d, 7@Gx@`PMN*"Delay"(QSJ17@Gx)J12ESPP', 5%N;: Ck, Wn4sJ1<dM(9}2iQ/D\A&;q5C    
	 * \endif 
	 */
	public int					nEnableDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, -1 means invalid, 0 means local channel, 1 means connect to 1st serial extension channel, 2, 3...and so on
	 * \else
	 * 8y5XV7, -11mJ>N^P', 01mJ>1>5XM(5@, 11mJ>A,=STZ5ZR;8v4.?ZIO5D@)U9M(5@, 2!"3...RT4K@`MF
	 * \endif 
	 */
    public int                  nSlot; 
    
    /**
	 * \if ENGLISH_LANG
	 * 1st level cascading address, means connection to no.nSlot serial no.nLevel 1 detector or meter, -1 means invalid, from 0
	 * \else
	 * 5ZR;<6<6A*5XV7, 1mJ>A,=STZ5ZnSlot4.?ZIO5D5ZnLevel18vL=2bFw;rRG1m, -11mJ>N^P', 4S0?*J<
	 * \endif 
	 */
    public int                  nLevel1; 
   
    /**
	 * \if ENGLISH_LANG
	 *  Means if nLevel2 text exists
	 * \else
	 * 1mJ>nLevel2WV6NJG7q4fTZ
	 * \endif 
	 */
    public boolean              abLevel2; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  2rd level cascading address, means connected to no. nLevel1 meter's detector no., -1 means invalid, from 0
   	 * \else
   	 * 5Z6~<6<6A*5XV7, 1mJ>A,=STZ5ZnLevel18v5DRG1mIO5DL=2bFwPr:E, -11mJ>N^P', 4S0?*J<
   	 * \endif 
   	 */
    public int                  nLevel2;
		
	public CFG_ALARMIN_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}

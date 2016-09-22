package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device extension info 
 * \else
 * Ih18PEO"@)U9
 * \endif
 */
public class NET_DEVICEINFO_Ex implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial number
	 * \else
	 * PrAP:E
	 * \endif
	 */
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm input
	 * \else
	 * DVR1(>/JdHk8vJ}
	 * \endif
	 */
	public int					nAlarmInPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm output
	 * \else
	 * DVR1(>/Jd3v8vJ}
	 * \endif
	 */
	public int					nAlarmOutPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Number of DVR disk
	 * \else
	 * DVRS2EL8vJ}
	 * \endif
	 */
	public int					nDiskNum;

	/**
	 * \if ENGLISH_LANG
	 * DVR type, refer to DHDEV_DEVICE_TYPE
	 * \else
	 * DVR@`PM, <{C6>YNET_DEVICE_TYPE
	 * \endif
	 */
	public int					nDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of DVR channel
	 * \else
	 * DVRM(5@8vJ}
	 * \endif
	 */
	public int					nChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * When online time out, it is 0 means no limit on login, non-o- means 0 limit
	 * \else
	 * TZO_3,J1J1<d,N*01mJ>2;O^VF5GB=,7G01mJ>O^VF5D7VVSJ}
	 * \endif
	 */
	public byte                byLimitLoginTime;
	
	/**
	 * \if ENGLISH_LANG
	 * When login failed due to wrong password, it notify user via this parameter, remaining login times, as 0 means parameter invalid
	 * \else
	 * 515GB=J'0\T-RrN*C\Bk4mNsJ1#,M(9}4K2NJ}M(V*SC;'#,J#S`5GB=4NJ}#,N*0J11mJ>4K2NJ}N^P'
	 * \endif
	 */
	public byte                byLeftLogTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * when log in failed#,the left time for users to unlock (seconds), -1 indicate the device haven!/t set the parameter 
	 * \else
	 * 515GB=J'0\#,SC;'=bKxJ#S`J1<d#(CkJ}#), -11mJ>Ih18N4IhVC8C2NJ}
	 * \endif
	 */
	public int                 nLockLeftTime; 
}

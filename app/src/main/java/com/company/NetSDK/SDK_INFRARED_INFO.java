package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Wireless) Infrared Alarm Configuration
 * \else
 * (N^O_):lMb1(>/EdVC
 * \endif
 */
public class SDK_INFRARED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 1(>/JdHkJ9D\
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Input Name
	 * \else
	 * 1(>/JdHkC{3F
	 * \endif
	 */
	public byte                szAlarmName[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm In Pattern
	 * \else
	 * 1(>/FwJdHk2(PN
	 * \endif
	 */
	public int                 nAlarmInPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutPattern
	 * \else
	 * 1(>/Jd3v2(PN
	 * \endif
	 */
	public int                 nAlarmOutPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmInAddress
	 * \else
	 * 1(>/JdHk5XV7
	 * \endif
	 */
	public byte                szAlarmInAddress[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * SensorType, normal open or normal close
	 * \else
	 * Mb2?Ih184+8PFw@`PM3#?* or 3#1U
	 * \endif
	 */
	public int                 nSensorType;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendEfectTime
	 * \else
	 * 2<377@QSJ1J1<d#,TZ4KJ1<d:s8C1(>/JdHkSPP'
	 * \endif
	 */
	public int                 nDefendEfectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendAreaType
	 * \else
	 * 7@Gx@`PM
	 * \endif
	 */
	public int                 nDefendAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmSmoothTime
	 * \else
	 * 1(>/F=;,J1<d#,<4TZ4KJ1<dDZHg9{V;SPR;8v1(>/JdHkA,PxJdHkA=4NTr:vBT5t:sCfR;4N
	 * \endif
	 */
	public int                 nAlarmSmoothTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * J1<d1m
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Handle Mode
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
	
	public SDK_INFRARED_INFO() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ACC power off configuration
 * \else
 * 35TXO`9XEdVC
 * \endif
 */
public class SDKDEV_ABOUT_VEHICLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * bAutoBootEnable
	 * \else
	 * WT6/?*;zJ9D\
	 * \endif
	 */
	public boolean 				bAutoBootEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoBootTime
	 * \else
	 * C?LlWT6/?*;zJ1<d5c, 5%N;Ck,4S0KcFp.[0,82800]
	 * \endif
	 */
	public int					dwAutoBootTime;

	/**
	 * \if ENGLISH_LANG
	 * bAutoShutDownEnable
	 * \else
	 * WT6/9X;zJ9D\
	 * \endif
	 */
	public boolean				bAutoShutDownEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoShutDownTime
	 * \else
	 * C?LlWT6/9X;zJ1<d5c, 5%N;Ck,4S0KcFp.[0,82800]
	 * \endif
	 */
	public int					dwAutoShutDownTime;

	/**
	 * \if ENGLISH_LANG
	 * dwShutDownDelayTime
	 * \else
	 * QSJ19X;zJ1<d,5%N;Ck.
	 * \endif
	 */
	public int					dwShutDownDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * bEventNoDisk
	 * \else
	 * 1,(Ignore::vBT); 2,(Reboot:VXFpO5M3)
	 * \endif
	 */
	public int					bEventNoDisk;

	/**
	 * \if ENGLISH_LANG
	 * bWifiEnable
	 * \else
	 * JG7qV'3V35TXN^O_D#?i.
	 * \endif
	 */
	public boolean				bWifiEnable;

	/**
	 * \if ENGLISH_LANG
	 * bUpperSpeedEnable
	 * \else
	 * JG7qJ9SC3,KYEP6O
	 * \endif
	 */
	public boolean				bUpperSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * bLowerSpeedEnable
	 * \else
	 * JG7qJ9SC5MKYEP6O
	 * \endif
	 */
	public boolean				bLowerSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedValue
	 * \else
	 * 3,KYV5?*Gx<d(1,1000).9+@o/P!J1
	 * \endif
	 */
	public int					dwUpperSpeedValue;
	
	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedValue
	 * \else
	 * 5MKYV5?*Gx<d(1,1000).9+@o/P!J1
	 * \endif
	 */
	public int 					dwLowerSpeedValue;

	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedDelayTime
	 * \else
	 * IhVC3,KY3VPxV5
	 * \endif
	 */
	public int					dwUpperSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedDelayTime
	 * \else
	 * IhVC5MKY3VPxV5
	 * \endif
	 */
	public int					dwLowerSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwAlarmMaskEnable
	 * \else
	 * 2iQ//IhVC5~<S1(>/PEO"J9D\,0:9X1U,1:4r?*, C?R;N;4S5M5=8_1mJ>8w8vMb2?1(>/M(5@0-NJ9D\
	 * \endif
	 */	
	public int					dwAlarmMaskEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedOverAlarmRecordEnable
	 * \else
	 * 3,KY1(>/A*6/B<OqJ9D\
	 * \endif
	 */	
	public boolean				bSpeedOverAlarmRecordEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedLowAlarmRecordEnable
	 * \else
	 * 5MKY1(>/A*6/B<OqJ9D\ 
	 * \endif
	 */	
	public boolean				bSpeedLowAlarmRecordEnable;
}

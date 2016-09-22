package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 6(ReSPNJLb#,GkNpTYJ9SC
 * \else
 * 6(ReSPNJLb#,GkNpTYJ9SC
 * \endif
 */
public class NET_POWER_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 public boolean            bEnable;                            // 2iQ/JG7q3I9&
	 public int                nCount;                             // 5gT4J}A?
	 public NET_POWER_INFO     stuPowers[] = new NET_POWER_INFO[FinalVar.SDK_MAX_POWER_NUM];        // 5gT4W4L,
	 public int                nBatteryNum;                        // 5g3XJ}A?
	 public NET_BATTERY_INFO   stuBatteries[] = new NET_BATTERY_INFO[FinalVar.SDK_MAX_BATTERY_NUM];   // 5g3XW4L,
	 
	 public NET_POWER_STATUS(){
		 for(int i=0 ; i<FinalVar.SDK_MAX_POWER_NUM ; i++){
			 stuPowers[i] = new NET_POWER_INFO();
		 }
		 
		 for( int i =0 ; i<FinalVar.SDK_MAX_BATTERY_NUM ; i++){
			 stuBatteries[i] = new NET_BATTERY_INFO();
		 }
	 }
}

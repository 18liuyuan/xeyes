package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arming parameters
 * \else
 * 1(>/2<7@2NJ}
 * \endif
 */
public class SDKDEV_ALARM_SCHEDULE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Local alarm input
	 * \else
	 * 1>5X1(>/JdHk
	 * \endif
	 */
	public SDK_ALARMIN_CFG          struLocalAlmIn[] = new SDK_ALARMIN_CFG[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Network alarm input
	 * \else
	 * MxBg1(>/JdHk
	 * \endif
	 */
	public SDK_ALARMIN_CFG          struNetAlmIn[] = new SDK_ALARMIN_CFG[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Dynamic detection alarm
	 * \else
	 * 6/L,<l2b1(>/
	 * \endif
	 */
	public SDK_MOTION_DETECT_CFG    struMotion[] = new SDK_MOTION_DETECT_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss alarm
	 * \else
	 * JSF56*J'1(>/
	 * \endif
	 */
	public SDK_VIDEO_LOST_CFG       struVideoLost[] = new SDK_VIDEO_LOST_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Video tampering alarm
	 * \else
	 * JSF5UZ521(>/
	 * \endif
	 */
	public SDK_BLIND_CFG            struBlind[] = new SDK_BLIND_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Hard disk alarm
	 * \else
	 * S2EL1(>/
	 * \endif
	 */
	public SDK_DISK_ALARM_CFG       struDiskAlarm = new SDK_DISK_ALARM_CFG();
	
	/**
	 * \if ENGLISH_LANG
	 * Network Anomaly alarm
	 * \else
	 * MxBgRl3#1(>/
	 * \endif
	 */
	public SDK_NETBROKEN_ALARM_CFG  struNetBrokenAlarm = new SDK_NETBROKEN_ALARM_CFG();
	
	public SDKDEV_ALARM_SCHEDULE() {
		for (int i = 0; i < FinalVar.SDK_MAX_ALARM_IN_NUM; i++) {
			struLocalAlmIn[i] = new SDK_ALARMIN_CFG();
			struNetAlmIn[i] = new SDK_ALARMIN_CFG();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
			struMotion[i] = new SDK_MOTION_DETECT_CFG();
			struVideoLost[i] = new SDK_VIDEO_LOST_CFG();
			struBlind[i] = new SDK_BLIND_CFG();
		}
	}
}

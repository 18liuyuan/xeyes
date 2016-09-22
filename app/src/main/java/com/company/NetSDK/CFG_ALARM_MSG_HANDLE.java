package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Linkage Structure
 * \else
 * 1(>/A*6/PEO"
 * \endif
 */
public class CFG_ALARM_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * handling ability 
	 * \else
	 * D\A&
	 * \endif
	 */
	
	public boolean				abRecordMask;
	public boolean				abRecordEnable;
	public boolean				abRecordLatch;
	public boolean				abAlarmOutMask;
	public boolean				abAlarmOutEn;
	public boolean				abAlarmOutLatch;	
	public boolean				abExAlarmOutMask;
	public boolean				abExAlarmOutEn;
	public boolean				abPtzLinkEn;
	public boolean				abTourMask;
	public boolean				abTourEnable;
	public boolean				abSnapshot;
	public boolean				abSnapshotEn;
	public boolean				abSnapshotPeriod;
	public boolean				abSnapshotTimes;
	public boolean				abTipEnable;
	public boolean				abMailEnable;
	public boolean				abMessageEnable;
	public boolean				abBeepEnable;
	public boolean				abVoiceEnable;
	public boolean				abMatrixMask;
	public boolean				abMatrixEnable;
	public boolean				abEventLatch;
	public boolean				abLogEnable;
	public boolean				abDelay;
	public boolean				abVideoMessageEn;
	public boolean				abMMSEnable;
	public boolean				abMessageToNetEn;
	public boolean				abTourSplit;
	public boolean				abSnapshotTitleEn;

	public boolean                abChannelCount;
	public boolean                abAlarmOutCount;
	public boolean                abPtzLinkEx;
	public boolean                abSnapshotTitle;
	public boolean                abMailDetail;
	public boolean                abVideoTitleEn;
	public boolean                abVideoTitle;
	public boolean                abTour;
	public boolean                abDBKeys;
	public boolean                abJpegSummary;
	public boolean                abFlashEn;
	public boolean                abFlashLatch;
	

	/**
	 * \if ENGLISH_LANG
	 * Device Video Channel Count
	 * \else
	 * Ih185DJSF5M(5@J}
	 * \endif
	 */
	public int					nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Device Alarm Output Count 
	 * \else
	 * Ih185D1(>/Jd3v8vJ}
	 * \endif
	 */
	public int					nAlarmOutCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Channl Mask(By Bits)
	 * \else
	 * B<OqM(5@QZBk(04N;)
	 * \endif
	 */
	public int					dwRecordMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Enable
	 * \else
	 * B<OqJ9D\
	 * \endif
	 */
	public boolean				bRecordEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Delay Time(Second) 
	 * \else
	 * B<OqQSJ1J1<d(Ck)
	 * \endif
	 */
	public int					nRecordLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Channel Mask 
	 * \else
	 * 1(>/Jd3vM(5@QZBk
	 * \endif
	 */
	public int					dwAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Output Enable 
	 * \else
	 * 1(>/Jd3vJ9D\
	 * \endif
	 */
	public boolean				bAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Delay Time(Time)
	 * \else
	 * 1(>/Jd3vQSJ1J1<d(Ck)
	 * \endif
	 */
	public int					nAlarmOutLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Channel Mask 
	 * \else
	 * @)U91(>/Jd3vM(5@QZBk
	 * \endif
	 */
	public int					dwExAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Enable 
	 * \else
	 * @)U91(>/Jd3vJ9D\
	 * \endif
	 */
	public boolean				bExAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage 
	 * \else
	 * TFL(A*6/On
	 * \endif
	 */
	CFG_PTZ_LINK				stuPtzLink[] = new CFG_PTZ_LINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage Enable 
	 * \else
	 * TFL(A*6/J9D\
	 * \endif
	 */
	public boolean				bPtzLinkEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Channel Mask 
	 * \else
	 * BVQ/M(5@QZBk
	 * \endif
	 */
	public int					dwTourMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Enable 
	 * \else
	 * BVQ/J9D\
	 * \endif
	 */
	public boolean				bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Channel No. Mask 
	 * \else
	 * ?lUUM(5@:EQZBk
	 * \endif
	 */
	public int					dwSnapshot[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Enable 
	 * \else
	 * ?lUUJ9D\
	 * \endif
	 */
	public boolean				bSnapshotEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Period(Second) 
	 * \else
	 * A,EDV\FZ(Ck)
	 * \endif
	 */
	public int					nSnapshotPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Times 	
	 * \else
	 * A,ED4NJ}
	 * \endif
	 */
	public int					nSnapshotTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Local News Prompt 
	 * \else
	 * 1>5XO{O"?rLaJ>
	 * \endif
	 */
	public boolean				bTipEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Send Email#,Picture As Attach 
	 * \else
	 * 7"KMSJ<~#,Hg9{SPM<F,#,WwN*8=<~
	 * \endif
	 */
	public boolean				bMailEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload to Alarm Server 
	 * \else
	 * IO4+5=1(>/7~NqFw
	 * \endif
	 */
	public boolean				bMessageEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Beep 
	 * \else
	 * 7dCy
	 * \endif
	 */
	public boolean				bBeepEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Prompt 
	 * \else
	 * SoRtLaJ>
	 * \endif
	 */
	public boolean				bVoiceEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix Channel Mask 
	 * \else
	 * A*6/JSF5>XUsM(5@QZBk
	 * \endif
	 */
	public int					dwMatrixMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix 
	 * \else
	 * A*6/JSF5>XUs
	 * \endif
	 */
	public boolean				bMatrixEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Start Delay Time#,s is the Unit 0-15 
	 * \else
	 * A*6/?*J<QSJ1J1<d(Ck)#,0#-15
	 * \endif
	 */
	public int					nEventLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * If Record Log 
	 * \else
	 * JG7q<GB<HUV>
	 * \endif
	 */
	public boolean				bLogEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Then Take Effect When Setting#,Unit is Second 
	 * \else
	 * IhVCJ1OHQSJ1TYIzP'#,5%N;N*Ck
	 * \endif
	 */
	public int					nDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay Tip Tile To Video!#Overlay Tile Includes Event Type#,Channel No.#,Count By Second
	 * \else
	 * 5~<SLaJ>WVD;5=JSF5!#5~<S5DWVD;0|@(JB<~@`PM#,M(5@:E#,Ck<FJ1!#
	 * \endif
	 */
	public boolean				bVideoMessageEn;
	
	/**
	 * \if ENGLISH_LANG
	 * MMS Enable 
	 * \else
	 * 7"KM2JPEJ9D\
	 * \endif
	 */
	public boolean				bMMSEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Message Send To Network Enable
	 * \else
	 * O{O"IO4+8xMxBgJ9D\
	 * \endif
	 */
	public boolean				bMessageToNetEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Touring Split Mode 0: 1 Picture; 1: 8Picture 
	 * \else
	 * BVQ2J15D7V8nD#J= 0: 1;-Cf; 1: 8;-Cf
	 * \endif
	 */
	public int					nTourSplit;
	
	/**
	 * \if ENGLISH_LANG
	 * If Overlay Snapshot Title 
	 * \else
	 * JG7q5~<SM<F,1jLb
	 * \endif
	 */
	public boolean				bSnapshotTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ config 
	 * \else
	 * TFL(EdVCJ}
	 * \endif
	 */
	public int                  nPtzLinkExNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Extension PTZ 
	 * \else
	 * @)U9TFL(PEO"
	 * \endif
	 */
	CFG_PTZ_LINK_EX     		stuPtzLinkEx[] = new CFG_PTZ_LINK_EX[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content no.
	 * \else
	 * M<F,1jLbDZH]J}
	 * \endif
	 */
	public int                  nSnapTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content 
	 * \else
	 * M<F,1jLbDZH]
	 * \endif
	 */
	CFG_EVENT_TITLE     		stuSnapshotTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * email detail 
	 * \else
	 * SJ<~OjO8DZH]
	 * \endif
	 */
	CFG_MAIL_DETAIL     		stuMailDetail = new CFG_MAIL_DETAIL();
	
	/**
	 * \if ENGLISH_LANG
	 * overlay video title or not, for main stream 
	 * \else
	 * JG7q5~<SJSF51jLb#,VwR*V8VwBkAw
	 * \endif
	 */
	public boolean              bVideoTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content no. 
	 * \else
	 * JSF51jLbDZH]J}D?
	 * \endif
	 */
	public int                  nVideoTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content 
	 * \else
	 * JSF51jLbDZH]
	 * \endif
	 */
	CFG_EVENT_TITLE     		stuVideoTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * tour activation number 
	 * \else
	 * BVQ/A*6/J}D?
	 * \endif
	 */
	public int                  nTourNum;
	
	/**
	 * \if ENGLISH_LANG
	 * tour avtivation config 
	 * \else
	 * BVQ/A*6/EdVC
	 * \endif
	 */
	CFG_TOURLINK        		stuTour[] = new CFG_TOURLINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * specify data library releted no. 
	 * \else
	 * V86(J}>]?b9X<|WV5DSPP'J}
	 * \endif
	 */
	public int                  nDBKeysNum;
	
	/**
	 * \if ENGLISH_LANG
	 * specify event detail needed data library key 
	 * \else
	 * V86(JB<~OjO8PEO"@oPhR*P45=J}>]?b5D9X<|WV
	 * \endif
	 */
	public char                 szDBKeys[][] = new char[FinalVar.MAX_DBKEY_NUM][FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * overlay to JPEG summary 
	 * \else
	 * 5~<S5=JPEGM<F,5DU*R*PEO"
	 * \endif
	 */
	public byte                 byJpegSummary[] = new byte[FinalVar.MAX_SUMMARY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * compensate light or not 
	 * \else
	 * JG7qJ9D\299b5F
	 * \endif
	 */
	public boolean              bFlashEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * light compensation delay(s), delay range#:[10,300] 
	 * \else
	 * 299b5FQSJ1J1<d(Ck),QSJ1J1<d76N'#:[10,300]
	 * \endif
	 */
	public int                  nFlashLatch;
	
	public boolean				abAudioFileName;
	public boolean				abAlarmBellEn;
	public boolean				abAccessControlEn;
	public boolean				abAccessControl;
	
	/**
	 * \if ENGLISH_LANG
	 * The Absolute Path to the Linkage Audio Files 
	 * \else
	 * A*6/SoRtND<~>x6TB7>6
	 * \endif
	 */
	public byte[]				szAudioFileName = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Warning Signal Enable 
	 * \else
	 * >/:EJ9D\
	 * \endif
	 */
	public boolean				bAlarmBellEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Enable 
	 * \else
	 * CE={J9D\
	 * \endif
	 */
	public boolean				bAccessControlEn; 
	
	/**
	 * \if ENGLISH_LANG
	 * Class Number of Entrance Guard 
	 * \else
	 * CE={WiJ}
	 * \endif
	 */
	public int					dwAccessControl; 
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Linkage Operation Information 
	 * \else
	 * CE={A*6/2YWwPEO"
	 * \endif
	 * @see EM_CFG_ACCESSCONTROLTYPE
	 */
	public int[] 				emAccessControlType = new int[FinalVar.MAX_ACCESSCONTROL_NUM];
	
	public boolean				abTalkBack;	
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Linkage Information
	 * \else
	 * SoRt:t=PA*6/PEO"
	 * \endif
	 */
	public CFG_TALKBACK_INFO	stuTalkback = new CFG_TALKBACK_INFO();

	public boolean				abPSTNAlarmServer;

	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Linkage Information
	 * \else
	 *  5g;01(>/VPPDA*6/PEO"
	 * \endif
	 */
	public CFG_PSTN_ALARM_SERVER	stuPSTNAlarmServer = new CFG_PSTN_ALARM_SERVER();
	
	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Linkage Information
	 * \else
	 * Event Response Timetable
	 * \endif
	 */
    public CFG_TIME_SCHEDULE       stuTimeSection = new CFG_TIME_SCHEDULE(); 
    
    public boolean				abAlarmBellLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * Police no. output delay time(10-300 s) 
	 * \else
	 * >/:EJd3vQSJ1J1<d(10-300Ck)
	 * \endif
	 */
	public int					nAlarmBellLatch; 
	
	public CFG_ALARM_MSG_HANDLE() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; i++) {
			stuPtzLink[i] = new CFG_PTZ_LINK();
			stuPtzLinkEx[i] = new CFG_PTZ_LINK_EX();
			stuSnapshotTitle[i] = new CFG_EVENT_TITLE();
			stuVideoTitle[i] = new CFG_EVENT_TITLE();
			stuTour[i] = new CFG_TOURLINK();
		}
	}
}

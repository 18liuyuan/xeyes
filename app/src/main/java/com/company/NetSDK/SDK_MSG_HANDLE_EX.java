package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm relay structure
 * \else
 * 1(>/A*6/@)U9=a99Le
 * \endif
 */
public class SDK_MSG_HANDLE_EX implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current alarm supporting methods, shown by bit mask
	 * Message triggered methods,multiple methods,including
	 * 0x00000001 - alarm upload
	 * 0x00000002 - triggering recording
	 * 0x00000004 - PTZ movement
	 * 0x00000008 - sending email
	 * 0x00000010 - local tour
	 * 0x00000020 - local tips
	 * 0x00000040 - alarm output
	 * 0x00000080 - ftp upload
	 * 0x00000100 - buzzer
	 * 0x00000200 - voice tips 
	 * 0x00000400 - snapshot
	 * \else
	 * 51G01(>/KyV'3V5D4&@m7=J=#,04N;QZBk1mJ>
	 * O{O"4&@m7=J=#,?IRTM,J16`VV4&@m7=J=#,0|@(
     * 0x00000001 - 1(>/IO4+
     * 0x00000002 - A*6/B<Os
     * 0x00000004 - TFL(A*6/
     * 0x00000008 - 7"KMSJ<~
     * 0x00000010 - 1>5XBVQ2
     * 0x00000020 - 1>5XLaJ>
     * 0x00000040 - 1(>/Jd3v
     * 0x00000080 - FtpIO4+
     * 0x00000100 - 7dCy
     * 0x00000200 - SoRtLaJ>
     * 0x00000400 - W%M<
	 * \endif
	 */
	public int               dwActionMask;

	/**
	 * \if ENGLISH_LANG
	 * Triggering action,shown by bit mask,concrete action parameter is shows in the configuration
	 * \else
	 * 4%7"6/Ww#,04N;QZBk1mJ>#,>_Le6/WwKyPhR*5D2NJ}TZ8wWT5DEdVCVPLeOV
	 * \endif
	 */
	public int               dwActionFlag;
    
	/**
	 * \if ENGLISH_LANG
	 * Triggering alarm output channel,1 means triggering this output
	 * \else
	 * 1(>/4%7"5DJd3vM(5@#,1(>/4%7"5DJd3v#,N*11mJ>4%7"8CJd3v
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm lasting period
	 * \else
	 * 1(>/3VPxJ1<d
	 * \endif
	 */
    public int               dwDuration;

    /**
	 * \if ENGLISH_LANG
	 * Record channel triggered by alarm,1 means triggering this channel
	 * \else
	 * 1(>/4%7"5DB<OsM(5@#,N*11mJ>4%7"8CM(5@
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Recording period
	 * \else
	 * B<Os3VPxJ1<d
	 * \endif
	 */
    public int               dwRecLatch;

    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * W%M<M(5@
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * BVQ2M(5@
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * PTZ movement
	 * \else
	 * TFL(A*6/
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Event delay time, s for unit,range is 0~15,default is 0
	 * \else
	 * A*6/?*J<QSJ1J1<d#,sN*5%N;#,76N'JG0~15#,D,HOV5JG0
	 * \endif
	 */
    public int               dwEventLatch;

    /**
	 * \if ENGLISH_LANG
	 * Alarm trigerring wireless output,alarm output,1 for trigerring output
	 * \else
	 * 1(>/4%7"5DN^O_Jd3vM(5@#,1(>/4%7"5DJd3v#,N*11mJ>4%7"8CJd3v
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Message triggering alarm enabling
	 * \else
	 * 6LPE1(>/J9D\
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * the number of sheets of drawings
	 * \else
	 * 6LPE7"KMW%M<UEJ}
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix output enable
	 * \else
	 * >XUsJ9D\
	 * \endif
	 */
    public byte                bMatrixEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix mask
	 * \else
	 * >XUsQZBk
	 * \endif
	 */
    public int               dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enable,only used in WTN motion detection
	 * \else
	 * HUV>J9D\#,D?G0V;SPTZWTN6/L,<l2bVPJ9SC
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot frame interval. System can snapshot regularly at the interval you specify here. The snapshot amount in a period of time also has relationship with the snapshot frame rate. 0 means there is no interval, system just snapshot continuously.
	 * \else
	 * W%M<V!<d8t#,C?8t6`IYV!W%R;UEM<F,#,R;6(J1<dDZW%ED5DUEJ};9SkW%M<V!BJSP9X!#01mJ>2;8tV!#,A,PxW%ED!#
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel 32-63
	 * \else
	 * BVQ2M(5@ 32-63B7
	 * \endif
	 */
    public byte                byTour2[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 0,picture,1,record
	 * \else
	 * 0#,M<F,8=<~#,1#,B<Oq8=<~
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * max record length,unit:MB
	 * \else
	 * 8=<~B<OqJ15DWn4s3$6H#,5%N;MB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * max time length, unit:second
	 * \else
	 * 8=<~JGB<OqJ1Wn4sJ1<d3$6H#,5%N;Ck
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM_EX; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}

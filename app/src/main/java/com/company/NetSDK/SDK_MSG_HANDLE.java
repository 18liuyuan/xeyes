package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm activation structure
 * \else
 * 1(>/A*6/=a99Le
 * \endif
 */
public class SDK_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The current alarm processing support bitwise mask:
	 * Message processing manner, while a variety of treatment,Include
	 * <table>
	 * <tr><td>0x00000001</td><td>Alarm upload</td></tr>
	 * <tr><td>0x00000002</td><td>activation video</td></tr>
	 * <tr><td>0x00000004</td><td>PTZ activation</td></tr>
	 * <tr><td>0x00000008</td><td>Send Email</td></tr>
	 * <tr><td>0x00000010</td><td>Tour</td></tr>
	 * <tr><td>0x00000020</td><td>Local Tip</td></tr>
	 * <tr><td>0x00000040</td><td>Alarm output</td></tr>
	 * <tr><td>0x00000080</td><td>Ftp upload</td></tr>
	 * <tr><td>0x00000100</td><td>Buzzer</td></tr>
	 * <tr><td>0x00000200</td><td>Voice prompts</td></tr>
	 * <tr><td>0x00000400</td><td>Snoapshot</td></tr>
	 * </table>
	 * \else
	 * 51G01(>/KyV'3V5D4&@m7=J=#,04N;QZBk1mJ>:
	 * O{O"4&@m7=J=#,?IRTM,J16`VV4&@m7=J=#,0|@(
	 * <table>
	 * <tr><td>0x00000001</td><td>1(>/IO4+</td></tr>
	 * <tr><td>0x00000002</td><td>A*6/B<Os</td></tr>
	 * <tr><td>0x00000004</td><td>TFL(A*6/</td></tr>
	 * <tr><td>0x00000008</td><td>7"KMSJ<~</td></tr>
	 * <tr><td>0x00000010</td><td>1>5XBVQ2</td></tr>
	 * <tr><td>0x00000020</td><td>1>5XLaJ></td></tr>
	 * <tr><td>0x00000040</td><td>1(>/Jd3v</td></tr>
	 * <tr><td>0x00000080</td><td>FtpIO4+</td></tr>
	 * <tr><td>0x00000100</td><td>7dCy</td></tr>
	 * <tr><td>0x00000200</td><td>SoRtLaJ></td></tr>
	 * <tr><td>0x00000400</td><td>W%M<</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 dwActionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger action, according to the bit mask indicates that the parameters needed by the specific operation is reflected in the respective configuration
	 * \else
	 * 4%7"6/Ww#,04N;QZBk1mJ>#,>_Le6/WwKyPhR*5D2NJ}TZ8wWT5DEdVCVPLeOV
	 * \endif
	 */
	public int                 dwActionFlag;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm trigger output channel, alarm trigger output to trigger the output to 1
	 * \else
	 * 1(>/4%7"5DJd3vM(5@#,1(>/4%7"5DJd3v#,N*11mJ>4%7"8CJd3v
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm duration time
	 * \else
	 * 1(>/3VPxJ1<d
	 * \endif
	 */
    public int                 dwDuration;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation video, alarm-triggered video channel for 1 to trigger the channel
	 * \else
	 * A*6/B<Os#,1(>/4%7"5DB<OsM(5@#,N*11mJ>4%7"8CM(5@
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Record duration time.
	 * \else
	 * B<Os3VPxJ1<d.
	 * \endif
	 */
    public int                 dwRecLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * W%M<M(5@
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * BVQ2M(5@
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * PTZ Activation
	 * \else
	 * TFL(A*6/
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * A*6/?*J<QSJ1J1<d#,sN*5%N;#,76N'JG0~15#,D,HOV5JG0
	 * \endif
	 */
    public int               dwEventLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * A*6/?*J<QSJ1J1<d#,sN*5%N;#,76N'JG0~15#,D,HOV5JG0
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Message upload network
	 * \else
	 * O{O"IO4+MxBg
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message alarm enable
	 * \else
	 * 6LPE1(>/J9D\
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message send snopshot picture number
	 * \else
	 * 6LPE7"KMW%M<UEJ}
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix enable
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
    public int                 dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enabled, only the WTN dynamic detection in use
	 * \else
	 * HUV>J9D\#,D?G0V;SPTZWTN6/L,<l2bVPJ9SC
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Capture frame interval, every how many frames to draw a picture, the number of sheets to capture a certain period of time with the capture frame rate. 0 means that not every frame, continuous capture
	 * \else
	 * W%M<V!<d8t#,C?8t6`IYV!W%R;UEM<F,#,R;6(J1<dDZW%ED5DUEJ};9SkW%M<V!BJSP9X!#01mJ>2;8tV!#,A,PxW%ED
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * 0,Image Attachment,1,Video Attachment
	 * \else
	 * 0#,M<F,8=<~#,1#,B<Oq8=<~
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * Annex Videorecording maximum length, the unit MB
	 * \else
	 * 8=<~B<OqJ15DWn4s3$6H#,5%N;MB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * Attached is the maximum length of time in the video,Unit is second
	 * \else
	 * 8=<~JGB<OqJ1Wn4sJ1<d3$6H#,5%N;Ck
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}

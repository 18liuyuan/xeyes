package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Positioning Info Alarm
 * \else
 * TFL(6(N;PEO"1(>/
 * \endif
 */
public class ALARM_PTZ_LOCATION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E 
	 * \endif
	 */
	public int     nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ horizontal motion position#,valid within#:[0,3600]
	 * \else
	 * TFL(K.F=TK6/N;VC#,SPP'76N'#:[0,3600]
	 * \endif
	 */
	public int     nPTZPan;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ vertical motion position, valid within#:[-1800,1800]
	 * \else
	 * TFL(49V1TK6/N;VC#,SPP'76N'#:[-1800,1800]
	 * \endif
	 */
	public int     nPTZTilt;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ iris change position, valid within#:[0,128]
	 * \else
	 * TFL(9bH&1d6/N;VC#,SPP'76N'#:[0,128]
	 * \endif
	 */
	public int     nPTZZoom;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion status, 0-unknow 1-motion 2-idle 
	 * \else
	 * TFL(TK6/W4L,, 0-N4V* 1-TK6/ 2-?UOP 
	 * \endif
	 */
	public byte    bState;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion#,0-preset#,1-line#,2-tour#,3-pattern#,4-horizontal rotate
	 * \else
	 * TFL(6/Ww#,0-T$VC5c#,1-O_I(#,2-Q2:=#,3-Q2<##,4-K.F=P}W*
	 * \endif
	 */
	public byte    bAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ focus status, 0-unknown, 1-motion status, 2-idle
	 * \else
	 * TFL(>[=9W4L,, 0-N4V*, 1-TK6/W4L,, 2-?UOP
	 * \endif
	 */
	public byte    bFocusState;
	
 	/**
	 * \if ENGLISH_LANG
	 * in period preset status is valid or not
	 * If currently report preset is preset within period, then it is 1#,others are 0
	 * \else
	 * TZJ1<d6NDZT$VC5cW4L,JG7qSPP'
	 * Hg9{51G0IO1(5DT$VC5cJGJ1<d6NDZ5DT$VC5c#,TrN*1#,FdK{Gi?vN*0
	 * \endif
	 */
	public byte    bEffectiveInTimeSection;
                                        
 	/**
	 * \if ENGLISH_LANG
	 * Tour ID
	 * \else
	 * Q2:=ID:E
	 * \endif
	 */
	public int     nPtzActionID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ position preset no.
	 * \else
	 * TFL(KyTZT$VC5c1`:E
	 * \endif
	 */
	public int     dwPresetID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Focus position
	 * \else
	 * >[=9N;VC
	 * \endif
	 */
	public float   fFocusPosition;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ ZOOM status#,0-unknown#,1-ZOOM#,2-idle
	 * \else
	 * TFL(ZOOMW4L,#,0-N4V*#,1-ZOOM#,2-?UOP
	 * \endif
	 */
	public byte    bZoomState;
	
 	/**
	 * \if ENGLISH_LANG
	 * No.#,for calibration of loss
	 * \else
	 * 0|Pr:E#,SCSZP#QiJG7q6*0|
	 * \endif
	 */
	public int     dwSequence;
	
 	/**
	 * \if ENGLISH_LANG
	 * Corresponding UTC(1970-1-1 00:00:00) second.
	 * \else
	 * 6TS&5DUTC(1970-1-1 00:00:00)CkJ}!#
	 * \endif
	 */
	public int     dwUTC;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input options
 * \else
 * JSF5JdHkG06KQ!On
 * \endif
 */
public class CFG_VIDEO_IN_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * BLC:Range value depends on device capacity set, 0-off, 1-BLC level 1, 2- BLC level 2...n-max BLC level
	 * \else
	 * 139b293%#:H!V576N'H!>vSZIh18D\A&</#:0-9X1U1-FtSC2-V86(GxSr139b293%
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * Day/night mode; 0-color.1-automatic switch according to the brightness.2- black/white
	 * \else
	 * HU/R9D#J=#;0-W\JG2JI+#,1-8y>]AA6HWT6/GP;;#,2-W\JG:Z0W
	 * \endif
	 */
	public byte				byDayNightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * WB. 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * 0WF=:b, 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Color temperature level. valid when WB is "CustomColorTemperature" .
	 * \else
	 * I+NB5H<6, 0WF=:bN*"CustomColorTemperature"D#J=OBSPP'
	 * \endif
	 */
	public byte				byColorTemperature;
	
	/**
	 * \if ENGLISH_LANG
	 * Mirror
	 * \else
	 * >5Oq
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * 7-W*
	 * \endif
	 */
	public boolean				bFlip;
	
	/**
	 * \if ENGLISH_LANG
	 * Iris automatic
	 * \else
	 * WT6/9bH&
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto enable IR compensation light according to the environment.
	 * \else
	 * 8y>];7>39bWT6/?*Ft:lMb293%5F
	 * \endif
	 */
	public boolean				bInfraRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Red gain red. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * :lI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte				byGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain setup. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * @6I+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * BLI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte				byGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1, 2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 custom exposure time (n==byExposureEn)
	 * \else
	 * FX9bD#J=#;H!V576N'H!>vSZIh18D\A&</#:0-WT6/FX9b#,1-FX9b5H<61#,2-FX9b5H<62!-n-1Wn4sFX9b5H<6J} n4xJ1<dIOOBO^5DWT6/FX9b n+1WT6(ReJ1<dJV6/FX9b (n==byExposureEn#)
	 * \endif
	 */
	public byte				byExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure value min limit or manual axposure custom, unit is millisecond (0.1ms~80ms).
	 * \else
	 * WT6/FX9bJ1<dOBO^;rU_JV6/FX9bWT6(ReJ1<d,:ACkN*5%N;#,H!V50.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure time max limit, unit is millisecond (0.1ms~80ms)
	 * \else
	 * WT6/FX9bJ1<dIOO^,:ACkN*5%N;#,H!V50.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto gain 
	 * \else
	 * WT6/TvRf
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max gain automatic limit, otherwise, it is fixed value gain
	 * \else
	 * TvRf5w=Z, GainAutoN*trueJ11mJ>WT6/TvRf5DIOO^#,7qTr1mJ>9L6(5DTvRfV5
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format, 0-Inside (internal input).1-BT656 2-720p 3-1080p  4-1080i  5-1080sF 
	 * \else
	 * PE:E8qJ=, 0-Inside(DZ2?JdHk) 1-BT656 2-720p 3-1080p  4-1080i  5-1080sF
	 * \endif
	 */
	public byte				bySignalFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-non-rotate, 1- rotate 90 clockwise, 2-rotate 90 counterclockwise
	 * \else
	 * 0-2;P}W*#,1-K3J1Uk90!c#,2-DfJ1Uk90!c
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * External sych phase set up.0~360	
	 * \else
	 * MbM,2=5DO`N;IhVC 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * External sync signal input, 0-INT. 1- LL
	 * \else
	 * Mb2?M,2=PE:EJdHk,0-DZ2?M,2= 1-Mb2?M,2=
	 * \endif
	 */
	public byte                byExternalSync;
	
	/**
	 * \if ENGLISH_LANG
	 * Double exposure, 0-not use, 1-double exposure with full frame, as image and video differentiated only in parameter  2- double  exposure with half frame, as image and and video differentiated completely
	 * \else
	 * K+?lCE, 0-2;FtSC#,1-K+?lCEH+V!BJ#,<4M<Oq:MJSF5V;SP?lCE2NJ}2;M,#,2-K+?lCE0kV!BJ#,<4M<Oq:MJSF5?lCE<00WF=:b2NJ}>y2;M,
	 * \endif
	 */
	public byte				byDoubleExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * WDR value
	 * \else
	 * ?m6/L,V5
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night config
	 * \else
	 * R9Mm2NJ}
	 * \endif
	 */
	public CFG_VIDEO_IN_NIGHT_OPTIONS stuNightOptions = new CFG_VIDEO_IN_NIGHT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * Flashling config 
	 * \else
	 * IA9b5FEdVC
	 * \endif
	 */
	public CFG_FLASH_CONTROL	stuFlash = new CFG_FLASH_CONTROL();
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot option, doule exposure only
	 * \else
	 * W%ED2NJ}, K+?lCEJ1SPP'
	 * \endif
	 */
	public CFG_VIDEO_IN_SNAPSHOT_OPTIONS stuSnapshot = new CFG_VIDEO_IN_SNAPSHOT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye
	 * \else
	 * ScQ[>5M7
	 * \endif
	 */
	public CFG_FISH_EYE        stuFishEye = new CFG_FISH_EYE();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-off!j?1-easy focus!j?2-auto focus
	 * \else
	 * 0-9X1U#,1-8(Vz>[=9#,2-WT6/>[=9
	 * \endif
	 */
	public byte                byFocusMode;
	
	/**
	 * \if ENGLISH_LANG
	 * min gain
	 * \else
	 * TvRfOBO^
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * max gain
	 * \else
	 * TvRfIOO^
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode 0-Outdoor 1-50Hz prevent flashing 2-60Hz prevent flashing
	 * \else
	 * 7@IAK8D#J= 0-Outdoor 1-50Hz7@IAK8 2-60Hz7@IAK8
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,0-auto,1-plus,4-manual
	 * \else
	 * FX9bD#J=5w=Z FX9b5H<6N*WT6/FX9bJ1SPP'#,H!V5#:0-D,HOWT6/#,1-TvRfSEOH#,2-?lCESEOH,4-JV6/
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition[1~100] 0-close
	 * \else
	 * G?9bRVVF 0-9X1U#, 1~100N*76N'V5
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * back light region       
	 * \else
	 * 139b293%GxSr
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * normal option
	 * \else
	 * FUM(2NJ}
	 * \endif
	 */
	public CFG_VIDEO_IN_NORMAL_OPTIONS stuNormalOptions = new CFG_VIDEO_IN_NORMAL_OPTIONS();
}

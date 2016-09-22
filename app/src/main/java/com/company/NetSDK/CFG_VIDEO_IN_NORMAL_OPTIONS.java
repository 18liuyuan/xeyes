package com.company.NetSDK;

import java.io.Serializable;

public class CFG_VIDEO_IN_NORMAL_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1,2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 custom exposure time (n==byExposureEn)
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
	 * WB. White 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * 0WF=:b, 0-"Disable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max auto gain limit, otherwise, it is fixed value gain.
	 * \else
	 * 0~100, GainAutoN*trueJ11mJ>WT6/TvRf5DIOO^#,7qTr1mJ>9L6(5DTvRfV5
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Gain
	 * \else
	 * WT6/TvRf
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Iris
	 * \else
	 * WT6/9bH&
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~360 LL Phase
	 * \else
	 * MbM,2=5DO`N;IhVC 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * gain min
	 * \else
	 * TvRfOBO^
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * gain max
	 * \else
	 * TvRfIOO^
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight:ability to set value range depends on the device,0-close 1-open 2-backlingt compensation specified area
	 * \else
	 * 139b293%#:H!V576N'H!>vSZIh18D\A&</#:0-9X1U1-FtSC2-V86(GxSr139b293%
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode,0- out door, 1-50HZ prevent flashing,2-60HZ prevent flashing
	 * \else
	 * 7@IAK8D#J= 0-Outdoor 1-50Hz7@IAK8 2-60Hz7@IAK8
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * day or night,0-colour,1-according to the brightness auromatically switches,2-black and white
	 * \else
	 * HU/R9D#J=#;0-W\JG2JI+#,1-8y>]AA6HWT6/GP;;#,2-W\JG:Z0W
	 * \endif
	 */
	public byte				byDayNightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,0-auto,1-plus,2-shutter
	 * \else
	 * FX9bD#J=5w=Z FX9b5H<6N*WT6/FX9bJ1SPP'#,H!V5#:0-D,HOWT6/#,1-TvRfSEOH#,2-?lCESEOH
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-not rotate,1-deasil 90,2-deasil 90
	 * \else
	 * 0-2;P}W*#,1-K3J1Uk90!c#,2-DfJ1Uk90!c
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * mirror
	 * \else
	 * >5Oq
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * wide dynamic range[1~100],0-close
	 * \else
	 * ?m6/L,V5 0-9X1U#,1~100-N*UfJ576N'V5
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition,0-close,[1-100]
	 * \else
	 * G?9bRVVF 0-9X1U#, 1~100N*76N'V5
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight region
	 * \else
	 * 139b293%GxSr
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-off!j?1-easy focus!j?2-auto focus
	 * \else
	 * 0-9X1U#,1-8(Vz>[=9#,2-WT6/>[=9
	 * \endif
	 */
	public byte                byFocusMode; 
}

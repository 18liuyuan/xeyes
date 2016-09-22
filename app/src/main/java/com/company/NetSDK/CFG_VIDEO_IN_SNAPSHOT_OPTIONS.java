package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot special config
 * \else
 * W%ED2NJ}LXJbEdVC
 * \endif
 */
public class CFG_VIDEO_IN_SNAPSHOT_OPTIONS implements Serializable {
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
	 * BLI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * @6I+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
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
	 * Auto gain 
	 * \else
	 * WT6/TvRf
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * When GainAuto is true, it is max auto gain limit, otherwise, it is fixed value gain
	 * \else
	 * TvRf5w=Z, GainAutoN*trueJ11mJ>WT6/TvRf5DIOO^#,7qTr1mJ>9L6(5DTvRfV5
	 * \endif
	 */
	public byte				byGain;
}

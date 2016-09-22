package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Night special configuration
 * \else
 * R9MmLXJbEdVC
 * \endif
 */
public class SDKDEV_NIGHTOPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0 - switch 1- Switch
	 * \else
	 * 0-2;GP;;#,1-GP;;
	 * \endif
	 */
	public byte  bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Approximate sunrise and sunset times, after sunset and before sunrise, the night special configuration.00:00:00 ~23:59:59
	 * \else
	 * 4sVBHU3v:MHUBdJ1<d#,HUBdV.:sHU3vV.G0#,=+2ISCR9MmLXJb5DEdVC!#00:00:00 ~23:59:59
	 * \endif
	 */
	public byte  bSunriseHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * M,IO
	 * \endif
	 */
	public byte  bSunriseMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * M,IO
	 * \endif
	 */
	public byte  bSunriseSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * M,IO
	 * \endif
	 */
	public byte  bSunsetHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * M,IO
	 * \endif
	 */
	public byte  bSunsetMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * M,IO
	 * \endif
	 */
	public byte  bSunsetSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \else
	 * 0WF=:b 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \endif
	 */
	public byte  bWhiteBalance ;
	
	/**
	 * \if ENGLISH_LANG
	 * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * :lI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte  bGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * @6I+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte  bGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * BLI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
	 * \endif
	 */
	public byte  bGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~100
	 * \else
	 * 0~100
	 * \endif
	 */
	public byte  bGain;
	
	/**
	 * \if ENGLISH_LANG
	 * 0 -Dose not automatic gain 1 - automatic gain
	 * \else
	 * 0-2;WT6/TvRf 1-WT6/TvRf
	 * \endif
	 */
	public byte  bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness values 0~100
	 * \else
	 * AA6HV5 0~100
	 * \endif
	 */
	public byte  bBrightnessThreshold ;
	
	/**
	 * \if ENGLISH_LANG
	 * Level reference value 0~100
	 * \else
	 * 5gF=2N?<V5 0~100
	 * \endif
	 */
	public byte  ReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * The range depends on the device capability set: 0 - AE 1 ~ n-1-manual exposure and lower limits on the level n-band time automatic exposure n +1- custom time manual exposure (n represents the number of exposure level support) 
	 * \else
	 * H!V576N'H!>vSZIh18D\A&</#:0-WT6/FX9b 1~n-1-JV6/FX9b5H<6 n-4xJ1<dIOOBO^5DWT6/FX9b n+1-WT6(ReJ1<dJV6/FX9b (n1mJ>V'3V5DFX9b5H<6J}) 
	 * \endif
	 */
	public byte  bExposureSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure to the lower limit of custom or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
	 * \else
	 * WT6/FX9bJ1<dOBO^;rU_JV6/FX9bWT6(ReJ1<d,:ACkN*5%N;#,H!V50.1ms~80ms
	 * \endif
	 */
	public float ExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
	 * \else
	 * WT6/FX9bJ1<dIOO^,:ACkN*5%N;#,H!V50.1ms~80ms
	 * \endif
	 */
	public float ExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable auto iris, 1 Open, 0 Close
	 * \else
	 * WT6/9bH&J9D\,1?*Ft,09X1U
	 * \endif
	 */
	public byte  bAutoApertureEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Wide dynamic value Range is determined by the ability
	 * \else
	 * ?m6/L,V5 H!V576N'SID\A&>v6(
	 * \endif
	 */
	public byte  bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase 0~360 
	 * \else
	 * R9MmO`N; 0~360
	 * \endif
	 */
	public short  wNightSyncValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase of 0 to 999 (thousandth of a degree), in combination with wNightSyncValue constituting the phase values ??in the evening
	 * \else
	 * R9MmO`N;0~999(G'7VV.R;6H),SkwNightSyncValueWi:O993IR9MmO`N;V5
	 * \endif
	 */
	public short  wNightSyncValueMillValue;
}

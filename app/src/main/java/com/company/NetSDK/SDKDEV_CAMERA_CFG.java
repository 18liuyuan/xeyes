package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Properties of the camera configuration
 * \else
 * IcOqM7JtPTEdVC
 * \endif
 */
public class SDKDEV_CAMERA_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range depends on the device capability set: 0 - auto exposure, 1 - exposure level 1,2 - exposure level 2 ... n-maximum exposure level number
	 * \else
	 * FX9bD#J=#;H!V576N'H!>vSZIh18D\A&</#:0-WT6/FX9b#,1-FX9b5H<61#,2-FX9b5H<62!-n-Wn4sFX9b5H<6J}
	 * \endif
	 */
	public byte                bExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation: BLC Level range depends on the device capability set, 0 - off, 1 - backlight compensation intensity 1,2 - backlight compensation strength ... n-backlight compensation level number
	 * \else
	 * 139b293%#:139b293%5H<6H!V576N'H!>vSZIh18D\A&</#,0-9X1U#,1-139b293%G?6H1#,2-139b293%G?6H2!-n-Wn4s139b293%5H<6J}
	 * \endif
	 */
    public byte                bBacklight;
    
    /**
     * \if ENGLISH_LANG
     * Day / Night mode (color); 2: open (black and white), 1: Auto: Off
     * \else
     * HU/R9D#J=#;2#:?*(:Z0W)#,1#:WT6/#,0#:9X(2JI+) 
     * \endif
     */
    public byte                bAutoColor2BW;
    
    /**
     * \if ENGLISH_LANG
     * Mirror; 1: open, 0: Off
     * \else
     * >5Oq#;1#:?*#,0#:9X
     * \endif
     */
    public byte                bMirror;
    
    /**
     * \if ENGLISH_LANG
     * Flip; 1: ON, 0: OFF
     * \else
     * 7-W*#;1#:?*#,0#:9X
     * \endif
     */
    public byte                bFlip;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function capability: 1: support; 0: does not support
     * \else
     * WT6/9bH&9&D\D\A&: 1#:V'3V#;0 #:2;V'3V
     * \endif
     */
    public byte                bLensEn;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function: 1: Open the auto iris; 0: Turn off auto iris
     * \else
     * WT6/9bH&9&D\: 1:?*FtWT6/9bH&#;0: 9X1UWT6/9bH&
     * \endif
     */
    public byte                bLensFunction;
    
    /**
     * \if ENGLISH_LANG
     * White Balance 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \else
     * 0WF=:b 0:Disabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \endif
     */
    public byte                bWhiteBalance;
    
    /**
     * \if ENGLISH_LANG
     * Signal format0-Inside(Internal input) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \else
     * PE:E8qJ=0-Inside(DZ2?JdHk) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \endif
     */
    public byte                bSignalFormat;
    
    /**
     * \if ENGLISH_LANG
     * 0 - does not rotate, 1 - clockwise 90 !c, 2 - counterclockwise 90 !c
     * \else
     * 0-2;P}W*#,1-K3J1Uk90!c#,2-DfJ1Uk90!c
     * \endif
     */
    public byte                bRotate90;
    
    /**
     * \if ENGLISH_LANG
     * Level reference value 0~100
     * \else
     * 5gF=2N?<V5 0~100
     * \endif
     */
    public byte                bReferenceLevel;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure to the lower limit of custom or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
     * \else
     * WT6/FX9bJ1<dOBO^;rU_JV6/FX9bWT6(ReJ1<d,:ACkN*5%N;#,H!V50.1ms~80ms
     * \endif
     */
    public float               ExposureValue1;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
     * \else
     * WT6/FX9bJ1<dIOO^,:ACkN*5%N;#,H!V50.1ms~80ms
     * \endif
     */
    public float               ExposureValue2;
    
    /**
     * \if ENGLISH_LANG
     * The night configuration parameter options
     * \else
     * R9MmEdVC2NJ}Q!On
     * \endif
     */
    public SDKDEV_NIGHTOPTIONS  stuNightOptions = new SDKDEV_NIGHTOPTIONS();
    
    /**
     * \if ENGLISH_LANG
     * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
     * \else
     * :lI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
     * \endif
     */
    public byte                bGainRed;
    
    /**
     * \if ENGLISH_LANG
     * Blue gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * @6I+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
     * \endif
     */
    public byte                bGainBlue;
    
    /**
     * \if ENGLISH_LANG
     * Green gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * BLI+TvRf5w=Z#,0WF=:bN*"Custom"D#J=OBSPP' 0~100
     * \endif
     */
    public byte                bGainGreen;
    
    /**
     * \if ENGLISH_LANG
     * Flash mode, 0 - Close, 1 - always, 2 - Automatic 
     * \else
     * IA9b5F9$WwD#J=#,0-9X1U#,1-J<VU#,2-WT6/
     * \endif
     */
    public byte                bFlashMode;
    
    /**
     * \if ENGLISH_LANG
     * The the flash work values, 0-0us 1-64us-128us, ... 15-960us
     * \else
     * IA9b5F9$WwV5, 0-0us, 1-64us, 2-128us,...15-960us
     * \endif
     */
    public byte                bFlashValue;
    
    /**
     * \if ENGLISH_LANG
     * Flash trigger mode 0 - low level - high level
     * \else
     * IA9b5F4%7"D#J=0-5M5gF= 1-8_5gF=
     * \endif
     */
    public byte                bFlashPole;
    
    /**
     * \if ENGLISH_LANG
     * External sync signal input, 0 - internal sync - external synchronization
     * \else
     * Mb2?M,2=PE:EJdHk,0-DZ2?M,2= 1-Mb2?M,2=
     * \endif
     */
    public byte                bExternalSyncPhase;
    
    /**
     * \if ENGLISH_LANG
     * Flash brightness default values ??range from 0 to 100
     * \else
     * IA9b5FAA6HT$IhV5 Gx<d0~100
     * \endif
     */
    public byte                bFlashInitValue;
    
    /**
     * \if ENGLISH_LANG
     * Outside the synchronization phase set 0~360
     * \else
     * MbM,2=5DO`N;IhVC 0~360
     * \endif
     */
    public short                wExternalSyncValue ;
    
    /**
     * \if ENGLISH_LANG
     * 0 to 999 external synchronization phase (thousandth of a degree), and wExternalSyncValue combination constitute the external synchronization phase value
     * \else
     * MbM,2=5DO`N;IhVC0~999(G'7VV.R;6H),SkwExternalSyncValueWi:O993IMbM,2=5DO`N;V5
     * \endif
     */
    public short                wExternalSyncValueMillValue;
    
    /**
     * \if ENGLISH_LANG
     * Wide dynamic value Range is determined by the ability
     * \else
     * ?m6/L,V5 H!V576N'SID\A&>v6(
     * \endif
     */
    public byte                bWideDynamicRange;
    
    /**
     * \if ENGLISH_LANG
     * exposure compensation value,default is 7,range0~14
     * \else
     * FX9b293%V5#,D,HON*7#,76N'0~14
     * \endif
     */
    public byte                byExposureCompensation;
}

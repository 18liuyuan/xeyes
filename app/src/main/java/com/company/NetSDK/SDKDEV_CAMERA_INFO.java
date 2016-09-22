package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Camera properties
 * \else
 * IcOqM7JtPT
 * \endif
 */
public class SDKDEV_CAMERA_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Adjustable brightness 1#:Can#,0#:No 
	 * \else
	 * AA6H?I5w#;1#:?I#,0#:2;?I
	 * \endif
	 */
	public byte				bBrightnessEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable contrast 
	 * \else
	 * 6T1H6H?I5w
	 * \endif
	 */
	public byte				bContrastEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Color adjustable 
	 * \else
	 * I+6H?I5w
	 * \endif
	 */
	public byte				bColorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable Gain 
	 * \else
	 * TvRf?I5w
	 * \endif
	 */
	public byte				bGainEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Saturation adjustable 
	 * \else
	 * 1%:M6H?I5w
	 * \endif
	 */
	public byte				bSaturationEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation,0 means no backlight compensation,1 expressed support for a compensation (on, off) 
	 * \else
	 * 139b293% 01mJ>2;V'3V139b293%,11mJ>V'3VR;<6293%#(?*,9X#)#,21mJ>V'3VA=<6293%#(9X,8_,5M#)#,31mJ>V'3VH}<6293%#(9X,8_,VP,5M#)
	 * \endif
	 */
	public byte				bBacklightEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure select 0 indicates no support Exposure Control#,1 indicates that only support automatic exposure#,Number of other expressed support for the exposure speed rating#,+1 Level of manual control 
	 * \else
	 * FX9bQ!Tq: 0:1mJ>2;V'3VFX9b?XVF 1:1mJ>V;V'3VWT6/FX9b n:FX9b5D5H<6J}(11mJ>V'3VWT6/FX9b 2~n1mJ>V'3V5DJV6/?XVFFX9b5D5H<6)
	 * \endif
	 */
	public byte				bExposureEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable automatic color black conversion 
	 * \else
	 * WT6/2J:ZW*;;?I5w
	 * \endif
	 */
	public byte				bColorConvEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Attribute options; 1: can 0: not 
	 * \else
	 * JtPTQ!On#;1#:?I#,0#:2;?I
	 * \endif
	 */
	public byte				bAttrEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Mirror; 1: Support,0: does not support 
	 * \else
	 * >5Oq#;1#:V'3V#,0#:2;V'3V
	 * \endif
	 */
	public byte				bMirrorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn#;1: Support,0: does not support 
	 * \else
	 * 7-W*#;1#:V'3V#,0#:2;V'3V
	 * \endif
	 */
	public byte				bFlipEn;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 2 Support Profile#, 1 Support for white balance #,0 does not support 
	 * \else
	 * 0WF=:b 0-2;V'3V0WF=:b#,1-V'3VWT6/0WF=:b#,2-V'3VT$VC0WF=:b#(<4Gi>0D#J=#) 3-V'3VWT6(Re0WF=:b
	 * \endif
	 */
	public byte				iWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format mask#,Bitwise respectively, from low to high#:0-Inside(Inside) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF 
	 * \else
	 * PE:E8qJ=QZBk#,04N;4S5M5=8_N;7V1pN*#:0-Inside(DZ2?JdHk) 1- BT656 2-720p 3-1080i  4-1080p  5-1080sF
	 * \endif
	 */
	public byte				iSignalFormatMask;
	
	/**
	 * \if ENGLISH_LANG
	 * 90 degree rotation 0 - do not support, 1 - Support 
	 * \else
	 * 906HP}W* 0-2;V'3V 1-V'3V
	 * \endif
	 */
	public byte				bRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the auto exposure with time the upper and lower limits 
	 * \else
	 * JG7qV'3V4xJ1<dIOOBO^5DWT6/FX9b
	 * \endif
	 */
	public byte				bLimitedAutoExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support user-defined manual exposure time 
	 * \else
	 * JG7qV'3VSC;'WT6(ReJV6/FX9bJ1<d
	 * \endif
	 */
	public byte				bCustomManualExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the flash adjustment 
	 * \else
	 * JG7qV'3VIA9b5F5w=Z
	 * \endif
	 */
	public byte				bFlashAdjustEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support night options 
	 * \else
	 * JG7qV'3VR9MmQ!On
	 * \endif
	 */
	public byte				bNightOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the reference level set 
	 * \else
	 * JG7qV'3V2N?<5gF=IhVC
	 * \endif
	 */
	public byte             iReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support external sync signal input, 0 - not support, 1 - Support 
	 * \else
	 * JG7qV'3VMb2?M,2=PE:EJdHk#,0-2;V'3V#,1-V'3V
	 * \endif
	 */
	public byte             bExternalSyncInput;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval maximum exposure time, in milliseconds 
	 * \else
	 * WT6(ReFX9bGx<dWn4sFX9bJ1<d#,5%N;:ACk         
	 * \endif
	 */
	public short      		usMaxExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval mainimum exposure time, in milliseconds
	 * \else
	 * WT6(ReFX9bGx<dWnP!FX9bJ1<d#,5%N;:ACk
	 * \endif
	 */
	public short      		usMinExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Ability to wide dynamic range, 0 - indicates no support, 2 ~ n represents the maximum range values 
	 * \else
	 * ?m6/L,D\A&76N',0-1mJ>2;V'3V,2~n1mJ>Wn4s5D76N'V5
	 * \endif
	 */
	public byte             bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * The double shutter 0 does not support 1 - full frame rate supports dual shutter images and video only shutter parameter - Supports dual shutter half frame rate, image and video shutter 
	 * and white balance parameters are different - Supports dual shutter Full frame rate and half of the frame rate  
	 * \else
	 * K+?lCE02;V'3V,1-V'3VK+?lCEH+V!BJ#,<4M<Oq:MJSF5V;SP?lCE2NJ}2;M,#,2-V'3VK+?lCE0kV!BJ#,<4M<Oq:MJSF5?lCE<00WF=:b2NJ}>y2;M,#,3-V'3VK+?lCEH+V!BJ:M0kV!BJ
	 * \endif
	 */
	public byte             bDoubleShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 yes#, 0 no 
	 * \else
	 * 1V'3V#, 0 2;V'3V
	 * \endif
	 */
	public byte				byExposureCompensation;
}

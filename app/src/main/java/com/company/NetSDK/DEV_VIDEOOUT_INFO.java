package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device TV display info
 * \else
 * Ih18TVJd3v2NJ}PEO"
 * \endif
 */
public class DEV_VIDEOOUT_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,video standard mask,according to the bit which shows video format(not support now)
	 * \else
	 * NSP,JSF5VFJ=QZBk#,04N;1mJ>Ih18D\9;V'3V5DJSF5VFJ=(T]2;V'3V)
	 * \endif
	 */
	public int           dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,current format(not support now,please use DHDEV_SYSTEM_ATTR_CFG by VideoStandard to read and config the video format)
	 * \else
	 * NSP,51G05DVFJ=(T]2;V'3V#,GkJ9SCDHDEV_SYSTEM_ATTR_CFG5DbyVideoStandard6TVFJ=6AH!:MEdVC)
	 * \endif
	 */
	public int             nVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask,according the bit which shows video resolution
	 * \else
	 * 7V1fBJQZBk#,04N;1mJ>Ih18D\9;V'3V5D7V1fBJ
	 * \endif
	 */
	public int           dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Current resolution
	 * \else
	 * 51G05D7V1fBJ
	 * \endif
	 */
	public int             nImageSize;
}

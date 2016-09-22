package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel info of video input
 * \else
 * JSF5JdHkM(5@PEO"
 * \endif
 */
public class SDK_VIDEO_INPUTS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * M(5@C{3F
	 * \endif
	 */
	public byte                szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * ?XVFID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * VwBkAwurl5XV7
	 * \endif
	 */
	public byte                szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * 8(BkAwurl5XV7
	 * \endif
	 */
	public byte                szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * spare main stream address quantity
	 * \else
	 * 18SCVwBkAw5XV7J}A?
	 * \endif
	 */
	public int                 nOptionalMainUrlCount;
	
	/**
	 * \if ENGLISH_LANG
	 * spare main stream address list
	 * \else
	 * 18SCVwBkAw5XV7AP1m
	 * \endif
	 */
    public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * spare sub stream address quantity
	 * \else
	 * 18SC8(BkAw5XV7J}A?
	 * \endif
	 */
    public int                 nOptionalExtraUrlCount;
    
    /**
	 * \if ENGLISH_LANG
	 * spare substream address list
	 * \else
	 * 18SC8(BkAw5XV7AP1m
	 * \endif
	 */
    public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
}

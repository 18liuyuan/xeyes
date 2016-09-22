package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_DEV_SPEED_LIMIT_CFG configuration
 * \else
 * SDK_DEV_SPEED_LIMIT_CFG EdVC=a99
 * \endif
 */
public class SDKDEV_SPEED_LIMIT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable speed limit;1:enable,0:disable
	 * \else
	 * O^KYJ9D\1#:J9D\#;0#:2;J9D\!#
	 * \endif
	 */
	public byte                byEnable;

	/**
	 * \if ENGLISH_LANG
	 * upper speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * KY6HIOO^V5#:5%N;KM/H 01mJ>2;O^KY,4sSZ01mJ>O^KY
	 * \endif
	 */
	public short                wMaxSpeed;

	/**
	 * \if ENGLISH_LANG
	 * low speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * KY6HOBO^V5#:5%N;KM/H 01mJ>2;O^KY,4sSZ01mJ>O^KY
	 * \endif
	 */
	public short                wMinSpeed;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Information, INetSDK.QueryDevState, SDK_DEVSTATE_POWER_STATE
 * \else
 * 5g3XPEO", INetSDK.QueryDevState=S?Z5D SDK_DEVSTATE_POWER_STATE C|An2NJ}
 * \endif
 */
public class SDK_BATTERY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Battery Capacity Percentage
	 * \else
	 * 5g3XH]A?0Y7V1H
	 * \endif
	 */
	public int                 nPercent;

	/**
	 * \if ENGLISH_LANG
	 * Whether real charging
	 * \else
	 * JG7qUfU}3d5g
	 * \endif
	 */
	public boolean                bCharging;

	/**
	 * \if ENGLISH_LANG
	 * battery in-place status
	 * \else
	 * 5g3XTZN;W4L,
	 * \endif
	 */
	public int emExistState;

	/**
	 * \if ENGLISH_LANG
	 * battery power status
	 * \else
	 * 5g3X5gA?W4L,
	 * \endif
	 */
	public int	emState;
}

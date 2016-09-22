package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get bypass mode 
 * \else
 * ;qH!ETB7W4L,
 * \endif
 */
public class NET_DEVSTATE_GET_BYPASS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Number, member counts of array pnLocal
	 * \else
	 * 1>5X1(>/JdHkM(5@8vJ}, pnLocalJ}Wi5D3IT18vJ}
	 * \endif
	 */	
	public int nLocalCount;
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel ID, malloc by caller
	 * \else
	 * 1>5X1(>/JdHkM(5@:E, 5wSCU_IjGk?U<d
	 * \endif
	 */	
	public int pnLocal[];
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Number, member counts of array pnExtended
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@8vJ}, pnExtendedJ}Wi5D3IT18vJ}
	 * \endif
	 */	
	public int nExtendedCount;
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel ID, malloc by caller
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@:E, 5wSCU_IjGk?U<d
	 * \endif
	 */
	public int pnExtended[];

	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Statue, malloc by caller
	 * \else
	 * 1>5X1(>/JdHkM(5@W4L,, 5wSCU_IjGk?U<d, @`PMN*NET_BYPASS_MODE
	 * \endif
	 */
	public int pemLocal[];
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Statue, malloc by caller
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@W4L,, 5wSCU_IjGk?U<d, @`PMN*NET_BYPASS_MODE
	 * \endif
	 */
	public int pemExtended[];
}

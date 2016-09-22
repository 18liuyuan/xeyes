package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Failure Status, Output Parameter
 * \else
 * 1(>/9JUOW4L,, Jd3v2NJ}
 * \endif
 */
public class NET_OUT_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             nConnectFaultState;

	/**
	 * \if ENGLISH_LANG
	 * Bell valid number
	 * \else
	 * >/:ESPP'8vJ}
	 * \endif
	 */
	public int             nBell;

	/**
	 * \if ENGLISH_LANG
	 * Bell failure status info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * >/:E9JUOW4L,PEO" 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             anBellState[] = new int[FinalVar.SDK_MAX_BELL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure valid number
	 * \else
	 * <|EL9JUOSPP'8vJ}
	 * \endif
	 */
	public int             nFaultKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * <|EL9JUOPEO" 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             anFaultKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard valid vandal-proof number
	 * \else
	 * <|ELSPP'7@2p8vJ}
	 * \endif
	 */
	public int             nTamperKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * <|EL7@2pPEO" 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             anTamperKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid short circuit number
	 * \else
	 * 4+8PFwSPP'6LB78vJ}
	 * \endif
	 */
	public int             nShortOutSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor short circuit info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 4+8PFw6LB7PEO" 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             anShortOutSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid vandal-proof number
	 * \else
	 * 4+8PFwSPP'7@2p8vJ}
	 * \endif
	 */
	public int             nTamperSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 4+8PFw7@2pPEO" 0: N4V*, 1: U}3#, 2:9JUO
	 * \endif
	 */
	public int             anTamperSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];
}
                                     
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lift running parameter configuration
 * \else
 * 5gL]TKPP2NJ}EdVC
 * \endif
 */
public class SDKDEV_ELEVATOR_ATTRI_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max floor. Min is 2.
	 * \else
	 * Wn4sB%2c WnP!2
	 * \endif
	 */
	public int    nMAXFloorNum;

	/**
	 * \if ENGLISH_LANG
	 * Stay verification time ranges from 5-60. It regards as stop current floor if keep this time period.
	 * \else
	 * M#??EP6OJ1<d,5-60#;1#3V4KJ1<d3$6HHON*JG5gL]M#??4KB%2c!#
	 * \endif
	 */
	public int    nFloorDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * The max time for the lift to go up/down a floor. It regars the lift is malfunction if the time is out of the threshold. The lift stopsa between two floors.
	 * \else
	 * 5gL]IOPP;rOBPP>-9}R;2c5DWn4sJ1<d#,Hg9{3,9}4KJ1<d#,TrHON*5gL]9JUO#,=NOaM#V9AKA=2cV.<d!#
	 * \endif
	 */
	public int    nIntervalTime;
}

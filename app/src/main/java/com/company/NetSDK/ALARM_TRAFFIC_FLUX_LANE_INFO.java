package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flux alarm channel information
 * \else
 * AwA?M3<F1(>/M(5@PEO"
 * \endif
 */
public class ALARM_TRAFFIC_FLUX_LANE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * 51G0J1<d
	 * \endif
	 */
	public NET_TIME            stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * 355@:E
	 * \endif
	 */
	public int                 nLane;
	
 	/**
	 * \if ENGLISH_LANG
	 * state:1-traffic jam, 2-traffic jam recover, 3-normal 4-break, 5-break recover
	 * \else
	 * W4L,V5#:1-1mJ>S56B, 2-1mJ>S56B;V84, 3-1mJ>U}3#, 4-1mJ>VP6O, 5-1mJ>VP6O;V84
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * flow value,unit:per/second
	 * \else
	 * AwA?V5#,5%N;#:A>/7V
	 * \endif
	 */
	public int                 nFlow;
}

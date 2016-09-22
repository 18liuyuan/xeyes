package com.company.NetSDK;

import java.io.Serializable;

public class DEV_EVENT_TRAFFIC_FLOWSTAT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * time stamp(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * occurrence time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event id
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * M(5@W\J}
	 * \endif
	 */
	public int                 nLaneCnt;

	/**
	 * \if ENGLISH_LANG
	 * traffic flow state info
	 * \else
	 * AwA?M3<F<GB<#,JGR;8vJ}Wi
	 * \endif
	 */
	public SDK_TRAFFICFLOWSTAT  stTrafficFlowStats[] = new SDK_TRAFFICFLOWSTAT[FinalVar.SDK_MAX_LANE_NUM];
	
	public DEV_EVENT_TRAFFIC_FLOWSTAT_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_LANE_NUM; i++) {
			stTrafficFlowStats[i] = new SDK_TRAFFICFLOWSTAT();
		}
	}
}

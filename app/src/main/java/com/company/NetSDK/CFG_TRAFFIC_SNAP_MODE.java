package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot Mode Types 
 * \else
 * W%EDD#J=
 * \endif
 */
public class CFG_TRAFFIC_SNAP_MODE implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types 
	 * \else
	 * WT6/W%ED
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_AUTO = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot
	 * \else
	 * O_H&W%ED
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot, Picture Analysis
	 * \else
	 * O_H&W%ED, M<F,7VNv
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL_PICANALYSIS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot
	 * \else
	 * JSF5W%ED
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot, Identicifcation
	 * \else
	 * JSF5W%ED, 2"GRJ61p
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM_IDENTIFY = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Mix, Identicifcation
	 * \else
	 * ;l:OW%ED, 2"GRJ61p
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_MIX_IDENTIFY = 5;
}
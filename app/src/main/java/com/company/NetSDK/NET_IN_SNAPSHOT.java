package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TrafficSnapByNetwork's input param
 * \else
 * =S?Z(TrafficSnapByNetwork)JdHk2NJ}
 * \endif
 */
public class NET_IN_SNAPSHOT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Trigger type	0-unknown 1-zhongmeng net trigger
	 * \else
	 * 4%7"@`PM	0-N4V*	1-VPCKMxBg4%7" 2-?M;'6K4%7"#(4+HkNET_CLIENT_SNAP_INFO@`5D6TOs#)
	 * \endif
	 */
	public int					nTriggerType;			

	public Object				objType;				
}

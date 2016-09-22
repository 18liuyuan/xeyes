package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Three generations of equipment parameters of voice intercom, corresponding to the INetSDK.SetDeviceMode SDK_TALK_MODE3 command
 * \else
 * H}4zIh185DSoRt6T=22NJ}#,6TS&INetSDK.SetDeviceMode()5DSDK_TALK_MODE3C|An
 * \endif
 */
public class NET_TALK_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel number 
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int					nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * Audio transmission listener ports
	 * \else
	 * RtF54+JdUlL}6K?Z
	 * \endif
	 */
	public int                 	nAudioPort; 
	
	/**
	 * \if ENGLISH_LANG
	 * Ms wait time, unit, use the default value is 0
	 * \else
	 * 5H4}J1<d, 5%N;ms,N*0TrJ9SCD,HOV5
	 * \endif
	 */
	public int					nWaitTime; 
}

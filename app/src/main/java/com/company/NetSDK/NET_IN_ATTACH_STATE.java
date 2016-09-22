package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_ATTACH_STATE implements Serializable {

	/**
	 * AttachBurnState input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * disk name, as "/dev/sda"
	 * \else
	 *  9bELC{3F#,Hg"/dev/sda"
	 * \endif
	 */
	public 	String szDeviceName;
	
	/**
	 * \if ENGLISH_LANG
	 * burning session handle, CLIENT_StartBurnSession retuen value. This value is 0, szDeviceName is valid, by burning device subscribe burning status
	 * \else
	 * ?LB<;a;0>d1z,CLIENT_StartBurnSession5D75;XV5. 8CV5N*0J1, szDeviceNameSPP', 4KJ104?LB<Ih186)TD?LB<W4L,
	 * \endif
	 */
	public 	long    lBurnSession;
	
	/**
	 * \if ENGLISH_LANG
	 * burning listening callback
	 * \else
	 *  ?LB<<`L};X5w
	 * \endif
	 */
	public  CB_fAttachBurnStateCB cbAttachState;
}


package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  burning device status
 * \else
 * ?LB<Ih18W4L,
 * \endif
 */

public class NET_BURN_DEV_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ROM device ID
	 * \else
	 * 9bG}Ih18ID
	 * \endif
	 */
	public  int		     nDeviceID;
	
	/**
	 * \if ENGLISH_LANG
	 * ROM devicename
	 * \else
	 * 9bG}Ih18C{3F
	 * \endif
	 */
	public  byte		 szDevName[]    =  new byte[FinalVar.SDK_BURNING_DEV_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ROM total capacity, uni KB
	 * \else
	 * 9bG}W\H]A?, 5%N;KB
	 * \endif
	 */
    public	int           dwTotalSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * ROM remaining capacity, unit KB
	 * \else
	 * 9bG}J#S`H]A?, 5%N;KB
	 * \endif
	 */
    public int            dwRemainSpace;

}
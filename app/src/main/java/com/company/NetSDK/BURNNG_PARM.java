package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner control 
 * \else
 * ?LB<?XVF
 * \endif
 */
public class BURNNG_PARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel subnet mask. Bit means the channel to be burned.
	 * \else
	 * M(5@QZBk#,04N;1mJ>R*?LB<5DM(5@
	 * \endif
	 */
	public int					channelMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner subnet mask.  Use bit to represent according to the searched burner list 
	 * \else
	 * ?LB<;zQZBk#,8y>]2iQ/5=5D?LB<;zAP1m#,04N;1mJ>
	 * \endif
	 */
	public byte				devMask;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP channel(Channel No.+32)
	 * \else
	 * ;-VP;-M(5@(M(5@J}+32)
	 * \endif
	 */
	public byte                bySpicalChannel;
}

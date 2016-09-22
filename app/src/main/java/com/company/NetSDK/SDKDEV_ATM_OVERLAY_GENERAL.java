package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: query overlay ability information
 * \else
 * atm:2iQ/5~<SO`9XD\A&PEO"
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_GENERAL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm, 3:Network&Comm
	 * \else
	 * 04N;, N;0:Net(MxBg), N;1:Com(4.?Z), N;2:Com422(4.?Z422)
	 * \endif
	 */
	public int               dwDataSource;
	
	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * P-RiC{WV,Wn4s3$6H32(1#AtR;8v=aJx7{).
	 * \endif
	 */
	public byte                szProtocol[][] = new byte[32][33];
}

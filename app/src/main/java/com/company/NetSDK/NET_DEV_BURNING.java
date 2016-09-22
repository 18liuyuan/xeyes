package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner information 
 * \else
 * ?LB<;zPEO"
 * \endif
 */
public class NET_DEV_BURNING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner driver type;0:DHFS,1:DISK,2:CDRW
	 * \else
	 * ?LB<G}6/Fw@`PM#;0:DHFS,1:DISK,2:CDRW
	 * \endif
	 */
	public int					dwDriverType;
	
	/**
	 * \if ENGLISH_LANG
	 * Bus type;0:USB,1:1394,2:IDE, 3: SATA, 4: ESATA
	 * \else
	 * W\O_@`PM#;0:USB,1:1394,2:IDE, 3: SATA, 4: ESATA
	 * \endif
	 */
	public int					dwBusType;
	
	/**
	 * \if ENGLISH_LANG
	 * Total space(KB)
	 * \else
	 * W\H]A?(KB)
	 * \endif
	 */
	public int					dwTotalSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Free space(KB)
	 * \else
	 * J#S`H]A?(KB)
	 * \endif
	 */
	public int					dwRemainSpace;			 

	/**
	 * \if ENGLISH_LANG
	 * Burner driver name
	 * \else
	 * ?LB<G}6/FwC{3F
	 * \endif
	 */
	public byte				dwDriverName[] = new byte[FinalVar.SDK_BURNING_DEV_NAMELEN];	 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD informaiton 
 * \else
 * S2ELPEO"
 * \endif
 */
public class NET_DEV_DISKSTATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD capacity 
	 * \else
	 * S2EL5DH]A?, 5%N;MB(B1mJ>WV=Z)
	 * \endif
	 */
	public int					dwVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD free space
	 * \else
	 * S2EL5DJ#S`?U<d, 5%N;MB(B1mJ>WV=Z)
	 * \endif
	 */
	public int					dwFreeSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Higher 4 byte instruct hdd type, see the enum struct EM_DISK_TYPE; lower four byte instruct HDD status,0-hiberation,1-active,2-malfucntion and etc.;Devide DWORD into four BYTE
	 * \else
	 * 8_KDN;5DV51mJ>S2EL@`PM#,>_Le<{C6>Y@`PMEM_DISK_TYPE#;5MKDN;5DV51mJ>S2EL5DW4L,#,0-P]C_,1-;n6/,2-9JUO5H#;=+DWORD2p3IKD8vBYTE
	 * \endif
	 */
	public byte					dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number
	 * \else
	 * S2EL:E
	 * \endif
	 */
	public byte					bDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subarea number
	 * \else
	 * 7VGx:E
	 * \endif
	 */
	public byte					bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. 0:local. 1:remote
	 * \else
	 * 1jJ6#,0N*1>5X 1N*T63L
	 * \endif
	 */
	public byte					bSignal;
}

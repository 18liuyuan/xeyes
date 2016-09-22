package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot parameter structure 
 * \else
 * W%M<2NJ}=a99Le
 * \endif
 */
public class SNAP_PARAMS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * W%M<5DM(5@
	 * \endif
	 */
	public int				Channel;
	
	/**
	 * \if ENGLISH_LANG
	 * Image quality:level 1 to level 6
	 * \else
	 * ;-VJ#;1~6
	 * \endif
	 */
	public int				Quality;
	
	/**
	 * \if ENGLISH_LANG
	 * Video size;0:QCIF,1:CIF,2:D1
	 * \else
	 * ;-Cf4sP!#;0#:QCIF#,1#:CIF#,2#:D1
	 * \endif
	 */
	public int				ImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode;0:request one frame,1:send out requestion regularly,2: Request consecutively
	 * \else
	 * W%M<D#J=#;0#:1mJ>GkGsR;V!#,1#:1mJ>6(J17"KMGkGs#,2#:1mJ>A,PxGkGs
	 * \endif
	 */
	public int				mode;
	
	/**
	 * \if ENGLISH_LANG
	 * Time unit is second.If mode=1, it means send out requestion regularly. The time is valid.
	 * \else
	 * J1<d5%N;Ck#;Htmode=11mJ>6(J17"KMGkGsJ1#,4KJ1<dSPP'
	 * \endif
	 */
	public int				InterSnap;
	
	/**
	 * \if ENGLISH_LANG
	 * Request serial number
	 * \else
	 * GkGsPrAP:E
	 * \endif
	 */
	public int				CmdSerial;
}

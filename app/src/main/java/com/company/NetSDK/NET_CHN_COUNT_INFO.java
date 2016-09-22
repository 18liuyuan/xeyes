package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel quantity info
 * \else
 * M(5@J}A?PEO"
 * \endif
 */
public class NET_CHN_COUNT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device total channels(all valid channel sum)
	 * \else
	 * Ih18W\M(5@J}(KySPSPP'M(5@J}V.:M)
	 * \endif
	 */
	public int					nMaxTotal;

	/**
	 * \if ENGLISH_LANG
	 * Configured channel number
	 * \else
	 * RQEdVC5DM(5@J}
	 * \endif
	 */
	public int					nCurTotal;

	/**
	 * \if ENGLISH_LANG
	 * Max local channel number, including motherboard and pluggable sub channel
	 * \else
	 * Wn4s1>5XM(5@J}, :,Vw0e:M?I2e0NWS?(M(5@
	 * \endif
	 */
	public int					nMaxLocal;

	/**
	 * \if ENGLISH_LANG
	 * Configured local channel number
	 * \else
	 * RQEdVC1>5XM(5@J}
	 * \endif
	 */
	public int					nCurLocal;

	/**
	 * \if ENGLISH_LANG
	 * Max remote channel number
	 * \else
	 * Wn4sT63LM(5@J}
	 * \endif
	 */
	public int					nMaxRemote;

	/**
	 * \if ENGLISH_LANG
	 * Configured remote channel
	 * \else
	 * RQEdVCT63LM(5@J}
	 * \endif
	 */
	public int					nCurRemote;
}

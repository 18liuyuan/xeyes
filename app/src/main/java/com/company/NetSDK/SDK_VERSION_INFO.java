package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. The higher 16-bit means the main version number and low 16-bit means second version number
 * \else
 * Ih18Hm<~0f1>PEO"#,8_16N;1mJ>Vw0f1>:E#,5M16N;1mJ>4N0f1>:E
 * \endif
 */
public class SDK_VERSION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * Hm<~0f1> 
	 * \endif
	 */
	public int				dwSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version compiled date 
	 * \else
	 * Hm<~0f1>1`RkHUFZ 
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version 
	 * \else
	 * dspHm<~0f1>
	 * \endif
	 */
	public int				dwDspSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version compiled date 
	 * \else
	 * dspHm<~0f1>1`RkHUFZ
	 * \endif
	 */
	public int				dwDspSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * OVTZC;SPJ9SC 
	 * \endif
	 */
	public int				dwPanelVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * OVTZC;SPJ9SC 
	 * \endif
	 */
	public int				dwPanelSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hardware version 
	 * \else
	 * S2<~0f1> 
	 * \endif
	 */
	public int				dwHardwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * OVTZC;SPJ9SC 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web0f1>
	 * \endif
	 */
	public int				dwWebVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * The date of the web version of the compiler 
	 * \else
	 * web0f1>1`RkHUFZ 
	 * \endif
	 */
	public int				dwWebBuildDate;
}

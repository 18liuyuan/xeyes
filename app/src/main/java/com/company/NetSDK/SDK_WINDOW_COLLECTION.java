package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infomation window areas
 * \else
 * Gx?i40?ZPEO"
 * \endif
 */
public class SDK_WINDOW_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 40?ZID
	 * \endif
	 */
	public int					nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 40?ZJG7qSPP'
	 * \endif
	 */
	public boolean				bWndEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Rect, effect when free split mode
	 * \else
	 * 40?ZGxSr, WTSI7V8nD#J=OBSPP'
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the conditions
	 * \else
	 * Wx1jJG7qBzWcV1M(Lu<~
	 * \endif
	 */
	public boolean				bDirectable;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * 40?ZZ4NPr
	 * \endif
	 */
	public int					nZOrder;
	
	/**
	 * \if ENGLISH_LANG
	 * Source enable
	 * \else
	 * OTJ>T4JG7qSPP'
	 * \endif
	 */
	public boolean				bSrcEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Video channel
	 * \else
	 * JSF5M(5@:E
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video stream type
	 * \else
	 * JSF5BkAw@`PM
	 * \endif
	 */
	public int					nVideoStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio channel
	 * \else
	 * RtF5M(5@
	 * \endif
	 */
	public int					nAudioChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio stream type
	 * \else
	 * RtF5BkAw@`PM
	 * \endif
	 */
	public int					nAudioStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel
	 * \else
	 * Ih18DZM3R;1`:E5DN(R;M(5@:E
	 * \endif
	 */
	public int					nUniqueChannel;
}

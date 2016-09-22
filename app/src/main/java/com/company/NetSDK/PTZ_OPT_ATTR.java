package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ property information
 * \else
 * TFL(JtPTPEO"
 * \endif
 */
public class PTZ_OPT_ATTR implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Operation mask high bit 
	 * \else
	 * 2YWw5DQZBk8_N;
	 * \endif
	 */
	public int				dwHighMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation mask low bit 
	 * \else
	 * 2YWw5DQZBk5MN;
	 * \endif
	 */
	public int				dwLowMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation protocol name 
	 * \else
	 * 2YWw5DP-RiC{
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.NAME_MAX_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address min value
	 * \else
	 * M(5@5XV75DWnP!V5
	 * \endif
	 */
	public int				wCamAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address max value
	 * \else
	 * M(5@5XV75DWn4sV5
	 * \endif
	 */
	public int				wCamAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address min value
	 * \else
	 * <`JS5XV75DWnP!V5
	 * \endif
	 */
	public int				wMonAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address max value
	 * \else
	 * <`JS5XV75DWn4sV5
	 * \endif
	 */
	public int				wMonAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset min value
	 * \else
	 * T$VC5c5DWnP!V5
	 * \endif
	 */
	public byte				bPresetMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset max value
	 * \else
	 * T$VC5c5DWn4sV5
	 * \endif
	 */
	public byte				bPresetMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour min value
	 * \else
	 * WT6/Q2:=O_B75DWnP!V5
	 * \endif
	 */
	public byte				bTourMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour max value
	 * \else
	 * WT6/Q2:=O_B75DWn4sV5
	 * \endif
	 */
	public byte				bTourMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern min value
	 * \else
	 * 9l<#O_B75DWnP!V5
	 * \endif
	 */
	public byte				bPatternMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern max value
	 * \else
	 * 9l<#O_B75DWn4sV5
	 * \endif
	 */
	public byte				bPatternMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed min value
	 * \else
	 * 49V1KY6H5DWnP!V5
	 * \endif
	 */
	public byte				bTileSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed max value
	 * \else
	 * 49V1KY6H5DWn4sV5
	 * \endif
	 */
	public byte				bTileSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed min value
	 * \else
	 * K.F=KY6H5DWnP!V5
	 * \endif
	 */
	public byte				bPanSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed max value
	 * \else
	 * K.F=KY6H5DWn4sV5
	 * \endif
	 */
	public byte				bPanSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function min value
	 * \else
	 * 8(Vz9&D\5DWnP!V5
	 * \endif
	 */
	public byte				bAuxMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function max value
	 * \else
	 * 8(Vz9&D\5DWn4sV5
	 * \endif
	 */
	public byte				bAuxMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Command interval
	 * \else
	 * 7"KMC|An5DJ1<d<d8t
	 * \endif
	 */
	public int				nInternal;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * \else
	 * P-Ri5D@`PM
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Function mask :0x01 - support PTZ-inside function
	 * \else
	 * P-Ri9&D\QZBk,04N;1mJ>,VC#11mJ>V'3V,5ZR;N;1mJ>DZVCTFL(9&D\#,FdK|#7N;T]J11#At
	 * \endif
	 */
	public byte				bFuncMask;
}

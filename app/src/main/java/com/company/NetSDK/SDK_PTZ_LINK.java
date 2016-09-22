package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ activation
 * \else
 * TFL(A*6/
 * \endif
 */
public class SDK_PTZ_LINK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type
	 * <table>
	 * <tr><td>iType</td><td>Type</td></tr>
	 * <tr><td>1</td><td>Preset point</td></tr>
	 * <tr><td>2</td><td>Point between cruise</td></tr>
	 * <tr><td>3</td><td>Mode</td></tr>
	 * </table>
	 * \else
	 * @`PM
	 * <table>
	 * <tr><td>iType</td><td>@`PM</td></tr>
	 * <tr><td>1</td><td>T$VC5c</td></tr>
	 * <tr><td>2</td><td>5c<dQ2:=</td></tr>
	 * <tr><td>3</td><td>D#J=</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 iType;
	
	/**
	 * \if ENGLISH_LANG
	 * Value
	 * \else
	 * V5
	 * \endif
	 */
	public int                 iValue;
}

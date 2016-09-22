package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Returned Information for Modify device configuration
 * \else
 * P^8DIh18EdVC75;XPEO"
 * \endif
 */
public class DEV_SET_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type(GetDevConfig and SetDevConfig type)
	 * \else
	 * @`PM(<4GetDevConfig:MSetDevConfig5D@`PM)
	 * \endif
	 */
	public int               dwType;
	
	/**
	 * \if ENGLISH_LANG
	 * Result code:
	 * <table>
	 * <tr><td>0</td><td>Success</td></tr>
	 * <tr><td>1</td><td>Failure</td></tr>
	 * <tr><td>2</td><td>Data Illegal</td></tr>
	 * <tr><td>3</td><td>Temporarily unable to set</td></tr>
	 * <tr><td>4</td><td>Without Permission</td></tr>
	 * </table>
	 * \else
	 * 75;XBk:
	 * <table>
	 * <tr><td>0</td><td>3I9&</td></tr>
	 * <tr><td>1</td><td>J'0\</td></tr>
	 * <tr><td>2</td><td>J}>]2;:O7(</td></tr>
	 * <tr><td>3</td><td>T]J1N^7(IhVC</td></tr>
	 * <tr><td>4</td><td>C;SPH(O^</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Reboot Sign
	 * <table>
	 * <tr><td>0</td><td>No need to reboot</td></tr>
	 * <tr><td>1</td><td>Effective after reboot</td></tr>
	 * </table>
	 * \else
	 * VXFt1jV>
	 * <table>
	 * <tr><td>0</td><td>2;PhR*VXFt</td></tr>
	 * <tr><td>1</td><td>PhR*VXFt2EIzP'</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wRebootSign;
}

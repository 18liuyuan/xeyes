package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Request monitoring or playback's return information
 * \else
 * GkGs<`JS;r;X7E4mNs5D75;XPEO"
 * \endif
 */
public class DEV_PLAY_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result Code:
	 * <table>
	 * <tr><td>1</td><td>Without permission</td></tr>
	 * <tr><td>2</td><td>This operation is not supported</td></tr>
	 * <tr><td>3</td><td>No enough Resource</td></tr>
	 * <tr><td>4</td><td>Device can't obtain the requested data</td></tr>
	 * <tr><td>11</td><td>Senior user take over junior user's resource</td></tr>
	 * <tr><td>12</td><td>Prohibit access</td></tr>
	 * </table>
	 * \else
	 * 4mNs75;XBk:
	 * <table>
	 * <tr><td>1</td><td>N^H(O^</td></tr>
	 * <tr><td>2</td><td>Ih182;V'3V4K2YWw</td></tr>
	 * <tr><td>3</td><td>WJT42;Wc</td></tr>
	 * <tr><td>4</td><td>Ih18N^7(;qH!51G0GkGsJ}>]</td></tr>
	 * <tr><td>11</td><td>1mJ>8_<6SC;'G@U<5M<6SC;'WJT4</td></tr>
	 * <tr><td>12</td><td>={V9HkMx</td></tr>
	 * </table>
	 * \endif
	 */
	public int               dwResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Handle value returned from Monitoring or playback monitor or playback handle
	 * \else
	 * <`JS;r;X7E=S?Z75;X5D>d1zV5
	 * \endif
	 */
	public long              lPlayHandle;
}

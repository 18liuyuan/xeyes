package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Host Configuration
 * \else
 * T63LVw;zEdVC
 * \endif
 */
public class SDK_REMOTE_HOST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Connection enabled
	 * \else
	 * A,=SJ9D\
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Currently only useful for PPPoE server
	 * <table>
	 * <tr><td>0</td><td>In the wired network card dialing</td></tr>
	 * <tr><td>1</td><td>In the wired Wireless card dialing</td></tr>
	 * </table>
	 * \else
	 * D?G0V;6TSZPPPoE7~NqFwSPSC
	 * <table>
	 * <tr><td>0</td><td>TZSPO_Mx?(2&:E</td></tr>
	 * <tr><td>1</td><td>TZN^O_Mx?(IO2&:E</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAssistant;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote host port
	 * \else
	 * T63LVw;z6K?Z
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of the remote host
	 * \else
	 * T63LVw;zIP5XV7
	 * \endif
	 */
	public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user name of the remote host
	 * \else
	 * T63LVw;zSC;'C{
	 * \endif
	 */
	public byte                sHostUser[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user password of the remote host
	 * \else
	 * T63LVw;zC\Bk
	 * \endif
	 */
	public byte                sHostPassword[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
}

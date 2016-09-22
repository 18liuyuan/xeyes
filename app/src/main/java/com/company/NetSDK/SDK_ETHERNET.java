package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet Settings
 * \else
 * RTL+MxEdVC
 * \endif
 */
public class SDK_ETHERNET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP Address
	 * \else
	 * DVR IP 5XV7
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * IP Mask
	 * \else
	 * Mx9X5XV7
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * 10M/100M self-adaption,Index:
	 * <table>
	 * <tr><td>1</td><td>10Mbps full duplex</td></tr>
	 * <tr><td>2</td><td>10Mbps self-adaption</td></tr>
	 * <tr><td>3</td><td>10Mbps half-duplex</td></tr>
	 * <tr><td>4</td><td>100Mbps full duplex</td></tr>
	 * <tr><td>5</td><td>100Mbps self-adaption</td></tr>
	 * <tr><td>6</td><td>100Mbps half-duplex</td></tr>
	 * <tr><td>7</td><td>Self-adaption</td></tr>
	 * </table>
	 * \else
	 * 10M/100M WTJJS&,KwR}:
	 * <table>
	 * <tr><td>1</td><td>10Mbps H+K+9$</td></tr>
	 * <tr><td>2</td><td>10Mbps WTJJS&</td></tr>
	 * <tr><td>3</td><td>10Mbps 0kK+9$</td></tr>
	 * <tr><td>4</td><td>100Mbps H+K+9$</td></tr>
	 * <tr><td>5</td><td>100Mbps WTJJS&</td></tr>
	 * <tr><td>6</td><td>100Mbps 0kK+9$</td></tr>
	 * <tr><td>7</td><td>WTJJS&</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                sGatewayIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte                dwNetInterface;
	
	/**
	 * \if ENGLISH_LANG
	 * 0#:Wired,1#:Wireless
	 * \else
	 * 0#:SPO_#,1#:N^O_
	 * \endif
	 */
	public byte                bTranMedia;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit 1, 1#:Valid 0#:Invalid#;Bit 2#:0#:DHCP disable 1#:DHCP enable#;Bit 3#:0#:Not support DHCP 1#:Support DHCP
	 * \else
	 * 04N;1mJ>#,5ZR;N;#:1#:SPP' 0#:N^P'#;5Z6~N;#:0#:DHCP9X1U 1#:DHCPJ9D\#;5ZH}N;#:0#:2;V'3VDHCP 1#:V'3VDHCP
	 * \endif
	 */
	public byte                bValid;
	
	/**
	 * \if ENGLISH_LANG
	 * Default NIC, 1#:Default 0#:Non default
	 * \else
	 * JG7qWwN*D,HO5DMx?(, 1#:D,HO 0#:7GD,HO
	 * \endif
	 */
	public byte                bDefaultEth;
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address,read only
	 * \else
	 * MAC5XV7#,V;6A
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];
}

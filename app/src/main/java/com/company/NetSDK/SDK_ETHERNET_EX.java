package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet extended Configuration
 * \else
 * RTL+Mx@)U9EdVC
 * \endif
 */
public class SDK_ETHERNET_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP  address
	 * \else
	 * DVR IP 5XV7
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * DVR IP subnet mask
	 * \else
	 * DVR IP 5XV7QZBk
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Gateway address
	 * 1:10Mbps full-duplex
	 * 2:10Mbps auto-duplex
	 * 3:10Mbps half-duplex
	 * 4:100Mbps full-duplex
	 * 5:100Mbps auto-duplex
	 * 6:100Mbps half-duplex
	 * 7:auto
	 * \else
	 * Mx9X5XV7
	 * 1#:10Mbps H+K+9$
     * 2#:10Mbps WTJJS&
     * 3#:10Mbps 0kK+9$
     * 4#:100Mbps H+K+9$
     * 5#:100Mbps WTJJS&
     * 6#:100Mbps 0kK+9$
     * 7#:WTJJS&
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
	 * 0:cable,1:wireless
	 * \else
	 * 0#:SPO_#,1#:N^O_
	 * \endif
	 */
	public byte                bTranMedia;

	/**
	 * \if ENGLISH_LANG
	 * Use bit to represent, The first bit:1:valid 0:invalid;The second bit:0:Disable DHCP 1:Enable DHCP;The third bit:0:Do not support DHCP 1:Support DHCP
	 * \else
	 * 04N;1mJ>#,5ZR;N;#:1#:SPP' 0#:N^P'#;5Z6~N;#:0#:DHCP9X1U 1#:DHCPJ9D\#;5ZH}N;#:0#:2;V'3VDHCP 1#:V'3VDHCP
	 * \endif
	 */
	public byte                bValid;

	/**
	 * \if ENGLISH_LANG
	 * To be the default network card or not.  1: default 0:non-default
	 * \else
	 * JG7qWwN*D,HO5DMx?( 1#:D,HO 0#:7GD,HO
	 * \endif
	 */
	public byte                bDefaultEth;

	/**
	 * \if ENGLISH_LANG
	 * MAC address , read-only.
	 * \else
	 * MAC5XV7#,V;6A
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * mode, 1:balance, 2:multi, 3:fault-toerant
	 * \else
	 * Mx?(Ky4&D#J=, 0:0s6(D#J=, 1:8:TX>y:bD#J=, 2:6`V7D#J=, 3:H]4mD#J=
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * Card name, read only
	 * \else
	 * Mx?(C{#,V;6A
	 * \endif
	 */
	public byte                szEthernetName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
}

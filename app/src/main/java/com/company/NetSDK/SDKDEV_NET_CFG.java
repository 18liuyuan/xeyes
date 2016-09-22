package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the network configuration
 * \else
 * MxBgEdVC=a99Le
 * \endif
 */
public class SDKDEV_NET_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device hostname
	 * \else
	 * Ih18Vw;zC{
	 * \endif
	 */
	public byte                sDevName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * TCP maximum number of connections
	 * \else
	 * TCPWn4sA,=SJ}
	 * \endif
	 */
	public short                wTcpMaxConnectNum;
	
	/**
	 * \if ENGLISH_LANG
	 * TCP frame listen port
	 * \else
	 * TCPV!L}6K?Z
	 * \endif
	 */
	public short                wTcpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * UDP listening port
	 * \else
	 * UDPUlL}6K?Z
	 * \endif
	 */
	public short                wUdpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP port
	 * \else
	 * HTTP6K?Z:E
	 * \endif
	 */
	public short                wHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTPS port
	 * \else
	 * HTTPS6K?Z:E
	 * \endif
	 */
	public short                wHttpsPort;
	
	/**
	 * \if ENGLISH_LANG
	 * SSL port
	 * \else
	 * SSL6K?Z:E
	 * \endif
	 */
	public short                wSslPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Ethernet port
	 * \else
	 * RTL+Mx?Z
	 * \endif
	 */
	public SDK_ETHERNET         stEtherNet[] = new SDK_ETHERNET[FinalVar.SDK_MAX_ETHERNET_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm server
	 * \else
	 * 1(>/7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struAlarmHost = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * Log server
	 * \else
	 * HUV>7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struLogHost = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * SMTP server
	 * \else
	 * SMTP7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struSmtpHost = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * Multicast group
	 * \else
	 * 6`2%Wi
	 * \endif
	 */
	public SDK_REMOTE_HOST      struMultiCast = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * NFS server
	 * \else
	 * NFS7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struNfs = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * PPPoE server
	 * \else
	 * PPPoE7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struPppoe = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * PPPoE Registered returns IP
	 * \else
	 * PPPoEW"2a75;X5DIP
	 * \endif
	 */
	public byte                sPppoeIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * DDNS server
	 * \else
	 * DDNS7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDdns = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * DDNS Host name
	 * \else
	 * DDNSVw;zC{
	 * \endif
	 */
	public byte                sDdnsHostName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * DNS server
	 * \else
	 * DNS7~NqFw
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDns = new SDK_REMOTE_HOST();
	
	/**
	 * \if ENGLISH_LANG
	 * Mail configuration
	 * \else
	 * SJ<~EdVC
	 * \endif
	 */
	public SDK_MAIL_CFG         struMail = new SDK_MAIL_CFG();
	
	public SDKDEV_NET_CFG() {
		for (int i = 0; i < FinalVar.SDK_MAX_ETHERNET_NUM; i++) {
			stEtherNet[i] = new SDK_ETHERNET();
		}
	}
}

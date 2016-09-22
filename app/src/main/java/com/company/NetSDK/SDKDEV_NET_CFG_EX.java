package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network extended configuration structure
 * \else
 * @)U9MxBgEdVC=a99Le
 * \endif
 */
public class SDKDEV_NET_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device host name
	 * \else
	 * Ih18Vw;zC{
	 * \endif
	 */
	public byte                sDevName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * TCP max connection amount
	 * \else
	 * TCPWn4sA,=SJ}
	 * \endif
	 */
	public short                wTcpMaxConnectNum;

	/**
	 * \if ENGLISH_LANG
	 * TCP listening port
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
	 * HTTP port number
	 * \else
	 * HTTP6K?Z:E
	 * \endif
	 */
	public short                wHttpPort;

	/**
	 * \if ENGLISH_LANG
	 * HTTPS port number
	 * \else
	 * HTTPS6K?Z:E
	 * \endif
	 */
	public short                wHttpsPort;

	/**
	 * \if ENGLISH_LANG
	 * SSL port number
	 * \else
	 * SSL6K?Z:E
	 * \endif
	 */
	public short                wSslPort;
    
	/**
	 * \if ENGLISH_LANG
	 * Ethernet port number
	 * \else
	 * RTL+Mx?ZJ}
	 * \endif
	 */
	public int                 nEtherNetNum;

	/**
	 * \if ENGLISH_LANG
	 * Ethernet info
	 * \else
	 * RTL+Mx?Z
	 * \endif
	 */
	public SDK_ETHERNET_EX      stEtherNet[] = new SDK_ETHERNET_EX[FinalVar.SDK_MAX_ETHERNET_NUM_EX];

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
	 * Multiple-cast group
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
	 * returned IP after PPPoE registration
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
	 * DDNS host name
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
	 * Email setup
	 * \else
	 * SJ<~EdVC
	 * \endif
	 */
	public SDK_MAIL_CFG         struMail = new SDK_MAIL_CFG();
    
    public SDKDEV_NET_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_ETHERNET_NUM_EX; i++) {
    		stEtherNet[i] = new SDK_ETHERNET_EX();
    	}
    }
}

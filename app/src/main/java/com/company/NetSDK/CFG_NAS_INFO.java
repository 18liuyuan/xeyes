package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Area Server Configuration 
 * \else
 * MxBg4f4"7~NqFwEdVC 
 * \endif
 */
public class CFG_NAS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Version of Network Area Server 0=FTP,1=NAS 
	 * \else
	 * MxBg4f4"7~NqFw0f1>0=@O5DFTP#,1=NAS4f4"
	 * \endif
	 */
	public int					nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol Type0=FTP 1=SMB 
	 * \else
	 * P-Ri@`PM0=FTP 1=SMB
	 * \endif
	 */
	public int					nProtocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP or Domain Name 
	 * \else
	 * IP5XV7;rMxBgC{
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port Number 
	 * \else
	 * 6K?Z:E
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * User Name 
	 * \else
	 * UJ;'C{
	 * \endif
	 */
	public byte[]				szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared Directory 
	 * \else
	 * 92Om5DD?B<C{
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Lenth of file 
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
	public int					nFileLen;
	
 	/**
	 * \if ENGLISH_LANG
	 * Interval 
	 * \else
	 * O`AZND<~J1<d<d8t
	 * \endif
	 */
	public int					nInterval;
	
 	/**
	 * \if ENGLISH_LANG
	 * Period of Storage 
	 * \else
	 * 4f4"J1<d6N
	 * \endif
	 */
	public CFG_CHANNEL_TIME_SECTION[] stuChnTime = new CFG_CHANNEL_TIME_SECTION[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Valid Number of Storage 
	 * \else
	 * SPP'5D4f4"J1<d6NJ}
	 * \endif
	 */
	public int					nChnTimeCount;
	
	public CFG_NAS_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; ++i) {
			this.stuChnTime[i] = new CFG_CHANNEL_TIME_SECTION();
		}
	}
}

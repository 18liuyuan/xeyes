package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network storage config
 * \else
 * MxBg4f4"EdVC
 * \endif
 */
public class CFG_NAS_INFO_NEW implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean    			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * C{3F
	 * \endif
	 */
	public byte[]				szName = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol type, 0-FTP, 1-SMB, 2-ISCSI
	 * \else
	 * P-Ri@`PM, 0-FTP, 1-SMB, 2-ISCSI
	 * \endif
	 */
	public int					nPortocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP address or wed address
	 * \else
	 * IP5XV7;rMxV7
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 6K?Z
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte[]				szUser = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared directory name
	 * \else
	 * 92Om5DD?B<C{
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Character encode mode, 0-UTF8, 1-GB2312
	 * \else
	 * WV7{1`Bk8qJ=, 0-UTF8, 1-GB2312
	 * \endif
	 */
	public int					nCharEncoding;
	
 	/**
	 * \if ENGLISH_LANG
	 * overtime, unit is ms
	 * \else
	 * 3,J1J1<d, 5%N;:ACk
	 * \endif
	 */
	public int					nTimeOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data string ID
	 * \else
	 * J}>]AwID
	 * \endif
	 */
	public int					nStreamID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Update time, the field changed, need to initialize iSCSI function
	 * \else
	 * 8|PBJ1<d, 8CWV6NV51d;/:s#,PhR*VXPB3uJ<;/iSCSI9&D\
	 * \endif
	 */
	public CFG_NET_TIME_EX		stuUpdateTime = new CFG_NET_TIME_EX();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration structure 
 * \else
 * SJ<~EdVC=a99Le
 * \endif
 */
public class SDKDEV_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mail server address(IP and domain name )
	 * \else
	 * SJ<~7~NqFw5XV7(IP;rU_SrC{)
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	public byte                sSubMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * SJ<~7~NqFw6K?Z
	 * \endif
	 */
	public short                wMailPort;
	
    public short                wSubMailPort;
    
    /**
	 * \if ENGLISH_LANG
	 * From
	 * \else
	 * 7"KM5XV7
	 * \endif
	 */
	public byte                sSenderAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte                sUserName[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * SC;'C\Bk
	 * \endif
	 */
	public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * To
	 * \else
	 * D?5D5XV7
	 * \endif
	 */
	public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * CC
	 * \else
	 * 3-KM5XV7
	 * \endif
	 */
	public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * BCC
	 * \else
	 * 053-5XV7
	 * \endif
	 */
	public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Subject
	 * \else
	 * 1jLb
	 * \endif
	 */
	public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 0:false,	1:true
	 * \else
	 * J9D\0:false,    1:true
	 * \endif
	 */
	public byte                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSL enable
	 * \else
	 * SSLJ9D\
	 * \endif
	 */
	public byte                bSSLEnable;

	/**
	 * \if ENGLISH_LANG
	 * Send interval,[0,3600]s
	 * \else
	 * 7"KMJ1<d<d8t,[0,3600]Ck
	 * \endif
	 */
	public short                wSendInterval;

	/**
	 * \if ENGLISH_LANG
	 * Anonymous Options[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * DdC{Q!On[0,1], 01mJ>FALSE,11mJ>TRUE.
	 * \endif
	 */
	public byte                bAnonymous;

	/**
	 * \if ENGLISH_LANG
	 * Attach enable[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * 8=<~J9D\[0,1], 01mJ>FALSE,11mJ>TRUE.
	 * \endif
	 */
	public byte                bAttachEnable;
}

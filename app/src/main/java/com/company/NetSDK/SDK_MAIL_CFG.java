package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration
 * \else
 * SJ<~EdVC
 * \endif
 */
public class SDK_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IP address of the mail server
	 * \else
	 * SJ<~7~NqFwIP5XV7
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * SJ<~7~NqFw6K?Z
	 * \endif
	 */
	public short                wMailPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Send address
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
    public byte                sUserName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * User password
	 * \else
	 * SC;'C\Bk
	 * \endif
	 */
    public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Destination address
	 * \else
	 * D?5D5XV7
	 * \endif
	 */
    public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * CC address
	 * \else
	 * 3-KM5XV7
	 * \endif
	 */
    public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Dark copied address
	 * \else
	 * 053-5XV7
	 * \endif
	 */
    public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Title
	 * \else
	 * 1jLb
	 * \endif
	 */
    public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
}

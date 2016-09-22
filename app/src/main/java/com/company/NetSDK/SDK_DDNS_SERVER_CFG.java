package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multi-DDNS Configuration
 * \else
 * 6`ddnsEdVC=a99Le
 * \endif
 */
public class SDK_DDNS_SERVER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DDNS Server ID
	 * \else
	 * ddns7~NqFwid:E
	 * \endif
	 */
	public int               dwId;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable, only one DDNS server can be set to enabled in the same time
	 * \else
	 * J9D\#,M,R;J1<dV;D\SPR;8vddns7~NqFw4&SZJ9D\W4L,
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Server type 
	 * \else
	 * 7~NqFw@`PM#,O#Mx.. 
	 * \endif
	 */
    public byte                szServerType[] = new byte[FinalVar.SDK_MAX_SERVER_TYPE_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server IP
	 * \else
	 * 7~NqFwip;rU_SrC{
	 * \endif
	 */
    public byte                szServerIp[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server Port
	 * \else
	 * 7~NqFw6K?Z
	 * \endif
	 */
    public int               dwServerPort;
    
    /**
	 * \if ENGLISH_LANG
	 * DVR Domain,ie jeckean.3322.org
	 * \else
	 * dvrSrC{#,Hgjeckean.3322.org
	 * \endif
	 */
    public byte                szDomainName[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * SC;'C{
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
    public byte                szUserPsw[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server alias,ie "private inter ddns"
	 * \else
	 * 7~NqFw1pC{#,Hg"private inter ddns"
	 * \endif
	 */
    public byte                szAlias[] = new byte[FinalVar.SDK_MAX_DDNS_ALIAS_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * DDNS Alive Period
	 * \else
	 * DDNS 1#;nJ1<d
	 * \endif
	 */
    public int               dwAlivePeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Domain Mode :0-Manually input, szDomainName valid; 1-Default Domain szDefaultDomainName valid
	 * \else
	 * SrC{D#J=:0-JV6/JdHkSrC{,szDomainNameSPP'; 1-D,HOSrC{szDefaultDomainNameSPP'
	 * \endif
	 */
    public byte                ByMode;
    
    /**
	 * \if ENGLISH_LANG
	 * Default Domain, Read only
	 * \else
	 * D,HOSrC{,V;6A
	 * \endif
	 */
    public byte                szDefaultDomainName[] = new byte[FinalVar.SDK_MAX_DEFAULT_DOMAIN_LEN];
}

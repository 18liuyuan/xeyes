package com.company.NetSDK;

import java.io.Serializable;

public class EM_LOGIN_SPAC_CAP_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TCP login, default
	 * \else
	 * TCP5GB=, D,HO7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_TCP               = 0;
    
    /**
	 * \if ENGLISH_LANG
	 * No criteria login
	 * \else
	 * N^Lu<~5GB=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_ANY               = 1;
    
    /**
	 * \if ENGLISH_LANG
	 * auto sign up login
	 * \else
	 * Vw6/W"2a5D5GHk
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SERVER_CONN       = 2;
    
    /**
	 * \if ENGLISH_LANG
	 * multicast login, default
	 * \else
	 * Wi2%5GB=, D,HO7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MULTICAST         = 3;
    
    /**
	 * \if ENGLISH_LANG
	 * UDP method login
	 * \else
	 * UDP7=J=OB5D5GHk
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_UDP               = 4;
    
    /**
	 * \if ENGLISH_LANG
	 * only main connection login
	 * \else
	 * V;=(VwA,=SOB5D5GHk
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MAIN_CONN_ONLY    = 6;
    
    /**
	 * \if ENGLISH_LANG
	 * SSL encryption login
	 * \else
	 * SSL<SC\7=J=5GB=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SSL               = 7;
    
    /**
	 * \if ENGLISH_LANG
	 * Chendu Jiafa login
	 * \else
	 * 3I6<<Q7"5GB=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_CD_JF             = 8;
    
    /**
	 * \if ENGLISH_LANG
	 * login IVS box remote device
	 * \else
	 * 5GB<VGD\:PT63LIh18
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_INTELLIGENT_BOX   = 9;
    
    /**
	 * \if ENGLISH_LANG
	 * login device do not config
	 * \else
	 * 5GB<Ih18:s2;WvH!EdVC2YWw
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_NO_CONFIG         = 10;
    
    /**
	 * \if ENGLISH_LANG
	 * USB key device login
	 * \else
	 * SCU6\Ih185D5GHk
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_U_LOGIN           = 11;
    
    /**
	 * \if ENGLISH_LANG
	 * LDAP login
	 * \else
	 * LDAP7=J=5GB<
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_LDAP              = 12;
    
    /**
	 * \if ENGLISH_LANG
	 * AD#(ActiveDirectory#) login
	 * \else
	 * AD#(ActiveDirectory#)5GB<7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_AD                = 13;
    
    /**
	 * \if ENGLISH_LANG
	 * Radius  login 
	 * \else
	 * Radius 5GB<7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_RADIUS            = 14;
    
    /**
	 * \if ENGLISH_LANG
	 * Socks5 login
	 * \else
	 * Socks55GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_SOCKET_5          = 15;
    
    /**
	 * \if ENGLISH_LANG
	 * cloud login
	 * \else
	 * TF5GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_CLOUD             = 16;
    
    /**
	 * \if ENGLISH_LANG
	 * dual authentication loin
	 * \else
	 * 6~4N<xH(5GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_AUTH_TWICE        = 17;
    
    /**
	 * \if ENGLISH_LANG
	 * TS stream client login
	 * \else
	 * TSBkAw?M;'6K5GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_TS                = 18;
    
    /**
	 * \if ENGLISH_LANG
	 * web private login
	 * \else
	 * N*P2P5GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_P2P               = 19;
    
    /**
	 * \if ENGLISH_LANG
	 * mobile client login
	 * \else
	 * JV;z?M;'6K5GB=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_MOBILE            = 20;
    
    /**
	 * \if ENGLISH_LANG
	 * invalid login
	 * \else
	 * N^P'5D5GB=7=J=
	 * \endif
	 */
    public final static int EM_LOGIN_SPEC_CAP_INVALID           = 21;
}

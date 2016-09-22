package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile push notification configuration, use the RegisterID subscription (corresponding CFG_CMD_MOBILE_PUSH_NOTIFY)
 * \else
 * JV;zpush notificationEdVC,  J9SCRegisterID6)TD(6TS& CFG_CMD_MOBILE_PUSH_NOTIFY)
 * \endif
 */
public class NET_MOBILE_PUSH_NOTIFY implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mobile phone registered returned with the Appple/Android server, every time is different
	 * \else
	 * JV;zOrAppple/ Android7~NqFwW"2a75;X5D#,C?4N2;M,
	 * \endif
	 */
	public byte                           szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Platform Type 
	 * \else
	 * F=L(@`PM, EM_MOBILE_SERVER_TYPE
	 * \endif
	 */
	public int                             emServerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid time, the unit is in seconds
	 * \else
	 * SPP'J1<d#,5%N;N*Ck
	 * \endif
	 */
	public int                             nPeriodOfValidity;
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server address
	 * \else
	 * AndroidQiV$7~NqFw5XV7
	 * \endif
	 */
	public byte                          szAuthServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server port 
	 * \else
	 * AndroidQiV$7~NqFw6K?Z
	 * \endif
	 */
	public int                             nAuthServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the address of the server (DAHUA agent, at the end of the selected server, for compatible)
	 * By DAHUA server according to the requirements of the official server, use the latest encryption algorithm and then forwarded to the official server
	 * \else
	 * MFKM7~NqFw5XV7(4s;*4z@m#,D)Q!7~NqFw#,9)<fH])
	 * SI4s;*7~NqFw049Y7=7~NqFwR*Gs#,Q!SCWnPB5D<SC\Kc7(TYW*7"8x9Y7=7~NqFw
	 * \endif
	 */
	public byte                          szPushServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Push server port (DAHUA agent) 
	 * \else
	 * MFKM7~NqFw6K?Z(4s;*4z@m)
	 * \endif
	 */
	public int                             nPushServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration, the official. Preferred server, if push fail, and try again redirection or proxy server 
	 * \else
	 * MFKM7~NqFwEdVC, 9Y7=!#JWQ!7~NqFw#,Hg9{MFKMJ'0\#,TY3"JTVX6(Or;r4z@m7~NqFw
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushServerMain = new NET_PUSH_SERVER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration (DAHUA redirection, second server)
	 * \else
	 * MFKM7~NqFwEdVC(4s;*VX6(Or#,4NQ!7~NqFw)
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushRedirectServer = new NET_PUSH_SERVER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Set display equipment alias, mobile terminal
	 * \else
	 * Ih181pC{#,JV;z6KIhVCOTJ>
	 * \endif
	 */
	public byte                            szDevName[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Device identifier, mobile terminal settings to use
	 * \else
	 * Ih181jJ6#,JV;z6KIhVCJ9SC
	 * \endif
	 */
	public byte                            szDevID[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Login user name
	 * \else
	 * 5GB=SC;'C{
	 * \endif
	 */
	public byte                            szUser[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte                            szPassword[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * ios certificate information, string after Base64, effective when need to use TLS encryption
	 * \else
	 * iosV$JiPEO"#,base64V.:s5DWV7{4.#,PhR*2ISCTLS<SC\J1SPP'
	 * \endif
	 */
	public byte                          szCertificate[] = new byte[FinalVar.MAX_IOS_CERTIFICATE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ios secret key#,after the base64 string
	 * \else
	 * iosC\T?#,base64V.:sWV7{4.
	 * \endif
	 */
	public byte                          szSecretKey[] = new byte[FinalVar.MAX_IOS_SECRET_KEY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number MAX, number of object in  pstuSubscribes
	 * \else
	 * Wn4s6)TD@`PM8vJ}, 1mJ>pstuSubscribes5D6TOsJ}A?
	 * \endif
	 */
	public int                            nSubScribeMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number in actual, valid in get configuration
	 * \else
	 * J5<J5D6)TD@`PM8vJ}, ;qH!EdVCSPP'
	 * \endif
	 */
	public int                             nSubScribeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription type 
	 * \else
	 * 6)TD@`PM
	 * \endif
	 */
	public NET_SUBSCRIBE_INFO              pstuSubscribes[];
	
	public NET_MOBILE_PUSH_NOTIFY(int nSubScribeMax) {
		this.nSubScribeMax = nSubScribeMax;
		pstuSubscribes = new NET_SUBSCRIBE_INFO[nSubScribeMax];
		for (int i = 0; i < nSubScribeMax; i++) {
			pstuSubscribes[i] = new NET_SUBSCRIBE_INFO();
		}
	}
}

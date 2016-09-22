package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Unlock Method(Access control event,entry/exit record, actual unlock method)
 * \else
 * ?*CE7=J=(CE={JB<~,CE={3vHk<GB<,J5<J5D?*CE7=J=)
 * \endif
 */
public class NET_ACCESS_DOOROPEN_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * N4V*
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Password Unlock
	 * \else
	 * C\Bk?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_ONLY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Swipe Unlock
	 * \else
	 * K"?(?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * SwipeCard and Unlock with Password
	 * \else
	 * OHK"?(:sC\Bk?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_CARD_FIRST = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * InputPassword and Swipe Card to Unlock
	 * \else
	 * OHC\Bk:sK"?(?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_PWD_FIRST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Remotely Unlock#,such as unlock VTO via VTH or platform
	 * \else
	 * T63L?*Kx#,HgM(9}JRDZ;z;rU_F=L(6TCE?Z;z?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_REMOTE = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock via Button
	 * \else
	 * ?*Kx04E%=xPP?*Kx
	 * \endif
	 */
	public static final int NET_ACCESS_DOOROPEN_METHOD_BUTTON = 6;
}

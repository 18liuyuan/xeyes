package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice interface SDK_CTRL_CLOSE_BURNER 
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_CLOSE_BURNER 5H C|An2NJ}
 * \endif
 */
public class NET_CTRL_BURNERDOOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * cd name,like "/dev/sda"
	 * \else
	 * 9bELC{3F#,Hg!0/dev/sda!1
	 * \endif
	 */
	public String       szBurnerName; 
	
	/**
	 * \if ENGLISH_LANG
	 * operate result
	 * \else
	 * 2YWw=a9{
	 * \endif
	 */
	public boolean      bResult; 
	
	/**
	 * \if ENGLISH_LANG
	 * Whether The Security Pop-up Drive, Data Save TRUE- pop Up Before, FALSE- Display)
	 * \else
	 * JG7q02H+5/3v9bG}, TRUE-5/3vG0WvJ}>]1#4f, FALSE-V1=S5/3v
	 * \endif
	 */
	public boolean		bSafeEject; 
}

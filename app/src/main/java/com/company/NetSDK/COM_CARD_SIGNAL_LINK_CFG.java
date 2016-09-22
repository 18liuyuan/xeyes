package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card  linked configuration(when the info from the com fit the configuration, it will trigger the device snap picture)
 * \else
 * 2324.?Z?(:EPE:E!"4854.?Z?(:EPE:EA*6/EdVC(TZ4.?Z7"9}@45D?(:EPEO"BzWcEdVC5D?(:EPEO":s#,=+4%7"Ih18W%M<)
 * \endif
 */
public class COM_CARD_SIGNAL_LINK_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card info
	 * \else
	 * ?(:EPEO"
	 * \endif
	 */
	public COM_CARD_SIGNAL_INFO  struCardInfo = new COM_CARD_SIGNAL_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * event link
	 * \else
	 * JB<~A*6/
	 * \endif
	 */
	public SDK_MSG_HANDLE         struHandle = new SDK_MSG_HANDLE();
}

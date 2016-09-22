package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * BUS configuration info
 * \else
 * W\O_EdVCPEO"
 * \endif
 */
public class CFG_CANFILTER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wait for the reply timeout (unit: ms), after sending data, wait for after 3000 milliseconds, end the Reuters 
	 * \else
	 * 5H4}S&4p3,J1(5%N;::ACk)#, 7"KMJ}>]:s#,5H4}3000:ACk:s#,=aJx8CB7M84+
	 * \endif
	 */
	public int						nResponseTimeout;			
	
	/**
	 * \if ENGLISH_LANG
	 * Receives the request response timeout (unit: ms), more than a specified time not yet received data, think end of the request 
	 * \else
	 * =SJUGkGsS&4p3,J1(5%N;::ACk)#, 3,9}V86(J1<dN4JU5=J}>]#,HON*GkGs=aJx
	 * \endif
	 */
	public int						nRequestTimeout;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of data, 
	 * \else
	 * J}>]:E8vJ}
	 * \endif
	 */
	public int						nFilterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Returns the number of data number
	 * \else
	 * 75;XJ}>]:E8vJ}
	 * \endif
	 */
	public int						nRetFiterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Filter the number of data, 
	 * \else
	 * 9}BKJ}>]:E
	 * \endif
	 */
	public int[]					pnFilterPID;
	
	/**
	 * \if ENGLISH_LANG
	 * Filtering policy
	 * If it is a white list, report contains the data of PID 
	 * If it is a blacklist, report does not contain the data of PID 
	 * All data reported if no filter
	 * \else
	 * 9}BK2_BT
	 * 0 = N4V*2_BT
	 * 1 = N^9}BK ,KySPJ}>]6<IO1(
	 * 2 = 0WC{5%#,IO1(0|:,PID5DJ}>]
	 * 3 = :ZC{5%#,IO1(2;:,PID5DJ}>]
	 * \endif
	 */
	public int						nPolicy;

}

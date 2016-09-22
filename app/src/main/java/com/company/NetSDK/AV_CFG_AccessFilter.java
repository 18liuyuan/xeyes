package	com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Visiting Sites Filter Structure
 * \else
 * 7CNJ5XV79}BK
 * \endif
 */
public class AV_CFG_AccessFilter implements Serializable {

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
	public boolean		bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Types, 0-Black List, 1-White List 
	 * \else
	 * @`PM, 0-:ZC{5%, 1-0WC{5%
	 * \endif
	 */
	public int			nType;
	
 	/**
	 * \if ENGLISH_LANG
	 * White List IP Amounts 
	 * \else
	 * 0WC{5%IPJ}A?
	 * \endif
	 */
	public int			nWhiteListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * White List 
	 * \else
	 * 0WC{5%
	 * \endif
	 */
	public byte[][]		szWhiteList = new byte[FinalVar.AV_CFG_Max_White_List][FinalVar.AV_CFG_Filter_IP_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Black List IP OrIP Segment Black List 
	 * \else
	 * :ZC{5%IP;rIP6NJ}A?
	 * \endif
	 */
	public int			nBlackListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Black List 
	 * \else
	 * :ZC{5%
	 * \endif
	 */
	public byte[][]		szBlackList = new byte[FinalVar.AV_CFG_Max_Black_List][FinalVar.AV_CFG_Filter_IP_Len];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Service Status
 * \else
 * 7~NqW4L,
 * \endif
 */
public class CFG_IPSERVER_STATUS implements Serializable { 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported Server Num
	 * \else
	 * La9)5D7~Nq8vJ}
	 * \endif
	 */
	public int			nSupportedServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Supported Server Name
	 * \else
	 * La9)5D7~NqC{3F  
	 * \endif
	 */
	public byte[][]		szSupportServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info Num 
	 * \else
	 * SvrLa9)5DWS7~NqPEO"8vJ}
	 * \endif
	 */
	public int 			nSvrSuppSubServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info CMS DMS MTS SS RMS DBR
	 * \else
	 * SvrLa9)5DWS7~NqPEO" CMS DMS	MTS	SS RMS DBR
	 * \endif
	 */
	public byte[][]		szSvrSuppSubServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run 
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byCMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byDMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byMTS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			bySS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byRMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byDBR;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			bySvrd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byDataBase;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byDataBased;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byNtpServer;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byNtpServerd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byPrivateII;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byPrivateIId;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			bySAMBA;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byNFS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byFTP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:N4V* 1:TKPP 2:N4TKPP
	 * \endif
	 */
	public byte			byISCSI;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage group config
 * \else
 * 4f4"WiEdVC
 * \endif
 */
public class AV_CFG_StorageGroup implements Serializable { 	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Group name
	 * \else
	 * 7VWiC{3F
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Group note
	 * \else
	 * 7VWiK5Cw
	 * \endif
	 */
	public byte[]		szMemo = new byte[FinalVar.AV_CFG_Group_Memo_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * File reserve time
	 * \else
	 * ND<~1#AtJ1<d
	 * \endif
	 */
	public int			nFileHoldTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage space is overlapped or not
	 * \else
	 * 4f4"?U<dBzJG7q828G
	 * \endif
	 */
	public boolean		bOverWrite;
	
 	/**
	 * \if ENGLISH_LANG
	 * Record file path naming rule
	 * \else
	 * B<OqND<~B7>6C|C{9fTr
	 * \endif
	 */
	public byte[]		szRecordPathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture file path naming rule
	 * %y year, %M month, %d day, %h hour, %m minute, %s second, %c channel path
	 * If year month day hour minute second appear for two times, then first time means start time, second time means end time.
	 * \else
	 * M<F,ND<~B7>6C|C{9fTr
	 * %yDj, %MTB, %dHU, %hJ1, %m7V, %sCk, %cM(5@B7>6
	 * Hg9{DjTBHUJ17VCk3vOVA=4N, 5ZR;4N1mJ>?*J<J1<d, 5Z6~4N1mJ>=aJxJ1<d
	 * \endif
	 */
	public byte[]		szPicturePathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel related config 
	 * \else
	 * M(5@O`9XEdVC 
	 * \endif
	 */
	public AV_CFG_StorageGroupChannel[] stuChannels = new AV_CFG_StorageGroupChannel[FinalVar.AV_CFG_Max_Channel_Num];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel config number
	 * \else
	 * M(5@EdVCJ}
	 * \endif
	 */
	public int			nChannelCount;
	
	public AV_CFG_StorageGroup() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_Channel_Num; ++i) {
			this.stuChannels[i] = new AV_CFG_StorageGroupChannel();
		}
	}
}

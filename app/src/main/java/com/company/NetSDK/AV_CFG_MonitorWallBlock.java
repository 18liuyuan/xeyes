package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall zone
 * \else
 * 5gJSG=Gx?i
 * \endif
 */
public class AV_CFG_MonitorWallBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Row amount of each TV
	 * \else
	 * 5%8vTVU<5DMx8qPPJ}
	 * \endif
	 */
	public int				nLine;				
	
	/**
	 * \if ENGLISH_LANG
	 * Column amount of each TV
	 * \else
	 * 5%8vTVU<5DMx8qAPJ}
	 * \endif
	 */
	public int				nColumn;
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinates of the zone
	 * \else
	 * Gx?i5DGxSrWx1j
	 * \endif
	 */
	public AV_CFG_Rect		stuRect = new AV_CFG_Rect(); 
	
	/**
	 * \if ENGLISH_LANG
	 * TV amount
	 * \else
	 * TVJ}A?
	 * \endif
	 */
	public int				nTVCount;			
	
	/**
	 * \if ENGLISH_LANG
	 * TV array
	 * \else
	 * 5gJSG=Gx?i
	 * \endif
	 */
	public AV_CFG_MonitorWallTVOut[]	stuTVs = new AV_CFG_MonitorWallTVOut[FinalVar.AV_CFG_Max_TV_In_Block];					// TVJ}Wi
	
	/**
	 * \if ENGLISH_LANG
	 * open or close time
	 * \else
	 * 	?*9X;zJ1<d
	 * \endif
	 */
	public CFG_TIME_SECTION[][]		stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * region name
	 * \else
	 * 	Gx?iC{3F
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * composite ID
	 * \else
	 * HZ:OFAID
	 * \endif
	 */
	public byte[]			szCompositeID = new byte[FinalVar.AV_CFG_Device_ID_Len];			

	public AV_CFG_MonitorWallBlock() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; ++i) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; ++j) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int k = 0; k < FinalVar.AV_CFG_Max_TV_In_Block; ++k) {
			stuTVs[k] = new AV_CFG_MonitorWallTVOut();
		}
	}
}

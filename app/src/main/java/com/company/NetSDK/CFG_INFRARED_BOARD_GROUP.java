package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel group 
 * \else
 * :lMbCf0eWi
 * \endif
 */
public class CFG_INFRARED_BOARD_GROUP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * The number of infrared panel
	 * \else
	 * :lMbCf0eJ}A?
	 * \endif
	 */
	public int    nBoardNum;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Infrared panel information 
	 * \else
	 * :lMbCf0ePEO"	
	 * \endif
	 */
	public CFG_INFRARED_BOARD stuBoards[] = new CFG_INFRARED_BOARD[FinalVar.CFG_MAX_INFRARED_BOARD_NUM];
	
	
	public CFG_INFRARED_BOARD_GROUP()
	{
		
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_BOARD_NUM; i++)
		{
			stuBoards[i] = new CFG_INFRARED_BOARD();
		}
	}

	
}
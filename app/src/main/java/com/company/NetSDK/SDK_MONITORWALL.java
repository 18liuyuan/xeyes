package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall config 
 * \else
 * 5gJSG=EdVC
 * \endif
 */
public class SDK_MONITORWALL implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name  
	 * \else
	 *  C{3F
	 * \endif
	 */
	public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];       
    
	/**
	 * \if ENGLISH_LANG
	 * grid row
	 * \else
	 * Mx8qPPJ}
	 * \endif
	 */
	public int                     nGridLine;                
    
	/**
	 * \if ENGLISH_LANG
	 * grid column 
	 * \else
	 * Mx8qAPJ}
	 * \endif
	 */
	public int                     nGridColume; 
    
	/**
	 * \if ENGLISH_LANG
	 * display block group, user allocation nmemory
	 * \else
	 * OTJ>Gx?iJ}Wi, SC;'7VEdDZ4f
	 * \endif
	 */
	public SDK_MONITORWALL_BLOCK[] pstuBlocks;
    
	/**
	 * \if ENGLISH_LANG
	 * display zone group size, user fill in
	 * \else
	 * OTJ>Gx?iJ}Wi4sP!, SC;'LnP4
	 * \endif
	 */
	public int                     nMaxBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * return display block quantity
	 * \else
	 * 75;X5DOTJ>Gx?iJ}A?
	 * \endif
	 */
	public int                     nRetBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * disable or not, 0-tv wall is valid , 1-tv wall is invalid
	 * \else
	 * JG7q={SC, 0-8C5gJSG=SPP', 1-8C5gJSG=N^P'
	 * \endif
	 */
	public boolean                 bDisable; 
    
	/**
	 * \if ENGLISH_LANG
	 * tv wall description information
	 * \else
	 * 5gJSG=ChJvPEO"
	 * \endif
	 */
	public byte[]                  szDesc = new byte[FinalVar.SDK_COMMON_STRING_256];

    public SDK_MONITORWALL(int blockCount, int OutputCount) {
    	this.nMaxBlockCount = blockCount;
    	pstuBlocks = new SDK_MONITORWALL_BLOCK[blockCount];
    	
    	for (int i = 0; i < blockCount; ++i) {
    		pstuBlocks[i] =  new SDK_MONITORWALL_BLOCK(OutputCount);
    	}
    }
}

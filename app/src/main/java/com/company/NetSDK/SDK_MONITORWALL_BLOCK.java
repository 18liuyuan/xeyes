package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV wall display block
 * \else
 * 5gJSG=OTJ>Gx?i
 * \endif
 */
public class SDK_MONITORWALL_BLOCK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * block name 
	 * \else
	 * Gx?iC{3F
	 * \endif
	 */
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];      
    
    /**
     * \if ENGLISH_LANG
     *  splicing video wall ID
     * \else
     * F4=SFAID
     * \endif
     */
    public byte[]                  szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN];   
    
    /**
     * \if ENGLISH_LANG
     * control ID
     * \else
     * ?XVFID
     * \endif
     */
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];    
    
    /**
     * \if ENGLISH_LANG
     * single display unit occupied grid column number
     * \else
     * 5%8vOTJ>5%T*KyU<5DMx8qAPJ}
     * \endif
     */
    public int                     nSingleOutputWidth;
    
    /**
     * \if ENGLISH_LANG
     *  single display unit occupied grid row number
     * \else
     * 5%8vOTJ>5%T*KyU<5DMx8qPPJ}
     * \endif
     */
    public int                     nSingleOutputHeight;            
    
    /**
     * \if ENGLISH_LANG
     * zone coordinate
     * \else
     * GxSrWx1j
     * \endif
     */
    public SDK_RECT                stuRect = new SDK_RECT();                        
    
    /**
     * \if ENGLISH_LANG
     * switch on time chart, first-dimension each element means sunday~saturday and holiday
     * \else
     * ?*;zJ1<d1m, 5ZR;N,8wT*KX1mJ>V\HU~V\Ay:M=Z<YHU
     * \endif
     */
    public SDK_TSECT[][]           stuPowerSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM]; 
    
    /**
     * \if ENGLISH_LANG
     * display unit data,  user allocation memory
     * \else
     * OTJ>5%T*J}Wi, SC;'7VEdDZ4f
     * \endif
     */
    public SDK_MONITORWALL_OUTPUT[] pstuOutputs;
    
    /**
     * \if ENGLISH_LANG
     * display unit group size,user fill in
     * \else
     * OTJ>5%T*J}Wi4sP!, SC;'LnP4
     * \endif
     */
    public int                     nMaxOutputCount; 
    
    /**
     * \if ENGLISH_LANG
     *  return display unit quantity
     * \else
     * 75;X5DOTJ>5%T*J}A?
     * \endif
     */
    public int                     nRetOutputCount;                

    public SDK_MONITORWALL_BLOCK(int OutputCount) {
    	for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i) {
    		for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {	
    			stuPowerSchedule[i][j] = new SDK_TSECT();
    		}
    	}
    	
    	this.nMaxOutputCount = OutputCount;
    	pstuOutputs = new SDK_MONITORWALL_OUTPUT[nMaxOutputCount];
    	for(int k = 0; k < nMaxOutputCount; ++k) {
    		pstuOutputs[k] = new SDK_MONITORWALL_OUTPUT();
    	}
    }
}

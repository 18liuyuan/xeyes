package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRYINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int        		   nMeterType;                         // 75;X2bNB@`PM,<{NET_RADIOMETRY_METERTYPE
    public int                 nTemperUnit;                        // NB6H5%N;(51G0EdVC5DNB6H5%N;),<{ NET_TEMPERATURE_UNIT
    public float               fTemperAver;                        // 5c5DNB6H;rU_F=>yNB6H   5c5DJ1:r V;75;X4KWV6N
    public float               fTemperMax;                         // Wn8_NB6H 
    public float               fTemperMin;                         // Wn5MNB6H 
    public float               fTemperMid;                         // VP<dNB6HV5    
    public float               fTemperStd;                         // 1jW<7=2nV5

}

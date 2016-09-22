package com.company.NetSDK;

import java.io.Serializable;

public class NET_FIREWARNING_INFO implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public int						nPresetId; 						 // T$VC5c1`:E	4S2bNB9fTrEdVCCFG_RADIOMETRY_RULE_INFOVPQ!Tq
	public NET_RECT		    		stuBoundingBox = new NET_RECT(); // WE;p5c>XPN?r	
	public int              		nTemperatureUnit;				 // NB6H5%N;(51G0EdVC5DNB6H5%N;),<{ NET_TEMPERATURE_UNIT
	public float                	fTemperature;                    // Wn8_5cNB6HV5	M,V!<l2b:M2n7V<l2bLa9)
    public int		            	nDistance;                       // WE;p5c>`@k,5%N;CW 01mJ>N^P'
    public GPS_POINT            	stuGpsPoint = new GPS_POINT();   // WE;p5c>-N36H
}

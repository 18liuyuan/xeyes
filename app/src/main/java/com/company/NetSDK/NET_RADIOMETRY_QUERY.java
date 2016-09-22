package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRY_QUERY implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public NET_TIME            stTime = new NET_TIME();                            // <GB<J1<d
    public int                 nPresetId;                         // T$VC5c1`:E
    public int                 nRuleId;                           // 9fTr1`:E
    public byte[]              szName = new byte[64];             // 2iQ/OnC{3F
    public SDK_POINT           stCoordinate = new SDK_POINT();    // 2iQ/2bNB5cWx1j
    public int                 nChannel;                          // M(5@:E
    public NET_RADIOMETRYINFO  stTemperInfo = new NET_RADIOMETRYINFO();  // 2bNBPEO"

}

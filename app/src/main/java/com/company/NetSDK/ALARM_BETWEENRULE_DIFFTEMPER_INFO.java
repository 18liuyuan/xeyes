package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_BETWEENRULE_DIFFTEMPER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                             nAction;                        // 0:?*J< 1:M#V9
    public int                             nOsdId;                         // NB2nOSDEdVCVP5DOSD1`:E
    public int                             nChannelID;                     // JSF5M(5@:E
    public int                             emAlarmContion;                 // 1(>/Lu<~ 0:P!SZ 1:5HSZ 2:4sSZ, NET_RADIOMETRY_ALARMCONTION
    public int                             nRuleId1;                       // 2bNB9fTr1,2N?<EdVCCFG_RADIOMETRY_RULE_INFO
    public int                             nRuleId2;                       // 2bNB9fTr2,2N?<EdVCCFG_RADIOMETRY_RULE_INFO
    public float                           fDiffValue;                     // 9fTr<dNB2nV5
    public int                             nTemperatureUnit;               // NB6H5%N;(51G0EdVC5DNB6H5%N;),<{ CFG_TEMPERATURE_UNIT
    public int                             nPresetID;                      // T$VC5c
}

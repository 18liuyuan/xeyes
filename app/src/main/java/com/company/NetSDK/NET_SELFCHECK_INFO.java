package com.company.NetSDK;

import java.io.Serializable;

public class NET_SELFCHECK_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               nAlarmIn;                 // 1(>/JdHkM(5@J}
	public int               nAlarmOut;                // 1(>/Jd3vM(5@J}  
	public NET_TIME          stuTime = new NET_TIME();                  // IO1(J1<d
    public byte              szPlateNo[] = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN]; // 35EF
    public byte              szICCID[] = new byte[FinalVar.SDK_MAX_SIM_LEN];  // SIM?(:E
    public byte              byOrientation;            // 6(N;W4L,#,0-N46(N;#,1-6(N; 
    public byte              byACCState;               // ACC W4L,#,0-9X1U#,1-4r?*
    public byte              byConstantElecState;      // 3#5gW4L,#,0-U}3#A,=S#,1-6O?*#,2-G7Q9#,3-8_Q9
    public byte              byAntennaState;           // M(PEPE:EW4L,#,0-U}3##,1-N4V*9JUO#,2-N4=S#,3-6LB7
    
    // Mb2?Ih18W4L,
    public byte              byReportStation;          // 1(U>FwW4L,#,0-N4=S#,1-U}3##,2-Rl3#
    public byte              byControlScreen;          // 5w6HFAW4L,#,0-N4=S#,1-U}3##,2-Rl3#
    public byte              byPOS;                    // POS;zW4L,#,0-N4=S#,1-U}3##,2-Rl3#
    public byte              byCoinBox;                // M61ROdW4L,#,0-N4=S#,1-U}3##,2-Rl3#
    
    // D\A&</
    public boolean              bTimerSnap;               // 6(J1W%M<#,TRUE-V'3V#,FALSE-2;V'3V
    public boolean              bElectronEnclosure;       // 5gWSN'@8#,TRUE-V'3V#,FALSE-2;V'3V
    public boolean              bTeleUpgrade;             // T63LI}<6#,TRUE-V'3V#,FALSE-2;V'3V   
    
    public NET_HDD_STATE     stuHddStates[] = new NET_HDD_STATE[FinalVar.SDK_MAX_DISKNUM]; // S2ELW4L,
    public int               nHddNum;                  // S2EL8vJ}
    
    public NET_CHANNLE_STATE pChannleState[];           // M(5@W4L,#,JGR;8vJ}Wi#, 
                                                // CLIENT_AttachMission=S?Z#,NET_MISSION_TYPE_SELFCHECK@`PM#,;X5w:/J}#,DZ4fSISDKIjGk#,SDKJM7E
                                                // CLIENT_GetSelfCheckInfo=S?Z#,3v2N#,DZ4fSISC;'IjGk#,SC;'JM7E
    public int               nChannleNum;              // J5<JIO1(5DM(5@8vJ}
    public int               nChannelMax;              // CLIENT_GetSelfCheckInfo=S?Z#,pChannleStateDZ4f5DWn4sNET_CHANNLE_STATE8vJ}
    public int               emConnState;  // PAD/DVRA,=SW4L,, NET_PAD_CONNECT_STSTE
    public int               emHomeState;  // Home<|W4L,, NET_HOME_STATE
    
    public NET_SELFCHECK_INFO(int nChnMaxNum) {
    	for (int i = 0; i < FinalVar.SDK_MAX_DISKNUM; i++) {
    		stuHddStates[i] = new NET_HDD_STATE();
    	}
    	
    	this.nChannelMax = nChnMaxNum;
    	pChannleState = new NET_CHANNLE_STATE[nChnMaxNum];
    	for (int i = 0; i < nChnMaxNum; i++) {
    		pChannleState[i] = new NET_CHANNLE_STATE();
    	}
    }
}

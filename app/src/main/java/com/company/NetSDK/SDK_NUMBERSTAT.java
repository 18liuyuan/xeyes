package com.company.NetSDK;

import java.io.Serializable;

public class SDK_NUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int      nChannelID;                           //M3<FM(5@:E
	public byte     szRuleName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];         //9fTrC{3F
	public NET_TIME stuStartTime = new NET_TIME();                         //?*J<J1<d
	public NET_TIME stuEndTime = new NET_TIME();                           //=aJxJ1<d
	public int      nEnteredSubTotal;                     //=xHkHKJ}P!<F
	public int      nExitedSubtotal;                      //3vH%HKJ}P!<F
	public int      nAvgInside;                           //F=>y1#SPHKJ}(3}H%AcV5)
	public int      nMaxInside;                           //Wn4s1#SPHKJ}
	public int      nEnteredWithHelmet;                   //4w02H+C1=xHkHKJ}P!<F
	public int      nEnteredWithoutHelmet;                //2;4w02H+C1=xHkHKJ}P!<F
	public int      nExitedWithHelmet;                    //4w02H+C13vH%HKJ}P!<F
	public int      nExitedWithoutHelmet;                 //2;4w02H+C13vH%HKJ}P!<F
}

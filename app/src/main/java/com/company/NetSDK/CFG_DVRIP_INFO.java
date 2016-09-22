package com.company.NetSDK;

import java.io.Serializable;

public class CFG_DVRIP_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public int                 nTcpPort;                           // TCP7~Nq6K?Z,1025~65535
	public int                 nSSLPort;                           // SSL7~Nq6K?Z,1025~65535
	public int                 nUDPPort;                           // UDP7~Nq6K?Z,1025~65535
	public int                 nMaxConnections;                    // Wn4sA,=SJ} 
	public boolean             bMCASTEnable;                       // Wi2%J9D\
	public int                 nMCASTPort;                         // Wi2%6K?Z:E
	public byte                szMCASTAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];    // Wi2%5XV7
	public int                 nRegistersNum;                      // Vw6/W"2aEdVC8vJ}
	public CFG_REGISTER_SERVER_INFO stuRegisters[] = new CFG_REGISTER_SERVER_INFO[FinalVar.MAX_REGISTER_NUM];// Vw6/W"2aEdVC 
    public int    			   emStreamPolicy;                     // 4x?m2;WcJ1BkAw2_BT, 6TS& EM_STREAM_POLICY
    
    public CFG_DVRIP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_REGISTER_NUM; ++i) {
    		stuRegisters[i] =  new CFG_REGISTER_SERVER_INFO();
    	}
    }
}

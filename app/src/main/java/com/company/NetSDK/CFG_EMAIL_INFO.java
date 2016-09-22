package com.company.NetSDK;

import java.io.Serializable;

public class CFG_EMAIL_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public boolean		   bEnable;				                            // J9D\
    public boolean         bSslEnable;                                         // JG7qPhR*SSL<SC\
    public boolean         bTlsEnable;                                         // JG7qPhR*TLS<SC\
    public byte            szAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];   // SMTP7~NqFwIP5XV7;rMxBgC{
    public int             nPort;                                              // 6K?Z:E
    public byte            szUserName[] = new byte[FinalVar.MAX_USERNAME_LEN]; // UJ;'C{
    public byte            szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN]; // C\Bk
    public boolean         bAnonymous;                                         // DdC{SJ<~#,trueDdC{#,false7GDdC{
    public byte            szSendAddress[]  = new byte[FinalVar.MAX_ADDRESS_LEN];// 7"<~HK5XV7
    public int             nRetReciversNum;                                      // SPP'JU<~HKJ}
    public byte            szReceivers[][] = new byte[FinalVar.MAX_RECEIVER_NUM][FinalVar.MAX_ADDRESS_LEN];     // JU<~HKAP1m
    public byte            szTitle[] = new byte[FinalVar.MAX_MAILTITLE_LEN];     // SJ<~1jLb9X<|WV
    public boolean         bOnlyAttachment;                                      // JB<~A*6/SJ<~#,V;7"KM4x8=<~5DSJ<~
    public boolean         bAttachEnable;                                        // SJ<~8=<~J9D\
    public int             nSendInterv;                                          // M,R;JB<~5DWnP!SJ<~7"KM<d8t#,5%N;N*Ck
    public boolean         abHealthReport;                                    	  // D\A&,N*trueJ1,stuHealthReportSPP'
    public CFG_HEALTHREPORT_INFO   stuHealthReport = new CFG_HEALTHREPORT_INFO();// SJ<~IO1(Ih18W4?v
}

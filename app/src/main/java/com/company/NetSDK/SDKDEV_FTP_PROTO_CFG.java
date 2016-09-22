package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ftp configuration
 * \else
 * ftpEdVC
 * \endif
 */
public class SDKDEV_FTP_PROTO_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to enable
	 * \else
	 * JG7qFtSC
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * Vw;zIP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * Vw;z6K?Z
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * FTP directory path
	 * \else
	 * FTPD?B<B7>6
	 * \endif
	 */
    public byte                szDirName[] = new byte[FinalVar.SDK_FTP_MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * SC;'C{
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_FTP_USERNAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
    public byte                szPassword[] = new byte[FinalVar.SDK_FTP_PASSWORD_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Length of the file
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
    public int                 iFileLen;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjacent the file time intervals (1 to 600), in seconds
	 * \else
	 * O`AZND<~J1<d<d8t(1~600),5%N;Ck
	 * \endif
	 */
    public int                 iInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * FTP upload configuration
	 * \else
	 * FTPIO4+EdVC
	 * \endif
	 */
    public SDK_FTP_UPLOAD_CFG   struUploadCfg[][] = new SDK_FTP_UPLOAD_CFG[FinalVar.SDK_MAX_CHANNUM][FinalVar.SDK_N_WEEKS];
    
    /**
	 * \if ENGLISH_LANG
	 * 0-FTP, 1-SMB 2-NFS,3-ISCSI
	 * \else
	 * 0-FTP#, 1-SMB 2-NFS#,3-ISCSI
	 * \endif
	 */
    public byte                protocol;
    
    /**
	 * \if ENGLISH_LANG
	 * Network storage server version 0 = old FTP (time period) interface (shielded interface 1 = NAS storage period). 
	 * \else
	 * MxBg4f4"7~NqFw0f1>0=@O5DFTP(=gCfIOOTJ>J1<d6N)#,1=NAS4f4"(=gCfIOFA1NJ1<d6N)!#
	 * \endif
	 */
    public byte                NASVer;
    
    /**
	 * \if ENGLISH_LANG
	 * The functional capabilities mask, bitwise, low 16 (network storage) followed by FTP, SMB, NFS, high 16 (local storage) order DISK, U. 
	 * \else
	 * 9&D\D\A&QZBk#,04N;1mJ>#,5M16N;(MxBg4f4")R@4N1mJ>FTP#,SMB#,NFS#,8_16N;(1>5X4f4")R@4NN*DISK#,U!#
	 * \endif
	 */
    public int               dwFunctionMask;
    
    /**
	 * \if ENGLISH_LANG
	 * Data type 0 - type 1 - Video 2 - Pictures 
	 * \else
	 * J}>]@`PM, 0-KySP@`PM, 1-JSF5, 2-M<F,
	 * \endif
	 */
    public byte                bDataType;
    
    public SDKDEV_FTP_PROTO_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_WEEKS; j++) {
    			struUploadCfg[i][j] = new SDK_FTP_UPLOAD_CFG();
    		}
    	}
    }
}

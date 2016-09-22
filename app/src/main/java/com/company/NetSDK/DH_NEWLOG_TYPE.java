package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Log search type 
 * \else
 * HUV>2iQ/@`PM
 * \endif
 */
public class DH_NEWLOG_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot 
	 * \else
	 * Ih18VXFt
	 * \endif
	 */
	
	public static final int     DH_NEWLOG_REBOOT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * Ih189X;z
	 * \endif
	 */
	
  	public static final int     DH_NEWLOG_SHUT = 1;
  	
    public static final int     DH_NEWLOG_REPORTSTOP = 2;
    public static final int     DH_NEWLOG_REPORTSTART = 3;
    
	/**
	 * \if ENGLISH_LANG
	 * Device upgrade
	 * \else
	 *  Ih18I}<6
	 * \endif
	 */
    public static final int     DH_NEWLOG_UPGRADE = 4;
    
	/**
	 * \if ENGLISH_LANG
	 * system time update
	 * \else
	 *  O5M3J1<d8|PB
	 * \endif
	 */
    public static final int     DH_NEWLOG_SYSTIME_UPDATE = 5;
    
	/**
	 * \if ENGLISH_LANG
	 *  GPS time update
	 * \else
	 *  GPSJ1<d8|PB
	 * \endif
	 */
    public static final int     DH_NEWLOG_GPS_TIME_UPDATE = 6;

	/**
	 * \if ENGLISH_LANG
	 *  Voice intercom, true representative open, false on behalf of the closed
	 * \else
	 * SoRt6T=2#, true4z1m?*Ft#,false4z1m9X1U    
	 * \endif
	 */
    public static final int     DH_NEWLOG_AUDIO_TALKBACK = 7;
    
	/**
	 * \if ENGLISH_LANG
	 *  Transparent transmission, true representative open, false on behalf of the closed
	 * \else
	 * M8Cw4+Jd#, true4z1m?*Ft#,false4z1m9X1U    
	 * \endif
	 */
    public static final int     DH_NEWLOG_COMM_ADAPTER = 8;
    
	/**
	 * \if ENGLISH_LANG
	 *  NTP
	 * \else
	 * MxBgP#J1 
	 * \endif
	 */
    public static final int     DH_NEWLOG_NET_TIMING = 9;

	/**
	 * \if ENGLISH_LANG
	 *  Save configuration 
	 * \else
	 * 1#4fEdVC
	 * \endif
	 */
    public static final int     DH_NEWLOG_CONFSAVE = 256; 
    
	/**
	 * \if ENGLISH_LANG
	 *  Read configuration 
	 * \else
	 * 6AH!EdVC
	 * \endif
	 */
    public static final int     DH_NEWLOG_CONFLOAD = 257;
    
	/**
	 * \if ENGLISH_LANG
	 * File system error
	 * \else
	 * ND<~O5M34mNs
	 * \endif
	 */
    public static final int     DH_NEWLOG_FSERROR = 512;
    
	/**
	 * \if ENGLISH_LANG
	 * HDD write error 
	 * \else
	 *  S2ELP44mNs
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_WERR = 513;
    
    
    /**
	 * \if ENGLISH_LANG
	 * HDD write error 
	 * \else
	 *  HDD read error
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_RERR = 514;
    
    /**
	 * \if ENGLISH_LANG
	 *  Set HDD type 
	 * \else
	 *  IhVCS2EL@`PM
	 * \endif
	 */
    public static final int     DH_NEWLOG_HDD_TYPE = 515;                          // IhVCS2EL@`PM
    
    /**
  	 * \if ENGLISH_LANG
  	 * Format HDD 
  	 * \else
  	 *   8qJ=;/S2EL
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_FORMAT = 516;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Current working HDD space is not sufficient
  	 * \else
  	 *   51G09$WwEL?U<d2;Wc
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_NOSPACE = 517;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as read-write
  	 * \else
  	 *  IhVCS2EL@`PMN*6AP4EL
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RW = 518;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as read-only
  	 * \else
  	 * IhVCS2EL@`PMN*V;6AEL    
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RO = 519;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as redundant 
  	 * \else
  	 * IhVCS2EL@`PMN*H_S`EL  
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RE = 520;
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set HDD type as snapshot
  	 * \else
  	 *IhVCS2EL@`PMN*?lUUEL
  	 * \endif
  	 */
    public static final int     DH_NEWLOG_HDD_TYPE_SS = 521;
    
    /**
   	 * \if ENGLISH_LANG
   	 * No HDD
   	 * \else
   	 *N^S2EL<GB<HUV>
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NONE = 522;
    
    /**
   	 * \if ENGLISH_LANG
   	 * No work HDD
   	 * \else
   	 *N^9$WwEL(C;SP6AP4EL)
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NOWORKHDD = 523;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Set HDD type to backup HDD
   	 * \else
   	 *IhVCS2EL@`PMN*187]EL
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TYPE_BK = 524;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Set HDD type to reserve subareas
   	 * \else
   	 *IhVCS2EL@`PMN*1#At7VGx
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_HDD_TYPE_REVERSE = 525;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 *  note the boot-strap's hard disk info
   	 * \else
   	 *<GB<?*;zJ15DS2ELPEO"
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_START_INFO = 526;
    
    /**
   	 * \if ENGLISH_LANG
   	 * note the disk number after the disk change
   	 * \else
   	 *<GB<;;EL:s5D9$WwEL:E
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_WORKING_DISK = 527;
    
    /**
   	 * \if ENGLISH_LANG
   	 * note other errors of disk
   	 * \else
   	 *<GB<S2ELFdK|4mNs
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_OTHER_ERROR = 528;
    
    /**
   	 * \if ENGLISH_LANG
   	 * there has some little errors on disk
   	 * \else
   	 *S2EL4fTZGaN"NJLb
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_SLIGHT_ERR = 529;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  there has some serious errors on disk
   	 * \else
   	 * S2EL4fTZQOVXNJLb
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_SERIOUS_ERR = 530;
    
    /**
   	 * \if ENGLISH_LANG
   	 * e end of the alarm that current disk has no space left 
   	 * \else
   	 *51G09$WwEL?U<d2;Wc1(>/=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_NOSPACE_END = 531;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * Raid operation
   	 * \else
   	 * Raid2YWw
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TYPE_RAID_CONTROL = 532;
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * excess temperature
   	 * \else
   	 *NB6H9}8_
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TEMPERATURE_HIGH = 533;
    
    /**
   	 * \if ENGLISH_LANG
   	 * lower die temperature
   	 * \else
   	 *NB6H9}5M
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_TEMPERATURE_LOW = 534;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  remove eSATA
   	 * \else
   	 *RF3}eSATA
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_ESATA_REMOVE = 535;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  External alarm begin 
   	 * \else
   	 * Mb2?JdHk1(>/?*J<
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_ALM_IN = 768;
    /**
   	 * \if ENGLISH_LANG
   	 * Network alarm input
   	 * \else
   	 *MxBg1(>/
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NETALM_IN = 769; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * External input alarm stop 
   	 * \else
   	 * Mb2?JdHk1(>/M#V9
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_END = 770; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Video loss alarm begin 
   	 * \else
   	 *JSF56*J'1(>/?*J<
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOSS_IN = 771;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Video loss alarm stop
   	 * \else
   	 * JSF56*J'1(>/=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOSS_END = 772; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * Motion detection alarm begin
   	 * \else
   	 *6/L,<l2b1(>/?*J<
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MOTION_IN = 773; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Motion detection alarm stop
   	 * \else
   	 *6/L,<l2b1(>/=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MOTION_END = 774;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Annunciator alarm input 
   	 * \else
   	 *1(>/Fw1(>/JdHk
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_BOSHI = 775;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Network disconnected 
   	 * \else
   	 * MxBg6O?*
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_ABORT = 776; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Network connection restore 
   	 * \else
   	 * MxBg;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_ABORT_RESUME = 777; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Encoder error
   	 * \else
   	 * 1`BkFw9JUO
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CODER_BREAKDOWN  = 778; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Encoder error restore 
   	 * \else
   	 *1`BkFw9JUO;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CODER_BREAKDOWN_RESUME = 779;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Camera masking
   	 * \else
   	 *JSF5UZ52
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BLIND_IN = 780;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Restore camera masking 
   	 * \else
   	 * JSF5UZ52;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BLIND_END = 781;
    
    /**
   	 * \if ENGLISH_LANG
   	 * High temperature
   	 * \else
   	 *NB6H9}8_
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_TEMP_HIGH = 782; 
    
    
    /**
   	 * \if ENGLISH_LANG
   	 * Low voltage
   	 * \else
   	 *5gQ99}5M
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_VOLTAGE_LOW = 783;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Battery capacity is not sufficient 
   	 * \else
   	 *5g3XH]A?2;Wc
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_BATTERY_LOW = 784;
    
    /**
   	 * \if ENGLISH_LANG
   	 * ACC power off 
   	 * \else
   	 *ACC6O5g
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_ACC_BREAK = 785;
    
  
   	
    public static final int     DH_NEWLOG_ALM_ACC_RES = 786;
    
    /**
   	 * \if ENGLISH_LANG
   	 *GPS signal lost
   	 * \else
   	 *GPSN^PE:E
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_GPS_SIGNAL_LOST = 787;                    // 
    
    /**
   	 * \if ENGLISH_LANG
   	 * GPS signal resume
   	 * \else
   	 *GPSPE:E;V84
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_GPS_SIGNAL_RESUME = 788; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  3G signal lost
   	 * \else
   	 * 3GN^PE:E
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_3G_SIGNAL_LOST = 789;
    
    /**
   	 * \if ENGLISH_LANG
   	 * 3G signal resume
   	 * \else
   	 *3GPE:E;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_3G_SIGNAL_RESUME = 790;
    
    /**
   	 * \if ENGLISH_LANG
   	 * IPC external alarm
   	 * \else
   	 *IPCMb2?1(>/
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_ALM_IPC_IN = 791;
    
    /**
   	 * \if ENGLISH_LANG
   	 * IPC external alarms recovery 
   	 * \else
   	 * IPCMb2?1(>/;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_IPC_END = 792;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Broken network alarm
   	 * \else
   	 *6OMx1(>/
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_DIS_IN = 793;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Broken network alarm recovery
   	 * \else
   	 *6OMx1(>/;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_DIS_END = 794; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * Wireless alarm begin 
   	 * \else
   	 *N^O_1(>/?*J<
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_INFRAREDALM_IN = 928;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Wireless alarm end 
   	 * \else
   	 *N^O_1(>/=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INFRAREDALM_END = 929;
    
    /**
   	 * \if ENGLISH_LANG
   	 *IP conflict 
   	 * \else
   	 *IP3eM;
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IPCONFLICT = 930;                  
    
    /**
   	 * \if ENGLISH_LANG
   	 * IP restore
   	 * \else
   	 * IP;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IPCONFLICT_RESUME = 931;
    
    /**
   	 * \if ENGLISH_LANG
   	 * SD Card insert
   	 * \else
   	 *SD?(2eHk
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SDPLUG_IN = 932; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  SD Card Pull-out
   	 * \else
   	 *SD?(0N3v
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SDPLUG_OUT = 933;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Failed to bind port
   	 * \else
   	 *MxBg6K?Z0s6(J'0\
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_PORT_BIND_FAILED = 934;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Hard disk error beep reset
   	 * \else
   	 *S2EL4mNs1(>/7dCy=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_HDD_BEEP_RESET = 935;
    
    /**
   	 * \if ENGLISH_LANG
   	 * MAC conflict
   	 * \else
   	 *MAC3eM;
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MAC_CONFLICT = 936;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  MAC conflict resume
   	 * \else
   	 *MAC3eM;;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MAC_CONFLICT_RESUME = 937;
    
    /**
   	 * \if ENGLISH_LANG
   	 * alarm of output state
   	 * \else
   	 *1(>/Jd3vW4L,
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALARM_OUT = 938;
    
    /**
   	 * \if ENGLISH_LANG
   	 * RAID state change
   	 * \else
   	 * RAIDW4L,1d;/JB<~
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ALM_RAID_STAT_EVENT = 939;
    
    /**
   	 * \if ENGLISH_LANG
   	 *fire alarm, smoke or temperature
   	 * \else
   	 *;p>/1(>/#,QL8P;rNB6H
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ABLAZE_ON = 940;
    
    /**
   	 * \if ENGLISH_LANG
   	 * fire alarm resume
   	 * \else
   	 *;p>/1(>/ ;V84
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ABLAZE_OFF = 941;
    
    /**
   	 * \if ENGLISH_LANG
   	 * alarm of pulse type
   	 * \else
   	 *VGD\Bv3ePM1(>/
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_PLUSE = 942;
    
    /**
   	 * \if ENGLISH_LANG
   	 *begin of alarm
   	 * \else
   	 *VGD\1(>/?*J<
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_IN = 943;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  end of alarm
   	 * \else
   	 *VGD\1(>/=aJx
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_INTELLI_ALARM_END = 944; 
    
    /**
   	 * \if ENGLISH_LANG
   	 * 3G signal scan
   	 * \else
   	 *3GPE:E<l2b
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_3G_SIGNAL_SCAN = 945; 
    /**
   	 * \if ENGLISH_LANG
   	 * GPS signal scan
   	 * \else
   	 *GPSPE:E<l2b
   	 * \endif
   	 */
    
    public static final int     DH_NEWLOG_GPS_SIGNAL_SCAN = 946;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Auto record
   	 * \else
   	 * WT6/B<Os
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_AUTOMATIC_RECORD = 947;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Manual record
   	 * \else
   	 *JV6/B<Os?*
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MANUAL_RECORD = 948;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Stop record 
   	 * \else
   	 *M#V9B<Os
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CLOSED_RECORD = 949;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Log in 
   	 * \else
   	 *5GB<
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOGIN = 1280;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Log off 
   	 * \else
   	 *W"Oz
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOGOUT = 1281;
    
    /**
   	 * \if ENGLISH_LANG
   	 *add user
   	 * \else
   	 * Delete user
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ADD_USER = 1282;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Delete user
   	 * \else
   	 *I>3}SC;'
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DELETE_USER  = 1283;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Modify user 
   	 * \else
   	 *P^8DSC;'
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MODIFY_USER = 1284;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Add user group 
   	 * \else
   	 *Lm<SSC;'Wi
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ADD_GROUP = 1285;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Delete user group 
   	 * \else
   	 * I>3}SC;'Wi
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DELETE_GROUP = 1286;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Modify user group
   	 * \else
   	 * P^8DSC;'Wi
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_MODIFY_GROUP = 1287;
    
    /**
   	 * \if ENGLISH_LANG
   	 *   Network user login
   	 * \else
   	 * MxBgSC;'5GB<
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_NET_LOGIN = 1288;
    
    /**
   	 * \if ENGLISH_LANG
   	 * clear log
   	 * \else
   	 *Ge3}HUV>
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_CLEAR = 1536;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Search log 
   	 * \else
   	 *2iQ/HUV>
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SEARCHLOG = 1537;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Search record 
   	 * \else
   	 *B<Oq2iQ/
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_SEARCH = 1792;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Record download
   	 * \else
   	 *B<OqOBTX
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DOWNLOAD = 1793;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Record playback
   	 * \else
   	 * B<Oq;X7E
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_PLAYBACK = 1794;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Backup recorded file 
   	 * \else
   	 * 187]B<OqND<~
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUP = 1795;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Failed to backup recorded file
   	 * \else
   	 * 187]B<OqND<~J'0\
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUPERROR = 1796;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Real-time backup, that is, copy CD
   	 * \else
   	 *J5J1187]#,<49bEL?LB<
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_BACK_UPRT = 1797;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  CD copy
   	 * \else
   	 *9bEL84VF
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_BACKUPCLONE = 1798;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Manual  changed
   	 * \else
   	 *JV6/;;EL
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_DISK_CHANGED = 1799;
    
    /**
   	 * \if ENGLISH_LANG
   	 * image palyback
   	 * \else
   	 *M<F,;X7E
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_IMAGEPLAYBACK = 1800;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Lock the video
   	 * \else
   	 *Kx6(B<Oq
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_LOCKFILE = 1801;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  Unlock the video
   	 * \else
   	 * =bKxB<Oq
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_UNLOCKFILE = 1802;
    
    /**
   	 * \if ENGLISH_LANG
   	 * Add log superposition of ATM card number
   	 * \else
   	 *ATM?(:E5~<SLm<SHUV>
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_ATMPOS = 1803;
    
    /**
   	 * \if ENGLISH_LANG
   	 *Time update
   	 * \else
   	 *J1<d8|PB
   	 * \endif
   	 */

    public static final int     DH_NEWLOG_TIME_UPDATE  = 2048;
    
    /**
   	 * \if ENGLISH_LANG
   	 *  remote diary 
   	 * \else
   	 * T63LHUV> 
   	 * \endif
   	 */
    public static final int     DH_NEWLOG_REMOTE_STATE = 2128;
    
    public static final int     DH_NEWLOG_USER_DEFINE = 2304;
    
    public static final int     DH_NEWLOG_TYPE_NR = 10;      

	
}
package com.company.NetSDK;

import java.io.Serializable;


public class FinalVar implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * MAX length of path
	 * \else
	 * M(SCWV7{4.3$6H
	 * \endif
	 */
	public static final int MAX_PATH              = 260;   
	/**
	 * \if ENGLISH_LANG
	 * Device SN string length
	 * \else
	 * Ih18PrAP:EWV7{3$6H
	 * \endif
	 */
	public static final int SDK_SERIALNO_LEN= 48;			  
	/**
	 * \if ENGLISH_LANG
	 * Max HDD number
	 * \else
	 * Wn4sS2EL8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_DISKNUM= 256;			  
	/**
	 * \if ENGLISH_LANG
	 * Max SD card number
	 * \else
	 * Wn4sSD?(8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_SDCARDNUM= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Max buner amount
	 * \else
	 * Wn4s?LB<Ih188vJ}
	 * \endif
	 */
	public static final int SDK_MAX_BURNING_DEV_NUM= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Burner name max length
	 * \else
	 * ?LB<Ih18C{WVWn4s3$6H
	 * \endif
	 */
	public static final int SDK_BURNING_DEV_NAMELEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * The max connnect count of SDK
	 * \else
	 * SDKWn4sA,=SJ}
	 * \endif
	 */
	public static final int SDK_MAX_LINK = 6;
	/**
	 * \if ENGLISH_LANG
	 * Max channel amount
	 * \else
	 * Wn4sM(5@8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM= 16;			  
	/**
	 * \if ENGLISH_LANG
	 * decoder device max channel number
	 * \else
	 * =bBkFwWn4sM(5@J}
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_CHANNUM= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Max alarm input amount
	 * \else
	 * Wn4s1(>/JdHk8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_ALARMIN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Max alarm output amount
	 * \else
	 * Wn4s1(>/Jd3v8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * SC;'H(O^8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_RIGHT_NUM= 100;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user group amount
	 * \else
	 * SC;'Wi8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_GROUP_NUM= 20;			  
	/**
	 * \if ENGLISH_LANG
	 * Max user account amount
	 * \else
	 * SC;'8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_USER_NUM= 200;			  
	/**
	 * \if ENGLISH_LANG
	 * Right name length
	 * \else
	 * H(O^C{3$6H
	 * \endif
	 */
	public static final int SDK_RIGHT_NAME_LENGTH= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * SC;'C{3$6H
	 * \endif
	 */
	public static final int SDK_USER_NAME_LENGTH= 8;			  
	/**
	 * \if ENGLISH_LANG
	 * User password length
	 * \else
	 * SC;'C\Bk3$6H
	 * \endif
	 */
	public static final int SDK_USER_PSW_LENGTH= 8;			  
	/**
	 * \if ENGLISH_LANG
	 * Note length 
	 * \else
	 * 18W"3$6H
	 * \endif
	 */
	public static final int SDK_MEMO_LENGTH= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Max string length
	 * \else
	 * WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_STRING_LEN= 128;
	/**
	 * \if ENGLISH_LANG
	 * Max six rows
	 * \else
	 * Wn6`AyPP
	 * \endif
	 */
	public static final int MAX_STRING_LINE_LEN= 6;			  
	/**
	 * \if ENGLISH_LANG
	 * Line max length
	 * \else
	 * C?PPWn4s3$6H
	 * \endif
	 */
	public static final int MAX_PER_STRING_LEN= 20;			  
	/**
	 * \if ENGLISH_LANG
	 * The user name length the new mail structure supported
	 * \else
	 * PB5DSJ<~=a99LeV'3V5DSC;'C{3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_NAME_LEN= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Password length the new mail structhre supported
	 * \else
	 * PB5DSJ<~=a99LeV'3V5DC\Bk3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_PSW_LEN= 64;			  
	/**
	 * \if ENGLISH_LANG
	 * Speed limit string max length
	 * \else
	 * O^KY@`PMWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_SPEEDLIMIT_TYPE_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info type max length
	 * \else
	 * 35TXWT6(RePEO"@`PMWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_VEHICLE_TYPE_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info string max length
	 * \else
	 * 35TXWT6(RePEO"WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_VEHICLE_INFO_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Driver no string max length
	 * \else
	 * 35TXWT6(RePEO"K>;z9$:EWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_VEHICLE_DRIVERNO_LEN= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max supported crossing num 
	 * \else
	 * Wn4s5cN;
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_NUM= 128;           
	/**
	 * \if ENGLISH_LANG
	 * Max crossing ID length
	 * \else
	 * B7?ZPrAP:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_ID= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max card info length
	 * \else
	 * ?(:EPEO"Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CARD_INFO_LEN= 256;			  
	/**
	 * \if ENGLISH_LANG
	 * Extended max channel number
	 * \else
	 * Wn4sM(5@J}@)U9  
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM_EX= 32;            
	/**
	 * \if ENGLISH_LANG
	 * Max number of IP for saerch
	 * \else
	 * Wn4sKQKwIP8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_SAERCH_IP_NUM= 256;           
	/**
	 * \if ENGLISH_LANG
	 * Hard disk type maximum length
	 * \else
	 * S2ELPM:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_TYPE_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Hard disk serial maximum length
	 * \else
	 * S2ELPrAP:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_SERIAL_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Value of SIM maximum length
	 * \else
	 * SIM?(5DV55DWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_SIM_LEN= 16;			  
	/**
	 * \if ENGLISH_LANG
	 * Pick up SIM maximum number
	 * \else
	 * 35TXSIM?(Wn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_SIM_NUM= 10;			  
	/**
	 * \if ENGLISH_LANG
	 * Version maximum length
	 * \else
	 * Hm<~0f1>:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_LEN= 32;			  
	/**
	 * \if ENGLISH_LANG
	 * Value of MDN maximum length
	 * \else
	 * MDN5DV55DWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MDN_LEN= 36;			  
	/**
	 * \if ENGLISH_LANG
	 * Support the card number
	 * \else
	 * V'3V5DMx?(8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_NETINTERFACE_NUM= 64;            
	/**
	 * \if ENGLISH_LANG
	 * Length of event name
	 * \else
	 * JB<~C{3F3$6H
	 * \endif
	 */
	public static final int SDK_EVENT_NAME_LEN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Length of storage name
	 * \else
	 * 4f4"Ih18C{3F3$6H
	 * \endif
	 */
	public static final int SDK_STORAGE_NAME_LEN= 128;			  
	/**
	 * \if ENGLISH_LANG
	 * Carport liht maximum number
	 * \else
	 * Wn4s35N;5F8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_CARPORTLIGHT_NUM= 4;             
	/**
	 * \if ENGLISH_LANG
	 * Length of station name
	 * \else
	 * 35U>U>5cC{3F3$6H   
	 * \endif
	 */
	public static final int SDK_STATION_NAME_LEN= 32;
	/**
	 * \if ENGLISH_LANG
	 * Version string max length
	 * \else
	 * 0f1>WV7{4.Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_STR= 64;
	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * M(SCWV7{4.3$6H16
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_16= 16;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * M(SCWV7{4.3$6H32
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_32= 32;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * M(SCWV7{4.3$6H64
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_64= 64;            
	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * M(SCWV7{4.3$6H128
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_128= 128;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * M(SCWV7{4.3$6H256
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_256= 256;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * M(SCWV7{4.3$6H512
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_512= 512;           
	/**
	 * \if ENGLISH_LANG
	 * General string length 1024
	 * \else
	 * M(SCWV7{4.3$6H===1024
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_1024= 1024;       
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix number
	 * \else
	 * Wn4sOBN;>XUsJ}
	 * \endif
	 */
	public static final int SDK_MAX_LOWER_MITRIX_NUM             =         16 ;    
	/**
	 * \if ENGLISH_LANG
	 * Max writing channel number
	 * \else
	 * Wn4s?LB<M(5@J}
	 * \endif
	 */
	public static final int SDK_MAX_BURN_CHANNEL_NUM             =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max remote storage area quantity
	 * \else
	 * Wn4sT63L4f4"Gx?iJ}A?
	 * \endif
	 */
	public static final int SDK_MAX_NET_STRORAGE_BLOCK_NUM       =         64 ;  
	
	/**
	 * \if ENGLISH_LANG
	 * Case staff max quantity
	 * \else
	 * 08<~HKT1Wn4sJ}A?
	 * \endif
	 */
	public static final int SDK_MAX_CASE_PERSON_NUM              =         32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback channel number
	 * \else
	 * Wn4s6`M(5@T$@@;X7EM(5@J}
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM    =         64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback split mode number
	 * \else
	 * Wn4s6`M(5@T$@@;X7E7V8nD#J=J}
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_SPLIT_NUM      =         32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio encode type number
	 * \else
	 * Wn4sSoRt1`Bk@`PM8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_ENCODE_TYPE             =         64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Access control name length
	 * \else
	 * CE={C{3F3$6H
	 * \endif
	 */
	public static final int SDK_MAX_ACCESS_NAME_LEN               =         64  ;
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm channel name length
	 * \else
	 * @)U9D#?i1(>/M(5@C{3F3$6H
	 * \endif
	 */
	public static final int SDK_MAX_EXALARMCHANNEL_NAME_LEN       =         128 ;
  
	/**
	 * \if ENGLISH_LANG
	 * Search general alarm status(including external alarm,video loss, motion detection)
	 * \else
	 * 2iQ/FUM(1(>/W4L,(0|@(Mb2?1(>/#,JSF56*J'#,6/L,<l2b)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMM_ALARM	            =     0x0001 ;  
	/**
	 * \if ENGLISH_LANG
	 * Search camera masking alarm status
	 * \else
	 * 2iQ/UZ521(>/W4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SHELTER_ALARM           =     0x0002 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search record status 
	 * \else
	 * 2iQ/B<OsW4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORDING               =     0x0003 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search HDD information 
	 * \else
	 * 2iQ/S2ELPEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK                    =     0x0004 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search system resources status 
	 * \else
	 * 2iQ/O5M3WJT4W4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RESOURCE                =     0x0005 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search channel bit stream 
	 * \else
	 * 2iQ/M(5@BkAw
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BITRATE                 =     0x0006 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search device connection status 
	 * \else
	 * 2iQ/Ih18A,=SW4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONN                    =     0x0007 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search network protocol version number , pBuf = int*
	 * \else
	 * 2iQ/MxBgP-Ri0f1>:E#,pBuf = int*
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PROTOCAL_VER            =     0x0008 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the audio talk format the device supported. Please refer to structure SDKDEV_TALKFORMAT_LIST
	 * \else
	 * 2iQ/Ih18V'3V5DSoRt6T=28qJ=AP1m#,<{=a99Le SDKDEV_TALKFORMAT_LIST
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TALK_ECTYPE             =     0x0009 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search SD card information(FOR IPC series)
	 * \else
	 * 2iQ/SD?(PEO"(IPC@`2zF7)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SD_CARD                 =     0x000A ;   
	/**
	 * \if ENGLISH_LANG
	 * Search burner information
	 * \else
	 * 2iQ/?LB<;zPEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_DEV             =     0x000B ;   
	/**
	 * \if ENGLISH_LANG
	 * Search burning information
	 * \else
	 * 2iQ/?LB<=x6H
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_PROGRESS        =     0x000C ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the embedded platform the device supported
	 * \else
	 * 2iQ/Ih18V'3V5D=SHkF=L(
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PLATFORM                =     0x000D ;   
	/**
	 * \if ENGLISH_LANG
	 * Search camera property information ( for IPC series),pBuf = SDKDEV_CAMERA_INFO *,there can be several structure.
	 * \else
	 * 2iQ/IcOqM7JtPTPEO"(IPC@`2zF7)#,pBuf = SDKDEV_CAMERA_INFO *#,?IRTSP6`8v=a99Le
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CAMERA                  =     0x000E ;   
	/**
	 * \if ENGLISH_LANG
	 * Search device software version information
	 * \else
	 * 2iQ/Ih18Hm<~0f1>PEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SOFTWARE                =     0x000F ;   
	/**
	 * \if ENGLISH_LANG
	 * Search the audio type the device supported 
	 * \else
	 * 2iQ/Ih18V'3V5DSoRtVV@`
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LANGUAGE                =     0x0010 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search DSP capacity description 
	 * \else
	 * 2iQ/DSPD\A&ChJv(6TS&=a99LeSDKDEV_DSP_ENCODECAP)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP                     =     0x0011 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search OEM information
	 * \else
	 * 2iQ/OEMPEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_OEM                     =     0x0012 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search network running status information 
	 * \else
	 * 2iQ/MxBgTKPPW4L,PEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET                     =     0x0013 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search function attributes(for IPC serirs)
	 * \else
	 * 2iQ/Ih18@`PM
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TYPE                    =     0x0014 ;   
	/**
	 * \if ENGLISH_LANG
	 * Search snapshot function attribute(For IPC series)
	 * \else
	 * 2iQ/9&D\JtPT(IPC@`2zF7)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SNAP                    =     0x0015 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the first time and the recent video time
	 * \else
	 * 2iQ/WnTgB<OqJ1<d:MWn=|B<OqJ1<d
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORD_TIME             =     0x0016 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the wireless network signal strength,Please refer to structure SDKDEV_WIRELESS_RSS_INFO
	 * \else
	 * 2iQ/N^O_MxBgPE:EG?6H#,<{=a99Le SDKDEV_WIRELESS_RSS_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET_RSSI                =     0x0017 ;   
	/**
	 * \if ENGLISH_LANG
	 * Burning options inquiry
	 * \else
	 * 2iQ/8=<~?LB<Q!On
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_ATTACH          =     0x0018 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the list of backup device
	 * \else
	 * 2iQ/187]Ih18AP1m
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV              =     0x0019 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query the backup device information
	 * \else
	 * 2iQ/187]Ih18OjO8PEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV_INFO         =     0x001a ;   
	/**
	 * \if ENGLISH_LANG
	 * Backup rate of progress
	 * \else
	 * 187]=x6H74@!
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_FEEDBACK         =     0x001b ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ATM trade type
	 * \else
	 * 2iQ/ATM=;RW@`PM
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ATM_QUERY_TRADE         =     0x001c ;   
	/**
	 * \if ENGLISH_LANG
	 * Query sip state
	 * \else
	 * 2iQ/sipW4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SIP                     =     0x001d ;   
	/**
	 * \if ENGLISH_LANG
	 * Query wifi state of mobile DVR
	 * \else
	 * 2iQ/35TXwifiW4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VICHILE_STATE           =     0x001e ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Email Function
	 * \else
	 * 2iQ/SJ<~EdVCJG7q3I9&
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_EMAIL              =     0x001f ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Hard Disk Information
	 * \else
	 * 2iQ/S2ELsmartPEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SMART_HARD_DISK         =     0x0020 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Snap Picture Function
	 * \else
	 * 2iQ/W%M<IhVCJG7q3I9&
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_SNAPPICTURE        =     0x0021 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query static alarm state
	 * \else
	 * 2iQ/>2L,1(>/W4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_STATIC_ALARM            =     0x0022 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query submodule information
	 * \else
	 * 2iQ/Ih18WSD#?iPEO"
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBMODULE_INFO          =     0x0023 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query harddisk damage ability
	 * \else
	 * 2iQ/S2EL;55@D\A& 
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISKDAMAGE              =     0x0024 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query device supported IPC ability,see struct SDK_DEV_IPC_INFO 
	 * \else
	 * 2iQ/Ih18V'3V5DIPCD\A&, <{=a99Le SDK_DEV_IPC_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_IPC                     =     0x0025 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query alarm arm disarm state
	 * \else
	 * 2iQ/1(>/2<377@W4L,
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_ARM_DISARM        =     0x0026 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ACC power off state(return a DWORD type value, 1 means power off,0 means power on)
	 * \else
	 * 2iQ/ACC6O5g1(>/W4L,(75;XR;8vDWORD, 11mJ>6O5g#,01mJ>M(5g)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ACC_POWEROFF_ALARM      =     0x0027 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP server connect test
	 * \else
	 * 2bJTFTP7~NqFwA,=S
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_FTP_SERVER         =     0x0028 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow exceed state info(see struct SDKDEV_3GFLOW_EXCEED_STATE_INFO)
	 * \else
	 * 2iQ/3GAwA?3,3vcPV5W4L,,(<{=a99LeSDKDEV_3GFLOW_EXCEED_STATE_INFO)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_EXCEED           =     0x0029 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow info(see struct SDK_DEV_3GFLOW_INFO )
	 * \else
	 * 6K2iQ/3GMxBgAwA?PEO",<{=a99Le SDK_DEV_3GFLOW_INFO
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_INFO             =     0x002a ;   
	/**
	 * \if ENGLISH_LANG
	 * Vihicle information uploading, ALARM_VEHICLE_INFO_UPLOAD
	 * \else
	 * 35TXWT6(RePEO"IO4+(<{=a99LeALARM_VEHICLE_INFO_UPLOAD)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIHICLE_INFO_UPLOAD     =     0x002b ;   
	/**
	 * \if ENGLISH_LANG
	 * QSpeed limit alarm, ALARM_SPEED_LIMIT
	 * \else
	 * 2iQ/O^KY1(>/W4L,(<{=a99LeALARM_SPEED_LIMIT)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SPEED_LIMIT             =     0x002c ;   
	/**
	 * \if ENGLISH_LANG
	 * Query DSP expended cap(struct SDKDEV_DSP_ENCODECAP_EX )
	 * \else
	 * 2iQ/DSP@)U9D\A&ChJv(6TS&=a99LeSDKDEV_DSP_ENCODECAP_EX)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP_EX                  =     0x002d ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G module info(struct SDK_DEV_3GMODLE_INFO )
	 * \else
	 * 2iQ/3GD#?iPEO"(6TS&=a99Le SDK_DEV_3GMODULE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GMODULE_INFO           =     0x002e ;   
	/**
	 * \if ENGLISH_LANG
	 * Query multi DDNS status(struct SDK_DEV_MULTI_DDNS_INFO )
	 * \else
	 * 2iQ/6`DDNSW4L,PEO"(6TS&=a99Le SDK_DEV_MULTI_DDNS_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MULTI_DDNS              =     0x002f ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Device URL info(struct SDK_DEV_URL_INFO )
	 * \else
	 * 2iQ/Ih18EdVCURLPEO"(6TS&=a99Le SDK_DEV_URL_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONFIG_URL              =     0x0030 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query Hard key state(struct SDKDEV_HARDKEY_STATE )
	 * \else
	 * 2iQ/HardKeyW4L,#(6TS&=a99Le SDKDEV_HARDKEY_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_HARDKEY                 =     0x0031 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ISCSI path(struct SDKDEV_ISCSI_PATHLIST )
	 * \else
	 * 2iQ/ISCSIB7>6AP1m(6TS&=a99Le SDKDEV_ISCSI_PATHLIST )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ISCSI_PATH              =     0x0032 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query local preview split capability(struct DEVICE_LOCALPREVIEW_SLIPT_CAP )
	 * \else
	 * 2iQ/Ih181>5XT$@@V'3V5D7V8nD#J=(6TS&=a99LeDEVICE_LOCALPREVIEW_SLIPT_CAP)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP     =     0x0033 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query wifi capablity(struct SDKDEV_WIFI_ROUTE_CAP )
	 * \else
	 * 2iQ/N^O_B7SID\A&PEO"(6TS&=a99Le SDKDEV_WIFI_ROUTE_CAP )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WIFI_ROUTE_CAP          =     0x0034 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query device online state(return a DWORD value, 1-online, 0-offline)
	 * \else
	 * 2iQ/Ih185DTZO_W4L,(75;XR;8vDWORD, 11mJ>TZO_, 01mJ>6OO_)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ONLINE                  =     0x0035 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query ptz state(struct SDK_PTZ_LOCATION_INFO )
	 * \else
	 * 2iQ/TFL(W4L,PEO"(6TS&=a99Le SDK_PTZ_LOCATION_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_LOCATION            =     0x0036 ;   
	/**
	 * \if ENGLISH_LANG
	 * PQuery monitor state(state SDKDEV_MONITOR_INFO )
	 * \else
	 * ;-Cf<`?X8(VzPEO"(6TS&=a99Le SDKDEV_MONITOR_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MONITOR_INFO            =     0x0037 ;   
	/**
	 * \if ENGLISH_LANG
	 * PQuery subdevcie(fan,cpu...) state(struct CFG_DEVICESTATUS_INFO )
	 * \else
	 * 2iQ/WSIh18(5gT4, 7gIH5H)W4L,(6TS&=a99Le CFG_DEVICESTATUS_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBDEVICE               =     0x0300 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query RAID state(struct ALARM_RAID_INFO ) 
	 * \else
	 * 2iQ/RAIDW4L,(6TS&=a99Le ALARM_RAID_INFO )  
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RAID_INFO               =     0x0038 ;   
	/**
	 * \if ENGLISH_LANG
	 * Test DDNS domain enable
	 * \else
	 * 2bJTDDNSSrC{JG7q?ISC
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_DDNSDOMAIN         =     0x0039 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query virtual camera state(struct SDKDEV_VIRTUALCAMERA_STATE_INFO )
	 * \else
	 * 2iQ/PiDbIcOqM7W4L,(6TS& SDKDEV_VIRTUALCAMERA_STATE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIRTUALCAMERA           =     0x003a ;   
	/**\
	 * \if ENGLISH_LANG
	 * Get device's state of video/coil module(struct SDKDEV_TRAFFICWORKSTATE_INFO )
	 * \else
	 * ;qH!Ih189$WwJSF5/O_H&D#J=W4L,5H(6TS& SDKDEV_TRAFFICWORKSTATE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TRAFFICWORKSTATE        =     0x003b ;   
	/**
	 * \if ENGLISH_LANG
	 * Get camera move alarm state(struct ALARM_CAMERA_MOVE_INFO )
	 * \else
	 * ;qH!IcOq;zRFN;1(>/JB<~W4L,(6TS& ALARM_CAMERA_MOVE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CAMERA_MOVE       =     0x003c ;   
	/**
	 * \if ENGLISH_LANG
	 * Get external alarm(struct NET_CLIENT_ALARM_STATE ) 
	 * \else
	 * ;qH!Mb2?1(>/W4L,(6TS& NET_CLIENT_ALARM_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM                   =     0x003e ;   
	/**
	 * \if ENGLISH_LANG
	 * Get video loss alarm(struct NET_CLIENT_VIDEOLOST_STATE ) 
	 * \else
	 * ;qH!JSF56*J'1(>/W4L,(6TS&  NET_CLIENT_VIDEOLOST_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOLOST               =     0x003f ;   
	/**
	 * \if ENGLISH_LANG
	 * Get motion alarm(struct NET_CLIENT_MOTIONDETECT_STATE )
	 * \else
	 * ;qH!6/L,<`2b1(>/W4L,(6TS&  NET_CLIENT_MOTIONDETECT_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MOTIONDETECT            =     0x0040 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get detailed motion alarm(struct NET_CLIENT_DETAILEDMOTION_STATE )
	 * \else
	 * ;qH!OjO85D6/L,<`2b1(>/W4L,(6TS&  NET_CLIENT_DETAILEDMOTION_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DETAILEDMOTION          =     0x0041 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get vehicle device state(struct SDKDEV_VEHICLE_INFO )
	 * \else
	 * ;qH!35TXWTIm8wVVS2<~PEO"(6TS&  SDKDEV_VEHICLE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VEHICLE_INFO            =     0x0042 ;   
	/**
	 * \if ENGLISH_LANG
	 * Get blind alarm(struct NET_CLIENT_VIDEOBLIND_STATE )
	 * \else
	 * ;qH!JSF5UZ521(>/W4L,(6TS&  NET_CLIENT_VIDEOBLIND_STATE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOBLIND              =     0x0043 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query 3G state(struct SDKDEV_VEHICLE_3GMODULE )
	 * \else
	 * 2iQ/3GD#?iO`9XPEO"(6TS&=a99Le SDKDEV_VEHICLE_3GMODULE )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GSTATE_INFO            =     0x0044 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query net interface(struct SDKDEV_NETINTERFACE_INFO )
	 * \else
	 * 2iQ/MxBg=S?ZPEO"(6TS&  SDKDEV_NETINTERFACE_INFO )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NETINTERFACE            =     0x0045 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query picinpic channel(struct DWORD)
	 * \else
	 * 2iQ/;-VP;-M(5@:E(6TS&DWORDJ}Wi)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PICINPIC_CHN            =     0x0046 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query splice screen(struct SDK_COMPOSITE_CHANNEL )
	 * \else
	 * 2iQ/HZ:OFAM(5@PEO"(6TS& SDK_COMPOSITE_CHANNEL J}Wi)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMPOSITE_CHN           =     0x0047 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query whole recording status(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * 2iQ/Ih18U{LeB<OqW4L,(6TS&BOOL), V;R*SPR;8vM(5@TZB<Oq#,<4N*Ih18U{LeW4L,N*B<Oq
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_RECORDING         =     0x0048 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query whole encoding(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * 2iQ/Ih18U{Le1`BkW4L,(6TS&BOOL), V;R*SPR;8vM(5@TZ1`Bk#,<4N*Ih18U{LeW4L,N*1`Bk
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_ENCODING          =     0x0049 ;   
	/**
	 * \if ENGLISH_LANG
	 * Query disk record time(pBuf = DEV_DISK_RECORD_TIME *)
	 * \else
	 * 2iQ/Ih18S2ELB<OqJ1<dPEO"(pBuf = DEV_DISK_RECORD_TIME *#,?IRTSP6`8v=a99Le)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK_RECORDE_TIME       =     0x004a ;   
	/**
	 * \if ENGLISH_LANG
	 * Whether have pop-up optical dirve(struct NET_DEVSTATE_BURNERDOOR )
	 * \else
	 * JG7qRQ5/3v?LB<;z9bG}CE(6TS&=a99Le  NET_DEVSTATE_BURNERDOOR )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNER_DOOR             =     0x004b ;   
	/**
	 * \if ENGLISH_LANG
	 * Get data validation process(struct NET_DEVSTATE_DATA_CHECK )
	 * \else
	 * 2iQ/9bELJ}>]P#Qi=x6H(6TS& NET_DEVSTATE_DATA_CHECK )
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_DATA_CHECK          =     0x004c ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/1(>/JdHkM(5@PEO"(6TS&NET_ALARM_IN_CHANNELJ}Wi)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_IN_CHANNEL        =     0x004f ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/1(>/M(5@J}(6TS&NET_ALARM_CHANNEL_COUNT)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CHN_COUNT         =     0x0050 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/TFL(?IJSSrW4L,(6TS&SDK_OUT_PTZ_VIEW_RANGE_STATUS)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_VIEW_RANGE          =     0x0051 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/Ih18M(5@PEO"(6TS&NET_DEV_CHN_COUNT_INFO)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEV_CHN_COUNT           =     0x0052 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/Ih18V'3V5DRTSP URLAP1m#,<{=a99LeDEV_RTSPURL_LIST
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RTSP_URL                =     0x0053 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 2iQ/Ih185GB<5DTZO_3,J1J1<d,75;XR;8vBTYE,#(5%N;#:7VVS#) ,01mJ>2;O^VF,7GAcU}U{J}1mJ>O^VF5D7VVSJ}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LIMIT_LOGIN_TIME        =     0x0054 ;   
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ;qH!4.?ZJ} <{=a99LeNET_GET_COMM_COUNT
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_COMM_COUNT          =     0x0055 ;   
	
	public static final int SDK_DEVSTATE_RECORDING_DETAIL      = 0x0056;           // 2iQ/B<OsW4L,OjO8PEO"(pBuf = NET_RECORD_STATE_DETAIL*)
	public static final int SDK_DEVSTATE_PTZ_PRESET_LIST       = 0x0057;           // ;qH!51G0TFL(5DT$VC5cAP1m(6TS&=a99NET_PTZ_PRESET_LIST)
	public static final int SDK_DEVSTATE_EXTERNAL_DEVICE       = 0x0058;           // Mb=SIh18PEO"(pBuf = NET_EXTERNAL_DEVICE*)
	public static final int SDK_DEVSTATE_GET_UPGRADE_STATE     = 0x0059;           // ;qH!Ih18I}<6W4L,(6TS&=a99DHDEV_UPGRADE_STATE_INFO)
	public static final int SDK_DEVSTATE_MULTIPLAYBACK_SPLIT_CAP = 0x005a;         // ;qH!6`M(5@T$@@7V8nD\A&( 6TS&=a99Le NET_MULTIPLAYBACK_SPLIT_CAP )
	public static final int SDK_DEVSTATE_BURN_SESSION_NUM      = 0x005b;           // ;qH!?LB<;a;0W\J}(pBuf = int*)
	public static final int SDK_DEVSTATE_PROTECTIVE_CAPSULE    = 0x005c;           // 2iQ/7@;$2UW4L,(6TS&=a99LeALARM_PROTECTIVE_CAPSULE_INFO)


	public static final int SDK_DEVSTATE_POWER_STATE           = 0x0152;           // 2iQ/5gT4W4L,(6TS&=a99LeNET_POWER_STATUS)
	public static final int SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE  = 0x153;        // 2iQ/1(>/M(5@W4L,(6TS&=a99Le NET_CLIENT_ALARM_CHANNELS_STATE)
	public static final int SDK_DEVSTATE_ALARMKEYBOARD_COUNT   = 0x0154;           // 2iQ/4.?ZIOA,=S5D1(>/<|ELJ}(6TS&=a99LeNET_ALARMKEYBOARD_COUNT)
	public static final int SDK_DEVSTATE_EXALARMCHANNELS       = 0x0155;           // 2iQ/@)U91(>/D#?iM(5@S3Id9XO5(6TS&=a99Le NET_EXALARMCHANNELS)
	public static final int SDK_DEVSTATE_GET_BYPASS            = 0x0156;           // 2iQ/M(5@ETB7W4L,(6TS&=a99Le NET_DEVSTATE_GET_BYPASS)
	public static final int SDK_DEVSTATE_ACTIVATEDDEFENCEAREA  = 0x0157;           // ;qH!<$;n5D7@GxPEO"(6TS&=a99Le NET_ACTIVATEDDEFENCEAREA)
	public static final int SDK_DEVSTATE_DEV_RECORDSET         = 0x0158;           // 2iQ/Ih18<GB<</PEO"(6TS&NET_CTRL_RECORDSET_PARAM)
	public static final int SDK_DEVSTATE_DOOR_STATE            = 0x0159;           // 2iQ/CE={W4L,(6TS&NET_DOOR_STATUS_INFO)
	public static final int SDK_DEVSTATE_ANALOGALARM_CHANNELS  = 0x1560;           // D#DbA?1(>/JdHkM(5@S3Id9XO5(6TS&NET_ANALOGALARM_CHANNELS)
	public static final int SDK_DEVSTATE_GET_SENSORLIST        = 0x1561;           // ;qH!Ih18V'3V5D4+8PFwAP1m(6TS& NET_SENSOR_LIST)
	public static final int SDK_DEVSTATE_ALARM_CHANNELS	= 0x1562;		// 2iQ/?*9XA?1(>/D#?iM(5@S3Id9XO5(6TS&=a99Le NET_ALARM_CHANNELS)
													// Hg9{Ih182;V'3V2iQ/@)U91(>/D#?iM(5@,?IRTSC8C9&D\2iQ/@)U9M(5@5DB_<-M(5@:E#,2"51Wv1>5X1(>/M(5@J9SC
	public static final int SDK_DEVSTATE_GET_ALARM_SUBSYSTEM_ACTIVATESTATUS	= 0x1563;	// ;qH!51G0WSO5M3FtSCW4L,( 6TS& NET_GET_ALARM_SUBSYSTEM_ACTIVATE_STATUES)
	public static final int SDK_DEVSTATE_ALARMSUBSYSTEM_STATE  = 0x1565;            // ;qH!WSO5M3W4L,(6TS&NET_ALARM_SUBSYSTEM_STATE)
	public static final int SDK_DEVSTATE_ALARM_FAULT_STATE     = 0x1566;            // ;qH!9JUOW4L,(6TS&NET_ALARM_FAULT_STATE)
	public static final int SDK_DEVSTATE_ARM_MODE_GET          = 0x1567;           // ;qH!51G02<7@377@D#J=(6TS&NET_ARM_MODE_INFO)
	public static final int SDK_DEVSTATE_DEFENCE_STATE         = 0x1567;           // ;qH!7@GxW4L,(6TS&NET_DEFENCE_STATE_INFO, :METB7W4L,1d;/JB<~!"1>5X1(>/JB<~!"1(>/PE:ET4JB<~5DW4L,ChJvSPGx1p#,2;D\;lSC#,=v8v1pIh18J9SC)
	public static final int SDK_DEVSTATE_SCADA_POINT_LIST      = 0x1569;           // ;qH!5cN;1mB7>6PEO"(6TS& NET_SCADA_POINT_LIST_INFO)
	public static final int SDK_DEVSTATE_SCADA_INFO            = 0x156a;           // ;qH!<`2b5cN;PEO"(6TS& NET_SCADA_INFO)
	public static final int SDK_DEVSTATE_SCADA_CAPS            = 0x156b;           // ;qH!SCADAD\A&</(6TS& NET_SCADA_CAPS)
	public static final int SDK_DEVSTATE_GET_CODEID_COUNT      = 0x156c;           // ;qH!6TBk3I9&5DW\LuJ}(6TS& NET_GET_CODEID_COUNT)
	public static final int SDK_DEVSTATE_GET_CODEID_LIST       = 0x156d;           // 2iQ/6TBkPEO"(6TS& NET_GET_CODEID_LIST)
	public static final int SDK_DEVSTATE_ANALOGALARM_DATA      = 0x156e;           // 2iQ/D#DbA?M(5@J}>](6TS& NET_GET_ANALOGALARM_DATA)
	public static final int SDK_DEVSTATE_VTP_CALLSTATE         = 0x156f;           // ;qH!JSF55g;0:t=PW4L,(6TS& NET_GET_VTP_CALLSTATE)
	public static final int SDK_DEVSTATE_SCADA_INFO_BY_ID      = 0x1570;           // M(9}Ih18!";qH!<`2b5cN;PEO"(6TS& NET_SCADA_INFO_BY_ID)
	public static final int SDK_DEVSTATE_SCADA_DEVICE_LIST     = 0x1571;           // ;qH!51G0Vw;zKy=SHk5DMb2?Ih18ID(6TS& NET_SCADA_DEVICE_LIST)
	public static final int SDK_DEVSTATE_DEV_RECORDSET_EX      = 0x1572;           // 2iQ/Ih18<GB<</PEO"(4x6~=xVFJ}>])(6TS&NET_CTRL_RECORDSET_PARAM)
	public static final int SDK_DEVSTATE_ACCESS_LOCK_VER       = 0x1573;           // ;qH!CEKxHm<~0f1>:E(6TS& NET_ACCESS_LOCK_VER)
	public static final int SDK_DEVSTATE_MONITORWALL_TVINFO    = 0x1574;           // ;qH!5gJSG=OTJ>PEO"(6TS& NET_CTRL_MONITORWALL_TVINFO)
	public static final int SDK_DEVSTATE_GET_ALL_POS           = 0x1575;           // ;qH!KySPSC;'?ISCPosIh18EdVCPEO"(6TS& NET_POS_ALL_INFO)
	public static final int SDK_DEVSTATE_GET_ROAD_LIST         = 0x1576;           // ;qH!3GJP<0B76N1`BkPEO"#,8gBW1HQGOnD?W(SC(6TS& NET_ROAD_LIST_INFO)
	public static final int SDK_DEVSTATE_GET_WIRESSLESS_STATE  = 0x1579;           // ;qH!N^O_Ih18W4L,PEO"(6TS& NET_GET_WIRELESS_DEVICE_STATE)

	
	
	/**
	 * \if ENGLISH_LANG
	 * Mail address max length
	 * \else
	 * SJ<~7"(JU)5XV7Wn4s3$6H
	 * \endif
	 */
	
	public static final int SDK_MAX_MAIL_ADDR_LEN                =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Mail subject max length
	 * \else
	 * SJ<~VwLbWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_SUBJECT_LEN             =         64 ;   
	
	public static final int SDK_IPIFILTER_NUM                    =         200;
	public static final int SDK_IPIFILTER_NUM_EX                 =         512;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address string length 
	 * \else
	 * IP5XV7WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_LEN                   =         16 ;   
	
	/**
	 * \if ENGLISH_LANG
	 * MACE address string length
	 * \else
	 * MAC5XV7WV7{4.3$6H
	 * \endif
	 */

	public static final int SDK_MAX_IPADDR_LEN_EX                =         40 ; // @)U9IP5XV7WV7{4.3$6H, V'3VIPV6
		
	public static final int SDK_MACADDR_LEN                      =         40 ;  
	/**
	 * \if ENGLISH_LANG
	 * URL string length
	 * \else
	 * URLWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_URL_LEN                      =        128 ;      
	/**
	 * \if ENGLISH_LANG
	 * Device serial number max length 
	 * \else
	 * ;zFw1`:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DEV_ID_LEN                   =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Host name length
	 * \else
	 * Vw;zC{3$6H
	 * \endif
	 */
	public static final int SDK_MAX_HOST_NAMELEN                 =         64 ;       
	/**
	 * \if ENGLISH_LANG
	 * Password length 
	 * \else
	 * C\Bk3$6H
	 * \endif
	 */
	public static final int SDK_MAX_HOST_PSWLEN                  =         32 ;           
	/**
	 * \if ENGLISH_LANG
	 * Universal name string length 
	 * \else
	 * M(SCC{WVWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_NAME_LEN                     =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ethernet max amount 
	 * \else
	 * RTL+Mx?ZWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM                 =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * Extended ethernet max amout
	 * \else
	 * @)U9RTL+Mx?ZWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM_EX              =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Serial number string length
	 * \else
	 * PrAP:EWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_DEV_SERIALNO_LEN                 =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Device type string length 
	 * \else
	 * Ih18@`PMWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_DEV_TYPE_LEN                     =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * The days in one week 
	 * \else
	 * R;V\5DLlJ}
	 * \endif
	 */
	public static final int SDK_N_WEEKS                          =          7 ;          
	/**
	 * \if ENGLISH_LANG
	 * Time period amount
	 * \else
	 * M(SCJ1<d6N8vJ}
	 * \endif
	 */
	public static final int SDK_N_TSECT                          =          6 ;     
	/**
	 * \if ENGLISH_LANG
	 * Record period amount 
	 * \else
	 * B<OqJ1<d6N8vJ}
	 * \endif
	 */
	public static final int SDK_N_REC_TSECT                      =          6 ;     
	/**
	 * \if ENGLISH_LANG
	 * Color period amount 
	 * \else
	 * QUI+J1<d6N8vJ}
	 * \endif
	 */
	public static final int SDK_N_COL_TSECT                      =          2 ;      
	/**
	 * \if ENGLISH_LANG
	 * Channel name lengh. DVR DSP capacity limit. Max 32 bytes.
	 * \else
	 * M(5@C{3$6H#,DVR DSPD\A&O^VF#,Wn6`32WV=Z
	 * \endif
	 */
	public static final int SDK_CHAN_NAME_LEN                    =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Extra stream amount 
	 * \else
	 * @)U9BkAw8vJ}
	 * \endif
	 */
	public static final int SDK_N_ENCODE_AUX                     =          3 ;        
	/**
	 * \if ENGLISH_LANG
	 * Max audio talk channel amount 
	 * \else
	 * Wn6`6T=2M(5@8vJ}
	 * \endif
	 */
	public static final int SDK_N_TALK                           =          1 ;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount 
	 * \else
	 * UZ52GxSr8vJ}
	 * \endif
	 */
	public static final int SDK_N_COVERS                         =          1 ;        
	/**
	 * \if ENGLISH_LANG
	 * Max channel amount 
	 * \else
	 * Wn4sM(5@8vJ}
	 * \endif
	 */
	public static final int SDK_N_CHANNEL                        =         16 ;        
	/**
	 * \if ENGLISH_LANG
	 * Alarm prompt period amount 
	 * \else
	 * 1(>/LaJ>J1<d6N8vJ}
	 * \endif
	 */
	public static final int SDK_N_ALARM_TSECT                    =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm output ports max amount 
	 * \else
	 * 1(>/Jd3v?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Audio input ports max amount 
	 * \else
	 * RtF5JdHk?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Video input ports max amount 
	 * \else
	 * JSF5JdHk?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm input ports max amount 
	 * \else
	 * 1(>/JdHk?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM                 =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * HDD max amount. Now the value is 16.
	 * \else
	 * S2EL8vJ}IOO^#,T]6(N*16
	 * \endif
	 */
	public static final int SDK_MAX_DISK_NUM                     =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Decoder(485) max amount 
	 * \else
	 * =bBkFw(485)8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_NUM                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * 232 COM function max amount 
	 * \else
	 * 2324.?Z9&D\8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_232FUNCS                     =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * 232 COM port max amount 
	 * \else
	 * 2324.?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM                      =          2 ;    
	/**
	 * \if ENGLISH_LANG
	 * Extended 232 COM port max amount 
	 * \else
	 * @)U94.?ZEdVC8vJ}IOO^  
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM_EX                   =         16 ;           
	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list max amount
	 * \else
	 * =bBkFwP-RiAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_DECPRO_LIST_SIZE             =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP file folder max length 
	 * \else
	 * FTPND<~D?B<Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_FTP_MAXDIRLEN                    =        240 ;   
	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount
	 * \else
	 * >XUsJd3v?ZWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MATRIX_MAXOUT                    =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount 
	 * \else
	 * >XUsJd3vWiWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_TOUR_GROUP_NUM                   =          6 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns max amount the device supported 
	 * \else
	 * Ih18V'3V5Dddns7~NqFwWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_NUM                     =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns type and max string length 
	 * \else
	 * ddns7~NqFw@`PM#,Wn4sWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_SERVER_TYPE_LEN              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns domain name and max string length 
	 * \else
	 * ddnsSrC{#,Wn4sWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DOMAIN_NAME_LEN              =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns alias and max string length
	 * \else
	 * ddns7~NqFw1pC{#,Wn4sWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_ALIAS_LEN               =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Ddns default domain, max sring length
	 * \else
	 * dnsD,HOSrC{#,Wn4sWV7{4.3$6H 
	 * \endif
	 */
	public static final int SDK_MAX_DEFAULT_DOMAIN_LEN           =         60 ;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone row amount
	 * \else
	 * 6/L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public static final int SDK_MOTION_ROW                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone column amount 
	 * \else
	 * 6/L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public static final int SDK_MOTION_COL                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Static detection zone row amount 
	 * \else
	 * >2L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public static final int SDK_STATIC_ROW                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Static detection zone column amount
	 * \else
	 * >2L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public static final int SDK_STATIC_COL                       =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:user name max lengh 
	 * \else
	 * FTPEdVC#,SC;'C{Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_FTP_USERNAME_LEN                 =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:password max length 
	 * \else
	 * FTPEdVC#,C\BkWn4s3$6H
	 * \endif
	 */
	public static final int SDK_FTP_PASSWORD_LEN                 =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:time periods in each day.
	 * \else
	 * FTPEdVC#,C?LlJ1<d6N8vJ}
	 * \endif
	 */
	public static final int SDK_TIME_SECTION                     =          2 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:file path max length
	 * \else
	 * FTPEdVC#,ND<~B7>6C{Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_FTP_MAX_PATH                     =        240 ;   
	/**
	 * \if ENGLISH_LANG
	 * FTP setup:sub path max lenth
	 * \else
	 * FTPEdVC#,ND<~B7>6C{Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_FTP_MAX_SUB_PATH                 =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:U China Net Communication (CNC)channel ID
	 * \else
	 * F=L(=SHkEdVC#,UMxM(M(5@ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_CHANID           =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC device ID
	 * \else
	 * F=L(=SHkEdVC#,UMxM(Ih18ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_DEVID            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC registration password
	 * \else
	 * F=L(=SHkEdVC#,UMxM(W"2aC\Bk
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_REGPSW           =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:UCNC user name 
	 * \else
	 * F=L(=SHkEdVC#,UMxM(SC;'C{
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERNAME         =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup: UCNC password 
	 * \else
	 * F=L(=SHkEdVC#,UMxM(C\Bk
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERPSW          =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:ZTE Netview IP
	 * \else
	 * F=L(=SHkEdVC#,VPPKA&N,IP
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_IP                =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Serial Platform embedded setup:ZTE Netview  serial
	 * \else
	 * F=L(=SHkEdVC#,VPPKA&N,serial
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_SERIAL            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * User Platform embedded setup:ZTE Netview user
	 * \else
	 * F=L(=SHkEdVC#,VPPKA&N,user
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_USER              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Password Platform embedded setup:ZTE Netview password
	 * \else
	 * F=L(=SHkEdVC#,VPPKA&N,password
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_PWD               =         50 ;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zones max amount
	 * \else
	 * UZ52GxSrWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_COVER_NUM              =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Watermark data max length 
	 * \else
	 * K.S!M<F,J}>]Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_DATA               =       4096 ;   
	/**
	 * \if ENGLISH_LANG
	 * Watermark text max length
	 * \else
	 * K.S!NDWVWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_LETTER             =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount 
	 * \else
	 * Wn6`KQKw3v5DN^O_Ih188vJ}
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM               =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount
	 * \else
	 * Wn6`KQKw3v5DN^O_Ih188vJ}
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM_EX            =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Address length
	 * \else
	 * 5XV73$6H
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_NAME                   =         64 ;           
	/**
	 * \if ENGLISH_LANG
	 * Auto registration server amount
	 * \else
	 * Vw6/W"2a7~NqFw8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_REGISTER_SERVER_NUM          =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME ID options
	 * \else
	 * 68vFRAME ID Q!On
	 * \endif
	 */
	public static final int SDK_SNIFFER_FRAMEID_NUM              =          6 ;   
	/**
	 * \if ENGLISH_LANG
	 * 4 sniffer in each FRAME
	 * \else
	 * C?8vFRAME6TS&5D48vW%0|DZH]
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM              =          4 ;   
	/**
	 * \if ENGLISH_LANG
	 * 8 sniffer in each FRAME
	 * \else
	 * C?8vFRAME6TS&5D88vW%0|DZH]
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM_EX           =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Protocol length
	 * \else
	 * P-RiC{WV3$6H
	 * \endif
	 */
	public static final int SDK_SNIFFER_PROTOCOL_SIZE            =         20 ;       
	/**
	 * \if ENGLISH_LANG
	 * 4 group sniffer setup 
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public static final int SDK_MAX_PROTOCOL_NAME_LENGTH         =         20 ;           
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 4WiW%0|IhVC
	 * \endif
	 */
	public static final int SDK_SNIFFER_GROUP_NUM                =          4 ;        
	/**
	 * \if ENGLISH_LANG
	 * Remote folder length
	 * \else
	 * T63LD?B<5D3$6H
	 * \endif
	 */
	public static final int MAX_PATH_STOR                       =        240 ;     
	/**
	 * \if ENGLISH_LANG
	 * New alarm upload time length
	 * \else
	 * PB5D1(>/IO4+J1<d5D3$6H
	 * \endif
	 */
	public static final int SDK_ALARM_OCCUR_TIME_LEN             =         40 ;   
	/**
	 * \if ENGLISH_LANG
	 * Overlay name length. Now it supports 32-digit English and 16-digit Chinese
	 * \else
	 * 5~<S5DC{3F3$6H#,D?G0V'3V328vS"ND#,168vVPND
	 * \endif
	 */
	public static final int SDK_VIDEO_OSD_NAME_NUM               =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The self-defined amount supported excluding time and channel
	 * \else
	 * V'3V5DWT6(Re5~<S5DJ}D?#,2;0|:,J1<d:MM(5@
	 * \endif
	 */
	public static final int SDK_VIDEO_CUSTOM_OSD_NUM             =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Targeted initiatives to support the number of registration servers
	 * \else
	 * V'3V6(OrVw6/W"2a7~NqFw5D8vJ}
	 * \endif
	 */
	public static final int SDK_CONTROL_AUTO_REGISTER_NUM        =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support the number of messages the recipient
	 * \else
	 * V'3V6LPE=SJUU_5D8vJ}
	 * \endif
	 */
	public static final int SDK_MMS_RECEIVER_NUM                 =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support the number of SMS sender
	 * \else
	 * V'3V6LPE7"KMU_5D8vJ}
	 * \endif
	 */
	public static final int SDK_MMS_SMSACTIVATION_NUM            =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Support for dial-up number of the sender
	 * \else
	 * V'3V2&:E7"KMU_5D8vJ}
	 * \endif
	 */
	public static final int SDK_MMS_DIALINACTIVATION_NUM         =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount max limit
	 * \else
	 * 1(>/Jd3v?Z8vJ}IOO^@)U9
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Video input amount max limit
	 * \else
	 * JSF5JdHk?Z8vJ}IOO^@)U9
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount max limit
	 * \else
	 * 1(>/JdHk?Z8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM_EX              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * IP or domain name length
	 * \else
	 * IP5XV7WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_OR_DOMAIN_LEN         =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of object id that detected by device in intelligent analysis
	 * \else
	 * VGD\7VNvIh18<l2b5=5DNoLeID8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_OBJECT_LIST                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of device rule in intelligent analysis 
	 * \else
	 * VGD\7VNvIh189fTr8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_RULE_LIST                    =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * The max number of polygon's culmination
	 * \else
	 * 6`1_PNWn4s6%5c8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_POLYGON_NUM                  =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Rule detect line's max point number
	 * \else
	 * 9fTr<l2bO_Wn4s6%5cJ}
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_LINE_NUM              =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Rule detect region's max point number
	 * \else
	 * 9fTr<l2bGxSrWn4s6%5cJ}
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_REGION_NUM            =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Object moving track's max point number
	 * \else
	 * NoLeTK6/9l<#Wn4s6%5cJ}
	 * \endif
	 */
	public static final int SDK_MAX_TRACK_LINE_NUM               =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max candidate number
	 * \else
	 * HKA3J61pWn4sF%EdJ}
	 * \endif
	 */
	public static final int SDK_MAX_CANDIDATE_NUM                =         50 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max image of ervery person
	 * \else
	 * C?8vHKT16TS&5DWn4sHKA3M<F,J}
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_IMAGE_NUM             =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max fance line number
	 * \else
	 * N'@8Wn4sGzO_J}
	 * \endif
	 */
	public static final int SDK_MAX_FENCE_LINE_NUM               =          2 ;     
	/**
	 * \if ENGLISH_LANG
	 * The max number of smart disk information
	 * \else
	 * Wn6`5DsmartPEO"8vJ}
	 * \endif
	 */
	public static final int MAX_SMART_VALUE_NUM                 =         30 ;   
	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * ;zFwC{3F3$6H
	 * \endif
	 */
	public static final int SDK_MACHINE_NAME_NUM                 =         64 ;       
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device serial num length
	 * \else
	 * F=L(=SHkEdVC#,Ll5XQt9b Ih18PrAP:EWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICESERIAL      =         48 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device Name length
	 * \else
	 * F=L(=SHkEdVC#,Ll5XQt9b Ih18C{3FWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICENAME        =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,User Name Length
	 * \else
	 * F=L(=SHkEdVC#,Ll5XQt9b W"2aSC;'C{WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_USER              =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,password length
	 * \else
	 * F=L(=SHkEdVC#,Ll5XQt9b W"2aC\BkWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_PWD               =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of submodule infomation
	 * \else
	 * Wn6`WSD#?iPEO"8vJ}
	 * \endif
	 */
	public static final int MAX_SUBMODULE_NUM                   =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot,the max car way number
	 * \else
	 * =;M(W%ED#,Wn4s355@J}
	 * \endif
	 */
	public static final int SDK_MAX_CARWAY_NUM                   =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * One car way max time for snapshot
	 * \else
	 * R;8v355@5DWn4sW%EDUEJ}
	 * \endif
	 */
	public static final int SDK_MAX_SNAP_SIGNAL_NUM              =          3 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of card
	 * \else
	 * ?(:E5DWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_CARD_NUM                     =        128 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max lenth of card infomation
	 * \else
	 * C?Lu?(:EWn3$WV7{J}
	 * \endif
	 */
	public static final int SDK_MAX_CARDINFO_LEN                 =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max supported controller number
	 * \else
	 * Wn4sV'3V?XVFFwJ}D?
	 * \endif
	 */
	public static final int SDK_MAX_CONTROLER_NUM                =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max control light group number
	 * \else
	 * Wn6`?XVF5FWiJ}
	 * \endif
	 */
	public static final int SDK_MAX_LIGHT_NUM                    =         32 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max Snmp read or write buffer
	 * \else
	 * snmp 6AP4J}>]3$6H
	 * \endif
	 */
	public static final int SDK_MAX_SNMP_COMMON_LEN              =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max DDNS state buffer
	 * \else
	 * DDNS W4L,PEO"3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_STATE_LEN               =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max phone len
	 * \else
	 * 5g;0:EBk3$6H
	 * \endif
	 */
	public static final int SDK_MAX_PHONE_NO_LEN                 =         16 ;       
	/**
	 * \if ENGLISH_LANG
	 * Max type len
	 * \else
	 * 5<:=@`PM;r6LPEO"@`PM3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MSGTYPE_LEN                  =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max message len
	 * \else
	 * 5<:=:M6LPEO"3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MSG_LEN                      =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max drivingdirection len
	 * \else
	 * PPJ;7=OrWV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DRIVINGDIRECTION             =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max snapshot count
	 * \else
	 * 6`UEM<F,W%ED8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_GRAB_INTERVAL_NUM            =          4 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max flash count
	 * \else
	 * Wn6`V'3VIA9b5F8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_FLASH_NUM                    =          5 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of road in every channel
	 * \else
	 * JSF57VNvIh18C?8vM(5@6TS&355@J}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_LANE_NUM                     =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max ISCSI remote path number
	 * \else
	 * ISCSIT63LD?B<Wn4sJ}A?
	 * \endif
	 */
	public static final int SDK_MAX_ISCSI_PATH_NUM               =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max wireless channel number
	 * \else
	 * N^O_B7SIWn4sPE5@J}
	 * \endif
	 */
	public static final int SDK_MAX_WIRELESS_CHN_NUM             =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 base value
	 * \else
	 * H}4zP-Ri0f1>;yJ}
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_BASE                   =        100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Prococol 3 support
	 * \else
	 * V;V'3V34zP-Ri
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_SUPPORT                =         11 ;      
	/**
	 * \if ENGLISH_LANG
	 * Max channel mask
	 * \else
	 * M(5@QZBkWn4sV5
	 * \endif
	 */
	public static final int SDK_MAX_CHANMASK                     =         64 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration staff number
	 * \else
	 * E(KuJSF5EdVCPEO"VP1j3_J}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_STAFF_NUM                    =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration calibrate region
	 * \else
	 * E(KuJSF5EdVCPEO"VP1j6(GxSrJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_CALIBRATEBOX_NUM             =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration exclude region
	 * \else
	 * E(KuJSF5EdVCPEO"VPEE3}GxSrJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_EXCLUDEREGION_NUM            =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Number of compressed video configuration poly line
	 * \else
	 * E(KuJSF5EdVCPEO"VP1j3_O_J}
	 * \endif
	 */
	public static final int SDK_MAX_POLYLINE_NUM                 =         20 ;   
	/**
	 * \if ENGLISH_LANG
	 * Color maximum number
	 * \else
	 * Wn4sQUI+J}D?
	 * \endif
	 */
	public static final int SDK_MAX_COLOR_NUM                    =         16 ;       
	/**
	 * \if ENGLISH_LANG
	 * Max number of  filter type 
	 * \else
	 * Wn4s9}BKVV@`8vJ}
	 * \endif
	 */
	public static final int MAX_OBJFILTER_NUM                   =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * String state length of compressed video 
	 * \else
	 * JSF5E(KuW4L,WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_STATE_NAME          =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * The file number limit
	 * \else
	 * JSF5E(KuO`9XT-J<ND<~04UUB7>62iURJ1ND<~8vJ}IOO^
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_QUERY_FILE_COUNT    =         10 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of SSID
	 * \else
	 * SSID3$6H
	 * \endif
	 */
	public static final int SDK_MAX_SSID_LEN                     =         36 ;           
	/**
	 * \if ENGLISH_LANG
	 * Length of PIN
	 * \else
	 * PINBk3$6H
	 * \endif
	 */
	public static final int SDK_MAX_APPIN_LEN                    =         16 ;          
	/**
	 * \if ENGLISH_LANG
	 * Length of net port
	 * \else
	 * Mx?ZC{3F3$6H
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_NAME_LEN            =        260 ;       
	/**
	 * \if ENGLISH_LANG
	 * Length of net type
	 * \else
	 * MxBg@`PM3$6H
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_TYPE_LEN            =        260 ;       
	/**
	 * \if ENGLISH_LANG
	 * Length of connect status
	 * \else
	 * A,=SW4L,WV7{4.3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CONNECT_STATUS_LEN           =        260 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of 3G mode support
	 * \else
	 * 3GV'3V5DMxBgD#J=3$6H
	 * \endif
	 */
	public static final int SDK_MAX_MODE_LEN                     =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Number of 3G mode support
	 * \else
	 * 3GV'3V5DMxBgD#J=8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_MODE_NUM                     =         64 ;   
	
	public static final int SDK_MAX_COMPRESSION_TYPES_NUM        =         16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of video resolution 
	 * \else
	 * JSF57V1fBJ8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_CAPTURE_SIZE_NUM             =         64 ;     
	/**
	 * \if ENGLISH_LANG
	 * Length of node name
	 * \else
	 * WiV/=a99=Z5cC{3F3$6H
	 * \endif
	 */
	public static final int SDK_NODE_NAME_LEN                    =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max number of point support
	 * \else
	 * V'3VWn4s1j6(5cJ}
	 * \endif
	 */
	public static final int MAX_CALIBPOINTS_NUM                 =        256 ;   
	/**
	 * \if ENGLISH_LANG
	 * The maximum number display element attributes
	 * \else
	 * OTJ>5%T*JtPTWn4sJ}A?
	 * \endif
	 */
	public static final int SDK_MAX_ATTR_NUM                     =         32 ;   
	/**
	 * \if ENGLISH_LANG
	 * Length of cloud connect state
	 * \else
	 * TFW"2aA,=SW4L,PEO"3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CLOUDCONNECT_STATE_LEN       =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * IP entended maximum length
	 * \else
	 * @)U9IP5XV7Wn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_EX_LEN                =        128 ;   
	/**
	 * \if ENGLISH_LANG
	 * Plate character length
	 * \else
	 * 35EFWV7{4.3$6H  
	 * \endif
	 */
	public static final int SDK_MAX_PLATE_NUMBER_LEN             =         32 ;    
	/**
	 * \if ENGLISH_LANG
	 * Right list max number
	 * \else
	 * H(O^AP1mWn4s8vJ}   
	 * \endif
	 */
	public static final int SDK_MAX_AUTHORITY_LIST_NUM           =         16 ;   
	/**
	 * \if ENGLISH_LANG
	 * City name max length
	 * \else
	 * 3GJPC{3FWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CITY_NAME_LEN                =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Province name max length
	 * \else
	 * J!7]C{3FWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_PROVINCE_NAME_LEN            =         64 ;  
	/**
	 * \if ENGLISH_LANG
	 * Staff ID max length
	 * \else
	 * HKT1idWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_ID_LEN                =         32 ;     
	/**
	 * \if ENGLISH_LANG
	 * Max face area number
	 * \else
	 * Wn4sHKA3GxSr8vJ} 
	 * \endif
	 */
	public static final int MAX_FACE_AREA_NUM                   =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max face database number
	 * \else
	 * Wn4sHKA3J}>]?b8vJ}
	 * \endif
	 */
	public static final int MAX_FACE_DB_NUM                     =          8 ;   
	/**
	 * \if ENGLISH_LANG
	 * Max event name
	 * \else
	 * Wn3$JB<~C{
	 * \endif
	 */
	public static final int MAX_EVENT_NAME                      =        128 ;         
	/**
	 * \if ENGLISH_LANG
	 * Max net card name
	 * \else
	 * Wn4sMx?(C{
	 * \endif
	 */
	public static final int SDK_MAX_ETH_NAME                     =         64 ;         
	/**
	 * \if ENGLISH_LANG
	 * Staff name max length
	 * \else
	 * HKT1C{WVWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_NAME_LEN              =         64 ;   
	/**
	 * \if ENGLISH_LANG
	 * Time table element number 
	 * \else
	 * J1<d1mT*KX8vJ}
	 * \endif
	 */
	public static final int SDK_N_SCHEDULE_TSECT                 =          8 ;      
	/**
	 * \if ENGLISH_LANG
	 * URL max number
	 * \else
	 * URLWn4s8vJ}
	 * \endif
	 */
	public static final int SDK_MAX_URL_NUM                      =          8 ;       
	
	/**
	 * \if ENGLISH_LANG
	 * Max battery quantity
	 * \else
	 * Wn4s5g3XJ}A?
	 * \endif
	 */
	public static final int SDK_BATTERY_NUM_MAX                  =          16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max power quantity
	 * \else
	 * Wn4s5gT4J}A?
	 * \endif
	 */
	public static final int SDK_POWER_NUM_MAX                    =          16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio file path length
	 * \else
	 * Wn4sRtF5ND<~B73$6H
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_PATH                   =          260;
	
	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * Wn4sCE={C{3F3$6H
	 * \endif
	 */
	public static final int SDK_MAX_DOORNAME_LEN                 =          128;
	
	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * Wn4sCE={C\Bk3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CARDPWD_LEN                  =          64;
	
	/**
	 * \if ENGLISH_LANG
	 * The max length of wireless device SN
	 * \else
	 * N^O_Ih18PrAP:EWn4s3$6H
	 * \endif
	 */
	public static final int NET_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;
	
	public static final int  NET_MAX_FISHEYE_MOUNTMODE_NUM      = 4;                // Wn4sScQ[02W0D#J=8vJ}
	public static final int  NET_MAX_FISHEYE_CALIBRATEMODE_NUM  = 16;               // Wn4sScQ[=CU}D#J=8vJ}
	public static final int  NET_MAX_FISHEYE_EPTZCMD_NUM        = 64;               // Wn4sScQ[5gWSTFL(2YWw8vJ}   
	public static final int  POINT_NUM_IN_PAIR                  = 2;                // 1j6(5c6TVP5D5cJ}A?
	public static final int  MAX_POINT_PAIR_NUM                 = 128;              // 1j6(5cWn4sJ}A?
	public static final int  CHANNEL_NUM_IN_POINT_GROUP         = 2;                // 1j6(5cVP5DJSF5M(5@J}
	public static final int  MAX_POINT_GROUP_NUM                = 32;               // 1j6(5cWiWn4sJ}A?, C?A=8vM(5@=xPPF4=SPhR*R;Wi1j6(5c
	public static final int  MAX_LANE_INFO_NUM                  = 32;               // Wn4s355@PEO"J}
	public static final int  MAX_LANE_DIRECTION_NUM             = 8;                // 355@7=OrW\J}
	public static final int  SDK_MAX_MONITORWALL_NUM             = 32;               // 5gJSG=Wn4sJ}A?
	public static final int  SDK_MAX_OPTIONAL_URL_NUM            = 8;                // 18SCurlWn4sJ}A?
	public static final int  SDK_MAX_CAMERA_CHANNEL_NUM         = 1024;             // Wn4sIcOq;zM(5@J}
	public static final int  MAX_FILE_SUMMARY_NUM               = 32;               // Wn4sND<~U*R*J}
	public static final int  MAX_AUDIO_ENCODE_NUM               = 64;               // Wn4sV'3VRtF51`Bk8vJ}
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * Wn4sSPH(O^CE={J}D?
	 * \endif
	 */
	public static final int SDK_MAX_DOOR_NUM                     =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * Wn4sSPP'J1<d6NJ}D?
	 * \endif
	 */
	public static final int SDK_MAX_TIMESECTION_NUM              =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * CE={?(:EWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_CARDNO_LEN                   =          32;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * CE={?(SC;'IDWn4s3$6H
	 * \endif
	 */
	public static final int SDK_MAX_USERID_LEN                   =          32;

	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * SC;'C{3$6H
	 * \endif
	 */
	public static final int     SDK_USER_NAME_LENGTH_EX = 16;			  
	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * C\Bk
	 * \endif
	 */
	public static final int     SDK_USER_PSW_LENGTH_EX = 16;			
	
	/**
	 * \if ENGLISH_LANG
	 * Max bell number
	 * \else
	 *  Wn4s>/:E8vJ}
	 * \endif
	 */
	public static final int     SDK_MAX_BELL_NUM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Max keyboard num
	 * \else
	 * Wn4s<|ELJ}
	 * \endif
	 */
	public static final int     SDK_MAX_KEYBOARD_NUM  =  256;       

	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * SC;'H(O^8vJ}IOO^
	 * \endif
	 */
	public static final int     SDK_NEW_MAX_RIGHT_NUM     = 1024;

	
	public static final int 	SDK_MAX_ALARM_SUBSYSTEM_NUM = 8;
	/**
	 * \if ENGLISH_LANG
	 * Device property setup 
	 * \else
	 * Ih18JtPTEdVC
	 * \endif
	 */
	public static final int SDK_DEV_DEVICECFG			 = 0x0001	;   
	/**
	 * \if ENGLISH_LANG
	 * Network setup
	 * \else
	 * MxBgEdVC
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG				 = 0x0002	;   
	/**
	 * \if ENGLISH_LANG
	 * Video channel setup
	 * \else
	 * M<OsM(5@EdVC
	 * \endif
	 */
	public static final int SDK_DEV_CHANNELCFG			 = 0x0003	;   
	/**
	 * \if ENGLISH_LANG
	 * Preview parameter setup
	 * \else
	 * T$@@2NJ}EdVC
	 * \endif
	 */
	public static final int SDK_DEV_PREVIEWCFG 			 = 0x0004	;   
	/**
	 * \if ENGLISH_LANG
	 * Record setup
	 * \else
	 * B<OqEdVC
	 * \endif
	 */
	public static final int SDK_DEV_RECORDCFG			 = 0x0005	;   
	/**
	 * \if ENGLISH_LANG
	 * COM property setup
	 * \else
	 * 4.?ZJtPTEdVC
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG				 = 0x0006	;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm property setup
	 * \else
	 * 1(>/JtPTEdVC
	 * \endif
	 */
	public static final int SDK_DEV_ALARMCFG 			 = 0x0007	;   
	/**
	 * \if ENGLISH_LANG
	 * DVR time setup
	 * \else
	 * DVRJ1<dEdVC
	 * \endif
	 */
	public static final int SDK_DEV_TIMECFG 				 = 0x0008	;   
	/**
	 * \if ENGLISH_LANG
	 * Audio talk parameter setup
	 * \else
	 * 6T=22NJ}EdVC
	 * \endif
	 */
	public static final int SDK_DEV_TALKCFG				 = 0x0009	;   
	/**
	 * \if ENGLISH_LANG
	 * Auto matrix setup
	 * \else
	 * WT6/N,;$EdVC
	 * \endif
	 */
	public static final int SDK_DEV_AUTOMTCFG			 = 0x000A	;   		
	/**
	 * \if ENGLISH_LANG
	 * Local matrix control strategy setup
	 * \else
	 * 1>;z>XUs?XVF2_BTEdVC	
	 * \endif
	 */
	public static final int SDK_DEV_VEDIO_MARTIX			 = 0x000B	;   
	/**
	 * \if ENGLISH_LANG
	 * Multiple ddns setup 
	 * \else
	 * 6`ddns7~NqFwEdVC
	 * \endif
	 */
	public static final int SDK_DEV_MULTI_DDNS			 = 0x000C	;   
	/**
	 * \if ENGLISH_LANG
	 * Snapshot corresponding setup 
	 * \else
	 * W%M<O`9XEdVC
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG				 = 0x000D	;   
	/**
	 * \if ENGLISH_LANG
	 * HTTP path setup 
	 * \else
	 * HTTPB7>6EdVC
	 * \endif
	 */
	public static final int SDK_DEV_WEB_URL_CFG			 = 0x000E	;   
	/**
	 * \if ENGLISH_LANG
	 * FTP upload setup
	 * \else
	 * FTPIO4+EdVC
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG		 = 0x000F	;   
	/**
	 * \if ENGLISH_LANG
	 * Plaform embedded setup. Now the channel parameter represents the platform type.\n
	 * channel=4:Bell alcatel;channel=10:ZTE Netview;channel=11:U CNC  channel = 51 AMP
	 * \else
	 * F=L(=SHkEdVC#,4KJ1channel2NJ}4z1mF=L(@`PM#,
	 * channel=4#: 4z1m146{0"6{?(LX#;channel=10#:4z1mVPPKA&N,#;channel=11#:4z1mUMxM(#;channel=51#:4z1mLl5XQt9b\n
	 * \endif
	 */
	public static final int SDK_DEV_INTERVIDEO_CFG		 = 0x0010	;   
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask setup
	 * \else
	 * GxSrUZ52EdVC
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_COVER			 = 0x0011	;   
	/**
	 * \if ENGLISH_LANG
	 * Transmission strategy. Video quality \ Fluency
	 * \else
	 * 4+Jd2_BTEdVC#,;-VJSEOH \ Aw3)PTSEOH
	 * \endif
	 */
	public static final int SDK_DEV_TRANS_STRATEGY		 = 0x0012	;   
	/**
	 * \if ENGLISH_LANG
	 * Record download strategy setup:high-speed \ general download
	 * \else
	 * B<OsOBTX2_BTEdVC#,8_KYOBTX \ FUM(OBTX
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_STRATEGY	 = 0x0013	;   
	/**
	 * \if ENGLISH_LANG
	 * Video watermark setup
	 * \else
	 * M<OsK.S!EdVC
	 * \endif
	 */
	public static final int SDK_DEV_WATERMAKE_CFG		 = 0x0014	;   
	/**
	 * \if ENGLISH_LANG
	 * Wireless network setup
	 * \else
	 * N^O_MxBgEdVC
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_CFG				 = 0x0015	;   
	/**
	 * \if ENGLISH_LANG
	 * Search wireless device setup 
	 * \else
	 * KQKwN^O_Ih18EdVC
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG		 = 0x0016	;   
	/**
	 * \if ENGLISH_LANG
	 * Auto register parameter setup 
	 * \else
	 * Vw6/W"2a2NJ}EdVC
	 * \endif
	 */
	public static final int SDK_DEV_REGISTER_CFG			 = 0x0017	;   
	/**
	 * \if ENGLISH_LANG
	 * Camera property setup
	 * \else
	 * IcOqM7JtPTEdVC
	 * \endif
	 */
	public static final int SDK_DEV_CAMERA_CFG			 = 0x0018	;   
	/**
	 * \if ENGLISH_LANG
	 * IR alarm setup 
	 * \else
	 * :lMb1(>/EdVC
	 * \endif
	 */
	public static final int SDK_DEV_INFRARED_CFG 		 = 0x0019	;   
	/**
	 * \if ENGLISH_LANG
	 * Sniffer setup 
	 * \else
	 * SnifferW%0|EdVC
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG			 = 0x001A	;   
	/**
	 * \if ENGLISH_LANG
	 * Mail setup 
	 * \else
	 * SJ<~EdVC
	 * \endif
	 */
	public static final int SDK_DEV_MAIL_CFG				 = 0x001B	;   
	/**
	 * \if ENGLISH_LANG
	 * DNS setup 
	 * \else
	 * DNS7~NqFwEdVC
	 * \endif
	 */
	public static final int SDK_DEV_DNS_CFG				 = 0x001C	;   
	/**
	 * \if ENGLISH_LANG
	 * NTP setup
	 * \else
	 * NTPEdVC
	 * \endif
	 */
	public static final int SDK_DEV_NTP_CFG				 = 0x001D	;   
	/**
	 * \if ENGLISH_LANG
	 * Audio detection setup 
	 * \else
	 * RtF5<l2bEdVC
	 * \endif
	 */
	public static final int SDK_DEV_AUDIO_DETECT_CFG		 = 0x001E	;   
	/**
	 * \if ENGLISH_LANG
	 * Storage position setup
	 * \else
	 * 4f4"N;VCEdVC
	 * \endif
	 */
	public static final int SDK_DEV_STORAGE_STATION_CFG   = 0x001F      ; 
	/**
	 * \if ENGLISH_LANG
	 * PTZ operation property(It is invalid now. Please use CLIENT_GetPtzOptAttr to get PTZ operation property.)
	 * \else
	 * TFL(2YWwJtPT(RQ>-7O3}#,GkJ9SC GetPtzOptAttr ;qH!TFL(2YWwJtPT)
	 * \endif
	 */
	public static final int SDK_DEV_PTZ_OPT_CFG			 = 0x0020	;   
	/**
	 * \if ENGLISH_LANG
	 * Daylight Saving Time (DST)setup
	 * \else
	 * ODAnJ1EdVC
	 * \endif
	 */
	public static final int SDK_DEV_DST_CFG				 = 0x0021      ; 
	/**
	 * \if ENGLISH_LANG
	 * Alarm centre setup
	 * \else
	 * 1(>/VPPDEdVC
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_CENTER_CFG		 = 0x0022	;   
	/**
	 * \if ENGLISH_LANG
	 * VIdeo OSD setup
	 * \else
	 * JSF5OSD5~<SEdVC
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_OSD_CFG         = 0x0023	;   
	/**
	 * \if ENGLISH_LANG
	 * CDMA \ GPRS configuration
	 * \else
	 * CDMA \ GPRSMxBgEdVC
	 * \endif
	 */
	public static final int SDK_DEV_CDMAGPRS_CFG          = 0x0024	;   
	/**
	 * \if ENGLISH_LANG
	 * IP Filter configuration
	 * \else
	 * IP9}BKEdVC
	 * \endif
	 */
	
	public static final int SDK_DEV_IPFILTER_CFG          = 0x0025	;   
	/**
	 * \if ENGLISH_LANG
	 * Talk encode configuration
	 * \else
	 * SoRt6T=21`BkEdVC
	 * \endif
	 */
	public static final int SDK_DEV_TALK_ENCODE_CFG       = 0x0026      ; 
	/**
	 * \if ENGLISH_LANG
	 * The length of the video package configuration
	 * \else
	 * B<Oq4r0|3$6HEdVC
	 * \endif
	 */
	public static final int SDK_DEV_RECORD_PACKET_CFG     = 0x0027      ; 
	/**
	 * \if ENGLISH_LANG
	 * SMS MMS configuration 
	 * \else
	 * 6LPEMMSEdVC 
	 * \endif
	 */
	public static final int SDK_DEV_MMS_CFG               = 0x0028	;   
	/**
	 * \if ENGLISH_LANG
	 * SMS to activate the wireless connection configuration
	 * \else
	 * 6LPE<$;nN^O_A,=SEdVC
	 * \endif
	 */
	public static final int SDK_DEV_SMSACTIVATION_CFG	 = 0x0029	;   
	/**
	 * \if ENGLISH_LANG
	 * Dial-up activation of a wireless connection configuration
	 * \else
	 * 2&:E<$;nN^O_A,=SEdVC
	 * \endif
	 */
	public static final int SDK_DEV_DIALINACTIVATION_CFG	 = 0x002A	;   
	/**
	 * \if ENGLISH_LANG
	 * Capture network configuration
	 * \else
	 * MxBgW%0|EdVC
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG_EX		 = 0x0030	;   
	/**
	 * \if ENGLISH_LANG
	 * Download speed limit
	 * \else
	 * OBTXKY6HO^VF
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_RATE_CFG	 = 0x0031	;   
	/**
	 * \if ENGLISH_LANG
	 * Panorama switch alarm configuration
	 * \else
	 * H+>0GP;;1(>/EdVC
	 * \endif
	 */
	public static final int SDK_DEV_PANORAMA_SWITCH_CFG	 = 0x0032	;   
	/**
	 * \if ENGLISH_LANG
	 * Lose focus alarm configuration
	 * \else
	 * J'H%=95c1(>/EdVC
	 * \endif
	 */
	public static final int SDK_DEV_LOST_FOCUS_CFG		 = 0x0033	;   
	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder configuration
	 * \else
	 * 1(>/=bBkFwEdVC
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_DECODE_CFG		 = 0x0034	;   
	/**
	 * \if ENGLISH_LANG
	 * Video output configuration
	 * \else
	 * JSF5Jd3v2NJ}EdVC
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOOUT_CFG          = 0x0035      ; 
	/**
	 * \if ENGLISH_LANG
	 * Preset enable configuration
	 * \else
	 * T$VF5cJ9D\EdVC
	 * \endif
	 */
	public static final int SDK_DEV_POINT_CFG			 = 0x0036	;   
	/**
	 * \if ENGLISH_LANG
	 * IP conflication configurationIp
	 * \else
	 * Ip3eM;<l2b1(>/EdVC
	 * \endif
	 */
	public static final int SDK_DEV_IP_COLLISION_CFG      = 0x0037      ; 
	/**
	 * \if ENGLISH_LANG
	 * OSD overlay enable configuration
	 * \else
	 * OSD5~<SJ9D\EdVC
	 * \endif
	 */
	public static final int SDK_DEV_OSD_ENABLE_CFG		 = 0x0038	;   
	/**
	 * \if ENGLISH_LANG
	 * Local alarm configuration(Structure DH_ALARMIN_CFG_EX)
	 * \else
	 * 1>5X1(>/EdVC(=a99LeSDK_ALARMIN_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_CFG 		 = 0x0039	;   
	/**
	 * \if ENGLISH_LANG
	 * Network alarm configuration(Structure DH_ALARMIN_CFG_EX)
	 * \else
	 * MxBg1(>/EdVC(=a99LeSDK_ALARMIN_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETALARM_CFG 		 = 0x003A	;   
	/**
	 * \if ENGLISH_LANG
	 * Motion detection configuration(Structure DH_MOTION_DETECT_CFG_EX)
	 * \else
	 * 6/<l1(>/EdVC(=a99LeSDK_MOTION_DETECT_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_MOTIONALARM_CFG 		 = 0x003B	;   
	/**
	 * \if ENGLISH_LANG
	 * Video loss configuration(Structure DH_VIDEO_LOST_CFG_EX)
	 * \else
	 * JSF56*J'1(>/EdVC(=a99LeSDK_VIDEO_LOST_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOLOSTALARM_CFG 	 = 0x003C	;   
	/**
	 * \if ENGLISH_LANG
	 * Camera masking configuration(Structure DH_BLIND_CFG_EX)
	 * \else
	 * JSF5UZ521(>/EdVC(=a99LeSDK_BLIND_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_BLINDALARM_CFG 		 = 0x003D	;   
	/**
	 * \if ENGLISH_LANG
	 * HDD alarm configuration(Structure DH_DISK_ALARM_CFG_EX)
	 * \else
	 * S2EL1(>/EdVC(=a99LeSDK_DISK_ALARM_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_DISKALARM_CFG 		 = 0x003E	;   
	/**
	 * \if ENGLISH_LANG
	 * Network disconnection alarm configuration(Structure DH_NETBROKEN_ALARM_CFG_EX)
	 * \else
	 * MxBgVP6O1(>/EdVC(=a99LeSDK_NETBROKEN_ALARM_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETBROKENALARM_CFG 	 = 0x003F	;   
	/**
	 * \if ENGLISH_LANG
	 * Digital channel info of front encoders(Hybrid DVR use,Structure DEV_ENCODER_CFG)
	 * \else
	 * J}WVM(5@5DG06K1`BkFwPEO"(;l:ODVRJ9SC#,=a99LeDEV_ENCODER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG           = 0x0040      ; 
	/**
	 * \if ENGLISH_LANG
	 * TV adjust configuration(Now the channel parameter represents the TV numble(from 0), Structure SDKDEV_TVADJUST_CFG)
	 * \else
	 * TV5w=ZEdVC#(channel4z1mTV:E(0?*J<)#,@`PM=a99Le#)
	 * \endif
	 */
	public static final int SDK_DEV_TV_ADJUST_CFG         = 0x0041      ; 
	/**
	 * \if ENGLISH_LANG
	 * about vehicle configuration
	 * \else
	 * 35TXO`9XEdVC#,11>)9+=;J9SC
	 * \endif
	 */
	public static final int SDK_DEV_ABOUT_VEHICLE_CFG	 = 0x0042	;   
	/**
	 * \if ENGLISH_LANG
	 * ATM ability information
	 * \else
	 * ;qH!atm5~<SV'3VD\A&PEO"
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_ABILITY	 = 0x0043	;   
	/**
	 * \if ENGLISH_LANG
	 * ATM overlay configuration
	 * \else
	 * atm5~<SEdVC#,PBatmLXSP
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG		 = 0x0044	;   
	/**
	 * \if ENGLISH_LANG
	 * Decoder tour configuration
	 * \else
	 * =bBkFw=bBkBVQ2EdVC
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_TOUR_CFG		 = 0x0045	;   
	/**
	 * \if ENGLISH_LANG
	 * SIP configuration
	 * \else
	 * SIPEdVC
	 * \endif
	 */
	public static final int SDK_DEV_SIP_CFG				 = 0x0046	;   
	/**
	 * \if ENGLISH_LANG
	 * wifi ap configuration
	 * \else
	 * wifi apEdVC
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG	 = 0x0047	;   
	/**
	 * \if ENGLISH_LANG
	 * Static
	 * \else
	 * >2L,1(>/EdVC 
	 * \endif
	 */
	public static final int SDK_DEV_STATICALARM_CFG       = 0x0048      ; 
	/**
	 * \if ENGLISH_LANG
	 * decode policy configuration(Structure SDKDEV_DECODEPOLICY_CFG,channel start with 0) 
	 * \else
	 * Ih185D=bBk2_BTEdVC(=a99LeSDKDEV_DECODEPOLICY_CFG#,channelN*=bBkM(5@0?*J<)
	 * \endif
	 */
	public static final int SDK_DEV_DECODE_POLICY_CFG     = 0x0049      ;  
	/**
	 * \if ENGLISH_LANG
	 * Device relative config (Structure SDKDEV_MACHINE_CFG)
	 * \else
	 * ;zFwO`9X5DEdVC(=a99LeSDKDEV_MACHINE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACHINE_CFG			 = 0x004A	;   
	/**
	 * \if ENGLISH_LANG
	 * MACconflication configuration(Structure ALARM_MAC_COLLISION_CFG)
	 * \else
	 * MAC3eM;<l2bEdVC(=a99LeALARM_MAC_COLLISION_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MAC_COLLISION_CFG     = 0x004B      ; 
	/**
	 * \if ENGLISH_LANG
	 * RTSP configuration(structure SDKDEV_RTSP_CFG)
	 * \else
	 * RTSPEdVC(6TS&=a99LeSDKDEV_RTSP_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_RTSP_CFG              = 0x004C      ; 
	/**
	 * \if ENGLISH_LANG
	 * 232 com card signal event configuration(structure COM_CARD_SIGNAL_LINK_CFG)
	 * \else
	 * 2324.?Z?(:EPE:EJB<~EdVC(6TS&=a99LeCOM_CARD_SIGNAL_LINK_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_232_COM_CARD_CFG      = 0x004E      ; 
	/**
	 * \if ENGLISH_LANG
	 * 485 com card signal event configuration(structure COM_CARD_SIGNAL_LINK_CFG)
	 * \else
	 * 4854.?Z?(:EPE:EJB<~EdVC(6TS&=a99LeCOM_CARD_SIGNAL_LINK_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_485_COM_CARD_CFG      = 0x004F      ; 
	/**
	 * \if ENGLISH_LANG
	 * extend FTP upload setup(Structure SDKDEV_FTP_PROTO_CFG_EX)
	 * \else
	 * FTPIO4+@)U9EdVC(6TS&=a99LeSDKDEV_FTP_PROTO_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG_EX		 = 0x0050	;   
	/**
	 * \if ENGLISH_LANG
	 * SYSLOG remote server config (Structure SDKDEV_SYSLOG_REMOTE_SERVER)
	 * \else
	 * SYSLOG T63L7~NqFwEdVC(6TS&=a99LeSDKDEV_SYSLOG_REMOTE_SERVER)
	 * \endif
	 */
	public static final int SDK_DEV_SYSLOG_REMOTE_SERVER	 = 0x0051	;   
	/**
	 * \if ENGLISH_LANG
	 * Extended com configuration(structure SDKDEV_COMM_CFG_EX)
	 * \else
	 * @)U94.?ZJtPTEdVC(6TS&=a99LeSDKDEV_COMM_CFG_EX) 
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG_EX            = 0x0052      ;            
	/**
	 * \if ENGLISH_LANG
	 * net card configuration(structure SDKDEV_NETCARD_CFG)
	 * \else
	 * ?(?ZPEO"EdVC(6TS&=a99LeSDKDEV_NETCARD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_NETCARD_CFG           = 0x0053      ; 
	/**
	 * \if ENGLISH_LANG
	 * Video backup format(structure SDKDEV_BACKUP_VIDEO_FORMAT)
	 * \else
	 * JSF5187]8qJ=EdVC(6TS&=a99LeSDKDEV_BACKUP_VIDEO_FORMAT)
	 * \endif
	 */
	public static final int SDK_DEV_BACKUP_VIDEO_FORMAT   = 0x0054	;   
	/**
	 * \if ENGLISH_LANG
	 * stream encrypt configuration(structure DHEDV_STREAM_ENCRYPT)
	 * \else
	 * BkAw<SC\EdVC(6TS&=a99LeDHEDV_STREAM_ENCRYPT)
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_CFG    = 0x0055      ; 
	/**
	 * \if ENGLISH_LANG
	 * IP filter extended configuration(structure SDKDEV_IPIFILTER_CFG_EX)
	 * \else
	 * IP9}BKEdVC@)U9(6TS&=a99LeSDKDEV_IPIFILTER_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_IPFILTER_CFG_EX       = 0x0056	;   
	/**
	 * \if ENGLISH_LANG
	 * custom configuration(structure SDKDEV_CUSTOM_CFG)
	 * \else
	 * SC;'WT6(ReEdVC(6TS&=a99LeSDKDEV_CUSTOM_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_CUSTOM_CFG            = 0x0057      ; 
	/**
	 * \if ENGLISH_LANG
	 * Search wireless device extended setup(structure SDKDEV_WLAN_DEVICE_LIST_EX)
	 * \else
	 * KQKwN^O_Ih18@)U9EdVC(6TS&=a99LeSDKDEV_WLAN_DEVICE_LIST_EX)
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG_EX    = 0x0058      ; 
	/**
	 * \if ENGLISH_LANG
	 * ACC power off configuration(structure SDKDEV_ACC_POWEROFF_CFG)
	 * \else
	 * ACC6OO_JB<~EdVC(6TS&=a99LeSDKDEV_ACC_POWEROFF_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ACC_POWEROFF_CFG      = 0x0059      ; 
	/**
	 * \if ENGLISH_LANG
	 * explosion proof alarm configuration(structure SDKDEV_EXPLOSION_PROOF_CFG)
	 * \else
	 * 7@1,:P1(>/JB<~EdVC(6TS&=a99LeSDKDEV_EXPLOSION_PROOF_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_EXPLOSION_PROOF_CFG   = 0x005a      ; 
	/**
	 * \if ENGLISH_LANG
	 * Network extended setup(struct SDKDEV_NET_CFG_EX)
	 * \else
	 * MxBg@)U9EdVC(6TS&=a99LeSDKDEV_NET_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG_EX			 = 0x005b	;   
	/**
	 * \if ENGLISH_LANG
	 * light control config(struct SDKDEV_LIGHTCONTROL_CFG)
	 * \else
	 * 5F9b?XVFEdVC(6TS&=a99LeSDKDEV_LIGHTCONTROL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_LIGHTCONTROL_CFG      = 0x005c      ; 
	/**
	 * \if ENGLISH_LANG
	 * 3G flow info config(struct SDKDEV_3GFLOW_INFO_CFG)
	 * \else
	 * 3GAwA?PEO"EdVC(6TS&=a99LeSDKDEV_3GFLOW_INFO_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_3GFLOW_CFG            = 0x005d      ; 
	/**
	 * \if ENGLISH_LANG
	 * IPv6 config(struct SDKDEV_IPV6_CFG)
	 * \else
	 * IPv6EdVC(6TS&=a99LeSDKDEV_IPV6_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_IPV6_CFG              = 0x005e      ; 
	/**
	 * \if ENGLISH_LANG
	 * Snmp config(struct SDKDEV_NET_SNMP_CFG)
	 * \else
	 * SnmpEdVC(6TS&=a99LeSDKDEV_NET_SNMP_CFG), IhVCMj3I:sPhR*VXFtIh18
	 * \endif
	 */
	public static final int SDK_DEV_SNMP_CFG              = 0x005f      ; 
	/**
	 * \if ENGLISH_LANG
	 * snap control config(struct SDKDEV_SNAP_CONTROL_CFG)
	 * \else
	 * W%M<?*9XEdVC(6TS&=a99LeSDKDEV_SNAP_CONTROL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CONTROL_CFG      = 0x0060      ; 
	/**
	 * \if ENGLISH_LANG
	 * GPS mode config(struct SDKDEV_GPS_MODE_CFG)
	 * \else
	 * GPS6(N;D#J=EdVC(6TS&=a99LeSDKDEV_GPS_MODE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_GPS_MODE_CFG          = 0x0061      ; 
	/**
	 * \if ENGLISH_LANG
	 * Snap upload config(struct SDKDEV_SNAP_UPLOAD_CFG)
	 * \else
	 * M<F,IO4+EdVCPEO"(6TS&=a99Le SDKDEV_SNAP_UPLOAD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_UPLOAD_CFG       = 0x0062      ; 
	/**
	 * \if ENGLISH_LANG
	 * Speed limit config(struct SDKDEV_SPEED_LIMIT_CFG)
	 * \else
	 * O^KYEdVCPEO"(6TS&=a99LeSDKDEV_SPEED_LIMIT_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_SPEED_LIMIT_CFG       = 0x0063      ; 
	/**
	 * \if ENGLISH_LANG
	 * iSCSI config(struct SDKDEV_ISCSI_CFG), need reboot
	 * \else
	 * iSCSIEdVC(6TS&=a99LeSDKDEV_ISCSI_CFG), IhVCMj3I:sPhR*VXFtIh18
	 * \endif
	 */
	public static final int SDK_DEV_ISCSI_CFG			 = 0x0064	;   
	/**
	 * \if ENGLISH_LANG
	 * wifi config(struc SDKDEV_WIRELESS_ROUTING_CFG)
	 * \else
	 * N^O_B7SIEdVC(6TS&=a99LeSDKDEV_WIRELESS_ROUTING_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_WIRELESS_ROUTING_CFG	 = 0x0065	;   
	/**
	 * \if ENGLISH_LANG
	 * enclosure config(stuct SDKDEV_ENCLOSURE_CFG)
	 * \else
	 * 5gWSN'@8EdVC(6TS&=a99LeSDKDEV_ENCLOSURE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_CFG         = 0x0066      ; 
	/**
	 * \if ENGLISH_LANG
	 * enclosure version config(struct SDKDEV_ENCLOSURE_VERSION_CFG)
	 * \else
	 * 5gWSN'@80f1>:EEdVC(6TS&=a99LeSDKDEV_ENCLOSURE_VERSION_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_VERSION_CFG  = 0x0067     ; 
	/**
	 * \if ENGLISH_LANG
	 * Raid event config(struct SDKDEV_RAID_EVENT_CFG)
	 * \else
	 * RaidJB<~EdVC(6TS&=a99LeSDKDEV_RAID_EVENT_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_RIAD_EVENT_CFG         = 0x0068     ; 
	/**
	 * \if ENGLISH_LANG
	 * fire alarm config(struct SDKDEV_FIRE_ALARM_CFG)
	 * \else
	 * ;p>/1(>/EdVC(6TS&=a99LeSDKDEV_FIRE_ALARM_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_FIRE_ALARM_CFG         = 0x0069     ; 
	/**
	 * \if ENGLISH_LANG
	 * local alarm name config(string like "Name1&&name2&&name3...")
	 * \else
	 * 1>5XC{3F1(>/EdVC(6TS&Name1&&name2&&name3...8qJ=WV7{4.)
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_NAME_CFG    = 0x006a     ; 
	/**
	 * \if ENGLISH_LANG
	 * urgency storage config(struct SDKDEV_URGENCY_RECORD_CFG)
	 * \else
	 * =t<14f4"EdVC(6TS&=a99LeSDKDEV_URGENCY_RECORD_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_URGENCY_RECORD_CFG     = 0x0070     ; 
	/**
	 * \if ENGLISH_LANG
	 * elevator parameter config(struct SDKDEV_ELEVATOR_ATTRI_CFG)
	 * \else
	 * 5gL]TKPP2NJ}EdVC(6TS&=a99LeSDKDEV_ELEVATOR_ATTRI_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_ELEVATOR_ATTRI_CFG     = 0x0071     ; 
	/**
	 * \if ENGLISH_LANG
	 * TM overlay function. For latest ATM series product only. 
	 * \else
	 * atm5~<SEdVC#,PBatmLXSP,V'3V4sSZ32M(5@5DIh18(6TS&=a99LeSDKDEV_ATM_OVERLAY_CONFIG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG_EX	  = 0x0072	;   
	/**
	 * \if ENGLISH_LANG
	 * Support devices of 32-channel or higher.( struct SDKDEV_ATM_OVERLAY_CONFIG_EX)
	 * \else
	 * MAC9}BKEdVC(6TS&=a99LeSDKDEV_MACFILTER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACFILTER_CFG		  = 0x0073	;   
	/**
	 * \if ENGLISH_LANG
	 * MAC filter config(struct SDKDEV_MACFILTER_CFG)
	 * \else
	 * MAC,IP9}BK(R*Gsip,macJGR;R;6TS&5D)EdVC(6TS&=a99LeSDKDEV_MACIPFILTER_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_MACIPFILTER_CFG		  = 0x0074	;   
	/**
	 * \if ENGLISH_LANG
	 * MAC,IP filter config(need ip,mac one to one corresponding)(struct SDKDEV_MACIPFILTER_CFG)
	 * \else
	 * BkAw<SC\(<SC\<F;.)EdVC(6TS&=a99LeDHEDV_STREAM_ENCRYPT)
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_TIME_CFG  = 0x0075   ; 
	/**
	 * \if ENGLISH_LANG
	 * stream encrypt(encryot plan)(struct DHEDV_STREAM_ENCRYPT)
	 * \else
	 * O^BkAwEdVC(6TS&=a99Le SDKDEV_LIMIT_BIT_RATE) 
	 * \endif
	 */
	public static final int SDK_DEV_LIMIT_BIT_RATE_CFG     = 0x0076     ; 
	/**
	 * \if ENGLISH_LANG
	 * limit bit rate config(struct SDKDEV_LIMIT_BIT_RATE)
	 * \else
	 * W%M<O`9XEdVC@)U9(6TS&=a99Le SDKDEV_SNAP_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG_EX			  = 0x0077	;   
	/**
	 * \if ENGLISH_LANG
	 * snap extern config(struct SDKDEV_SNAP_CFG_EX)
	 * \else
	 * =bBkFwurlEdVC(6TS&=a99LeSDKDEV_DECODER_URL_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_URL_CFG		 = 0x0078	;   
	/**
	 * \if ENGLISH_LANG
	 * decoder url config(struct SDKDEV_DECODER_URL_CFG)
	 * \else
	 * BVQ2J9D\EdVC(6TS&=a99LeSDKDEV_TOUR_ENABLE_CFG)
	 * \endif
	 */
	public static final int SDK_DEV_TOUR_ENABLE_CFG		 = 0x0079	;   
	/**
	 * \if ENGLISH_LANG
	 * toyr enable config(struct SDKDEV_TOUR_ENABLE_CFG)
	 * \else
	 * wifi apEdVC@)U9(6TS&=a99LeSDKDEV_VEHICLE_WIFI_AP_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG_EX  = 0x007a    ; 
	/**
	 * \if ENGLISH_LANG
	 * wifi ap extern config(struct SDKDEV_VEHICLE_WIFI_AP_CFG_EX)
	 * \else
	 * J}WVM(5@5DG06K1`BkFwPEO"@)U9#,(6TS&=a99LeDEV_ENCODER_CFG_EX)
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG_EX          = 0x007b    ; 

	public static final int SDK_DEV_USER_END_CFG			 = 1000;
	 
	
	// @)U91(>/@`PM#,6TS&CLIENT_StartListenEx=S?Z
	public static final int SDK_ALARM_ALARM_EX                 = 0x2101;           // Mb2?1(>/
	public static final int SDK_MOTION_ALARM_EX                = 0x2102;           // 6/L,<l2b1(>/
	public static final int SDK_VIDEOLOST_ALARM_EX             = 0x2103;           // JSF56*J'1(>/
	public static final int SDK_SHELTER_ALARM_EX               = 0x2104;           // JSF5UZ521(>/
	public static final int SDK_SOUND_DETECT_ALARM_EX          = 0x2105;           // RtF5<l2b1(>/
	public static final int SDK_DISKFULL_ALARM_EX              = 0x2106;           // S2ELBz1(>/
	public static final int SDK_DISKERROR_ALARM_EX             = 0x2107;           // ;5S2EL1(>/
	public static final int SDK_ENCODER_ALARM_EX               = 0x210A;           // 1`BkFw1(>/
	public static final int SDK_URGENCY_ALARM_EX               = 0x210B;           // =t<11(>/
	public static final int SDK_WIRELESS_ALARM_EX              = 0x210C;           // N^O_1(>/
	public static final int SDK_NEW_SOUND_DETECT_ALARM_EX      = 0x210D;           // PBRtF5<l2b1(>/#,1(>/PEO"5D=a99Le<{DH_NEW_SOUND_ALARM_STATE#;
	public static final int SDK_ALARM_DECODER_ALARM_EX         = 0x210E;           // 1(>/=bBkFw1(>/
	public static final int SDK_DECODER_DECODE_ABILITY         = 0x210F;           // =bBkFw#:=bBkD\A&1(>/
	public static final int SDK_FDDI_DECODER_ABILITY           = 0x2110;           // 9bOK1`BkFwW4L,1(>/
	public static final int SDK_PANORAMA_SWITCH_ALARM_EX       = 0x2111;           // GP;;3!>01(>/
	public static final int SDK_LOSTFOCUS_ALARM_EX             = 0x2112;           // J'H%=95c1(>/
	public static final int SDK_OEMSTATE_EX                    = 0x2113;           // oem1(M#W4L,
	public static final int SDK_DSP_ALARM_EX                   = 0x2114;           // DSP1(>/
	public static final int SDK_ATMPOS_BROKEN_EX               = 0x2115;           // atm:Mpos;z6O?*1(>/#, 0#:A,=S6O?* 1#:A,=SU}3#
	public static final int SDK_RECORD_CHANGED_EX              = 0x2116;           // B<OqW4L,1d;/1(>/
	public static final int SDK_CONFIG_CHANGED_EX              = 0x2117;           // EdVC7"Iz1d;/1(>/
	public static final int SDK_DEVICE_REBOOT_EX               = 0x2118;           // Ih18VXFt1(>/
	public static final int SDK_WINGDING_ALARM_EX              = 0x2119;           // O_H&/35<lFw9JUO1(>/
	public static final int SDK_TRAF_CONGESTION_ALARM_EX       = 0x211A;           // =;M(WhH{1(>/(35A>3vOVRl3#M#V9;rU_EE6S)
	public static final int SDK_TRAF_EXCEPTION_ALARM_EX        = 0x211B;           // =;M(Rl3#1(>/(=;M(AwA?GwSZ0;rRl3#?UOP)
	public static final int SDK_EQUIPMENT_FILL_ALARM_EX        = 0x211C;           // 299bIh189JUO1(>/
	public static final int SDK_ALARM_ARM_DISARM_STATE         = 0x211D;           // 1(>/2<377@W4L,
	public static final int SDK_ALARM_ACC_POWEROFF             = 0x211E;           // ACC6O5g1(>/
	public static final int SDK_ALARM_3GFLOW_EXCEED            = 0x211F;           // 3GAwA?3,3vcPV51(>/(1(>/PEO"5D=a99Le<{=a99LeDHDEV_3GFLOW_EXCEED_STATE_INFO)
	public static final int SDK_ALARM_SPEED_LIMIT              = 0x2120;           // O^KY1(>/
	public static final int SDK_ALARM_VEHICLE_INFO_UPLOAD      = 0x2121;           // 35TXWT6(RePEO"IO4+ 
	public static final int SDK_STATIC_ALARM_EX                = 0x2122;           // >2L,<l2b1(>/
	public static final int SDK_PTZ_LOCATION_EX                = 0x2123;           // TFL(6(N;PEO"
	public static final int SDK_ALARM_CARD_RECORD_UPLOAD       = 0x2124;           // ?(:EB<OqPEO"IO4+(6TS&=a99Le ALARM_CARD_RECORD_INFO_UPLOAD)
	public static final int SDK_ALARM_ATM_INFO_UPLOAD          = 0x2125;           // ATM=;RWPEO"IO4+(6TS&=a99Le ALARM_ATM_INFO_UPLOAD)
	public static final int SDK_ALARM_ENCLOSURE                = 0x2126;           // 5gWSN'@81(>/(6TS&=a99LeALARM_ENCLOSURE_INFO)
	public static final int SDK_ALARM_SIP_STATE                = 0x2127;           // SIPW4L,1(>/(6TS&=a99LeALARM_SIP_STATE)
	public static final int SDK_ALARM_RAID_STATE               = 0x2128;           // RAIDRl3#1(>/(6TS&=a99LeALARM_RAID_INFO)
	public static final int SDK_ALARM_CROSSING_SPEED_LIMIT     = 0x2129;           // B7?ZO^KY1(>/(6TS&=a99LeALARM_SPEED_LIMIT)
	public static final int SDK_ALARM_OVER_LOADING             = 0x212A;           // 3,TX1(>/(6TS&=a99LeALARM_OVER_LOADING)
	public static final int SDK_ALARM_HARD_BRAKING             = 0x212B;           // <1I2351(>/(6TS&;z99LeALARM_HARD_BRAKING)
	public static final int SDK_ALARM_SMOKE_SENSOR             = 0x212C;           // QL8P1(>/(6TS&=a99LeALARM_SMOKE_SENSOR)
	public static final int SDK_ALARM_TRAFFIC_LIGHT_FAULT      = 0x212D;           // =;M(5F9JUO1(>/(6TS&=a99LeALARM_TRAFFIC_LIGHT_FAULT) 
	public static final int SDK_ALARM_TRAFFIC_FLUX_STAT        = 0x212E;           // =;M(AwA?M3<F1(>/(6TS&=a99LeALARM_TRAFFIC_FLUX_LANE_INFO)
	public static final int SDK_ALARM_CAMERA_MOVE              = 0x212F;           // IcOq;zRFN;1(>/JB<~(6TS&=a99LeALARM_CAMERA_MOVE_INFO)
	public static final int SDK_ALARM_DETAILEDMOTION           = 0x2130;           // OjO86/<l1(>/IO1(PEO"(6TS&=a99LeALARM_DETAILEDMOTION_CHNL_INFO)
	public static final int SDK_ALARM_STORAGE_FAILURE          = 0x2131;           // 4f4"Rl3#1(>/(6TS&=a99LeALARM_STORAGE_FAILUREJ}Wi)
	public static final int SDK_ALARM_FRONTDISCONNECT          = 0x2132;           // G06KIPC6OMx1(>/(6TS&=a99LeALARM_FRONTDISCONNET_INFO)
	public static final int SDK_ALARM_ALARM_EX_REMOTE          = 0x2133;           // T63LMb2?1(>/(6TS&=a99Le ALARM_REMOTE_ALARM_INFO)
	public static final int SDK_ALARM_BATTERYLOWPOWER          = 0x2134;           // 5g3X5gA?5M1(>/(6TS&=a99LeALARM_BATTERYLOWPOWER_INFO)
	public static final int SDK_ALARM_TEMPERATURE              = 0x2135;           // NB6H9}8_1(>/(6TS&=a99LeALARM_TEMPERATURE_INFO)
	public static final int SDK_ALARM_TIREDDRIVE               = 0x2136;           // F#@M<]J;1(>/(6TS&=a99LeALARM_TIREDDRIVE_INFO)
	public static final int SDK_ALARM_LOST_RECORD              = 0x2137;           // 6*B<OqJB<~1(>/(6TS&=a99LeALARM_LOST_RECORD)
	public static final int SDK_ALARM_HIGH_CPU                 = 0x2138;           // CPUU<SCBJ9}8_JB<~1(>/(6TS&=a99LeALARM_HIGH_CPU)
	public static final int SDK_ALARM_LOST_NETPACKET           = 0x2139;           // MxBg7"KMJ}>]6*0|JB<~1(>/(6TS&=a99LeALARM_LOST_NETPACKET)
	public static final int SDK_ALARM_HIGH_MEMORY              = 0x213A;           // DZ4fU<SCBJ9}8_JB<~1(>/(6TS&=a99LeALARM_HIGH_MEMORY)
	public static final int SDK_LONG_TIME_NO_OPERATION         = 0x213B;           // WEBSC;'3$J1<dN^2YWwJB<~#(N^@)U9PEO"#)
	public static final int SDK_BLACKLIST_SNAP                 = 0x213C;           // :ZC{5%35A>W%EDJB<~(6TS&=a99LeDH_BLACKLIST_SNAP_INFO)         
	public static final int SDK_ALARM_DISK                     = 0x213E;           // S2EL1(>/(6TS&ALARM_DISK_INFOJ}Wi)
	public static final int SDK_ALARM_FILE_SYSTEM              = 0x213F;           // ND<~O5M31(>/(6TS&ALARM_FILE_SYSTEM_INFOJ}Wi)
	public static final int SDK_ALARM_IVS                      = 0x2140;           // VGD\1(>/JB<~(6TS&=a99LeALARM_IVS_INFO)
	public static final int SDK_ALARM_GOODS_WEIGHT_UPLOAD      = 0x2141;           // ;uVXPEO"IO1((6TS&ALARM_GOODS_WEIGHT_UPLOAD_INFO)
	public static final int SDK_ALARM_GOODS_WEIGHT             = 0x2142;           // ;uVXPEO"1(>/(6TS&ALARM_GOODS_WEIGHT_INFO)
	public static final int SDK_GPS_STATUS                     = 0x2143;           // GPS6(N;PEO"(6TS& NET_GPS_STATUS_INFO)
	public static final int SDK_ALARM_DISKBURNED_FULL          = 0x2144;           // S2EL?LB<Bz1(>/(6TS& ALARM_DISKBURNED_FULL_INFO)
	public static final int SDK_ALARM_STORAGE_LOW_SPACE        = 0x2145;           // 4f4"H]A?2;WcJB<~(6TS&ALARM_STORAGE_LOW_SPACE_INFO)
	public static final int SDK_ALARM_DISK_FLUX                = 0x2160;           // S2ELJ}>]Rl3#JB<~(6TS&ALARM_DISK_FLUX)
	public static final int SDK_ALARM_NET_FLUX                 = 0x2161;           // MxBgJ}>]Rl3#JB<~(6TS&ALARM_NET_FLUX)
	public static final int SDK_ALARM_FAN_SPEED                = 0x2162;           // 7gIHW*KYRl3#JB<~(6TS&ALARM_FAN_SPEED)
	public static final int SDK_ALARM_STORAGE_FAILURE_EX       = 0x2163;           // 4f4"4mNs1(>/(6TS&=a99LeALARM_STORAGE_FAILURE_EX)
	public static final int SDK_ALARM_RECORD_FAILED            = 0x2164;           // B<OqRl3#1(>/(6TS&=a99LeALARM_RECORD_FAILED_INFO)
	public static final int SDK_ALARM_STORAGE_BREAK_DOWN       = 0x2165;           // 4f4"1@@#JB<~(6TS&=a99LeALARM_STORAGE_BREAK_DOWN_INFO)
	public static final int SDK_ALARM_VIDEO_ININVALID          = 0x2166;           // JSF5JdHkM(5@J'P'JB<~#(@}#:EdVC5DJSF5JdHkM(5@BkAw#,3,3vIh184&@mD\A&#)ALARM_VIDEO_ININVALID_INFO
	public static final int SDK_ALARM_VEHICLE_TURNOVER         = 0x2167;           // 35A>2`7-1(>/JB<~(6TS&=a99LeALARM_VEHICEL_TURNOVER_EVENT_INFO)
	public static final int SDK_ALARM_VEHICLE_COLLISION        = 0x2168;           // 35A>W2351(>/JB<~(6TS&=a99LeALARM_VEHICEL_COLLISION_EVENT_INFO)
	public static final int SDK_ALARM_VEHICLE_CONFIRM          = 0x2169;           // 35A>IO4+PEO"JB<~(6TS&=a99LeALARM_VEHICEL_CONFIRM_INFO)
	public static final int SDK_ALARM_VEHICLE_LARGE_ANGLE      = 0x2170;           // 35TXIcOqM74s=G6HE$W*JB<~(6TS&=a99LeALARM_VEHICEL_LARGE_ANGLE)
	public static final int SDK_ALARM_TALKING_INVITE           = 0x2171;           // Ih18GkGs6T7=7"Fp6T=2JB<~(6TS&=a99LeALARM_TALKING_INVITE_INFO)
	public static final int SDK_ALARM_ALARM_EX2                = 0x2175;           // 1>5X1(>/JB<~(6TS&=a99LeALARM_ALARM_INFO_EX2#,6TDH_ALARM_ALARM_EXI}<6)
	public static final int SDK_ALARM_VIDEO_TIMING             = 0x2176;           // JSF56(J1<l2bJB<~(6TS&=a99LeALARM_VIDEO_TIMING)
	public static final int SDK_ALARM_COMM_PORT                = 0x2177;           // 4.?ZJB<~(6TS&=a99LeALARM_COMM_PORT_EVENT_INFO)
	public static final int SDK_ALARM_AUDIO_ANOMALY            = 0x2178;           // RtF5Rl3#JB<~(6TS&=a99LeALARM_AUDIO_ANOMALY)
	public static final int SDK_ALARM_AUDIO_MUTATION           = 0x2179;           // IyG?M;1dJB<~(6TS&=a99LeALARM_AUDIO_MUTATION)
	public static final int SDK_EVENT_TYREINFO                 = 0x2180;           // BVL%PEO"IO1(JB<~(6TS&=a99LeEVENT_TYRE_INFO)
	public static final int SDK_ALARM_POWER_ABNORMAL           = 0x2181;           // H_S`5gT4Rl3#1(>/(6TS&=a99LeALARM_POWER_ABNORMAL_INFO)
	public static final int SDK_EVENT_REGISTER_OFF             = 0x2182;           // 35TXIh18Vw6/OBO_JB<~(6TS&=a99Le EVENT_REGISTER_OFF_INFO)
	public static final int SDK_ALARM_NO_DISK                  = 0x2183;           // N^S2EL1(>/(6TS&=a99LeALARM_NO_DISK_INFO)
	public static final int SDK_ALARM_FALLING                  = 0x2184;           // 5xBdJB<~1(>/(6TS&=a99LeALARM_FALLING_INFO)
	public static final int SDK_ALARM_PROTECTIVE_CAPSULE       = 0x2185;           // 7@;$2UJB<~(6TS&=a99LeALARM_PROTECTIVE_CAPSULE_INFO)
	public static final int SDK_ALARM_NO_RESPONSE              = 0x2186;           // :t=PN4S&4p>/1((6TS&=a99LeALARM_NO_RESPONSE_INFO)
	public static final int SDK_ALARM_CONFIG_ENABLE_CHANGE     = 0x2187;           // EdVCJ9D\8D1dIO1(JB<~(6TS&=a99Le ALARM_CONFIG_ENABLE_CHANGE_INFO)

	public static final int SDK_ALARM_STORAGE_NOT_EXIST        = 0x3167;           // 4f4"Wi2;4fTZJB<~(6TS&=a99LeALARM_STORAGE_NOT_EXIST_INFO)
	public static final int SDK_ALARM_NET_ABORT                = 0x3169;           // MxBg9JUOJB<~(6TS&=a99LeALARM_NETABORT_INFO)
	public static final int SDK_ALARM_IP_CONFLICT              = 0x3170;           // IP3eM;JB<~(6TS&=a99LeALARM_IP_CONFLICT_INFO)
	public static final int SDK_ALARM_MAC_CONFLICT             = 0x3171;           // MAC3eM;JB<~(6TS&=a99LeALARM_MAC_CONFLICT_INFO)
	public static final int SDK_ALARM_POWERFAULT               = 0x3172;           // 5gT49JUOJB<~(6TS&=a99LeALARM_POWERFAULT_INFO)
	public static final int SDK_ALARM_CHASSISINTRUDED          = 0x3173;           // ;zOdHkGV(7@2p)1(>/JB<~(6TS&=a99LeALARM_CHASSISINTRUDED_INFO)
	public static final int SDK_ALARM_ALARMEXTENDED            = 0x3174;           // 1>5X@)U91(>/JB<~(6TS&=a99Le ALARM_ALARMEXTENDED_INFO)
	public static final int SDK_ALARM_ARMMODE_CHANGE_EVENT     = 0x3175;           // 2<377@W4L,1d;/JB<~(6TS&=a99LeALARM_ARMMODE_CHANGE_INFO)
	public static final int SDK_ALARM_BYPASSMODE_CHANGE_EVENT  = 0x3176;           // ETB7W4L,1d;/JB<~(6TS&=a99LeALARM_BYPASSMODE_CHANGE_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_NOT_CLOSE     = 0x3177;           // CE={N49XJB<~(6TS&=a99LeALARM_ACCESS_CTL_NOT_CLOSE_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_BREAK_IN      = 0x3178;           // 43HkJB<~(6TS&=a99LeALARM_ACCESS_CTL_BREAK_IN_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_REPEAT_ENTER  = 0x3179;           // 7484=xHkJB<~(6TS&=a99LeALARM_ACCESS_CTL_REPEAT_ENTER_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_DURESS        = 0x3180;           // P2FH?(K"?(JB<~(6TS&=a99LeALARM_ACCESS_CTL_DURESS_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_EVENT         = 0x3181;           // CE={JB<~(6TS&=a99LeALARM_ACCESS_CTL_EVENT_INFO)
	public static final int SDK_URGENCY_ALARM_EX2              = 0x3182;           // =t<11(>/EX2(6TDH_URGENCY_ALARM_EX5DI}<6,6TS&=a99LeALARM_URGENCY_ALARM_EX2, HKN*4%7"5D=t<1JB<~, R;0c4&@mJGA*6/Mb2?M(Q69&D\GkGs0oVz
	public static final int SDK_ALARM_INPUT_SOURCE_SIGNAL      = 0x3183;           // 1(>/JdHkT4PE:EJB<~(V;R*SPJdHk>M;a2zIz8CJB<~, 2;B[7@Gx51G05DD#J=#,N^7(FA1N, 6TS&ALARM_INPUT_SOURCE_SIGNAL_INFO)
	public static final int SDK_ALARM_ANALOGALARM_EVENT        = 0x3184;           // D#DbA?1(>/JdHkM(5@JB<~(6TS&=a99LeALARM_ANALOGALARM_EVENT_INFO)
	public static final int SDK_ALARM_ACCESS_CTL_STATUS        = 0x3185;           // CE={W4L,JB<~(6TS&=a99LeALARM_ACCESS_CTL_STATUS_INFO)
	public static final int SDK_ALARM_ACCESS_SNAP              = 0x3186;           // CE={W%M<JB<~(6TS&=a99LeALARM_ACCESS_SNAP_INFO)
	public static final int SDK_ALARM_ALARMCLEAR               = 0x3187;           // O{>/JB<~(6TS&=a99LeALARM_ALARMCLEAR_INFO)
	public static final int SDK_ALARM_CIDEVENT                 = 0x3188;           // CIDJB<~(6TS&=a99LeALARM_CIDEVENT_INFO)
	public static final int SDK_ALARM_TALKING_HANGUP           = 0x3189;           // Ih18Vw6/9R6O6T=2JB<~(6TS&=a99LeALARM_TALKING_HANGUP_INFO)
	public static final int SDK_ALARM_BANKCARDINSERT           = 0x318a;           // RxPP?(2e?(JB<~(6TS&=a99LeALARM_BANKCARDINSERT_INFO)
	public static final int SDK_ALARM_RCEMERGENCY_CALL         = 0x318b;           // =t<1:t=P1(>/JB<~(6TS&=a99Le ALARM_RCEMERGENCY_CALL_INFO)
	public static final int SDK_ALARM_OPENDOORGROUP            = 0x318c;           // 6`HKWi:O?*CEJB<~(6TS&=a99LeALARM_OPEN_DOOR_GROUP_INFO)
	public static final int SDK_ALARM_FINGER_PRINT             = 0x318d;           // ;qH!V8NFJB<~(6TS&=a99LeALARM_CAPTURE_FINGER_PRINT_INFO)
	public static final int SDK_ALARM_CARD_RECORD              = 0x318e;           // ?(:EB<OqJB<~(6TS&=a99Le ALARM_CARD_RECORD_INFO)
	public static final int SDK_ALARM_SUBSYSTEM_STATE_CHANGE   = 0x318f;           // WSO5M3W4L,8D1dJB<~(6TS&=a99LeALARM_SUBSYSTEM_STATE_CHANGE_INFO)
	public static final int SDK_ALARM_BATTERYPOWER_EVENT       = 0x3190;           // 5g3X5gA?6(J1M(V*JB<~(6TS&=a99LeALARM_BATTERYPOWER_INFO)
	public static final int SDK_ALARM_BELLSTATUS_EVENT         = 0x3191;           // >/:EW4L,JB<~(6TS&=a99LeALARM_BELLSTATUS_INFO)
	public static final int SDK_ALARM_DEFENCE_STATE_CHANGE_EVENT = 0x3192;         // 7@GxW4L,1d;/JB<~(6TS&=a99LeALARM_DEFENCE_STATUS_CHANGE_INFO), 
	                                                           // 6(VFPhGs#,:M2<7@377@1d;/JB<~!"ETB7W4L,1d;/JB<~VP5DW4L,6(Re2;M,#,
	                                                           // 8CW4L,M(9}CLIENT_QueryDevState()=S?Z5DDH_DEVSTATE_DEFENCE_STATEC|An;qH!


	public static final int SDK_ALARM_TICKET_STATISTIC         = 0x3193;           // 35F1M3<FPEO"JB<~(6TS&=a99Le ALARM_TICKET_STATISTIC)
	public static final int SDK_ALARM_LOGIN_FAILIUR            = 0x3194;           // 5GB=J'0\JB<~(6TS&=a99LeALARM_LOGIN_FAILIUR_INFO)
	public static final int SDK_ALARM_MODULE_LOST              = 0x3195;           // @)U9D#?i5tO_JB<~(6TS&=a99Le ALARM_MODULE_LOST_INFO)
	public static final int SDK_ALARM_PSTN_BREAK_LINE          = 0x3196;           // PSTN5tO_JB<~(6TS&=a99LeALARM_PSTN_BREAK_LINE_INFO)
	public static final int SDK_ALARM_ANALOG_PULSE             = 0x3197;           // D#DbA?1(>/JB<~(K2J1PMJB<~), LX6(4+8PFw@`PMJ12E4%7"(6TS&=a99LeALARM_ANALOGPULSE_INFO)
	public static final int SDK_ALARM_MISSION_CONFIRM          = 0x3198;           // HNNqH7HOJB<~(6TS&=a99Le ALARM_MISSION_CONFIRM_INFO)
	public static final int SDK_ALARM_DEVICE_MSG_NOTIFY        = 0x3199;           // Ih18OrF=L(7"M(V*5DJB<~(6TS&=a99Le ALARM_DEVICE_MSG_NOTIFY_INFO)
	public static final int SDK_ALARM_VEHICLE_STANDING_OVER_TIME = 0x319A;         // M#353,J11(>/(6TS&=a99Le ALARM_VEHICLE_STANDING_OVER_TIME_INFO)
	public static final int SDK_ALARM_ENCLOSURE_ALARM          = 0x319B;           // 5gWSN'@8JB<~(6TS&=a99Le ALARM_ENCLOSURE_ALARM_INFO)
	public static final int SDK_ALARM_GUARD_DETECT			  = 0x319C;		   // 8ZM$<l2bJB<~,4KJB<~8ZM$SP5ZR;8vHKJ1IO1(startJB<~#,8ZM$Wn:sR;8vHK@k?*J1IO1(stop JB<~(6TS&=a99LeALARM_GUARD_DETECT_INFO)
	public static final int SDK_ALARM_GUARD_INFO_UPDATE		  = 0x319D;		   // 8ZM$PEO"8|PBJB<~#,V;R*8ZM$SPHKT13vHk>MIO1((6TS&=a99LeALARM_GUARD_UPDATE_INFO)  
	public static final int SDK_ALARM_NODE_ACTIVE              = 0x319e;           // =Z5c<$;nJB<~(6TS&=a99LeALARM_NODE_ACTIVE_INFO)
	public static final int SDK_ALARM_VIDEO_STATIC             = 0x319F;           // JSF5>2L,<l2bJB<~(6TS&=a99Le ALARM_VIDEO_STATIC_INFO)
	public static final int SDK_ALARM_REGISTER_REONLINE        = 0x31a0;           // Vw6/W"2aIh18VXPB5GB=JB<~(6TS&=a99LeALARM_REGISTER_REONLINE_INFO)
	public static final int SDK_ALARM_ISCSI_STATUS             = 0x31a1;           // ISCSI8f>/JB<~(6TS&=a99Le ALARM_ISCSI_STATUS_INFO)
	public static final int SDK_ALARM_SCADA_DEV_ALARM          = 0x31a2;           // <l2b2I</Ih181(>/JB<~(6TS&=a99Le ALARM_SCADA_DEV_INFO)
	public static final int SDK_ALARM_AUXILIARY_DEV_STATE      = 0x31a3;           // 8(VzIh18W4L,(6TS&=a99LeALARM_AUXILIARY_DEV_STATE)
	public static final int SDK_ALARM_PARKING_CARD             = 0x31a4;           // M#35K"?(JB<~(6TS&=a99LeALARM_PARKING_CARD)
	public static final int SDK_ALARM_PROFILE_ALARM_TRANSMIT   = 0x31a5;           // 1(>/4+JdJB<~(6TS&=a99LeALARM_PROFILE_ALARM_TRANSMIT_INFO)
	public static final int SDK_ALARM_VEHICLE_ACC              = 0x31a6;           // 35A>ACC1(>/JB<~(6TS&=a99Le ALARM_VEHICLE_ACC_INFO)
	public static final int SDK_ALARM_TRAFFIC_SUSPICIOUSCAR    = 0x31a7;           // OSRI35A>IO1(JB<~(6TS&=a99Le ALARM_TRAFFIC_SUSPICIOUSCAR_INFO)
	public static final int SDK_ALARM_ACCESS_LOCK_STATUS       = 0x31a8;           // CEKxW4L,JB<~(6TS&=a99Le ALARM_ACCESS_LOCK_STATUS_INFO)
	public static final int SDK_ALARM_FINACE_SCHEME            = 0x31a9;           // @m2F>-0lJB<~(6TS&=a99Le ALARM_FINACE_SCHEME_INFO)
	public static final int SDK_ALARM_HEATIMG_TEMPER           = 0x31aa;           // HH3IOq2bNB5cNB6HRl3#1(>/JB<~(6TS&=a99Le ALARM_HEATIMG_TEMPER_INFO)
	public static final int SDK_ALARM_TALKING_IGNORE_INVITE    = 0x31ab;           // Ih18H!O{6T=2GkGsJB<~(6TS&=a99LeALARM_TALKING_IGNORE_INVITE_INFO)
	public static final int SDK_ALARM_BUS_SHARP_TURN           = 0x31ac;           // 35A><1W*JB<~(6TS&=a99LeALARM_BUS_SHARP_TURN_INFO)
	public static final int SDK_ALARM_BUS_SCRAM                = 0x31ad;           // 35A><1M#JB<~(6TS&=a99LeALARM_BUS_SCRAM_INFO)
	public static final int SDK_ALARM_BUS_SHARP_ACCELERATE     = 0x31ae;           // 35A><1<SKYJB<~(6TS&=a99LeALARM_BUS_SHARP_ACCELERATE_INFO)
	public static final int SDK_ALARM_BUS_SHARP_DECELERATE     = 0x31af;           // 35A><1<uKYJB<~(6TS&=a99LeALARM_BUS_SHARP_DECELERATE_INFO)
	public static final int SDK_ALARM_ACCESS_CARD_OPERATE      = 0x31b0;		   // CE={?(J}>]2YWwJB<~(6TS&=a99LeALARM_ACCESS_CARD_OPERATE_INFO)
	public static final int SDK_ALARM_POLICE_CHECK             = 0x31b1;           // >/T1G)5=JB<~(6TS&=a99LeALARM_POLICE_CHECK_INFO)
	public static final int SDK_ALARM_NET                      = 0x31b2;           // MxBg1(>/JB<~(6TS&=a99Le ALARM_NET_INFO)
	public static final int SDK_ALARM_NEW_FILE                 = 0x31b3;           // PBND<~JB<~(6TS&=a99LeALARM_NEW_FILE_INFO)
	public static final int SDK_ALARM_FIREWARNING              = 0x31b5;           // HH3IOqWE;p5cJB<~ (6TS&=a99Le ALARM_FIREWARNING_INFO)
	public static final int SDK_ALARM_RECORD_LOSS              = 0x31b6;           // B<Oq6*J'JB<~,V8S2ELMj:C5DGi?vOB,7"IzNsI>5HT-RrR}Fp(6TS&=a99LeALARM_RECORD_LOSS_INFO)
	public static final int SDK_ALARM_VIDEO_FRAME_LOSS         = 0x31b7;           // JSF56*V!JB<~,1HHgMxBg2;:C;r1`BkD\A&2;WcR}Fp5D6*V!(6TS&=a99LeALARM_VIDEO_FRAME_LOSS_INFO)
	public static final int SDK_ALARM_RECORD_VOLUME_FAILURE    = 0x31b8;           // SI1#4fB<Oq5D4EEL>m7"IzRl3#,R}Fp5DB<OqRl3#(6TS&=a99LeALARM_RECORD_VOLUME_FAILURE_INFO)
	public static final int SDK_EVENT_SNAP_UPLOAD              = 0x31b9;           // M<IO4+Mj3IJB<~(6TS&=a99LeEVENT_SNAP_UPLOAD_INFO)
	public static final int SDK_ALARM_AUDIO_DETECT             = 0x31ba;           // RtF5<l2bJB<~(6TS&=a99Le ALARM_AUDIO_DETECT )
	public static final int SDK_ALARM_UPLOADPIC_FAILCOUNT      = 0x31bb;           // IO4+VPCKJ'0\J}>]8vJ}#(6TS&=a99LeALARM_UPLOADPIC_FAILCOUNT_INFO#)
	public static final int SDK_ALARM_POS_MANAGE               = 0x31bc;           // POS9\@mJB<~JB<~(6TS&=a99Le ALARM_POS_MANAGE_INFO )
	public static final int SDK_ALARM_REMOTE_CTRL_STATUS       = 0x31bd;           // N^O_R#?XFwW4L,JB<~(6TS&=a99Le ALARM_REMOTE_CTRL_STATUS )
	public static final int SDK_ALARM_PASSENGER_CARD_CHECK     = 0x31be;           // 7OFz, 3K?MK"?(JB<~(6TS&=a99Le ALARM_PASSENGER_CARD_CHECK )
	public static final int SDK_ALARM_SOUND                    = 0x31bf;           // IyRtJB<~(6TS&=a99Le ALARM_SOUND )
	public static final int SDK_ALARM_LOCK_BREAK               = 0x31c0;           // GKKxJB<~(6TS&=a99Le ALARM_LOCK_BREAK_INFO )
	public static final int SDK_ALARM_HUMAN_INSIDE             = 0x31c1;           // 2UDZSPHKJB<~(6TS&=a99LeALARM_HUMAN_INSIDE_INFO)
	public static final int SDK_ALARM_HUMAN_TUMBLE_INSIDE      = 0x31c2;           // 2UDZSPHKK$59JB<~(6TS&=a99LeALARM_HUMAN_TUMBLE_INSIDE_INFO)
	public static final int SDK_ALARM_DISABLE_LOCKIN           = 0x31c3;           // 1UKx=xCE04E%4%7"JB<~(6TS&ALARM_DISABLE_LOCKIN_INFO)
	public static final int SDK_ALARM_DISABLE_LOCKOUT          = 0x31c4;           // 1UKx3vCE04E%4%7"JB<~(6TS&=a99LeALARM_DISABLE_LOCKOUT_INFO)
	public static final int SDK_ALARM_UPLOAD_PIC_FAILED        = 0x31c5;           // N%UBJ}>]IO4+J'0\JB<~(6TS&=a99Le ALARM_UPLOAD_PIC_FAILED_INFO )
	public static final int SDK_ALARM_FLOW_METER               = 0x31c6;           // K.AwA?<FPEO"IO1(J1<d#(6TS&=a99Le ALARM_FLOW_METER_INFO#)
	public static final int SDK_ALARM_WIFI_SEARCH              = 0x31c7;           // ;qH!5=V\N';7>3VPWIFIIh18IO1(JB<~(6TS&=a99Le ALARM_WIFI_SEARCH_INFO)
	public static final int SDK_ALARM_WIRELESSDEV_LOWPOWER     = 0x31C8;           // ;qH!N^O_Ih185M5gA?IO1(JB<~(6TS&=a99LeALARM_WIRELESSDEV_LOWPOWER_INFO)
	public static final int SDK_ALARM_PTZ_DIAGNOSES			       = 0x31c9;		   // TFL(Uo6OJB<~(6TS&=a99LeALARM_PTZ_DIAGNOSES_INFO)
	public static final int SDK_ALARM_FLASH_LIGHT_FAULT        = 0x31ca;           // 1,IA5F(IA9b5F)1(>/JB<~ (6TS&=a99Le ALARM_FLASH_LIGHT_FAULT_INFO)
	public static final int SDK_ALARM_STROBOSCOPIC_LIGTHT_FAULT = 0x31cb;          // F5IA5F1(>/JB<~ (6TS&=a99Le ALARM_STROBOSCOPIC_LIGTHT_FAULT_INFO)
	public static final int SDK_ALARM_HUMAM_NUMBER_STATISTIC   = 0x31cc;           // HKJ}A?/?MAwA?M3<FJB<~ (6TS&=a99Le ALARM_HUMAN_NUMBER_STATISTIC_INFO)
	public static final int SDK_ALARM_VIDEOUNFOCUS             = 0x31ce;           // JSF5Pi=91(>/(6TS&=a99Le ALARM_VIDEOUNFOCUS_INFO)
	public static final int SDK_ALARM_BUF_DROP_FRAME           = 0x31cd;           // B<Oq;:3eGx6*V!JB<~(6TS&=a99Le ALARM_BUF_DROP_FRAME_INFO)
	public static final int SDK_ALARM_DOUBLE_DEV_VERSION_ABNORMAL = 0x31cf;        // K+?XIh18Vw0eSk180eV.<d0f1>PEO"2;R;VBRl3#JB<~ (6TS&=a99Le ALARM_DOUBLE_DEV_VERSION_ABNORMAL_INFO)
	public static final int SDK_ALARM_DCSSWITCH                 = 0x31d0;           // Vw18GP;;JB<~ </H:GP;;1(>/ (6TS&=a99Le ALARM_DCSSWITCH_INFO)
	public static final int SDK_ALARM_RADAR_CONNECT_STATE       = 0x31d1;           // @W4oW4L,JB<~(6TS&=a99Le ALARM_RADAR_CONNECT_STATE_INFO)
	public static final int SDK_ALARM_DEFENCE_ARMMODE_CHANGE    = 0x31d2;           // 7@Gx2<377@W4L,8D1dJB<~(6TS&=a99Le ALARM_DEFENCE_ARMMODECHANGE_INFO)
	public static final int SDK_ALARM_SUBSYSTEM_ARMMODE_CHANGE  = 0x31d3;           // WSO5M32<377@W4L,8D1dJB<~(6TS&=a99Le ALARM_SUBSYSTEM_ARMMODECHANGE_INFO)
	public static final int SDK_ALARM_RFID_INFO                 = 0x31d4;           // :lMbO_<l2bPEO"JB<~(6TS&=a99Le ALARM_RFID_INFO)
	public static final int SDK_ALARM_SMOKE_DETECTION           = 0x31d5;           // QLNm1(>/JB<~(6TS&=a99Le ALARM_SMOKE_DETECTION)
	public static final int SDK_ALARM_BETWEENRULE_TEMP_DIFF     = 0x31d6;           // HH3IOq9fTr<dNB2nRl3#1(>/(6TS&=a99Le ALARM_BETWEENRULE_DIFFTEMPER_INFO)
	public static final int SDK_ALARM_TRAFFIC_PIC_ANALYSE	      = 0x31d7;			// M<F,6~4N7VNvJB<~(6TS& ALARM_PIC_ANALYSE_INFO)
	public static final int SDK_ALARM_HOTSPOT_WARNING           = 0x31d8;           // HH3IOqHH5cRl3#1(>/(6TS&=a99Le ALARM_HOTSPOT_WARNING_INFO)
	public static final int SDK_ALARM_COLDSPOT_WARNING          = 0x31d9;           // HH3IOq@d5cRl3#1(>/(6TS&=a99Le ALARM_COLDSPOT_WARNING_INFO)
	public static final int SDK_ALARM_FIREWARNING_INFO			= 0x31da;			// HH3IOq;pGi1(>/PEO"IO1((6TS&=a99Le ALARM_FIREWARNING_INFO_DETAIL)
	public static final int SDK_ALARM_FACE_OVERHEATING  	    = 0x31db;			// HH3IOqHKLe7"IUT$>/(6TS&=a99Le ALARM_FACE_OVERHEATING_INFO)
		
	
	// JB<~@`PM
	public static final int SDK_CONFIG_RESULT_EVENT_EX         = 0x3000;           // P^8DEdVC5D75;XBk#;75;X=a99<{DEV_SET_RESULT
	public static final int SDK_REBOOT_EVENT_EX                = 0x3001;           // Ih18VXFtJB<~#;Hg9{N47"KMVXFtC|An#,51G0P^8D5DEdVC2;;aA"<4IzP'
	public static final int SDK_AUTO_TALK_START_EX             = 0x3002;           // Ih18Vw6/Q{Gk?*J<SoRt6T=2
	public static final int SDK_AUTO_TALK_STOP_EX              = 0x3003;           // Ih18Vw6/M#V9SoRt6T=2
	public static final int SDK_CONFIG_CHANGE_EX               = 0x3004;           // Ih18EdVC7"Iz8D1d
	public static final int SDK_IPSEARCH_EVENT_EX              = 0x3005;           // IPKQKwJB<~, 75;XWV7{4.8qJ=HgOB:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&&DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay &&!-
	public static final int SDK_AUTO_RECONNECT_FAILD           = 0x3006;           // WT6/VXA,J'0\JB<~
	public static final int SDK_REALPLAY_FAILD_EVENT           = 0x3007;           // <`JSJ'0\JB<~,75;X=a99LeDEV_PLAY_RESULT
	public static final int SDK_PLAYBACK_FAILD_EVENT           = 0x3008;           // ;X7EJ'0\JB<~,75;X=a99LeDEV_PLAY_RESULT   
	public static final int SDK_IVS_TRAFFIC_REALFLOWINFO       = 0x3009;           // =;M(J5J1AwA?PEO"JB<~ALARM_IVS_TRAFFIC_REALFLOW_INFO
	public static final int SDK_DEVICE_ABORT_EVENT             = 0x300a;           // ?M;'6K1;L_3v, 6TS&=a99Le DEV_CLIENT_ABORT_INFO
	public static final int SDK_TALK_FAILD_EVENT               = 0x300b;           // GkGsSoRt6T=2J'0\, 6TS&=a99Le DEV_TALK_RESULT
	
	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * SC;'C{3$6H
	 * \endif
	 */
	public static final int     SDK_NEW_USER_NAME_LENGTH	 = 128;			  
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public static final int     SDK_NEW_USER_PSW_LENGTH	 = 128;			  


	/**
	 * \if ENGLISH_LANG
	 * Signal interface name length
	 * \else
	 * PE:E=S?ZC{3F3$6H
	 * \endif
	 */
	public static final int     SDK_MATRIX_INTERFACE_LEN		= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Matrix sub card max amount
	 * \else
	 * >XUsWS?(Wn4sJ}A?
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CARDS			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * The basic value of the PIP split mode
	 * \else
	 * 7V8nD#J=;-VP;-5D;y4!V5
	 * \endif
	 */
	public static final int     SDK_SPLIT_PIP_BASE			= 1000;	  
	/**
	 * \if ENGLISH_LANG
	 * Max split matrix amount
	 * \else
	 * Wn4s7V8nD#J=J}
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_MODE_NUM		= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Matrix max input channel amount
	 * \else
	 * >XUsWn4sJdHkM(5@J}
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_IN	= 1500;	  
	/**
	 * \if ENGLISH_LANG
	 * Matrix max output channel amount
	 * \else
	 * >XUsWn4sJd3vM(5@J}
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_OUT	= 256;		  
	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * Ih18C{3F3$6H
	 * \endif
	 */
	public static final int     SDK_DEVICE_NAME_LEN			= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Max CPU amount
	 * \else
	 * Wn4sCPUJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_CPU_NUM				= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Max fan amount
	 * \else
	 * Wn4s7gIHJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_FAN_NUM				= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * Max power amount
	 * \else
	 * Wn4s5gT4J}A?
	 * \endif
	 */
	public static final int     SDK_MAX_POWER_NUM			= 16;		 
	
	/**
	 * \if ENGLISH_LANG
	 * Max battery amount
	 * \else
	 * Wn4s5g3XJ}A?
	 * \endif
	 */
	public static final int 		SDK_MAX_BATTERY_NUM		= 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Max temperature sensor amount
	 * \else
	 * Wn4sNB6H4+8PFwJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_TEMPERATURE_NUM		= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * ISCSI Name length
	 * \else
	 * ISCSIC{3F3$6H
	 * \endif
	 */
	public static final int     SDK_MAX_ISCSI_NAME_LEN		= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Version info length
	 * \else
	 * 0f1>PEO"3$6H
	 * \endif
	 */
	public static final int     SDK_VERSION_LEN				= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Storage partition max number
	 * \else
	 * 4f4"7VGxWn4sJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_STORAGE_PARTITION_NUM = 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Mount length
	 * \else
	 * 9RTX5c3$6H
	 * \endif
	 */
	public static final int     SDK_STORAGE_MOUNT_LEN		= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * File system name length
	 * \else
	 * ND<~O5M3C{3F3$6H
	 * \endif
	 */
	public static final int     SDK_STORAGE_FILE_SYSTEM_LEN	= 16;		  
	/**
	 * \if ENGLISH_LANG
	 * RAID max members
	 * \else
	 * RAID3IT1Wn4sJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_MEMBER_PER_RAID		= 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * Ih18IDWn4s3$6H
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN_EX			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Max number of block
	 * \else
	 * Wn4sGx?iJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_BLOCK_NUM			= 32;		  
	/**
	 * \if ENGLISH_LANG
	 * Max number of split window
	 * \else
	 * Wn4s7V8n40?ZJ}A?
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_WINDOW			= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Length of file type
	 * \else
	 * ND<~@`PM3$6H
	 * \endif
	 */
	public static final int     SDK_FILE_TYPE_LEN			= 64;		  
	/**
	 * \if ENGLISH_LANG
	 * Length of device ID
	 * \else
	 * Ih18IDWn4s3$6H
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN				= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Max length of device name  
	 * \else
	 * Ih18C{3FWn4s3$6H
	 * \endif
	 */
	public static final int     SDK_DEV_NAME_LEN				= 128;		  
	/**
	 * \if ENGLISH_LANG
	 * Schedule the first dimension size, means days
	 * \else
	 * J1<d1m5ZR;N,4sP!, 1mJ>LlJ}
	 * \endif
	 */
	public static final int     SDK_TSCHE_DAY_NUM			= 8;		  
	/**
	 * \if ENGLISH_LANG
	 * Schedule the second dimension size, means time
	 * \else
	 * J1<d1m5Z6~N,4sP!, 1mJ>J16NJ}
	 * \endif
	 */
	public static final int     SDK_TSCHE_SEC_NUM			= 6;		  
	/**
	 * \if ENGLISH_LANG
	 * Event report info including max card number
	 * \else
	 * JB<~IO1(PEO"0|:,Wn4s?(F,8v
	 * \endif
	 */
	public static final int SDK_EVENT_MAX_CARD_NUM   = 16;      
	/**
	 * \if ENGLISH_LANG
	 * Card name length
	 * \else
	 * ?(F,C{3F3$6H
	 * \endif
	 */
	public static final int SDK_EVENT_CARD_LEN   	= 36;      

	/**
	 * \if ENGLISH_LANG
	 * Subscription all event
	 * \else
	 * 6)TDKySPJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_ALL                       = 0x00000001 ;    
	/**
	 * \if ENGLISH_LANG
	 * Cross line event
	 * \else
	 * >/=dO_JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSLINEDETECTION        = 0x00000002 ; 	  
	/**
	 * \if ENGLISH_LANG
	 * Cross region event
	 * \else
	 * >/=dGxJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSREGIONDETECTION      = 0x00000003 ;    
	/**
	 * \if ENGLISH_LANG
	 * Past event
	 * \else
	 * LyLuJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_PASTEDETECTION            = 0x00000004 ;    
	/**
	 * \if ENGLISH_LANG
	 * Left event
	 * \else
	 * NoF7REAtJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_LEFTDETECTION             = 0x00000005 ;    
	/**
	 * \if ENGLISH_LANG
	 * Stay event
	 * \else
	 * M#AtJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_STAYDETECTION             = 0x00000006 ;    
	/**
	 * \if ENGLISH_LANG
	 * Wander event
	 * \else
	 * EG;2JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_WANDERDETECTION           = 0x00000007 ;    
	/**
	 * \if ENGLISH_LANG
	 * Reservation event
	 * \else
	 * NoF71#H+JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_PRESERVATION              = 0x00000008 ;   
	/**
	 * \if ENGLISH_LANG
	 * Move event
	 * \else
	 * RF6/JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_MOVEDETECTION             = 0x00000009 ;    
	/**
	 * \if ENGLISH_LANG
	 * Tail event
	 * \else
	 * N2KfJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TAILDETECTION             = 0x0000000A ;    
	/**
	 * \if ENGLISH_LANG
	 * Rioter event
	 * \else
	 * >[VZJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_RIOTERDETECTION           = 0x0000000B ;    
	/**
	 * \if ENGLISH_LANG
	 * Fire event
	 * \else
	 * ;p>/JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_FIREDETECTION             = 0x0000000C ;    
	/**
	 * \if ENGLISH_LANG
	 * Smoke event
	 * \else
	 * QLNm1(>/JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_SMOKEDETECTION            = 0x0000000D ;    
	/**
	 * \if ENGLISH_LANG
	 * Fight event
	 * \else
	 * 67E9JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_FIGHTDETECTION            = 0x0000000E ;    
	/**
	 * \if ENGLISH_LANG
	 * Flow stat event
	 * \else
	 * AwA?M3<FJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_FLOWSTAT                  = 0x0000000F ;    
	/**
	 * \if ENGLISH_LANG
	 * Number stat event
	 * \else
	 * J}A?M3<FJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_NUMBERSTAT                = 0x00000010 ;     
	/**
	 * \if ENGLISH_LANG
	 * Camera cover event
	 * \else
	 * IcOqM7828GJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERACOVERDDETECTION     = 0x00000011 ;     
	/**
	 * \if ENGLISH_LANG
	 * Camera move event
	 * \else
	 * IcOqM7RF6/JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERAMOVEDDETECTION      = 0x00000012 ;     
	/**
	 * \if ENGLISH_LANG
	 * Video abnormal event
	 * \else
	 * JSF5Rl3#JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOABNORMALDETECTION    = 0x00000013 ;       
	/**
	 * \if ENGLISH_LANG
	 * Video bad event
	 * \else
	 * JSF5Kp;5JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOBADDETECTION         = 0x00000014 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic control event
	 * \else
	 * =;M(9\VFJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICCONTROL            = 0x00000015 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic accident event
	 * \else
	 * =;M(JB9JJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICACCIDENT           = 0x00000016 ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic junction event
	 * \else
	 * =;M(B7?ZJB<~----@O9fTr
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJUNCTION           = 0x00000017 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic gate event
	 * \else
	 * =;M(?(?ZJB<~----@O9fTr
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICGATE               = 0x00000018 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot
	 * \else
	 * 6K=;M(W%EDJB<~
	 * \endif
	 */
	public static final int EVENT_TRAFFICSNAPSHOT               = 0x00000019 ;       
	/**
	 * \if ENGLISH_LANG
	 * Face detection
	 * \else
	 * HKA3<l2bJB<~ 
	 * \endif
	 */
	public static final int EVENT_IVS_FACEDETECT                = 0x0000001A ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Jam
	 * \else
	 * =;M(S56BJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJAM                = 0x0000001B ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic-RunRedLight
	 * \else
	 * =;M(N%UB-43:l5FJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNREDLIGHT       = 0x00000100 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overline
	 * \else
	 * =;M(N%UB-Q9355@O_JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERLINE          = 0x00000101 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Retrograde
	 * \else
	 * =;M(N%UB-DfPPJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RETROGRADE        = 0x00000102 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnLeft
	 * \else
	 * =;M(N%UB-N%UBWsW*
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNLEFT          = 0x00000103 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnRight
	 * \else
	 * =;M(N%UB-N%UBSRW*
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNRIGHT         = 0x00000104 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Uturn
	 * \else
	 * =;M(N%UB-N%UB5tM7
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UTURN             = 0x00000105 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overspeed
	 * \else
	 * =;M(N%UB-3,KY
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERSPEED         = 0x00000106 ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Underspeed
	 * \else
	 * =;M(N%UB-5MKY
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UNDERSPEED        = 0x00000107 ;      
	/**
	 * \if ENGLISH_LANG
	 * Traffic-Parking
	 * \else
	 * =;M(N%UB-N%UBM#35
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKING           = 0x00000108 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-WrongRoute
	 * \else
	 * =;M(N%UB-2;04355@PPJ;
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_WRONGROUTE        = 0x00000109 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-CrossLane
	 * \else
	 * =;M(N%UB-N%UB1d5@
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_CROSSLANE         = 0x0000010A ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-OverYellowLine
	 * \else
	 * =;M(N%UB-Q9;FO_ 
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERYELLOWLINE    = 0x0000010B ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-DrivingOnShoulder   
	 * \else
	 * =;M(N%UB-B7<gPPJ;JB<~ 
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER = 0x0000010C ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic-YellowPlateInLane
	 * \else
	 * =;M(N%UB-;FEF35U<5@JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE = 0x0000010E ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic offense-Pedestral has higher priority at the  crosswalk
	 * \else
	 * =;M(N%UB-0_BmO_PPHKSEOHJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY = 0x0000010F ;   
	/**
	 * \if ENGLISH_LANG
	 * Cross fence 
	 * \else
	 * 7-T=N'@8JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSFENCEDETECTION       = 0x0000011F ;       
	/**
	 * \if ENGLISH_LANG
	 * ElectroSpark event 
	 * \else
	 * 5g;p;(JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_ELECTROSPARKDETECTION     = 0X00000110 ;         
	/**
	 * \if ENGLISH_LANG
	 * No passing
	 * \else
	 * =;M(N%UB-={V9M(PPJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_NOPASSING         = 0x00000111 ;   
	/**
	 * \if ENGLISH_LANG
	 * Abnormal run
	 * \else
	 * Rl3#1<E\JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_ABNORMALRUNDETECTION      = 0x00000112 ;       
	/**
	 * \if ENGLISH_LANG
	 * Retrograde
	 * \else
	 * HKT1DfPPJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_RETROGRADEDETECTION       = 0x00000113 ;       
	/**
	 * \if ENGLISH_LANG
	 * In region detection
	 * \else
	 * GxSrDZ<l2bJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_INREGIONDETECTION         = 0x00000114 ;     
	/**
	 * \if ENGLISH_LANG
	 * Taking away things
	 * \else
	 * NoF70aRFJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TAKENAWAYDETECTION        = 0x00000115 ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking
	 * \else
	 * 7G7(M#35JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_PARKINGDETECTION          = 0x00000116 ;       
	/**
	 * \if ENGLISH_LANG
	 * Face recognition
	 * \else
	 * HKA3J61pJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_FACERECOGNITION           = 0x00000117 ;       
	/**
	 * \if ENGLISH_LANG
	 * Manual snap
	 * \else
	 * =;M(JV6/W%EDJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_MANUALSNAP        = 0x00000118 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic flow state
	 * \else
	 * =;M(AwA?M3<FJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_FLOWSTATE         = 0x00000119 ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic stay
	 * \else
	 * =;M(VMAtJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_STAY              = 0x0000011A ;       
	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle route
	 * \else
	 * SP35U<5@JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINROUTE    = 0x0000011B ;       
	/**
	 * \if ENGLISH_LANG
	 * Motion detect
	 * \else
	 * JSF5RF6/Ul2bJB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_MOTIONDETECT            = 0x0000011C ;   
	/**
	 * \if ENGLISH_LANG
	 * Local alarm
	 * \else
	 * Mb2?1(>/JB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_LOCALALARM              = 0x0000011D ;       
	/**
	 * \if ENGLISH_LANG
	 * Prisoner rise detect
	 * \else
	 * ?4JXKyGt78FpImJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_PRISONERRISEDETECTION     = 0X0000011E ;   
	/**
	 * \if ENGLISH_LANG
	 * Traffic tollgate
	 * \else
	 * =;M(N%UB-?(?ZJB<~----PB9fTr
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TOLLGATE          = 0X00000120 ;   
	/**
	 * \if ENGLISH_LANG
	 * Density detection of persons
	 * \else
	 * HKT1C\</6H<l2b
	 * \endif
	 */
	public static final int EVENT_IVS_DENSITYDETECTION          = 0x00000121 ;     
	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis result
	 * \else
	 * JSF5Uo6O=a9{JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEODIAGNOSIS            = 0X00000122 ;   
	/**
	 * \if ENGLISH_LANG
	 * Queue detection
	 * \else
	 * EE6S<l2b1(>/JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_QUEUEDETECTION            = 0x00000123 ;   
	/**
	 * \if ENGLISH_LANG
	 * Take up in bus route
	 * \else
	 * U<SC9+=;355@JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE = 0x00000124 ;   
	/**
	 * \if ENGLISH_LANG
	 * Illegal astern 
	 * \else
	 * N%UB5935JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_BACKING           = 0x00000125 ;       
	/**
	 * \if ENGLISH_LANG
	 * Audio abnormity
	 * \else
	 * IyRtRl3#<l2b
	 * \endif
	 */
	public static final int EVENT_IVS_AUDIO_ABNORMALDETECTION   = 0x00000126 ;       
	/**
	 * \if ENGLISH_LANG
	 * Run yellow light
	 * \else
	 * =;M(N%UB-43;F5FJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT    = 0x00000127 ;   
	/**
	 * \if ENGLISH_LANG
	 * Climb detection 
	 * \else
	 * EJ8_<l2bJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_CLIMBDETECTION            = 0x00000128 ;       
	/**
	 * \if ENGLISH_LANG
	 * Leave detection
	 * \else
	 * @k8Z<l2bJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_LEAVEDETECTION            = 0x00000129 ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking on yellow box
	 * \else
	 * ;FMx8qO_W%EDJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX = 0x0000012A ;   
	/**
	 * \if ENGLISH_LANG
	 * Parking space parking
	 * \else
	 * 35N;SP35JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING = 0x0000012B ;       
	/**
	 * \if ENGLISH_LANG
	 * Parking space no parking
	 * \else
	 * 35N;N^35JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING = 0x0000012C ;        
	/**
	 * \if ENGLISH_LANG
	 * Passerby
	 * \else
	 * =;M(PPHKJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAIN        = 0x0000012D ;       
	/**
	 * \if ENGLISH_LANG
	 * Throw
	 * \else
	 * =;M(EWHwNoF7JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_THROW             = 0x0000012E ;   
	/**
	 * \if ENGLISH_LANG
	 * Idle
	 * \else
	 * =;M(?UOPJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_IDLE              = 0x0000012F ;       
	/**
	 * \if ENGLISH_LANG
	 * Mobile ACC outage alarm event
	 * \else
	 * 35TXACC6O5g1(>/JB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLEACC              = 0x00000130 ;   
	/**
	 * \if ENGLISH_LANG
	 * Vehicle side turn alarm event
	 * \else
	 * 35A>2`7-1(>/JB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_TURNOVER        = 0x00000131 ;   
	/**
	 * \if ENGLISH_LANG
	 * Vehicle collision alarm event
	 * \else
	 * 35A>W2351(>/JB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_COLLISION       = 0x00000132 ;   
	/**
	 * \if ENGLISH_LANG
	 * Mobile camera rotate event
	 * \else
	 * 35TXIcOqM74s=G6HE$W*JB<~
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_LARGE_ANGLE     = 0x00000133 ;   
	/**
	 * \if ENGLISH_LANG
	 * Spot cross line event
	 * \else
	 * 35N;Q9O_JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEOVERLINE = 0x00000134 ;       
	/**
	 * \if ENGLISH_LANG
	 * Multi scene switch event
	 * \else
	 * 6`3!>0GP;;JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_MULTISCENESWITCH          = 0x00000135 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Plate limit event
	 * \else
	 * J\O^35EFJB<~
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RESTRICTED_PLATE   =  0X00000136 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Cross stop line event
	 * \else
	 * Q9M#V9O_JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_OVERSTOPLINE          = 0x00000137 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic unfasten seat belt event 
	 * \else
	 * =;M(N4O502H+4xJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_WITHOUT_SAFEBELT      = 0x00000138 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Driver smoking event 
	 * \else
	 * <]J;T13iQLJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_SMOKING        = 0x00000139 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Driver call event 
	 * \else
	 * <]J;T14r5g;0JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_CALLING        = 0x0000013A ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Object feature detection event 
	 * \else
	 * NoLeLXUw<l2bJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_OBJECT_DETECTION              = 0x00000141 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Analog alarm channel event(corresponding to DEV_EVENT_ALARM_ANALOGALRM_INFO)
	 * \else
	 * D#DbA?1(>/M(5@5D1(>/JB<~(6TS&DEV_EVENT_ALARM_ANALOGALRM_INFO)
	 * \endif
	 */
	public static final int EVENT_ALARM_ANALOGALARM               =  0x00000150 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Warning lineexpansion event
	 * \else
	 * >/=dO_@)U9JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_CROSSLINEDETECTION_EX			= 0x00000151 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Record
	 * \else
	 * FUM(B<Oq
	 * \endif
	 */
	public static final int  EVENT_ALARM_COMMON                      = 0x00000152 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Video tampering event
	 * \else
	 * JSF5UZ52JB<~
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOBLIND                  = 0x00000153 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss event
	 * \else
	 * JSF56*J'JB<~
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOLOSS                   = 0x00000154 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of getting out bed detection
	 * \else
	 * ?4JXKyOB42JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_GETOUTBEDDETECTION			= 0x00000155 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of patrol detection
	 * \else
	 * Q2B_<l2bJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_PATROLDETECTION			    = 0x00000156 ; 
	
	/**
	 * \if ENGLISH_LANG
	 * Event of on duty detection
	 * \else
	 * U>8Z<l2bJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_ONDUTYDETECTION			    = 0x00000157 ;
	
	/**
	 * \if ENGLISH_LANG
	 *  Event of VTO do not answer calling request
	 * \else
	 * CE?Z;z:t=PN4OlS&JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_NOANSWERCALL			        = 0x00000158 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage do not exist
	 * \else
	 * 4f4"Wi2;4fTZJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGENOTEXIST              = 0x00000159 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage space low
	 * \else
	 * S2EL?U<d5M1(>/JB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGELOWSPACE              = 0x0000015A ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of storage failure
	 * \else
	 * 4f4"4mNsJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGEFAILURE               = 0x0000015B ;
	
	/**
	 * \if ENGLISH_LANG
	 *  Event of profile alarm transmit
	 * \else
	 * 1(>/4+JdJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_PROFILEALARMTRANSMIT         = 0x0000015C ;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of picture info for alarm
	 * \else
	 * M<F,PEO"JB<~
	 * \endif
	 */
	public static final int EVENT_IVS_PICINFO                       = 0x00000161 ;
	
	/**
	 * \if ENGLISH_LANG
	 * All event start with [TRAFFIC]
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \else
	 * KySPRTtraffic?*M75DJB<~#,D?G0V85DJG
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_ALL                   = 0x000001FF ; 
	
	/**
	 * \if ENGLISH_LANG
	 * All IVS events 
	 * \else
	 * KySPVGD\7VNvJB<~
	 * \endif
	 */
	public static final int  EVENT_IVS_VIDEOANALYSE                  = 0x00000200 ;  
	
	public static final int DECODER_OUT_SLOTS_MAX_NUM            = 16;
	public static final int DECODER_IN_SLOTS_MAX_NUM             = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * No error 
	 * \else
	 * C;SP4mNs
	 * \endif
	 */
	public static final int NET_NOERROR= 0;			  
	/**
	 * \if ENGLISH_LANG
	 * Unknown error
	 * \else
	 * N4V*4mNs
	 * \endif
	 */
	public static final int NET_ERROR= -1;			  
	/**
	 * \if ENGLISH_LANG
	 * Windows system error
	 * \else
	 * WindowsO5M33v4m
	 * \endif
	 */
	public static final int NET_SYSTEM_ERROR= (0x80000000|1);		  
	/**
	 * \if ENGLISH_LANG
	 * Protocol error it may result from network timeout
	 * \else
	 * MxBg4mNs#,?ID\JGRrN*MxBg3,J1
	 * \endif
	 */
	public static final int NET_NETWORK_ERROR= (0x80000000|2);		  
	/**
	 * \if ENGLISH_LANG
	 * Device protocol does not match 
	 * \else
	 * Ih18P-Ri2;F%Ed
	 * \endif
	 */
	public static final int NET_DEV_VER_NOMATCH= (0x80000000|3);		  
	/**
	 * \if ENGLISH_LANG
	 * Handle is invalid
	 * \else
	 * >d1zN^P'
	 * \endif
	 */
	public static final int NET_INVALID_HANDLE= (0x80000000|4);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to open channel 
	 * \else
	 * 4r?*M(5@J'0\
	 * \endif
	 */
	public static final int NET_OPEN_CHANNEL_ERROR= (0x80000000|5);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to close channel
	 * \else
	 * 9X1UM(5@J'0\
	 * \endif
	 */
	public static final int NET_CLOSE_CHANNEL_ERROR= (0x80000000|6);		  
	/**
	 * \if ENGLISH_LANG
	 * User parameter is illegal 
	 * \else
	 * SC;'2NJ}2;:O7(
	 * \endif
	 */
	public static final int NET_ILLEGAL_PARAM= (0x80000000|7);		  
	/**
	 * \if ENGLISH_LANG
	 * SDK initialization error
	 * \else
	 * SDK3uJ<;/3v4m
	 * \endif
	 */
	public static final int NET_SDK_INIT_ERROR= (0x80000000|8);		  
	/**
	 * \if ENGLISH_LANG
	 * SDK clear error
	 * \else
	 * SDKGe@m3v4m
	 * \endif
	 */
	public static final int NET_SDK_UNINIT_ERROR= (0x80000000|9);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when apply for render resources.
	 * \else
	 * IjGkrenderWJT43v4m
	 * \endif
	 */
	public static final int NET_RENDER_OPEN_ERROR= (0x80000000|10);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the decoder library 
	 * \else
	 * 4r?*=bBk?b3v4m
	 * \endif
	 */
	public static final int NET_DEC_OPEN_ERROR= (0x80000000|11);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when closing the decoder library
	 * \else
	 * 9X1U=bBk?b3v4m
	 * \endif
	 */
	public static final int NET_DEC_CLOSE_ERROR= (0x80000000|12);		  
	/**
	 * \if ENGLISH_LANG
	 * The detected channel number is 0 in multiple-channel preview. 
	 * \else
	 * 6`;-CfT$@@VP<l2b5=M(5@J}N*0
	 * \endif
	 */
	public static final int NET_MULTIPLAY_NOCHANNEL= (0x80000000|13);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to initialize record library 
	 * \else
	 * B<Rt?b3uJ<;/J'0\
	 * \endif
	 */
	public static final int NET_TALK_INIT_ERROR= (0x80000000|14);		  
	/**
	 * \if ENGLISH_LANG
	 * The record library has not been initialized
	 * \else
	 * B<Rt?bN4>-3uJ<;/
	 * \endif
	 */
	public static final int NET_TALK_NOT_INIT= (0x80000000|15);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when sending out audio data 
	 * \else
	 * 7"KMRtF5J}>]3v4m
	 * \endif
	 */
	public static final int	NET_TALK_SENDDATA_ERROR= (0x80000000|16);		  
	/**
	 * \if ENGLISH_LANG
	 * The real-time has been protected.
	 * \else
	 * J5J1J}>]RQ>-4&SZ1#4fW4L,
	 * \endif
	 */
	public static final int NET_REAL_ALREADY_SAVING= (0x80000000|17);		  
	/**
	 * \if ENGLISH_LANG
	 * The real-time data has not been save.
	 * \else
	 * N41#4fJ5J1J}>]
	 * \endif
	 */
	public static final int NET_NOT_SAVING= (0x80000000|18);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the file.
	 * \else
	 * 4r?*ND<~3v4m
	 * \endif
	 */
	public static final int NET_OPEN_FILE_ERROR= (0x80000000|19);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to enable PTZ to control timer.
	 * \else
	 * Ft6/TFL(?XVF6(J1FwJ'0\
	 * \endif
	 */
	public static final int NET_PTZ_SET_TIMER_ERROR= (0x80000000|20);		  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when verify returned data.
	 * \else
	 * 6T75;XJ}>]5DP#Qi3v4m
	 * \endif
	 */
	public static final int NET_RETURN_DATA_ERROR= (0x80000000|21);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no sufficient buffer.
	 * \else
	 * C;SPWc9;5D;:4f
	 * \endif
	 */
	public static final int NET_INSUFFICIENT_BUFFER= (0x80000000|22);		  
	/**
	 * \if ENGLISH_LANG
	 * The current SDK does not support this fucntion.
	 * \else
	 * 51G0SDKN4V'3V8C9&D\
	 * \endif
	 */
	public static final int NET_NOT_SUPPORTED= (0x80000000|23);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * 2iQ/2;5=B<Os
	 * \endif
	 */
	public static final int NET_NO_RECORD_FOUND= (0x80000000|24);		  
	/**
	 * \if ENGLISH_LANG
	 * You have no operation right.
	 * \else
	 * N^2YWwH(O^
	 * \endif
	 */
	public static final int NET_NOT_AUTHORIZED= (0x80000000|25);		  
	/**
	 * \if ENGLISH_LANG
	 * Can not operate right now. 
	 * \else
	 * T]J1N^7(V4PP
	 * \endif
	 */
	public static final int NET_NOT_NOW= (0x80000000|26);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no audio talk channel.
	 * \else
	 * N47"OV6T=2M(5@
	 * \endif
	 */
	public static final int NET_NO_TALK_CHANNEL= (0x80000000|27);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no audio.
	 * \else
	 * N47"OVRtF5
	 * \endif
	 */
	public static final int NET_NO_AUDIO= (0x80000000|28);		  
	/**
	 * \if ENGLISH_LANG
	 * The network SDK has not been initialized.
	 * \else
	 * MxBgSDKN4>-3uJ<;/
	 * \endif
	 */
	public static final int NET_NO_INIT= (0x80000000|29);		  
	/**
	 * \if ENGLISH_LANG
	 * The download completed.
	 * \else
	 * OBTXRQ=aJx
	 * \endif
	 */
	public static final int NET_DOWNLOAD_END= (0x80000000|30);		  
	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * 2iQ/=a9{N*?U
	 * \endif
	 */
	public static final int NET_EMPTY_LIST= (0x80000000|31);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get system property setup.
	 * \else
	 * ;qH!O5M3JtPTEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSATTR= (0x80000000|32);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SN.
	 * \else
	 * ;qH!PrAP:EJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SERIAL= (0x80000000|33);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get general property.
	 * \else
	 * ;qH!3#9fJtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GENERAL= (0x80000000|34);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get DSP capacity description.
	 * \else
	 * ;qH!DSPD\A&ChJvJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DSPCAP= (0x80000000|35);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get network channel setup.
	 * \else
	 * ;qH!MxBgEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_NETCFG= (0x80000000|36);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get channel name.
	 * \else
	 * ;qH!M(5@C{3FJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CHANNAME= (0x80000000|37);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video property.
	 * \else
	 * ;qH!JSF5JtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO= (0x80000000|38);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get record setup
	 * \else
	 * ;qH!B<OsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORD= (0x80000000|39);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder protocol name 
	 * \else
	 * ;qH!=bBkFwP-RiC{3FJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PRONAME= (0x80000000|40);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM function name.
	 * \else
	 * ;qH!2324.?Z9&D\C{3FJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_FUNCNAME= (0x80000000|41);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder property
	 * \else
	 * ;qH!=bBkFwJtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_485DECODER= (0x80000000|42);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM setup
	 * \else
	 * ;qH!2324.?ZEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_232COM= (0x80000000|43);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get external alarm input setup
	 * \else
	 * ;qH!Mb2?1(>/JdHkEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMIN= (0x80000000|44);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get motion detection alarm
	 * \else
	 * ;qH!6/L,<l2b1(>/J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMDET= (0x80000000|45);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get device time
	 * \else
	 * ;qH!Ih18J1<dJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSTIME= (0x80000000|46);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get preview parameter
	 * \else
	 * ;qH!T$@@2NJ}J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PREVIEW= (0x80000000|47);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio maintenance setup
	 * \else
	 * ;qH!WT6/N,;$EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_AUTOMT= (0x80000000|48);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video matrix setup
	 * \else
	 * ;qH!JSF5>XUsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOMTRX= (0x80000000|49);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get privacy mask zone setup
	 * \else
	 * ;qH!GxSrUZ52EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_COVER= (0x80000000|50);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video watermark setup
	 * \else
	 * ;qH!M<OsK.S!EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WATERMAKE= (0x80000000|51);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify general property
	 * \else
	 * P^8D3#9fJtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GENERAL= (0x80000000|55);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel setup
	 * \else
	 * P^8DMxBgEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_NETCFG= (0x80000000|56);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel name
	 * \else
	 * P^8DM(5@C{3FJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CHANNAME= (0x80000000|57);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video channel 
	 * \else
	 * P^8DJSF5JtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO= (0x80000000|58);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify record setup 
	 * \else
	 * 6KP^8DB<OsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORD= (0x80000000|59);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify decoder property 
	 * \else
	 * P^8D=bBkFwJtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_485DECODER= (0x80000000|60);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify 232 COM setup 
	 * \else
	 * P^8D2324.?ZEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_232COM= (0x80000000|61);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify external input alarm setup
	 * \else
	 * P^8DMb2?JdHk1(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMIN= (0x80000000|62);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify motion detection alarm setup 
	 * \else
	 * P^8D6/L,<l2b1(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMDET= (0x80000000|63);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify device time 
	 * \else
	 * P^8DIh18J1<dJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SYSTIME= (0x80000000|64);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify preview parameter
	 * \else
	 * P^8DT$@@2NJ}J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_PREVIEW= (0x80000000|65);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify auto maintenance setup 
	 * \else
	 * P^8DWT6/N,;$EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_AUTOMT= (0x80000000|66);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video matrix setup 
	 * \else
	 * P^8DJSF5>XUsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOMTRX= (0x80000000|67);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify privacy mask zone
	 * \else
	 * P^8DGxSrUZ52EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_COVER= (0x80000000|68);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video watermark setu
	 * \else
	 * P^8DM<OsK.S!EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WATERMAKE= (0x80000000|69);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify wireless network information
	 * \else
	 * P^8DN^O_MxBgPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLAN= (0x80000000|70);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to select wireless network device
	 * \else
	 * Q!TqN^O_MxBgIh18J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLANDEV= (0x80000000|71);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify the actively registration parameter setup.
	 * \else
	 * P^8DVw6/W"2a2NJ}EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_REGISTER= (0x80000000|72);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify camera property
	 * \else
	 * P^8DIcOqM7JtPTEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CAMERA= (0x80000000|73);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify IR alarm setup
	 * \else
	 * P^8D:lMb1(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_INFRARED= (0x80000000|74);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify audio alarm setup
	 * \else
	 * P^8DRtF51(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SOUNDALARM= (0x80000000|75);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to modify storage position setup
	 * \else
	 * P^8D4f4"N;VCEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_STORAGE= (0x80000000|76);		  
	/**
	 * \if ENGLISH_LANG
	 * The audio encode port has not been successfully initialized.
	 * \else
	 * RtF51`Bk=S?ZC;SP3I9&3uJ<;/
	 * \endif
	 */
	public static final int NET_AUDIOENCODE_NOTINIT= (0x80000000|77);		  
	/**
	 * \if ENGLISH_LANG
	 * The data are too long.
	 * \else
	 *  J}>]9}3$
	 * \endif
	 */
	public static final int NET_DATA_TOOLONGH= (0x80000000|78);		 
	/**
	 * \if ENGLISH_LANG
	 * The device does not support current operation. 
	 * \else
	 * Ih182;V'3V8C2YWw
	 * \endif
	 */
	public static final int NET_UNSUPPORTED= (0x80000000|79);		  
	/**
	 * \if ENGLISH_LANG
	 * Device resources is not sufficient.
	 * \else
	 * Ih18WJT42;Wc
	 * \endif
	 */
	public static final int NET_DEVICE_BUSY= (0x80000000|80);		  
	/**
	 * \if ENGLISH_LANG
	 * The server has boot up 
	 * \else
	 * 7~NqFwRQ>-Ft6/
	 * \endif
	 */
	public static final int NET_SERVER_STARTED= (0x80000000|81);		  
	/**
	 * \if ENGLISH_LANG
	 * The server has not fully boot up 
	 * \else
	 * 7~NqFwIPN43I9&Ft6/
	 * \endif
	 */
	public static final int NET_SERVER_STOPPED= (0x80000000|82);		  
	/**
	 * \if ENGLISH_LANG
	 * Input serial number is not correct.
	 * \else
	 * JdHkPrAP:ESPNs
	 * \endif
	 */
	public static final int NET_LISTER_INCORRECT_SERIAL= (0x80000000|83);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get HDD information.
	 * \else
	 * ;qH!S2ELPEO"J'0\
	 * \endif
	 */
	public static final int NET_QUERY_DISKINFO_FAILED= (0x80000000|84);		  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get connect session information.
	 * \else
	 * ;qH!A,=SSessionPEO"
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SESSION= (0x80000000|85);		  
	/**
	 * \if ENGLISH_LANG
	 * The password you typed is incorrect. You have exceeded the maximum number of retries.
	 * \else
	 * JdHkC\Bk4mNs3,9}O^VF4NJ}
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD_TRYTIME= (0x80000000|86);		  
	/**
	 * \if ENGLISH_LANG
	 * Password is not correct
	 * \else
	 * C\Bk2;U}H7
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PASSWORD= (0x80000000|100);	  
	/**
	 * \if ENGLISH_LANG
	 * The account does not exist
	 * \else
	 * UJ;'2;4fTZ
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_USER= (0x80000000|101);	  
	/**
	 * \if ENGLISH_LANG
	 * Time out for log in returned value.
	 * \else
	 * 5H4}5GB<75;X3,J1
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_TIMEOUT= (0x80000000|102);	  
	/**
	 * \if ENGLISH_LANG
	 * The account has logged in 
	 * \else
	 * UJ:ERQ5GB<
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_RELOGGIN= (0x80000000|103);	  
	/**
	 * \if ENGLISH_LANG
	 * The account has been locked
	 * \else
	 *UJ:ERQ1;Kx6(
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_LOCKED= (0x80000000|104);	  
	/**
	 * \if ENGLISH_LANG
	 * The account bas been in the black list
	 * \else
	 * UJ:ERQ1;APN*:ZC{5%
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BLACKLIST= (0x80000000|105);	  
	/**
	 * \if ENGLISH_LANG
	 * Resources are not sufficient. System is busy now.
	 * \else
	 * WJT42;Wc#,O5M3C&
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BUSY= (0x80000000|106);	  
	/**
	 * \if ENGLISH_LANG
	 * Time out. Please check network and try again.
	 * \else
	 * 5GB<Ih183,J1#,Gk<l2iMxBg2"VXJT
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_CONNECT= (0x80000000|107);	  
	/**
	 * \if ENGLISH_LANG
	 * Network connection failed.
	 * \else
	 * MxBgA,=SJ'0\
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NETWORK= (0x80000000|108);	  
	/**
	 * \if ENGLISH_LANG
	 * Successfully logged in the device but can not create video channel. Please check network connection.
	 * \else
	 * 5GB<Ih183I9&#,5+N^7(44=(JSF5M(5@#,Gk<l2iMxBgW4?v
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_SUBCONNECT= (0x80000000|109);	  
	/**
	 * \if ENGLISH_LANG
	 * Exceed the max connect number
	 * \else
	 * 3,9}Wn4sA,=SJ}
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_MAXCONNECT= (0x80000000|110);      
	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 support
	 * \else
	 * V;V'3V34zP-Ri
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PROTOCOL3_ONLY= (0x80000000|111);	  
	/**
	 * \if ENGLISH_LANG
	 * There is no USB or USB info error
	 * \else
	 * N42eHkU6\;rU6\PEO"4mNs
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_UKEY_LOST= (0x80000000|112);	  
	/**
	 * \if ENGLISH_LANG
	 * Client-end IP address has no right to login
	 * \else
	 * ?M;'6KIP5XV7C;SP5GB<H(O^  
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NO_AUTHORIZED= (0x80000000|113);    
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library open audio.
	 * \else
	 * Render?b4r?*RtF53v4m
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_ON_ERROR= (0x80000000|120);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library close audio 
	 * \else
	 * Render?b9X1URtF53v4m
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_OFF_ERROR= (0x80000000|121);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library control volume
	 * \else
	 * 6KRender?b?XVFRtA?3v4m
	 * \endif
	 */
	public static final int NET_RENDER_SET_VOLUME_ERROR= (0x80000000|122);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set video parameter
	 * \else
	 * Render?bIhVC;-Cf2NJ}3v4m
	 * \endif
	 */
	public static final int NET_RENDER_ADJUST_ERROR= (0x80000000|123);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library pause play
	 * \else
	 * Render?bT]M#2%7E3v4m
	 * \endif
	 */
	public static final int NET_RENDER_PAUSE_ERROR= (0x80000000|124);	  
	/**
	 * \if ENGLISH_LANG
	 * Render library snapshot error
	 * \else
	 * Render?bW%M<3v4m
	 * \endif
	 */
	public static final int NET_RENDER_SNAP_ERROR= (0x80000000|125);	  
	/**
	 * \if ENGLISH_LANG
	 * Render library stepper error
	 * \else
	 * Render?b2==x3v4m
	 * \endif
	 */
	public static final int NET_RENDER_STEP_ERROR= (0x80000000|126);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set frame rate.
	 * \else
	 * Render?bIhVCV!BJ3v4m
	 * \endif
	 */
	public static final int NET_RENDER_FRAMERATE_ERROR= (0x80000000|127);	  
	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render lib setting show region
	 * \else
	 * Render?bIhVCOTJ>GxSr3v4m
	 * \endif
	 */
	public static final int NET_RENDER_DISPLAYREGION_ERROR= (0x80000000|128);  
	/**
	 * \if ENGLISH_LANG
	 * Group name has been existed.
	 * \else
	 * WiC{RQ4fTZ
	 * \endif
	 */
	public static final int NET_GROUP_EXIST= (0x80000000|140);	  
	/**
	 * \if ENGLISH_LANG
	 * The group name does not exist. 
	 * \else
	 * WiC{2;4fTZ
	 * \endif
	 */
	public static final int	NET_GROUP_NOEXIST= (0x80000000|141);	  
	/**
	 * \if ENGLISH_LANG
	 * The group right exceeds the right list!
	 * \else
	 * Wi5DH(O^3,3vH(O^AP1m76N'
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTOVER= (0x80000000|142);	  
	/**
	 * \if ENGLISH_LANG
	 * The group can not be removed since there is user in it!
	 * \else
	 * WiOBSPSC;'#,2;D\I>3}
	 * \endif
	 */
	public static final int NET_GROUP_HAVEUSER= (0x80000000|143);	  
	/**
	 * \if ENGLISH_LANG
	 * The user has used one of the group right. It can not be removed. 
	 * \else
	 * Wi5DD38vH(O^1;SC;'J9SC#,2;D\3v3}
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTUSE= (0x80000000|144);	  
	/**
	 * \if ENGLISH_LANG
	 * New group name has been existed
	 * \else
	 * PBWiC{M,RQSPWiC{VX84
	 * \endif
	 */
	public static final int NET_GROUP_SAMENAME= (0x80000000|145);	  
	/**
	 * \if ENGLISH_LANG
	 * The user name has been existed
	 * \else
	 * SC;'RQ4fTZ
	 * \endif
	 */
	public static final int	NET_USER_EXIST= (0x80000000|146);	  
	/**
	 * \if ENGLISH_LANG
	 * The account does not exist.
	 * \else
	 * SC;'2;4fTZ
	 * \endif
	 */
	public static final int NET_USER_NOEXIST= (0x80000000|147);	  
	/**
	 * \if ENGLISH_LANG
	 * User right exceeds the group right. 
	 * \else
	 * SC;'H(O^3,3vWiH(O^
	 * \endif
	 */
	public static final int NET_USER_RIGHTOVER= (0x80000000|148);	  
	/**
	 * \if ENGLISH_LANG
	 * Reserved account. It does not allow to be modified.
	 * \else
	 * 1#AtUJ:E#,2;H]PmP^8DC\Bk
	 * \endif
	 */
	public static final int NET_USER_PWD= (0x80000000|149);	  
	/**
	 * \if ENGLISH_LANG
	 * password is not correct
	 * \else
	 * C\Bk2;U}H7
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD= (0x80000000|150);	  
	/**
	 * \if ENGLISH_LANG
	 * Password is invalid
	 * \else
	 * C\Bk2;F%Ed
	 * \endif
	 */
	public static final int NET_USER_NOMATCHING= (0x80000000|151);	  
	/**
	 * \if ENGLISH_LANG
	 * Account in use
	 * \else
	 *  UK:EU}TZJ9SCVP
	 * \endif
	 */
	public static final int NET_USER_INUSE= (0x80000000|152);	 
	/**
	 * \if ENGLISH_LANG
	 * Failed to get network card setup.
	 * \else
	 * ;qH!Mx?(EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ETHERNET= (0x80000000|300);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network information.
	 * \else
	 * ;qH!N^O_MxBgPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLAN= (0x80000000|301);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network device.
	 * \else
	 * ;qH!N^O_MxBgIh18J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLANDEV= (0x80000000|302);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get actively registration parameter.
	 * \else
	 * ;qH!Vw6/W"2a2NJ}J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_REGISTER= (0x80000000|303);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get camera property 
	 * \else
	 * ;qH!IcOqM7JtPTJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CAMERA= (0x80000000|304);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get IR alarm setup
	 * \else
	 * ;qH!:lMb1(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_INFRARED= (0x80000000|305);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio alarm setup
	 * \else
	 * ;qH!RtF51(>/EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SOUNDALARM= (0x80000000|306);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get storage position 
	 * \else
	 * ;qH!4f4"N;VCEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_STORAGE= (0x80000000|307);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get mail setup.
	 * \else
	 * ;qH!SJ<~EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MAIL= (0x80000000|308);	  
	/**
	 * \if ENGLISH_LANG
	 * Can not set right now. 
	 * \else
	 * T]J1N^7(IhVC
	 * \endif
	 */
	public static final int NET_CONFIG_DEVBUSY= (0x80000000|309);	  
	/**
	 * \if ENGLISH_LANG
	 * The configuration setup data are illegal.
	 * \else
	 * EdVCJ}>]2;:O7(
	 * \endif
	 */
	public static final int NET_CONFIG_DATAILLEGAL= (0x80000000|310);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get DST setup
	 * \else
	 * ;qH!ODAnJ1EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DST= (0x80000000|311);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set DST 
	 * \else
	 * IhVCODAnJ1EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DST= (0x80000000|312);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get video osd setup.
	 * \else
	 * ;qH!JSF5OSD5~<SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO_OSD= (0x80000000|313);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set video osd 
	 * \else
	 * IhVCJSF5OSD5~<SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO_OSD= (0x80000000|314);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get CDMA \ GPRS configuration
	 * \else
	 * ;qH!CDMA!"GPRSMxBgEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GPRSCDMA= (0x80000000|315);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set CDMA \ GPRS configuration
	 * \else
	 * IhVCCDMA!"GPRSMxBgEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GPRSCDMA= (0x80000000|316);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get IP Filter configuration
	 * \else
	 * ;qH!IP9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPFILTER= (0x80000000|317);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set IP Filter configuration
	 * \else
	 * IhVCIP9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPFILTER= (0x80000000|318);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get Talk Encode configuration
	 * \else
	 * ;qH!SoRt6T=21`BkEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TALKENCODE= (0x80000000|319);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set Talk Encode configuration
	 * \else
	 * IhVCSoRt6T=21`BkEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TALKENCODE= (0x80000000|320);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get The length of the video package configuration
	 * \else
	 * ;qH!B<Oq4r0|3$6HEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORDLEN= (0x80000000|321);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set The length of the video package configuration
	 * \else
	 * IhVCB<Oq4r0|3$6HEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORDLEN= (0x80000000|322);      
	/**
	 * \if ENGLISH_LANG
	 * Not support Network hard disk partitionr
	 * \else
	 * 2;V'3VMxBgS2EL7VGx
	 * \endif
	 */
	public static final int	NET_DONT_SUPPORT_SUBAREA= (0x80000000|323);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the register server information
	 * \else
	 * ;qH!Ih18IOVw6/W"2a7~NqFwPEO"J'0\
	 * \endif
	 */
	public static final int	NET_ERROR_GET_AUTOREGSERVER= (0x80000000|324);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to control actively registration
	 * \else
	 * Vw6/W"2aVX6(OrW"2a4mNs
	 * \endif
	 */
	public static final int	NET_ERROR_CONTROL_AUTOREGISTER= (0x80000000|325);	
	/**
	 * \if ENGLISH_LANG
	 * Failed to disconnect actively registration
	 * \else
	 * 6O?*Vw6/W"2a7~NqFw4mNs
	 * \endif
	 */
	public static final int	NET_ERROR_DISCONNECT_AUTOREGISTER= (0x80000000|326);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get mms configuration
	 * \else
	 * ;qH!mmsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MMS= (0x80000000|327);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set mms configuration
	 * \else
	 * IhVCmmsEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MMS= (0x80000000|328);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SMS configuration
	 * \else
	 * ;qH!6LPE<$;nN^O_A,=SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SMSACTIVATION= (0x80000000|329);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set SMS configuration
	 * \else
	 * IhVC6LPE<$;nN^O_A,=SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SMSACTIVATION= (0x80000000|330);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get activation of a wireless connection
	 * \else
	 * ;qH!2&:E<$;nN^O_A,=SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DIALINACTIVATION= (0x80000000|331);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set activation of a wireless connection
	 * \else
	 * IhVC2&:E<$;nN^O_A,=SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DIALINACTIVATION= (0x80000000|332);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the parameter of video output
	 * \else
	 * 2iQ/JSF5Jd3v2NJ}EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOOUT= (0x80000000|333);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to set the configuration of video output
	 * \else
	 * IhVCJSF5Jd3v2NJ}EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOOUT= (0x80000000|334);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get osd overlay enabling
	 * \else
	 * ;qH!osd5~<SJ9D\EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_OSDENABLE= (0x80000000|335);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set OSD overlay enabling
	 * \else
	 * IhVCosd5~<SJ9D\EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_OSDENABLE= (0x80000000|336);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set digital input configuration of front encoders
	 * \else
	 * IhVCJ}WVM(5@G06K1`Bk=SHkEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ENCODERINFO= (0x80000000|337);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get TV adjust configuration
	 * \else
	 * ;qH!TV5w=ZEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TVADJUST= (0x80000000|338);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set TV adjust configuration
	 * \else
	 * IhVCTV5w=ZEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TVADJUST= (0x80000000|339);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to request to establish a connection
	 * \else
	 * GkGs=(A"A,=SJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_CONNECT_FAILED= (0x80000000|340);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to request to upload burn files
	 * \else
	 * GkGs?LB<ND<~IO4+J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_BURNFILE= (0x80000000|341);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get capture configuration information
	 * \else
	 * ;qH!W%0|EdVCPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_GETCFG= (0x80000000|342);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set capture configuration information
	 * \else
	 * IhVCW%0|EdVCPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_SETCFG= (0x80000000|343);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get download restrictions information
	 * \else
	 * 2iQ/OBTXO^VFPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_GETCFG= (0x80000000|344);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set download restrictions information
	 * \else
	 * IhVCOBTXO^VFPEO"J'0\
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_SETCFG= (0x80000000|345);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to query serial port parameters
	 * \else
	 * 2iQ/4.?Z2NJ}J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SEARCH_TRANSCOM= (0x80000000|346);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get the preset info
	 * \else
	 * ;qH!T$VF5cPEO"4mNs
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_POINT= (0x80000000|347);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set the preset info
	 * \else
	 * IhVCT$VF5cPEO"4mNs
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_POINT= (0x80000000|348);	  
	/**
	 * \if ENGLISH_LANG
	 * SDK log out the device abnormally
	 * \else
	 * SDKC;SPU}3#5G3vIh18
	 * \endif
	 */
	public static final int NET_SDK_LOGOUT_ERROR= (0x80000000|349);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get vehicle configuration
	 * \else
	 * ;qH!35TXEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_VEHICLE_CFG= (0x80000000|350);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set vehicle configuration
	 * \else
	 * IhVC35TXEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_VEHICLE_CFG= (0x80000000|351);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay configuration
	 * \else
	 * ;qH!atm5~<SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_CFG= (0x80000000|352);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set ATM overlay configuration
	 * \else
	 * IhVCatm5~<SEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_ATM_OVERLAY_CFG= (0x80000000|353);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay ability
	 * \else
	 * ;qH!atm5~<SD\A&J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_ABILITY= (0x80000000|354);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder tour configuration
	 * \else
	 * ;qH!=bBkFw=bBkBVQ2EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODER_TOUR_CFG= (0x80000000|355);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set decoder tour configuration
	 * \else
	 * IhVC=bBkFw=bBkBVQ2EdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODER_TOUR_CFG= (0x80000000|356);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to control decoder tour
	 * \else
	 * ?XVF=bBkFw=bBkBVQ2J'0\
	 * \endif
	 */
	public static final int NET_ERROR_CTRL_DECODER_TOUR= (0x80000000|357);	  
	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of user groups
	 * \else
	 * 3,3vIh18V'3VWn4sSC;'WiJ}D?
	 * \endif
	 */
	public static final int NET_GROUP_OVERSUPPORTNUM= (0x80000000|358);	  
	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of users 
	 * \else
	 * 3,3vIh18V'3VWn4sSC;'J}D?
	 * \endif
	 */
	public static final int NET_USER_OVERSUPPORTNUM= (0x80000000|359);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP configuration
	 * \else
	 * ;qH!SIPEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_CFG= (0x80000000|368);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set SIP configuration
	 * \else
	 * IhVCSIPEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_SIP_CFG= (0x80000000|369);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP capability
	 * \else
	 * ;qH!SIPD\A&J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_ABILITY= (0x80000000|370);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get "WIFI ap' configuration 
	 * \else
	 * ;qH!WIFI apEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_WIFI_AP_CFG= (0x80000000|371);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set "WIFI ap" configuration  
	 * \else
	 * IhVCWIFI apEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_WIFI_AP_CFG= (0x80000000|372);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get decode policy 
	 * \else
	 * ;qH!=bBk2_BTEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODE_POLICY= (0x80000000|373);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set decode policy 
	 * \else
	 * IhVC=bBk2_BTEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODE_POLICY= (0x80000000|374);	  
	/**
	 * \if ENGLISH_LANG
	 * Refuse talk
	 * \else
	 * >\>x6T=2
	 * \endif
	 */
	public static final int NET_ERROR_TALK_REJECT= (0x80000000|375);	  
	/**
	 * \if ENGLISH_LANG
	 * Talk has opened by other client
	 * \else
	 * 6T=21;FdK{?M;'6K4r?*
	 * \endif
	 */
	public static final int NET_ERROR_TALK_OPENED= (0x80000000|376);	  
	/**
	 * \if ENGLISH_LANG
	 * Resource conflict
	 * \else
	 * WJT43eM;
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RESOURCE_CONFLICIT= (0x80000000|377);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupported encode type
	 * \else
	 * 2;V'3V5DSoRt1`Bk8qJ=
	 * \endif
	 */
	public static final int NET_ERROR_TALK_UNSUPPORTED_ENCODE= (0x80000000|378);	  
	/**
	 * \if ENGLISH_LANG
	 * No right
	 * \else
	 * N^H(O^
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RIGHTLESS= (0x80000000|379);	  
	/**
	 * \if ENGLISH_LANG
	 * Request failed
	 * \else
	 * GkGs6T=2J'0\
	 * \endif
	 */
	public static final int NET_ERROR_TALK_FAILED= (0x80000000|380);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to get device relative config
	 * \else
	 * ;qH!;zFwO`9XEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_MACHINE_CFG= (0x80000000|381);	  
	/**
	 * \if ENGLISH_LANG
	 * Failed to set device relative config
	 * \else
	 * IhVC;zFwO`9XEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SET_MACHINE_CFG= (0x80000000|382);	  
	/**
	 * \if ENGLISH_LANG
	 * Get data failed
	 * \else
	 * Ih18N^7(;qH!51G0GkGsJ}>]
	 * \endif
	 */
	public static final int NET_ERROR_GET_DATA_FAILED= (0x80000000|383);	  
	/**
	 * \if ENGLISH_LANG
	 * MAC validate failed
	 * \else
	 * MAC5XV7QiV$J'0\ 
	 * \endif
	 */
	public static final int NET_ERROR_MAC_VALIDATE_FAILED= (0x80000000|384);      
	/**
	 * \if ENGLISH_LANG
	 * Failed to get server instance 
	 * \else
	 * ;qH!7~NqFwJ5@}J'0\
	 * \endif
	 */
	public static final int NET_ERROR_GET_INSTANCE= (0x80000000|385);      
	/**
	 * \if ENGLISH_LANG
	 * Generated json string is error
	 * \else
	 * Iz3I5DjasonWV7{4.4mNs
	 * \endif
	 */
	public static final int NET_ERROR_JSON_REQUEST= (0x80000000|386);      
	/**
	 * \if ENGLISH_LANG
	 * The responding json string is error
	 * \else
	 * OlS&5DjasonWV7{4.4mNs
	 * \endif
	 */
	public static final int NET_ERROR_JSON_RESPONSE= (0x80000000|387);      
	/**
	 * \if ENGLISH_LANG
	 * The protocol version is lower than current version
	 * \else
	 * P-Ri0f1>5MSZ51G0J9SC5D0f1>
	 * \endif
	 */
	public static final int NET_ERROR_VERSION_HIGHER= (0x80000000|388);      
	/**
	 * \if ENGLISH_LANG
	 * Hotspare disk operation failed. The capacity is low
	 * \else
	 * HH182YWwJ'0\, H]A?2;Wc
	 * \endif
	 */
	public static final int NET_SPARE_NO_CAPACITY= (0x80000000|389);	  
	/**
	 * \if ENGLISH_LANG
	 * Display source is used by other output
	 * \else
	 * OTJ>T41;FdK{Jd3vU<SC
	 * \endif
	 */
	public static final int NET_ERROR_SOURCE_IN_USE= (0x80000000|390);	  
	/**
	 * \if ENGLISH_LANG
	 * Advanced users grab low-level user resource
	 * \else
	 * 8_<6SC;'G@U<5M<6SC;'WJT4
	 * \endif
	 */
	public static final int NET_ERROR_REAVE= (0x80000000|391);      
	/**
	 * \if ENGLISH_LANG
	 * Net forbid
	 * \else
	 * ={V9HkMx 
	 * \endif
	 */
	public static final int NET_ERROR_NETFORBID= (0x80000000|392);      
	/**
	 * \if ENGLISH_LANG
	 * Get MAC filter configuration error
	 * \else
	 * ;qH!MAC9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MACFILTER= (0x80000000|393);      
	/**
	 * \if ENGLISH_LANG
	 * Set MAC filter configuration error
	 * \else
	 * IhVCMAC9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MACFILTER= (0x80000000|394);      
	/**
	 * \if ENGLISH_LANG
	 * Get IP/MAC filter configuration error
	 * \else
	 *  ;qH!IP/MAC9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPMACFILTER= (0x80000000|395);     
	/**
	 * \if ENGLISH_LANG
	 * Set IP/MAC filter configuration error
	 * \else
	 * IhVCIP/MAC9}BKEdVCJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPMACFILTER= (0x80000000|396);      
	/**
	 * \if ENGLISH_LANG
	 * Operation over time 
	 * \else
	 * 51G02YWw3,J1 
	 * \endif
	 */
	public static final int NET_ERROR_OPERATION_OVERTIME= (0x80000000|397);      
	/**
	 * \if ENGLISH_LANG
	 * Senior validation failure
	 * \else
	 * 8_<6P#QiJ'0\ 
	 * \endif
	 */
	public static final int NET_ERROR_SENIOR_VALIDATE_FAILED= (0x80000000|398);      
	/**
	 * \if ENGLISH_LANG
	 * Device ID is not exist
	 * \else
	 * Ih18ID2;4fTZ
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_ID_NOT_EXIST= (0x80000000|399);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupport operation
	 * \else
	 * 2;V'3V51G02YWw
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED= (0x80000000|400);      
	/**
	 * \if ENGLISH_LANG
	 * Proxy dll load error
	 * \else
	 * 4z@m?b<STXJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_DLLLOAD= (0x80000000|401);	  
	/**
	 * \if ENGLISH_LANG
	 * Proxy user parameter is not legal
	 * \else
	 * 4z@mSC;'2NJ}2;:O7(
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_ILLEGAL_PARAM= (0x80000000|402);	  
	/**
	 * \if ENGLISH_LANG
	 * Handle invalid
	 * \else
	 * 4z@m>d1zN^P'
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_INVALID_HANDLE= (0x80000000|403);	  
	/**
	 * \if ENGLISH_LANG
	 * Login device error
	 * \else
	 * 4z@m5GHkG06KIh18J'0\
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_LOGIN_DEVICE_ERROR= (0x80000000|404);	  
	/**
	 * \if ENGLISH_LANG
	 * Start proxy server error
	 * \else
	 * Ft6/4z@m7~NqJ'0\
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_START_SERVER_ERROR= (0x80000000|405);	  
	/**
	 * \if ENGLISH_LANG
	 * Request speak failed
	 * \else
	 * GkGs:0;0J'0\
	 * \endif
	 */
	public static final int NET_ERROR_SPEAK_FAILED= (0x80000000|406);	  
	/**
	 * \if ENGLISH_LANG
	 * Unsupport F6
	 * \else
	 * Ih182;V'3V4KF6=S?Z5wSC
	 * \endif
	 */
	public static final int NET_ERROR_NOT_SUPPORT_F6= (0x80000000|407);      
	/**
	 * \if ENGLISH_LANG
	 * Disk not ready
	 * \else
	 * 9bELN4>MPw
	 * \endif
	 */
	public static final int NET_ERROR_CD_UNREADY= (0x80000000|408);	  
	/**
	 * \if ENGLISH_LANG
	 * Directory inexists
	 * \else
	 * D?B<2;4fTZ
	 * \endif
	 */
	public static final int NET_ERROR_DIR_NOT_EXIST= (0x80000000|409);	  
	/**
	 * \if ENGLISH_LANG
	 * Device does not support split mode
	 * \else
	 * Ih182;V'3V5D7V8nD#J=
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED_SPLIT_MODE= (0x80000000|410);	  
	/**
	 * \if ENGLISH_LANG
	 * Open window parameter invalid
	 * \else
	 * ?*402NJ}2;:O7(
	 * \endif
	 */
	public static final int NET_ERROR_OPEN_WND_PARAM= (0x80000000|411);	  
	/**
	 * \if ENGLISH_LANG
	 * Open window quantity over limit
	 * \else
	 * ?*40J}A?3,9}O^VF
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_WND_COUNT= (0x80000000|412);	  
	/**
	 * \if ENGLISH_LANG
	 * Request command and current mode not matched
	 * \else
	 * GkGsC|AnSk51G0D#J=2;F%Ed
	 * \endif
	 */
	public static final int NET_ERROR_UNMATCHED_REQUEST= (0x80000000|413);
	
	/**
	 * \if ENGLISH_LANG
	 * Render base enable HD image internal adjustment strategy error
	 * \else
	 * Render?bFtSC8_GeM<OqDZ2?5wU{2_BT3v4m
	 * \endif
	 */
	public static final int NET_RENDER_ENABLELARGEPICADJUSTMENT_ERROR = (0x80000000|414);
	
	/**
	 * \if ENGLISH_LANG
	 * Device fasiled to upgrade
	 * \else
	 * Ih18I}<6J'0\
	 * \endif
	 */
	public static final int NET_ERROR_UPGRADE_FAILED                = (0x80000000|415);
	
	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * UR2;5=D?1jIh18
	 * \endif
	 */
	public static final int NET_ERROR_NO_TARGET_DEVICE              = (0x80000000|416);
	
	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * UR2;5=D?1jIh18
	 * \endif
	 */
	public static final int NET_ERROR_NO_VERIFY_DEVICE              = (0x80000000|417);
	
	/**
	 * \if ENGLISH_LANG
	 * No cascading right
	 * \else
	 * N^<6A*H(O^
	 * \endif
	 */
	public static final int NET_ERROR_CASCADE_RIGHTLESS             = (0x80000000|418);
	
	/**
	 * \if ENGLISH_LANG
	 * Low priority
	 * \else
	 * 5MSEOH<6
	 * \endif
	 */
	public static final int NET_ERROR_LOW_PRIORITY                  = (0x80000000|419);
	
	/**
	 * \if ENGLISH_LANG
	 * Remote device request time out
	 * \else
	 * T63LIh18GkGs3,J1
	 * \endif
	 */
	public static final int NET_ERROR_REMOTE_REQUEST_TIMEOUT        = (0x80000000|420);
	
	/**
	 * \if ENGLISH_LANG
	 * Input source over max channel limit
	 * \else
	 * JdHkT43,3vWn4sB7J}O^VF
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_INPUT_SOURCE          = (0x80000000|421);
	
	/**
	 * \if ENGLISH_LANG
	 * Failed to access folder
	 * \else
	 * 7CNJND<~J'0\
	 * \endif
	 */
	public static final int NET_ERROR_VISITE_FILE                   = (0x80000000|510);
	
	/**
	 * \if ENGLISH_LANG
	 * Device is busy
	 * \else
	 * Ih18C&
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_STATUS_BUSY            = (0x80000000|511);
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * P^8DC\BkN^H(O^
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_AUTHORIZED             = (0x80000000|512);
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * C\BkG?6H2;9;
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_STRONG                 = (0x80000000|513);
	
	/**
	 * \if ENGLISH_LANG
	 * the number of tour combination
	 * \else
	 * BVQ2Wi:O8vJ}
	 * \endif
	 */
	public static final int  DEC_COMBIN_NUM 	= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * length of name 
	 * \else
	 * C{3F3$6H
	 * \endif
	 */
	public static final int  NAME_MAX_LEN  = 16;
	

	public static final int MAX_ALARM_DECODER_NUM = 16;
	
	public static final int SDK_MAX_RAID_NUM = 16;
	
	public static final int SDK_MAX_USER_DEFINE_INFO	= 1024;
	
	public static final int ALARM_MAX_NAME = 64;
	
	// defined in c++ configsdk.h
	public static final int  MAX_CHANNEL_COUNT=16;
	/**
	 * \if ENGLISH_LANG
	 * Max channel number 256
	 * \else
	 * Wn4sM(5@J}256
	 * \endif
	 */
	public static final int  MAX_VIDEO_CHANNEL_NUM=256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max channel name length
	 * \else
	 * Wn4sM(5@C{3F3$6H
	 * \endif
	 */
	public static final int  MAX_CHANNELNAME_LEN=64;					  
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream quantity
	 * \else
	 * Wn4sBkAw8vJ}
	 * \endif
	 */
	public static final int  MAX_VIDEOSTREAM_NUM=3;					  
	/**
	 * \if ENGLISH_LANG
	 * Max masked area quantity
	 * \else
	 * Wn4sUZ52GxSr8vJ}
	 * \endif
	 */
	public static final int  MAX_VIDEO_COVER_NUM=16;					  
	/**
	 * \if ENGLISH_LANG
	 * Day in a week
	 * \else
	 * R;V\5DLlJ}
	 * \endif
	 */
	public static final int  WEEK_DAY_NUM=7;					  
	/**
	 * \if ENGLISH_LANG
	 * Record period quantity
	 * \else
	 * B<OqJ1<d6N8vJ}
	 * \endif
	 */
	public static final int  MAX_REC_TSECT=6;					  
	/**
	 * \if ENGLISH_LANG
	 * Record time extension quantity
	 * \else
	 * B<OqJ1<d6N@)U98vJ}
	 * \endif
	 */
	public static final int  MAX_REC_TSECT_EX= 10;					  
	/**
	 * \if ENGLISH_LANG
	 * Number watermark data max langth
	 * \else
	 * J}WVK.S!J}>]Wn4s3$6H
	 * \endif
	 */
	public static final int  MAX_WATERMARK_LEN= 4096;				  
	/**
	 * \if ENGLISH_LANG
	 * Motion detect rows
	 * \else
	 * 6/L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public static final int  MAX_MOTION_ROW= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Motion detect columns
	 * \else
	 * 6/L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public static final int  MAX_MOTION_COL= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max supported resolution quantity
	 * \else
	 * Wn4sV'3V5D7V1fBJ8vJ}
	 * \endif
	 */
	public static final int  MAX_IMAGESIZE_NUM= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max supported frame quantity
	 * \else
	 * Wn4sV'3V5DV!BJ8vJ}
	 * \endif
	 */
	public static final int  MAX_FPS_NUM= 1024;				  
	/**
	 * \if ENGLISH_LANG
	 * Max supported quality quantity
	 * \else
	 * Wn4sV'3V5D;-VJ8vJ}
	 * \endif
	 */
	public static final int  MAX_QUALITY_NUM= 32;		
	
	public static final int  MAX_QUALITY_REGION_NUM = 8;
	/**
	 * \if ENGLISH_LANG
	 * Max address length
	 * \else
	 * Wn4s5D5XV73$6H
	 * \endif
	 */
	public static final int  MAX_ADDRESS_LEN= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Max username length
	 * \else
	 * Wn4sSC;'C{3$6H
	 * \endif
	 */
	public static final int  MAX_USERNAME_LEN= 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Max password length
	 * \else
	 * Wn4sC\Bk3$6H
	 * \endif
	 */
	public static final int  MAX_PASSWORD_LEN= 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Folder name string length
	 * \else
	 * ND<~<PC{WVWV7{4.3$6H
	 * \endif
	 */
	public static final int  MAX_DIRECTORY_LEN= 256;					  
	/**
	 * \if ENGLISH_LANG
	 * Net storage period quantity
	 * \else
	 * MxBg4f4"J1<d6N8vJ}
	 * \endif
	 */
	public static final int  MAX_NAS_TIME_SECTION= 2;					  
	/**
	 * \if ENGLISH_LANG
	 * General name string length
	 * \else
	 * M(SCC{WVWV7{4.3$6H
	 * \endif
	 */
	public static final int  MAX_NAME_LEN= 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list limit
	 * \else
	 * =bBkFwP-RiAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_DECPRO_LIST_SIZE= 100;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported scene type limit
	 * \else
	 * JSF57VNvIh18V'3V5D3!>0@`PMAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_SCENE_LIST_SIZE= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object type list limit
	 * \else
	 * JSF57VNvIh18V'3V5D<l2bNoLe@`PMAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_OBJECT_LIST_SIZE= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule list quantity limit
	 * \else
	 * JSF57VNvIh18V'3V5D9fTrAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_RULE_LIST_SIZE= 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max detection module number
	 * \else
	 * JSF57VNvIh18Wn4s<l2bD#?i8vJ}
	 * \endif
	 */
	public static final int  MAX_ANALYSE_MODULE_NUM= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max rule number
	 * \else
	 *  JSF57VNvIh18Wn4s9fTr8vJ}
	 * \endif
	 */
	public static final int  MAX_ANALYSE_RULE_NUM= 32;					 
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top limit
	 * \else
	 * JSF57VNvIh18GxSr6%5c8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device broken line top limit
	 * \else
	 * JSF57VNvIh18U[O_6%5c8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_POLYLINE_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle size quantity limit
	 * \else
	 * JSF57VNvIh1835A>4sP!8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_VEHICLE_SIZE_LIST= 4;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle type quantity limit
	 * \else
	 * JSF57VNvIh1835A>@`PM8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_VEHICLE_TYPE_LIST= 4;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device plate type quantity limit
	 * \else
	 * JSF57VNvIh1835EF@`PM8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_PLATE_TYPE_LIST= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding lane limit
	 * \else
	 * JSF57VNvIh18C?8vM(5@6TS&355@J}IOO^
	 * \endif
	 */
	public static final int  MAX_LANE_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding rule limit
	 * \else
	 * JSF57VNvIh18C?8vM(5@6TS&5D1j3_J}IOO^
	 * \endif
	 */
	public static final int  MAX_STAFF_NUM= 20;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device mark area limit
	 * \else
	 * JSF57VNvIh181j6(GxSr5DIOO^
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_NUM= 20;					  
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis detection area need to exclude area quantity limit
	 * \else
	 * VGD\7VNv<l2bGxSrVPPhR*EE3}5DGxSr8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_EXCLUDEREGION_NUM= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis calibration frame limit
	 * \else
	 *  VGD\7VNvP#W<?r8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_CALIBRATEBOX_NUM= 10;                   
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis special detection area limit
	 * \else
	 * VGD\7VNvLXJb<l2bGxSrIOO^
	 * \endif
	 */
	public static final int  MAX_SPECIALDETECT_NUM= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported face recognition type list limit
	 * \else
	 * JSF57VNvIh18V'3V5DHKA3<l2b@`PMAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_HUMANFACE_LIST_SIZE= 8;					  
	/**
	 * \if ENGLISH_LANG
	 * Server type limit
	 * \else
	 * 7~Nq@`PMIOO^
	 * \endif
	 */
	public static final int  MAX_SEVER_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Server name string size
	 * \else
	 * 7~NqC{3FWV7{4.4sP!
	 * \endif
	 */
	public static final int  MAX_SERVER_NAME_LEN= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Power quantity limit
	 * \else
	 * 5gT48vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_POWER_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Fan quantity limit
	 * \else
	 * 7gIH8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_FUN_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * cpu quantity limit
	 * \else
	 * cpu8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_CPU_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * HDD limit
	 * \else
	 * S2ELIOO^
	 * \endif
	 */
	public static final int  MAX_HARDDISK_NUM= 32;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage cabinet limit
	 * \else
	 * Wn4s4f4"9qIOO^
	 * \endif
	 */
	public static final int  MAX_TANK_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max channel limit
	 * \else
	 * Wn4sM(5@J}IOO^
	 * \endif
	 */
	public static final int  MAX_CHAN_NUM= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Max disk array limit
	 * \else
	 * Wn4s4EELUsAPIOO^
	 * \endif
	 */
	public static final int  MAX_RAID_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max device limit
	 * \else
	 * Wn4sIh18IOO^
	 * \endif
	 */
	public static final int  MAX_DEV_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage pool limit
	 * \else
	 * Wn4s4f4"3XIOO^
	 * \endif
	 */
	public static final int  MAX_STORAGEPOOL_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Max storage position limit
	 * \else
	 * Wn4s4f4"N;VCIOO^
	 * \endif
	 */
	public static final int  MAX_STRORAGEPOS_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Front device limit
	 * \else
	 * G06KIh18IOO^
	 * \endif
	 */
	public static final int	 MAX_VIDEODEV_NUM= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Max remote device name length
	 * \else
	 * Wn4sT63LIh18C{WV3$6H
	 * \endif
	 */
	public static final int  MAX_REMOTEDEVICENAME_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max remote device quantity
	 * \else
	 * Wn4sT63LIh18J}A?
	 * \endif
	 */
	public static final int	 MAX_REMOTE_DEV_NUM= 64;                   
	/**
	 * \if ENGLISH_LANG
	 * Plate string suggested quantity limit
	 * \else
	 * 35EFWV7{05J>8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_PLATEHINT_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light quantity limit
	 * \else
	 * =;M(5F8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_LIGHT_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light group limit
	 * \else
	 * =;M(5FWi8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_LIGHTGROUP_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light type limit
	 * \else
	 * =;M(5F@`PMIOO^
	 * \endif
	 */
	public static final int  MAX_LIGHT_TYPE= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic light direction limit
	 * \else
	 * =;M(5FV8J>7=OrJ}IOO^
	 * \endif
	 */
	public static final int  MAX_LIGHT_DIRECTION= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Traffic intersection rule trigger mode limit
	 * \else
	 * =;M(B7?Z9fTr4%7"D#J=IOO^
	 * \endif
	 */
	public static final int  MAX_TRIGGERMODE_NUM= 32;                    
	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * VGD\=;M(N%UB4zBk3$6HIOO^
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector config limit
	 * \else
	 * VGD\=;M(35<lFwEdVCIOO^
	 * \endif
	 */
	public static final int  MAX_DETECTOR= 6;                     
	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector coil config limit
	 * \else
	 * VGD\=;M(35<lFwO_H&EdVCIOO^
	 * \endif
	 */
	public static final int  MAX_COILCONFIG= 3;                     
	/**
	 * \if ENGLISH_LANG
	 * TrafficSnapshot ITC device address
	 * \else
	 * TrafficSnapshotVGD\=;M(Ih185XV7
	 * \endif
	 */
	public static final int  MAX_DEVICE_ADDRESS= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * DepartmentITC device organization
	 * \else
	 * DepartmentVGD\=;M(Ih18KyJt5%N;
	 * \endif
	 */
	public static final int  MAX_DEPARTMENT= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * Road no. has 32 characters of number and letter. 
	 * \else
	 * 5@B71`:E	SI328vJ}WV:MWVD8993I
	 * \endif
	 */
	public static final int  MAX_ROADWAYNO= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * VGD\=;M(N%UB4zBk3$6HIOO^
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE_DESCRIPT= 64;              
	/**
	 * \if ENGLISH_LANG
	 * Direction string length
	 * \else
	 *  PPJ;7=OrWV7{4.3$6H
	 * \endif
	 */
	public static final int  MAX_DRIVINGDIRECTION= 256;            
	/**
	 * \if ENGLISH_LANG
	 * Max alive user info
	 * \else
	 * Wn4s;n6/SC;'PEO"J}
	 * \endif
	 */
	public static final int  MAX_ACTIVEUSER_NUM= 64;              
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top quantity limit
	 * \else
	 * JSF57VNvIh18GxSr6%5c8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM10=10;				  
	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis type quantity limit
	 * \else
	 * JSF5Uo6O@`PM8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_VIDEODIAGNOSIS_DETECT_TYPE= 11;          
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule type list quantity limit
	 * \else
	 * JSF57VNvIh18V'3V5D9fTr5D6/Ww@`PMAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_ACTION_LIST_SIZE=16;					  
	/**
	 * \if ENGLISH_LANG
	 * Storage group buffer limit
	 * \else
	 * 4f4"WiC{3F;:3eGxIOO^
	 * \endif
	 */
	public static final int  MAX_STORAGEGROUPNAME_LEN= 32;                   
	/**
	 * \if ENGLISH_LANG
	 * Mark area type limit
	 * \else
	 * 1j6(GxSr@`PMIOO^
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_TYPE_NUM= 4;                  
	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * P-RiC{3F3$6H
	 * \endif
	 */
	public static final int  MAX_PROTOCOL_NAME_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max serial quantity
	 * \else
	 * Wn4s4.?ZJ}A?
	 * \endif
	 */
	public static final int	 MAX_COMM_NUM= 16;					  
	/**
	 * \if ENGLISH_LANG
	 * DNS max quantity
	 * \else
	 * DNSWn4sJ}A?
	 * \endif
	 */
	public static final int  MAX_DNS_SERVER_NUM= 2;					  
	/**
	 * \if ENGLISH_LANG
	 * Max network quantity
	 * \else
	 * Wn4sMx?(J}A?
	 * \endif
	 */
	public static final int  MAX_NETWORK_INTERFACE_NUM= 32;				  
	/**
	 * \if ENGLISH_LANG
	 * NVS max quantity
	 * \else
	 * MxBg4f4"7~NqFwWn4sJ}A?
	 * \endif
	 */
	public static final int	 MAX_NAS_NUM= 16;				
	/**
	 * \if ENGLISH_LANG
	 * Record storage mapping max quantity
	 * \else
	 * B<Oq4f4"5cS3IdWn4sJ}A?
	 * \endif
	 */
	public static final int  MAX_STORAGEPOINT_NUM= 32;                
	/**
	 * \if ENGLISH_LANG
	 * Intelligent tracking scene max quantity
	 * \else
	 * VGD\8zWY3!>0Wn4sJ}A?
	 * \endif
	 */
	public static final int  MAX_TRACKSCENE_NUM= 10;                
	/**
	 * \if ENGLISH_LANG
	 * Traffic device status max quantity
	 * \else
	 * =;M(Ih18W4L,Wn4s8vJ}
	 * \endif
	 */
	public static final int  MAX_STATUS_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Server supported max services
	 * \else
	 * 7~NqFwV'3V5DWn4s7~NqJ}
	 * \endif
	 */
	public static final int  MAX_SERVICE_NUM= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * Database keyword max value
	 * \else
	 * J}>]?b9X<|WVWn4sV5
	 * \endif
	 */
	public static final int  MAX_DBKEY_NUM= 64;                    
	/**
	 * \if ENGLISH_LANG
	 * Overlay to JPEG summary info max length
	 * \else
	 * 5~<S5=JPEGM<F,5DU*R*PEO"Wn4s3$6H
	 * \endif
	 */
	public static final int  MAX_SUMMARY_LEN= 1024;                  
	/**
	 * \if ENGLISH_LANG
	 * Motion detection supported video window value
	 * \else
	 * 6/<lV'3V5DJSF540?ZV5
	 * \endif
	 */
	public static final int  MAX_MOTION_WINDOW= 10;                    
	/**
	 * \if ENGLISH_LANG
	 * osd overlay content max length
	 * \else
	 * osd5~<SDZH]Wn4s3$6H
	 * \endif
	 */
	public static final int  MAX_OSD_SUMMARY_LEN= 256;                   
	/**
	 * \if ENGLISH_LANG
	 * osd overlay title max length
	 * \else
	 * osd5~<S1jLbWn4s3$6H
	 * \endif
	 */
	public static final int  MAX_OSD_TITLE_LEN= 128;                   
	/**
	 * \if ENGLISH_LANG
	 * Custom judicial case max quantity
	 * \else
	 * WT6(ReK>7(08<~Wn4s8vJ}
	 * \endif
	 */
	public static final int  MAX_CUSTOMCASE_NUM= 16;                    
	/**
	 * \if ENGLISH_LANG
	 * Master/slave tracking max global config number
	 * \else
	 * Vw4SJ=8zWYFwWn4sH+>VEdVCJ}
	 * \endif
	 */
	public static final int  MAX_GLOBAL_MSTERSLAVE_NUM= 64;               
	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object property type list quantity limit
	 * \else
	 * JSF57VNvIh18V'3V5D<l2bNoLeJtPT@`PMAP1m8vJ}IOO^
	 * \endif
	 */
	public static final int  MAX_OBJECT_ATTRIBUTES_SIZE= 16;				  
	/**
	 * \if ENGLISH_LANG
	 * Device model length
	 * \else
	 * Ih18PM:E3$6H
	 * \endif
	 */
	public static final int  MAX_MODEL_LEN= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max writing device quantity
	 * \else
	 * Wn4s?LB<Ih188vJ}
	 * \endif
	 */
	public static final int  MAX_BURNING_DEV_NUM= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Max net type quantity
	 * \else
	 * Wn4sMxBg@`PM8vJ}
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_NUM= 8;                     
	/**
	 * \if ENGLISH_LANG
	 * Net type string length 
	 * \else
	 * MxBg@`PMWV7{4.3$6H
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_LEN = 64;                    
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * ;zFwC{3F
	 * \endif
	 */
	public static final int  MAX_DEVICE_NAME_LEN = 64;					  
	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * Ih18IDWn4s3$6H
	 * \endif
	 */
	public static final int  MAX_DEV_ID_LEN_EX = 128;					  
	/**
	 * \if ENGLISH_LANG
	 * Month in a year
	 * \else
	 * R;DjVPTB7]J}
	 * \endif
	 */
	public static final int  MONTH_OF_YEAR = 12;					  
	/**
	 * \if ENGLISH_LANG
	 * Server max quantity
	 * \else
	 * 7~NqFwWn4s8vJ}
	 * \endif
	 */
	public static final int  MAX_SERVER_NUM = 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Auto registration config max quantity 
	 * \else
	 * Vw6/W"2aEdVCWn4s8vJ}
	 * \endif
	 */
	public static final int  MAX_REGISTER_NUM = 10;                    
	/**
	 * \if ENGLISH_LANG
	 * Single channel max speed change config quantity
	 * \else
	 * 5%M(5@Wn4s1dKYEdVC8vJ}
	 * \endif
	 */
	public static final int  MAX_VIDEO_IN_ZOOM = 32;                    
	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config scene max quantity
	 * \else
	 * JSF57VNvH+>VEdVC3!>0Wn4sJ}A?
	 * \endif
	 */
	public static final int	 MAX_ANALYSE_SCENE_NUM = 32;					  
	/**
	 * \if ENGLISH_LANG
	 * Each PTZ max config quantity
	 * \else
	 * C?8vTFL(5DWn4sEdVCJ}
	 * \endif
	 */
	public static final int	 MAX_CONFIG_NUM	= 32;					  
	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * M(SCWV7{4.3$6H16
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_16 = 16;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * M(SCWV7{4.3$6H32
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_32 = 32;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * M(SCWV7{4.3$6H64
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_64 = 64;                    
	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * M(SCWV7{4.3$6H128
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_128 = 128;                   
	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * M(SCWV7{4.3$6H256
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_256 = 256;                   
	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * M(SCWV7{4.3$6H512
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_512 = 512;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name length
	 * \else
	 * M(5@C{3F3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Channel_Name_Len = 64;		
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name length
	 * \else
	 * 5gJSG=C{3F3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Name_Len = 64;	
	
	/**
	 * \if ENGLISH_LANG
	 * A week day
	 * \else
	 * R;V\LlJ}
	 * \endif
	 */
	public static final int  AV_CFG_Weekday_Num	= 7;			  
	/**
	 * \if ENGLISH_LANG
	 * Period quantity
	 * \else
	 * J1<d6NJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_TimeSection = 6;			  
	/**
	 * \if ENGLISH_LANG
	 * Device ID length
	 * \else
	 * Ih18ID3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Device_ID_Len = 64;			
	/**
	 * \if ENGLISH_LANG
	 * ip length
	 * \else
	 * ip3$6H
	 * \endif
	 */
	public static final int  AV_CFG_IP_Address_Len = 32;
	
	public static final int  AV_CFG_IP_Address_Len_EX = 40;
	
	/**
	 * \if ENGLISH_LANG
	 * Username length
	 * \else
	 * SC;'C{3$6H
	 * \endif
	 */
	public static final int  AV_CFG_User_Name_Len = 64;			
	/**
	 * \if ENGLISH_LANG
	 * Password length
	 * \else
	 * C\Bk3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Password_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * P-RiC{3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Protocol_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * SN length
	 * \else
	 * PrAP:E3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Serial_Len= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Device type length
	 * \else
	 * Ih18@`PM3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Device_Class_Len= 16;			 
	/**
	 * \if ENGLISH_LANG
	 * Device detailed model length
	 * \else
	 * Ih18>_LePM:E3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Device_Type_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * ;zFwC{3F
	 * \endif
	 */
	public static final int  AV_CFG_Device_Name_Len= 128;			 
	/**
	 * \if ENGLISH_LANG
	 * Device deploy location
	 * \else
	 * ;zFw2?Jp5X5c
	 * \endif
	 */
	public static final int  AV_CFG_Address_Len= 128;			 
	/**
	 * \if ENGLISH_LANG
	 * Group name length
	 * \else
	 * 7VGxC{3F
	 * \endif
	 */
	public static final int  AV_CFG_Group_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Path length
	 * \else
	 * B7>63$6H
	 * \endif
	 */
	public static final int  AV_CFG_Max_Path= 260;			
	/**
	 * \if ENGLISH_LANG
	 * Max split window quantity
	 * \else
	 * Wn4s7V8n40?ZJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Window= 128;			
	/**
	 * \if ENGLISH_LANG
	 * Each output channel max tour image favorite quantity
	 * \else
	 * C?8vJd3vM(5@5DWn4sBVQ5;-CfJU2XJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_In_Channel= 64;			 
	/**
	 * \if ENGLISH_LANG
	 * Image favorite name length
	 * \else
	 * ;-CfJU2XC{3F3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Image favorite max window quantity
	 * \else
	 * ;-CfJU2X5DWn4s40?ZJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Monitor_Favorite_Window= 64;			 
	/**
	 * \if ENGLISH_LANG
	 * Split max group quantity
	 * \else
	 * 7V8nWn4s7VWiJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Group= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Split mode max quantity
	 * \else
	 * 7V8nD#J=Wn4sJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Mode= 32;			
	/**
	 * \if ENGLISH_LANG
	 * RAID name length
	 * \else
	 * RAIDC{3F3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Raid_Name_Len= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Single RAID included disk quantity
	 * \else
	 * 5%8vRAID0|:,4EELJ}
	 * \endif
	 */
	public static final int  AV_CFG_Max_Rail_Member= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Main stream encode type quantity
	 * \else
	 * VwBkAw1`Bk@`PMJ}
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Main_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Sub stream encode type
	 * \else
	 * 8(BkAw1`Bk@`PMJ}
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Extra_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Snapshot encode type
	 * \else
	 * W%M<1`Bk@`PMJ}
	 * \endif
	 */
	public static final int	 AV_CFG_Max_Encode_Snap_Format= 3;			
	/**
	 * \if ENGLISH_LANG
	 * Each channel max video input color config quantity
	 * \else
	 * C?8vM(5@Wn4sJSF5JdHkQUI+EdVCJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_VideoColor= 24;			
	/**
	 * \if ENGLISH_LANG
	 * Custom title name length
	 * \else
	 * WT6(Re1jLbC{3F3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Custom_Title_Len= 1024;			
	/**
	 * \if ENGLISH_LANG
	 * Custom title type length
	 * \else
	 * WT6(Re1jLb@`PM3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Custom_TitleType_Len= 32;         
	/**
	 * \if ENGLISH_LANG
	 * Encode area coverage max quantity
	 * \else
	 *  1`BkGxSr828GWn4sJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Cover= 16;			
	/**
	 * \if ENGLISH_LANG
	 * Encode object custom title max quantity
	 * \else
	 * 1`BkNo<~WT6(Re1jLbWn4sJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Custom_Title= 8;	
	/**
	 * \if ENGLISH_LANG
	 * Encode object max number of sensor info
	 * \else
	 * 1`BkNo<~5~<S4+8PFwPEO"5DWn4sJ}D?
	 * \endif
	 */
	public static final int AV_CFG_Max_Video_Widget_Sensor_Info  = 2;
	/**
	 * \if ENGLISH_LANG
	 * max description number
	 * \else
	 * 5~<SGxSrChJvPEO"5DWn4s8vJ}
	 * \endif
	 */
	public static final int AV_CFG_Max_Description_Num = 4;
	/**
	 * \if ENGLISH_LANG
	 * Group note length
	 * \else
	 * 7VWiK5Cw3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Group_Memo_Len= 128;			
	/**
	 * \if ENGLISH_LANG
	 * Max channel quantity
	 * \else
	 * Wn4sM(5@J}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Channel_Num= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Time format length
	 * \else
	 * J1<d8qJ=3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Time_Format_Len= 32;			 
	/**
	 * \if ENGLISH_LANG
	 * White list quantity
	 * \else
	 * 0WC{5%J}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_White_List= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Black list quantity
	 * \else
	 * :ZC{5%J}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Black_List= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Filter IP max length
	 * \else
	 * 9}BKIPWn4s3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Filter_IP_Len= 96;			
	/**
	 * \if ENGLISH_LANG
	 * Channel storage rule max length, only channel part
	 * \else
	 * M(5@4f4"9fTrWn4s3$6H, =vM(5@2?7V
	 * \endif
	 */
	public static final int  AV_CFG_Max_ChannelRule= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Event keyword quantity
	 * \else
	 * JB<~9X<|WVJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_DBKey_Num= 64;			
	/**
	 * \if ENGLISH_LANG
	 * Event keyword length
	 * \else
	 * JB<~9X<|WV3$6H
	 * \endif
	 */
	public static final int  AV_CFG_DBKey_Len= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Summary length
	 * \else
	 * U*R*3$6H
	 * \endif
	 */
	public static final int  AV_CFG_Max_Summary_Len= 1024;		
	/**
	 * \if ENGLISH_LANG
	 * Event title max length
	 * \else
	 * JB<~1jLbWn4sJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Event_Title_Num= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Activation tour max quantity
	 * \else
	 * A*6/BVQ2Wn4sJ}A?
	 * \endif
	 */
	public static final int  AV_CFG_Max_Tour_Link_Num= 128;			
	/**
	 * \if ENGLISH_LANG
	 * PIP split mode basic value
	 * \else
	 * ;-VP;-7V8nD#J=;y4!V5
	 * \endif
	 */
	public static final int  AV_CFG_PIP_BASE= 1000;		
	/**
	 * \if ENGLISH_LANG
	 * DES key byte length
	 * \else
	 * DESC\T?5DWV=Z3$6H
	 * \endif
	 */
	public static final int  DES_KEY_LEN= 8;			
	/**
	 * \if ENGLISH_LANG
	 * 3DES key byte length
	 * \else
	 * 3DESC\T?5D8vJ}
	 * \endif
	 */
	public static final int  DES_KEY_NUM= 3;			
	/**
	 * \if ENGLISH_LANG
	 * AES key byte length
	 * \else
	 * AESC\T?5DWV=Z3$6H
	 * \endif
	 */
	public static final int  AES_KEY_LEN= 32;			
	/**
	 * \if ENGLISH_LANG
	 * Time table element quantity
	 * \else
	 * J1<d1mT*KX8vJ}
	 * \endif
	 */
	public static final int  MAX_TIME_SCHEDULE_NUM= 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene sub type string length
	 * \else
	 * 3!>0WS@`PMWV7{4.3$6H
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_LEN               = 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene sub type max quantity
	 * \else
	 * 3!>0WS@`PMWn4s8vJ}
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_NUM               = 32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Single channel max focus config quantity
	 * \else
	 * 5%M(5@Wn4s>[=9EdVC8vJ}
	 * \endif
	 */
	public static final int MAX_VIDEO_IN_FOCUS                  = 32 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max time period speed config quantity
	 * \else
	 * Wn4sJ1<d6NO^KYEdVC8vJ}
	 * \endif
	 */
	public static final int MAX_TIMESPEEDLIMIT_NUM				= 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max audio prompt config quantity
	 * \else
	 * Wn4sSoRtLaJ>EdVC8vJ}
	 * \endif
	 */
	public static final int MAX_VOICEALERT_NUM					= 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix quantity
	 * \else
	 * Wn4sOBN;>XUsJ}A?
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_NUM			= 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix input channel quantity
	 * \else
	 * Wn4sOBN;>XUsJdHkM(5@J}
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_INPUT			= 64 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix output channel quantity
	 * \else
	 * Wn4sOBN;>XUsJd3vM(5@J}
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_OUTPUT			= 32 ;
	
	public static final int CFG_MAX_FISHEYE_WINDOW_NUM          =     8;         // Wn4sScQ[40?ZJ}
	public static final int CFG_MAX_FISHEYE_MODE_NUM            =     8;         // Wn4sScQ[D#J=J}   
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel template quantity
	 * \else
	 * Wn4s:lMbCf0eD#0eJ}A?
	 * \endif
	 */
	public static final int CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM = 16 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel button quantity
	 * \else
	 * Wn4s:lMbCf0e04<|J}A?
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_KEY_NUM			= 128;
	
	/**
	 * \if ENGLISH_LANG
	 * Max IR panel quantity
	 * \else
	 * Wn4s:lMbCf0eJ}A?
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_BOARD_NUM			= 16 ;
	
	public static final int	MAX_ALARM_CHANNEL_NUM				= 32;			// Wn4s1(>/M(5@J}
	public static final int	MAX_ALARM_DEFENCE_TYPE_NUM		    = 8;			// Wn4s1(>/7@Gx@`PMJ}
	public static final int	MAX_ALARM_SENSE_METHOD_NUM			= 16;			// Wn4s1(>/8PS&Fw7=J=J}
	
	public static final int	MAX_EXALARMBOX_PROTOCOL_NUM             = 8;               // Wn4sV'3V@)U91(>/:PP-RiJ}
	public static final int	MAX_EXALARM_CHANNEL_NUM                 = 256;             // Wn4s1(>/M(5@J}
	public static final int	MAX_EXALARMBOX_NUM                      = 8;               // Wn4s1(>/:PWSJ}
	public static final int	MAX_MAILTITLE_LEN                       = 256;             // Wn4sSJ<~1jLb3$6H
	public static final int	MAX_DEVICE_ID_LEN                       = 48;              // Wn4sIh181`Bk3$6H
	public static final int	MAX_DEVICE_MARK_LEN                     = 64;              // Wn4sIh18ChJv3$6H
	public static final int	MAX_BRAND_NAME_LEN                      = 64;              // Wn4sIh18F7EF3$6H
	public static final int	MAX_ADDRESS_NUM                         = 16;              // Wn4s4.?Z5XV78vJ}
	public static final int	MAX_AIRCONDITION_NUM                    = 16;              // Wn4s?U5wIh188vJ}
	public static final int	CFG_MAX_COLLECTION_NUM                  = 64;              // Wn4sT$08J}
	public static final int	MAX_FLOOR_NUM                           = 128;             // Wn4sB%2cJ}
	public static final int	MAX_SEAT_NUM                            = 8;               // Wn4sWyN;J}
	
	
	/**
	 * \if ENGLISH_LANG
	 * Local device ID
	 * \else
	 * 1>5XIh18ID
	 * \endif
	 */
	public static final String  AV_CFG_Local_Device_ID= "Local";		
	/**
	 * \if ENGLISH_LANG
	 * Remote device ID
	 * \else
	 * T63LIh18ID
	 * \endif
	 */
	public static final String  AV_CFG_Remote_Devce_ID= "Remote";	 
	
	public static final int	MAX_LANE_CONFIG_NUMBER                  = 32;              // 355@Wn4s8vJ}
	public static final int	MAX_PRIORITY_NUMBER                     = 256;             // N%UBSEOH<60|:,N%UBWn4s8vJ}
	public static final int	MAX_CATEGORY_TYPE_NUMBER                = 128;             // WS@`1p@`PMJ}
	public static final int	MAX_TRIGGER_MODE_NUMBER                 = 64;              // 4%7"D#J=8vJ}
	public static final int	MAX_ABNORMAL_DETECT_TYPE                = 32;              // Rl3#<l2b@`PMJ}
	public static final int	MAX_ABNORMAL_THRESHOLD_LEN				      = 32;				// Rl3#<l2bcZV5Wn4s8vJ}
	public static final int	TS_POINT_NUM                            = 3;               // 4%C~FAP#W<5cJ}
	public static final int	CFG_FILTER_IP_LEN				                = 96;			    // 9}BKIPWn4s3$6H
	public static final int	CFG_MAX_TRUST_LIST				              = 1024;		    // 0WC{5%J}A?
	public static final int	CFG_MAX_BANNED_LIST				              = 1024;		    // :ZC{5%J}A?
	public static final int	VIDEOIN_TSEC_NUM                        = 3;               // VideoIn O5APP-RiJ1<d6N8vJ}#,D?G0SPFUM(!"0WLl!":ZR9H}VV
	public static final int	MAX_RECT_COUNT							            = 4;				// 5%8vM(5@V'3V5DBmH|?KGxSrWn4s8vJ}
	public static final int	CFG_MAX_SSID_LEN                        = 36;              // SSIDWn4s3$6H
	
	/**
	 * \if ENGLISH_LANG
	 * COM configuration (Corresponding of CFG_COMMGROUP_INFO)
	 * \else
	 * 4.?ZEdVC(6TS&CFG_COMMGROUP_INFO)
	 * \endif
	 */
	public static final String  CFG_CMD_COMM= "Comm";				
	/**
	 * \if ENGLISH_LANG
	 * CAN config(corresponding to  CFG_CANFILTER_LIST)
	 * \else
	 * CANM84+EdVC(6TS& CFG_CANFILTER_LIST)
	 * \endif
	 */
	public static final String  CFG_CMD_CANFILTER= "CANFilter";			
	/**
	 * \if ENGLISH_LANG
	 * Device alive config(corresponding to structure CFG_DEVICEKEEPALIVELIST)
	 * \else
	 * Ih181#;nEdVC(6TS&=a99Le CFG_DEVICEKEEPALIVELIST)
	 * \endif
	 */
	public static final String  CFG_CMD_DEVICEKEEPALIVE = "DeviceKeepAlive"; 
	
	/**
	 * \if ENGLISH_LANG
	 * Call analysis video info summary type#, corresponding structure as CFG_VIDEOSATA_SUMMARY_INFO 
	 * \else
	 * ;X5w=bNvJSF5PEO"U*R*@`PM#,6TS&=a99LeN*CFG_VIDEOSATA_SUMMARY_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSTAT=       0x1000000;      
	/**
	 * \if ENGLISH_LANG
	 * Call analysis video input channel corresponding all event rule types, corresponding to structure CFG_ANALYSERULES_INFO
	 * \else
	 * ;X5w=bNvJSF5JdHkM(5@6TS&5DKySPJB<~9fTr@`PM#,6TS&=a99LeN*CFG_ANALYSERULES_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_ANARULES=        0x1000001;     
	/**
	 * \if ENGLISH_LANG
	 * Call analysis compressed video intelligent frame, corresponding to structure DH_MSG_OBJECT
	 * \else
	 * ;X5w=bNvE(KuJSF55DVGD\V!#,6TS&=a99LeSDK_MSG_OBJECT
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSYNOPSIS=   0x1000002;	 
	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic info, corresponding to structure DEV_EVENT_TRAFFIC_FLOWSTAT_INFO 
	 * \else
	 * ;X5w=bNv=;M(AwA?PEO"#,6TS&=a99LeDEV_EVENT_TRAFFIC_FLOWSTAT_INFO
	 * \endif
	 */
	public static final int     TYPE_CB_TRAFFICFLOWINFO= 0x1000003;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic flow rule info#,corresponding to structure CFG_TRAFFIC_FLOWSTAT_INFO
	 * \else
	 * ;X5w=bNv=;M(AwA?9fTrPEO"#,6TS&=a99Le CFG_TRAFFIC_FLOWSTAT_INFO
	 * \endif
	 */
	public static final int    TYPE_CB_TRAFFICFLOWRULE = 0x1000004; 
	

	/************************************************************************
	 ** EdVCC|An 6TS& GetNewDevConfig:M SetNewDevConfig=S?Z
	 ***********************************************************************/
	
	/**
	 * \if ENGLISH_LANG
	 * image channel property config,structure CFG_ENCODE_INFO
	 * \else
	 * M<OqM(5@JtPTEdVC(6TS&CFG_ENCODE_INFO)
	 * \endif
	 */
	public static final String  CFG_CMD_ENCODE = "Encode";
	
	/**
	 * \if ENGLISH_LANG
	 * timed recordconfig,structure CFG_RECORD_INFO 
	 * \else
	 * 6(J1B<OqEdVC(6TS&CFG_RECORD_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORD		    = "Record";    		
	/**
	 * \if ENGLISH_LANG
	 * external inputalarmconfig,structure CFG_ALARMIN_INFO 
	 * \else
	 * Mb2?JdHk1(>/EdVC(6TS&CFG_ALARMIN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ALARMINPUT	    = "Alarm";    			
	/**
	 * \if ENGLISH_LANG
	 * network alarmconfig,structure CFG_NETALARMIN_INFO 
	 * \else
	 * MxBg1(>/EdVC(6TS&CFG_NETALARMIN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NETALARMINPUT    = "NetAlarm";    		
	/**
	 * \if ENGLISH_LANG
	 * dynamic detectionalarmconfig,structure CFG_MOTION_INFO 
	 * \else
	 * 6/L,<l2b1(>/EdVC(6TS&CFG_MOTION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_MOTIONDETECT    = "MotionDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * video loss alarmconfig,structure CFG_VIDEOLOST_INFO 
	 * \else
	 * JSF56*J'1(>/EdVC(6TS&CFG_VIDEOLOST_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOLOST	    = "LossDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * video mask alarmconfig,structure CFG_SHELTER_INFO 
	 * \else
	 * JSF5UZ521(>/EdVC(6TS&CFG_SHELTER_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOBLIND	    = "BlindDetect";    	
	/**
	 * \if ENGLISH_LANG
	 * no storage device config,structure CFG_STORAGENOEXIST_INFO 
	 * \else
	 * N^4f4"Ih181(>/EdVC(6TS&CFG_STORAGENOEXIST_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGENOEXIST    = "StorageNotExist";    
	/**
	 * \if ENGLISH_LANG
	 * storage device access mistake config,structure CFG_STORAGEFAILURE_INFO 
	 * \else
	 * 4f4"Ih187CNJ3v4m1(>/EdVC(6TS&CFG_STORAGEFAILURE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEFAILURE    = "StorageFailure";    
	/**
	 * \if ENGLISH_LANG
	 * storage device low volume config,structure CFG_STORAGELOWSAPCE_INFO 
	 * \else
	 * 4f4"Ih18?U<d2;Wc1(>/EdVC(6TS&CFG_STORAGELOWSAPCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGELOWSAPCE    = "StorageLowSpace";    
	/**
	 * \if ENGLISH_LANG
	 * disconnected config,structure CFG_NETABORT_INFO 
	 * \else
	 * MxBg6O?*1(>/EdVC(6TS&CFG_NETABORT_INFO)	
	 * \endif
	 */
	public static String CFG_CMD_NETABORT	    = "NetAbort";    		
	/**
	 * \if ENGLISH_LANG
	 * IP conflict setting,structure CFG_IPCONFLICT_INFO 
	 * \else
	 * IP3eM;1(>/EdVC(6TS&CFG_IPCONFLICT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_IPCONFLICT	    = "IPConflict";    	
	/**
	 * \if ENGLISH_LANG
	 * snapshot ,structure CFG_SNAPCAPINFO_INFO 
	 * \else
	 * W%M<D\A&2iQ/(6TS&CFG_SNAPCAPINFO_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAPCAPINFO	    = "SnapInfo";    		
	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig,structure CFG_NAS_INFO 
	 * \else
	 * MxBg4f4"7~NqFwEdVC(6TS&CFG_NAS_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NAS			    = "NAS";    			
	/**
	 * \if ENGLISH_LANG
	 * PTZ config,structure CFG_PTZ_INFO
	 * \else
	 * TFL(EdVC(6TS&CFG_PTZ_INFO)
	 * \endif
	 */
	public static String CFG_CMD_PTZ			    = "Ptz";    			
	/**
	 * \if ENGLISH_LANG
	 * PTZ schedule action config(corresponding to CFG_PTZ_AUTOMOVE_INFO)
	 * \else
	 * TFL(6(J16/WwEdVC(6TS&CFG_PTZ_AUTOMOVE_INFO)
	 * \endif
	 */
	public static String	CFG_CMD_PTZ_AUTO_MOVEMENT   = "PtzAutoMovement";    
	/**
	 * \if ENGLISH_LANG
	 * video water mark config,structure CFG_WATERMARK_INFO 
	 * \else
	 * JSF5K.S!EdVC(6TS&CFG_WATERMARK_INFO)
	 * \endif
	 */
	public static String CFG_CMD_WATERMARK	    = "WaterMark";    		
	/**
	 * \if ENGLISH_LANG
	 * video full analysis config,structure CFG_ANALYSEGLOBAL_INFO
	 * \else
	 * JSF57VNvH+>VEdVC(6TS&CFG_ANALYSEGLOBAL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEGLOBAL    = "VideoAnalyseGlobal";    
	/**
	 * \if ENGLISH_LANG
	 * object's detection module config,structure CFG_ANALYSEMODULES_INFO 
	 * \else
	 * NoLe5D<l2bD#?iEdVC(6TS&CFG_ANALYSEMODULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEMODULE    = "VideoAnalyseModule";    
	/**
	 * \if ENGLISH_LANG
	 * video analyzing rule config,structure CFG_ANALYSERULES_INFO 
	 * \else
	 * JSF57VNv9fTrEdVC(6TS&CFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSERULE	    = "VideoAnalyseRule";    
	/**
	 * \if ENGLISH_LANG
	 * video analyzing resource config,structure CFG_ANALYSESOURCE_INFO 
	 * \else
	 * JSF57VNvWJT4EdVC(6TS&CFG_ANALYSESOURCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSESOURCE    = "VideoAnalyseSource";    
	/**
	 * \if ENGLISH_LANG
	 * wiper config CFG_RAINBRUSH_INFO 
	 * \else
	 * SjK"EdVC(6TS&CFG_RAINBRUSH_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RAINBRUSH         = "RainBrush";            
	/**
	 * \if ENGLISH_LANG
	 * ITC CFG_TRAFFICSNAPSHOT_INFO for compatible with old protocol#;please use CFG_CMD_TRAFFICSNAPSHOT_MULTI)
	 * \else
	 * VGD\=;M(W%ED(CFG_TRAFFICSNAPSHOT_INFOV;N*<fH]@OP-Ri#;GkJ9SCCFG_CMD_TRAFFICSNAPSHOT_MULTI)
	 * \endif
	 */
	public static String CFG_CMD_INTELLECTIVETRAFFIC   = "TrafficSnapshot";    
	/**
	 * \if ENGLISH_LANG
	 * full intellifent traffic config CFG_TRAFFICGLOBAL_INFO 
	 * \else
	 * VGD\=;M(H+>VEdVC(CFG_TRAFFICGLOBAL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFICGLOBAL     = "TrafficGlobal";        
	/**
	 * \if ENGLISH_LANG
	 * normal config CFG_DEV_DISPOSITION_INFO
	 * \else
	 * FUM(EdVC (CFG_DEV_DISPOSITION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEV_GENERRAL      = "General";              
	/**
	 * \if ENGLISH_LANG
	 * ATM expired config CFG_ATMMOTION_INFO
	 * \else
	 * ATMH!?n3,J1EdVC(6TS&CFG_ATMMOTION_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ATMMOTION	    = "FetchMoneyOverTime";    
	/**
	 * \if ENGLISH_LANG
	 * device status info CFG_DEVICESTATUS_INFO 
	 * \else
	 * Ih18W4L,PEO"(6TS&CFG_DEVICESTATUS_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEVICESTATUS      = "DeviceStatus";         
	/**
	 * \if ENGLISH_LANG
	 * extension info,structure CFG_HARDISKTANKGROUP_INFO 
	 * \else
	 * @)U99qPEO"(6TS&CFG_HARDISKTANKGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_HARDDISKTANK      = "HardDiskTank";         
	/**
	 * \if ENGLISH_LANG
	 * Raid froup info,structure CFG_RAIDGROUP_INFO 
	 * \else
	 * RaidWiPEO"(6TS&CFG_RAIDGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RAIDGROUP         = "RaidGroup";            
	/**
	 * \if ENGLISH_LANG
	 * storage pool info,structure CFG_STORAGEPOOLGROUP_INFO
	 * \else
	 * 4f4"3XWiPEO"(6TS&CFG_STORAGEPOOLGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEPOOLGROUP   = "StoragePoolGroup";    
	/**
	 * \if ENGLISH_LANG
	 * file system group info,structure CFG_STORAGEPOSITIONGROUP_INFO 
	 * \else
	 * ND<~O5M3WiPEO"(6TS&CFG_STORAGEPOSITIONGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEPOSITIONGROUP    = "StoragePositionGroup";     
	/**
	 * \if ENGLISH_LANG
	 * frong-end device group info CFG_VIDEOINDEVGROUP_INFO
	 * \else
	 * G06KIh18WiPEO"(6TS&CFG_VIDEOINDEVGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOINDEVGROUP   = "VideoInDevGroup";      
	/**
	 * \if ENGLISH_LANG
	 * channelrecord group status,structure CFG_DEVRECORDGROUP_INFO
	 * \else
	 * M(5@B<OqWiW4L,(6TS&CFG_DEVRECORDGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DEVRECORDGROUP    = "DevRecordGroup";       
	/**
	 * \if ENGLISH_LANG
	 * service status,structure CFG_IPSERVER_STATUS
	 * \else
	 * 7~NqW4L,(6TS&CFG_IPSERVER_STATUS)
	 * \endif
	 */
	public static String CFG_CMD_IPSSERVER         = "IpsServer";            
	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix,structure CFG_VIDEO_MATRIX
	 * \else
	 * W%M<T4EdVC(6TS&CFG_SNAPSOURCE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAPSOURCE	    = "SnapSource";    	
	/**
	 * \if ENGLISH_LANG
	 * Dahua rador
	 * \else
	 * 4s;*@W4oEdVC
	 * \endif
	 */
	public static String CFG_CMD_DHRADER           = "DahuaRadar";           
	/**
	 * \if ENGLISH_LANG
	 * Chuansu radar
	 * \else
	 * 4(KU@W4oEdVC
	 * \endif
	 */
	public static String CFG_CMD_TRANSRADER         = "TransRadar";          
	/**
	 * \if ENGLISH_LANG
	 * Landun radar
	 * \else
	 * @66\@W4oEdVC
	 * \endif
	 */
	public static String CFG_CMD_LANDUNRADER        = "LanDunRadar";         //
	/**
	 * \if ENGLISH_LANG
	 * Landun coil
	 * \else
	 * @66\O_H&EdVC
	 * \endif
	 */
	public static String CFG_CMD_LANDUNCOILS        = "LanDunCoils";         
	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix,structure CFG_VIDEO_MATRIX 
	 * \else
	 * SpotJSFA>XUs(6TS&CFG_VIDEO_MATRIX)
	 * \endif
	 */
	public static String CFG_CMD_MATRIX_SPOT        = "SpotMatrix";          
	/**
	 * \if ENGLISH_LANG
	 * every number channel dsp info,structure CFG_DSPENCODECAP_INFO
	 * \else
	 * HDVR4+C?8vJ}WVM(5@5DdspPEO" J}WVM(5@?IRTA,IPC;rDVR R2>MJGIPC;rDVR5DD\A&(6TS&CFG_DSPENCODECAP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_HDVR_DSP           = "DspEncodeCap";        
	/**
	 * \if ENGLISH_LANG
	 * HDVR each digital channel connected device info
	 * \else
	 * HDVR4+C?8vJ}WVM(5@5DKyA,Ih185DPEO"
	 * \endif
	 */
	public static String CFG_CMD_HDVR_ATTR_CFG      = "SystemAttr";          
	/**
	 * \if ENGLISH_LANG
	 * Holiday record plan(correspondting to strcture CFG_HOLIDAY_SCHEDULE group)
	 * \else
	 * <YFZB<Oq<F;.(6TS&=a99LeCFG_HOLIDAY_SCHEDULEJ}Wi)
	 * \endif
	 */
	public static String CFG_CMD_CHANNEL_HOLIDAY    = "HolidaySchedule";     
	/**
	 * \if ENGLISH_LANG
	 * Health mail
	 * \else
	 * =!?5SJ<~
	 * \endif
	 */
	public static String CFG_CMD_HEALTH_MAIL        = "HealthMail";          
	/**
	 * \if ENGLISH_LANG
	 * Camera move detect activation 
	 * \else
	 * IcOq;zRFN;Ul2bA*6/ 
	 * \endif
	 */
	public static String CFG_CMD_CAMERAMOVE         = "IntelliMoveDetect";         
	/**
	 * \if ENGLISH_LANG
	 * video splicing tour config,structure CFG_VIDEO_MATRIX
	 * \else
	 * JSF57V8nBVQ2EdVC(6TS&CFG_VIDEO_MATRIX)
	 * \endif
	 */
	public static String CFG_CMD_SPLITTOUR          = "SplitTour";           
	/**
	 * \if ENGLISH_LANG
	 * video encode ROI(Region of Intrest)config,structure
	 * \else
	 * JSF51`BkROI(Region of Intrest)EdVC
	 * \endif
	 */
	public static String CFG_CMD_VIDEOENCODEROI     = "VideoEncodeROI";      
	/**
	 * \if ENGLISH_LANG
	 * light inspection config,structure CFG_VIDEO_INMETERING_INFO
	 * \else
	 * 2b9bEdVC(6TS&CFG_VIDEO_INMETERING_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_INMETERING   = "VideoInMetering";     
	/**
	 * \if ENGLISH_LANG
	 * traffic flow statistics config,structure CFG_TRAFFIC_FLOWSTAT_INFO
	 * \else
	 * =;M(AwA?M3<FEdVC(6TS&CFG_TRAFFIC_FLOWSTAT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFIC_FLOWSTAT   = "TrafficFlowStat";     
	/**
	 * \if ENGLISH_LANG
	 * HDMI video matrix config
	 * \else
	 * HDMIJSF5>XUsEdVC
	 * \endif
	 */
	public static String CFG_CMD_HDMIMATRIX          = "HDMIMatrix";         
	/**
	 * \if ENGLISH_LANG
	 * videoinput front-end option,structure CFG_VIDEO_IN_OPTIONS 
	 * \else
	 * JSF5JdHkG06KQ!On(6TS&CFG_VIDEO_IN_OPTIONS)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOINOPTIONS	   = "VideoInOptions";    
	/**
	 * \if ENGLISH_LANG
	 * RTSP5Dconfig,structure CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT
	 * \else
	 * RTSP5DEdVC( 6TS&CFG_RTSP_INFO_IN:MCFG_RTSP_INFO_OUT )
	 * \endif
	 */
	public static String CFG_CMD_RTSP               = "RTSP";                

	public static String CFG_CMD_TRAFFICSNAPSHOT    = "TrafficSnapshotNew";    
	/**
	 * \if ENGLISH_LANG
	 * intelligent traffic snapshot CFG_TRAFFICSNAPSHOT_NEW_INFO
	 * \else
	 * VGD\=;M(W%ED(CFG_TRAFFICSNAPSHOT_NEW_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFICSNAPSHOT_MULTI    = "TrafficSnapshotNew";    
	/**
	 * \if ENGLISH_LANG
	 * multicast related config,structure CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT
	 * \else
	 * Wi2%5DO`9XEdVC(6TS&CFG_MULTICASTS_INFO_IN:MCFG_MULTICASTS_INFO_OUT)
	 * \endif
	 */
	public static String CFG_CMD_MULTICAST          = "Multicast";            
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis parameter list,structure CFG_VIDEODIAGNOSIS_PROFILE 
	 * \else
	 * JSF5Uo6O2NJ}1m(CFG_VIDEODIAGNOSIS_PROFILE)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_PROFILE     = "VideoDiagnosisProfile";    	
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list,structure CFG_VIDEODIAGNOSIS_TASK 
	 * \else
	 * JSF5Uo6OHNNq1m(CFG_VIDEODIAGNOSIS_TASK)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_TASK	        = "VideoDiagnosisTask";    		
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis plan list CFG_VIDEODIAGNOSIS_PROJECT
	 * \else
	 * JSF5Uo6O<F;.1m(CFG_VIDEODIAGNOSIS_PROJECT)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_PROJECT      = "VideoDiagnosisProject";    	
	/**
	 * \if ENGLISH_LANG
	 * 1111
	 * \else
	 * JSF5Uo6OJ5J1<F;.1m(CFG_VIDEODIAGNOSIS_REALPROJECT)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_REALPROJECT      = "VideoDiagnosisRealProject";    
	/**
	 * \if ENGLISH_LANG
	 * video full diagnosis list CFG_VIDEODIAGNOSIS_GLOBAL 
	 * \else
	 * JSF5Uo6OH+>V1m(CFG_VIDEODIAGNOSIS_GLOBAL)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_GLOBAL       = "VideoDiagnosisGlobal";    	
	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list CFG_VIDEODIAGNOSIS_TASK
	 * \else
	 * JSF5Uo6OHNNq1m(CFG_VIDEODIAGNOSIS_TASK)
	 * \endif
	 */
	public static String CFG_CMD_VIDEODIAGNOSIS_TASK_ONE     = "VideoDiagnosisTask.x";        
	/**
	 * \if ENGLISH_LANG
	 * device working status relatedconfig,structure CFG_TRAFFIC_WORKSTATE_INFO
	 * \else
	 * Ih189$WwW4L,O`9XEdVC(6TS&CFG_TRAFFIC_WORKSTATE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_TRAFFIC_WORKSTATE           = "WorkState";                      
	/**
	 * \if ENGLISH_LANG
	 * disk storage group config,structure CFG_STORAGEGROUP_INFO
	 * \else
	 * 4EEL4f4"WiEdVC(6TS&CFG_STORAGEGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEDEVGROUP             = "StorageDevGroup";                
	/**
	 * \if ENGLISH_LANG
	 * record stored storage group config,structure CFG_RECORDTOGROUP_INFO
	 * \else
	 * B<Oq4f7E5D4f4"WiEdVC(6TS&CFG_RECORDTOGROUP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORDTOGROUP               = "RecordToGroup";                  
	/**
	 * \if ENGLISH_LANG
	 * intelligent tracking scene config,structure CFG_INTELLITRACKSCENE_INFO
	 * \else
	 * VGD\8zWY3!>0EdVC(CFG_INTELLITRACKSCENE_INFO) 
	 * \endif
	 */
	public static String CFG_CMD_INTELLITRACKSCENE           = "IntelliTrackScene";              
	/**
	 * \if ENGLISH_LANG
	 * intelligent frame rule config,structure CFG_ANALYSERULES_INFO 
	 * \else
	 * VGD\V!9fTrEdVC(6TS&CFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_IVSFRAM_RULE                = "IVSFramRule";                    
	/**
	 * \if ENGLISH_LANG
	 * record storage point mapping config,structure CFG_RECORDTOSTORAGEPOINT_INFO
	 * \else
	 * B<Oq4f4"5cS3IdEdVC(6TS&CFG_RECORDTOSTORAGEPOINT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_RECORD_STORAGEPOINT         = "RecordStoragePoint";             
	/**
	 * \if ENGLISH_LANG
	 * source data serverconfig,structure CFG_METADATA_SERVER
	 * \else
	 * T*J}>]7~NqFwEdVC(6TS&CFG_METADATA_SERVER=a99Le)
	 * \endif
	 */
	public static String CFG_CMD_MD_SERVER		            = "MetaDataServer";                
	/**
	 * \if ENGLISH_LANG
	 * channel name AV_CFG_ChannelName 
	 * \else
	 * M(5@C{3F(6TS&AV_CFG_ChannelName)
	 * \endif
	 */
	public static String CFG_CMD_CHANNELTITLE    = "ChannelTitle";    	
	/**
	 * \if ENGLISH_LANG
	 * record mode AV_CFG_RecordMode 
	 * \else
	 * B<OqD#J=(6TS&AV_CFG_RecordMode)
	 * \endif
	 */
	public static String	CFG_CMD_RECORDMODE	    = "RecordMode";    	
	/**
	 * \if ENGLISH_LANG
	 * videooutput property AV_CFG_VideoOutAttr 
	 * \else
	 * JSF5Jd3vJtPT(6TS&AV_CFG_VideoOutAttr)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOOUT	    = "VideoOut";    		
	/**
	 * \if ENGLISH_LANG
	 * remote device info AV_CFG_RemoteDevice
	 * \else
	 * T63LIh18PEO"(6TS&AV_CFG_RemoteDeviceJ}Wi, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_REMOTEDEVICE      = "RemoteDevice";    	
	/**
	 * \if ENGLISH_LANG
	 * remote channel AV_CFG_RemoteChannel
	 * \else
	 * T63LM(5@(6TS&AV_CFG_RemoteChannel)
	 * \endif
	 */
	public static String CFG_CMD_REMOTECHANNEL    = "RemoteChannel";    	
	/**
	 * \if ENGLISH_LANG
	 * image tour config AV_CFG_MonitorTour 
	 * \else
	 * ;-CfBVQ5EdVC(6TS&AV_CFG_MonitorTour)
	 * \endif
	 */
	public static String CFG_CMD_MONITORTOUR	    = "MonitorTour";    	
	/**
	 * \if ENGLISH_LANG
	 * image favorite config AV_CFG_MonitorCollection 
	 * \else
	 * ;-CfJU2XEdVC(6TS&AV_CFG_MonitorCollection)
	 * \endif
	 */
	public static String CFG_CMD_MONITORCOLLECTION    = "MonitorCollection";    
	/**
	 * \if ENGLISH_LANG
	 * image splicing display source config AV_CFG_ChannelDisplaySource
	 * \else
	 * ;-Cf7V8nOTJ>T4EdVC(6TS&AV_CFG_ChannelDisplaySource)(7O3}#,2;=(RiJ9SC)
	 * \endif
	 */
	public static String CFG_CMD_DISPLAYSOURCE    = "DisplaySource";    	
	/**
	 * \if ENGLISH_LANG
	 * storage group config AV_CFG_Raid 
	 * \else
	 * 4f4">mWiEdVC(6TS&AV_CFG_RaidJ}Wi, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_RAID		    = "Raid";    			
	/**
	 * \if ENGLISH_LANG
	 * record source config AV_CFG_RecordSource
	 * \else
	 * B<OqT4EdVC(6TS&AV_CFG_RecordSource)
	 * \endif
	 */
	public static String CFG_CMD_RECORDSOURCE    = "RecordSource";    	
	/**
	 * \if ENGLISH_LANG
	 * videoinput color config AV_CFG_ChannelVideoColor 
	 * \else
	 * JSF5JdHkQUI+EdVC(6TS&AV_CFG_ChannelVideoColor)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOCOLOR	    = "VideoColor";    	
	/**
	 * \if ENGLISH_LANG
	 * video encoding object config AV_CFG_VideoWidget
	 * \else
	 * JSF51`BkNo<~EdVC(6TS&AV_CFG_VideoWidget)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOWIDGET	    = "VideoWidget";    	
	/**
	 * \if ENGLISH_LANG
	 * storage group info AV_CFG_StorageGroup
	 * \else
	 * 4f4"WiPEO"(6TS&AV_CFG_StorageGroupJ}Wi, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_STORAGEGROUP    = "StorageGroup";    	
	/**
	 * \if ENGLISH_LANG
	 * area config AV_CFG_Locales
	 * \else
	 * GxSrEdVC(6TS&AV_CFG_Locales)
	 * \endif
	 */
	public static String CFG_CMD_LOCALS		    = "Locales";    		
	/**
	 * \if ENGLISH_LANG
	 * language selection AV_CFG_Language 
	 * \else
	 * SoQTQ!Tq(6TS&AV_CFG_Language)
	 * \endif
	 */
	public static String CFG_CMD_LANGUAGE	    = "Language";    		
	/**
	 * \if ENGLISH_LANG
	 * visit address filter AV_CFG_AccessFilter 
	 * \else
	 * 7CNJ5XV79}BK(6TS&AV_CFG_AccessFilter)
	 * \endif
	 */
	public static String CFG_CMD_ACCESSFILTER    = "AccessFilter";    	
	/**
	 * \if ENGLISH_LANG
	 * auto maintenance AV_CFG_AutoMaintain 
	 * \else
	 * WT6/N,;$(6TS&AV_CFG_AutoMaintain)
	 * \endif
	 */
	public static String CFG_CMD_AUTOMAINTAIN    = "AutoMaintain";    	
	/**
	 * \if ENGLISH_LANG
	 * remote device event process AV_CFG_RemoteEvent
	 * \else
	 * T63LIh18JB<~4&@m(6TS&AV_CFG_RemoteEventJ}Wi)
	 * \endif
	 */
	public static String CFG_CMD_REMOTEEVENT	    = "RemoteEvent";    	
	/**
	 * \if ENGLISH_LANG
	 * display wall config AV_CFG_MonitorWall
	 * \else
	 * 5gJSG=EdVC(6TS&AV_CFG_MonitorWallJ}Wi, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_MONITORWALL	    = "MonitorWall";    	
	/**
	 * \if ENGLISH_LANG
	 * mixing screen config AV_CFG_SpliceScreen
	 * \else
	 * HZ:OFAEdVC(6TS&AV_CFG_SpliceScreenJ}Wi, M(5@N^9X)
	 * \endif
	 */
	public static String	CFG_CMD_SPLICESCREEN    = "VideoOutputComposite";    	
	/**
	 * \if ENGLISH_LANG
	 * temperature alarmconfig AV_CFG_TemperatureAlarm
	 * \else
	 * NB6H1(>/EdVC(6TS&AV_CFG_TemperatureAlarm, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_TEMPERATUREALARM    = "TemperatureAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * fan speed alarmconfig AV_CFG_FanSpeedAlarm 
	 * \else
	 * 7gIHW*KY1(>/EdVC(6TS&AV_CFG_FanSpeedAlarm, M(5@N^9X)
	 * \endif
	 */
	public static String	CFG_CMD_FANSPEEDALARM	    = "FanSpeedAlarm";    		
	/**
	 * \if ENGLISH_LANG
	 * record rotate config AV_CFG_RecordBackup
	 * \else
	 * B<Oq;X4+EdVC(6TS&AV_CFG_RecordBackup, M(5@N^9X)
	 * \endif
	 */
	public static String CFG_CMD_RECORDBACKUP	    = "RecordBackupRestore";    
	/**
	 * \if ENGLISH_LANG
	 * network config CFG_NETWORK_INFO 
	 * \else
	 * MxBgEdVC(6TS&CFG_NETWORK_INFO)
	 * \endif
	 */
	public static String	CFG_CMD_NETWORK			      = "Network";    		
	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig, multi-server CFG_NAS_GROUP_INFO_EX
	 * \else
	 * MxBg4f4"7~NqFwEdVC, 6`7~NqFw(6TS&CFG_NAS_INFO_EX)
	 * \endif
	 */
	public static String CFG_CMD_NASEX			      = "NAS";    			
	/**
	 * \if ENGLISH_LANG
	 * LDAP config
	 * \else
	 * LDAPEdVC
	 * \endif
	 */
	public static String CFG_CMD_LDAP                  = "LDAP";                 
	/**
	 * \if ENGLISH_LANG
	 * active directory config
	 * \else
	 * ;n6/D?B<EdVC
	 * \endif
	 */
	public static String CFG_CMD_ACTIVE_DIR            = "ActiveDirectory";      
	/**
	 * \if ENGLISH_LANG
	 * Compensation light config(corresponding CFG_FLASH_LIGHT)
	 * \else
	 * 299b5FEdVC(6TS& CFG_FLASH_LIGHT)
	 * \endif
	 */
	public static String CFG_CMD_FLASH                 = "FlashLight";           
	/**
	 * \if ENGLISH_LANG
	 * Audio analysis rule config(corresponding CFG_ANALYSERULES_INFO)
	 * \else
	 * RtF57VNv9fTrEdVC(6TS& CFG_ANALYSERULES_INFO)
	 * \endif
	 */
	public static String CFG_CMD_AUDIO_ANALYSERULE     = "AudioAnalyseRule";     
	/**
	 * \if ENGLISH_LANG
	 * Judicial config(corresponding to CFG_JUDICATURE_INFO)
	 * \else
	 * K>7(?LB<EdVC(6TS& CFG_JUDICATURE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_JUDICATURE            = "Judicature";           
	/**
	 * \if ENGLISH_LANG
	 * Mobile load config(corresponding to CFG_GOOD_WEIGHT_INFO)
	 * \else
	 * 35TX;uVXEdVC(6TS&CFG_GOOD_WEIGHT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_GOODS_WEIGHT	    = "CQDTSet";    		
	/**
	 * \if ENGLISH_LANG
	 * Input channel config(corresponding CFG_VIDEO_IN_INFO)
	 * \else
	 * JdHkM(5@EdVC(6TS&CFG_VIDEO_IN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOIN			    = "VideoIn";    		
	/**
	 * \if ENGLISH_LANG
	 * Write dick encode plan(corresponding CFG_ENCODE_PLAN_INFO)
	 * \else
	 * ?LB<9bEL1`Bk<F;.(6TS& CFG_ENCODE_PLAN_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ENCODEPLAN            = "EncodePlan";           
	/**
	 * \if ENGLISH_LANG
	 * Judicial PIP(corresponding to CFG_PICINPIC_INFO) as group#,compatible with single config according to length
	 * \else
	 * K>7(IsQ6;-VP;-(6TS& CFG_PICINPIC_INFO)8DN*J}Wi7=J=#,<fH]RTG05%8vEdVC#,8y>]3$6HGx7V
	 * \endif
	 */
	public static String CFG_CMD_PICINPIC              = "PicInPic";             
	/**
	 * \if ENGLISH_LANG
	 * Write full event config(corresponding CFG_BURNFULL_INFO)
	 * \else
	 * ?LB<BzJB<~EdVC(6TS& CFG_BURNFULL_INFO)
	 * \endif
	 */
	public static String CFG_CMD_BURNFULL              = "BurnFull";             
	/**
	 * \if ENGLISH_LANG
	 * Master/slave global config#(correspinding#)
	 * \else
	 * Vw4SJ=H+>VEdVC#(6TS&#)
	 * \endif
	 */
	public static String CFG_CMD_MASTERSLAVE_GLOBAL    = "MasterSlaveTrackerGlobal";      
	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config(corresponding to CFG_ANALYSEWHOLE_INFO)
	 * \else
	 * JSF57VNvU{LeEdVC(6TS&CFG_ANALYSEWHOLE_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALYSEWHOLE    = "VideoAnalyseWhole";     
	/**
	 * \if ENGLISH_LANG
	 * Video input border config(corresponding CFG_VIDEO_IN_BOUNDARY)
	 * \else
	 * JSF5JdHk1_=gEdVC(6TS&CFG_VIDEO_IN_BOUNDARY)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_IN_BOUNDARY    = "VideoInBoundary";    
	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme (corresponding CFG_MONITORWALL_COLLECTION group)
	 * \else
	 * 5gJSG=T$08(6TS&CFG_MONITORWALL_COLLECTIONJ}Wi)
	 * \endif
	 */
	public static String	CFG_CMD_MONITORWALL_COLLECTION    = "MonitorWallCollection";    
	/**
	 * \if ENGLISH_LANG
	 * Analog matrix(corresponding to CFG_ANALOG_MATRIX_INFO)
	 * \else
	 * D#Db>XUs(6TS&CFG_ANALOG_MATRIX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ANALOGMATRIX	    = "AnalogMatrix";    	
	/**
	 * \if ENGLISH_LANG
	 * Analog matrix protocol config(Corresponding CFG_ANALOG_MATRIX_PROTOCOL group)
	 * \else
	 * D#Db>XUsP-RiEdVC(6TS&CFG_ANALOG_MATRIX_PROTOCOLJ}Wi)
	 * \endif
	 */
	public static String CFG_CMD_ANALOG_MATRIX_PROTOCOL    = "AnalogMatrixProtocol";    
	/**
	 * \if ENGLISH_LANG
	 * Video output title(corresponding to CFG_VIDEO_OUT_TITLE)
	 * \else
	 * JSF5Jd3v1jLb(6TS&CFG_VIDEO_OUT_TITLE)
	 * \endif
	 */
	public static String	CFG_CMD_VIDEO_OUT_TITLE	    = "VideoOutputTitle";    	
	/**
	 * \if ENGLISH_LANG
	 * Hark disk data flow alarm config(corresponding to CFG_DISK_FLUX_INFO)
	 * \else
	 * S2ELJ}>]AwA?1(>/EdVC(6TS&CFG_DISK_FLUX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DISK_FLUX_ALARM	    = "DiskFluxAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * Net data flow alarm config(corresponding to CFG_NET_FLUX_INFO)
	 * \else
	 * MxBgJ}>]AwA?1(>/EdVC(6TS&CFG_NET_FLUX_INFO)
	 * \endif
	 */
	public static String CFG_CMD_NET_FLUX_ALARM	    = "NetFluxAlarm";    	
	/**
	 * \if ENGLISH_LANG
	 * Net protocol config(corresponding to CFG_DVRIP_INFO)
	 * \else
	 * MxBgP-RiEdVC(6TS&CFG_DVRIP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_DVRIP                 = "DVRIP";                
	/**
	 * \if ENGLISH_LANG
	 * and camera corresponding area config(corresponding to  CFG_PARKINGSPACE_SCREEN_INFO ,group#,element max value is DH_PRODUCTION_DEFNITION.nMaxParkingSpaceScreen)
	 * \else 
	 * :MO`;z6T=S5DGxSrFAEdVC(6TS& CFG_PARKINGSPACE_SCREEN_INFO ,JGJ}Wi#,T*KXWn4sV5JGSDK_PRODUCTION_DEFNITION.nMaxParkingSpaceScreen)
	 * \endif
	 */
	public static String CFG_CMD_PARKINGSPACE_SCREEN   = "ParkingSpaceScreen";    
	/**
	 * \if ENGLISH_LANG
	 * Spot setup(special spot and general spot setup)(corresponding to  CFG_PARKINGSPACE_STATUS_INFO #,is group#,element max value is DH_PRODUCTION_DEFNITION.nMaxRoadWays)
	 * \else
	 * 35N;IhVC(W(SP35N;:MFUM(35N;IhVC)(6TS& CFG_PARKINGSPACE_STATUS_INFO #,JGJ}Wi#,T*KXWn4sV5JGSDK_PRODUCTION_DEFNITION.nMaxRoadWays)
	 * \endif
	 */
	public static String CFG_CMD_PARKINGSPACE_STATUS   = "ParkingSpaceCellStatus";    
	/**
	 * \if ENGLISH_LANG
	 * Platform custom info(corresponding to  CFG_CLIENT_CUSTOM_INFO)
	 * \else
	 * F=L(WT6(RePEO"(6TS& CFG_CLIENT_CUSTOM_INFO)
	 * \endif
	 */
	public static String CFG_CMD_CLIENT_CUSTOM_DATA    = "ClientCustomData";     
	/**
	 * \if ENGLISH_LANG
	 * Writing format config(corresponding to  CFG_BURN_RECORD_FORMAT)
	 * \else
	 * ?LB<8qJ=EdVC(6TS& CFG_BURN_RECORD_FORMAT)
	 * \endif
	 */
	public static String CFG_CMD_BURN_RECORD_FORMAT    = "BurnRecordFormat";     
	/**
	 * \if ENGLISH_LANG
	 * Multi disk sync write(corresponding to  CFG_MULTIBURN_INFO)group, each element means one group multi-disk sync writing and calibration
	 * \else
	 * 6`9bELM,2=?LB<(6TS& CFG_MULTIBURN_INFO)JGR;8vJ}Wi#,C?R;8vT*KX1mJ>R;Wi6`9bELM,2=?LB<<0P#Qi
	 * \endif
	 */
	public static String CFG_CMD_MULTIBURN             = "MultiBurn";            
	/**
	 * \if ENGLISH_LANG
	 * Encode encryption config info( CFG_ENCODE_ENCRYPT_CHN_INFO )
	 * \else
	 * 1`Bk<SC\EdVCPEO"( CFG_ENCODE_ENCRYPT_CHN_INFO )
	 * \endif
	 */
	public static String	CFG_CMD_ENCODE_ENCRYPT	    = "EncodeEncrypt";    	
	/**
	 * \if ENGLISH_LANG
	 * PTZ channel zoom config(corresponding to  CFG_VIDEO_IN_ZOOM)
	 * \else
	 * TFL(M(5@1d16EdVC(6TS& CFG_VIDEO_IN_ZOOM)
	 * \endif
	 */
	public static String CFG_CMD_VIDEO_IN_ZOOM         = "VideoInZoom";          
	/**
	 * \if ENGLISH_LANG
	 * Snapshot config(corresponding to  CFG_SNAP_INFO)
	 * \else
	 * W%M<EdVC(6TS& CFG_SNAP_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SNAP			    = "Snap";    			
	/**
	 * \if ENGLISH_LANG
	 * Net storage server limit config(corresponding to  CFG_REMOTE_STORAGELIMIT_GROUP)
	 * \else
	 * MxBg4f4"7~NqFwO^VFEdVC(6TS& CFG_REMOTE_STORAGELIMIT_GROUP)
	 * \endif
	 */
	public static String CFG_CMD_REMOTE_STORAGE_LIMIT      = "RemoteStorageLimit";       
	/**
	 * \if ENGLISH_LANG
	 * Special usage directory custom(corresponding to  CFG_SPECIAL_DIR_INFO)
	 * \else
	 * LXJbSCM>D?B<6(Re(6TS& CFG_SPECIAL_DIR_INFO)
	 * \endif
	 */
	public static String CFG_CMD_SPECIAL_DIR		    = "SpecialDirectoryDefine";    
	/**
	 * \if ENGLISH_LANG
	 * After shut down delay auto boot up config(corresponding to  CFG_AUTO_STARTUP_DELAY_INFO)
	 * \else
	 * 9X;z:sQSJ1WT6/?*;zEdVC(6TS& CFG_AUTO_STARTUP_DELAY_INFO)
	 * \endif
	 */
	public static String CFG_CMD_AUTO_STARTUP_DELAY    = "AutoStartupDelay";    		
	/**
	 * \if ENGLISH_LANG
	 * focus setup(corresponding to  CFG_VIDEO_IN_FOCUS)
	 * \else
	 * >[=9IhVC(6TS& CFG_VIDEO_IN_FOCUS)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOIN_FOCUS         = "VideoInFocus";         
	/**
	 * \if ENGLISH_LANG
	 * Encode self-adaptive config(corresponding to  CFG_ENCODE_ADAPT_INFO)
	 * \else
	 * 1`BkWTJJS&EdVC(6TS& CFG_ENCODE_ADAPT_INFO)
	 * \endif
	 */
	public static String CFG_CMD_ENCODE_ADAPT	    = "EncodeAdapt";    	
	/**
	 * \if ENGLISH_LANG
	 * Video analysis config(corresponding to CFG_VIDEO_ANALYSE_CALIBRATEAREA)
	 * \else
	 * JSF57VNv1j6(EdVC(6TS&CFG_VIDEO_ANALYSE_CALIBRATEAREA)
	 * \endif
	 */
	public static String CFG_CMD_VIDEOANALYSE_CALIBRATE    = "VideoAnalyseCalibrate";     
	/**
	 * \if ENGLISH_LANG
	 * PTZ preset config (corresponding to structure PTZ_PRESET_INFO)
	 * \else
	 * TFL(T$VC5cEdVC(6TS&=a99PTZ_PRESET_INFO)
	 * \endif
	 */
	public static String CFG_CMD_PTZ_PRESET             = "PtzPreset";           
	/**
	 * \if ENGLISH_LANG
	 * Period speed limit config(corresponding to structure CFG_TIMESPEEDLIMIT_LIST)
	 * \else
	 * J1<d6NO^KYV5EdVC(6TS&=a99Le CFG_TIMESPEEDLIMIT_LIST)
	 * \endif
	 */
	public static String CFG_CMD_TIMESPEEDLIMIT	    = "TimeSpeedLimit";    
	/**
	 * \if ENGLISH_LANG
	 * Prompt config(corresponding to structure CFG_VOICEALERT_LIST)
	 * \else
	 * SoRtLaJ>EdVC(6TS&=a99Le CFG_VOICEALERT_LIST)
	 * \endif
	 */
	public static String CFG_CMD_VOICEALERT		    = "VoiceAlert";    	
	/**
	 * \if ENGLISH_LANG
	 * Audio spirit(corresponding to  CFG_AUDIO_SPIRIT)
	 * \else
	 * SoRt<$@x(6TS& CFG_AUDIO_SPIRIT)
	 * \endif
	 */
	public static String CFG_CMD_AUDIO_SPIRIT	    = "AudioSpirit";
	
	public static String CFG_CMD_AUDIO_MATRIX_SILENCE = "AudioMatrixSilence"; // >2Rt>XUsEdVC(6TS& CFG_AUDIO_MATRIX_SILENCE)
	
	public static String CFG_CMD_AUDIO_MATRIX                = "AudioMatrixConfig";         // RtF5>XUsEdVC(6TS& CFG_AUDIO_MATRIX)
	
	/**
	 * \if ENGLISH_LANG
	 * Combine channel config (corresponding to  CFG_COMPOSE_CHANNEL)
	 * \else
	 * :O3IM(5@EdVC(6TS& CFG_COMPOSE_CHANNEL)
	 * \endif
	 */
	public static String CFG_CMD_COMPOSE_CHANNEL	    = "ComposeChannel";    
	
	public static String CFG_CMD_COMPOSE_LINKAGE         = "ComposeLinkage";            // :O3IM(5@EdVC  M%IsVw;zJ9SC#,V$NoGP;;9&D\(6TS& CFG_COMPOSE_CHANNEL)
	/**
	 * \if ENGLISH_LANG
	 * Lower matrix config(corresponding to  CFG_LOWER_MATRIX_LIST) 
	 * \else
	 * OBN;>XUsEdVC(6TS& CFG_LOWER_MATRIX_LIST)  	
	 * \endif
	 */
	public static String CFG_CMD_LOWER_MATRIX	    = "LowerMatrix";    
	
	public static String CFG_CMD_INFRARED_BOARD_TEMPLATE	 = "InfraredBoardTemplate";	// :lMbCf0eD#0e(6TS& CFG_INFRARED_BOARD_TEMPLATE_GROUP)
	public static String CFG_CMD_INFRARED_BOARD		 = "InfraredBoard";	// :lMbCf0eD#0e(6TS& CFG_INFRARED_BOARD_GROUP)
	public static String CFG_CMD_VIDEOIN_EXPOSURE     = "VideoInExposure";   // FX9bIhVC(6TS&CFG_VIDEOIN_EXPOSURE_INFO)
	
	public static String CFG_CMD_ACCESS_GENERAL       = "AccessControlGeneral"; // CE={;y1>EdVC(6TS& CFG_ACCESS_GENERAL_INFO)
	public static String CFG_CMD_ACCESS_EVENT         = "AccessControl";        // CE={JB<~EdVC(6TS& CFG_ACCESS_EVENT_INFO J}Wi)     
	public static String CFG_CMD_WIRELESS			 = "Wireless";			// N^O_MxBgA,=SIhVC(6TS& CFG_WIRELESS_INFO)
	public static String CFG_CMD_ALARMSERVER			 = "AlarmServer";		// 1(>/7~NqFwEdVC(6TS&CFG_ALARMCENTER_INFO)
	public static String CFG_CMD_COMMGLOBAL			 = "CommGlobal";		// 1(>/H+>VEdVC(6TS& CFG_COMMGLOBAL_INFO)
	public static String CFG_CMD_ANALOGALARM			 = "AnalogAlarm";		// D#DbA?1(>/M(5@EdVC(6TS&CFG_ANALOGALARM_INFO)
	public static String CFG_CMD_ALARMOUT			 = "AlarmOut";			// 1(>/Jd3vM(5@EdVC(6TS&CFG_ALARMOUT_INFO)
	public static String CFG_CMD_NTP					 = "NTP";				// J1<dM,2=7~NqFw(6TS&CFG_NTP_INFO)
	public static String CFG_CMD_ALARMBELL			 = "AlarmBell";			// >/:EEdVC(6TS&CFG_ALARMBELL_INFO)
	public static String CFG_CMD_MOBILE				 = "Mobile";			// RF6/O`9XR5NqEdVC(6TS&CFG_MOBILE_INFO)
	public static String CFG_CMD_PHONEEVENTNOTIFY	 = "PhoneEventNotify";	// (6TS&CFG_PHONEEVENTNOTIFY_INFO)
	public static String CFG_CMD_PSTN_ALARM_SERVER	 = "PSTNAlarmServer";	// 5g;01(>/VPPDEdVC(CFG_PSTN_ALARM_CENTER_INFO)
	public static String CFG_CMD_AUDIO_OUTPUT_VOLUME	 = "AudioOutputVolume";	// RtF5Jd3vRtA?(CFG_AUDIO_OUTPUT_VOLUME)
	public static String CFG_CMD_ALARMKEYBOARD		 = "AlarmKeyboard";		// 1(>/<|ELEdVC(CFG_ALARMKEYBOARD_INFO)
	public static String CFG_CMD_POWERFAULT			 = "PowerFault";		// 5gT49JUOEdVC(CFG_POWERFAULT_INFO)
	public static String CFG_CMD_CHASSISINTRUSION	 = "ChassisIntrusion";	// ;zOdHkGV1(>/(7@2p1(>/)EdVC(CFG_CHASSISINTRUSION_INFO)
	public static String CFG_CMD_EXALARMBOX			 = "ExAlarmBox";		// @)U91(>/:PEdVC (CFG_EXALARMBOX_INFO)
	public static String CFG_CMD_EXALARMOUTPUT		 = "ExAlarmOut";		// @)U91(>/Jd3vEdVC(CFG_EXALARMOUTPUT_INFO)
	public static String CFG_CMD_EXALARMINPUT		 = "ExAlarm";			// @)U91(>/JdHkEdVC(CFG_EXALARMINPUT_INFO)
	public static String CFG_CMD_ACCESSTIMESCHEDULE	 = "AccessTimeSchedule"; // CE={K"?(J1<d6N(CFG_ACCESS_TIMESCHEDULE_INFO)
	public static String CFG_CMD_URGENCY				 = "Emergency";			// =t<1JB<~EdVC(CFG_URGENCY_INFO)
	public static String CFG_CMD_SENSORSAMPLING		 = "SensorSampling";	// 4+8PFw2IQy(CFG_SENSORSAMPLING_INFO)
	public static String CFG_CMD_STP					 = "STP";				// ;7MxEdVC(CFG_STP_INFO)
	public static String CFG_CMD_ALARM_SUBSYSTEM		 = "AlarmSubSystem";	// 1(>/WSO5M3EdVC(CFG_ALARM_SUBSYSTEM_INFO)
	public static String CFG_CMD_BATTERY_LOW_POWER	 = "BatteryLowPowerAlarm";	// 5g3X5gA?5MEdVC(CFG_BATTERY_LOW_POWER_INFO)
	public static String CFG_CMD_SNAPLIKAGE           = "SnapLinkage";       // W%M<M(5@A*6/MbIhEdVC(CFG_SNAPLINKAGE_INFO)
	public static String CFG_CMD_AUDIOINPUT           = "AudioInput";        // RtF5JdHkEdVC(CFG_AUDIO_INPUT)
	public static String CFG_CMD_EMAIL				 = "Email";				// SJ<~7"KMEdVC(CFG_EMAIL_INFO)
	public static String CFG_CMD_TRAFFIC_TRANSFER_OFFLINE  = "TrafficTransferOffline";    // 4+Jd@kO_ND<~EdVC(TRAFFIC_TRANSFER_OFFLINE_INFO)
	public static String CFG_CMD_COMMSUBSCRIBE		 = "CommSubscribe";		// 6)TD4.?ZJ}>]EdVC(CFG_DEVCOMM_SUBSCRIBE)
	public static String CFG_CMD_PARKINGSPACE_LIGHT_STATE  = "ParkingSpaceLightState";    // 35N;W4L,6TS&5D35N;V8J>5F(CFG_PARKINGSPACE_LIGHT_STATE)
	public static String CFG_CMD_AIRCONDITION		 = "AirCondition";		// ?U5wIh18EdVC(CFG_AIRCONDITION_INFO)
	public static String CFG_CMD_COMPRESS_PLAY        = "CompressPlay";      //Q9Ku;X7EEdVC(CFG_COMPRESS_PLAY_INFO)
	public static String CFG_CMD_BUILDING             = "Building";          // VTOB%2cEdVC(CFG_BUILDING_INFO)
	public static String CFG_CMD_BUILDING_EXTERNAL    = "BuildingExternal";  // VTOB%2c@)U9EdVC(CFG_BUILDING_EXTERNAL_INFO)
	public static String CFG_CMD_DIALRULE             = "DialRule";          // 2&:E9fTr(CFG_DIALRULE_INFO)
	public static String CFG_CMD_OIL_MASS_INFO        = "OilMassInfo";       // 35A>SMOdEdVC(CFG_OIL_MASS_INFO)
	public static String CFG_CMD_FISHEYE_INFO         = "FishEye";           // ScQ[OjO8PEO"EdVC(CFG_FISHEYE_DETAIL_INFO)
	public static String CFG_CMD_VTNOANSWER_FORWARD   = "VTNoAnswerForward"; // F=L(OB7":t=PN^S&4pW*RFEdVCAP1m(CFG_VT_NOANSWER_FORWARD_INFO)
	public static String CFG_CMD_VTO_CALL             = "VTOCall";           // VTO:t=PEdVC(CFG_VTO_CALL_INFO)
	public static String CFG_CMD_MACCONFLICT          = "MacConflict";       // MAC3eM;1(>/EdVC(CFG_MACCONFLICT_INFO)
	public static String CFG_CMD_IDLEMOTION_INFO      = "IdleMotion";        // ?UOP6/WwEdVC(CFG_IDLE_MOTION_INFO)
	public static String CFG_CMD_MONITORWALL_COLL_TOUR  = "MonitorWallCollectionTour";   // 5gJSG=T$08BVQ2EdVC(CFG_MONITORWALL_COLLECTION_TOUR_INFO)
	public static String CFG_CMD_PSTN_BREAK_LINE      = "PSTNBreakLine";     // PSTN6OO_JB<~EdVC(CFG_PSTN_BREAK_LINE_INFO)
	public static String CFG_CMD_NET_COLLECTION       = "NetCollection";	    // MxBg2I</Ih18EdVC(CFG_NET_COLLECTION_INFO)
	public static String CFG_CMD_ALARM_SLOT_BOND      = "AlarmSlotBond";     // PiDbSlot=Z5cSk>_LeNo@mIh185D6TS&9XO5(CFG_ALARM_SLOT_BOND_INFO)
	public static String CFG_CMD_TRAFFICSTROBE        = "TrafficStrobe";     // 5@U"EdVC(CFG_TRAFFICSTROBE_INFO)
	public static String CFG_CMD_TRAFFICVOICE         = "TrafficVoiceBroadcast";         // VGD\=;M(SoRt2%1(EdVC(CFG_TRAFFICVOICE_BROADCAST)
	public static String CFG_CMD_STANDING_TIME        = "StandingTime";      // M#35J1<dEdVC(CFG_STANDING_TIME_INFO)
	public static String CFG_CMD_ENCLOSURE_TIME_SCHEDULE   = "EnclosureTimeSchedule";     // 5gWSN'@81(>/J1<d6NEdVC(CFG_ENCLOSURE_TIME_SCHEDULE_INFO)
	public static String CFG_CMD_ECKCONFIG			 = "ECKConfig";			// M#353!3vHk?Z?XVFFwEdVC(CFG_ECKCONFIG_INFO)
	public static String CFG_CMD_PARKING_CARD         = "ParkingCard";       // M#353!3vHk?ZK"?(1(>/JB<~EdVC(CFG_PARKING_CARD_INFO)
	public static String CFG_CMD_RCEMERGENCY_CALL      = "RCEmergencyCall";  // =t<1:t=P1(>/JB<~EdVC(CFG_RCEMERGENCY_CALL_INFO)
	public static String CFG_CMD_LANES_STATE_REPORT    = "LanesStateReport"; // 355@PEO"IO1(EdVC(CFG_LANES_STATE_REPORT)
	public static String CFG_CMD_OPEN_DOOR_GROUP      = "OpenDoorGroup";     // 6`HK6`?*CE7=J=Wi:OEdVC(CFG_OPEN_DOOR_GROUP_INFO)
	public static String CFG_CMD_OPEN_DOOR_ROUTE      = "OpenDoorRoute";     // ?*CEB7O_</:O#,;r3F7@74G1B7O_EdVC(CFG_OPEN_DOOR_ROUTE_INFO)
	public static String CFG_CMD_BURNPLAN             = "BurnPlan";          // ?LB<<F;.EdVC(6TS&CFG_BURNPLAN_INFO)
	public static String CFG_CMD_SCADA_DEV            = "SCADADev";          // <l2b2I</Ih18EdVC(CFG_SCADA_DEV_INFO)
	public static String CFG_CMD_VSP_GAYS             = "VSP_GAYS";          // 9+02R;KyF=L(=SHkEdVC(CFG_VSP_GAYS_INFO)
	public static String CFG_CMD_AUDIODETECT          = "AudioDetect";       // RtF5<l2b1(>/EdVC(CFG_AUDIO_DETECT_INFOJ}Wi)
	public static String CFG_CMD_GUIDESCREEN          = "GuideScreen";       // SU5<FAO5M3EdVC(CFG_GUIDESCREEN_INFO)
	public static String CFG_CMD_VTS_CALL_INFO        = "VTSCallInfo";       // VTS:t=PEdVC(CFG_VTS_CALL_INFO)
	public static String CFG_CMD_DEV_LIST             = "DevList";           // Ih18AP1mEdVC(CFG_DEV_LIST_INFO)
	public static String CFG_CMD_CALIBRATE_MATRIX     = "CalibrateMatrix";   // Vw4SJ=8zWYFw1j6(>XUsEdVC(CFG_CALIBRATE_MATRIX_INFO)
	public static String CFG_CMD_DEFENCE_AREA_DELAY   = "DefenceAreaDelay";  // 7@GxQSJ1EdVC(CFG_DEFENCE_AREA_DELAY_INFO)
	
	public static String CFG_CMD_THERMO_GRAPHY		        = "ThermographyOptions";       // HH3IOqIcOqM7JtPTEdVC(CFG_THERMOGRAPHY_INFO)
	public static String CFG_CMD_THERMOMETRY_RULE	        = "ThermometryRule";           // HH3IOq2bNB9fTrEdVC(CFG_RADIOMETRY_RULE_INFO)
	public static String CFG_CMD_TEMP_STATISTICS		        = "TemperatureStatistics";     // NB6HM3<FEdVC(CFG_TEMP_STATISTICS_INFO)
	public static String CFG_CMD_THERMOMETRY			        = "HeatImagingThermometry";    // HH3IOq2bNBH+>VEdVC(CFG_THERMOMETRY_INFO)
	public static String CFG_CMD_LIGHTING                    = "Lighting";                  // 5F9bIhVC(CFG_LIGHTING_INFO)
	public static String CFG_CMD_RAINBRUSHMODE               = "RainBrushMode";             // SjK"D#J=O`9XEdVC(6TS& CFG_RAINBRUSHMODE_INFOJ}Wi)
	public static String CFG_CMD_LIGHTINGSCHEDULE            = "LightingSchedule";			// 5F9b<F;.EdVC(6TS& CFG_LIGHTINGSCHEDULE_INFO)
	public static String CFG_CMD_EMERGENCY_RECORD_FOR_PULL   = "EmergencyRecordForPull";    // =t<1B<Oq4f4"EdVC#,SCSZ?M;'6KVw6/@-5D7=J=!#TZ?M;'6K@-Aw4f4"Rl3#V.:s#,=xPP=t<1B<Oq4f4"(CFG_EMERGENCY_RECORD_FOR_PULL_INFO)
	public static String CFG_CMD_ALARM_SHIELD_RULE           = "AlarmShieldRule";           // 8f>/FA1N9fTr(CFG_ALARM_SHIELD_RULE_INFO)
	public static String CFG_CMD_VIDEOIN_ANALYSERULE         = "VideoInAnalyseRule";        // JSF5M(5@VGD\9fTrEdVC(CFG_VIDEOIN_ANALYSE_RULE_INFO)
	public static String CFG_CMD_ACCESS_WORK_MODE            = "AccessWorkMode";            // CEKx9$WwD#J=(6TS& CFG_ACCESS_WORK_MODE_INFO J}Wi)
	public static String CFG_CMD_VIDEO_TALK_PHONE_GENERAL    = "VideoTalkPhoneGeneral";     // JSF56T=25g;0M(SCEdVC(CFG_VIDEO_TALK_PHONE_GENERAL)
	public static String CFG_CMD_TRAFFIC_SNAP_MOSAIC         = "TrafficSnapMosaic";         // W%M<:O3IEdVC(6TS& CFG_TRAFFIC_SNAP_MOSAIC_INFO)
	public static String CFG_CMD_SCENE_SNAP_RULE             = "SceneSnapShotWithRule";     // 3!>0W%EDIhVC(6TS& CFG_SCENE_SNAPSHOT_RULE_INFO)
	public static String CFG_CMD_PTZTOUR                     = "PtzTour";                   // TFL(Q2:=B7>6EdVC(6TS& CFG_PTZTOUR_INFO)
	public static String CFG_CMD_VTO_INFO		            = "VTOInfo";		            // CE?Z;zEdVC(6TS& CFG_VTO_LIST)
	public static String CFG_CMD_TS_POINT                    = "TSPoint";                   // 4%C~FAP#W<EdVC(6TS& CFG_TSPOINT_INFO)
	public static String CFG_CMD_VTH_NUMBER_INFO             = "VTHNumberInfo";             // JRDZ;z:EBkPEO"(6TS& CFG_VTH_NUMBER_INFO)
	public static String CFG_CMD_GPS                         = "GPS";                       // GPSEdVC(6TS& CFG_GPS_INFO_ALL)
	public static String CFG_CMD_VTO_BASIC_INFO		        = "VTOBasicInfo";		        // VTO;y1>PEO" (6TS& CFG_VTO_BASIC_INFO)
	public static String CFG_CMD_SHORTCUT_CALL		        = "ShortcutCall";		        // ?l=]:EEdVC (6TS& CFG_SHORTCUT_CALL_INFO)
	public static String CFG_CMD_GPS_LOCATION_VER            = "GPSLocationVersion";        // <GB<</GPSLocation5D0f1>:E(6TS& CFG_LOCATION_VER_INFO)
	public static String CFG_CMD_PARKING_SPACE_ACCESS_FILTER = "ParkingSpaceAccessFilter";  // Ih18?I7CNJ5XV79}BKEdVC(6TS& CFG_PARKING_SPACE_ACCESS_FILTER_INFO)
	public static String CFG_CMD_WORK_TIME                   = "WorkTime";                  // 9$WwJ1<dEdVC(6TS& CFG_WORK_TIME_INFO)
	public static String CFG_CMD_PARKING_SPACE_LIGHT_GROUP   = "ParkingSpaceLightGroup";    // 35N;V8J>5F1>;zEdVC(6TS& CFG_PARKING_SPACE_LIGHT_GROUP_INFO_ALL)
	public static String CFG_CMD_CUSTOM_AUDIO                = "CustomAudio";               // WT6(ReRtF5EdVC(CFG_CUSTOM_AUDIO)
	public static String CFG_CMD_WIFI_SEARCH                 = "AroudWifiSearch";           // Ih18M(9}wifiD#?iI(ChV\N'N^O_Ih18EdVC(6TS& CFG_WIFI_SEARCH_INFO)
	public static String CFG_CMD_G3G4AUTOCHANGE              = "G3G4AutoChange";            // 35TXIh18M(PED#?i3G 4GWT6/GP;;(CFG_G3G4AUTOCHANGE)
	public static String CFG_CMD_CHECKCODE                   = "CheckCode";                 // K"?(;zP#QiBkP#QiEdVC(6TS& CFG_CHECKCODE_INFO)
	public static String CFG_CMD_VSP_SCYDKD                  = "VSP_SCYDKD";                // KD4(RF6/?45jFt5OF=L(=SHkEdVC(6TS& CFG_VSP_SCYDKD_INFO)
	public static String CFG_CMD_VIDEOIN_DAYNIGHT           = "VideoInDayNight";           // Gr;z;zP>HUR9EdVC(6TS& CFG_VIDEOIN_DAYNIGHT_INFO)
	public static String CFG_CMD_PTZ_POWERUP                = "PowerUp";                   // TFL(?*;z6/WwIhVC(6TS& CFG_PTZ_POWERUP_INFO)
	public static String CFG_CMD_AUDIO_MIX_CHANNEL          = "AudioMixChannel";           // EdVC6(ReC?8v4?RtF5M(5@5DWi3I(6TS& CFG_AUDIO_MIX_CHANNEL_INFO_ALL)
	public static String CFG_CMD_AUDIO_TOUCH                = "AudioTouch";                // 1dRt#,6TRt5w=xPP1d;/(6TS& CFG_AUDIO_TOUCH_INFO_ALL)
	public static String CFG_CMD_VIDEO_MOSAIC				= "VideoMosaic";				// BmH|?K5~<SEdVC(6TS&CFG_VIDEO_MOSAIC_INFO)
	public static String CFG_CMD_VTH_REMOTE_IPC_INFO        = "VTHRemoteIPCInfo";          // VTHVPT63LIPCEdVC(6TS& CFG_VTH_REMOTE_IPC_INFO)#,8CEdVCJGH+>V5D#,2;Gx7VM(5@
	public static String CFG_CMD_UNFOCUSDETECT              = "UnFocusDetect";             // Pi=9<l2bEdVC(6TS&CFG_UNFOCUSDETECT_INFO)
	public static String CFG_CMD_MOVE_DETECT				= "MovedDetect";				// 3!>01d8|<l2bEdVC(6TS&CFG_MOVE_DETECT_INFO)
	public static String CFG_CMD_FLOODLIGHT                 = "Floodlight";                // 7@;$2UUUCw5F?XVFEdVC(6TS&CFG_FLOODLIGHT_CONTROLMODE_INFO)
	public static String CFG_CMD_AIRFAN                     = "AirFan";                    // 7@;$2U7gIH?XVFEdVC(6TS&CFG_AIRFAN_CONTROLMODE_INFO)
	public static String CFG_CMD_WLAN                       = "WLan";                      // WLANEdVC(6TS& CFG_NETAPP_WLAN)
	public static String CFG_CMD_SMART_ENCODE				= "SmartEncode";               // Smart H2641`Bk7=J=(6TS& CFG_SMART_ENCODE_INFO)
	public static String CFG_CMD_COURSE_CHANNELBIND         = "CourseChannelBind";		   // B<2%Vw;zM(5@0s6(9XO5EdVC(6TS&=a99Le  CFG_COURSE_CHANNELBIND_INFO) 
		
	
	/************************************************************************
	 ** D\A&</C|An  6TS&CLIENT_QueryNewSystemInfo
	 ***********************************************************************/
	public static String CFG_CAP_CMD_VIDEOANALYSE   =   "devVideoAnalyse.getCaps"   ;   		// JSF57VNvD\A&</(6TS&CFG_CAP_ANALYSE_INFO)
	public static String CFG_NETAPP_REMOTEDEVICE	   =   "netApp.getRemoteDeviceStatus"   ;   	// ;qH!:s6KIh185D5DTZO_W4L,(6TS&CFG_REMOTE_DEVICE_STATUS)
	public static String CFG_CAP_CMD_PRODUCTDEFINITION   =   "magicBox.getProductDefinition"   ;   // =SHkIh18PEO"
	public static String CFG_DEVICE_CAP_CMD_VIDEOANALYSE   =   "intelli.getVideoAnalyseDeviceChannels"   ;     // Ih18VGD\7VNvD\A&(6TS&CFG_CAP_DEVICE_ANALYSE_INFO)<fH]@OIh18
	public static String CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE   =   "devVideoAnalyse.factory.getCollect"   ;    // Ih18VGD\7VNvD\A&(6TS&CFG_CAP_DEVICE_ANALYSE_INFO)
	public static String CFG_CAP_CMD_CPU_COUNT    =   "magicBox.getCPUCount"   ;                 // ;q5CCPU8vJ}
	public static String CFG_CAP_CMD_CPU_USAGE    =   "magicBox.getCPUUsage"   ;                 // ;qH!CPUU<SCBJ
	public static String CFG_CAP_CMD_MEMORY_INFO    =   "magicBox.getMemoryInfo"   ;             // ;q5CDZ4fH]A?
	public static String CFG_CAP_CMD_DEVICE_STATE   =   "trafficSnap.getDeviceStatus"   ;        // ;qH!Ih18W4L,PEO" (6TS&CFG_CAP_TRAFFIC_DEVICE_STATUS)
	public static String CFG_CAP_CMD_VIDEOINPUT   =   "devVideoInput.getCaps"   ;                // JSF5JdHkD\A&</(6TS&CFG_CAP_VIDEOINPUT_INFO)
	public static String CFG_USERMANAGER_ACTIVEUSER      =   "userManager.getActiveUserInfoAll"   ;        // 5C5=KySP;n6/5DSC;'PEO"(6TS&CFG_ACTIVEUSER_INFO)
	public static String CFG_CAP_VIDEOSTAT_SUMMARY       =   "videoStatServer.getSummary"   ;              // ;qH!JSF5M3<FU*R*PEO"(6TS&CFG_VIDEOSATA_SUMMARY_INFO)
	public static String CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER   =   "videoDiagnosisServer.getCaps"   ;   		// ;qH!JSF5Uo6O7~NqD\A&(CFG_VIDEODIAGNOSIS_CAPS_INFO)
	public static String CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT            =   "videoDiagnosisServer.factory.getCollect"   ;               // ;qH!JSF5Uo6OM(5@J}D?(CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO)
	public static String CFG_CMD_VIDEODIAGNOSIS_GETSTATE              =   "videoDiagnosisServer.getState"   ;                         // ;qH!JSF5Uo6O=xPPW4L,(CFG_VIDEODIAGNOSIS_STATE_INFO)
	public static String CFG_CAP_CMD_SERVICE_LIST                     =   "system.listService"   ;          //;qH!7~NqFwIOV'3V5D7~NqAP1m(CFG_DEV_SERVICE_LIST)
	public static String CFG_CAP_CMD_EVENTHANDLER      =   "capsManager.get&EventManagerEventHandler"   ;         // ;qH!7~NqFw1(>/A*6/D\A&</(CFG_CAP_EVENTHANDLER_INFO)
	public static String CFG_CAP_ALARM                 =   "alarm.getAlarmCaps"   ;                               // ;qH!1(>/D\A&</(CFG_CAP_ALARM_INFO)
	public static String CFG_CAP_CMD_AUDIO_ANALYSE     =   "devAudioAnalyse.getCaps"   ;                          // ;qH!RtF57VNvD\A&</(CFG_CAP_AUDIO_ANALYSE_INFO)
	public static String CFG_CMD_MASTERSLAVE_GETCOLLECT          =   "masterSlaveTracker.factory.getCollect"   ;      // ;qH!Vw4SJ=8zWYFwM(5@J}D?(6TS&=a99LeCFG_MASTERSLAVETRACKER_INFO)
	public static String CFG_CAP_CMD_MASTERSLAVE                 =   "capsManager.get&MasterSlaveTracker"   ;         // ;qH!Vw4SJ=Ih18D\A&</(CFG_CAP_MASTERSLAVE_INFO)
	public static String CFG_CAP_CMD_FOCUS_STATE	   =   "devVideoInput.getFocusStatus"   ;   					// ;qH!>5M7>[=9W4L,PEO" (6TS&CFG_CAP_FOCUS_STATUS)
	public static String CFG_CAP_CMD_NETAPP            =   "netApp.getCaps"   ;                                      // ;qH!MxBgS&SCD\A&</(6TS&CFG_CAP_NETAPP)
	public static String CFG_CAP_CMD_PTZ_ENABLE     =   "ptz.factory.instance"   ;   				// ;qH!TFL(V'3VPEO"(CFG_CAP_PTZ_ENABLEINFO )
	public static String CFG_CAP_CMD_RECORD		   =   "recordManager.getCaps"   ;                   // ;qH!B<OqD\A&</(CFG_CAP_RECORD_INFO)
	public static String CFG_CAP_CMD_BURN_MANAGER      =   "BurnManager.getCaps"   ;                     // ;qH!?LB<9\@mD\A&</( CFG_CAP_BURN_MANAGER)
	public static String CFG_CAP_CMD_PTZ     	   =   "ptz.getCurrentProtocolCaps"   ;   		// ;qH!TFL(D\A&</(CFG_PTZ_PROTOCOL_CAPS_INFO)
	public static String CFG_CMD_ENCODE_GETCAPS        =   "encode.getCaps"   ;                          // ;qH!1`BkD\A&</(CFG_ENCODECAP)
	public static String CFG_CAP_CMD_VIDEOINPUT_EX     =   "devVideoInput.getCapsEx"   ;                 // JSF5JdHkD\A&</@)U9(6TS&CFG_CAP_VIDEOINPUT_INFO_EX)
	public static String CFG_CAP_CMD_ANALYSE_MODE      =   "intelli.getCaps.AnalyseMode"   ;             // ;qH!Ih18VGD\7VNvD#J=(6TS& CFG_ANALYSE_MODE)
	public static String CFG_CAP_CMD_EVENTMANAGER      =   "eventManager.getCaps"   ;   		// ;qH!Ih181(>/A*6/D\A&,@OP-RiRQ7O3},PB?*7"GkJ9SC8CWV6N(CFG_CAP_EVENTMANAGER_INFO)
	public static String CFG_CAP_CMD_FILEMANAGER	   =   "FileManager.getCaps"   ;   		// ;qH!ND<~D\A&(CFG_CAP_FILEMANAGER)
	public static String	CFG_CAP_CMD_LOG			   =   "log.getCaps"   ;   				// ;qH!HUV>7~NqD\A&(CFG_CAP_LOG)
	public static String CFG_CAP_CMD_SPEAK		   =   "speak.getCaps"   ;   				// QoIyFw2%7ED\A&(CFG_CAP_SPEAK)
	public static String CFG_CAP_CMD_ACCESSCONTROLMANAGER   =   "accessControlManager.getCaps"   ;   // CE={D\A&(CFG_CAP_ACCESSCONTROL)
	public static String CFG_CAP_CMD_EXALARM		   =   "alarm.getExAlarmCaps"   ;   				// ;qH!@)U91(>/D\A&</, (6TS&=a99Le CFG_CAP_EXALARM_INFO)
	public static String CFG_CAP_CMD_EXALARMBOX	   =   "alarm.getExAlarmBoxCaps"   ;   			// ;qH!@)U91(>/:PD\A&</, (6TS&=a99Le CFG_CAP_EXALARMBOX_INFO)
	public static String CFG_CAP_CMD_RECORDFINDER   =   "RecordFinder.getCaps"   ;   				// ;qH!2iQ/<GB<D\A&</, (6TS&=a99Le CFG_CAP_RECORDFINDER_INFO)
	public static String CFG_CAP_CMD_ANALOGALARM	   =   "AnalogAlarm.getCaps"   ;   		// D#DbA?1(>/JdHkM(5@D\A&(6TS&=a99Le CFG_CAP_ANALOGALARM)
	public static String CFG_CAP_CMD_LOWRATEWPAN	   =   "LowRateWPAN.getCaps"   ;   		// ;qH!LowRateWPAND\A&(6TS&5D=a99Le CFG_CAP_LOWRATEWPAN)	
	
  	/**
	 * \if ENGLISH_LANG
	 * Max length of backup file name
	 * \else
	 * Wn4s187]C{3F3$6H	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUP_NAME = 32;			
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup device
	 * \else
	 * Wn4s187]Ih188vJ}	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPDEV_NUM = 16;
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup file 
	 * \else
	 * Wn4s187]ND<~8vJ}	
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPRECORD_NUM = 1024;	
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * Wn4sCAN8vJ}
	 * \endif
	 */
	public static final int MAX_CAN_COUNT = 16;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Max length of audio file path 
	 * \else
	 * Wn4sRtF5ND<~B73$6H	
	 * \endif
	 */	
	public static final int SDK_MAX_AUDIO_PATH_1 = 260;			//Wn4sRtF5ND<~B73$6H
	
	public static final int NET_MAX_FRAMESEQUENCE_NUM     = 2;
	public static final int NET_MAX_TIMESTAMP_NUM         = 2;
	
	/* MAC9}BKEdVC */
	public static final int SDK_MACFILTER_NUM             = 512;             // MAC
	
	/* MAC,IP9}BKEdVC */
	public static final int SDK_MACIPFILTER_NUM           = 512;            // MAC,IP
	
	public static final int ARM_DISARM_ZONE_MAX           = 256;            // 7@GxWn4s8vJ}
	
	public static final int NET_DEV_CAP_SEQPOWER            = 0x01;                // 5gT4J1PrFwD\A&, pInBuf=NET_IN_CAP_SEQPOWER*, pOutBuf=NET_OUT_CAP_SEQPOWER*
	public static final int NET_ENCODE_CFG_CAPS             = 0x02;                // Ih181`BkEdVC6TS&D\A&, pInBuf=NET_IN_ENCODE_CFG_CAPS*, pOutBuf= NET_OUT_ENCODE_CFG_CAPS*
	public static final int NET_VIDEOIN_FISHEYE_CAPS        = 0x03;                // ScQ[D\A&, pInBuf=NET_IN_VIDEOIN_FISHEYE_CAPS*, pOutBuf=NET_OUT_VIDEOIN_FISHEYE_CAPS*
	
	// Ih18PEO"@`PM#,6TS&CLIENT_QueryDevInfo=S?Z
	public static final int  NET_QUERY_DEV_STORAGE_NAMES            = 0x01;                // 2iQ/Ih185D4f4"D#?iC{AP1m , pInBuf=NET_IN_STORAGE_DEV_NAMES *, pOutBuf=NET_OUT_STORAGE_DEV_NAMES *
	public static final int  NET_QUERY_DEV_STORAGE_INFOS            = 0x02;                // 2iQ/Ih185D4f4"D#?iPEO"AP1m, pInBuf=NET_IN_STORAGE_DEV_INFOS*, pOutBuf= NET_OUT_STORAGE_DEV_INFOS *
	public static final int  NET_QUERY_RECENCY_JNNCTION_CAR_INFO    = 0x03;                // 2iQ/Wn=|5D?(?Z35A>PEO"=S?Z, pInBuf=NET_IN_GET_RECENCY_JUNCTION_CAR_INFO*, pOutBuf=NET_OUT_GET_RECENCY_JUNCTION_CAR_INFO*
	public static final int  NET_QUERY_LANES_STATE                  = 0x04;                // 2iQ/355@PEO",pInBuf = NET_IN_GET_LANES_STATE , pOutBuf = NET_OUT_GET_LANES_STATE
	public static final int  NET_QUERY_DEV_FISHEYE_WININFO          = 0x05;                // 2iQ/ScQ[40?ZPEO" , pInBuf= NET_IN_FISHEYE_WININFO*, pOutBuf=NET_OUT_FISHEYE_WININFO *
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO       = 0x06;                // 2iQ/T63LIh18PEO" , pInBuf= NET_IN_GET_DEVICE_INFO*, pOutBuf= NET_OUT_GET_DEVICE_INFO *
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL   = 0x07;                // 2iQ/KySPT63LIh18PEO" , pInBuf= NET_IN_GET_DEVICE_INFO_ALL*, pOutBuf= NET_OUT_GET_DEVICE_INFO_ALL *
	public static final int NET_QUERY_REG_DEVICE_NET_INFO               = 0x08;                // 2iQ/Vw6/W"2aIh185DMxBgA,=S , pInBuf=NET_IN_REGDEV_NET_INFO * , pOutBuf=NET_OUT_REGDEV_NET_INFO *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_PRESET          = 0x09;                // 2iQ/HH3IOqT$IhPEO" , pInBuf= NET_IN_THERMO_GET_PRESETINFO*, pOutBuf= NET_OUT_THERMO_GET_PRESETINFO *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_OPTREGION       = 0x0a;                // 2iQ/HH3IOq8PPKH$GxSrPEO",pInBuf= NET_IN_THERMO_GET_OPTREGION*, pOutBuf= NET_OUT_THERMO_GET_OPTREGION *
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO      = 0x0b;                // 2iQ/HH3IOqMb2?O5M3PEO", pInBuf= NET_IN_THERMO_GET_EXTSYSINFO*, pOutBuf= NET_OUT_THERMO_GET_EXTSYSINFO *
	public static final int NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER       = 0x0c;                // 2iQ/2bNB5c5D2NJ}V5, pInBuf= NET_IN_RADIOMETRY_GETPOINTTEMPER*, pOutBuf= NET_OUT_RADIOMETRY_GETPOINTTEMPER *
	public static final int NET_QUERY_DEV_RADIOMETRY_TEMPER             = 0x0d;                // 2iQ/2bNBOn5D2NJ}V5, pInBuf= NET_IN_RADIOMETRY_GETTEMPER*, pOutBuf= NET_OUT_RADIOMETRY_GETTEMPER *
	public static final int NET_QUERY_GET_CAMERA_STATE                  = 0x0e;                // ;qH!IcOq;zW4L,, pInBuf= NET_IN_GET_CAMERA_STATEINFO*, pOutBuf= NET_OUT_GET_CAMERA_STATEINFO *
	public static final int NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE   = 0x0f;                // ;qH!T63LM(5@RtF51`Bk7=J=, pInBuf= NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO*, pOutBuf= NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO *
	public static final int NET_QUERY_GET_COMM_PORT_INFO                = 0x10;                // ;qH!Ih184.?ZPEO", pInBuf=NET_IN_GET_COMM_PORT_INFO* , pOutBuf=NET_OUT_GET_COMM_PORT_INFO* 
	public static final int NET_QUERY_GET_LINKCHANNELS                  = 0x11;                // 2iQ/D3JSF5M(5@5D9XA*M(5@AP1m,pInBuf=NET_IN_GET_LINKCHANNELS* , pOutBuf=NET_OUT_GET_LINKCHANNELS*
	public static final int NET_QUERY_GET_VIDEOOUTPUTCHANNELS           = 0x12;                // ;qH!=bBkM(5@J}A?M3<FPEO", pInBuf=NET_IN_GET_VIDEOOUTPUTCHANNELS*, pOutBuf=NET_OUT_GET_VIDEOOUTPUTCHANNELS*
	public static final int NET_QUERY_GET_VIDEOINFO                     = 0x13;                // ;qH!=bBkM(5@PEO", pInBuf=NET_IN_GET_VIDEOINFO*, pOutBuf=NET_OUT_GET_VIDEOINFO*
	public static final int NET_QUERY_GET_ALLLINKCHANNELS               = 0x14;                // 2iQ/H+2?JSF59XA*M(5@AP1m,pInBuf=NET_IN_GET_ALLLINKCHANNELS* , pOutBuf=NET_OUT_GET_ALLLINKCHANNELS*
	public static final int NET_QUERY_VIDEOCHANNELSINFO                 = 0x15;                // 2iQ/JSF5M(5@PEO",pInBuf=NET_IN_GET_VIDEOCHANNELSINFO* , pOutBuf=NET_OUT_GET_VIDEOCHANNELSINFO*
	public static final int NET_QUERY_TRAFFICRADAR_VERSION              = 0x16;                // 2iQ/@W4oIh180f1>,pInBuf=NET_IN_TRAFFICRADAR_VERSION* , pOutBuf=NET_OUT_TRAFFICRADAR_VERSION*
	public static final int NET_QUERY_WORKGROUP_NAMES                   = 0x17;                // 2iQ/KySP5D9$WwD?B<WiC{,pInBuf=NET_IN_WORKGROUP_NAMES* , pOutBuf=NET_OUT_WORKGROUP_NAMES*
	public static final int NET_QUERY_WORKGROUP_INFO                    = 0x18;                // 2iQ/9$WwWiPEO",pInBuf=NET_IN_WORKGROUP_INFO* , pOutBuf=NET_OUT_WORKGROUP_INFO*
	public static final int NET_QUERY_WLAN_ACCESSPOINT                  = 0x19;                // 2iQ/N^O_MxBg=SHk5cPEO",pInBuf=NET_IN_WLAN_ACCESSPOINT* , pOutBuf=NET_OUT_WLAN_ACCESSPOINT*

	public static final int  MAX_LOG_PATH_LEN             = 260;                // HUV>B7>6C{Wn4s3$6H
	
	public static final int   MAX_REGISTER_ID_LEN        = (256);
	public static final int   MAX_APP_ID_LEN             = (256);
	public static final int   MAX_URL_LEN                = (1024);
	public static final int   MAX_IOS_CERTIFICATE_LEN     = (1024 * 14);
	public static final int   MAX_IOS_SECRET_KEY_LEN      = (512);
	public static final int   MAX_MOBILE_CHANNEL_NUM      = (256);
	
	public static final int  MAX_GOURP_NUM               =  128 ;             //HKA3?bWn4s8vJ}
	
	// 1`BkD#J=AP1m#,SCSZSk1`BkD#J=QZBk=xPPSk!";r2YWw
	public static final int SDK_CAPTURE_COMP_DIVX_MPEG4        = 0x00000001;
	public static final int SDK_CAPTURE_COMP_MS_MPEG4          = 0x00000002;
	public static final int SDK_CAPTURE_COMP_MPEG2             = 0x00000004;
	public static final int SDK_CAPTURE_COMP_MPEG1             = 0x00000008;
	public static final int SDK_CAPTURE_COMP_H263              = 0x00000010;
	public static final int SDK_CAPTURE_COMP_MJPG              = 0x00000020;
	public static final int SDK_CAPTURE_COMP_FCC_MPEG4         = 0x00000040;
	public static final int SDK_CAPTURE_COMP_H264              = 0x00000080;
	public static final int SDK_CAPTURE_COMP_H265              = 0x00000100;
	
	public static final int MAX_SCENE_COUNT                    = 8;
	
	
	public static final int UPDATE_VERSION_LEN = 64;
	
	/**
	 * \if ENGLISH_LANG
	 * max dev comm number
	 * \else
	 * Wn4s4.?Z8v
	 * \endif
	 */
	public static final int MAX_DEVCOMM_NUM = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Judicial device level 2 switch level 1 split supported input channel
	 * \else
	 * K>7(Ih186~<6GP;;J15ZR;<6splitV'3V5DJdHkM(5@J}
	 * \endif
	 * 
	 */
	public static final int SDK_SPLIT_INPUT_NUM = 256;
	
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum Audio Matrix Input Channels
	 * \else
	 * RtF5>XUsWn4sJdHkM(5@J}
	 * \endif
	 * 
	 */
	public static final int CFG_MAX_AUDIO_MATRIX_INPUT = 32;
	
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Maximum OutPut Channels Of Each Audio Matrix
	 * \else
	 * C?8vRtF5>XUsV'3V5DWn4sJd3vM(5@J}
	 * \endif
	 * 
	 */
	public static final int SDK_MAX_AUDIO_MATRIX_OUTPUT = 8;
	
	// 6)TDBusW4L,6TS&JB<~IO1((INetSDK.AttachBusState)
	public static final int SDK_ALARM_BUS_DRIVER_CHECK         = 0x0001;           // K>;zG)5=JB<~(6TS&=a99Le ALARM_BUS_DRIVER_CHECK_INFO)
	public static final int SDK_ALARM_BUS_IMPORT_SITE          = 0x0002;           // =xU>JB<~(6TS&=a99Le ALARM_BUS_IMPORT_SITE_INFO)
	public static final int SDK_ALARM_BUS_EXPORT_SITE          = 0x0003;           // @kU>JB<~(6TS&=a99Le ALARM_BUS_EXPORT_SITE_INFO)
	public static final int SDK_ALARM_BUS_ABNORMAL             = 0x0004;           // 35A>Rl3#JB<~(6TS&=a99Le ALARM_BUS_ABNORMAL_INFO)
	public static final int SDK_ALARM_BUS_DOOR_OPEN            = 0x0005;           // 35CE4r?*JB<~(6TS&=a99Le ALARM_VEHICLE_DOOR_OPEN_INFO)
	public static final int SDK_ALARM_BUS_CUR_MILEAGE          = 0x0006;           // 51G0@o3LJB<~(6TS&=a99Le ALARM_BUS_CUR_MILEAGE_INFO)
	public static final int SDK_ALARM_BUS_CUR_OIL              = 0x0007;           // 51G0SM:DGi?vJB<~(6TS&=a99Le ALARM_BUS_CUR_OIL_INFO)
	public static final int SDK_ALARM_BUS_LOW_OIL              = 0x0008;           // 5MSMA?1(>/JB<~(6TS&=a99Le ALARM_BUS_LOW_OIL_INFO)
	public static final int SDK_ALARM_BUS_PASSENGER_CARD_CHECK = 0x0009;           // 3K?MK"?(JB<~(6TS&=a99Le ALARM_PASSENGER_CARD_CHECK )
	public static final int SDK_ALARM_BUS_VEHICLE_STANDING_OVER_TIME = 0x000a;     // M#353,J1JB<~(6TS&=a99Le ALARM_VEHICLE_STANDING_OVER_TIME_INFO )
	public static final int SDK_ALARM_BUS_DRIVE_AFTER_WORK     = 0x000b;           // 7G9$WwJ1<dJB<~(6TS&=a99Le ALARM_DVRIVE_AFTER_WORK )
	public static final int SDK_ALARM_BUS_PAD_SHUTDOWN         = 0x000c;           // PAD9X;zJB<~, DVRIO1(PadShutdownO{O", PADJU5=:sWT6/QSJ19X;z(6TS&=a99Le ALARM_BUS_PAD_SHUTDOWN_INFO)
	
	public static final int MAX_EVENT_TO_CONFIRM_NUM           = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max Length of device ID
	 * \else
	 * Ih18IDWn4s3$6H
	 * \endif
	 * 
	 */
	public static final int DH_DEV_ID_LEN_EX = 128;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max fire waring information
	 * \else
	 * Wn4sHH3IOqWE;p5c1(>/PEO"8vJ}
	 * \endif
	 * 
	 */
	public static final int MAX_FIREWARNING_INFO_NUM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * TThe Max number of costomer, receive message
	 * \else
	 * =SJU6LPESC;'5DWn4sJ}D?
	 * \endif
	 */
	public static final int MAX_RECEIVER_NUM = 100;
	
	 /**
	 * \if ENGLISH_LANG
	 * The max number of preview channel
	 * \else
	 * Wn4s5<2%T$@@5DM(5@J}A? 
	 * \endif
	 */
	public static final int MAX_PREVIEW_CHANNEL_NUM = 8; 
	
	 /**
	 * \if ENGLISH_LANG
	 *  Maximum Number of Combination of Entrance Guard Operationl
	 * \else
	 * 	Wn4sCE={2YWw5DWi:OJ} 
	 * \endif
	 */
	public static final int MAX_ACCESSCONTROL_NUM = 8;
	
	 /**
	 * \if ENGLISH_LANG
	 *  The Maximum Number of  Alarm Call Servers
	 * \else
	 * 	Wn4s1(>/5g;07~NqFwJ}
	 * \endif
	 */
	public static final int MAX_PSTN_SERVER_NUM = 8;
	
	 /**
	 * \if ENGLISH_LANG
	 *  The Maximum Number of NTP Server
	 * \else
	 * 	Wn4s18SCNTP7~NqFw5XV7
	 * \endif
	 */
	public static final int MAX_NTP_SERVER = 4;  
	
	 /**
	 * \if ENGLISH_LANG
	 *  TV max amount in the zone
	 * \else
	 * 	Gx?iVPTV5DWn4sJ}A?
	 * \endif
	 */
	public static final int AV_CFG_Max_TV_In_Block = 128; 
	
	 /**
	 * \if ENGLISH_LANG
	 *  The zone max amount in the video wall.
	 * \else
	 * 	5gJSG=VPGx?i5DWn4sJ}A?
	 * \endif
	 */
	public static final int AV_CFG_Max_Block_In_Wall = 128;		
	
	public static final int SDK_MAX_COLLECTION_NUM  = 64;      // Wn4sT$08J}
	
	public static final  int MAX_FISH_EYE_REGION_NUM = 9;
	
	public static final int NET_RADIOMETRY_DOFIND_MAX = 32;
}


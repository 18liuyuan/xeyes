package com.company.NetSDK;

public class INetSDK
{
	static {
		LoadLibrarys();
	}
	
	public static void LoadLibrarys() {
		try {/*
			System.loadLibrary("json");
			System.loadLibrary("Infra");
			System.loadLibrary("Stream");
			System.loadLibrary("NetFramework");
			System.loadLibrary("StreamSvr");
			System.loadLibrary("avnetsdk");*/
			String strOSType =  System.getProperty("os.name");
			if( strOSType.contains("Window"))
			{
				System.loadLibrary("dhconfigsdk");
				System.loadLibrary("dhnetsdk");
				System.loadLibrary("netsdk");
			}
			else
			{
				System.loadLibrary("dvr");
				System.loadLibrary("configsdk");
				System.loadLibrary("netsdk");
				System.loadLibrary("sdk");
			}
		} catch(UnsatisfiedLinkError ulink) {    
	        ulink.printStackTrace();   
	    }
	}
	
	/**
	 * \if ENGLISH_LANG
	 * initialize SDK, call before all SDK function
	 * @param cbDisConnect object of interface CB_fDisConnect
	 * @return true:success, false:failed
	 * \else
	 * ��ʼ��SDK, �����е�SDK����֮ǰ����
	 * @param cbDisConnect ����ʵ�ֽӿ�CB_fDisConnect
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Cleanup
	 */
	public static native boolean 		Init(CB_fDisConnect cbDisConnect);
	/**
	 * \if ENGLISH_LANG
	 * empty SDK, release occupied resource,call after all SDK functions
	 * @return 
	 * \else
	 * ���SDK, �ͷ�ռ�õ���Դ,�����е�SDK����֮�����
	 * @return 
	 * \endif
	 * @see Init
	 */

	public static native void 			Cleanup();
	/**
	 * \if ENGLISH_LANG
	 * Set re-connection callback function after disconnection. Internal SDK  auto connect again after disconnection 
	 * @param cbAutoConnect disconnet reconnected recall function CB_fHaveReConnect
	 * \else
	 * ���ö��������ɹ��ص�����,���ú�SDK�ڲ������Զ�����
	 * @param cbAutoConnect ���������ɹ��Ļص����� CB_fHaveReConnect
	 * \endif
	 */ 
	public static native void 			SetAutoReconnect(CB_fHaveReConnect cbAutoConnect);
	/**
	 * \if ENGLISH_LANG
	 * Dynamic sub-set link disconnected callback function, the current monitoring and playback equipment SVR is a short connection
	 * @param cbSubDisConnect sub disconnection recall function CB_fSubDisConnect
	 * \else
	 * ���ö�̬�����Ӷ��߻ص�����,ĿǰSVR�豸�ļ��Ӻͻط��Ƕ����ӵ�
	 * @param cbSubDisConnect ����ʵ�ֽӿ� CB_fSubDisConnect
	 * \endif
	 */
	
	public static native void 			SetSubconnCallBack(CB_fSubDisConnect cbSubDisConnect);
	/**
	 * \if ENGLISH_LANG
	 * Return the function execution failure code
	 * @return wrong code list,_EC(x) means(0x80000000|x)
	 * <table>
	 * <tr><td>type</td><td>value</td><td>means meaning</td></tr>
	 * <tr><td>NET_NOERROR</td><td>0</td><td>no mistake</td></tr>
	 * <tr><td>NET_ERROR</td><td>-1</td><td>unknown mistake</td></tr>
	 * <tr><td>NET_SYSTEM_ERROR</td><td>_EC(1)</td><td>Windows system wrong</td></tr>
	 * <tr><td>NET_NETWORK_ERROR</td><td>_EC(2)</td><td>network mistake</td></tr> 
	 * <tr><td>NET_DEV_VER_NOMATCH</td><td>_EC(3)</td><td>device protocol unmatched</td></tr> 
	 * <tr><td>NET_INVALID_HANDLE</td><td>_EC(4)</td><td>invalid handle</td></tr> 
	 * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>_EC(5)</td><td>open channel failed</td></tr> 
	 * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>_EC(6)</td><td>close channel failed</td></tr>
	 * <tr><td>NET_ILLEGAL_PARAM</td><td>_EC(7)</td><td>illegal user parameter</td></tr> 
	 * <tr><td>NET_SDK_INIT_ERROR</td><td>_EC(8)</td><td>SDK initialization wrong</td></tr> 
	 * <tr><td>NET_SDK_UNINIT_ERROR</td><td>_EC(9)</td><td>SDK cleanrance wrong</td></tr> 
	 * <tr><td>NET_RENDER_OPEN_ERROR</td><td>_EC(10)</td><td>apple render resource wrong</td></tr> 
	 * <tr><td>NET_DEC_OPEN_ERROR</td><td>_EC(11)</td><td>open decode wrong</td></tr>
	 * <tr><td>NET_DEC_CLOSE_ERROR</td><td>_EC(12)</td><td>close docode list wrong</td></tr>
	 * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>_EC(13)</td><td>detected channel number is 0 in multiple window preview</td></tr> 
	 * <tr><td>NET_TALK_INIT_ERROR</td><td>_EC(14)</td><td>audio record initialization failed</td></tr>
	 * <tr><td>NET_TALK_NOT_INIT</td><td>_EC(15)</td><td>audio record uninitialized</td></tr> 
	 * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>_EC(16)</td><td>audio data sent wrong</td></tr>
	 * <tr><td>NET_REAL_ALREADY_SAVING</td><td>_EC(17)</td><td>real time data are saved</td></tr>
	 * <tr><td>NET_NOT_SAVING</td><td>_EC(18)</td><td>unsaved real time data</td></tr>
	 * <tr><td>NET_OPEN_FILE_ERROR</td><td>_EC(19)</td><td>open file wrong</td></tr>
	 * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>_EC(20)</td><td>open PTZ controllor failed</td></tr>
	 * <tr><td>NET_RETURN_DATA_ERROR</td><td>_EC(21)</td><td>returned data check wrong</td></tr>
	 * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>_EC(22)</td><td>insufficient cache</td></tr>
	 * <tr><td>NET_NOT_SUPPORTED</td><td>_EC(23)</td><td>current SDK do not support the function</td></tr> 
	 * <tr><td>NET_NO_RECORD_FOUND</td><td>_EC(24)</td><td>no video searched</td></tr>
	 * <tr><td>NET_NOT_AUTHORIZED</td><td>_EC(25)</td><td>non authorized operation</td></tr>
	 * <tr><td>NET_NOT_NOW</td><td>_EC(26)</td><td>temporarilt not available</td></tr>
	 * <tr><td>NET_NO_TALK_CHANNEL</td><td>_EC(27)</td><td>no bidirectional channel found</td></tr>
	 * <tr><td>NET_NO_AUDIO</td><td>_EC(28)</td><td>no audio found</td></tr> 
	 * <tr><td>NET_NO_INIT</td><td>_EC(29)</td><td>network SDK not initialized</td></tr>
	 * <tr><td>NET_DOWNLOAD_END</td><td>_EC(30)</td><td>download ends</td></tr> 
	 * <tr><td>NET_EMPTY_LIST</td><td>_EC(31)</td><td>0 result found</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>_EC(32)</td><td>receiving system settings invalid</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>_EC(33)</td><td>receiving serial number failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>_EC(34)</td><td>receiving generals failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>_EC(35)</td><td>receiving DSP capability description failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>_EC(36)</td><td>receiving network config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>_EC(37)</td><td>receiving channel name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>_EC(38)</td><td>receiving video property failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>_EC(39)</td><td>receiving video config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>_EC(40)</td><td>receiving decoder protocol name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>_EC(41)</td><td>receiving232 serial function name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>_EC(42)</td><td>receiving decoder property faileddecoderpropertyfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_232COM</td><td>_EC(43)</td><td>receiving 232 serial configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>_EC(44)</td><td>receiving external alarm input configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>_EC(45)</td><td>receiving dynamic detection alarm failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>_EC(46)</td><td>receiving device time failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>_EC(47)</td><td>receiving preview parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>_EC(48</td><td>receiving auto maintenance configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>_EC(49)</td><td>receiving video matrix configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_COVER</td><td>_EC(50)</td><td>receiving area mask configfailed</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>_EC(51)</td><td>receiving image watermark configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>_EC(55)</td><td>change general property failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>_EC(56)</td><td>change change network configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>_EC(57)</td><td>change channel name failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>_EC(58)</td><td>change videoproperty failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>_EC(59)</td><td>change record configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>_EC(60)</td><td>changedecoderpropertyfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_232COM</td><td>_EC(61)</td><td>change232serialconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>_EC(62)</td><td>change external input alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>_EC(63)</td><td>change dynamix detection alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>_EC(64)</td><td>change device time failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>_EC(65)</td><td>change preview parameter failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>_EC(66)</td><td>change auto maintenance configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>_EC(67)</td><td>change video matrix config failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_COVER</td><td>_EC(68)</td><td>change area mask config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>_EC(69)</td><td>change image watermark configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>_EC(70)</td><td>change wireless network info failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>_EC(71)</td><td>select wireless network device failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>_EC(72)</td><td>change active registration parameter configfailed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>_EC(73)</td><td>change camera property config failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>_EC(74)</td><td>change IR alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>_EC(75)</td><td>change audio alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>_EC(76)</td><td>change storage location config failed</td></tr>
	 * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>_EC(77)</td><td>audio encode interface not successfully initialized</td></tr>
	 * <tr><td>NET_DATA_TOOLONGH</td><td>_EC(78)</td><td>data too long</td></tr>
	 * <tr><td>NET_UNSUPPORTED</td><td>_EC(79)</td><td>device not support the operation</td></tr>
	 * <tr><td>NET_DEVICE_BUSY</td><td>_EC(80)</td><td>device insufficient resource</td></tr>
	 * <tr><td>NET_SERVER_STARTED</td><td>_EC(81)</td><td>server started</td></tr>
	 * <tr><td>NET_SERVER_STOPPED </td><td>_EC(82)</td><td>server not started</td></tr>
	 * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>_EC(83)</td><td>serial number input wrong</td></tr>
	 * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>_EC(84)</td><td>receiving hard disk info failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>_EC(85)</td><td>receiving connect Session info</td></tr>
	 * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>_EC(86)</td><td>wrong password input exceeds limit</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>_EC(100)</td><td>wrong password</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_USER</td><td>_EC(101)</td><td>account not exist</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>_EC(102)</td><td>overtime of waiting</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>_EC(103)</td><td>account already login</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>_EC(104)</td><td>account locked</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>_EC(105)</td><td>account on blacklist</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>_EC(106)</td><td>insufficient resource,system busy</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107)</td><td>connect to master failed</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>_EC(108)</td><td>network connect failed</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>_EC(109)</td><td>login device successfully, but cannot create video channel, please check network status</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>_EC(110)</td><td>exceeds max connections</td></tr>   
	 * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>_EC(120)</td><td>Render list open audio wrong</td></tr>
	 * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>_EC(121)</td><td>Render list close audio wrong</td></tr>
	 * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>_EC(122)</td><td>Render list control volume wrong</td></tr>
	 * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>_EC(123)</td><td>Render list set image parameter wrong</td></tr>
	 * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>_EC(124)</td><td>Render list pause playing wrong</td></tr>
	 * <tr><td>NET_RENDER_SNAP_ERROR</td><td>_EC(125)</td><td>Render list snapshot wrong</td></tr>
	 * <tr><td>NET_RENDER_STEP_ERROR</td><td>_EC(126)</td><td>Render list fast play wrong</td></tr>
	 * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>_EC(127)</td><td>Render list set frame rate wrong</td></tr>
	 * <tr><td>NET_GROUP_EXIST</td><td>_EC(140)</td><td>group name exists</td></tr>
	 * <tr><td>NET_GROUP_NOEXIST</td><td>_EC(141)</td><td>group name not exists</td></tr>
	 * <tr><td>NET_GROUP_RIGHTOVER</td><td>_EC(142)</td><td>group authority exceeds authorization range</td></tr>
	 * <tr><td>NET_GROUP_HAVEUSER</td><td>_EC(143)</td><td>all user in group, cannot be deleted</td></tr>
	 * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144)</td><td>user is using a certain authority of group, cannot eliminate</td></tr>
	 * <tr><td>NET_GROUP_SAMENAME</td><td>_EC(145)</td><td>new group name overplay with existing group</td></tr>
	 * <tr><td>NET_USER_EXIST</td><td>_EC(146)</td><td>user exists</td></tr>
	 * <tr><td>NET_USER_NOEXIST</td><td>_EC(147)</td><td>user not exists</td></tr>
	 * <tr><td>NET_USER_RIGHTOVER</td><td>_EC(148)</td><td>user authority exceeds group authority range</td></tr>
	 * <tr><td>NET_USER_PWD</td><td>_EC(149)</td><td>reserve account, cannot change password</td></tr>
	 * <tr><td>NET_USER_FLASEPWD</td><td>_EC(150)</td><td>password wrong</td></tr>
	 * <tr><td>NET_USER_NOMATCHING</td><td>_EC(151)</td><td>password not match</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>_EC(300)</td><td>receiving network card config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>_EC(301)</td><td>receiving wireless network info failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>_EC(302)</td><td>receiving wireless network device failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>_EC(303)</td><td>receiving active registeration parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>_EC(304)</td><td>receiving camera propertyfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>_EC(305)</td><td>receiving IR alarmconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>_EC(306)</td><td>receiving audio alarmconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>_EC(307)</td><td>receiving storage location configfailed</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>_EC(308)</td><td>receiving mail config failed</td></tr> 
	 * <tr><td>NET_CONFIG_DEVBUSY</td><td>_EC(309)</td><td>temporarily not available</td></tr>
	 * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>_EC(310)</td><td>config data illegal</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DST</td><td>_EC(311)</td><td>receiving daylight saving time config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_DST</td><td>_EC(312)</td><td>set daylight saving time configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>_EC(313)</td><td>receivingvideo OSD superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>_EC(314)</td><td>set video OSD superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>_EC(315)</td><td>receivingCDMA\\GPRSnetworkconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>_EC(316)</td><td>setCDMA\\GPRS network config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>_EC(317)</td><td>receiving IP filter config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>_EC(318)</td><td>setIP filter config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>_EC(319)</td><td>receiving bidirectional talk encode config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>_EC(320)</td><td>set bidirectional talk encode configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>_EC(321)</td><td>receiving record package length configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>_EC(322)</td><td>setrecord package length configfailed</td></tr>
	 * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>_EC(323)</td><td>not support network hard disk segmentation</td></tr>
	 * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>_EC(324)</td><td>receivingdevice active registration server info failed</td></tr>
	 * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>_EC(325)</td><td>active registration redirection registration mistake</td></tr>
	 * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>_EC(326)</td><td>disconnect active registration server mistake</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_MMS</td><td>_EC(327)</td><td>receivingmmsconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_MMS</td><td>_EC(328)</td><td>setmmsconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>_EC(329)</td><td>receiving sms activate wireless connection config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>_EC(330)</td><td>setsms activate wireless connection config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>_EC(331)</td><td>receiving dial activate wireless connection configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>_EC(332)</td><td>setdial activate wireless connection configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>_EC(333)</td><td>search video output parameter configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>_EC(334)</td><td>setvideo output parameter config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>_EC(335)</td><td>receivingosd superposition enable configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>_EC(336)</td><td>setosdsuperposition enableconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>_EC(337)</td><td>set digital channel front-end encode insertion configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>_EC(338)</td><td>receivingTV adjust configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>_EC(339)</td><td>setTV adjust configfailed</td></tr>
	 * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>_EC(340)</td><td>requrest to create connection failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>_EC(341)</td><td>request to upload burned file failed</td></tr>
	 * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>_EC(342)</td><td>receiving snapshot config info failed</td></tr>
	 * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>_EC(343)</td><td>set snapshot config info failed</td></tr>
	 * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>_EC(344)</td><td>search download limit info failed</td></tr>
	 * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>_EC(345)</td><td>set download limit info failed</td></tr>
	 * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>_EC(346)</td><td>search serial parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_POINT</td><td>_EC(347)</td><td>receiving preset point info wrong</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_POINT</td><td>_EC(348)</td><td>set preset point info wrong</td></tr>
	 * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>_EC(349)</td><td>SDK abnormal log out device</td></tr>
	 * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>_EC(350)</td><td>receiving mobile configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>_EC(351)</td><td>set mobile configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>_EC(352)</td><td>receivingatm superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>_EC(353)</td><td>setatm superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>_EC(354)</td><td>receivingatm superposition capability failed</td></tr>
	 * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>_EC(355)</td><td>receivingdecoder decoding tour configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>_EC(356)</td><td>setdecoder decoding tour configfailed</td></tr>
	 * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>_EC(357)</td><td>control decoder decoding tour failed</td></tr>
	 * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>_EC(358)</td><td>exceed device max user groups supported</td></tr>
	 * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>_EC(359)</td><td>exceed device max user groups supported</td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>_EC(368)</td><td>receivingSIPconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>_EC(369)</td><td>set SIP config failed</td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>_EC(370)</td><td>receivingSIP capability failed</td></tr>
	 * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>_EC(371)</td><td>receivingWIFI apconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>_EC(372)</td><td>setWIFI ap config failed</td></tr>
	 * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>_EC(373)</td><td>receiving decoding strategy configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>_EC(374)</td><td>set decoding strategy configfailed</td></tr>
	 * <tr><td>NET_ERROR_TALK_REJECT</td><td>_EC(375)</td><td>refuse bidirectional talk</td></tr> 
	 * <tr><td>NET_ERROR_TALK_OPENED</td><td>_EC(376)</td><td>open by other client</td></tr>
	 * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>_EC(377)</td><td>resource conflict</td></tr>
	 * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>_EC(378)</td><td>audio encoding format not supported</td></tr>
	 * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>_EC(379)</td><td>not authorized</td></tr>
	 * <tr><td>NET_ERROR_TALK_FAILED</td><td>_EC(380)</td><td>request of bidirectional talk failed</td></tr>
	 * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>_EC(381)</td><td>receiving device related configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>_EC(382)</td><td>set device related configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>_EC(383)</td><td>device cannot receiving currently required data</td></tr>
	 * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>_EC(384)</td><td>MAC address inspection failed</td></tr>
	 * <tr><td>NET_ERROR_GET_INSTANCE</td><td>_EC(385)</td><td>receiving server example failed</td></tr>
	 * <tr><td>NET_ERROR_JSON_REQUEST</td><td>_EC(386)</td><td>generated jason character string wrong</td></tr>
	 * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>_EC(387)</td><td>responded jason character string wrong</td></tr>
	 * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>_EC(388)</td><td>protocol version older than current version in use</td></tr>
	 * <tr><td>NET_SPARE_NO_CAPACITY</td><td>_EC(389)</td><td>hot operation failed, insufficient space</td></tr>
	 * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>_EC(390)</td><td>display source is occulied by other output</td></tr>
	 * <tr><td>NET_ERROR_REAVE</td><td>_EC(391)</td><td>advanced user seize resouce of low-level user</td></tr>
	 * <tr><td>NET_ERROR_NETFORBID</td><td>_EC(392)</td><td>prohibit access</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MACFILTER</td><td>_EC(393)</td><td>get MAC</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_MACFILTER</td><td>_EC(394)</td><td>MAC</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_IPMACFILTER</td><td>_EC(395)</td><td>IP/MAC</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_IPMACFILTER</td><td>_EC(396)</td><td>IP/MAC</td></tr>
	 * <tr><td>NET_ERROR_OPERATION_OVERTIME</td><td>_EC(397)</td><td>over time</td></tr>
	 * <tr><td>NET_ERROR_SENIOR_VALIDATE_FAILED</td><td>_EC(398)</td><td>failed</td></tr>
	 * <tr><td>NET_ERROR_DEVICE_ID_NOT_EXIST</td><td>_EC(399)</td><td>device ID not exist</td></tr>
	 * <tr><td>NET_ERROR_UNSUPPORTED</td><td>_EC(400)</td><td>not support</td></tr>
	 * <tr><td>NET_ERROR_SPEAK_FAILED</td><td>_EC(406)</td><td>failed</td></tr>
	 * <tr><td>NET_ERROR_NOT_SUPPORT_F6</td><td>_EC(407)</td><td>device no F6</td></tr>
	 * </table>
	 * \else
	 * ���غ���ִ��ʧ�ܴ���,�ڽӿڵ���ʧ��ʱʹ��,���ݻ�õ�ֵ��ȷ�����ó���ԭ��
	 * @return ���ش������,��ʽΪ��0x80000000|x
	 * <table>
	 * <tr><td>����</td><td>��ֵ </td><td>������ </td></tr>
	 * <tr><td>NET_NOERROR</td><td>0</td><td>û�д���</td></tr> 
	 * <tr><td>NET_ERROR</td><td>-1</td><td>δ֪����</td></tr> 
	 * <tr><td>NET_SYSTEM_ERROR</td><td>_EC(1)</td><td>Windowsϵͳ����</td></tr> 
	 * <tr><td>NET_NETWORK_ERROR</td><td>_EC(2)</td><td>�������</td></tr> 
	 * <tr><td>NET_DEV_VER_NOMATCH</td><td>_EC(3)</td><td>�豸Э�鲻ƥ�� </td></tr>
	 * <tr><td>NET_INVALID_HANDLE</td><td>_EC(4)</td><td>�����Ч </td></tr>
	 * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>_EC(5)</td><td>��ͨ��ʧ��</td></tr> 
	 * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>_EC(6)</td><td>�ر�ͨ��ʧ��</td></tr> 
	 * <tr><td>NET_ILLEGAL_PARAM</td><td>_EC(7)</td><td>�û��������Ϸ� </td></tr>
	 * <tr><td>NET_SDK_INIT_ERROR</td><td>_EC(8)</td><td>SDK��ʼ������</td></tr> 
	 * <tr><td>NET_SDK_UNINIT_ERROR</td><td>_EC(9)</td><td>SDK�������</td></tr> 
	 * <tr><td>NET_RENDER_OPEN_ERROR</td><td>_EC(10)</td><td>����render��Դ����</td></tr> 
	 * <tr><td>NET_DEC_OPEN_ERROR</td><td>_EC(11)</td><td>�򿪽�������</td></tr> 
	 * <tr><td>NET_DEC_CLOSE_ERROR</td><td>_EC(12)</td><td>�رս�������</td></tr> 
	 * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>_EC(13)</td><td>�໭��Ԥ���м�⵽ͨ����Ϊ0</td></tr> 
	 * <tr><td>NET_TALK_INIT_ERROR</td><td>_EC(14)</td><td>¼�����ʼ��ʧ��</td></tr> 
	 * <tr><td>NET_TALK_NOT_INIT</td><td>_EC(15)</td><td>¼����δ����ʼ�� </td></tr>
	 * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>_EC(16)</td><td>������Ƶ���ݳ���</td></tr> 
	 * <tr><td>NET_REAL_ALREADY_SAVING</td><td>_EC(17)</td><td>ʵʱ�����Ѿ����ڱ���״̬ </td></tr>
	 * <tr><td>NET_NOT_SAVING</td><td>_EC(18)</td><td>δ����ʵʱ����</td></tr> 
	 * <tr><td>NET_OPEN_FILE_ERROR</td><td>_EC(19)</td><td>���ļ�����</td></tr> 
	 * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>_EC(20)</td><td>������̨���ƶ�ʱ��ʧ��</td></tr> 
	 * <tr><td>NET_RETURN_DATA_ERROR</td><td>_EC(21)</td><td>�Է������ݵ�У�����</td></tr> 
	 * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>_EC(22)</td><td>û���㹻�Ļ��� </td></tr>
	 * <tr><td>NET_NOT_SUPPORTED</td><td>_EC(23)</td><td>��ǰSDKδ֧�ָù��� </td></tr>
	 * <tr><td>NET_NO_RECORD_FOUND</td><td>_EC(24)</td><td>��ѯ����¼�� </td></tr>
	 * <tr><td>NET_NOT_AUTHORIZED</td><td>_EC(25)</td><td>�޲���Ȩ�� </td></tr>
	 * <tr><td>NET_NOT_NOW</td><td>_EC(26)</td><td>��ʱ�޷�ִ�� </td></tr>
	 * <tr><td>NET_NO_TALK_CHANNEL</td><td>_EC(27)</td><td>δ���ֶԽ�ͨ�� </td></tr>
	 * <tr><td>NET_NO_AUDIO</td><td>_EC(28)</td><td>δ������Ƶ </td></tr>
	 * <tr><td>NET_NO_INIT</td><td>_EC(29)</td><td>����SDKδ����ʼ�� </td></tr>
	 * <tr><td>NET_DOWNLOAD_END</td><td>_EC(30)</td><td>�����ѽ��� </td></tr>
	 * <tr><td>NET_EMPTY_LIST</td><td>_EC(31)</td><td>��ѯ���Ϊ�� </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>_EC(32)</td><td>��ȡϵͳ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>_EC(33)</td><td>��ȡ���к�ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>_EC(34)</td><td>��ȡ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>_EC(35)</td><td>��ȡDSP��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>_EC(36)</td><td>��ȡ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>_EC(37)</td><td>��ȡͨ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>_EC(38)</td><td>��ȡ��Ƶ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>_EC(39)</td><td>��ȡ¼������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>_EC(40)</td><td>��ȡ������Э������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>_EC(41)</td><td>��ȡ232���ڹ�������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>_EC(42)</td><td>��ȡ����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_232COM</td><td>_EC(43)</td><td>��ȡ232��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>_EC(44)</td><td>��ȡ�ⲿ������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>_EC(45)</td><td>��ȡ��̬��ⱨ��ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>_EC(46)</td><td>��ȡ�豸ʱ��ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>_EC(47)</td><td>��ȡԤ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>_EC(48)</td><td>��ȡ�Զ�ά������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>_EC(49)</td><td>��ȡ��Ƶ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_COVER</td><td>_EC(50)</td><td>��ȡ�����ڵ�����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>_EC(51)</td><td>��ȡͼ��ˮӡ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>_EC(55)</td><td>�޸ĳ�������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>_EC(56)</td><td>�޸���������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>_EC(57)</td><td>�޸�ͨ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>_EC(58)</td><td>�޸���Ƶ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>_EC(59)</td><td>�޸�¼������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>_EC(60)</td><td>�޸Ľ���������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_232COM</td><td>_EC(61)</td><td>�޸�232��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>_EC(62)</td><td>�޸��ⲿ���뱨������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>_EC(63)</td><td>�޸Ķ�̬��ⱨ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>_EC(64)</td><td>�޸��豸ʱ��ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>_EC(65)</td><td>�޸�Ԥ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>_EC(66)</td><td>�޸��Զ�ά������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>_EC(67)</td><td>�޸���Ƶ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_COVER</td><td>_EC(68)</td><td>�޸������ڵ�����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>_EC(69)</td><td>�޸�ͼ��ˮӡ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>_EC(70)</td><td>�޸�����������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>_EC(71)</td><td>ѡ�����������豸ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>_EC(72)</td><td>�޸�����ע���������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>_EC(73)</td><td>�޸�����ͷ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>_EC(74)</td><td>�޸ĺ��ⱨ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>_EC(75)</td><td>�޸���Ƶ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>_EC(76)</td><td>�޸Ĵ洢λ������ʧ��</td></tr> 
	 * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>_EC(77)</td><td>��Ƶ����ӿ�û�гɹ���ʼ�� </td></tr>
	 * <tr><td>NET_DATA_TOOLONGH</td><td>_EC(78)</td><td>���ݹ��� </td></tr>
	 * <tr><td>NET_UNSUPPORTED</td><td>_EC(79)</td><td>�豸��֧�ָò��� </td></tr>
	 * <tr><td>NET_DEVICE_BUSY</td><td>_EC(80)</td><td>�豸��Դ���� </td></tr>
	 * <tr><td>NET_SERVER_STARTED</td><td>_EC(81)</td><td>�������Ѿ����� </td></tr>
	 * <tr><td>NET_SERVER_STOPPED </td><td>_EC(82)</td><td>��������δ�ɹ����� </td></tr>
	 * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>_EC(83)</td><td>�������к����� </td></tr>
	 * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>_EC(84)</td><td>��ȡӲ����Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>_EC(85)</td><td>��ȡ����Session��Ϣ 
	 * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>_EC(86)</td><td>����������󳬹����ƴ��� </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>_EC(100)</td><td>���벻��ȷ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_USER</td><td>_EC(101)</td><td>�ʻ������� </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>_EC(102)</td><td>�ȴ���¼���س�ʱ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>_EC(103)</td><td>�ʺ��ѵ�¼ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>_EC(104)</td><td>�ʺ��ѱ����� </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>_EC(105)</td><td>�ʺ��ѱ���Ϊ������ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>_EC(106)</td><td>��Դ����,ϵͳæ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107)</td><td>��������ʧ��</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>_EC(108)</td><td>��������ʧ��</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>_EC(109)</td><td>��¼�豸�ɹ�,���޷�������Ƶͨ��,��������״�� </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>_EC(110)</td><td>�������������  </td></tr>
	 * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>_EC(120)</td><td>Render�����Ƶ����</td></tr> 
	 * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>_EC(121)</td><td>Render��ر���Ƶ����</td></tr> 
	 * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>_EC(122)</td><td>Render�������������</td></tr> 
	 * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>_EC(123)</td><td>Render�����û����������</td></tr> 
	 * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>_EC(124)</td><td>Render����ͣ���ų���</td></tr> 
	 * <tr><td>NET_RENDER_SNAP_ERROR</td><td>_EC(125)</td><td>Render��ץͼ����</td></tr> 
	 * <tr><td>NET_RENDER_STEP_ERROR</td><td>_EC(126)</td><td>Render�ⲽ������</td></tr> 
	 * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>_EC(127)</td><td>Render������֡�ʳ���</td></tr> 
	 * <tr><td>NET_GROUP_EXIST</td><td>_EC(140)</td><td>�����Ѵ��� </td></tr>
	 * <tr><td>NET_GROUP_NOEXIST</td><td>_EC(141)</td><td>���������� </td></tr>
	 * <tr><td>NET_GROUP_RIGHTOVER</td><td>_EC(142)</td><td>���Ȩ�޳���Ȩ���б�Χ </td></tr>
	 * <tr><td>NET_GROUP_HAVEUSER</td><td>_EC(143)</td><td>�������û�,����ɾ�� </td></tr>
	 * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144)</td><td>���ĳ��Ȩ�ޱ��û�ʹ��,���ܳ��� </td></tr>
	 * <tr><td>NET_GROUP_SAMENAME</td><td>_EC(145)</td><td>������ͬ���������ظ� </td></tr>
	 * <tr><td>NET_USER_EXIST</td><td>_EC(146)</td><td>�û��Ѵ��� </td></tr>
	 * <tr><td>NET_USER_NOEXIST</td><td>_EC(147)</td><td>�û������� </td></tr>
	 * <tr><td>NET_USER_RIGHTOVER</td><td>_EC(148)</td><td>�û�Ȩ�޳�����Ȩ�� </td></tr>
	 * <tr><td>NET_USER_PWD</td><td>_EC(149)</td><td>�����ʺ�,�������޸����� </td></tr>
	 * <tr><td>NET_USER_FLASEPWD</td><td>_EC(150)</td><td>���벻��ȷ </td></tr>
	 * <tr><td>NET_USER_NOMATCHING</td><td>_EC(151)</td><td>���벻ƥ�� </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>_EC(300)</td><td>��ȡ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>_EC(301)</td><td>��ȡ����������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>_EC(302)</td><td>��ȡ���������豸ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>_EC(303)</td><td>��ȡ����ע�����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>_EC(304)</td><td>��ȡ����ͷ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>_EC(305)</td><td>��ȡ���ⱨ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>_EC(306)</td><td>��ȡ��Ƶ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>_EC(307)</td><td>��ȡ�洢λ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>_EC(308)</td><td>��ȡ�ʼ�����ʧ��</td></tr> 
	 * <tr><td>NET_CONFIG_DEVBUSY</td><td>_EC(309)</td><td>��ʱ�޷����� </td></tr>
	 * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>_EC(310)</td><td>�������ݲ��Ϸ� </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DST</td><td>_EC(311)</td><td>��ȡ����ʱ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DST</td><td>_EC(312)</td><td>��������ʱ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>_EC(313)</td><td>��ȡ��ƵOSD��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>_EC(314)</td><td>������ƵOSD��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>_EC(315)</td><td>��ȡCDMA��GPRS��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>_EC(316)</td><td>����CDMA��GPRS��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>_EC(317)</td><td>��ȡIP��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>_EC(318)</td><td>����IP��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>_EC(319)</td><td>��ȡ�����Խ���������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>_EC(320)</td><td>���������Խ���������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>_EC(321)</td><td>��ȡ¼������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>_EC(322)</td><td>����¼������������ʧ��</td></tr> 
	 * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>_EC(323)</td><td>��֧������Ӳ�̷��� </td></tr>
	 * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>_EC(324)</td><td>��ȡ�豸������ע���������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>_EC(325)</td><td>����ע���ض���ע�����</td></tr> 
	 * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>_EC(326)</td><td>�Ͽ�����ע�����������</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MMS</td><td>_EC(327)</td><td>��ȡmms����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MMS</td><td>_EC(328)</td><td>����mms����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>_EC(329)</td><td>��ȡ���ż���������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>_EC(330)</td><td>���ö��ż���������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>_EC(331)</td><td>��ȡ���ż���������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>_EC(332)</td><td>���ò��ż���������������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>_EC(333)</td><td>��ѯ��Ƶ�����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>_EC(334)</td><td>������Ƶ�����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>_EC(335)</td><td>��ȡosd����ʹ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>_EC(336)</td><td>����osd����ʹ������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>_EC(337)</td><td>��������ͨ��ǰ�˱����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>_EC(338)</td><td>��ȡTV��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>_EC(339)</td><td>����TV��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>_EC(340)</td><td>����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>_EC(341)</td><td>�����¼�ļ��ϴ�ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>_EC(342)</td><td>��ȡץ��������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>_EC(343)</td><td>����ץ��������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>_EC(344)</td><td>��ѯ����������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>_EC(345)</td><td>��������������Ϣʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>_EC(346)</td><td>��ѯ���ڲ���ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_POINT</td><td>_EC(347)</td><td>��ȡԤ�Ƶ���Ϣ����</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_POINT</td><td>_EC(348)</td><td>����Ԥ�Ƶ���Ϣ����</td></tr> 
	 * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>_EC(349)</td><td>SDKû�������ǳ��豸 </td></tr>
	 * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>_EC(350)</td><td>��ȡ��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>_EC(351)</td><td>���ó�������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>_EC(352)</td><td>��ȡatm��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>_EC(353)</td><td>����atm��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>_EC(354)</td><td>��ȡatm��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>_EC(355)</td><td>��ȡ������������Ѳ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>_EC(356)</td><td>���ý�����������Ѳ����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>_EC(357)</td><td>���ƽ�����������Ѳʧ��</td></tr> 
	 * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>_EC(358)</td><td>�����豸֧������û�����Ŀ </td></tr>
	 * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>_EC(359)</td><td>�����豸֧������û���Ŀ </td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>_EC(368)</td><td>��ȡSIP����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>_EC(369)</td><td>����SIP����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>_EC(370)</td><td>��ȡSIP����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>_EC(371)</td><td>��ȡWIFI ap����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>_EC(372)</td><td>����WIFI ap����ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>_EC(373)</td><td>��ȡ�����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>_EC(374)</td><td>���ý����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_TALK_REJECT</td><td>_EC(375)</td><td>�ܾ��Խ� </td></tr>
	 * <tr><td>NET_ERROR_TALK_OPENED</td><td>_EC(376)</td><td>�Խ��������ͻ��˴� </td></tr>
	 * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>_EC(377)</td><td>��Դ��ͻ </td></tr>
	 * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>_EC(378)</td><td>��֧�ֵ����������ʽ </td></tr>
	 * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>_EC(379)</td><td>��Ȩ�� </td></tr>
	 * <tr><td>NET_ERROR_TALK_FAILED</td><td>_EC(380)</td><td>����Խ�ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>_EC(381)</td><td>��ȡ�����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>_EC(382)</td><td>���û����������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>_EC(383)</td><td>�豸�޷���ȡ��ǰ�������� </td></tr>
	 * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>_EC(384)</td><td>MAC��ַ��֤ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GET_INSTANCE</td><td>_EC(385)</td><td>��ȡ������ʵ��ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_JSON_REQUEST</td><td>_EC(386)</td><td>���ɵ�jason�ַ�������</td></tr> 
	 * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>_EC(387)</td><td>��Ӧ��jason�ַ�������</td></tr> 
	 * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>_EC(388)</td><td>Э��汾���ڵ�ǰʹ�õİ汾 </td></tr>
	 * <tr><td>NET_SPARE_NO_CAPACITY</td><td>_EC(389)</td><td>�ȱ�����ʧ��, ��������</td></tr> 
	 * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>_EC(390)</td><td>��ʾԴ���������ռ�� </td></tr>
	 * <tr><td>NET_ERROR_REAVE</td><td>_EC(391)</td><td>�߼��û���ռ�ͼ��û���Դ </td></tr>
	 * <tr><td>NET_ERROR_NETFORBID</td><td>_EC(392)</td><td>��ֹ���� </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_MACFILTER</td><td>_EC(393)</td><td>��ȡMAC��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MACFILTER</td><td>_EC(394)</td><td>����MAC��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPMACFILTER</td><td>_EC(395)</td><td>��ȡIP/MAC��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPMACFILTER</td><td>_EC(396)</td><td>����IP/MAC��������ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_OPERATION_OVERTIME</td><td>_EC(397)</td><td>��ǰ������ʱ </td></tr>
	 * <tr><td>NET_ERROR_SENIOR_VALIDATE_FAILED</td><td>_EC(398)</td><td>�߼�У��ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_DEVICE_ID_NOT_EXIST</td><td>_EC(399)</td><td>�豸ID������ </td></tr>
	 * <tr><td>NET_ERROR_UNSUPPORTED</td><td>_EC(400)</td><td>��֧�ֵ�ǰ���� </td></tr>
	 * <tr><td>NET_ERROR_SPEAK_FAILED</td><td>_EC(406)</td><td>���󺰻�ʧ��</td></tr> 
	 * <tr><td>NET_ERROR_NOT_SUPPORT_F6</td><td>_EC(407)</td><td>�豸��֧�ִ�F6�ӿڵ��� </td></tr>
	 * </table>
	 * \endif
	 * @see 
	 */
	
	public static native  int  			GetLastError();
	/**
	 * \if ENGLISH_LANG
	 * Set device connection timeout value and trial times 
	 * @param nWaitTime client and device connection waiting time,ms 
	 * @param nTryTimes connection times
	 * \else
	 * ���������豸��ʱʱ��ͳ��Դ���
	 * @param nWaitTime �ͻ������豸�����ӵȴ�ʱ��,���뼶 
	 * @param nTryTimes ���Ӵ��� 
	 * \endif
	 */
	
	public static native  void  		SetConnectTime(int nWaitTime, int nTryTimes);
	/**
	 * \if ENGLISH_LANG
	 * Set log in network environment
	 * @param pNetParam net parameter structure pointer. as NET_PARAM 
	 * @return true:success, false:failed
	 * \else
	 * ���õ�½���绷��
	 * @param pNetParam ��������ṹ��ָ��,��� NET_PARAM
	 * \endif
	 */
	
	public static native  void  		SetNetworkParam(NET_PARAM pNetParam);
	/**
	 * \if ENGLISH_LANG
	 * Get SDK version information 
	 * @return version NO. 
	 * \else
	 * ��ȡSDK�İ汾��Ϣ
	 * @return �汾��
	 * \endif
	 */
	
	public static native  int  			GetSDKVersion();
	/**
	 * \if ENGLISH_LANG
	 * Register to the device 
	 * @param pchDVRIP device IP 
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword user password
	 * @param lpDeviceInfo device info, as output parameter 
	 * @param nError (when function returns successfully, its value is meanless),return to login wrong code,as follows:
	 * <table>
	 * <tr><td>wrong code</td><td>meaning</td></tr> 
	 * <tr><td>1</td><td>wrong password</td></tr> 
	 * <tr><td>2</td><td>username not exist</td></tr> 
	 * <tr><td>3</td><td>login overtime</td></tr> 
	 * <tr><td>4</td><td>account already login</td></tr> 
	 * <tr><td>5</td><td>accoung locked</td></tr>  
	 * <tr><td>6</td><td>account on blacklist</td></tr>  
	 * <tr><td>7</td><td>insufficient resource,system busy</td></tr> 
	 * <tr><td>8</td><td>sub-connection failed</td></tr>
	 * <tr><td>9</td><td>main connection failed</td></tr> 
	 * <tr><td>10</td><td>exceed max user connections </td></tr>
	 * </table>
	 * @return failed return to 0,successful return to device ID,after successfully login operation on device may correspond to designated device via this value (device handle). 
	 * \else
	 * ���豸ע��
	 * @param pchDVRIP �豸IP 
	 * @param wDVRPort �豸�˿� 
	 * @param pchUserName �û���
	 * @param pchPassword �û�����
	 * @param lpDeviceInfo �豸��Ϣ,�����������
	 * @param nError ���ص�¼������
	 * <table>
	 * <tr><td>������</td><td>������ </td></tr>
	 * <tr><td>1</td><td>���벻��ȷ </td></tr>
	 * <tr><td>2</td><td>�û��������� </td></tr>
	 * <tr><td>3</td><td>��¼��ʱ </td></tr>
	 * <tr><td>4</td><td>�ʺ��ѵ�¼ </td></tr>
	 * <tr><td>5</td><td>�ʺ��ѱ�����  </td></tr>
	 * <tr><td>6</td><td>�ʺű���Ϊ������  </td></tr>
	 * <tr><td>7</td><td> ��Դ����,ϵͳæ </td></tr>
	 * <tr><td>8</td><td>������ʧ�� </td></tr>
	 * <tr><td>9</td><td>������ʧ�� </td></tr>
	 * <tr><td>10</td><td> ��������û������� </td></tr>
	 * </table>
	 * @return ʧ�ܷ���0,�ɹ������豸ID,��¼�ɹ�֮����豸�Ĳ���������ͨ����ֵ(�豸���)��Ӧ����Ӧ���豸 
	 * \endif
	 * @see Logout
	 */
	
	public static native  long  		Login(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, NET_DEVICEINFO lpDeviceInfo, Integer nError);
	/**
	 * \if ENGLISH_LANG
	 * register user ro device's extension interface, support one user to appoint capacity supported by the device
	 * @param pchDVRIP device IP
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword userpassword
	 * @param nSpecCap �豸֧�ֵ�����
	 * @param pCapParam for nSpecCap complementary parameter,when nSpecCap = 2,pCapParam fill in device serial number character string(mobile dvrlogin) 
	 * @param lpDeviceInfo device info,as output parameter
	 * @param nError (when function returns successfully, its value is meanless),return to login wrong code,as follows:
	 * <table>
	 * <tr><td>wrong code</td><td>meaning</td></tr> 
	 * <tr><td>1</td><td>wrong password</td></tr> 
	 * <tr><td>2</td><td>username not exist </td></tr>
	 * <tr><td>3</td><td>login overtime</td></tr> 
	 * <tr><td>4</td><td>account already login </td></tr>
	 * <tr><td>5</td><td>accoung locked</td></tr>  
	 * <tr><td>6</td><td>account on blacklist</td></tr>  
	 * <tr><td>7</td><td>insufficient resource,system busy </td></tr>
	 * <tr><td>8</td><td>sub-connection failed</td></tr> 
	 * <tr><td>9</td><td>main connection failed </td></tr>
	 * <tr><td>10</td><td>exceed max user connections</td></tr> 
	 * </table>
	 * @return failed return to 0,successful return to device ID,after login successfully operations on device may be corresponded to corresponding devices via this value (device handle). 
	 * \else
	 * ���豸ע��--��չ
	 * @param pchDVRIP �豸IP 
	 * @param wDVRPort �豸�˿� 
	 * @param pchUserName �û���
	 * @param pchPassword �û�����
	 * @param nSpecCap �豸֧�ֵ�����
	 * @param pCapParam ��nSpecCap �Ĳ������
	 * @param lpDeviceInfo �豸��Ϣ,�����������
	 * @param nError ���ص�¼������
	 * <table>
	 * <tr><td>������</td><td>������</td></tr> 
	 * <tr><td>1</td><td>���벻��ȷ </td></tr>
	 * <tr><td>2</td><td>�û��������� </td></tr>
	 * <tr><td>3</td><td>��¼��ʱ</td></tr>
	 * <tr><td>4</td><td>�ʺ��ѵ�¼</td></tr>
	 * <tr><td>5</td><td>�ʺ��ѱ����� </td></tr>
	 * <tr><td>6</td><td>�ʺű���Ϊ������ </td></tr> 
	 * <tr><td>7</td><td>��Դ����,ϵͳæ</td></tr> 
	 * <tr><td>8</td><td>������ʧ�� </td></tr>
	 * <tr><td>9</td><td>������ʧ�� </td></tr>
	 * <tr><td>10</td><td> ��������û������� </td></tr>
	 * </table>
	 * @return ʧ�ܷ���0,�ɹ������豸ID,��¼�ɹ�֮����豸�Ĳ���������ͨ����ֵ(�豸���)��Ӧ����Ӧ���豸 
	 * \endif
	 * @see Logout Login
	 */
	
	public static native long 			LoginEx(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int nSpecCap, Object pCapParam, NET_DEVICEINFO lpDeviceInfo, Integer nError);
	
	public static native long 			LoginEx2(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int/*EM_LOGIN_SPAC_CAP_TYPE*/ emSpecCap, Object pCapParam, NET_DEVICEINFO_Ex lpDeviceInfo, Integer nError);
	/**
	 * \if ENGLISH_LANG
	 * Log out the device 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return successful return to TRUE,failed return to FALSE
	 * \else
	 * �˳��豸
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	public static native boolean   		Logout(long lLoginID);

	/**
	 * \if ENGLISH_LANG
	 * New configuration interface, Search configuration information(using Json protocol, see configuration SDK)
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param szCommand command parameter, refer to ParseData 
	 * @param nChannelID channel NO.
	 * @param szOutBuffer output buffering 
	 * @param dwOutBufferSize output buffering size
	 * @param error wrong code 
	 * <table>
	 * <tr><td>0</td><td>successful</td></tr> 
	 * <tr><td>1</td><td>failed</td></tr> 
	 * <tr><td>2</td><td>illegal data</td></tr> 
	 * <tr><td>3</td><td>temporarily not available</td></tr> 
	 * <tr><td>4</td><td>not authorized </td></tr>
	 * </table>
	 * @param waittime overtime of wailing
	 * @return true:success, false:failed
	 * \else
	 * �����ýӿ�,��ѯ������Ϣ(��Json��ʽ)
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ   {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param szCommand �������,��� ParseData 
	 * @param nChannelID ͨ���� 
	 * @param szOutBuffer ������� 
	 * @param dwOutBufferSize ��������С 
	 * @param error ������ 
	 * <table>
	 * <tr><td>0</td><td>�ɹ�</td></tr> 
	 * <tr><td>1</td><td>ʧ�� </td></tr>
	 * <tr><td>2</td><td>���ݲ��Ϸ� </td></tr>
	 * <tr><td>3</td><td>��ʱ�޷�����</td></tr> 
	 * <tr><td>4</td><td>û��Ȩ�� </td></tr>
	 * </table>
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see ParseData
	 */
	
	public static native  boolean  	GetNewDevConfig(long lLoginID, String szCommand, int nChannelID, char[] szOutBuffer, int dwOutBufferSize, Integer error, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * New configuration interface, Set configuration information(using Json protocol, see configuration SDK)
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param szCommand  please refer to ParseData
	 * @param nChannelID channel NO.
	 * @param szInBuffer input buffering
	 * @param dwInBufferSize input buffering size
	 * @param error worng code
	 * <table>
	 * <tr><td>0</td><td>successful</td></tr> 
	 * <tr><td>1</td><td>failed</td></tr> 
	 * <tr><td>2</td><td>illegal data </td></tr>
	 * <tr><td>3</td><td>temporarily not available </td></tr>
	 * <tr><td>4</td><td>not authorized</td></tr> 
	 * </table>
	 * @param restart reboot device after set config,1 is reboot,0 is not reboot
	 * @param waittime overtime of waiting  
	 * @return true:success, false:failed
	 * \else
	 * �����ýӿ�,����������Ϣ(��Json��ʽ)
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param szCommand  ������� ��� ParseData
	 * @param nChannelID ͨ���� 
	 * @param szInBuffer ���뻺�� 
	 * @param dwInBufferSize ���뻺���С 
	 * @param error ������
	 * <table>
	 * <tr><td>0</td><td>�ɹ� </td></tr>
	 * <tr><td>1</td><td>ʧ�� </td></tr>
	 * <tr><td>2</td><td> ���ݲ��Ϸ� </td></tr>
	 * <tr><td>3</td><td> ��ʱ�޷����� </td></tr>
	 * <tr><td>4</td><td> û��Ȩ�� </td></tr>
	 * </table>
	 * @param restart �������ú��Ƿ���Ҫ�����豸,1��ʾ��Ҫ����,0��ʾ����Ҫ���� 
	 * @param waittime �ȴ�ʱ��  
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see PacketData  ParseData
	 */
	
	public static native  boolean  	SetNewDevConfig(long lLoginID, String szCommand, int nChannelID, char[] szInBuffer, long dwInBufferSize, Integer error, Integer restart, int waittime);
	
	public static native  boolean  	DeleteDevConfig(long lLoginID, NET_IN_DELETECFG pInParam, NET_OUT_DELETECFG pOutParam, int nWaittime);
	
	/**
	 * \if ENGLISH_LANG
	 * analyze to receive character string config info
	 * @param szCommand command parameter, as follows
	 * GetNewDevConfig �� SetNewDevConfig �ӿ�����
	 * <table>
	 * <tr><td>CFG_CMD_ENCODE</td><td>"Encode"</td><td>image channel property config,structure CFG_ENCODE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD</td><td>"Record"</td><td>timed recordconfig,structure CFG_RECORD_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ALARMINPUT</td><td>"Alarm"</td><td>external inputalarmconfig,structure CFG_ALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETALARMINPUT</td><td>"NetAlarm"</td><td>network alarmconfig,structure CFG_NETALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MOTIONDETECT</td><td>"MotionDetect"</td><td>dynamic detectionalarmconfig,structure CFG_MOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOLOST</td><td>"LossDetect"</td><td>video loss alarmconfig,structure CFG_VIDEOLOST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOBLIND</td><td>"BlindDetect"</td><td>video mask alarmconfig,structure CFG_SHELTER_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGENOEXIST</td><td>"StorageNotExist"</td><td>no storage device config,structure CFG_STORAGENOEXIST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEFAILURE</td><td>"StorageFailure"</td><td>storage device access mistake config,structure CFG_STORAGEFAILURE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGELOWSAPCE</td><td>"StorageLowSpace"</td><td>storage device low volume config,structure CFG_STORAGELOWSAPCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETABORT</td><td>"NetAbort"</td><td>disconnected config,structure CFG_NETABORT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPCONFLICT</td><td>"IPConflict"</td><td>IP conflict setting,structure CFG_IPCONFLICT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPCAPINFO</td><td>"SnapInfo"</td><td>snapshot ,structure CFG_SNAPCAPINFO_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NAS</td><td>"NAS"</td><td>network storage serverconfig,structure CFG_NAS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_PTZ</td><td>"Ptz"</td><td>PTZ config,structure CFG_PTZ_INFO</td></tr> 
	 * <tr><td>CFG_CMD_WATERMARK</td><td>"WaterMark"</td><td>video water mark config,structure CFG_WATERMARK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEGLOBAL</td><td>"VideoAnalyseGlobal"</td><td>video full analysis config,structure CFG_ANALYSEGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEMODULE</td><td>"VideoAnalyseModule"</td><td>object's detection module config,structure CFG_ANALYSEMODULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSERULE</td><td>"VideoAnalyseRule"</td><td>video analyzing rule config,structure CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSESOURCE</td><td>"VideoAnalyseSource"</td><td>video analyzing resource config,structure CFG_ANALYSESOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAINBRUSH</td><td>"RainBrush"</td><td>wiper config CFG_RAINBRUSH_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICGLOBAL</td><td>"TrafficGlobal"</td><td>full intellifent traffic config CFG_TRAFFICGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEV_GENERRAL</td><td>"General"</td><td>normal config CFG_DEV_DISPOSITION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ATMMOTION</td><td>"FetchMoneyOverTime"</td><td>ATM expired config CFG_ATMMOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPSOURCE</td><td>"SnapSource"</td><td>snapshot source config,structure CFG_SNAPSOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVICESTATUS</td><td>"DeviceStatus"</td><td>device status info CFG_DEVICESTATUS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HARDDISKTANK</td><td>"HardDiskTank"</td><td>extension info,structure CFG_HARDISKTANKGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAIDGROUP</td><td>"RaidGroup"</td><td>Raid froup info,structure CFG_RAIDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOOLGROUP</td><td>"StoragePoolGroup"</td><td>storage pool info,structure CFG_STORAGEPOOLGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOSITIONGROUP</td><td>"StoragePositionGroup"</td><td>file system group info,structure CFG_STORAGEPOSITIONGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINDEVGROUP</td><td>"VideoInDevGroup"</td><td>frong-end device group info CFG_VIDEOINDEVGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVRECORDGROUP</td><td>"DevRecordGroup"</td><td>channelrecord group status,structure CFG_DEVRECORDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPSSERVER</td><td>"IpsServer"</td><td>service status,structure CFG_IPSERVER_STATUS </td></tr>
	 * <tr><td>CFG_CMD_MATRIX_SPOT</td><td>"SpotMatrix"</td><td>Spot vide matrix,structure CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>every number channel dsp info,structure CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>every number channel dsp info,structure CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SPLITTOUR</td><td>"SplitTour"</td><td>video splicing tour config,structure CFG_VIDEO_MATRIX</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOENCODEROI</td><td>"VideoEncodeROI"</td><td>video encode ROI(Region of Intrest)config,structure CFG_VIDEOENCODEROI_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEO_INMETERING</td><td>"VideoInMetering"</td><td>light inspection config,structure CFG_VIDEO_INMETERING_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFIC_FLOWSTAT</td><td>"TrafficFlowStat"</td><td>traffic flow statistics config,structure CFG_TRAFFIC_FLOWSTAT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINOPTIONS</td><td>"VideoInOptions"</td><td>videoinput front-end option,structure CFG_VIDEO_IN_OPTIONS</td></tr> 
	 * <tr><td>CFG_CMD_RTSP</td><td>"RTSP"</td><td>RTSP config,structure CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICSNAPSHOT_MULTI</td><td>"TrafficSnapshotNew"</td><td>intelligent traffic snapshot CFG_TRAFFICSNAPSHOT_NEW_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MULTICAST</td><td>"Multicast"</td><td>multicast related config,structure CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROFILE</td><td>"VideoDiagnosisProfile"</td><td>video diagnosis parameter list,structure CFG_VIDEODIAGNOSIS_PROFILE</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK</td><td>"VideoDiagnosisTask"</td><td>video diagnosis task list,structure CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROJECT</td><td>"VideoDiagnosisProject"</td><td>video diagnosis plan list CFG_VIDEODIAGNOSIS_PROJECT </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GLOBAL</td><td>"VideoDiagnosisGlobal"</td><td>video full diagnosis list CFG_VIDEODIAGNOSIS_GLOBAL </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK_ONE</td><td>"VideoDiagnosisTask.x"</td><td>video diagnosis task list CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_TRAFFIC_WORKSTATE</td><td>"WorkState"</td><td>device working status relatedconfig,structure CFG_TRAFFIC_WORKSTATE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEDEVGROUP</td><td>"StorageDevGroup"</td><td>disk storage group config,structure CFG_STORAGEGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORDTOGROUP</td><td>"RecordToGroup"</td><td>record stored storage group config,structure CFG_RECORDTOGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_INTELLITRACKSCENE</td><td>"IntelliTrackScene"</td><td>intelligent tracking scene config,structure CFG_INTELLITRACKSCENE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IVSFRAM_RULE</td><td>"IVSFramRule"</td><td>intelligent frame rule config,structure CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD_STORAGEPOINT</td><td>"RecordStoragePoint"</td><td>record storage point mapping config,structure CFG_RECORDTOSTORAGEPOINT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MD_SERVER</td><td>"MetaDataServer"</td><td>source data serverconfig,structure CFG_METADATA_SERVER </td></tr>
	 * <tr><td>CFG_CMD_CHANNELTITLE</td><td>"ChannelTitle"</td><td>channel name AV_CFG_ChannelName </td></tr>
	 * <tr><td>CFG_CMD_RECORDMODE</td><td>"RecordMode"</td><td>record mode AV_CFG_RecordMode </td></tr>
	 * <tr><td>CFG_CMD_VIDEOOUT</td><td>"VideoOut"</td><td>videooutput property AV_CFG_VideoOutAttr </td></tr>
	 * <tr><td>CFG_CMD_REMOTEDEVICE</td><td>"RemoteDevice"</td><td>remote device info AV_CFG_RemoteDevice</td></tr> 
	 * <tr><td>CFG_CMD_REMOTECHANNEL</td><td>"RemoteChannel"</td><td>remote channel AV_CFG_RemoteChannel </td></tr>
	 * <tr><td>CFG_CMD_MONITORTOUR</td><td>"MonitorTour"</td><td>image tour config AV_CFG_MonitorTour </td></tr>
	 * <tr><td>CFG_CMD_MONITORCOLLECTION</td><td>"MonitorCollection"</td><td>image favorite config AV_CFG_MonitorCollection </td></tr>
	 * <tr><td>CFG_CMD_DISPLAYSOURCE</td><td>"DisplaySource"</td><td>image splicing display source config AV_CFG_ChannelDisplaySource </td></tr>
	 * <tr><td>CFG_CMD_RAID</td><td>"Raid"</td><td>storage group config AV_CFG_Raid </td></tr>
	 * <tr><td>CFG_CMD_RECORDSOURCE</td><td>"RecordSource"</td><td>record source config AV_CFG_RecordSource </td></tr>
	 * <tr><td>CFG_CMD_VIDEOCOLOR</td><td>"VideoColor"</td><td>videoinput color config AV_CFG_ChannelVideoColor </td></tr>
	 * <tr><td>CFG_CMD_VIDEOWIDGET</td><td>"VideoWidget"</td><td>video encoding object config AV_CFG_VideoWidget </td></tr>
	 * <tr><td>CFG_CMD_STORAGEGROUP</td><td>"StorageGroup"</td><td>storage group info AV_CFG_StorageGroup </td></tr>
	 * <tr><td>CFG_CMD_LOCALS</td><td>"Locales"</td><td>area config AV_CFG_Locales </td></tr>
	 * <tr><td>CFG_CMD_LANGUAGE</td><td>"Language"</td><td>language selection AV_CFG_Language </td></tr>
	 * <tr><td>CFG_CMD_ACCESSFILTER</td><td>"AccessFilter"</td><td>visit address filter AV_CFG_AccessFilter </td></tr>
	 * <tr><td>CFG_CMD_AUTOMAINTAIN</td><td>"AutoMaintain"</td><td>auto maintenance AV_CFG_AutoMaintain </td></tr>
	 * <tr><td>CFG_CMD_REMOTEEVENT</td><td>"RemoteEvent"</td><td>remote device event process AV_CFG_RemoteEvent </td></tr>
	 * <tr><td>CFG_CMD_MONITORWALL</td><td>"MonitorWall"</td><td>display wall config AV_CFG_MonitorWall </td></tr>
	 * <tr><td>CFG_CMD_SPLICESCREEN</td><td>"VideoOutputComposite"</td><td>mixing screen config AV_CFG_SpliceScreen </td></tr>
	 * <tr><td>CFG_CMD_TEMPERATUREALARM</td><td>"TemperatureAlarm"</td><td>temperature alarmconfig AV_CFG_TemperatureAlarm </td></tr>
	 * <tr><td>CFG_CMD_FANSPEEDALARM</td><td>"FanSpeedAlarm"</td><td>fan speed alarmconfig AV_CFG_FanSpeedAlarm </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUP</td><td>"RecordBackupRestore.BitrateLimit"</td><td>record rotate config AV_CFG_RecordBackup </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUPDEVICE</td><td>"RecordBackupRestore.BackupDevices"</td><td>record rotate backup device config AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_COMM</td><td>"Comm"</td><td>serial config CFG_COMMGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETWORK</td><td>"Network"</td><td>network config CFG_NETWORK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NASEX</td><td>"NAS"</td><td>network storage serverconfig, multi-server CFG_NAS_GROUP_INFO_EX </td></tr>
	 * <tr><td>CFG_CMD_ALARMOUT</td><td>"AlarmOut"</td><td>alarmoutput channel config CFG_ALARMOUT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_COMMGLOBAL</td><td>"CommGlobal"</td><td>global alarm config CFG_COMMGLOBAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_MOBILE</td><td>"Mobile"</td><td>mobile config CFG_MOBILE_INFO</td></tr>  
	 * <tr><td>CFG_CMD_NTP</td><td>"NTP"</td><td>time synchronization config CFG_NTP_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PHONEEVENTNOTIFY</td><td>"PhoneEventNotify"</td><td>phone center notify config CFG_PHONEEVENTNOTIFY_INFO</td></tr>  
	 * <tr><td>CFG_CMD_WIRELESS</td><td>"Wireless"</td><td>wireless connect config CFG_WIRELESS_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PSTN_ALARM_SERVER</td><td>"PSTNAlarmServer"</td><td>phone alarm center config CFG_PSTN_ALARM_CENTER_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_GENERAL</td><td>"AccessControlGeneral"</td><td>access control general config CFG_ACCESS_GENERAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_EVENT</td><td>"AccessControl"</td><td>access event config CFG_ACCESS_EVENT_INFO</td></tr>  
	 * </table>
	 * <table>
	 * <tr><td>QueryNewSystemInfo interface command
	 * <tr><td>CFG_CAP_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.getCaps"</td><td>video analysis capacity collection,structure CFG_CAP_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_NETAPP_REMOTEDEVICE</td><td>"netApp.getRemoteDeviceStatus"</td><td>receive rear device's online status,structure CFG_REMOTE_DEVICE_STATUS 
	 * <tr><td>CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.factory.getCollect"</td><td>device intelligent analysis capacity,structure CFG_CAP_DEVICE_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_DEVICE_STATE</td><td>"trafficSnap.getDeviceStatus"</td><td>receive external device status info,structure CFG_CAP_TRAFFIC_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEOINPUT</td><td>"devVideoInput.getCaps"</td><td>videoinput capacity collection,structure CFG_CAP_VIDEOINPUT_INFO</td></tr> 
	 * <tr><td>CFG_USERMANAGER_ACTIVEUSER</td><td>"userManager.getActiveUserInfoAll"</td><td>receive all active users info,structure CFG_ACTIVEUSER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_VIDEOSTAT_SUMMARY</td><td>"videoStatServer.getSummary"</td><td>receive video statistics summary,structure CFG_VIDEOSATA_SUMMARY_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT</td><td>"videoDiagnosisServer.factory.getCollect"</td><td>receive video disgnosis serving capacity,structure CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETSTATE</td><td>"videoDiagnosisServer.getState"</td><td>receive video disgnosis channel quantity,structure CFG_VIDEODIAGNOSIS_STATE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER</td><td>"videoDiagnosisServer.getCaps"</td><td>receive video disgnosis progress status,structure CFG_VIDEODIAGNOSIS_CAPS_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EVENTMANAGER</td><td>"eventManager.getCaps"</td><td>get alarm event handler capacity , old structure is abolish,please use this structure if develop CFG_CAP_EVENTMANAGER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EXALARMBOX</td><td>"alarm.getExAlarmBoxCaps"</td><td>get externd alarm box capacity CFG_CAP_EXALARMBOX_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EXALARM</td><td>"alarm.getExAlarmCaps"</td><td>get extend alarm capacity CFG_CAP_EXALARM_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_ACCESSCONTROLMANAGER</td><td>"accessControlManager.getCaps"</td><td>get access control manager capacity CFG_CAP_ACCESSCONTROL</td></tr> 
	 * <tr><td>CFG_CAP_CMD_FILEMANAGER</td><td>"FileManager.getCaps"</td><td>get file manager capacity CFG_CAP_FILEMANAGER</td></tr>
	 * <tr><td>CFG_CAP_CMD_RECORDFINDER</td><td>"RecordFinder.getCaps"</td><td>get record finder capacity CFG_CAP_RECORDFINDER_INFO</td></tr> 
	 * </table>
	 * @param szInBuffer input buffering,character config buffering
	 * @param stParseData output buffering,structure type refer to above chart
	 * @param pReserved reserve parameter
	 * @return true:success, false:failed
	 * \else
	 * ������ѯ����������Ϣ
	 * @param szCommand �������
	 * GetNewDevConfig �� SetNewDevConfig �ӿ�����
	 * <table>
	 * <tr><td>CFG_CMD_ENCODE</td><td>"Encode"</td><td>ͼ��ͨ����������,�ṹ��  CFG_ENCODE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD</td><td>"Record"</td><td>��ʱ¼������,�ṹ��  CFG_RECORD_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ALARMINPUT</td><td>"Alarm"</td><td>�ⲿ���뱨������,�ṹ��  CFG_ALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETALARMINPUT</td><td>"NetAlarm"</td><td>���籨������,�ṹ��  CFG_NETALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MOTIONDETECT</td><td>"MotionDetect"</td><td>��̬��ⱨ������,�ṹ��  CFG_MOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOLOST</td><td>"LossDetect"</td><td>��Ƶ��ʧ��������,�ṹ��  CFG_VIDEOLOST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOBLIND</td><td>"BlindDetect"</td><td>��Ƶ�ڵ���������,�ṹ��  CFG_SHELTER_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGENOEXIST</td><td>"StorageNotExist"</td><td>û�д洢�豸����,�ṹ��  CFG_STORAGENOEXIST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEFAILURE</td><td>"StorageFailure"</td><td>�洢�豸���ʳ�������,�ṹ��  CFG_STORAGEFAILURE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGELOWSAPCE</td><td>"StorageLowSpace"</td><td>�洢�豸����������,�ṹ��  CFG_STORAGELOWSAPCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETABORT</td><td>"NetAbort"</td><td>����Ͽ�����,�ṹ��  CFG_NETABORT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPCONFLICT</td><td>"IPConflict"</td><td>IP��ͻ����,�ṹ��  CFG_IPCONFLICT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPCAPINFO</td><td>"SnapInfo"</td><td>ץͼ����,�ṹ��  CFG_SNAPCAPINFO_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NAS</td><td>"NAS"</td><td>����洢����������,�ṹ��  CFG_NAS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_PTZ</td><td>"Ptz"</td><td>��̨����,�ṹ��  CFG_PTZ_INFO</td></tr> 
	 * <tr><td>CFG_CMD_WATERMARK</td><td>"WaterMark"</td><td>��Ƶˮӡ����,�ṹ�� CFG_WATERMARK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEGLOBAL</td><td>"VideoAnalyseGlobal"</td><td>��Ƶ����ȫ������,�ṹ��  CFG_ANALYSEGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEMODULE</td><td>"VideoAnalyseModule"</td><td>����ļ��ģ������,�ṹ��  CFG_ANALYSEMODULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSERULE</td><td>"VideoAnalyseRule"</td><td>��Ƶ������������,�ṹ��  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSESOURCE</td><td>"VideoAnalyseSource"</td><td>��Ƶ������Դ����,�ṹ��  CFG_ANALYSESOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAINBRUSH</td><td>"RainBrush"</td><td>��ˢ����  CFG_RAINBRUSH_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICGLOBAL</td><td>"TrafficGlobal"</td><td>���ܽ�ͨȫ������ CFG_TRAFFICGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEV_GENERRAL</td><td>"General"</td><td>��ͨ����  CFG_DEV_DISPOSITION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ATMMOTION</td><td>"FetchMoneyOverTime"</td><td>ATMȡ�ʱ����  CFG_ATMMOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPSOURCE</td><td>"SnapSource"</td><td>ץͼԴ����,�ṹ��  CFG_SNAPSOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVICESTATUS</td><td>"DeviceStatus"</td><td>�豸״̬��Ϣ  CFG_DEVICESTATUS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HARDDISKTANK</td><td>"HardDiskTank"</td><td>��չ����Ϣ,�ṹ��  CFG_HARDISKTANKGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAIDGROUP</td><td>"RaidGroup"</td><td>Raid����Ϣ,�ṹ��  CFG_RAIDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOOLGROUP</td><td>"StoragePoolGroup"</td><td>�洢������Ϣ,�ṹ��  CFG_STORAGEPOOLGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOSITIONGROUP</td><td>"StoragePositionGroup"</td><td>�ļ�ϵͳ����Ϣ,�ṹ��  CFG_STORAGEPOSITIONGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINDEVGROUP</td><td>"VideoInDevGroup"</td><td>ǰ���豸����Ϣ  CFG_VIDEOINDEVGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVRECORDGROUP</td><td>"DevRecordGroup"</td><td>ͨ��¼����״̬,�ṹ��  CFG_DEVRECORDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPSSERVER</td><td>"IpsServer"</td><td>����״̬,�ṹ��  CFG_IPSERVER_STATUS</td></tr> 
	 * <tr><td>CFG_CMD_MATRIX_SPOT</td><td>"SpotMatrix"</td><td>Spot��������,�ṹ��  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>ÿ������ͨ����dsp��Ϣ,�ṹ��  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>ÿ������ͨ����dsp��Ϣ,�ṹ��  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SPLITTOUR</td><td>"SplitTour"</td><td>��Ƶ�ָ���Ѳ����,�ṹ��  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_VIDEOENCODEROI</td><td>"VideoEncodeROI"</td><td>��Ƶ����ROI(Region of Intrest)����,�ṹ��  CFG_VIDEOENCODEROI_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEO_INMETERING</td><td>"VideoInMetering"</td><td>�������,�ṹ��  CFG_VIDEO_INMETERING_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFIC_FLOWSTAT</td><td>"TrafficFlowStat"</td><td>��ͨ����ͳ������,�ṹ��  CFG_TRAFFIC_FLOWSTAT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINOPTIONS</td><td>"VideoInOptions"</td><td>��Ƶ����ǰ��ѡ��,�ṹ��  CFG_VIDEO_IN_OPTIONS </td></tr>
	 * <tr><td>CFG_CMD_RTSP</td><td>"RTSP"</td><td>RTSP������,�ṹ��  CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICSNAPSHOT_MULTI</td><td>"TrafficSnapshotNew"</td><td>���ܽ�ͨץ�� CFG_TRAFFICSNAPSHOT_NEW_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MULTICAST</td><td>"Multicast"</td><td>�鲥���������,�ṹ��  CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROFILE</td><td>"VideoDiagnosisProfile"</td><td>��Ƶ��ϲ�����,�ṹ��  CFG_VIDEODIAGNOSIS_PROFILE </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK</td><td>"VideoDiagnosisTask"</td><td>��Ƶ��������,�ṹ��  CFG_VIDEODIAGNOSIS_TASK</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROJECT</td><td>"VideoDiagnosisProject"</td><td>��Ƶ��ϼƻ���  CFG_VIDEODIAGNOSIS_PROJECT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GLOBAL</td><td>"VideoDiagnosisGlobal"</td><td>��Ƶ���ȫ�ֱ�  CFG_VIDEODIAGNOSIS_GLOBAL </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK_ONE</td><td>"VideoDiagnosisTask.x"</td><td>��Ƶ��������  CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_TRAFFIC_WORKSTATE</td><td>"WorkState"</td><td>�豸����״̬�������,�ṹ��  CFG_TRAFFIC_WORKSTATE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEDEVGROUP</td><td>"StorageDevGroup"</td><td>���̴洢������,�ṹ��  CFG_STORAGEGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORDTOGROUP</td><td>"RecordToGroup"</td><td>¼���ŵĴ洢������,�ṹ��  CFG_RECORDTOGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_INTELLITRACKSCENE</td><td>"IntelliTrackScene"</td><td>���ܸ��ٳ�������,�ṹ��  CFG_INTELLITRACKSCENE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IVSFRAM_RULE</td><td>"IVSFramRule"</td><td>����֡��������,�ṹ��  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD_STORAGEPOINT</td><td>"RecordStoragePoint"</td><td>¼��洢��ӳ������,�ṹ��  CFG_RECORDTOSTORAGEPOINT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MD_SERVER</td><td>"MetaDataServer"</td><td>Ԫ���ݷ���������,�ṹ��  CFG_METADATA_SERVER </td></tr>
	 * <tr><td>CFG_CMD_CHANNELTITLE</td><td>"ChannelTitle"</td><td>ͨ������  AV_CFG_ChannelName </td></tr>
	 * <tr><td>CFG_CMD_RECORDMODE</td><td>"RecordMode"</td><td>¼��ģʽ  AV_CFG_RecordMode </td></tr>
	 * <tr><td>CFG_CMD_VIDEOOUT</td><td>"VideoOut"</td><td>��Ƶ�������  AV_CFG_VideoOutAttr </td></tr>
	 * <tr><td>CFG_CMD_REMOTEDEVICE</td><td>"RemoteDevice"</td><td>Զ���豸��Ϣ  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_REMOTECHANNEL</td><td>"RemoteChannel"</td><td>Զ��ͨ��  AV_CFG_RemoteChannel </td></tr>
	 * <tr><td>CFG_CMD_MONITORTOUR</td><td>"MonitorTour"</td><td>������ѵ����  AV_CFG_MonitorTour </td></tr>
	 * <tr><td>CFG_CMD_MONITORCOLLECTION</td><td>"MonitorCollection"</td><td>�����ղ�����  AV_CFG_MonitorCollection </td></tr>
	 * <tr><td>CFG_CMD_DISPLAYSOURCE</td><td>"DisplaySource"</td><td>����ָ���ʾԴ����  AV_CFG_ChannelDisplaySource </td></tr>
	 * <tr><td>CFG_CMD_RAID</td><td>"Raid"</td><td>�洢��������  AV_CFG_Raid </td></tr>
	 * <tr><td>CFG_CMD_RECORDSOURCE</td><td>"RecordSource"</td><td>¼��Դ����  AV_CFG_RecordSource </td></tr>
	 * <tr><td>CFG_CMD_VIDEOCOLOR</td><td>"VideoColor"</td><td>��Ƶ������ɫ����  AV_CFG_ChannelVideoColor</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOWIDGET</td><td>"VideoWidget"</td><td>��Ƶ�����������  AV_CFG_VideoWidget </td></tr>
	 * <tr><td>CFG_CMD_STORAGEGROUP</td><td>"StorageGroup"</td><td>�洢����Ϣ  AV_CFG_StorageGroup </td></tr>
	 * <tr><td>CFG_CMD_LOCALS</td><td>"Locales"</td><td>��������  AV_CFG_Locales </td></tr>
	 * <tr><td>CFG_CMD_LANGUAGE</td><td>"Language"</td><td>����ѡ��  AV_CFG_Language </td></tr>
	 * <tr><td>CFG_CMD_ACCESSFILTER</td><td>"AccessFilter"</td><td>���ʵ�ַ����  AV_CFG_AccessFilter </td></tr>
	 * <tr><td>CFG_CMD_AUTOMAINTAIN</td><td>"AutoMaintain"</td><td>�Զ�ά��  AV_CFG_AutoMaintain </td></tr>
	 * <tr><td>CFG_CMD_REMOTEEVENT</td><td>"RemoteEvent"</td><td>Զ���豸�¼�����   AV_CFG_RemoteEvent </td></tr>
	 * <tr><td>CFG_CMD_MONITORWALL</td><td>"MonitorWall"</td><td>����ǽ����  AV_CFG_MonitorWall </td></tr>
	 * <tr><td>CFG_CMD_SPLICESCREEN</td><td>"VideoOutputComposite"</td><td>�ں�������  AV_CFG_SpliceScreen </td></tr>
	 * <tr><td>CFG_CMD_TEMPERATUREALARM</td><td>"TemperatureAlarm"</td><td>�¶ȱ�������  AV_CFG_TemperatureAlarm </td></tr>
	 * <tr><td>CFG_CMD_FANSPEEDALARM</td><td>"FanSpeedAlarm"</td><td>����ת�ٱ�������  AV_CFG_FanSpeedAlarm</td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUP</td><td>"RecordBackupRestore.BitrateLimit"</td><td>¼��ش�����  AV_CFG_RecordBackup </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUPDEVICE</td><td>"RecordBackupRestore.BackupDevices"</td><td>¼��ش������豸����  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_COMM</td><td>"Comm"</td><td>��������  CFG_COMMGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETWORK</td><td>"Network"</td><td>��������  CFG_NETWORK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NASEX</td><td>"NAS"</td><td>����洢����������, �������  CFG_NAS_GROUP_INFO_EX </td></tr>
	 * <tr><td>CFG_CMD_ALARMOUT</td><td>"AlarmOut"</td><td>�������ͨ������  CFG_ALARMOUT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_COMMGLOBAL</td><td>"CommGlobal"</td><td>����ȫ������  CFG_COMMGLOBAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_MOBILE</td><td>"Mobile"</td><td>�ƶ����ҵ������  CFG_MOBILE_INFO</td></tr>  
	 * <tr><td>CFG_CMD_NTP</td><td>"NTP"</td><td>ʱ��ͬ��������  CFG_NTP_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PHONEEVENTNOTIFY</td><td>"PhoneEventNotify"</td><td>�绰����֪ͨ����  CFG_PHONEEVENTNOTIFY_INFO</td></tr>  
	 * <tr><td>CFG_CMD_WIRELESS</td><td>"Wireless"</td><td>����������������  CFG_WIRELESS_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PSTN_ALARM_SERVER</td><td>"PSTNAlarmServer"</td><td>�绰������������  CFG_PSTN_ALARM_CENTER_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_GENERAL</td><td>"AccessControlGeneral"</td><td>�Ž���������  CFG_ACCESS_GENERAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_EVENT</td><td>"AccessControl"</td><td>�Ž��¼�����  CFG_ACCESS_EVENT_INFO</td></tr>  
	 * </table>
	 * QueryNewSystemInfo�ӿ�����
	 * <table>
	 * <tr><td>CFG_CAP_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.getCaps"</td><td>��Ƶ����������,�ṹ�� CFG_CAP_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_NETAPP_REMOTEDEVICE</td><td>"netApp.getRemoteDeviceStatus"</td><td>��ȡ����豸�ĵ�����״̬,�ṹ��  CFG_REMOTE_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.factory.getCollect"</td><td>�豸���ܷ�������,�ṹ��  CFG_CAP_DEVICE_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_DEVICE_STATE</td><td>"trafficSnap.getDeviceStatus"</td><td>��ȡ����豸״̬��Ϣ,�ṹ��  CFG_CAP_TRAFFIC_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEOINPUT</td><td>"devVideoInput.getCaps"</td><td>��Ƶ����������,�ṹ��  CFG_CAP_VIDEOINPUT_INFO </td></tr>
	 * <tr><td>CFG_USERMANAGER_ACTIVEUSER</td><td>"userManager.getActiveUserInfoAll"</td><td>�õ����л���û���Ϣ,�ṹ��  CFG_ACTIVEUSER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_VIDEOSTAT_SUMMARY</td><td>"videoStatServer.getSummary"</td><td>��ȡ��Ƶͳ��ժҪ��Ϣ,�ṹ��  CFG_VIDEOSATA_SUMMARY_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT</td><td>"videoDiagnosisServer.factory.getCollect"</td><td>��ȡ��Ƶ���ͨ����Ŀ,�ṹ��  CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETSTATE</td><td>"videoDiagnosisServer.getState"</td><td>��ȡ��Ƶ��Ͻ���״̬,�ṹ��  CFG_VIDEODIAGNOSIS_STATE_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER</td><td>"videoDiagnosisServer.getCaps"</td><td>��ȡ��Ƶ��Ϸ�������,�ṹ��  CFG_VIDEODIAGNOSIS_CAPS_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EVENTMANAGER</td><td>"eventManager.getCaps"</td><td>��ȡ�豸������������,��Э���ѷϳ�,�¿�����ʹ�ø��ֶ�  CFG_CAP_EVENTMANAGER_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARMBOX</td><td>"alarm.getExAlarmBoxCaps"</td><td>��ȡ��չ������������  CFG_CAP_EXALARMBOX_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARM</td><td>"alarm.getExAlarmCaps"</td><td>��ȡ��չ����������  CFG_CAP_EXALARM_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_ACCESSCONTROLMANAGER</td><td>"accessControlManager.getCaps"</td><td>�Ž�����  CFG_CAP_ACCESSCONTROL </td></tr>
	 * <tr><td>CFG_CAP_CMD_FILEMANAGER</td><td>"FileManager.getCaps"</td><td>��ȡ�ļ�����  CFG_CAP_FILEMANAGER </td></tr>
	 * <tr><td>CFG_CAP_CMD_RECORDFINDER</td><td>"RecordFinder.getCaps"</td><td>��ȡ��ѯ��¼������  CFG_CAP_RECORDFINDER_INFO </td></tr>
	 * </table>
	 * @param szInBuffer ���뻺��,�ַ����û��� 
	 * @param stParseData ������Ľṹ�� 
	 * @param pReserved �������� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see GetNewDevConfig  QueryNewSystemInfo 
	 */
	
	public static native  boolean  	ParseData(String szCommand, char[] szInBuffer, Object stParseData, Object pReserved);
	/**
	 * \if ENGLISH_LANG
	 * package config info into character string
	 * @param szCommand command parameter,refer to ParseData
	 * @param stPacketData command parameter,refer to ParseData
	 * @param szOutBuffer output buffering 
	 * @param dwOutBufferSize output buffering size 
	 * @return true:success, false:failed
	 * \else
	 * ���Ҫ���õ�������Ϣ
	 * @param szCommand �������,��� ParseData
	 * @param stPacketData �������ṹ��
	 * @param szOutBuffer ������� 
	 * @param dwOutBufferSize ��������С 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetNewDevConfig
	 */
	
	public static native  boolean  	PacketData(String szCommand, Object stPacketData, char szOutBuffer[], int dwOutBufferSize);
	/**
	 * \if ENGLISH_LANG
	 * Search device status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nType search info type
	 * <table>
	 * <tr><td>nType</td><td>search type</td><td>corresponding structure </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMM_ALARMnormal</td><td>alarm status(include external alarm, dynamic detection, video loss)</td><td>NET_SDK_STATE support lower 16-ch or lower NET_SDK_STATE_EX support 32-ch or lower </td></tr> 
	 * <tr><td>SDK_DEVSTATE_SHELTER_ALARM</td><td>masked alarm status</td><td>16 byte</td></tr> 
	 * <tr><td>SDK_DEVSTATE_RECORDINGrecord</td><td>statu</td><td>16 byte </td></tr>
	 * <tr><td>SDK_DEVSTATE_RESOURCEsearch</td><td>systen resouce status</td><td>3 DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_BITRATEsearch</td><td>cahnnel stream</td><td>channel x DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK</td><td>hard disk status</td><td>SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_PROTOCAL_VER</td><td>network protocol versionint </td></tr>
	 * <tr><td>SDK_DEVSTATE_TALK_ECTYPE</td><td>search device supported bidirectional talk format</td><td>SDKDEV_TALKFORMAT_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SD_CARD</td><td>search sd card info</td><td>SDK_SDCARD_STATE same as SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_DEV</td><td>search writer info</td><td>SDK_BURNING_DEVINFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_PROGRESS</td><td>search writing progress</td><td>SDK_BURNING_PROGRESS </td></tr>
	 * <tr><td>SDK_DEVSTATE_CAMERA</td><td>search camera property info</td><td>SDKDEV_CAMERA_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SOFTWARE</td><td>device software info</td><td>SDKDEV_VERSION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_LANGUAGE</td><td>device language support info</td><td>SDK_DEV_LANGUAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP</td><td>search dsp capacity description</td><td>SDKDEV_DSP_ENCODECAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_OEM</td><td>search oem info</td><td>SDKDEV_OEM_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET</td><td>search network operation status</td><td>SDKDEV_TOTAL_NET_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TYPE</td><td>search device type character</td><td>string </td></tr>
	 * <tr><td>SDK_DEVSTATE_SNAP</td><td>search snapshot function peoperty(IPC products)</td><td>SDK_SNAP_ATTR_EN </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORD_TIME</td><td>search the earliest record time and recent record time</td><td>DEV_DISK_RECORD_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET_RSSI</td><td>search wireless network signel strength</td><td>SDKDEV_WIRELESS_RSS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_ATTACH</td><td>search attachment writing option</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV</td><td>search backup device detailed info</td><td>SDKDEV_BACKUP_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_FEEDBACK</td><td>backup progress feedback</td><td>SDKDEV_BACKUP_FEEDBACK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ATM_QUERY_TRADE</td><td>search ATM trade type</td><td>SDK_ATM_QUERY_TRADE </td></tr>
	 * <tr><td>SDK_DEVSTATE_SIP</td><td>searchsip status</td><td>SDKDEV_SIP_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VICHILE_STATE</td><td>search mobile wifistatus</td><td>SDKDEV_VEHICLE_WIFI_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_EMAIL</td><td>search mail config successful or not</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SMART_HARD_DISK</td><td>search hard disk smartinfo</td><td>SDKDEV_SMART_HARDDISK </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_SNAPPICTURE</td><td>search snapshot setup susseccful or not</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_STATIC_ALARM</td><td>search static alarm status</td><td>DWORD,each means one alarm channel </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBMODULE_INFO</td><td>search device sub module info</td><td>SDKDEV_SUBMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISKDAMAGE</td><td>search hard disk damage capacity	</td><td>SDKDEV_DISKDAMAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_IPC</td><td>search device supported IPC capacity</td><td>SDK_DEV_IPC_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_ARM_DISARM</td><td>search alarm arm/disarm status	</td><td>ALARM_ARM_DISARM_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACC_POWEROFF_ALARM</td><td>searchACC outage alarm status</td><td>return one DWORD, 1 outage,0 electric  </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_FTP_SERVER</td><td>test FTP server connection</td><td>SDKDEV_FTP_SERVER_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_EXCEED</td><td>search3G flow exceed threshold status</td><td>SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_INFO	</td><td>search3G network flow info</td><td>SDK_DEV_3GFLOW_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIHICLE_INFO_UPLOAD	</td><td>monilr customized info upload</td><td>ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_DEVSTATE_SPEED_LIMIT</td><td>search speed limit alarm status	</td><td>ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP_EX</td><td>searchDSP extension capacity</td><td>description	SDKDEV_DSP_ENCODECAP_EX </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GMODULE_INFO</td><td>search3G module info</td><td>SDK_DEV_3GMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MULTI_DDNS</td><td>search multi-DDNSstatusinfo</td><td>SDK_DEV_MULTI_DDNS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_CONFIG_URL</td><td>search device config URLinfo</td><td>SDK_DEV_URL_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_HARDKEY</td><td>searchHardKey</td><td>SDKDEV_HARDKEY_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_ISCSI_PATH</td><td>searchISCSI oath list</td><td>SDKDEV_ISCSI_PATHLIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP</td><td>search device local preview supported splicing mode</td><td>DEVICE_LOCALPREVIEW_SLIPT_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_WIFI_ROUTE_CAP</td><td>search wireless router info</td><td>SDKDEV_WIFI_ROUTE_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_ONLINE</td><td>search device onlinestatusreturn one</td><td>DWORD, 1 online , 0 offline </td></tr>
	 * <tr><td>SDK_DEVSTATE_PTZ_LOCATION</td><td>search PTZ statusinfo</td><td>SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MONITOR_INFO</td><td>image monitor assist info</td><td>SDKDEV_MONITOR_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBDEVICE</td><td>search sub device</td><td>CFG_DEVICESTATUS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_RAID_INFO</td><td>searchRAIDstatus</td><td>ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_DDNSDOMAIN</td><td>test DDNS domain name valid or not  </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIRTUALCAMERA</td><td>search vitual camera status</td><td>SDKDEV_VIRTUALCAMERA_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TRAFFICWORKSTATE</td><td>receive device working video/coil mode status etc.	</td><td>SDKDEV_TRAFFICWORKSTATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_CAMERA_MOVE</td><td>receive camera lost alarm event status</td><td>ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM</td><td>receive external alarm status</td><td>NET_SDK_ALARM_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOLOST</td><td>receive video loss alarm status</td><td>NET_SDK_VIDEOLOST_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_MOTIONDETECT</td><td>receive dynamic detection alarm status	</td><td>NET_SDK_MOTIONDETECT_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_DETAILEDMOTION</td><td>receive detailed dynamic detection alarm status</td><td>NET_SDK_DETAILEDMOTION_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VEHICLE_INFO</td><td>get mobile hardware</td><td>SDKDEV_VEHICLE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOBLIND</td><td>get video mask</td><td>NET_SDK_VIDEOBLIND_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GSTATE_INFO</td><td>search 3G	</td><td>SDKDEV_VEHICLE_3GMODULE </td></tr>
	 * <tr><td>SDK_DEVSTATE_NETINTERFACE</td><td>search port</td><td>SDKDEV_NETINTERFACE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_PICINPIC_CHN</td><td>search PIP</td><td>DWORD group  </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMPOSITE_CHN </td><td>search cubeless video wall channel</td><td>SDK_COMPOSITE_CHANNEL group </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_RECORDING	</td><td>search video status</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_ENCODING</td><td>search encode status</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK_RECORDE_TIME</td><td>search HDD time</td><td>DEV_DISK_RECORD_TIME group </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNER_DOOR	</td><td>eject CD</td><td>NET_DEVSTATE_BURNERDOOR </td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_DATA_CHECK	</td><td>search parity</td><td>NET_DEVSTATE_DATA_CHECK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE</td><td>search alarm channel state</td><td>NET_SDK_ALARM_CHANNELS_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_BYPASS</td><td>search channel bypass state</td><td>NET_DEVSTATE_GET_BYPASS </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARMKEYBOARD_COUNT	</td><td>search alarm keyboard count</td><td>NET_ALARMKEYBOARD_COUNT </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACTIVATEDDEFENCEAREA</td><td>search activated defenced area info</td><td>NET_ACTIVATEDDEFENCEAREA </td></tr>
	 * <tr><td>SDK_DEVSTATE_DEV_RECORDSET</td><td>search device record info</td><td>NET_CTRL_RECORDSET_PARAM </td></tr>
	 * <tr><td>SDK_DEVSTATE_DOOR_STATE</td><td>search access door state</td><td>NET_DOOR_STATUS_INFO </td></tr>
	 * </table> 
	 * @param pDevState output parameter,for returned data cache. based on different types, returned data structure vary
	 * @param waittime search status waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ   {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nType ��ѯ��Ϣ����
	 * <table>
	 * <tr><td>nType</td><td>��ѯ����</td><td>��Ӧ�Ľṹ��</td></tr>
	 * <tr><td>SDK_DEVSTATE_COMM_ALARM</td><td>��ͨ����״̬(�����ⲿ����,��̬���,��Ƶ��ʧ)</td><td>NET_SDK_STATE ֧��16·����  NET_SDK_STATE_EX ֧��32����</td></tr>
	 * <tr><td>SDK_DEVSTATE_SHELTER_ALARM</td><td>�ڵ�����״̬</td><td>6�ֽ� </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORDING¼��״̬ </td><td>16�ֽ� 
	 * <tr><td>SDK_DEVSTATE_RESOURCE</td><td>��ѯϵͳ��Դ״̬</td><td>3��DWORD,��һ��dword 0 ��ʾС��CPU����50% 1 ��ʾ����50%,�ڶ�����ʾTV,��������ʾVGA </td></tr>
	 * <tr><td>SDK_DEVSTATE_BITRATE</td><td>��ѯͨ������ </td><td> ͨ��������DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK</td><td>Ӳ��״̬</td><td> SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_PROTOCAL_VER</td><td>����Э��汾�� </td><td>int </td></tr>
	 * <tr><td>SDK_DEVSTATE_TALK_ECTYPE	</td><td>��ѯ�豸֧�ֵ������Խ���ʽ </td><td>  SDKDEV_TALKFORMAT_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SD_CARD</td><td>��ѯsd����Ϣ</td><td>SDK_SDCARD_STATE ͬ SDK_HARDDISK_STATE �ṹ��һ�� </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_DEV	</td><td>��ѯ��¼����Ϣ</td><td>SDK_BURNING_DEVINFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_PROGRESS</td><td>��ѯ��¼����</td><td>SDK_BURNING_PROGRESS </td></tr>
	 * <tr><td>SDK_DEVSTATE_CAMERA</td><td>��ѯ����ͷ������Ϣ</td><td>SDKDEV_CAMERA_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SOFTWARE</td><td>�豸�����Ϣ </td><td> SDKDEV_VERSION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_LANGUAGE</td><td>�豸����֧����Ϣ</td><td> SDK_DEV_LANGUAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP</td><td>��ѯdsp�������� </td><td> SDKDEV_DSP_ENCODECAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_OEM</td><td>��ѯoem��Ϣ</td><td>SDKDEV_OEM_INFO</td></tr>
	 * <tr><td>SDK_DEVSTATE_NET</td><td>��ѯ��������״̬��Ϣ</td><td>SDKDEV_TOTAL_NET_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TYPE</td><td>��ѯ�豸����</td><td>�ַ��� </td></tr>
	 * <tr><td>SDK_DEVSTATE_SNAP</td><td>��ѯץͼ��������(IPC���Ʒ)</td><td>SDK_SNAP_ATTR_EN </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORD_TIME</td><td>��ѯ����¼��ʱ������¼��ʱ��</td><td>DEV_DISK_RECORD_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET_RSSI</td><td>��ѯ���������ź�ǿ��</td><td>SDKDEV_WIRELESS_RSS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_ATTACH</td><td>��ѯ������¼ѡ��  </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV</td><td>��ѯ�����豸��ϸ��Ϣ </td><td> SDKDEV_BACKUP_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_FEEDBACK</td><td>���ݽ��ȷ���</td><td>SDKDEV_BACKUP_FEEDBACK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ATM_QUERY_TRADE</td><td>��ѯATM�������� </td><td>SDK_ATM_QUERY_TRADE </td></tr>
	 * <tr><td>SDK_DEVSTATE_SIP</td><td>��ѯsip״̬</td><td>SDKDEV_SIP_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VICHILE_STATE</td><td>��ѯ����wifi״̬ </td><td>SDKDEV_VEHICLE_WIFI_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_EMAIL</td><td>��ѯ�ʼ������Ƿ�ɹ� </td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SMART_HARD_DISK	</td><td>��ѯӲ��smart��Ϣ</td><td>SDKDEV_SMART_HARDDISK </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_SNAPPICTURE</td><td>��ѯץͼ�����Ƿ�ɹ�</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_STATIC_ALARM</td><td>��ѯ��̬����״̬ </td><td>DWORD,ÿһλ��ʾһ������ͨ�� </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBMODULE_INFO</td><td>��ѯ�豸��ģ����Ϣ </td><td>SDKDEV_SUBMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISKDAMAGE</td><td>��ѯӲ�̻�������</td><td>SDKDEV_DISKDAMAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_IPC</td><td>��ѯ�豸֧�ֵ�IPC����</td><td>SDK_DEV_IPC_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_ARM_DISARM</td><td>��ѯ����������״̬ </td><td>ALARM_ARM_DISARM_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACC_POWEROFF_ALARM</td><td>��ѯACC�ϵ籨��״̬ </td><td>����һ��DWORD, 1��ʾ�ϵ�,0��ʾͨ�� </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_FTP_SERVER	</td><td>����FTP����������</td><td>SDKDEV_FTP_SERVER_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_EXCEED</td><td>��ѯ3G����������ֵ״̬</td><td>SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_INFO	</td><td>��ѯ3G����������Ϣ</td><td>SDK_DEV_3GFLOW_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIHICLE_INFO_UPLOAD</td><td>�����Զ�����Ϣ�ϴ�</td><td>ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_DEVSTATE_SPEED_LIMIT</td><td>��ѯ���ٱ���״̬</td><td> ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP_EX</td><td>��ѯDSP��չ��������</td><td>SDKDEV_DSP_ENCODECAP_EX </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GMODULE_INFO</td><td>��ѯ3Gģ����Ϣ</td><td>SDK_DEV_3GMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MULTI_DDNS</td><td>��ѯ��DDNS״̬��Ϣ</td><td>SDK_DEV_MULTI_DDNS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_CONFIG_URL</td><td>��ѯ�豸����URL��Ϣ</td><td>SDK_DEV_URL_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_HARDKEY</td><td>��ѯHardKey</td><td>SDKDEV_HARDKEY_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_ISCSI_PATH</td><td>��ѯISCSI·���б� </td><td>SDKDEV_ISCSI_PATHLIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP</td><td>��ѯ�豸����Ԥ��֧�ֵķָ�ģʽ	</td><td>DEVICE_LOCALPREVIEW_SLIPT_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_WIFI_ROUTE_CAP</td><td>��ѯ����·��������Ϣ </td><td>SDKDEV_WIFI_ROUTE_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_ONLINE</td><td>��ѯ�豸������״̬</td><td> ����һ��DWORD, 1��ʾ����, 0��ʾ���� </td></tr>
	 * <tr><td>SDK_DEVSTATE_PTZ_LOCATION</td><td>��ѯ��̨״̬��Ϣ </td><td>SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MONITOR_INFO</td><td>�����ظ�����Ϣ</td><td>SDKDEV_MONITOR_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBDEVICE</td><td>��ѯ���豸</td><td>CFG_DEVICESTATUS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_RAID_INFO</td><td>��ѯRAID״̬</td><td>ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_DDNSDOMAIN</td><td>����DDNS�����Ƿ����  </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIRTUALCAMERA</td><td>��ѯ��������ͷ״̬ </td><td>SDKDEV_VIRTUALCAMERA_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TRAFFICWORKSTATE</td><td>��ȡ�豸������Ƶ/��Ȧģʽ״̬��</td><td>SDKDEV_TRAFFICWORKSTATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_CAMERA_MOVE</td><td>��ȡ�������λ�����¼�״̬ </td><td>ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM</td><td>��ȡ�ⲿ����״̬</td><td>NET_SDK_ALARM_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOLOST</td><td>��ȡ��Ƶ��ʧ����״̬ N</td><td>ET_SDK_VIDEOLOST_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_MOTIONDETECT</td><td>��ȡ��̬��ⱨ��״̬</td><td> NET_SDK_MOTIONDETECT_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_DETAILEDMOTION</td><td>��ȡ��ϸ�Ķ�̬��ⱨ��״̬	</td><td>NET_SDK_DETAILEDMOTION_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VEHICLE_INFO</td><td>��ȡ�����������Ӳ����Ϣ </td><td>SDKDEV_VEHICLE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOBLIND</td><td>��ȡ��Ƶ�ڵ�����״̬</td><td>NET_SDK_VIDEOBLIND_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GSTATE_INFO</td><td>��ѯ3Gģ�������Ϣ</td><td>SDKDEV_VEHICLE_3GMODULE </td></tr>
	 * <tr><td>SDK_DEVSTATE_NETINTERFACE</td><td>��ѯ����ӿ���Ϣ</td><td> SDKDEV_NETINTERFACE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_PICINPIC_CHN</td><td>��ѯ���л�ͨ���� </td><td>DWORD����  </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMPOSITE_CHN</td><td>��ѯ�ں���ͨ����Ϣ</td><td>SDK_COMPOSITE_CHANNEL���� </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_RECORDING	</td><td>��ѯ�豸����¼��״̬ </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_ENCODING</td><td>��ѯ�豸�������״̬ </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK_RECORDE_TIME</td><td>��ѯ�豸Ӳ��¼��ʱ����Ϣ	</td><td>DEV_DISK_RECORD_TIME���� </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNER_DOOR</td><td>�Ƿ��ѵ�����¼������</td><td>NET_DEVSTATE_BURNERDOOR</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_DATA_CHECK</td><td>��ѯ��������У����� </td><td>NET_DEVSTATE_DATA_CHECK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE</td><td>��ѯ����ͨ��״̬</td><td>NET_SDK_ALARM_CHANNELS_STATE</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_BYPASS</td><td>��ѯͨ����·״̬ </td><td>NET_DEVSTATE_GET_BYPASS</td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARMKEYBOARD_COUNT</td><td>��ѯ���������ӵı���������</td><td>NET_ALARMKEYBOARD_COUNT</td></tr>
	 * <tr><td>SDK_DEVSTATE_ACTIVATEDDEFENCEAREA</td><td>��ȡ����ķ�����Ϣ </td><td>NET_ACTIVATEDDEFENCEAREA</td></tr>
	 * <tr><td>SDK_DEVSTATE_DEV_RECORDSET</td><td>��ѯ�豸��¼����Ϣ </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_DEVSTATE_DOOR_STATE</td><td>��ѯ�Ž�״̬ </td><td>NET_DOOR_STATUS_INFO</td></tr>
	 * </table> 
	 * @param pDevState ���ڽ��ղ�ѯ���ص����ݵĻ���
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native  boolean  	QueryDevState(long lLoginID, int nType, Object pDevState, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * start real time monitoring
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID real time monitor channel NO.(from 0)
	 * @return failed return to 0,successful return to real time monitoring ID(real time mnitoring handle),as parameter of related function
	 * \else 
	 * ��ʼʵʱ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param nChannelID ʵʱ����ͨ����(ͨ���Ŵ�0��ʼ) 
	 * @return ʧ�ܷ���0,�ɹ�����ʵʱ����ID(ʵʱ���Ӿ��),����Ϊ��غ����Ĳ��� 
	 * \endif
	 * @see StopRealPlay SaveRealData StopSaveRealData ClientSetVideoEffect GetVideoEffect OpenSound
	 * CloseSound SetVolume SetRealDataCallBack SetRealDataCallBackEx CapturePicture StartTalkEx
	 */	
	
	public static native long          RealPlay(long lLoginID, int nChannelID);
	/**
	 * \if ENGLISH_LANG
	 * start real time monitoring or multi-image preview.for device support dual-stream, may select main tream or extra stream to monitor via setting RealPlayType parameter
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID real time motoring channel NO.\n
	 * if rType is RType_Multiplay this parameter reserved. when rType is RType_Multiplay_1~RType_Multiplay_16,nChannelID determines preview image,if when RType_Multiplay_4,channel is 4 or 5 or 6 or 7 means preview 5th to 7th channel as four image preview 
	 * @param rType enumeration type,refer to SDK_RealPlayType
	 * @return failed return to 0,successful return to real time monitor ID(real time monitor handle),as parameter of related function. 
	 * \else
	 * ʼʵʱ����--��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param nChannelID ʵʱ����ͨ����,\n
	 * ���rTypeΪRType_Multiplay�ò�������\n
	 * ��rTypeΪRType_Multiplay_1~RType_Multiplay_16ʱ,nChannelID������Ԥ���Ļ���,\n
	 * �統RType_Multiplay_4ʱ,nChannelIDΪ4��5��6��7����һ��ֵ��ʾԤ����5����7ͨ�����Ļ���Ԥ�� 
	 * @param rType ö������ ���  SDK_RealPlayType
	 * @return ʧ�ܷ���0,�ɹ�����ʵʱ����ID(ʵʱ���Ӿ��),����Ϊ��غ����Ĳ��� 
	 * \endif
	 * @see StopRealPlayEx SaveRealData StopSaveRealData ClientSetVideoEffect ClientGetVideoEffect OpenSound CloseSound SetVolume SetRealDataCallBack SetRealDataCallBackEx CapturePicture StartTalkEx
	 */
	
	public static native long          RealPlayEx(long lLoginID, int nChannelID, int rType);
	/**
	 * \if ENGLISH_LANG
	 * set real time monitor data recall,provide user with device data,when cbRealData is NULL, end recalling data
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param cbRealData recall function,for sending real time data from device
	 * @return true:success, false:failed
	 * \else
	 * ����ʵʱ�������ݻص�,���û��ṩ�豸����������,��cbRealDataΪNULLʱ�����ص�����
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ 
	 * @param cbRealData �ص�����,���ڴ����豸������ʵʱ���� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay RealPlayEx StopRealPlay
	 */
	public static native boolean       SetRealDataCallBack(long lRealHandle, CB_fRealDataCallBack cbRealData);
	/**
	 * \if ENGLISH_LANG
	 * set real time data recall extension interface,as complementary to previous interface,add one recall data type label dwFlag,may select data to recall, do not recal unrecalled data,when seting is 0x1f, same with previoud interface,but also extend recall function
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param cbRealData recall function, for sending various real time data
	 * @param dwFlag by bit,may group.when it is 0x1f, recall the fine types,as:
	 * <table>
	 * <tr><td>dwFlag</td><td>data type </td></tr> 
	 * <tr><td>0x00000001</td><td>is equivalent with original data</td></tr> 
	 * <tr><td>0x00000002</td><td>is MPEG4/H264 standard data </td></tr>
	 * <tr><td>0x00000004</td><td>YUV data </td></tr>
	 * <tr><td>0x00000008</td><td>PCM data  </td></tr>
	 * <tr><td>0x00000010</td><td>original audio data  </td></tr>
	 * <tr><td>0x0000001f</td><td>above fime data type</td></tr>
	 * </table>
	 * \else
	 * ����ʵʱ�������ݻص�--��չ
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ 
	 * @param cbRealData �ص�����,���ڴ����豸������ʵʱ���� 
	 * @param dwFlag ��������,�ǰ�λ����,�������,Ϊ0x1fʱ�����������Ͷ��ص�
	 * <table>
	 * <tr><td>dwFlag</td><td>�������� </td></tr>
	 * <tr><td>0x00000001</td><td>��ͬԭ����ԭʼ���� </td></tr>
	 * <tr><td>0x00000002</td><td>��MPEG4/H264��׼���� </td></tr>
	 * <tr><td>0x00000004</td><td>YUV���� </td></tr>
	 * <tr><td>0x00000008</td><td>PCM���� </td></tr>
	 * <tr><td>0x00000010</td><td>ԭʼ��Ƶ���� </td></tr>
	 * <tr><td>0x0000001f</td><td>���������������� </td></tr>
	 * </table>
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetRealDataCallBack RealPlay RealPlayEx StopRealPlay
	 */
	
	public static native boolean       SetRealDataCallBackEx(long lRealHandle, CB_fRealDataCallBackEx cbRealData, int dwFlag);
	/**
	 * \if ENGLISH_LANG
	 * set device info recall function, to receive current device status info,not related with call sequence,SDK default not recall,this recall function must be subscribed by alarm info interface SDK_StartListen or CLENT_StartListenEx to be valid
	 * @param user info recall function,may recall device status,such as alarm status may be received via recall; when set to 0 means recall prohibit 
	 * @return 
	 * \else
	 * ������Ϣ�ص�����
	 * @param user ��Ϣ�ص�����,���Իص��豸��״̬,�籨��״̬����ͨ���˻ص���ȡ; ������Ϊ0ʱ��ʾ��ֹ�ص� 
	 * @return ��
	 * \endif
	 * @see StartListen StopListen 
	 */
	
	public static native void          SetDVRMessCallBack(CB_fMessageCallBack user);
	/**
	 * \if ENGLISH_LANG
	 * function meaning:network playback, indeed, user login one device, each channel may play one video at the same time, may not play multiple records of the channel.
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param recordFile record file info,only start time and end time required if play by time, fill in others with 0
	 * @param posUser progress recall function 
	 * @return successful return to network playback ID,ailed return to 0.
	 * \else
	 * ���ļ���ʽ�ط�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param recordFile ¼���ļ���Ϣ,����ʱ�䲥��ʱֻ�������ʼʱ��ͽ���ʱ��,��������0 
	 * @param posUser ���Ȼص�����
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0
	 * \endif
	 */
	
	public static native long          PlayBackByRecordFile(long lLoginID, NET_RECORDFILE_INFO recordFile, CB_fDownLoadPosCallBack posUser);
	/**
	 * \if ENGLISH_LANG
	 * interface with file play extension and data recall, each channel may play one record at the same time, maynot play multiple records of the channel meantime.
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param recordFile record file info
	 * @param posUser progress recall parameter, as SDK_PlayBackByRecordFile 
	 * @param dataUser data recall function 
	 * @return successful return to network playback ID,failed return to 0. 
	 * \else
	 * ���ļ���ʽ�ط�-��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param recordFile ¼���ļ���Ϣ 
	 * @param posUser ���Ȼص�����
	 * @param dataUser ���ݻص����� 
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBac StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	
	public static native long          PlayBackByRecordFileEx(long lLoginID, NET_RECORDFILE_INFO recordFile, CB_fDownLoadPosCallBack posUser, CB_fDataCallBack dataUser);
	/**
	 * \if ENGLISH_LANG
	 * network playback by time,each channel may play one record at the same time, maynot play multiple records of the channel meantime.
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID image channel NO., from 0, must be assigned
	 * @param startTime start itme  
	 * @param stopTime ending time 
	 * @param posUser progess recall function, as SDK_PlayBackByRecordFile 
	 * @return successful return to network playback ID,failed return to 0. 
	 * \else
	 * ��ʱ�䷽ʽ�ط� 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param nChannelID ͼ��ͨ����,��0��ʼ,����ָ�� 
	 * @param startTime ��ʼʱ�� 
	 * @param stopTime ����ʱ��
	 * @param posUser ���Ȼص�����
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	//
	public static native long          PlayBackByTime(long lLoginID, int nChannelID, NET_TIME startTime, NET_TIME stopTime, CB_fDownLoadPosCallBack posUser);
	/**
	 * \if ENGLISH_LANG
	 * extension interface with data recall and playback by time.
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID image channel number, must be assigned
	 * @param startTime start time 
	 * @param stopTime ��end time 
	 * @param posUser progess recall function, as: SDK_PlayBackByRecordFile 
	 * @param dataUser data recall function, as: SDK_PlayBackByRecordFileEx 
	 * @return successful return to network playback ID,failed return to 0.
	 * \else
	 * ��ʱ�䷽ʽ�ط�-��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param nChannelID ͼ��ͨ����,��0��ʼ,����ָ�� 
	 * @param startTime ��ʼʱ�� 
	 * @param stopTime ����ʱ��
	 * @param posUser ���Ȼص�����
	 * @param dataUser ���ݻص�����
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	
	public static native long          PlayBackByTimeEx(long lLoginID, int nChannelID, NET_TIME startTime, NET_TIME stopTime, CB_fDownLoadPosCallBack posUser, CB_fDataCallBack dataUser);
	/**
	 * \if ENGLISH_LANG
	 * download video file by file, download via searched file info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param recordFile video file info pointer 
	 * @param sSavedFileName video file name to save, full path 
	 * @param posUser download progress recall function.download progress recall function parameter explanation: refer SDK_PlayBackByRecordFile 
	 * @return successful return to download ID,failed return to 0. 
	 * \else
	 * ���ļ���ʽ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ
	 * @param recordFile ¼���ļ���Ϣָ��
	 * @param sSavedFileName Ҫ�����¼���ļ���,ȫ·��
	 * @param posUser ���ؽ��Ȼص�����
	 * @return �ɹ���������ID,ʧ�ܷ���0
	 * \endif
	 * @see QueryRecordFile StopDownload GetDownloadPos 
	 */
	
	public static native long          DownloadByRecordFile(long lLoginID, NET_RECORDFILE_INFO recordFile, String sSavedFileName, CB_fDownLoadPosCallBack posUser);
	/**
	 * \if ENGLISH_LANG
	 * download by time, directly input designated channel start time and ending time to play downloaded video
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelId image channel number,start from 0
	 * @param nRecordFileType record type
	 * @param startTime start time
	 * @param stopTime ending time
	 * @param sSavedFileName video file name to save, full path
	 * @param userData download progress recall functiondownload progress recall function parameter explanation refer to SDK_PlayBackByRecordFile 
	 * @return successful return to download ID,failed return to 0. 
	 * \else
	 * ��ʱ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelId ͼ��ͨ����,��0��ʼ 
	 * @param nRecordFileType ¼���ļ�����, QueryRecordFile �ӿ��й��� nRecordFileType ��˵�� 
	 * @param startTime ��ʼʱ�� 
	 * @param stopTime ����ʱ��
	 * @param sSavedFileName Ҫ�����¼���ļ���,ȫ·��
	 * @param userData ���ؽ��Ȼص��������ؽ��Ȼص�����
	 * @return �ɹ���������ID,ʧ�ܷ���0
	 * \endif
	 * @see StopDownload GetDownloadPos 
	 */
	
	public static native long          DownloadByTime(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME startTime, NET_TIME stopTime, String sSavedFileName, CB_fTimeDownLoadPosCallBack userData);
	/**
	 * \if ENGLISH_LANG
	 * log search,support by page search (this interface is rarely supported by device)
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param queryParam  search log parameter 
	 * @param logBuffer return to log buffering area.returned log is one SDK_DEVICE_LOG_ITEM or SDK_DEVICE_LOG_ITEM_EX structure. 
	 * @param recLogNum received log returned 
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸��־,�Է�ҳ��ʽ��ѯ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param queryParam  ��ѯ��־�Ĳ���������־������,���ص���־��һ���� SDK_DEVICE_LOG_ITEM �� SDK_DEVICE_LOG_ITEM_EX �ṹ�� 
	 * @param logBuffer pLogBuffer�������Ĵ�С
	 * @param recLogNum ���ؽ��յ�����־����
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean       QueryDeviceLog(long lLoginID, QUERY_DEVICE_LOG_PARAM queryParam, Object logBuffer[], Integer recLogNum, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitoring
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * ֹͣʵʱ����
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ  
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay
	 */
	//
	public static native boolean       StopRealPlay(long lRealHandle);
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitring or multi-image preview
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * ֹͣʵʱ����--��չ
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ   
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay
	 */
	//
	public static native boolean 	    StopRealPlayEx(long lRealHandle);  
	/**
	 * \if ENGLISH_LANG
	 * open audio, currently only support self-occupied method/ If before calling this function, audio has been turned on and hPlayHandle is different, then turn off original audio and open new audio��function is effective only when hWnd is effective.
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * ������
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ   
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay
	 */
	
	public static native boolean 		OpenSound(long lRealHandle);
	/**
	 * \if ENGLISH_LANG
	 * audio off
	 * @return true:success, false:failed
	 * \else
	 * �ر�����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay
	 */
	
	public static native boolean		CloseSound();
	/**
	 * \if ENGLISH_LANG
	 * set volume,Function is effective only when function's parameter hWnd which open hPlayHandle is effective
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param nVolume volume,range 0~100,0 min
	 * @return true:success, false:failed
	 * \else
	 * ��������
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ   
	 * @param nVolume ����ֵ,��Χ0~100,0������С
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see OpenSound CloseSound RealPlay RealPlayEx PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx 
	 */
	
	public static native boolean       SetVolume(long lRealHandle , int nVolume);
	/**
	 * \if ENGLISH_LANG
	 * stop downloading record file
	 * @param lFileHandle  DownloadByRecordFile return value
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ¼������
	 * @param lFileHandle  DownloadByRecordFile�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see DownloadByRecordFile GetDownloadPos DownloadByTime 
	 */
	
	public static native boolean 		StopDownload(long lFileHandle);
	/**
	 * \if ENGLISH_LANG
	 * stop playback
	 * @param lPlayHandle  playback handle, as PlayBackByRecordFile return value 
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ¼��ط�
	 * @param lPlayHandle  �طž��,�� PlayBackByRecordFile �ķ���ֵ 
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	
	public static native boolean 		StopPlayBack(long lPlayHandle);
	/**
	 * \if ENGLISH_LANG
	 * save image, snapshot displaying image. Parameter received by the function is valid only when function parameter hWnd to open image is valid. Otherwise, invalid.
	 * @param lPlayHandle  See Also return values of all interfaces listed 
	 * @param strPicFileName bitmap name, currently only support BMP
	 * @return true:success, false:failed
	 * \else
	 * ����ץͼ
	 * @param lPlayHandle  �г������нӿڵķ���ֵ 
	 * @param strPicFileName
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealPlay RealPlayEx PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	
	public static native boolean		CapturePicture(long lPlayHandle , String strPicFileName);
	/**
	 * \if ENGLISH_LANG
	 * receive download video current position,may use for non-real-time display interface of downloading progress, similar to download recall function
	 * @param lFileHandle DownloadByRecordFile return value 
	 * @param nTotalSize  download total length,unit:KB
	 * @param nDownLoadSize  downloaded length,unit:KB 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ¼�����ؽ���
	 * @param lFileHandle DownloadByRecordFile�ķ���ֵ 
	 * @param nTotalSize  ���ص��ܳ���,��λ:KB 
	 * @param nDownLoadSize  �����صĳ���,��λ:KB 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see DownloadByRecordFile StopDownload DownloadByTime 
	 */
	//
	public static native boolean		GetDownloadPos(long lFileHandle , Integer nTotalSize , Integer nDownLoadSize);
	/**
	 * \if ENGLISH_LANG
	 * search record file
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelId channel ID,from 0
	 * @param nRecordFileType  record file type,as follows: 
	 * <table>
	 * <tr><td>value</td><td>record file type</td></tr>
	 * <tr><td>0</td><td>all record files </td></tr>
	 * <tr><td>1</td><td>external alarm</td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm</td></tr>
	 * <tr><td>3</td><td>all alarms</td></tr>
	 * <tr><td>4</td><td>card No. search </td></tr>
	 * <tr><td>5</td><td>group condition search</td></tr>
	 * <tr><td>6</td><td>record location and shifting length</td></tr>
	 * <tr><td>8</td><td>search image by card No.(currently only HB-U mand NVS special model support)</td></tr>
	 * <tr><td>9</td><td>search image(currently only HB-U and NVS special model support) </td></tr>
	 * <tr><td>10</td><td>search by text</td></tr>
	 * <tr><td>15</td><td>return to network data structure</td></tr>
	 * <tr><td>16</td><td>search all transparent serial data record file</td></tr>
	 * </table>
	 * @param stTimeStart  record start time 
	 * @param stTimeEnd  record end time
	 * @param cardID cardID
	 * @param stFileInfo returned record file info, is one LPNET_RECORDFILE_INFO structure group 
	 * @param nFileCount  nriFileinfo buffering max length(unit byte,recommend between (100~200)*sizeof(NET_RECORDFILE_INFO))
	 * @param nWaitTime  waiting time 
	 * @param bTime  search by time or not(not availbe now)
	 * @return true:success, false:failed
	 * \else
	 * ����¼���ļ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelId ͨ��ID,��0��ʼ 
	 * @param nRecordFileType  ¼���ļ�����
	 * <table>
	 * <tr><td>��ֵ</td><td>¼���ļ����� </td></tr>
	 * <tr><td>0</td><td>����¼���ļ�  </td></tr>
	 * <tr><td>1</td><td>�ⲿ���� </td></tr>
	 * <tr><td>2</td><td>��̬��ⱨ�� </td></tr>
	 * <tr><td>3</td><td>���б��� </td></tr>
	 * <tr><td>4</td><td>���Ų�ѯ  </td></tr>
	 * <tr><td>5</td><td>���������ѯ </td></tr>
	 * <tr><td>6</td><td>¼��λ����ƫ�������� </td></tr>
	 * <tr><td>8</td><td>�����Ų�ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��) </td></tr>
	 * <tr><td>9</td><td>��ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��)  </td></tr>
	 * <tr><td>10</td><td>���ֶβ�ѯ </td></tr>
	 * <tr><td>15</td><td>�����������ݽṹ(��������) </td></tr>
	 * <tr><td>16</td><td>��ѯ����͸��������¼���ļ� </td></tr>
	 * </table>
	 * @param stTimeStart  ¼��ʼʱ�� 
	 * @param stTimeEnd  ¼�����ʱ��
	 * @param cardID ����
	 * @param stFileInfo ���ص�¼���ļ���Ϣ
	 * @param nFileCount  nriFileinfo�������󳤶�(��λ�ֽ�,������(100~200)*sizeof(NET_RECORDFILE_INFO)֮��)
	 * @param nWaitTime  �ȴ�ʱ�� 
	 * @param bTime  �Ƿ�ʱ���(Ŀǰ��Ч) 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login PlayBackByRecordFile PlayBackByRecordFileEx PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	//
	public static native boolean		QueryRecordFile(long lLoginID , int nChannelId , int nRecordFileType, NET_TIME stTimeStart , NET_TIME stTimeEnd , String cardID ,  NET_RECORDFILE_INFO stFileInfo[], Integer nFileCount , int nWaitTime , boolean bTime);
	/**
	 * \if ENGLISH_LANG
	 * start to save real time monitoring data,save data for frong end device's monitored image,forming record file,this data is original video data sent from device terminal
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay} return value
	 * @param strFileName  real time monitor and save file name 
	 * @return true:success, false:failed
	 * \else
	 * ��������Ϊ�ļ�
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ 
	 * @param strFileName  ʵʱ���ӱ����ļ��� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StopSaveRealData RealPlay RealPlayEx
	 */
	
	public static native boolean 		SaveRealData(long lRealHandle, String strFileName);
	/**
	 * \if ENGLISH_LANG
	 * stop saving real time monitoring data,close saved file
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}return value
	 * @return true:success, false:failed
	 * \else
	 * ������������Ϊ�ļ�
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}�ķ���ֵ   
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SaveRealData RealPlay RealPlayEx
	 */
	//
	public static native boolean 		StopSaveRealData(long lRealHandle);
	/**
	 * \if ENGLISH_LANG
	 * start to update device program
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchFileName uodate file name 
	 * @param cbUpgrade progress recall fcuntion
	 * @param dwUser  user data
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * ��ʼ�����豸����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pchFileName �����ļ��� 
	 * @param cbUpgrade ���Ȼص�����
	 * @param dwUser  �û�����
	 * @return �ɹ������������ID,ʧ�ܷ���0
	 * \endif
	 * @see SendUpgrade StopUpgrade
	 */
	
	public static native long 			StartUpgrade(long lLoginID, String pchFileName, CB_fUpgradeCallBack cbUpgrade);
	/**
	 * \if ENGLISH_LANG
	 * start to sent update file
	 * @param lUpgradeID  update handle ID 
	 * @return true:success, false:failed
	 * \else
	 * ��������
	 * @param lUpgradeID  �������ID 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartUpgrade StopUpgrade 
	 */
	
	public static native boolean 		SendUpgrade(long lUpgradeID);
	/**
	 * \if ENGLISH_LANG
	 * stop epdating
	 * @param lUpgradeID update handle ID
	 * @return true:success, false:failed
	 * \else
	 * ���������豸����
	 * @param lUpgradeID �������ID 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartUpgrade SendUpgrade 
	 */
	
	public static native boolean 		StopUpgrade(long lUpgradeID);
	/**
	 * \if ENGLISH_LANG
	 * receive config member name interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input parameter 
	 * @param pOutParam output parameter 
	 * @param waittime waiting time 
	 * @return successful return to TRUE,failed return to FALSE,if insufficient input buffering area length return to FALSE.
	 * \else
	 * ��ȡ���ó�Ա���ƽӿ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam ������� 
	 * @param pOutParam ������� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return �ɹ�����TRUE,ʧ�ܷ���FALSE,���뻺�������Ȳ���Ҳ����FALSE
	 * \endif
	 */

	public static native boolean 		GetMemberNames(long lLoginID, NET_IN_MEMBERNAME pInParam, NET_OUT_MEMBERNAME pOutParam, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * set asynchronous recall function
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param cbMessData asynchronous recall function
	 * @return true:success, false:failed
	 * \else
	 * �����첽�ص�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param cbMessData asynchronous recall function
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see NET_CALLBACK_DATA
	 */
	
	public static native boolean 		SetOperateCallBack(long lLoginID, CB_fMessDataCallBack cbMessData);
	/**
	 * \if ENGLISH_LANG
	 * control decoder TV display splicing
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID
	 * @param bEnable enable 
	 * @param nSplitType  splicing method
	 * @param pEncoderChannel  encoder channel 
	 * @param nBufLen  pEncoderChannel length
	 * @return return value��0 means failed,others are handle.
	 * \else
	 * ���ƽ�����TV����ָ�,�ӿ�Ϊ�첽��ʽ nSplitType=-1ʱ,pEncoderChannelΪ SDK_CTRL_DECTV_SCREEN ����,nBufLen��Ч,����Ϊbyte����,nBufLen���鳤��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID 
	 * @param bEnable ʹ��
	 * @param nSplitType  �иʽ
	 * @param pEncoderChannel  ������ͨ��
	 * @param nBufLen  pEncoderChannel�ĳ���
	 * @return ����ֵ��0��ʾʧ��,����Ϊ���
	 * \endif
	 */
	
	public static native long 			CtrlDecTVScreen(long lLoginID, int nMonitorID, boolean bEnable, int nSplitType, Object pEncoderChannel, int nBufLen);
	/**
	 * \if ENGLISH_LANG
	 * control decoder TV display splicing switch
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID decoder ID  
	 * @param lpEncoderInfo  connected decoder info
	 * @return 0 means failed,other values not equal to are successful,return one handle
	 * \else
	 * ������TV�����л�,�ӿ�Ϊ�첽��ʽ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nDecoderID ������ID  
	 * @param lpEncoderInfo  ���ӵı�������Ϣ
	 * @return 0��ʾʧ��,����������0��ֵΪ�ɹ�,����һ�����
	 * \endif
	 */
	
	public static native long 			SwitchDecTVEncoder(long lLoginID, int nDecoderID, DEV_ENCODER_INFO lpEncoderInfo);
	/**
	 * \if ENGLISH_LANG
	 * search decoder info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lpDecInfo decoder info 
	 * @param waittime search overtime
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param lpDecInfo ��������Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		QueryDecoderInfo(long lLoginID, DEV_DECODER_INFO lpDecInfo, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * search decoder current TV info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID 
	 * @param lpMonitorInfo connected encoder info 
	 * @param waittime search overtime 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��������ǰTV��Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID 
	 * @param lpMonitorInfo ���ӵı�������Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		QueryDecoderTVInfo(long lLoginID, int nMonitorID, DEV_DECODER_TV lpMonitorInfo, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * search decode channel info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID encoder id
	 * @param lpEncoderInfo encoder info
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ����ͨ����Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nDecoderID ������id 
	 * @param lpEncoderInfo ��������Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		QueryDecEncoderInfo(long lLoginID, int nDecoderID, DEV_ENCODER_INFO lpEncoderInfo, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * set decoder TV output enable
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pDecTVOutEnable enable group
	 * @param nBufLen pDecTVOutEnable length 
	 * @param waittime set ovetime
	 * @return true:success, false:failed
	 * \else
	 * ���ý�����TV���ʹ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pDecTVOutEnable ʹ������
	 * @param nBufLen pDecTVOutEnable�ĳ��� 
	 * @param waittime ���ó�ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see LoginEx Login
	 */
	
	public static native boolean 		SetDecTVOutEnable(long lLoginID, byte pDecTVOutEnable[], int nBufLen, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * Add display grouping
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID 
	 * @param nSplitType splicing method, one of 1,4,9,16 
	 * @param pEncoderChannnel encoder channel,add channel to tour
	 * @param nBufLen pEncoderChannnel  length 
	 * @param waittime overtime 
	 * @return back to display grouping,successful return to one of 0~32,failed return to -1.
	 * \else
	 * ���ӻ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID 
	 * @param nSplitType �иʽ,1,4,9,16 ��һֵ
	 * @param pEncoderChannnel ������ͨ��,���ӵ���ѯ�е�ͨ��
	 * @param nBufLen pEncoderChannnel�ĳ���
	 * @param waittime �ȴ�ʱ��
	 * @return ������ϻ����,�ɹ���ʱ�򷵻�0~32֮���һ����Ϻ�,ʧ�ܷ���-1
	 * \endif
	 */
	
	public static native int     		AddTourCombin(long lLoginID, int nMonitorID, int nSplitType, byte pEncoderChannnel[], int nBufLen, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * delete display group
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID
	 * @param nCombinID group id
	 * @param waittime overtime 
	 * @return true:success, false:failed
	 * \else
	 * ɾ���������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID
	 * @param nCombinID ���id 
	 * @param waittime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		DelTourCombin(long lLoginID, int nMonitorID, int nCombinID, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * change image group
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID 
	 * @param nCombinID group id
	 * @param nSplitType splicing method 
	 * @param pEncoderChannel encode channel,tou image's all channels 
	 * @param nBufLen  pEncoderChannnel length 
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * �޸Ļ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID 
	 * @param nCombinID ���ID 
	 * @param nSplitType �иʽ
	 * @param pEncoderChannel ������ͨ��,��ѯ���������ͨ�� 
	 * @param nBufLen  pEncoderChannnel�ĳ���
	 * @param waittime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif	
	 */
	
	public static native boolean 		SetTourCombin(long lLoginID, int nMonitorID, int nCombinID, int nSplitType, byte pEncoderChannel[], int nBufLen, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * search window group
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID  TV ID
	 * @param nCombinID group ID
	 * @param lpDecCombinInfo  decoder window group info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�������,nCombinID��Χ0��32
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID  TV��ID
	 * @param nCombinID ���ID 
	 * @param lpDecCombinInfo  ���������������Ϣ
	 * @param waittime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		QueryTourCombin(long lLoginID, int nMonitorID, int nCombinID, DEC_COMBIN_INFO lpDecCombinInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set tour operation
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID
	 * @param lpDecTourInfo  decoder tour info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * ������Ѳ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID
	 * @param lpDecTourInfo  ��������Ѳ��Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		SetDecoderTour(long lLoginID, int nMonitorID, DEC_TOUR_COMBIN lpDecTourInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * search tour operation
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID TV ID
	 * @param lpDecTourInfo  decoder tour info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��Ѳ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID TV��ID
	 * @param lpDecTourInfo  ��������Ѳ��Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		QueryDecoderTour(long lLoginID, int nMonitorID, DEC_TOUR_COMBIN lpDecTourInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * search current decode channel info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID encoder id 
	 * @param lpChannelStateInfo decoding chaneel stream info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��ǰ����ͨ������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nDecoderID ������id 
	 * @param lpChannelStateInfo ����ͨ������Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		QueryDecChannelFlux(long lLoginID, int nDecoderID, DEV_DECCHANNEL_STATE lpChannelStateInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * decoder control tour
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nMonitorID  TV ID
	 * @param nActionParam decoder playback control type
	 * <table>
	 * <tr><td>Dec_Tour_Stop</td><td>stop</td></tr> 
	 * <tr><td>Dec_Tour_Start</td><td>stop</td></tr> 
	 * <tr><td>Dec_Tour_Pause</td><td>pause</td></tr>
	 * <tr><td>Dec_Tour_Resume</td><td>resume</td></tr>
	 * </table>
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * ������������Ѳ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nMonitorID  TV��ID
	 * @param nActionParam �������طſ�������
	 * <table>
	 * <tr><td>Dec_Tour_Stop</td><td>ֹͣ </td></tr>
	 * <tr><td>Dec_Tour_Start</td><td>��ʼ </td></tr>
	 * <tr><td>Dec_Tour_Pause</td><td>��ͣ </td></tr>
	 * <tr><td>Dec_Tour_Resume</td><td>�ָ�</td></tr>
	 * </table>
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		CtrlDecoderTour(long lLoginID, int nMonitorID, int nActionParam, int waittime );
	
	/**
	 * \if ENGLISH_LANG
	 * set playback progress recall function
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param cbPlaybackPos  playback progress recall function
	 * @return true:success, false:failed
	 * \else
	 * ���ûطŽ��Ȼص�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param cbPlaybackPos  �طŽ��Ȼص�����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		SetDecPlaybackPos(long lLoginID, CB_fDecPlayBackPosCallBack cbPlaybackPos );

	/**
	 * \if ENGLISH_LANG
	 * decoder TV playback
	 * nPlaybackMode
	 * 0 = front-end device��by file method   DEC_PLAYBACK_FILE_PARAM  
	 * 1 = front-end device��by time method  DEC_PLAYBACK_TIME_PARAM
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID TV ID
	 * @param nPlaybackMode decoder playback type 
	 * @param objPlayBack playback parameter.by file method is DEC_PLAYBACK_FILE_PARAM , playback by time is  DEC_PLAYBACK_TIME_PARAM
	 * @return true:success, false:failed
	 * \else
	 * ������TV����ط�,�ӿ�Ϊ�첽��ʽ
	 * nPlaybackMode
	 * 0 = ǰ���豸�����ļ���ʽ   DEC_PLAYBACK_FILE_PARAM  
	 * 1 = ǰ���豸����ʱ�䷽ʽ  DEC_PLAYBACK_TIME_PARAM
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nDecoderID TV��ID
	 * @param nPlaybackMode �������ط�����
	 * @param objPlayBack �طŲ���,���ļ���ʽʱΪ DEC_PLAYBACK_FILE_PARAM ,��ʱ��ط�ʱΪ DEC_PLAYBACK_TIME_PARAM
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native long 			DecTVPlayback(long lLoginID, int nDecoderID, int nPlaybackMode, Object objPlayBack);

	/**
	 * \if ENGLISH_LANG
	 * decoder TV display playback control
	 * nCtrlType\n
	 * 0 = drag\n
	 * 1 = play\n
	 * 2 = pause\n
	 * 3 = stop
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID TV ID
	 * @param nCtrlType decoder playback control type, DEC_CTRL_PLAYBACK_TYPE
	 * @param nValue control value 
	 * @param waittime overtime  
	 * @return true:success, false:failed
	 * \else
	 * ������TV����طſ���
	 * nCtrlType\n
	 * 0 = �϶�\n
	 * 1 = ����\n
	 * 2 = ��ͣ\n
	 * 3 = ֹͣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nDecoderID TV��ID
	 * @param nCtrlType �������طſ�������,��� DEC_CTRL_PLAYBACK_TYPE
	 * @param nValue ����ֵ
	 * @param waittime �ȴ�ʱ��  
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		CtrlDecPlayback(long lLoginID, int nDecoderID, int nCtrlType, int nValue, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * Stop login
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ���豸ע��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		StopLogin(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * multi-window preview,currently Dahua HB device do not support this function
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param hWnd multi-window preview,may set as 0. for non-displaying
	 * @return successful return to multi-window preview ID,failed return to 0.
	 * \else
	 * �໭��ʵʱԤ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param hWnd �໭��Ԥ������,��������Ϊ0,Ϊ����ʾ
	 * @return �ɹ����ض໭��Ԥ��ID,ʧ�ܷ���0
	 * \endif
	 * @see StopMultiPlay
	 */
	
	public static native long 			MultiPlay(long lLoginID, Object hWnd);
	
	/**
	 * \if ENGLISH_LANG
	 * stop multi-image preview
	 * @param lMultiHandle
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ�໭��ʵʱԤ��
	 * @param lMultiHandle
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see MultiPlay 
	 */
	public static native boolean 		StopMultiPlay(long lMultiHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * search recorded or not on a certain day 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelId  channel NO.
	 * @param nRecordFileType record file type 
	 * <table>
	 * <tr><td>value</td><td>record file type</td></tr>
	 * <tr><td>0</td><td>all record files </td></tr>
	 * <tr><td>1</td><td>external alarm </td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm	</td></tr>
	 * <tr><td>3</td><td>all alarms </td></tr>
	 * <tr><td>4</td><td>card No. search   </td></tr>
	 * <tr><td>5 </td><td>group condition search </td></tr>
	 * </table>
	 * @param tmStart start time
	 * @param tmEnd end time
	 * @param pchCardid card No.(search type is card NO. search, valid, otherwise fill in NULL) 
	 * @param bResult output parameter,true is yes,false is no
	 * @param waittime search overtime
	 * @return true:success, false:failed
	 * \else
	 * ��ѯʱ������Ƿ���¼���ļ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelId  ͨ����
	 * @param nRecordFileType ¼���ļ�����
	 * <table>
	 * <tr><td>��ֵ </td><td>¼���ļ�����</td></tr>  
	 * <tr><td>0</td><td>����¼���ļ�</td></tr>  
	 * <tr><td>1</td><td>�ⲿ���� </td></tr>
	 * <tr><td>2</td><td>��̬��ⱨ�� </td></tr>
	 * <tr><td>3</td><td>���б��� </td></tr>
	 * <tr><td>4</td><td> ���Ų�ѯ  </td></tr>
	 * <tr><td>5</td><td>���������ѯ </td></tr>
	 * </table>
	 * @param tmStart ��ʼʱ��
	 * @param tmEnd ����ʱ��
	 * @param pchCardid ����(��ѯ����Ϊ���Ų�ѯʱ��Ч,���������NULL) 
	 * @param bResult �������,true��ʾ��¼��,false��ʾû��¼�� 
	 * @param waittime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login 
	 */
	public static native boolean 		QueryRecordTime(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String pchCardid, BOOL_RET bResult, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * control play direction--forward play or back play
	 * @param lPlayHandle playback handle,as PlayBackByRecordFile return value 
	 * @param bBackward back play or not,when bBackward = TRUE back play,when bBackward = FALSE forward play 
	 * @return true:success, false:failed
	 * \else
	 * ���Ʋ��ŷ���--���Ż��ߵ���
	 * @param lPlayHandle �طž��,�� PlayBackByRecordFile �ķ���ֵ 
	 * @param bBackward �Ƿ񵹷�,�� bBackward = TRUE ʱ����,�� bBackward = FALSE ʱ���� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx  
	 */
	public static native boolean 		PlayBackControlDirection(long lPlayHandle, boolean bBackward);
	
	/**
	 * \if ENGLISH_LANG
	 * real time upload intellifent analysis data-image, extension interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO.
	 * @param dwAlarmType alarm type, CB_fAnalyzerDataCallBack
	 * @param bNeedPicFile subscribe image file or not,1-yes,return intelligent image info during recall function,0-no,not return intelligent image info during recall function(when image not needed, reduce network flow)
	 * @param cbAnalyzerData intelligent data analysis recall function,as RealLoadPicture 
	 * @param Reserved reserve perameter 
	 * @return subscribe alarm event info and event solution image info from device,these info are sent to users via interface parameter's recall function cbAnalyzerData. 
	 * \else
	 * ʵʱ�ϴ����ܷ������ݣ�ͼƬ(��չ�ӿ�,bNeedPicFile��ʾ�Ƿ���ͼƬ�ļ�,Reserved����Ϊ  RESERVED_PARA ) 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����
	 * @param dwAlarmType ��������,�μ� CB_fAnalyzerDataCallBack
	 * @param bNeedPicFile �Ƿ���ͼƬ�ļ�,1-����ͼƬ�ļ�,�ڻص������л᷵������ͼƬ��Ϣ,0-������ͼƬ�ļ�,�ڻص������в��᷵������ͼƬ��Ϣ(�ڲ���ҪͼƬ��Ϣʱ,�ɼ�����������) 
	 * @param cbAnalyzerData �������ݷ����ص�����
	 * @param Reserved ��������
	 * @return ʧ�ܷ���0,�ɹ�����ʵʱ���,����Ϊ��غ����Ĳ���
	 * \endif
	 * @see StopLoadPic
	 */
	public static native long 			RealLoadPictureEx(long lLoginID, int nChannelID, int dwAlarmType, boolean bNeedPicFile, CB_fAnalyzerDataCallBack cbAnalyzerData , Object Reserved);
	
	/**
	 * \if ENGLISH_LANG
	 * download offline intelligent analysis data-image
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID  channel NO.
	 * @param dwAlarmType  alarm type, {@link com.company.NetSDK.FinalVar#EVENT_IVS_ALL EVENT_IVS_ALL}
	 * @param lpStartTime  start time 
	 * @param lpEndTime  ending time 
	 * @param cbAnalyzerData  intelligent data analysis recall function,refer to RealLoadPicture 
	 * @return return to download handle
	 * \else
	 * �����������ܷ������ݣ�ͼƬ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID  ͨ����
	 * @param dwAlarmType  ��������,�����{@link com.company.NetSDK.FinalVar#EVENT_IVS_ALL EVENT_IVS_ALL}�Ⱥ궨��
	 * @param lpStartTime  ��ʼʱ�� 
	 * @param lpEndTime  ����ʱ��
	 * @param cbAnalyzerData  �������ݷ����ص�����
	 * @return �������ؾ��
	 * \endif
	 * @see StopLoadPic
	 */
	public static native long  			LoadOffLineFile(long lLoginID, int nChannelID, int dwAlarmType, NET_TIME_EX lpStartTime, NET_TIME_EX lpEndTime, CB_fAnalyzerDataCallBack cbAnalyzerData);

	/**
	 * \if ENGLISH_LANG
	 * stop uploading intelligent analysis data��image
	 * @param lAnalyzerHandle  RealLoadPicture return value  
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ�ϴ����ܷ������ݣ�ͼƬ
	 * @param lAnalyzerHandle  RealLoadPicture ����ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RealLoadPicture
	 */
	public static native boolean 		StopLoadPic(long lAnalyzerHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm reset
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param dwAlarmType Alarm Type
	 * @param nChannel Channel Id 
	 * @param pReserved Reserved
	 * @param nWaitTime Wait time
	 * @return true:success, false:failed
	 * \else
	 * ������λ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param dwAlarmType ��չ��������
	 * @param nChannel ͨ����
	 * @param pReserved ����
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartListenEx
	 */
	public static native boolean 		AlarmReset(long lLoginID, int dwAlarmType, int nChannel, Object pReserved , int nWaitTime );

	/**
	 * \if ENGLISH_LANG
	 * set extra stream recording status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pRSBuffer record status buffer, the total length is the channel number, the data definition in the buffer table as:\n
	 * 0:not record;1:manually record;2:auto record
	 * @param nRSBufferlen record status number, each channel is 1 byte 
	 * @param pReserved reserve parameter 
	 * @return true:success, false:failed
	 * \else
	 * ����ͨ��������¼��״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pRSBuffer ¼��״̬������,�ܳ���Ϊͨ������,0:��¼��;1:�ֶ�¼��;2:�Զ�¼��
	 * @param nRSBufferlen ¼��״̬����,ÿһ��ͨ��Ϊ1���ֽ�
	 * @param pReserved �������� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryExtraRecordState
	 */
	public static native boolean 		SetupExtraRecordState(long lLoginID, char pRSBuffer[], int nRSBufferlen, int pReserved);

	/**
	 * \if ENGLISH_LANG
	 * Camera focus control
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value 
	 * @param nChannelID Channel no.
	 * @param dwFocusCommand 0 as focus adjustment   1 as continuous  2 as auto, adjust focus to best position nFocus and nZoom invlaid
	 * @param dFocus Relative focus change speed its value is -1~1,0 means stop
	 * @param dZoom relative zoom speed its value is -1~1,0 means stop
	 * @param reserved Reserved
	 * @param waittime Waiting time 
	 * @return true:successful, false:failed
	 * \else
	 * ��ͷ�۽�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����
	 * @param dwFocusCommand 0Ϊ�۽�����   1Ϊ�����۽�����  2Ϊ�Զ��۽�����,���ڽ��������λ��nFocus��nZoom��Ч
	 * @param dFocus ��Ծ۽��仯���� ��ֵΪ-1~1,0��ʾֹͣ
	 * @param dZoom ��Ա䱶���� ��ֵΪ-1~1,0��ʾֹͣ
	 * @param reserved ����
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		FocusControl(long lLoginID, int nChannelID, long dwFocusCommand, double dFocus, double dZoom, int reserved , int waittime);

	
	/**
	 * \if ENGLISH_LANG
	 * turn off search handle
	 * @param lFindHandle FindFileEx return value 
	 * @return true:success, false:failed
	 * \else
	 * ����¼���ļ�����
	 * @param lFindHandle FindFileEx�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see FindFileEx
	 */
	public static native boolean		FindCloseEx(long  lFindHandle);
	/**
	 * \if ENGLISH_LANG
	 * stop downloading data
	 * @param lFileHandle  {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile} return value
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ��������
	 * @param lFileHandle  {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see DownloadMediaFile
	 */
	public static native boolean 		StopDownloadMediaFile(long  lFileHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * pause intelligent analysis data downloading
	 * @param lLoadHadle  loading handle, DownloadMediaFile
	 * @param bPause  pause downloading or not, TRUE means pause, FALSE means resume
	 * @return true:success, false:failed
	 * \else
	 * ��ͣ���ܷ�����������
	 * @param lLoadHadle  ������ , DownloadMediaFile
	 * @param bPause  �Ƿ���ͣ����, TRUE��ʾ��ͣ����, FALSE��ʾ�ָ�����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean 		PauseLoadPic(long lLoadHadle, boolean bPause);
	/**
	 * \if ENGLISH_LANG
	 * special interface,used to send web info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param szInBuffer  data sent to device 
	 * @param dwInBufferSize size of data sent to device 
	 * @param szOutBuffer size of data sent to device 
	 * @param dwOutBufferSize returned data size 
	 * @param pReserved reserve parameter 
	 * @param waittime overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * web͸���ӿ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param szInBuffer  ���͸��豸������
	 * @param dwInBufferSize ���͸��豸�����ݴ�С
	 * @param szOutBuffer �豸���ظ�web������
	 * @param dwOutBufferSize �������ݴ�С
	 * @param pReserved ��������
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		TransmitInfoForWeb(long lLoginID, byte szInBuffer[], byte szOutBuffer[], int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ control
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID  channel NO.
	 * @param dwPTZCommand support the following PTZ command 
	 * <table>
	 * <tr><td>operation type</td><td>function</td></tr>
	 * <tr><td>PTZ_UP_CONTROL</td><td>up</td></tr>
	 * <tr><td>PTZ_DOWN_CONTROL</td><td>down</td></tr>
	 * <tr><td>PTZ_LEFT_CONTROL</td><td>left</td></tr>
	 * <tr><td>PTZ_RIGHT_CONTROL</td><td>right </td></tr>
	 * <tr><td>PTZ_ZOOM_ADD_CONTROL	</td><td>zoom+ </td></tr>
	 * <tr><td>PTZ_ZOOM_DEC_CONTROL</td><td>zoom- </td></tr>
	 * <tr><td>PTZ_FOCUS_ADD_CONTROL</td><td>focus+ </td></tr>
	 * <tr><td>PTZ_FOCUS_DEC_CONTROL</td><td>focus-</td></tr> 
	 * <tr><td>PTZ_APERTURE_ADD_CONTROL </td><td>iris+</td></tr>
	 * <tr><td>PTZ_APERTURE_DEC_CONTROL</td><td>iris-</td></tr>   
	 * <tr><td>PTZ_POINT_MOVE_CONTROL</td><td>turn to preset point</td></tr>
	 * <tr><td>PTZ_POINT_SET_CONTROL</td><td>setup</td></tr>
	 * <tr><td>PTZ_POINT_DEL_CONTROL</td><td>delete </td></tr>
	 * <tr><td>PTZ_POINT_LOOP_CONTROL</td><td>point tour</td></tr>
	 * <tr><td>PTZ_LAMP_CONTROL</td><td>light wiper</td></tr>
	 * </table>
	 * @param dwStep progress/speed,range1~8,8 max effect,when operating preset point, dwStep is the value. 
	 * @param dwStop stop or not, effective to PTZ direction control, for other operations, this parameter should be filled with FALSE. 
	 * @return true:success, false:failed
	 * \else
	 * ͨ����̨����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID  ͨ����
	 * @param dwPTZCommand ��̨�������� 
	 * <table>
	 * <tr><td>��������</td><td>���� </td></tr>
	 * <tr><td>PTZ_UP_CONTROL</td><td>�� </td></tr>
	 * <tr><td>PTZ_DOWN_CONTROL</td><td>�� </td></tr>
	 * <tr><td>PTZ_LEFT_CONTROL	</td><td>�� </td></tr>
	 * <tr><td>PTZ_RIGHT_CONTROL</td><td>�� </td></tr>
	 * <tr><td>PTZ_ZOOM_ADD_CONTROL	</td><td>�䱶+</td></tr>
	 * <tr><td>PTZ_ZOOM_DEC_CONTROL</td><td>�䱶-</td></tr>
	 * <tr><td>PTZ_FOCUS_ADD_CONTROL</td><td>����+ </td></tr>
	 * <tr><td>PTZ_FOCUS_DEC_CONTROL</td><td>����-</td></tr> 
	 * <tr><td>PTZ_APERTURE_ADD_CONTROL</td><td>��Ȧ+</td></tr>
	 * <tr><td>PTZ_APERTURE_DEC_CONTROL</td><td>��Ȧ-</td></tr>
	 * <tr><td>PTZ_POINT_MOVE_CONTROL</td><td>ת��Ԥ�õ� </td></tr>
	 * <tr><td>PTZ_POINT_SET_CONTROL</td><td>���� </td></tr>
	 * <tr><td>PTZ_POINT_DEL_CONTROL</td><td>ɾ�� </td></tr>
	 * <tr><td>PTZ_POINT_LOOP_CONTROL</td><td>�����ѭ </td></tr>
	 * <tr><td>PTZ_LAMP_CONTROL</td><td>�ƹ���ˢ </td></tr>
	 * </table>
	 * @param dwStep ����/�ٶ�,��Χ1~8,8����Ч��������,����Ԥ�õ�ʱdwStepΪԤ�õ�ֵ
	 * @param dwStop �Ƿ�ֹͣ,TRUE,��ʾֹͣ����̨�˷����������ͷ����������Ч,������������ʱ,������Ӧ���FALSE
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	public static native boolean 		PTZControl(long lLoginID, int nChannelID, int dwPTZCommand, int dwStep, boolean dwStop);
	
	/**
	 * \if ENGLISH_LANG
	 * extended PTZ control, enhance PTZ control over function; refer to interface file for detailed command definition and parameter effectiveness
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO. 
	 * @param dwPTZCommand  PTZ Dome control command,compatible with PTZControlinterface.param2 is equivalent to parameter dwStep,meanwhile extended to support the following functions  
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>function</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>upper left p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>upper right p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>lower left p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>lower right p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>add preset point to tour p1 tour path p2 preset point value</td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>delete preset point in tour p1 tour path p2 preset point value</td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>delete tour p1 tour path</td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>start horizontal rotation </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>stop horizontal rotation</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>set left border</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETRIGHTBORDER</td><td>set right border</td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>start to scan</td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>stop scanning</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>set mode start mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>set mode end mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>operation mode p1 mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>stop mode p1 mode path </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>delete mode p1 mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>turn command</td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>quick positioning,p1horizontal coordinate,p2vertical coordinate,p3zoom</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN
	 * </td><td>
	 * <pre>
	 * auxiliary switch on,p1 auxiliary point
	 * auxiliary point 23, backlight compensation
	 * auxiliary point 24, digital zoom enabled
	 * auxiliary point 27, night mode enable
	 * auxiliary point 41, camera luminance gain
	 * auxiliary point 43, preset point warning enabled
	 * </pre>
	 * </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE			
	 * </td><td>
	 * <pre>auxiliary point switch off ,p1auxiliary point
	 * auxiliary point 23, backlight compensation off
	 * auxiliary point 24, digital zoom off
	 * auxiliary point 27, night mode off
	 * auxiliary point 41, camera luminance reduction 
	 * auxiliary point 43, preset point warning off
	 * </pre>
	 * </td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>open PTZ dome camera menu </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>menu off</td></tr> 
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>menu confirm</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>menu cancel </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>menu up</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>menu down</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>menu left</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>menu right</td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>alarm linkage PTZ</td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>matrix switch</td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>light controllor</td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO	</td><td>3D positioning</td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO	</td><td>3D positioning reset</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>up + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>down + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>left + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>right + TELE </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>leftup + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>leftdown + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>rightup + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>rightdown + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>up + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>down + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>left + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>right + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>leftup + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>leftdown + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>rightup + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>rightdown + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>max command value</td></tr>
	 * </table>
	 * PTZ command dwPTZCommand and parameter(param1,param2,param3) relationship list
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>function description</td><td>param1</td><td>param2</td><td>param3 </td></tr>
	 * <tr><td>SDK_PTZ_UP_CONTROL</td><td>up</td><td> </td><td>vertical speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_DOWN_CONTROL</td><td>down</td><td> </td><td>vertical speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_LEFT_CONTROL</td><td>left</td><td> </td><td>horizontal speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_RIGHT_CONTROL</td><td>right</td><td> </td><td>horizontal speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_ZOOM_ADD_CONTROL</td><td>zoom+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_ZOOM_DEC_CONTROL</td><td>zoom-</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_FOCUS_ADD_CONTROL</td><td>focusing+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_FOCUS_DEC_CONTROL</td><td>focusing-</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_APERTURE_ADD_CONTROL</td><td>iris+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_MOVE_CONTROL</td><td>to preset point</td><td> </td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_SET_CONTROL</td><td>set</td><td> </td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_DEL_CONTROL</td><td>delete	</td><td> </td><td>	preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_LOOP_CONTROL</td><td>tour among points</td><td> </td><td> </td><td>76:start,99:auto,96:stop</td></tr>
	 * <tr><td>SDK_PTZ_LAMP_CONTROL</td><td>light wiper</td><td>0x01on,x00off</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>leftup</td><td>vertical speed(1��8)	</td><td>horizontal speed(1��8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>	rightup</td><td>vertical speed(1��8)</td><td>horizontal speed(1��8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>leftdown</td><td>vertical speed(1��8)</td><td>horizontal speed(1��8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>rightdown</td><td>vertical speed(1��8)</td><td>horizontal speed(1��8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>add preset point into tour</td><td>tour path</td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>delete preset point in tour</td><td>tour path</td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>delete tour</td><td>tour path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>start horizontal rotation</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>stop horizontal rotation</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>selt left border</td><td> </td><td> </td><td> </td></tr>	
	 * <tr><td>SDK_EXTPTZ_RIGHTBORDER</td><td>set right border</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>start scanning</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>stop scanning </td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>setting mode start</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>setting mode end</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>operation mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>stop mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>delete mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>turn command</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>quick positioning</td><td>horizontal coordinate</td><td>vertical coordinate</td><td>zoom</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>auxiliary switch on</td><td>auxiliary point</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>auxiliary switch off</td><td>auxiliary point</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>open PTZ dome camera menu</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>turn off menu</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>menu confirm</td><td> </td><td> /td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>menu cancel</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>menu up</td><td> </td><td></td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>menu down</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>menu left</td><td> </td><td>	</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>menuright</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>alarm linkage PTZ</td><td>alarn input channel</td><td>alarm linkage type1-preset point2-scan3-tour</td><td>linkage value,such as preset point number</td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>matrix switch</td><td>monitor number(video output number)</td><td>video input number	</td><td>matrix number</td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>light controllor</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>3D positioning</td><td>horizontal angle(0~3600)</td><td>vertical coordinate(0~900)</td><td>zoom(1~128)</td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>3D positioning reset</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>up + TELE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>down + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>left + TELE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>right + TELE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>leftup + TELE	</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>leftdown + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>rightup + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>rightdown + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>up + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>down + WIDE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>left + WIDE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>right + WIDE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>leftup + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>leftdown + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>rightup + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>rightdown + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>max command value</td><td> </td><td> </td><td> </td></tr>
	 * </table>	
	 * @param param1 parameter1 details refer to above chart 
	 * @param param2 parameter2
	 * @param param3 parameter3
	 * @param dwStop  stop or not, effective to PTZ eight-directions operation and lens operation. During other operation, this parameter should fill in FALSE 
	 * @return successful return to TRUE,failed return to FALSE
	 * \else
	 * ����̨����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����
	 * @param dwPTZCommand  �����������,���  SDK_EXTPTZ_ControlType SDK_PTZ_ControlType SDK_EXTPTZ_ControlType ���� PTZControl �ӿ�,param2�൱�ڲ���dwStep,ͬʱ��չ֧�����¹��� 
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>����</td></tr> 
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>���� p1ˮƽ�ٶ�, p2��ֱ�ٶ� </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>���� p1ˮƽ�ٶ�, p2��ֱ�ٶ� </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>����p1ˮƽ�ٶ�, p2��ֱ�ٶ� </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>����p1ˮƽ�ٶ�, p2��ֱ�ٶ� </td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>����Ԥ�õ㵽Ѳ�� p1Ѳ����· p2Ԥ�õ�ֵ </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>ɾ��Ѳ����Ԥ�õ� p1Ѳ����· p2Ԥ�õ�ֵ </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>���Ѳ�� p1Ѳ����·</td></tr> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>��ʼˮƽ��ת </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>ֹͣˮƽ��ת </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>������߽� </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETRIGHTBORDER</td><td>�����ұ߽� </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>��ʼ��ɨ </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>ֹͣ��ɨ </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>����ģʽ��ʼ ģʽ��· </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>����ģʽ���� ģʽ��· </td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>����ģʽ p1ģʽ��· </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>ֹͣģʽ p1ģʽ��·  </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>���ģʽ p1ģʽ��· </td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>��ת���� </td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>���ٶ�λ,p1ˮƽ����,p2��ֱ����,p3�䱶 </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>�������ؿ�,p1������;������ 23, �����ⲹ��;������ 24, �����ֱ䱶��;������ 27, ��ҹ�ӹ���;������ 41, �����������;������ 43, ��Ԥ������ʾ</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>�������ع� ,p1������;������ 23, �ر��ⲹ��;������ 24, �����ֱ䱶��;������ 27, ��ҹ�ӹ���;������ 41, ��������ȼ�;������ 43, ��Ԥ�ñ�����ʾ</td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>������˵� </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>�رղ˵� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>�˵�ȷ�� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>�˵�ȡ�� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>�˵��� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>�˵��� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>�˵��� </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>�˵��� </td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>����������̨ </td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>�����л� </td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>�ƹ������ </td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>��ά��ȷ��λ </td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>��ά��λ������λ </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>�� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>�� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>�� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>�� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>���� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>���� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>���� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>���� + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>�� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>�� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>�� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>�� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>���� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>���� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>���� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>���� + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>�������ֵ </td></tr>
	 * </table>
	 * <table>
	 * ��̨����dwPTZCommand�Ͳ���(param1,param2,param3)֮��Ĺ�ϵ��
	 * <tr><td>dwPTZCommand						��������				param1							param2								param3 </td></tr>
	 * <tr><td>SDK_PTZ_UP_CONTROL</td><td>��</td><td> </td><td>��ֱ�ٶ�(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_DOWN_CONTROL</td><td>�� </td><td> </td><td>��ֱ�ٶ�(1-8)</td><td> </td><td>
	 * <tr><td>SDK_PTZ_LEFT_CONTROL</td><td>��</td><td> </td><td> ˮƽ�ٶ�(1-8) </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_RIGHT_CONTROL</td><td>��	</td><td> </td><td>ˮƽ�ٶ�(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_ZOOM_ADD_CONTROL</td><td>�䱶+	</td><td> </td><td>���� </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_ZOOM_DEC_CONTROL</td><td>�䱶-	</td><td> </td><td>����  </td><td> </td><td>
	 * <tr><td>SDK_PTZ_FOCUS_ADD_CONTROL</td><td>����+</td><td> </td><td>����</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_FOCUS_DEC_CONTROL</td><td>����-</td><td> </td><td>����</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_APERTURE_ADD_CONTROL</td><td>��Ȧ+</td><td> </td><td>���� </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_MOVE_CONTROL</td><td>ת��Ԥ�õ�</td><td> </td><td>Ԥ�õ�ֵ</td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_SET_CONTROL</td><td>����	</td><td> </td><td>Ԥ�õ�ֵ</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_DEL_CONTROL</td><td>ɾ��	</td><td> </td><td>Ԥ�õ�ֵ</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_LOOP_CONTROL</td><td>�����ѭ</td><td> </td><td> </td><td>76:��ʼ,99:�Զ�,96:ֹͣ</td><td> 
	 * <tr><td>SDK_PTZ_LAMP_CONTROL	</td><td>�ƹ���ˢ</td><td>0x01����,x00�ر�</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>����</td><td>��ֱ�ٶ�(1��8)	</td><td>ˮƽ�ٶ�(1��8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>����</td><td>��ֱ�ٶ�(1��8)</td><td>ˮƽ�ٶ�(1��8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>���� </td><td>��ֱ�ٶ�(1��8)</td><td>ˮƽ�ٶ�(1��8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>����</td><td>��ֱ�ٶ�(1��8)</td><td>ˮƽ�ٶ�(1��8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>����Ԥ�õ㵽Ѳ��</td><td>Ѳ����· </td><td>Ԥ�õ�ֵ </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>ɾ��Ѳ����Ԥ�õ�</td><td> Ѳ����·	</td><td>Ԥ�õ�ֵ</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP	</td><td>���Ѳ��</td><td> Ѳ����·  </td><td> </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>��ʼˮƽ��ת </td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>ֹͣˮƽ��ת</td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>������߽�  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTBORDER</td><td>�����ұ߽� </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN	</td><td>��ʼ��ɨ  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN	</td><td>ֹͣ��ɨ</td><td> </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>����ģʽ��ʼ</td><td>ģʽ��·   </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>����ģʽ����</td><td>ģʽ��·</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>����ģʽ	</td><td>ģʽ��· </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>ֹͣģʽ</td><td>ģʽ��· </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>���ģʽ</td><td>ģʽ��·</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>��ת���� </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>���ٶ�λ</td><td>ˮƽ����</td><td>��ֱ���� </td><td>�䱶 
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>�������ؿ�</td><td> ������</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>�������ع�</td><td>������</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>������˵�</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>�رղ˵�</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>�˵�ȷ��</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>�˵�ȡ��</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>�˵���  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>�˵��� </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>�˵��� </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>�˵���</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>����������̨ </td><td>��������ͨ�� </td><td>������������1-Ԥ�õ�2-��ɨ3-Ѳ��</td><td>����ֵ,��Ԥ�õ�� 
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>�����л�</td><td>��������(��Ƶ�����)</td><td>��Ƶ�����</td><td>����� 
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>�ƹ������</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>��ά��ȷ��λ</td><td>ˮƽ�Ƕ�(0~3600)</td><td>��ֱ����(0~900)</td><td>�䱶(1~128) 
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>��ά��λ������λ  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>�� + TELE</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>�� + TELE</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>�� + TELE	</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>�� + TELE</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>���� + TELE</td><td>�ٶ�(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>���� + TELE</td><td> �ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>���� + TELE	</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>���� + TELE</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>�� + WIDE</td><td> �ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>�� + WIDE</td><td> �ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>�� + WIDE</td><td>�ٶ�(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>�� + WIDE</td><td>�ٶ�(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>���� + WIDE</td><td>�ٶ�(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>���� + WIDE</td><td> �ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>���� + WIDE</td><td>�ٶ�(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>���� + WIDE</td><td>�ٶ�(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>�������ֵ </td><td> </td><td> </td><td> </td><td>   
	 * </table>
	 * @param param1 ����1
	 * @param param2 ����2
	 * @param param3 ����3
	 * @param dwStop  �Ƿ�ֹͣ,����̨�˷����������ͷ����������Ч,������������ʱ,������Ӧ���FALSE 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see PTZControl
	 */
	public static native boolean 		SDKPTZControl(long lLoginID, int nChannelID, int dwPTZCommand, byte param1, byte param2, byte param3, boolean dwStop);
	
	public static native boolean 		SDKPTZControlEx(long lLoginID, int nChannelID, int dwPTZCommand, int lParam1, int lParam2, int lParam3, boolean dwStop);

	/**
	 * \if ENGLISH_LANG
	 * open video search handle
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO.,start from 0 
	 * @param nRecordFileType  video file type, as follows: 
	 * <table>
	 * <tr><td>value</td><td>represent video file type</td></tr>
	 * <tr><td>0</td><td>all video files </td></tr>
	 * <tr><td>1</td><td>external alarm </td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm </td></tr>
	 * <tr><td>3</td><td>all alarm</td></tr>
	 * <tr><td>4</td><td>card NO. search</td></tr>
	 * <tr><td>5</td><td>group condition search </td></tr>
	 * <tr><td>6</td><td>video location and offset length</td></tr>
	 * <tr><td>8</td><td>search image by card NO.(currently only HB-U and NVS special model device support)</td></tr>
	 * <tr><td>9</td><td>search image(currently only HB-U and NVS special model device support) </td></tr>
	 * <tr><td>10</td><td>search by text</td></tr>
	 * <tr><td>15</td><td>return to network data structure(Jinqiao internet cafe)</td></tr>
	 * <tr><td>16</td><td>search all transparent serial data video file</td></tr>
	 * </table>
	 * @param cardid card NO.,only offective in card NO. search,otherwise fill in NULL 
	 * @param time_start search video start time 
	 * @param time_end search video ending time 
	 * @param bTime search by time or not(currently ineffective,fill in false)
	 * @param waittime search overtime duration 
	 * @return successful return to search handle, failed return to 0.
	 * \else
	 * ��ʼ����¼���ļ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����,��0��ʼ
	 * @param nRecordFileType  ¼���ļ�����
	 * <table>
	 * <tr><td>ֵ</td><td>����¼���ļ����� </td></tr>
	 * <tr><td><tr><td>0</td><td>����¼���ļ� </td></tr>
	 * <tr><td>1</td><td>�ⲿ����  </td></tr>
	 * <tr><td>2</td><td>��̬��ⱨ�� </td></tr>
	 * <tr><td>3</td><td>���б��� </td></tr>
	 * <tr><td>4</td><td>���Ų�ѯ </td></tr>
	 * <tr><td>5</td><td>���������ѯ </td></tr>
	 * <tr><td>6</td><td>¼��λ����ƫ�������� </td></tr>
	 * <tr><td>8</td><td>�����Ų�ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��) </td></tr>
	 * <tr><td>9</td><td>��ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��)  </td></tr>
	 * <tr><td>10</td><td>���ֶβ�ѯ </td></tr>
	 * <tr><td>15</td><td>�����������ݽṹ(��������)</td></tr> 
	 * <tr><td>16</td><td>��ѯ����͸��������¼���ļ� </td></tr>
	 * </table>
	 * @param cardid ����,ֻ��Կ��Ų�ѯ��Ч,�����������NULL 
	 * @param time_start ��ѯ¼��ʼʱ��
	 * @param time_end ��ѯ¼�����ʱ��
	 * @param bTime �Ƿ�ʱ���ѯ(Ŀǰ��Ч,��false)
	 * @param waittime �ȴ�ʱ�� 
	 * @return �ɹ����ز�ѯ���,ʧ�ܷ���0
	 * \endif
	 * @see Login FindNextFile FindClose
	 */

	public static native long          FindFile(long lLoginID, int nChannelID, int nRecordFileType, String cardid, NET_TIME time_start, NET_TIME time_end, boolean bTime, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search next video file record
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFile() FindFile}return value 
	 * @param lpFindData video file record buffering, for exporting searched video file records 
	 * @return 1��successfully teke back one video record,0:video record exporting completes,-1:wrong parameter. 
	 * \else
	 * ����¼���ļ�
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFile() FindFile}�ķ���ֵ 
	 * @param lpFindData ¼���ļ���¼����,���������ѯ����¼���ļ���¼
	 * @return 1���ɹ�ȡ��һ��¼���¼,0��¼���¼��ȡ��,-1����������
	 * \endif
	 * @see FindFile
	 */
	public static native int           FindNextFile(long lFindHandle, NET_RECORDFILE_INFO lpFindData);
	
	/**
	 * \if ENGLISH_LANG
	 * turn off video search handle
	 * @param lFindHandle FindFile return value 
	 * @return successful return to TRUE,failed return to FALSE. 
	 * \else
	 * ����¼���ļ�����
	 * @param lFindHandle FindFile�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see FindFile
	 */
	
	public static native boolean       FindClose(long lFindHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * change play location, as drag to play
	 * @param lPlayHandle  playback handle,as PlayBackByRecordFilereturn value 
	 * @param offsettime relative start shift time, unit second, its value is 0xffffffffʱ,invlia.
	 * @param offsetbyte relative start shift size, unit k, its value is 0xffffffffʱ,invlia.when offsettime valid,parameter invalid. offsetbyte=progress ratio*progress recall total file size 
	 * @return true:success, false:failed
	 * \else
	 * ��λ¼��ط���ʼ��
	 * @param lPlayHandle  �طž��,��PlayBackByRecordFile�ķ���ֵ 
	 * @param offsettime ��Կ�ʼ��ƫ��ʱ��,��λΪ��,����ֵΪ0xffffffffʱ,�ò�����Ч
	 * @param offsetbyte ����ļ���ʼ��ƫ�ƴ�С,��λΪK,����ֵΪ0xffffffffʱ,�ò�����Ч����offsettime��Ч��ʱ��,�˲���������offsetbyte=����������*���Ȼص������ļ���С
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx StopPlayBack
	 */
	public static native boolean       SeekPlayBack(long lPlayHandle, int offsettime, int offsetbyte);
	
	/**
	 * \if ENGLISH_LANG
	 * network playback pause and resume playing.
	 * @param lPlayHandle playback handle,as PlayBackByRecordFile return value 
	 * @param bPause network playback pause and resume playing parameter 1:pause,0:resume 
	 * @return true:success, false:failed
	 * \else
	 * ��ͣ��ָ�¼��ط�
	 * @param lPlayHandle �طž��,��PlayBackByRecordFile�ķ���ֵ 
	 * @param bPause ����ط���ͣ��ָ����Ų��� 1:��ͣ,0:�ָ� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx SeekPlayBack StopPlayBack
	 */
	
	public static native boolean       PausePlayBack(long lPlayHandle, boolean bPause);
	
	/**
	 * \if ENGLISH_LANG
	 * fast play,increase current frame one time, but not unlimited. Current max is 200 frame, if higher than, return to FALSE, No playback allowed with audio, slowplay is ok. This limit is enabled only when function parameter hWnd is effective when open image, otherwise not applicable, but need device to support playback speed control
	 * @param lPlayHandle playback handle,such as PlayBackByRecordFilereturn value 
	 * @return true:success, false:failed
	 * \else
	 * ���¼��ط�
	 * @param lPlayHandle �طž��,��PlayBackByRecordFile�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SlowPlayBack PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	public static native boolean       FastPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Slow play, will reduce the current frame rate one time, the slowest one frame per second, less than 1 FALSE is returned, in open image function parameter hWnd 0, equipment to support the playback speed control case, this function will take effect
	 * @param lPlayHandle playback handle,as PlayBackByRecordFile return value 
	 * @return true:success, false:failed
	 * \else
	 * ����¼��ط� 
	 * @param lPlayHandle �طž��,��PlayBackByRecordFile�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SlowPlayBack PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	public static native boolean       SlowPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * resume to normal speed
	 * @param lPlayHandle playback handle 
	 * @return true:success, false:failed
	 * \else
	 * �ָ������ط��ٶ� 
	 * @param lPlayHandle �طž��,��PlayBackByRecordFile�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SlowPlayBack PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	public static native boolean       NormalPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * subscribe device info,received info recall from CLIENT_SetDVRMessCallBack's set value
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * ��ʼ��������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetDVRMessCallBack StopListen 
	 */
	public static native boolean       StartListen(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * subscribe device info,received info call from CLIENT_SetDVRMessCallBack's set value
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * ���豸���ı���
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetDVRMessCallBack StopListen
	 */
	public static native boolean       StartListenEx(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * stop monitoring a certain device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ��ĳ���豸������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartListen StartListenEx
	 */
	public static native boolean       StopListen(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * start a port to monitor, be ready to connect devices 
	 * @param ip simulate to start service ip,if there is another network card, fill in 0,means monitoring the device IP 
	 * @param port  simulate to start service port NO. 
	 * @param timeOut  this parameter is invlid, can be random value 
	 * @param cbListen service recall, if there is device connect normally and initiate registration, inform users via the recall 
	 * @return not 0 means successful,0 means failed,may call CLIENT_GetLastError to receive detailed reason for the mistake. 
	 * \else
	 * ��������
	 * @param ip �����������ip,���ֻ��һ������,����0,��ʾ�Ա���ip��������
	 * @param port  ����������Ķ˿ں�
	 * @param timeOut  �˲�������Ч,Ϊ����ֵ
	 * @param cbListen ����ص�,�����豸�������Ӳ�����ע��,��ͨ���ûص�֪ͨ�û�
	 * @return ��0�ɹ�,0ʧ��,��ȡ�������ԭ��ɵ���GetLastError
	 * \endif
	 * @see GetLastError
	 */
	public static native long          ListenServer(String ip, short port, int timeOut, CB_fServiceCallBack cbListen);
	
	/**
	 * \if ENGLISH_LANG
	 * stop service
	 * @param lServerHandle  ListenServer return value
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ����
	 * @param lServerHandle  ListenServer�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see ListenServer
	 */
	public static native boolean       StopListenServer(long lServerHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm upload function, start monitoring service, currently only achieved alarm monitoring function
	 * @param port  start monitoring port 
	 * @param ip bingding IP,if it is NULL, bing all legal IP in device
	 * @param timeOut server maintenance connection overtime 
	 * @param pfscb server info recall interface 
	 * @return successful return to server handle,failed return to 0. 
	 * \else
	 * �����ϴ�����,��������
	 * @param port  ���������Ķ˿�
	 * @param ip �󶨵�IP,ΪNULLʱ�󶨱������кϷ�IP 
	 * @param timeOut ������ά�����ӵĳ�ʱʱ��
	 * @param pfscb ����������Ϣ�ص��ӿ� 
	 * @return �ɹ����ط��������,ʧ�ܷ���0
	 * \endif
	 * @see StopService 
	 */
	
	public static native long          StartService(short port, String ip, int timeOut, CB_fServiceCallBack pfscb);
	
	/**
	 * \if ENGLISH_LANG
	 * stop port minitoring service
	 * @param lHandle  turn off server handle, {@link com.company.NetSDK.INetSDK#StartService() StartService} return value
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ���� 
	 * @param lHandle  Ҫ�رյķ������ľ��,{@link com.company.NetSDK.INetSDK#StartService() StartService}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartService
	 */
	public static native boolean       StopService(long lHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Set work pattern about talk mode��playback��power and so on
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType  enumeration value,as EM_USEDEV_MODE
	 * @param pValue when type is SDK_TALK_ENCODE_TYPE,this value is structure SDKDEV_TALKDECODE_INFOdata \n
	 * when type is SDK_TALK_SPEAK_PARAM,this value is structure NET_SPEAK_PARAMdata \n
	 * when type is SDK_TALK_SPEAK_PARAM,this value is structure NET_SPEAK_PARAMdata \n
	 * when type is SDK_TALK_MODE3,this value is structure NET_TALK_EXdata \n
	 * @return true:success, false:failed
	 * \else
	 * ���������Խ�ģʽ,�ͻ��˷�ʽ���Ƿ�������ʽ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType  ö��ֵ,��� EM_USEDEV_MODE
	 * @param pValue ������Ϊ SDK_TALK_ENCODE_TYPE ʱ,��ֵΪ�ṹ�� SDKDEV_TALKDECODE_INFO ���� \n
	 * ������Ϊ SDK_TALK_SPEAK_PARAM ʱ,��ֵΪ�ṹ�� NET_SPEAK_PARAM ���� \n
	 * ������Ϊ SDK_RECORD_TYPE ʱ,��ֵΪ�ṹ�� NET_RECORD_TYPE ����\n
	 * ������ SDK_TALK_MODE3 ʱ,��ֵΪ�ṹ�� NET_TALK_EX ����\n
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryDevState
	 */
	public static native boolean       SetDeviceMode(long lLoginID, int emType, Object pValue);
	
	/**
	 * \if ENGLISH_LANG
	 * require bidirectional talk from device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pfcb user customized data recall interface
	 * @return successful return to device bidiractional talk handle,failed return to 0
	 * \else
	 * �������Խ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pfcb �û��Զ�������ݻص��ӿ�
	 * @return �ɹ����غ��豸�Խ��ľ��,ʧ�ܷ���0
	 * \endif
	 */
	public static native long          StartTalkEx(long lLoginID, CB_pfAudioDataCallBack pfcb);
	
	/**
	 * \if ENGLISH_LANG
	 * send user's audio data to device,here info can be data called from CLIENT_StartTalkEx's recall interface
	 * @param lTalkHandle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx} return value
	 * @param pSendBuf audio data to be sent 
	 * @return successful return to data length sent actually to device, failed return to -1
	 * \else
	 * �����������ݵ��豸
	 * @param lTalkHandle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}�ķ���ֵ 
	 * @param pSendBuf Ҫ���͵���Ƶ����
	 * @return �ɹ�ʱ����ʵ�ʴ�����豸�����ݳ���,ʧ�ܷ���-1
	 * \endif
	 */
	public static native int           TalkSendData(long lTalkHandle, byte pSendBuf[]);
	
	/**
	 * \if ENGLISH_LANG
	 * stop bidirectional talk
	 * @param lTalkHandle  bidirectional talk handle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx} return value
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ�����Խ�
	 * @param lTalkHandle  �����Խ����,{@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartTalkEx
	 */
	public static native boolean       StopTalkEx(long lTalkHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * search log,synchronization method,search our log record once
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pLogBuffer log buffering area,structure SDK_LOG_QUERY_TYPE 
	 * @param nLogBufferlen returned log length(unit byte) 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸��־
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pLogBuffer ��־������,�ṹ��( SDK_LOG_ITEM ) 
	 * @param nLogBufferlen ���ص���־����(��λ�ֽ�)
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ�� 
	 * \endif
	 */
	
	public static native boolean       QueryLog(long lLoginID, SDK_LOG_ITEM pLogBuffer[], Integer nLogBufferlen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search log extension interface,independent search by type
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param logType log buffering area,structure SDK_LOG_QUERY_TYPE
	 * @param pLogBuffer  log buffering area,if reserved is vacant,structure SDK_LOG_ITEM. reserved not vacant,return SDK_NEWLOG_ITEM 
	 * @param nLogBufferlen returned log length(unit byte) 
	 * @param reserved when DWORD dwType = 1, reserved = &dwType,use XML format to search log.(currently only device model in LB-U support) 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸��־, ��չ�ӿ�,��ѡ����־����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param logType ��־����,��ö�� SDK_LOG_QUERY_TYPE
	 * @param pLogBuffer  ��־������,��� reserved Ϊ��,�ṹ�� SDK_LOG_ITEM ,reserved ��Ϊ��,���� SDK_NEWLOG_ITEM 
	 * @param nLogBufferlen ���ص���־����(��λ�ֽ�) 
	 * @param reserved ��DWORD dwType = 1, reserved = &dwTypeʱ,��XML��ʽ��ѯ��־��Ϣ(Ŀǰ��LB-U�е��豸�ͺ�֧��) 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryLogCallback
	 */
	public static native boolean       QueryLogEx(long lLoginID, int logType, SDK_LOG_ITEM pLogBuffer[], Integer nLogBufferlen, Integer reserved, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search record status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pRSBuffer record status buffering area,total length no fewer than total channel number,return value meaning as follows. 
	 * @param nRSBufferlen return record status info length. each channel is 1 byte
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ���ͨ��¼��״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pRSBuffer ¼��״̬������,�ܳ��Ȳ���С��ͨ����, 0����¼��1���ֶ�¼��2���Զ�¼��
	 * @param nRSBufferlen ����¼��״̬��Ϣ����,ÿһ��ͨ��Ϊ1���ֽ�
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetupRecordState
	 */
	public static native boolean       QueryRecordState(long lLoginID, byte pRSBuffer[], Integer nRSBufferlen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * receive flow statistics, get flow between previous calls of this statistics flow. Each call set historical flow to 0
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lPlayHandle paly ID,may be real time playing IDID,preview ID or network playback ID,when it is 0, recieve total flow of device 
	 * @return successful return to flow value,failed return to -1. 
	 * \else
	 * ��ȡͨ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param lPlayHandle  ����ID,������ʵʱ����ID,Ԥ��ID����������ط�ID,��Ϊ0ʱ�õ��豸�������� 
	 * @return �ɹ���������ֵ,ʧ�ܷ���-1
	 * \endif
	 * @see Login
	 */
	public static native int           GetStatiscFlux(long lLoginID, long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * reboot front end device
	 * @return true:success, false:failed
	 * \else
	 * �����豸
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       RebootDev(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * turn off front end device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * �ر��豸
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	public static native boolean       ShutDownDev(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * remotely control device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param type control type
	 * control parameter, depending on type:
	 * <table>
	 * <tr><td>type</td><td>description</td><td>structure </td></tr>      
	 * <tr><td>SDK_CTRL_REBOOT</td><td>reboot device</td><td>n/a</td></tr>
	 * <tr><td>SDK_CTRL_SHUTDOWN</td><td>device off</td><td>n/a</td></tr>
	 * <tr><td>SDK_CTRL_DISK</td><td>hard disk management</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_KEYBOARD_POWER<-->SDK_KEYBOARD_JMPUP</td><td>network keyboard</td><td>n/a</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_IN</td><td>trigger alarm input</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_OUT</td><td>trigger alarm output</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_MATRIX</td><td>matrix control</td><td>MATRIXCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SDCARD</td><td>SD card control(IPC product)parameter same with hard disk control</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_BURNING_START</td><td>writer control,start to write</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_STOP</td><td>writer control,end writing</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_ADDPWD</td><td>writer control, stack code (character string ending in'\0',max length is 8 digits)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDHEAD</td><td>writer control,stack opening(character string ending in'\0',max length is 1023 bytes, support text wrap with'\n')</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDSIGN</td><td>writer control,stack dot to writing info</td><td>n/a  </td></tr>
	 * <tr><td>SDK_BURNING_ADDCURSTOMINFO</td><td>writer control,customized stack(character string ending in'\0',max length is 1023 bytes, support text wrap with'\n')s</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ATTACH</td><td>writer control,attachment writing</td><td>BURNING_PARM_ATTACH</td></tr>
	 * <tr><td>SDK_BURNING_PAUSE</td><td>writing pause</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_CONTINUE</td><td>writing continue</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_POSTPONE</td><td>writing postpone</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_CTRL_OEMCTRL</td><td>stop control</td><td>BOOL*</td></tr>
	 * <tr><td>SDK_CTRL_RESTOREDEFAULT</td><td>restore default settings</td><td>DWORD*</td></tr>
	 * <tr><td>SDK_CTRL_CAPTURE_START</td><td>trigger snapshot</td><td>NET_SNAP_COMMANDINFO</td></tr>
	 * <tr><td>SDK_CTRL_CLEARLOG</td><td>delete log</td><td>SDK_LOG_QUERY_TYPE</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_WIRELESS</td><td>trigger wireless alarm(IPC product)</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_MARK_IMPORTANT_RECORD</td><td>mark important video file</td><td>NET_RECORDFILE_INFO</td></tr>
	 * <tr><td>SDK_CTRL_DISK_SUBAREA</td><td>network hard disk segmentation</td><td>DISKCTRL_SUBAREA</td></tr>
	 * <tr><td>SDK_BACKUP_START</td><td>device backup start</td><td>BACKUP_RECORD</td></tr>
	 * <tr><td>SDK_BACKUP_STOP</td><td> device backup stop</td><td>char*</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_ADD</td><td>mobile manually add WIFI config</td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_DEC</td><td>mobile manually delete WIFI config</td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_BUZZER_START</td><td>buzzer control start</td><td>n/a</td></tr>
	 * <tr><td>SDK_BUZZER_STOP</td><td> buzzer control end</td><td>n/a</td></tr>
	 * <tr><td>SDK_REJECT_USER</td><td>reject user</td><td>SDKDEV_REJECT_USER</td></tr>
	 * <tr><td>SDK_SHIELD_USER</td><td>block user</td><td>SDKDEV_SHIELD_USER</td></tr>
	 * <tr><td>SDK_RAINBRUSH</td><td>intelligent traffic, windshield wiper control</td><td>n/a</td></tr>
	 * <tr><td>SDK_MANUAL_SNAP</td><td>intelligent traffic, manual snapshot</td><td>MANUAL_SNAP_PARAMETER</td></tr>
	 * <tr><td>SDK_MANUAL_NTP_TIMEADJUST</td><td>manual NTP calibration</td><td>n/a   </td></tr>   
	 * <tr><td>SDK_NAVIGATION_SMS</td><td>navigation info and sms</td><td>SDKDEV_NAVIGATION_SMSS</td></tr>
	 * <tr><td>SDK_CTRL_ROUTE_CROSSING</td><td>path info</td><td>ROUTE_CROSSING_INFO</td></tr>
	 * <tr><td>SDK_BACKUP_FORMAT</td><td>format backup device, backup device name character string</td><td>char*</td></tr>
	 * <tr><td>SDK_DEVICE_LOCALPREVIEW_SLIPT</td><td>control device port local preview splicing</td><td>DEVICE_LOCALPREVIEW_SLIPT_PARAMETER</td></tr>
	 * <tr><td>SDK_CTRL_INIT_RAID</td><td>RAID initialization,Raid name character string</td><td>char*</td></tr>
	 * <tr><td>SDK_CTRL_RAID RAID</td><td>RAID operation</td><td>CTRL_RAID_INFO</td></tr>
	 * <tr><td>SDK_CTRL_SAPREDISK</td><td>hot backup operation</td><td>CTRL_SPARE_DISK_INFO_A</td></tr>
	 * <tr><td>SDK_WIFI_CONNECT</td><td>manually initiate WIFI connection</td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_WIFI_DISCONNECT</td><td> manually disconnect WIFI connection</td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>access control-open/td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_INSERT</td><td>add records, get record set number</td><td>NET_CTRL_RECORDSET_INSERT_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_UPDATE</td><td>update recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_REMOVE</td><td>remove recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_CLEAR</td><td>clear all recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_CLOSE</td><td>access control-close</td><td>NET_CTRL_ACCESS_CLOSE</td></tr>
	 * <tr><td>SDK_CTRL_STOP_ALARMBELL</td><td>manual stop alarmbell</td><td>NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>manual start alarmbell </td><td>NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>start to play audio's file </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_STOP_PLAYAUDIO</td><td>stop to play audio's file</td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>access control-forced to open</td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_CLEAR_ALARM</td><td>confirm alarm, and close</td><td>NET_CTRL_CLEAR_ALARM</td></tr>
	 * <tr><td>SDK_CTRL_ARMED</td><td>protecte or removal</td><td>CTRL_ARM_DISARM_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SET_BYPASS</td><td>set bypass </td><td>NET_CTRL_SET_BYPASS</td></tr>
	 * </table>
	 * @param param
	 * @param waittime overtime of waiting device back 
	 * @return true:success, false:failed
	 * \else
	 * �豸����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param type ��������\n
	 * ���Ʋ���,����type��ͬ����ͬ:
	 * <table>
	 * <tr><td>type</td><td>����  </td><td>�ṹ��         </td></tr>
	 * <tr><td>SDK_CTRL_REBOOT</td><td>�����豸</td><td>  ��</td></tr>
	 * <tr><td>SDK_CTRL_SHUTDOWN</td><td>�ر��豸 </td><td> ��</td></tr>
	 * <tr><td>SDK_CTRL_DISK</td><td>Ӳ�̹��� </td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_KEYBOARD_POWER<-->SDK_KEYBOARD_JMPUP</td><td>�������</td><td>��</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_IN</td><td>������������</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_OUT</td><td>����������� </td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_MATRIX</td><td>������� </td><td>MATRIXCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SDCARD</td><td>SD������(IPC��Ʒ)����ͬӲ�̿���</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_BURNING_START</td><td>��¼������,��ʼ��¼ </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_STOP</td><td>��¼������,������¼</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_ADDPWD</td><td>��¼������,��������(��'\0'Ϊ��β���ַ���,��󳤶�8λ)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDHEAD</td><td>��¼������,����Ƭͷ(��'\0'Ϊ��β���ַ���,��󳤶�1023�ֽ�,֧�ַ���,�зָ���)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDSIGN</td><td>��¼������,���Ӵ�㵽��¼��Ϣ </td><td>��   </td></tr>
	 * <tr><td>SDK_BURNING_ADDCURSTOMINFO</td><td>��¼������,�Զ������(��'\0'Ϊ��β���ַ���,��󳤶�1023�ֽ�,֧�ַ���,�зָ���)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ATTACH</td><td>��¼������,������¼</td><td> BURNING_PARM_ATTACH</td></tr>
	 * <tr><td>SDK_BURNING_PAUSE</td><td>¼��ͣ</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_CONTINUE</td><td>��¼����  </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_POSTPONE</td><td>��¼˳�� </td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_CTRL_OEMCTRL</td><td>��ͣ����</td><td>BOOL*</td></tr>
	 * <tr><td>SDK_CTRL_RESTOREDEFAULT</td><td>�ָ��豸��Ĭ������ </td><td>DWORD*</td></tr>
	 * <tr><td>SDK_CTRL_CAPTURE_START</td><td>�����豸ץͼ</td><td> NET_SNAP_COMMANDINFO</td></tr>
	 * <tr><td>SDK_CTRL_CLEARLOG</td><td>�����־</td><td>SDK_LOG_QUERY_TYPE</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_WIRELESS</td><td>�������߱���(IPC��Ʒ)</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_MARK_IMPORTANT_RECORD</td><td>��ʶ��Ҫ¼���ļ�</td><td>NET_RECORDFILE_INFO</td></tr>
	 * <tr><td>SDK_CTRL_DISK_SUBAREA</td><td>����Ӳ�̷���</td><td>DISKCTRL_SUBAREA</td></tr>
	 * <tr><td>SDK_BACKUP_START</td><td> �豸���ݿ�ʼ</td><td>BACKUP_RECORD</td></tr>
	 * <tr><td>SDK_BACKUP_STOP</td><td> �豸����ֹͣ</td><td>char*</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_ADD</td><td>�����ֶ�����WIFI���� </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_DEC </td><td> �����ֶ�ɾ��WIFI����  </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_BUZZER_START</td><td> ���������ƿ�ʼ  </td><td> ��</td></tr>
	 * <tr><td>SDK_BUZZER_STOP</td><td>���������ƽ��� </td><td>  ��</td></tr>
	 * <tr><td>SDK_REJECT_USER</td><td>�޳��û�</td><td>SDKDEV_REJECT_USER</td></tr>
	 * <tr><td>SDK_SHIELD_USER</td><td> �����û�</td><td>SDKDEV_SHIELD_USER</td></tr>
	 * <tr><td>SDK_RAINBRUSH</td><td>���ܽ�ͨ, ��ˢ����</td><td>��</td></tr>
	 * <tr><td>SDK_MANUAL_SNAP</td><td>���ܽ�ͨ, �ֶ�ץ�� </td><td> MANUAL_SNAP_PARAMETER</td></tr>
	 * <tr><td>SDK_MANUAL_NTP_TIMEADJUST</td><td>�ֶ�NTPУʱ</td><td> �� </td></tr>     
	 * <tr><td>SDK_NAVIGATION_SMS</td><td> ������Ϣ�Ͷ���Ϣ</td><td>SDKDEV_NAVIGATION_SMSS</td></tr>
	 * <tr><td>SDK_CTRL_ROUTE_CROSSING</td><td>·�ߵ�λ��Ϣ</td><td> ROUTE_CROSSING_INFO</td></tr>
	 * <tr><td>SDK_BACKUP_FORMAT</td><td>��ʽ�������豸,�����豸�����ַ��� </td><td>char*</td></tr>
	 * <tr><td>SDK_DEVICE_LOCALPREVIEW_SLIPT</td><td>�����豸�˱���Ԥ���ָ�</td><td>  DEVICE_LOCALPREVIEW_SLIPT_PARAMETER</td></tr>
	 * <tr><td>SDK_CTRL_INIT_RAID</td><td>RAID��ʼ��,Raid�����ַ��� </td><td>char*</td></tr>
	 * <tr><td>SDK_CTRL_RAID RAID</td><td>����</td><td>CTRL_RAID_INFO</td></tr>
	 * <tr><td>SDK_CTRL_SAPREDISK</td><td>�ȱ��̲���  </td><td> CTRL_SPARE_DISK_INFO_A</td></tr>
	 * <tr><td>SDK_WIFI_CONNECT</td><td>�ֶ�����WIFI���� </td><td> WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_WIFI_DISCONNECT</td><td>�ֶ��Ͽ�WIFI���� </td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN </td><td>�Ž�����-���� </td><td> NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_INSERT</td><td>��Ӽ�¼,��ü�¼�����</td><td>  NET_CTRL_RECORDSET_INSERT_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_UPDATE</td><td>����ĳ��¼����ŵļ�¼  </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_REMOVE</td><td>���ݼ�¼�����ɾ��ĳ��¼</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_CLEAR</td><td>������м�¼����Ϣ</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_CLOSE</td><td>�Ž�����-����</td><td>NET_CTRL_ACCESS_CLOSE</td></tr>
	 * <tr><td>SDK_CTRL_STOP_ALARMBELL</td><td>�ֶ��رվ���</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>�ֶ���������</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>��ʼ������Ƶ�ļ�  </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_STOP_PLAYAUDIO</td><td>ֹͣ������Ƶ�ļ� </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>�Ž�����-ǿ�ƿ��� </td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_CLEAR_ALARM </td><td>���� </td><td>NET_CTRL_CLEAR_ALARM</td></tr>
	 * <tr><td>SDK_CTRL_ARMED</td><td>��������</td><td>CTRL_ARM_DISARM_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SET_BYPASS</td><td>������· </td><td>NET_CTRL_SET_BYPASS</td></tr>
	 * </table>
	 * @param param
	 * @param waittime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */

	public static native boolean       ControlDevice(long lLoginID, int type, Object param, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set record status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pRSBuffer record status buffer, the total length is the channel number, the data definition in the buffer table as:
	 * 0 not record \n
	 * 1 manually record \n 
	 * 2 auto record \n
	 * @return true:success, false:failed
	 * \else
	 * ����ͨ��¼��״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pRSBuffer ¼��״̬������,�ܳ���Ϊͨ������,  0����¼��1���ֶ�¼��2���Զ�¼��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryRecordState 
	 */
	public static native boolean       SetupRecordState(long lLoginID, byte pRSBuffer[]);
	
	/**
	 * \if ENGLISH_LANG
	 * receive device IO status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType IO tyoe,as IOControl
	 * @param objArr status buffering area,based on different IO type to different data structure group 
	 * @param nIOCount output parameter,received data IO quantity 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯIO״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType IO����,�μ� IOControl
	 * @param objArr ״̬������,���ݲ�ͬ��IO���Ϳ����ǲ�ͬ�����ݽṹ����
	 * @param nIOCount �������,ȡ��״̬��IO����
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login IOControl
	 */
	public static native boolean       QueryIOControlState(long lLoginID, int emType, Object[] objArr, Integer nIOCount, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set IO status,may set for one IO,also may set for multiples
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType IO type:1 alarm input. 2 alarm output,details in IOTYPE type definition 
	 * <table>
	 * <tr><td>emType</td><td>meaning</td><td>corresponding structure</td></tr>
	 * <tr><td>SDK_ALARMINPUT</td><td>control alarm input</td><td>ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_ALARMOUTPUT</td><td>control alarm output</td><td>ALARM_CONTROL</td></tr>
	 * <tr><td>SDK_DECODER_ALARMOUT</td><td>control alarm decoder output</td><td>DECODER_ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_ALARM_TRIGGER_MODE</td><td>alarm trigger method</td><td>TRIGGER_MODE_CONTROL</td></tr>
	 * </table>
	 * @param objArr status buffering area,group various among different IO types
	 * @return true:success, false:failed
	 * \else
	 * IO����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType IO����
	 * <table>
	 * <tr><td>emType</td><td>��ѯ����</td><td>  ��Ӧ�ṹ�� </td></tr>
	 * <tr><td>SDK_ALARMINPUT</td><td>��ѯ���������Ƿ��Ѿ���</td><td>ALARM_CONTROL</td></tr> 
	 * <tr><td>SDK_ALARMOUTPUT</td><td>��ѯ��������Ƿ��Ѿ���</td><td>ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_DECODER_ALARMOUT</td><td>���Ʊ������������	</td><td>DECODER_ALARM_CONTROL</td></tr> 
	 * <tr><td>SDK_ALARM_TRIGGER_MODE</td><td>ѯ����������ʽ </td><td>RIGGER_MODE_CONTROL </td></tr>
	 * </table>
	 * @param objArr ״̬������,���ݲ�ͬ��IO���Ϳ����ǲ�ͬ�����ݽṹ����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	
	public static native boolean       IOControl(long lLoginID, int emType, Object[] objArr);
	
	/**
	 * \if ENGLISH_LANG
	 * forced I frame interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel id
	 * @param nSubChannel stream type,0-main stream 1-1 2-extra stream2 3 �Cextra stream 3
	 * @return true:success, false:failed
	 * \else
	 * ǿ��I֡
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ��id 
	 * @param nSubChannel ��������,0-������ 1-������1 2-������2 3 �C������3
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       MakeKeyFrame(long lLoginID, int nChannelID, int nSubChannel);
	
	/**
	 * \if ENGLISH_LANG
	 * search user info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param info user info buffering,should be sent into one USER_MANAGE_INFO structure pointer with allocated memory��return each user info USER_INFO password text is encrypted 
	 * @param waittime waiting time  
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�û���Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param info �û���Ϣ����,Ӧ����һ���ѷ�����ڴ��USER_MANAGE_INFO�ṹָ�룻���ظ��û���ϢUSER_INFO�е�password�ֶ��Ǽӹ��ܵ�
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif

	 */
	
	public static native boolean 		QueryUserInfo(long lLoginID, USER_MANAGE_INFO info, int waittime);
		
	/**
	 * \if ENGLISH_LANG
	 * search user info, extension interface, support 16 bit password length��as well as 8 bit username and 8 bit password length
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param info user info buffering,should send into an allocated memory USER_MANAGE_INFO_EX structure pointer, return to user info USER_INFO_EX password text is encrypted 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�û���Ϣ--��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param info �û���Ϣ����,Ӧ����һ���ѷ�����ڴ�� USER_MANAGE_INFO_EX �ṹָ��, ���ظ��û���Ϣ USER_INFO_EX �е�password�ֶ��Ǽӹ��ܵ� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see OperateUserInfoEx
	 */
	public static native boolean       QueryUserInfoEx(long lLoginID, USER_MANAGE_INFO_EX info, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search user info, support up to 64-ch devices
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param info user info buffering,should send into an allocated memory  USER_MANAGE_INFO_NEW structure pointer, return to user info USER_INFO_NEW password text is encrypted 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�û���Ϣ--���֧��64ͨ���豸
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param info �û���Ϣ����,Ӧ����һ���ѷ�����ڴ�� USER_MANAGE_INFO_NEW �ṹָ��, ���ظ��û���Ϣ USER_MANAGE_INFO_NEW �е�password�ֶ��Ǽӹ��ܵ� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see OperateUserInfoNew
	 */
	public static native boolean		QueryUserInfoNew(long lLoginID, USER_MANAGE_INFO_NEW info , int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set user info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nOperateType operation types as follows:
	 * <table>
	 * <tr><td>value</td><td>peration type</td><td>opParam corresponding structure type</td><td>subParam corresponding structure type</td></tr>
	 * <tr><td>0</td><td>add user group</td><td>USER_GROUP_INFO</td><td> </td></tr>
	 * <tr><td>1</td><td>delete user group</td><td>USER_GROUP_INFO</td><td>  </td></tr>
	 * <tr><td>2</td><td>edit user group</td><td>USER_GROUP_INFO</td><td>USER_GROUP_INFO </td></tr>
	 * <tr><td>3</td><td>add user</td><td>USER_INFO</td><td> </td><td> </td></tr>
	 * <tr><td>4</td><td>delete user</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>5</td><td>edit user</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * <tr><td>6</td><td>edit user password</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * </table>
	 * @param opParam set user info's input buffering,��detaield as above nOperateType 
	 * @param subParam set user info's assist input buffering,when setting type is editing info, here should send original user info,details as above nOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * �����豸�û�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nOperateType ��������
	 * <table>
	 * <tr><td>��ֵ </td><td>�������� </td><td>opParam��Ӧ�ṹ������</td><td>subParam��Ӧ�ṹ������ </td></tr>
	 * <tr><td>0</td><td>�����û���</td><td>USER_GROUP_INFO</td><td>   </td></tr>
	 * <tr><td>1</td><td>ɾ���û���</td><td>USER_GROUP_INFO</td><td>  </td></tr>
	 * <tr><td>2</td><td>�޸��û���</td><td>USER_GROUP_INFO</td><td>USER_GROUP_INFO </td></tr>
	 * <tr><td>3</td><td>�����û�</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>4</td><td>ɾ���û�</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>5</td><td>�޸��û�</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * <tr><td>6</td><td>�޸��û�����</td><td> USER_INFO	</td><td>USER_INFO </td></tr>
	 * </table>
	 * @param opParam �����û���Ϣ�����뻺��
	 * @param subParam �����û���Ϣ�ĸ������뻺��,����������Ϊ�޸���Ϣ��ʱ��,�˴�Ӧ����������ԭʼ�û���Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryUserInfo
	 */
	public static native boolean       OperateUserInfo(long lLoginID, int nOperateType, Object opParam, Object subParam, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set user info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nOperateType operation type, as OperateUserInfo
	 * @param opParam set user info's input buffering, details as above nOperateType 
	 * @param subParam set user info's assist input buffering, when setting type is editing info, here should send original user info, details as above nOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * �����豸�û�--��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nOperateType ��������,ͬ OperateUserInfo
	 * @param opParam ���û���Ϣ�����뻺��
	 * @param subParam �����û���Ϣ�ĸ������뻺��,����������Ϊ�޸���Ϣ��ʱ��,�˴�Ӧ����������ԭʼ�û���Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryUserInfoEx
	 */
	public static native boolean       OperateUserInfoEx(long lLoginID, int nOperateType, Object opParam, Object subParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set user info, operation device user,max support 64-ch devices
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nOperateType operation type, as OperateUserInfo
	 * @param opParam set user info's input buffering, details as abovenOperateType 
	 * @param subParam set user info's assist input buffering, when setting type is editing info, here should send original user info, details as abovenOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * �����豸�û�--���֧��64ͨ���豸
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nOperateType ��������,ͬ OperateUserInfo
	 * @param opParam ���û���Ϣ�����뻺��
	 * @param subParam �����û���Ϣ�ĸ������뻺��,����������Ϊ�޸���Ϣ��ʱ��,�˴�Ӧ����������ԭʼ�û���Ϣ
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryUserInfoNew
	 */
	public static native boolean       OperateUserInfoNew(long lLoginID, int nOperateType, Object opParam, Object subParam , int waittime);

	/**
	 * \if ENGLISH_LANG
	 * create transparent serial channel, change front-end device serial to transparent channel status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param TransComType serial type 0:serial 1:485 port
	 * @param baudrate serial baud rate,1~8 as 1200,2400,4800,9600,19200,38400,57600,115200 respectively
	 * @param databits  serial data digit 4~8 represent 4~8 digits
	 * @param stopbits serial stop digit 1 represent 1 digit, 2 represent 1-5 digit(s), 3 represent 2 digits 
	 * @param parity serial inspection digit,1:odd,2:even,3: none 
	 * @param cbTransCom serial data recall, recall info sent from front-end device 
	 * @return true:success, false:failed
	 * \else
	 * ����͸������ͨ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param TransComType �������� 0:����1:485�� 
	 * @param baudrate ���ڵĲ�����,1~8�ֱ��ʾ1200,2400,4800,9600,19200,38400,57600,115200
	 * @param databits  ���ڵ�����λ4~8��ʾ4λ~8λ 
	 * @param stopbits ���ڵ�ֹͣλ1��ʾ1λ,2��ʾ1.5λ,3��ʾ2λ
	 * @param parity ���ڵ�ֹͣλ1��ʾ1λ,2��ʾ1.5λ,3��ʾ2λ
	 * @param cbTransCom �������ݻص�,�ص���ǰ���豸����������Ϣ
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see DestroyTransComChannel SendTransComData
	 */
	public static native long          CreateTransComChannel(long lLoginID, int TransComType, int baudrate, int databits, int stopbits, int parity, CB_fTransComCallBack cbTransCom);
	
	/**
	 * \if ENGLISH_LANG
	 * send transparent serial data, as sent data to front end data
	 * @param lTransComChannel transparent serial ID,  interface CreateTransComChannel return value
	 * @param pBuffer transparent serial data pointer to send 
	 * @param dwBufSize transparent serial data length to send(unit:byte)
	 * @return true:success, false:failed
	 * \else
	 * ͸�����ڷ�������
	 * @param lTransComChannel ͸������ID,�ӿ� CreateTransComChannel ����ֵ
	 * @param pBuffer Ҫ���͵�͸����������ָ�� 
	 * @param dwBufSize Ҫ���͵�͸ʱ�������ݳ���(��λ:�ֽ�)
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see CreateTransComChannel DestroyTransComChannel
	 */
	
	public static native boolean       SendTransComData(long lTransComChannel, byte pBuffer[], int dwBufSize);
	
	/**
	 * \if ENGLISH_LANG
	 * close transparent channel
	 * @param lTransComChannel transparent serial ID, interface CreateTransComChannel return value 
	 * @return true:success, false:failed
	 * \else
	 * �ͷ�ͨ������ͨ��
	 * @param lTransComChannel ͸������ID,�ӿ�CreateTransComChannel����ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see CreateTransComChannel SendTransComData
	 */
	public static native boolean       DestroyTransComChannel(long lTransComChannel);
	
	/**
	 * \if ENGLISH_LANG
	 * search serial status interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param TransComType serial type, 0:232;1:485
	 * @param pCommState serial status interface
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ͸������״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param TransComType ��������0:232;485
	 * @param pCommState ����״̬�ӿ���
	 * @param nWaitTime �ȴ���ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryTransComParams(long lLoginID, int TransComType, SDK_COMM_STATE pCommState, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * read device config info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param dwCommand device config command refer to config command 
	 * <table>
	 * <tr><td>dwCommand</td><td>dwCommand corresponding</td><td>structure</td></tr>
	 * <tr><td>SDK_DEV_DEVICECFG</td><td>receive device parameter</td><td>SDKDEV_SYSTEM_ATTR_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG</td><td>receive network parameter</td><td>DKDEV_NET_CFG </td></tr>
	 * <tr><td>SDK_DEV_CHANNELCFG</td><td>receive image channel parameter</td><td>if lChannel is -1,means receive all channels,return SDKDEV_CHANNEL_CFG[channel_num] if lChannel is between 0 and max channel,return SDKDEV_CHANNEL_CFG</td></tr>
	 * <tr><td>SDK_DEV_RECORDCFG</td><td>receive timed video parameter</td><td>if lChannel is -1,means receive all channels,return SDKDEV_RECORD_CFG[channel_num] if lChannel is between 0 and max channel,return SDKDEV_RECORD_CFG</td></tr>
	 * <tr><td>SDK_DEV_COMMCFG</td><td>receive serial parameterreceive serial parameter</td><td>SDKDEV_COMM_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARMCFG</td><td>receive alarm arm parameter	</td><td>SDKDEV_ALARM_SCHEDULE </td></tr>
	 * <tr><td>SDK_DEV_TIMECFG</td><td>receiveDVR time</td><td>NET_TIME</td></tr> 
	 * <tr><td>SDK_DEV_PREVIEWCFG</td><td>receive preview parameter</td><td>SDKDEV_PREVIEW_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUTOMTCFG</td><td>receive auto maintenance config</td><td>SDKDEV_AUTOMT_CFG </td></tr>
	 * <tr><td>SDK_DEV_VEDIO_MARTIX</td><td>receive this matrix strategy config</td><td>SDKDEV_VIDEO_MATRIX_CFG </td></tr>
	 * <tr><td>SDK_DEV_MULTI_DDNS</td><td>receive multiple ddns servers config</td><td>SDKDEV_MULTI_DDNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG</td><td>receive snapshot config</td><td>SDKDEV_SNAP_CFG</td></tr> 
	 * <tr><td>SDK_DEV_WEB_URL_CFG</td><td>receivehttp path config</td><td>SDKDEV_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG</td><td>ftp opload config</td><td>SDKDEV_FTP_PROTO_CFG </td></tr>
	 * <tr><td>SDK_DEV_INTERVIDEO_CFG</td><td>platform input config,</td><td>lchannel means platform input type	lchannel=4,means bell platform,DHDEV_INTERVIDEO_BELL_CFG. lchannel=10,means ZTE platform,DHDEV_INTERVIDEO_NSS_CFG lchannel=11,means u CNC,DHDEV_INTERVIDEO_UCOM_CFG.</td></tr>
	 * <tr><td>SDK_DEV_VIDEO_COVER</td><td>area masked config</td><td>if lChannel if -1,means receive all channels,return DHDEV_VIDEOCOVER_CFG[channel_num]. if lChannel is between 0 and max channel,return DHDEV_VIDEOCOVER_CFG.</td></tr>
	 * <tr><td>SDK_DEV_TRANS_STRATEGY</td><td>transmission strategy config	</td><td>SDKDEV_TRANSFER_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_STRATEGY</td><td>video download strategy config	</td><td>SDKDEV_DOWNLOAD_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_WATERMAKE_CFG</td><td>image watermark config</td><td>if lChannelis-1,means receive all channels,return DHDEV_WATERMAKE_CFG[channel_num]. if lChannel is between 0 and max channel, return DHDEV_WATERMAKE_CFG.</td></tr>
	 * <tr><td>SDK_DEV_WLAN_CFG</td><td>config wi-fi info</td><td>SDKDEV_WLAN_INFO </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG</td><td>search wireless device</td><td>SDKDEV_WLAN_DEVICE_LIST </td></tr>
	 * <tr><td>SDK_DEV_REGISTER_CFG</td><td>actively register parameter config</td><td>SDKDEV_REGISTER_SERVER </td></tr>
	 * <tr><td>SDK_DEV_CAMERA_CFG</td><td>camera property config</td><td>if lChannel is-1,means receive all channels,returnDHDEV_CAMERA_CFG[channel_num]. if lChannel is between 0 and max channel, returnDHDEV_CAMERA_CFG.</td></tr>
	 * <tr><td>SDK_DEV_INFRARED_CFGIR</td><td>alarm parameter</td><td>SDK_INFRARED_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAIL_CFG</td><td>mail config	</td><td>SDKDEV_MAIL_CFG </td></tr>
	 * <tr><td>SDK_DEV_DNS_CFG</td><td>DNS server config</td><td>SDKDEV_DNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_NTP_CFG</td><td>NTP config</td><td>SDKDEV_NTP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG</td><td>Sniffer snapshot config</td><td>SDKDEV_SNIFFER_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUDIO_DETECT_CFG</td><td>audio detection alarm parameter</td><td>SDK_AUDIO_DETECT_CFG </td></tr>
	 * <tr><td>SDK_DEV_STORAGE_STATION_CFG</td><td>storage location config</td><td>if lChannelis-1,means receive all channels,return SDK_STORAGE_STATION_CFG[channel_num]. if lChannel is between 0 and max channel, return SDK_STORAGE_STATION_CFG.</td></tr>
	 * <tr><td>SDK_DEV_DST_CFG</td><td>daylight saving time config</td><td>SDKDEV_DST_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEO_OSD_CFG</td><td>video OSD superposition config	</td><td>if lChannelis-1,means receive all channels,return SDK_DVR_VIDEOOSD_CFG[channel_num]. if lChannel is between 0 and max channel, return SDK_DVR_VIDEOOSD_CFG.</td></tr>
	 * <tr><td>SDK_DEV_ALARM_CENTER_CFG</td><td>alarm center config</td><td>ALARMCENTER_UP_CFG </td></tr>
	 * <tr><td>SDK_DEV_CDMAGPRS_CFG</td><td>CDMA \ GPRS network config</td><td>SDKDEV_CDMAGPRS_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFGIP</td><td>filter config	</td><td>SDKDEV_IPIFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TALK_ENCODE_CFG</td><td>bidirectional talk encode config</td><td>SDKDEV_TALK_ENCODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_RECORD_PACKET_CFG</td><td>video packaging length config</td><td>SDKDEV_RECORD_PACKET_CFG </td></tr>
	 * <tr><td>SDK_DEV_MMS_CFG</td><td>sms MMSconfig</td><td>SDKDEV_MMS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SMSACTIVATION_CFG</td><td>sms activate wireless connection config</td><td>SDKDEV_SMSACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_DIALINACTIVATION_CFG</td><td>dial activate wireless connection config</td><td>SDKDEV_DIALINACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG_EX</td><td>network snapshot config</td><td>SDK_ATM_SNIFFER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_RATE_CFG</td><td>download speed limit</td><td>int </td></tr>
	 * <tr><td>SDK_DEV_PANORAMA_SWITCH_CFG</td><td>full scene switch alarm config</td><td>ALARM_PANORAMA_SWITCH_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOST_FOCUS_CFG</td><td>focus loss alarm config</td><td>ALARM_LOST_FOCUS_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARM_DECODE_CFG	</td><td>alarm decoder config</td><td>SDK_ALARMDEC_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEOOUT_CFG</td><td>video output parameter config</td><td>DEV_VIDEOOUT_INFO </td></tr>
	 * <tr><td>SDK_DEV_POINT_CFG</td><td>preset point enable config</td><td>SDKDEV_POINT_CFG </td></tr>
	 * <tr><td>SDK_DEV_IP_COLLISION_CFG	</td><td>Ip conflict detection alarm config</td><td>ALARM_IP_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_OSD_ENABLE_CFGOSD</td><td>superposition enable config</td><td>SDKDEV_OSD_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_CFG</td><td>local alarm config</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETALARM_CFG</td><td>network alarm config</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_MOTIONALARM_CFG</td><td>dynamic detection alarm confi</td><td>SDK_MOTION_DETECT_CFG_EX</td></tr> 
	 * <tr><td>SDK_DEV_VIDEOLOSTALARM_CFG</td><td>video loss alarm config</td><td>SDK_VIDEO_LOST_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_BLINDALARM_CFG</td><td>video mask alarm config</td><td>SDK_BLIND_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DISKALARM_CFG</td><td>hard disk alarm config</td><td>SDK_DISK_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETBROKENALARM_CFG</td><td>network outage alarm config</td><td>SDK_NETBROKEN_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG</td><td>front-end encoder info in digital channel</td><td>DEV_ENCODER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TV_ADJUST_CFG</td><td>TV adjust config</td><td>SDKDEV_TVADJUST_CFG </td></tr>
	 * <tr><td>SDK_DEV_ABOUT_VEHICLE_CFG</td><td>mobile related config,Beijing bus use</td><td>SDKDEV_ABOUT_VEHICLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_ABILITY</td><td>receiveatm superposition support capability info</td><td>SDKDEV_ATM_OVERLAY_GENERAL</td></tr> 
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG</td><td>atmsuperpositionconfig, new atm specifically own</td><td>SDKDEV_ATM_OVERLAY_CONFIG </td></tr>
	 * <tr><td>SDK_DEV_DECODER_TOUR_CFG</td><td>decoder tour config	</td><td>SDKDEV_DECODER_TOUR_CFG </td></tr>
	 * <tr><td>SDK_DEV_SIP_CFG</td><td>SIPconfig</td><td>SDKDEV_SIP_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG</td><td>WIFI APconfig</td><td>SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG </td></tr>
	 * <tr><td>SDK_DEV_STATICALARM_CFG</td><td>statis alarm config</td><td>SDK_STATIC_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODE_POLICY_CFG</td><td>device decoding strategy config</td><td>SDKDEV_DECODEPOLICY_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACHINE_CFG</td><td>device related config</td><td>SDKDEV_MACHINE_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAC_COLLISION_CFG</td><td>MAC conflict detection config</td><td>ALARM_MAC_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RTSP_CFG	RTSP</td><td>config</td><td>SDKDEV_RTSP_CFG </td></tr>
	 * <tr><td>SDK_DEV_232_COM_CARD_CFG	</td><td>232 serial card NO. signal event config</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_485_COM_CARD_CFG	</td><td>485 serial card NO. signal event config</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG_EX</td><td>FTP upload extension config	</td><td>SDKDEV_FTP_PROTO_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_SYSLOG_REMOTE_SERVER</td><td>SYSLOG remote server config</td><td>SDKDEV_SYSLOG_REMOTE_SERVER </td></tr>
	 * <tr><td>SDK_DEV_COMMCFG_EX</td><td>extension serial property config</td><td>SDKDEV_COMM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETCARD_CFG</td><td>port info config	</td><td>SDKDEV_NETCARD_CFG </td></tr>
	 * <tr><td>SDK_DEV_BACKUP_VIDEO_FORMAT</td><td>video backup format config</td><td>SDKDEV_BACKUP_VIDEO_FORMAT </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_CFG</td><td>strean encryption config</td><td>SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFG_EX</td><td>strean encryption config	</td><td>SDKDEV_IPIFILTER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_CUSTOM_CFG</td><td>user customized config</td><td>SDKDEV_CUSTOM_CFG </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG_EX</td><td>search wireless device extension config</td><td>SDKDEV_WLAN_DEVICE_LIST_EX </td></tr>
	 * <tr><td>SDK_DEV_ACC_POWEROFF_CFG</td><td>ACC outage event config</td><td>SDKDEV_ACC_POWEROFF_CFG </td></tr>
	 * <tr><td>SDK_DEV_EXPLOSION_PROOF_CFG</td><td>Explosion proof box alarm event config</td><td>SDKDEV_EXPLOSION_PROOF_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG_EX</td><td>network extension config</td><td>SDKDEV_NET_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_LIGHTCONTROL_CFG	</td><td>light control config</td><td>SDKDEV_LIGHTCONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_3GFLOW_CFG</td><td>3G flow info config</td><td>SDKDEV_3GFLOW_INFO_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPV6_CFG</td><td>IPv6config</td><td>SDKDEV_IPV6_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNMP_CFG</td><td>Snmpconfig</td><td>SDKDEV_NET_SNMP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CONTROL_CFG</td><td>snapshot switch config</td><td>SDKDEV_SNAP_CONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_GPS_MODE_CFGGPS</td><td>positioning mode config	</td><td>SDKDEV_GPS_MODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_UPLOAD_CFG</td><td>image upload config info	</td><td>SDKDEV_SNAP_UPLOAD_CFG </td></tr>
	 * <tr><td>SDK_DEV_SPEED_LIMIT_CFG</td><td>speed limit config info 	</td><td>SDKDEV_SPEED_LIMIT_CFG </td></tr>
	 * <tr><td>SDK_DEV_ISCSI_CFG</td><td>iSCSIconfig</td><td>SDKDEV_ISCSI_CFG </td></tr>
	 * <tr><td>SDK_DEV_WIRELESS_ROUTING_CFG	</td><td>wireless router config</td><td>SDKDEV_WIRELESS_ROUTING_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_CFG</td><td>digital fence config</td><td>SDKDEV_ENCLOSURE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_VERSION_CFG</td><td>igital fence version NO. config </td><td>SDKDEV_ENCLOSURE_VERSION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RIAD_EVENT_CFG</td><td>Raid event config</td><td>SDKDEV_RAID_EVENT_CFG </td></tr>
	 * <tr><td>SDK_DEV_FIRE_ALARM_CFG</td><td>fir alarm config </td><td>SDKDEV_FIRE_ALARM_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_NAME_CFG</td><td>local name</td><td>alarm configName1&&name2&&name3...format character string</td></tr>
	 * <tr><td>SDK_DEV_URGENCY_RECORD_CFG</td><td>emergency storage config</td><td>SDKDEV_URGENCY_RECORD_CFG </td></tr>
	 * <tr><td>SDK_DEV_ELEVATOR_ATTRI_CFG</td><td>elevator operation parameter config</td><td>SDKDEV_ELEVATOR_ATTRI_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG_EX</td><td>	atm overlay	</td><td>SDKDEV_ATM_OVERLAY_CONFIG_EX </td></tr>
	 * <tr><td>SDK_DEV_MACFILTER_CFG</td><td>MAC filter	</td><td>SDKDEV_MACFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACIPFILTER_CFG</td><td>MAC,IP filter</td><td>SDKDEV_MACIPFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_TIME_CFG</td><td>stream</td><td>DHEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_LIMIT_BIT_RATE_CFG</td><td>limit</td><td>SDKDEV_LIMIT_BIT_RATE </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG_EX</td><td>snapshot </td><td>SDKDEV_SNAP_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODER_URL_CFG</td><td>decoder url </td><td>SDKDEV_DECODER_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_TOUR_ENABLE_CFG</td><td>tour </td><td>SDKDEV_TOUR_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG_EX</td><td>wifi ap extension</td><td>SDKDEV_VEHICLE_WIFI_AP_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG_EX</td><td>digital channel</td><td>EV_ENCODER_CFG_EX </td></tr>

	 * </table>
	 * @param lChannel channel NO.,if receive all channel data as 0xFFFFFFFF,if command do not need channel NO., this parameter is invalid 
	 * @param lpOutBuffer receiving data buffering pointer 
	 * @param lpBytesReturned actual received data length
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param dwCommand �豸��������,��ͬdwCommand,lpOutBuffer��Ӧ�Ľṹ�彫�᲻ͬ,��������
	 * <table>
 	 * <tr><td>dwCommand</td><td>dwCommand���� </td><td>��Ӧ�ṹ�� </td></tr>
 	 * <tr><td>SDK_DEV_DEVICECFG</td><td>��ȡ�豸����</td><td>SDKDEV_SYSTEM_ATTR_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG</td><td>��ȡ������� </td><td>SDKDEV_NET_CFG </td></tr>
	 * <tr><td>SDK_DEV_CHANNELCFG</td><td>��ȡͼ��ͨ������</td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,����SDKDEV_CHANNEL_CFG[channel_num] ���lChannelΪ0�����ͨ��֮��,����<SDKDEV_CHANNEL_CFG 
	 * <tr><td>SDK_DEV_RECORDCFG</td><td>��ȡ��ʱ¼�����	���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,����SDKDEV_RECORD_CFG[channel_num] �� ��lChannelΪ0�����ͨ��֮��,����SDKDEV_RECORD_CFG 
	 * <tr><td>SDK_DEV_COMMCFG</td><td>��ȡ���ڲ���	</td><td>SDKDEV_COMM_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARMCFG</td><td>��ȡ������������</td><td>SDKDEV_ALARM_SCHEDULE </td></tr>
	 * <tr><td>SDK_DEV_TIMECFG</td><td>��ȡDVRʱ��</td><td>NET_TIME </td></tr>
	 * <tr><td>SDK_DEV_PREVIEWCFG</td><td>��ȡԤ������</td><td>SDKDEV_PREVIEW_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUTOMTCFG</td><td>��ȡ�Զ�ά������	</td><td>SDKDEV_AUTOMT_CFG </td></tr>
	 * <tr><td>SDK_DEV_VEDIO_MARTIX</td><td>��ȡ���������������</td><td>SDKDEV_VIDEO_MATRIX_CFG </td></tr>
	 * <tr><td>SDK_DEV_MULTI_DDNS</td><td>��ȡ��ddns����������</td><td>SDKDEV_MULTI_DDNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG</td><td>��ȡץͼ�������	</td><td>SDKDEV_SNAP_CFG </td></tr>
	 * <tr><td>SDK_DEV_WEB_URL_CFG</td><td>��ȡhttp·������	</td><td>SDKDEV_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG</td><td>ftp�ϴ�����</td><td>SDKDEV_FTP_PROTO_CFG </td></tr>
	 * <tr><td>SDK_DEV_INTERVIDEO_CFG</td><td>ƽ̨��������,lchannel����ƽ̨��������</td><td>lchannel=4,��ʾ����ƽ̨,SDKDEV_INTERVIDEO_BELL_CFG��lchannel=10,��ʾ������άƽ̨,SDKDEV_INTERVIDEO_NSS_CFG lchannel=11,��ʾu��ͨ,SDKDEV_INTERVIDEO_UCOM_CFG��</td></tr> 
	 * <tr><td>SDK_DEV_VIDEO_COVER</td><td>�����ڵ�����	</td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,����</td><td>SDKDEV_VIDEOCOVER_CFG[channel_num]�� �� ��lChannelΪ0�����ͨ��֮��,����SDKDEV_VIDEOCOVER_CFG�� </td></tr>
	 * <tr><td>SDK_DEV_TRANS_STRATEGY</td><td>�����������</td><td>SDKDEV_TRANSFER_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_STRATEGY</td><td>¼�����ز�������	</td><td>SDKDEV_DOWNLOAD_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_WATERMAKE_CFG</td><td>ͼ��ˮӡ����</td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,����SDKDEV_WATERMAKE_CFG[channel_num]�� �� ��lChannelΪ0�����ͨ��֮��,����SDKDEV_WATERMAKE_CFG�� </td></tr>
	 * <tr><td>SDK_DEV_WLAN_CFG</td><td>��������������Ϣ</td><td>SDKDEV_WLAN_INFO </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG</td><td>���������豸</td><td>SDKDEV_WLAN_DEVICE_LIST </td></tr>
	 * <tr><td>SDK_DEV_REGISTER_CFG</td><td>����ע���������</td><td>SDKDEV_REGISTER_SERVER </td></tr>
	 * <tr><td>SDK_DEV_CAMERA_CFG</td><td>����ͷ��������</td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,����SDKDEV_CAMERA_CFG[channel_num]�� �� ��lChannelΪ0�����ͨ��֮��,����SDKDEV_CAMERA_CFG�� </td></tr>
	 * <tr><td>SDK_DEV_INFRARED_CFG</td><td>���ⱨ������</td><td>SDK_INFRARED_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAIL_CFG</td><td>�ʼ�����	</td><td>SDKDEV_MAIL_CFG </td></tr>
	 * <tr><td>SDK_DEV_DNS_CFG</td><td>DNS����������</td><td>SDKDEV_DNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_NTP_CFG</td><td>NTP����</td><td>SDKDEV_NTP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG</td><td>Snifferץ������</td><td>SDKDEV_SNIFFER_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUDIO_DETECT_CFG</td><td>��Ƶ��ⱨ������</td><td>SDK_AUDIO_DETECT_CFG </td></tr>
	 * <tr><td>SDK_DEV_STORAGE_STATION_CFG</td><td>�洢λ������</td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,���� SDK_STORAGE_STATION_CFG[channel_num]�� �� ��lChannelΪ0�����ͨ��֮��,���� SDK_STORAGE_STATION_CFG��</td></tr> 
	 * <tr><td>SDK_DEV_DST_CFG</td><td>����ʱ���� </td><td>SDKDEV_DST_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEO_OSD_CFG</td><td>��ƵOSD�������� </td><td>���lChannelΪ-1,��ʾ��ȡȫ��ͨ��,���� SDK_DVR_VIDEOOSD_CFG[channel_num]�� �� ��lChannelΪ0�����ͨ��֮��,���� SDK_DVR_VIDEOOSD_CFG�� </td></tr>
	 * <tr><td>SDK_DEV_ALARM_CENTER_CFG</td><td>������������ </td><td>ALARMCENTER_UP_CFG </td></tr>
	 * <tr><td>SDK_DEV_CDMAGPRS_CFG</td><td>CDMA��GPRS��������</td><td>SDKDEV_CDMAGPRS_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFGIP</td><td>��������	</td><td>SDKDEV_IPIFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TALK_ENCODE_CFG</td><td>�����Խ���������</td><td>SDKDEV_TALK_ENCODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_RECORD_PACKET_CFG</td><td>¼������������</td><td>SDKDEV_RECORD_PACKET_CFG </td></tr>
	 * <tr><td>SDK_DEV_MMS_CFG</td><td>����MMS����	</td><td>SDKDEV_MMS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SMSACTIVATION_CFG</td><td>���ż���������������</td><td>SDKDEV_SMSACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_DIALINACTIVATION_CFG	</td><td>���ż���������������</td><td>SDKDEV_DIALINACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG_EX</td><td>����ץ������</td><td>SDK_ATM_SNIFFER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_RATE_CFG</td><td>�����ٶ�����</td><td>int </td></tr>
	 * <tr><td>SDK_DEV_PANORAMA_SWITCH_CFG</td><td>ȫ���л���������ALARM_PANORAMA_SWITCH_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOST_FOCUS_CFG</td><td>ʧȥ���㱨������ALARM_LOST_FOCUS_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARM_DECODE_CFG</td><td>��������������</td><td>SDK_ALARMDEC_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEOOUT_CFG</td><td>��Ƶ�����������	</td><td>DEV_VIDEOOUT_INFO </td></tr>
	 * <tr><td>SDK_DEV_POINT_CFG</td><td>Ԥ�Ƶ�ʹ������ </td><td>SDKDEV_POINT_CFG </td></tr>
	 * <tr><td>SDK_DEV_IP_COLLISION_CFG</td><td>Ip��ͻ��ⱨ������</td><td>ALARM_IP_COLLISION_CFG</td></tr> 
	 * <tr><td>SDK_DEV_OSD_ENABLE_CFGOSD</td><td>����ʹ������</td><td>SDKDEV_OSD_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_CFG</td><td>���ر�������</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETALARM_CFG</td><td>���籨������	</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_MOTIONALARM_CFG</td><td>���챨������</td><td>SDK_MOTION_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_VIDEOLOSTALARM_CFG</td><td>��Ƶ��ʧ�������� </td><td>SDK_VIDEO_LOST_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_BLINDALARM_CFG</td><td>��Ƶ�ڵ��������� </td><td>SDK_BLIND_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DISKALARM_CFG</td><td>Ӳ�̱������� </td><td>SDK_DISK_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETBROKENALARM_CFG</td><td>�����жϱ�������</td><td>SDK_NETBROKEN_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG</td><td>����ͨ����ǰ�˱�������Ϣ</td><td>DEV_ENCODER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TV_ADJUST_CFGTV</td><td>�������� </td><td>SDKDEV_TVADJUST_CFG </td></tr>
	 * <tr><td>SDK_DEV_ABOUT_VEHICLE_CFG</td><td>�����������,��������ʹ��	</td><td>SDKDEV_ABOUT_VEHICLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_ABILITY</td><td>��ȡatm����֧��������Ϣ</td><td>SDKDEV_ATM_OVERLAY_GENERAL </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG</td><td>atm��������,��atm����	</td><td>SDKDEV_ATM_OVERLAY_CONFIG </td></tr>
	 * <tr><td>SDK_DEV_DECODER_TOUR_CFG</td><td>������������Ѳ���� 	</td><td>SDKDEV_DECODER_TOUR_CFG </td></tr>
	 * <tr><td>SDK_DEV_SIP_CFG</td><td>SIP����	</td><td>SDKDEV_SIP_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG</td><td>WIFI AP����</td><td>SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG </td></tr>
	 * <tr><td>SDK_DEV_STATICALARM_CFG</td><td>��̬��������</td><td>SDK_STATIC_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODE_POLICY_CFG</td><td>�豸�Ľ����������</td><td>SDKDEV_DECODEPOLICY_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACHINE_CFG</td><td>������ص�����</td><td>SDKDEV_MACHINE_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAC_COLLISION_CFG</td><td>MAC��ͻ�������	</td><td>ALARM_MAC_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RTSP_CFG	RTSP</td><td>����	</td><td>SDKDEV_RTSP_CFG </td></tr>
	 * <tr><td>SDK_DEV_232_COM_CARD_CFG</td><td>232���ڿ����ź��¼�����</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_485_COM_CARD_CFG</td><td>485���ڿ����ź��¼�����	</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG_EX</td><td>FTP�ϴ���չ����	</td><td>SDKDEV_FTP_PROTO_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_SYSLOG_REMOTE_SERVER</td><td>YSLOG Զ�̷���������</td><td>SDKDEV_SYSLOG_REMOTE_SERVER </td></tr>
	 * <tr><td>SDK_DEV_COMMCFG_EX</td><td>��չ������������</td><td>SDKDEV_COMM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETCARD_CFG</td><td>������Ϣ����	</td><td>SDKDEV_NETCARD_CFG </td></tr>
	 * <tr><td>SDK_DEV_BACKUP_VIDEO_FORMAT</td><td>��Ƶ���ݸ�ʽ����</td><td>SDKDEV_BACKUP_VIDEO_FORMAT </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_CFG</td><td>������������	SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFG_EXIP</td><td>����������չ</td><td>SDKDEV_IPIFILTER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_CUSTOM_CFG</td><td>�û��Զ�������</td><td>SDKDEV_CUSTOM_CFG </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG_EX</td><td>���������豸��չ����</td><td>SDKDEV_WLAN_DEVICE_LIST_EX </td></tr>
	 * <tr><td>SDK_DEV_ACC_POWEROFF_CFG</td><td>ACC�����¼�����	</td><td>SDKDEV_ACC_POWEROFF_CFG </td></tr>
	 * <tr><td>SDK_DEV_EXPLOSION_PROOF_CFG</td><td>�����б����¼�����</td><td>SDKDEV_EXPLOSION_PROOF_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG_EX</td><td>������չ����</td><td>SDKDEV_NET_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_LIGHTCONTROL_CFG</td><td>�ƹ��������	</td><td>SDKDEV_LIGHTCONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_3GFLOW_CFG</td><td>3G������Ϣ����	</td><td>SDKDEV_3GFLOW_INFO_CFG</td></tr> 
	 * <tr><td>SDK_DEV_IPV6_CFG</td><td>IPv6����	</td><td>SDKDEV_IPV6_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNMP_CFG</td><td>Snmp����	</td><td>SDKDEV_NET_SNMP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CONTROL_CFG</td><td>ץͼ�������� </td><td>SDKDEV_SNAP_CONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_GPS_MODE_CFGGPS</td><td>��λģʽ����</td><td>SDKDEV_GPS_MODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_UPLOAD_CFG</td><td>ͼƬ�ϴ�������Ϣ </td><td>SDKDEV_SNAP_UPLOAD_CFG </td></tr>
	 * <tr><td>SDK_DEV_SPEED_LIMIT_CFG</td><td>����������Ϣ </td><td>SDKDEV_SPEED_LIMIT_CFG </td></tr>
	 * <tr><td>SDK_DEV_ISCSI_CFG</td><td>iSCSI���� </td><td>SDKDEV_ISCSI_CFG </td></tr>
	 * <tr><td>SDK_DEV_WIRELESS_ROUTING_CFG</td><td>����·������ </td><td>SDKDEV_WIRELESS_ROUTING_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_CFG</td><td>����Χ������ </td><td>SDKDEV_ENCLOSURE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_VERSION_CFG</td><td>����Χ���汾������ </td><td>SDKDEV_ENCLOSURE_VERSION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RIAD_EVENT_CFG</td><td>Raid�¼����� </td><td>SDKDEV_RAID_EVENT_CFG </td></tr>
	 * <tr><td>SDK_DEV_FIRE_ALARM_CFG</td><td>�𾯱������� </td><td>SDKDEV_FIRE_ALARM_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_NAME_CFG</td><td>�������Ʊ������� </td><td>Name1&&name2&&name3...��ʽ�ַ��� </td></tr>
	 * <tr><td>SDK_DEV_URGENCY_RECORD_CFG</td><td>�����洢���� </td><td>SDKDEV_URGENCY_RECORD_CFG </td></tr>
	 * <tr><td>SDK_DEV_ELEVATOR_ATTRI_CFG</td><td>�������в�������</td><td>SDKDEV_ELEVATOR_ATTRI_CFG</td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG_EX</td><td>atm�������� </td><td>SDKDEV_ATM_OVERLAY_CONFIG_EX</td></tr>
	 * <tr><td>SDK_DEV_MACFILTER_CFGMAC</td><td>�������� </td><td>SDKDEV_MACFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_MACIPFILTER_CFG</td><td>MAC,IP����	</td><td>SDKDEV_MACIPFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_TIME_CFG</td><td>��������(���ܼƻ�)���� DHEDV_STREAM_ENCRYPT</td></tr>
	 * <tr><td>SDK_DEV_LIMIT_BIT_RATE_CFG</td><td>���������� </td><td>SDKDEV_LIMIT_BIT_RATE</td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG_EX</td><td>ץͼ���������չ </td><td>SDKDEV_SNAP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_DECODER_URL_CFG</td><td>������url���� </td><td>SDKDEV_DECODER_URL_CFG</td></tr>
	 * <tr><td>SDK_DEV_TOUR_ENABLE_CFG</td><td>��Ѳʹ������ </td><td>SDKDEV_TOUR_ENABLE_CFG</td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG_EX</td><td>wifi ap������չ </td><td>SDKDEV_VEHICLE_WIFI_AP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG_EX</td><td>����ͨ����ǰ�˱�������Ϣ��չ </td><td>DEV_ENCODER_CFG_EX</td></tr>
	 * </table>
	 * @param lChannel ͨ����,�����ȡȫ��ͨ������Ϊ0xFFFFFFFF,��������Ҫͨ����,�ò�����Ч 
	 * @param lpOutBuffer �������ݻ���ָ��
	 * @param lpBytesReturned ʵ���յ����ݵĳ��� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see GetLastError SetDevConfig
	 */
	public static native boolean       GetDevConfig(long lLoginID, int dwCommand, int lChannel, Object[] lpOutBuffer, Integer lpBytesReturned, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set device config info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param dwCommand set device config command , can look for GetDevConfig
	 * @param lChannel channel NO., if set all channel data to 0xFFFFFFFF,if command do not need chaneel No.,this parameter invalid 
	 * @param lpInBuffer data buffering pointer 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ����������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param dwCommand �豸������,��� GetDevConfig
	 * @param lChannel ͨ����,�����ȡȫ��ͨ������Ϊ0xFFFFFFFF,��������Ҫͨ����,�ò�����Ч 
	 * @param lpInBuffer ���ݻ���ָ�� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see GetLastError GetDevConfig
	 */
	public static native boolean       SetDevConfig(long lLoginID, int dwCommand, int lChannel, Object[] lpInBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search device channel name
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pChannelName  channel name buffering area(normally channel length is 32 bytes,here neees allocation>=16*32 byte buffering) 
	 * @param nChannelCount total channels 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸ͨ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pChannelName  ͨ����������(һ��ÿ��ͨ������32�ֽڳ�,���������>=16*32�ֽڳ��ȵĻ���) 
	 * @param nChannelCount ����������,(��λ�ֽ�)
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetupChannelName
	 */
	public static native boolean       QueryChannelName(long lLoginID, byte pChannelName[], Integer nChannelCount, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * change channel name
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pbuf  channel name buffering 
	 * @return true:success, false:failed
	 * \else
	 * �����豸ͨ������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pbuf  ͨ�����ƵĻ���
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see  Login QueryChannelName
	 */
	public static native boolean       SetupChannelName(long lLoginID, byte pbuf[]);
	
	/**
	 * \if ENGLISH_LANG
	 * ser image superposition(not channel name)
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelNo  image channel NO. 
	 * @param struOsdString subtitles content 
	 * @return true:success, false:failed
	 * \else
	 * �����豸ͨ���ַ�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelNo  ͼ��ͨ����
	 * @param struOsdString ��Ļ����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	public static native boolean       SetupChannelOsdString(long lLoginID, int nChannelNo, SDK_CHANNEL_OSDSTRING struOsdString);
	
	/**
	 * \if ENGLISH_LANG
	 * ser image superposition(not channel name)
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pDeviceTime  received device time pointer  
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸��ǰʱ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pDeviceTime  ���յ��豸ʱ��ָ��
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SetupDeviceTime
	 */
	public static native boolean       QueryDeviceTime(long lLoginID, NET_TIME pDeviceTime, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set device time
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pDeviceTime set device time pointer
	 * @return true:success, false:failed
	 * \else
	 * �����豸��ǰʱ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pDeviceTime ���õ��豸ʱ��ָ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryDeviceTime 
	 */
	public static native boolean       SetupDeviceTime(long lLoginID, NET_TIME pDeviceTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set device limit stream
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param wFlux limit stram to set
	 * @return true:success, false:failed
	 * \else
	 * �����豸��������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param wFlux Ҫ���õ���������
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetMaxFlux(long lLoginID, short wFlux);
	
	/**
	 * \if ENGLISH_LANG
	 * connect to DDNS server,search by device name IP
	 * @param pchDVRIP DDNSserver IP 
	 * @param wDVRPort DDNSserver port number 
	 * @param sDVRName device name to search
	 * @param sDVRSerialNumber  device serial number to search(currently not support,fill in 0) 
	 * @param sGetIP storage IP address pointer(allocation in application,32 byte long) 
	 * @return true:success, false:failed
	 * \else
	 * ͨ���豸���ֻ����豸���к���DDNS��������ѯ�豸IP
	 * @param pchDVRIP DDNS��������IP 
	 * @param wDVRPort DDNS�������Ķ˿ں�
	 * @param sDVRName ����ѯ���豸��
	 * @param sDVRSerialNumber  �豸���ĳ���,(��λ�ֽ�)
	 * @param sGetIP ����IP��ַ��ָ��( Ӧ�ó����з���,32�ֽڳ�) 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native boolean       GetDVRIPByResolveSvr(String pchDVRIP, short wDVRPort, byte sDVRName[], byte sDVRSerialNumber[], char sGetIP[]);
	
	/**
	 * \if ENGLISH_LANG
	 * asynchronism search IPC, NVS and etc in LAN, start to search device
	 * @param cbSearchDevices recall function
	 * @return successful return to handle,failed return to 0
	 * \else
	 * �첽������������IPC��NVS���豸
	 * @param cbSearchDevices �ص�����
	 * @return �ɹ����ؾ��,ʧ�ܷ���0
	 * \endif
	 * @see StopSearchDevices 
	 */
	public static native long          StartSearchDevices(CB_fSearchDevicesCB cbSearchDevices);
	/**
	 * \if ENGLISH_LANG
	 * stop asynchronously searching LAN internal IPC,NVS and etc.
	 * @param lSearchHandle {@link com.company.NetSDK.INetSDK#StartSearchDevices() StartSearchDevices}return value 
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ�첽������������IPC��NVS���豸
	 * @param lSearchHandle {@link com.company.NetSDK.INetSDK#StartSearchDevices() StartSearchDevices}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartSearchDevices
	 */
	public static native boolean       StopSearchDevices(long lSearchHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * modify the IP address of device without login.
	 * @param pDevNetInfo edit device's input structure info
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * �޸��豸IP 
	 * @param pDevNetInfo �޸��豸������ṹ����Ϣ 
	 * @param dwWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartSearchDevices StopSearchDevices 
	 */
	public static native boolean       ModifyDevice(DEVICE_NET_INFO_EX pDevNetInfo, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cross net search deviceIP
	 * @param pIpSearchInfo devicesearchinfo
	 * @param cbSearchDevices recallfunction
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ͨ��IP�����豸
	 * @param pIpSearchInfo �豸������Ϣ
	 * @param cbSearchDevices �ص�����
	 * @param dwWaitTime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SearchDevicesByIPs(DEVICE_IP_SEARCH_INFO pIpSearchInfo, CB_fSearchDevicesCB cbSearchDevices, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set snapshot recall function
	 * @param OnSnapRevMessage snapshot data recall function
	 * @return true:success, false:failed
	 * \else
	 * ����ץͼ�ص� 
	 * @param OnSnapRevMessage ץͼ���ݻص�����
	 * @return ��
	 * \endif
	 */
	public static native void          SetSnapRevCallBack(CB_fSnapRev OnSnapRevMessage);
	
	/**
	 * \if ENGLISH_LANG
	 * snapshot request
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param par snapshot parameter structure 
	 * @return true:success, false:failed
	 * \else
	 * ץͼ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param par ץͼ�ṹ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SnapPicture(long lLoginID, SNAP_PARAMS par);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading start return this operation handle, please note cannot fAttachBurnStateCB call function
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}return value 
	 * @param pstInParam  input parameter, see  NET_IN_FILEBURNED_START
	 * @param pstOutParam  output parameter, see NET_OUT_FILEBURNED_START
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * ��¼�ϴ���ʼ ���ش˴��ϴ��������, ע�ⲻ���� fAttachBurnStateCB �ص������������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pstInParam �������,���  NET_IN_FILEBURNED_START
	 * @param pstOutParam �������,��� NET_OUT_FILEBURNED_START
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native long          StartUploadFileBurned(long lLoginID, NET_IN_FILEBURNED_START pstInParam, NET_OUT_FILEBURNED_START pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading file, please note cannot fAttachBurnStateCB  call function
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned} return value  
	 * @return true:successful, false: failed 
	 * \else
	 * ��¼�ϴ��ļ�,ע�ⲻ���� fAttachBurnStateCB �ص������������
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartUploadFileBurned
	 */
	public static native boolean       SendFileBurned(long lUploadHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading stop, this port cannot fBurnFileCallBack  call function
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned} return value  
	 * @return true:successful, false: failed 
	 * \else
	 * ��¼�ϴ�ֹͣ,�˽ӿڲ����� fBurnFileCallBack �ص������е���
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartUploadFileBurned
	 */
	public static native boolean       StopUploadFileBurned(long lUploadHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Get writing status
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachBurnState() AttachBurnState} return value  
	 * @return true:successful, false: failed
	 * \else
	 * ��ȡ��¼״̬
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachBurnState() AttachBurnState}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see AttachBurnState
	 */
	public static native boolean       DetachBurnState(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Listen writing calibration status
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pstInParam input parameter,see NET_IN_ATTACH_BURN_CHECK
	 * @param pstOutParam output parameter,see NET_OUT_ATTACH_BURN_CHECK
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * ������¼У��״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pstInParam �������,��� NET_IN_ATTACH_BURN_CHECK
	 * @param pstOutParam �������,��� NET_OUT_ATTACH_BURN_CHECK
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see DetachBurnCheckState
	 */
	public static native long          AttachBurnCheckState(long lLoginID, NET_IN_ATTACH_BURN_CHECK pstInParam, NET_OUT_ATTACH_BURN_CHECK pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Cancel listening writing calibration status,
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState} return value  
	 * @return true:successful, false: failed 
	 * \else
	 * ȡ��������¼У��״̬,
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState}�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see AttachBurnCheckState
	 */
	public static native boolean       DetachBurnCheckState(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * search product definition
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuProdDef device profuct definition
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��Ʒ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pstuProdDef �豸��Ʒ����
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryProductionDefinition(long lLoginID, SDK_PRODUCTION_DEFNITION pstuProdDef, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search matrix card info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuCardInfo input parameter 
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�����ӿ���Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pstuCardInfo �������
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryMatrixCardInfo(long lLoginID, SDK_MATRIX_CARD_LIST pstuCardInfo, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search solicing capability
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannel output channel NO.
	 * @param pstuCaps channel splicing capability
	 * @param nWaitTime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�ָ�����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannel ���ͨ���� 
	 * @param pstuCaps ͨ���ָ�����
	 * @param nWaitTime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       GetSplitCaps(long lLoginID, int nChannel, SDK_SPLIT_CAPS pstuCaps, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search display source
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannel output channel NO. 
	 * @param nWindow windoe NO.
	 * @param pstuSplitSrc display source group number 
	 * @param pnRetCount returned display source quantity 
	 * @param nWaitTime  waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ��ʾԴ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannel ���ͨ����
	 * @param nWindow ���ں� 
	 * @param pstuSplitSrc ��ʾԴ����,�û������ڴ� 
	 * @param pnRetCount ���ص���ʾԴ����
	 * @param nWaitTime  �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       GetSplitSource(long lLoginID, int nChannel, int nWindow, SDK_SPLIT_SOURCE pstuSplitSrc[], Integer pnRetCount, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set display source
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannel output channel NO. 
	 * @param nWindow windoe NO. 
	 * @param pstuSplitSrc display source group 
	 * @param nSrcCount set display source quantity  
	 * @param nWaitTime  waiting time
	 * @return true:success, false:failed
	 * \else
	 * ������ʾԴ, ֧���������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannel ���ͨ����
	 * @param nWindow ���ں�
	 * @param pstuSplitSrc ��ʾԴ����
	 * @param nSrcCount ���õ���ʾԴ���� 
	 * @param nWaitTime  �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetSplitSource(long lLoginID, int nChannel, int nWindow, SDK_SPLIT_SOURCE pstuSplitSrc[], int nSrcCount, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search splicing mode
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannel output channel NO. 
	 * @param pstuSplitSrc splicing mode info
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�ָ�ģʽ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannel ���ͨ����
	 * @param pstuSplitSrc �ָ�ģʽ��Ϣ,�û������ڴ�
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       GetSplitMode(long lLoginID, int nChannel, SDK_SPLIT_MODE_INFO pstuSplitSrc, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set splicing mode
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannel output channel NO. 
	 * @param pstuSplitSrc  splicing mode info 
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ���÷ָ�ģʽ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannel ���ͨ����
	 * @param pstuSplitSrc  �ָ�ģʽ��Ϣ
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetSplitMode(long lLoginID, int nChannel, SDK_SPLIT_MODE_INFO pstuSplitSrc, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set window position
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam set window input 
	 * @param pOutParam set window output 
	 * @param nWaitTime wait 
	 * @return true:success, false:failed
	 * \else
	 * ���ô���λ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam ���ô���λ��������� 
	 * @param pOutParam ���ô���λ���������
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetSplitWindowRect(long lLoginID, SDK_IN_SPLIT_SET_RECT pInParam, SDK_OUT_SPLIT_SET_RECT pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam open input
	 * @param pOutParam open output
	 * @param nWaitTime wait
	 * @return true:success, false:failed
	 * \else
	 * ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �����������
	 * @param pOutParam �����������
	 * @param nWaitTime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see CloseSplitWindow 
	 */
	public static native boolean       OpenSplitWindow(long lLoginID, SDK_IN_SPLIT_OPEN_WINDOW pInParam, SDK_OUT_SPLIT_OPEN_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * receive PTZ device property
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param dwProtocolIndex PTZ protocol NO.,corresponding(SDKDEV_COMM_CFG)in structure DecProName subscript 
	 * @param lpOutBuffer return to PTZ property structure( PTZ_OPT_ATTR )buffering area 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ȡ��̨��Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param dwProtocolIndex ��̨Э���
	 * @param lpOutBuffer ������̨���Խṹ��( PTZ_OPT_ATTR )�Ļ����� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	public static native boolean 		GetPtzOptAttr(long lLoginID,int dwProtocolIndex, Object lpOutBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * close
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam parameter
	 * @param pOutParam parameter 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * �ش�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �ش��������
	 * @param pOutParam �ش��������
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see OpenSplitWindow 
	 */
	public static native boolean       CloseSplitWindow(long lLoginID, SDK_IN_SPLIT_CLOSE_WINDOW pInParam, SDK_OUT_SPLIT_CLOSE_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * sequence
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam set windoe input
	 * @param pOutParam set window output 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * ���ô��ڴ���
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam ���ͨ����
	 * @param pOutParam ���ں� 
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetSplitTopWindow(long lLoginID, SDK_IN_SPLIT_SET_TOP_WINDOW pInParam, SDK_OUT_SPLIT_SET_TOP_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get current window
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam get current window input 
	 * @param pOutParam get current window output 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * ��ȡ��ǰ��ʾ�Ĵ�����Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam ��ȡ��ǰ��ʾ�Ĵ�����Ϣ�������
	 * @param pOutParam ��ȡ��ǰ��ʾ�Ĵ�����Ϣ�������
	 * @param nWaitTime �ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       GetSplitWindowsInfo(long lLoginID, SDK_IN_SPLIT_GET_WINDOWS pInParam, SDK_OUT_SPLIT_GET_WINDOWS pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Power control
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam input parameter,see SDK_IN_WM_POWER_CTRL
	 * @param pOutParam output parameter,see SDK_OUT_WM_POWER_CTRL
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ��Դ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� SDK_IN_WM_POWER_CTRL
	 * @param pOutParam �������,��� SDK_OUT_WM_POWER_CTRL
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       PowerControl(long lLoginID, SDK_IN_WM_POWER_CTRL pInParam, SDK_OUT_WM_POWER_CTRL pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Load scheme
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam input parameter,see SDK_IN_WM_LOAD_COLLECTION
	 * @param pOutParam output parameter,see SDK_OUT_WM_LOAD_COLLECTION
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ����Ԥ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� SDK_IN_WM_LOAD_COLLECTION
	 * @param pOutParam �������,��� SDK_OUT_WM_LOAD_COLLECTION
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see SaveMonitorWallCollection
	 */
	public static native boolean       LoadMonitorWallCollection(long lLoginID, SDK_IN_WM_LOAD_COLLECTION pInParam, SDK_OUT_WM_LOAD_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Save scheme
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam input parameter,see SDK_IN_WM_SAVE_COLLECTION
	 * @param pOutParam output parameter,see SDK_OUT_WM_SAVE_COLLECTION
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ����Ԥ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� SDK_IN_WM_SAVE_COLLECTION
	 * @param pOutParam �������,��� SDK_OUT_WM_SAVE_COLLECTION
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see LoadMonitorWallCollection
	 */
	public static native boolean       SaveMonitorWallCollection(long lLoginID, SDK_IN_WM_SAVE_COLLECTION pInParam, SDK_OUT_WM_SAVE_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get TV wall scheme
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam input parameter,see SDK_IN_WM_GET_COLLECTIONS
	 * @param pOutParam output parameter,see SDK_OUT_WM_GET_COLLECTIONS
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ��ȡ����ǽԤ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� SDK_IN_WM_GET_COLLECTIONS
	 * @param pOutParam �������,��� SDK_OUT_WM_GET_COLLECTIONS
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       GetMonitorWallCollections(long lLoginID, SDK_IN_WM_GET_COLLECTIONS pInParam, SDK_OUT_WM_GET_COLLECTIONS pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme rename
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam input parameter,see SDK_IN_WM_RENAME_COLLECTION
	 * @param pOutParam output parameter,see SDK_OUT_WM_RENAME_COLLECTION
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ����ǽԤ��������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� SDK_IN_WM_RENAME_COLLECTION
	 * @param pOutParam �������,��� SDK_OUT_WM_RENAME_COLLECTION
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       RenameMonitorWallCollection(long lLoginID, SDK_IN_WM_RENAME_COLLECTION pInParam, SDK_OUT_WM_RENAME_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Upload file
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nTransType type as follows: 
	 * <table>
	 * <tr><td>enumeration type</td><td>meaning </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START </td><td>0x0000 ��start update file uploading(corresponding structure SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_SEND </td><td>0x0001send update file</td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_STOP </td><td>0x0002 stop sending update file</td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STOP</td><td>0x002B stop file uploading</td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>0x002C burned file upload</td></tr>
	 * </table>
	 * @param szInBuf nInBufLen is greater or equal to szInBuf structure size
	 * <table>
	 * <tr><td>enumeration type</td><td>represent meaning</td><td>szInBuf 
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>attached burned file upload</td><td>SDKDEV_BURNFILE_TRANS_CFG 
	 * <tr><td>SDK_DEV_FILETRANS_STOP</td><td>stop file uploading</td><td>LONG,detail as handle return after file upload 
	 * </table>
	 * @param dwUserData recall function,see follows 
	 * @param nWaitTime	overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * �ļ��ϴ��ӿ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nTransType �ӿڴ����ļ�����
	 * <table>
	 * <tr><td>ö������</td><td>���� </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START</td><td>0x0000 ��ʼ�����ļ��ϴ�(��Ӧ�ṹ�� SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_SEND</td><td>0x0001 ���������ļ� </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_STOP</td><td>0x0002 ֹͣ���������ļ� </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STOP 0x002B</td><td>ֹͣ�ļ��ϴ� </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN 0x002C</td><td>��¼�ļ��ϴ� </td></tr>
	 * </table>
	 * @param szInBuf nInBufLen���ڵ���szInBuf�ṹ��Ĵ�С
	 * <table>
	 * <tr><td>ö������</td><td>��ʾ����</td><td>szInBuf </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>������¼�ļ��ϴ� </td><td>SDKDEV_BURNFILE_TRANS_CFG </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STO</td><td>ֹͣ�ļ��ϴ�</td><td>LONG,����Ϊ��ʼ�ļ��ϴ��󷵻صľ�� </td></tr>
	 * </table>
	 * @param dwUserData �ص�����
	 * @param nWaitTime �ȴ���ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native long          FileTransmit(long lLoginID, int nTransType, char szInBuf[], CB_fTransFileCallBack dwUserData, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Set display source, support output parameter
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pInParam  input parameter,see NET_IN_SET_SPLIT_SOURCE
	 * @param pOutParam  output parameter, see NET_OUT_SET_SPLIT_SOURCE
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * ������ʾԴ, ֧���������
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pInParam �������,��� NET_IN_SET_SPLIT_SOURCE
	 * @param pOutParam �������,��� NET_OUT_SET_SPLIT_SOURCE
	 * @param nWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SetSplitSourceEx(long lLoginID, NET_IN_SET_SPLIT_SOURCE pInParam, NET_OUT_SET_SPLIT_SOURCE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Async device registration , nSpecCap = 0 as TCP method login,nSpecCap = 6 as login under main connection
	 * @param pchDVRIP  device IP 
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword username password
	 * @param nSpecCap device supported capacity
	 * @param pCapParam for nSpecCap  compensation parameter,nSpecCap = 2,pCapParam fill in device SN(mobile dvr login) 
	 * @param cbLogin async registration device call function
	 * @return true:successful, false: failed
	 * \else
	 * �첽���豸ע�� , nSpecCap = 0ΪTCP��ʽ�µĵ���,nSpecCap = 6Ϊֻ���������µĵ���
	 * @param pchDVRIP �豸IP 
	 * @param wDVRPort �豸�˿�
	 * @param pchUserName �û���
	 * @param pchPassword �û�����
	 * @param nSpecCap �豸֧�ֵ�����
	 * @param pCapParam ��nSpecCap �Ĳ������,nSpecCap = 2ʱ,pCapParam����豸���к��ִ�(����dvr��¼) 
	 * @param cbLogin �첽ע���豸�ص�����
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StopLogin
	 */
	
	public static native long          StartLogin(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int nSpecCap, String pCapParam, CB_fHaveLogin cbLogin);
	
	/**
	 * \if ENGLISH_LANG
	 * turn on real time monitoring
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID Real time monitoring channel number, \n
	 * if rType is RType_Multiplay retained the parameters.\n
	 * When rType is RType_Multiplay_1~RType_Multiplay_16, nChannelID determines the preview picture, \n
	 * such as when RType_Multiplay_4, channel 4 or 5 or 6 or 7 preview of fifth to seventh channels in the four picture preview 
	 * @param rType enumerated type, SDK_RealPlayType
	 * @param dwUser real time monitor data recall function
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ʵʱ����--ͬ���ӿ�, ��dwUser��Ҫͬʱʵ��fRealDataCallBackEx��fRealPlayDisConnect
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ʵʱ����ͨ����,���rTypeΪRType_Multiplay�ò���������rTypeΪRType_Multiplay_1~RType_Multiplay_16ʱ,nChannelID������Ԥ���Ļ���,�統RType_Multiplay_4ʱ,nChannelIDΪ4��5��6��7����һ��ֵ��ʾԤ����5����7ͨ�����Ļ���Ԥ��
	 * @param rType ö������,���  SDK_RealPlayType
	 * @param dwUser ʵʱ�������ݻص�����
	 * @param dwWaitTime ��ʱʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native long          StartRealPlay(long lLoginID, int nChannelID, int rType, Object dwUser, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search recorded or not on a certain day in a month
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelId channel NO. 
	 * @param nRecordFileType record file type 
	 * <table>
	 * <tr><td>0</td><td>all record file </td></tr>
	 * <tr><td>1</td><td>external alarm</td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm </td></tr>
	 * <tr><td>3</td><td>all alarms</td></tr>
	 * <tr><td>4</td><td>card No. search   </td></tr>
	 * <tr><td>5</td><td>group condition search</td></tr>
	 * </table> 
	 * @param tmMonth month  
	 * @param pchCardid card NO.(search type is card NO. search, valid, otherwise fill in NULL)
	 * @param pRecordStatus status info or not on a certain day in a month 
	 * @param waittime search overtime length 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯĳ�µĸ����Ƿ����¼���ļ�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelId ͨ����
	 * @param nRecordFileType ¼���ļ�����
	 * <table>
	 * <tr><td>0 </td><td>����¼���ļ�  </td></tr>
	 * <tr><td>1</td><td> �ⲿ���� </td></tr>
	 * <tr><td>2</td><td> ��̬��ⱨ�� </td></tr>
	 * <tr><td>3 </td><td>���б��� </td></tr>
	 * <tr><td>4</td><td> ���Ų�ѯ  </td></tr>
	 * <tr><td>5</td><td> ���������ѯ</td></tr>
	 * </table> 
	 * @param tmMonth �·� 
	 * @param pchCardid ����(��ѯ����Ϊ���Ų�ѯʱ��Ч,���������NULL) 
	 * @param pRecordStatus ĳ�µĸ����Ƿ����¼���״̬��Ϣ 
	 * @param waittime ��ʱʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryRecordStatus(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmMonth, String pchCardid, NET_RECORD_STATUS pRecordStatus, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * quickly search record file in certain interval, if exceends 16, then only the earliest 16 records are available for view
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelId channel ID,from 0 
	 * @param nRecordFileType record file type,as:\n
	 * 0 all record file   \n
	 * 1 external alarm \n
	 * 2 dynamic detection alarm \n
	 * 3 all alarms \n
	 * 4 card number search \n
	 * 5 group condition search\n
	 * 6 record location and shift length\n
	 * 8 search image by card NO.(currently only HB-U and NVS special model support)\n
	 * 9 search image(currently only HB-U and NVS special model support) \n
	 * 10 search by text \n
	 * 15 return network data structure\n
	 * 16 search all transparent serial data record files
	 * @param time_start record start time 
	 * @param time_end record end time 
	 * @param cardid card No.,only for card NO. search,others fill in NULL 
	 * @param fileinfo returned record file info, is oneLPNET_RECORDFILE_INFOstructure group 
	 * @param filecount returned file number,as output parameter up to records when at full buffering;
	 * @param waittime waiting time 
	 * @param bTime search by time or not(invlid now)
	 * @return true:success, false:failed
	 * \else
	 * ���ٲ�ѯʱ����ڵ�¼���ļ�,���ʱ�����¼�񳬹�16��ʱ,ֻ����ʱ�������16��¼��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelId ͨ��ID,��0��ʼ
	 * @param nRecordFileType ¼���ļ�����\n
	 * 0 ����¼���ļ�  \n
	 * 1 �ⲿ���� \n
	 * 2 ��̬��ⱨ�� \n
	 * 3 ���б��� \n
	 * 4 ���Ų�ѯ  \n
	 * 5 ���������ѯ\n
	 * 6 ¼��λ����ƫ��������\n
	 * 8 �����Ų�ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��)\n
	 * 9 ��ѯͼƬ(Ŀǰ��HB-U��NVS�����ͺŵ��豸֧��)\n
	 * 10 ���ֶβ�ѯ \n
	 * 15 �����������ݽṹ(��������) \n
	 * 16 ��ѯ����͸��������¼���ļ� 
	 * @param time_start ¼��ʼʱ��
	 * @param time_end ¼�����ʱ��
	 * @param cardid ����,ֻ��Կ��Ų�ѯ��Ч,��������¿�����NULL 
	 * @param fileinfo ���ص�¼���ļ���Ϣ,��һ��LPNET_RECORDFILE_INFO�ṹ����
	 * @param filecount ���ص��ļ�����,��������������ֻ�ܲ鵽������Ϊֹ��¼���¼
	 * @param waittime �ȴ�ʱ��  
	 * @param bTime �Ƿ�ʱ���(Ŀǰ��Ч)
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login PlayBackByRecordFile PlayBackByRecordFileEx PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack
	 */
	public static native boolean       QuickQueryRecordFile(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME time_start, NET_TIME time_end, 
            												String cardid, NET_RECORDFILE_INFO fileinfo[], Integer filecount, int waittime, boolean bTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search the earliest record time
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nRecordFileType record type, QueryRecordFile
	 * @param pchCardid card NO. search valid for card No. only,other searchs fill in NULL  
	 * @param pFurthrestTime return to the earliest record info structure 
	 * @param nWaitTime overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ����¼��ʱ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nRecordFileType ¼������,��� QueryRecordFile
	 * @param pchCardid ����,ֻ��Կ��Ų�ѯ��Ч,��������¿�����NULL 
	 * @param pFurthrestTime ��������¼����Ϣ�ṹ�� 
	 * @param nWaitTime ��ʱʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see QueryRecordFile
	 */
	public static native boolean       QueryFurthestRecordTime(long lLoginID, int nRecordFileType, String pchCardid, NET_FURTHEST_RECORD_TIME pFurthrestTime, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * According to the file playback of video, support for wait sync playback request command, i.e. in until the device information, interface will return results, while adding a callback function callback the playback process interrupt event information
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lpRecordFile record file info 
	 * @param cbDownLoadPos progress recall parameter
	 * @param fDownLoadDataCallBack  data recall function
	 * @param fDisConnectCallBack video monitoring disconnect recall function
	 * @param dwWaitTime waiting time 
	 * @return successful return to net playback ID,failed return to 0
	 * \else
	 * ���ļ���ʽ�ط�--�ص��ط��ж��¼�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param lpRecordFile ¼���ļ���Ϣ
	 * @param cbDownLoadPos ���Ȼص�����
	 * @param fDownLoadDataCallBack  ���ݻص�����
	 * @param fDisConnectCallBack ��Ƶ���ӶϿ��ص�����
	 * @param dwWaitTime �ȴ�ʱ�� 
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native long          StartPlayBackByRecordFile(long lLoginID, NET_RECORDFILE_INFO lpRecordFile, CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, CB_fRealPlayDisConnect fDisConnectCallBack, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * By the time the pattern playback, support for wait sync playback request command, i.e. in until the device information, interface will return results, while adding a callback function callback the playback process interrupt event information
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID image channel NO.,must be appointed 
	 * @param lpStartTime start time 
	 * @param lpStopTime end time 
	 * @param cbDownLoadPos progress recall user parameter
	 * @param fDownLoadDataCallBack  data recall function
	 * @param fDisConnectCallBack  video monitoring disconnect recall function explanation 
	 * @param dwWaitTime waiting time 
	 * @return successful return to net playback ID, failed return to 0
	 * \else
	 * ��ʱ�䷽ʽ�ط�--�ص��ط��ж��¼�
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͼ��ͨ����,����ָ��
	 * @param lpStartTime ��ʼʱ��
	 * @param lpStopTime ����ʱ��
	 * @param cbDownLoadPos ���Ȼص��û�����
	 * @param fDownLoadDataCallBack  ���ݻص�����
	 * @param fDisConnectCallBack  ��Ƶ���ӶϿ��ص�����
	 * @param dwWaitTime �ȴ�ʱ��
	 * @return �ɹ���������ط�ID,ʧ�ܷ���0
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack FramCotrolPlayBackByTime
	 */
	public static native long          StartPlayBackByTime(long lLoginID, int nChannelID, NET_TIME lpStartTime, NET_TIME lpStopTime, 
			CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, CB_fRealPlayDisConnect fDisConnectCallBack, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Video compreseed file playback 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param lpRecordFile input parameter,see NET_SYNOPSISFILE_INFO
	 * @param cbDownLoadPos call progress call function
	 * @param fDownLoadDataCallBack playback data call function
	 * @param dwUser user info
	 * @return true:successful, false: failed 
	 * \else
	 * ��ƵŨ���ļ��ط� 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param lpRecordFile �������,��� NET_SYNOPSISFILE_INFO
	 * @param cbDownLoadPos �طŽ��Ȼص�����
	 * @param fDownLoadDataCallBack �ط����ݻص�����
	 * @param dwUser �û���Ϣ
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native long          PlayBackBySynopsisFile(long lLoginID, NET_SYNOPSISFILE_INFO lpRecordFile, CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, Object dwUser);
	
	/**
	 * \if ENGLISH_LANG
	 * search extra stream channel record status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pRSBuffer record status buffering area,total length must be no lower than total channels. return value meaning as follows:
	 * <table>
	 * <tr><td>value</td><td>meaning</td></tr> 
	 * <tr><td>0</td><td>not record</td></tr> 
	 * <tr><td>1</td><td>manually record</td></tr> 
	 * <tr><td>2</td><td>auto record </td></tr>
	 * </table>
	 * @param nRSBufferlen return pRSBuffer buffering record status info length,each channel as 1 byte 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ���������ͨ��¼��״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param pRSBuffer ¼��״̬������,�ܳ��Ȳ���С��ͨ����
	 * <table>
	 * <tr><td>��ֵ</td><td>���� </td></tr>
	 * <tr><td>0</td><td>Ϊ��¼�� </td></tr>
	 * <tr><td>1</td><td>�ֶ�¼�� </td></tr>
	 * <tr><td>2</td><td>Ϊ�Զ�¼�� </td></tr>
	 * </table>
	 * @param nRSBufferlen ����pRSBuffer������¼��״̬��Ϣ����,ÿһ��ͨ��Ϊ1���ֽ� 
	 * @param waittime �ȴ�ʱ��  
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryExtraRecordState(long lLoginID, byte pRSBuffer[], Integer nRSBufferlen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * Search remote device status
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param nType search type
	 * <table>
	 * <tr><td>Value</td><td>record file type </td></tr>
	 * <tr><td>0</td><td>All record files </td></tr>
	 * <tr><td>1</td><td>External alarm </td></tr>
	 * <tr><td>2</td><td>Motion detection alarm </td></tr>
	 * <tr><td>3</td><td>All alarms </td></tr>
	 * <tr><td>4</td><td>Card search </td></tr>
	 * <tr><td>5</td><td>Combined filter </td></tr>
	 * </table>
	 * @param nChannelID  Channel no.
	 * @param pRSBuffer Output parameter, corresponding to search type
	 * @param pRetLen  output content length
	 * @param waittime  waiting time 
	 * @return true:successful, false: failed 
	 * \else
	 * ��ѯԶ���豸״̬
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nType ��ѯ����
	 * <table>
	 * <tr><td>��ֵ</td><td>¼���ļ����� </td></tr>
	 * <tr><td>0</td><td>����¼���ļ�  </td></tr>
	 * <tr><td>1</td><td>�ⲿ���� </td></tr>
	 * <tr><td>2</td><td>��̬��ⱨ�� </td></tr>
	 * <tr><td>3</td><td>���б��� </td></tr>
	 * <tr><td>4</td><td>���Ų�ѯ  </td></tr>
	 * <tr><td>5</td><td>���������ѯ </td></tr>
	 * </table>
	 * @param nChannelID ͨ����
	 * @param pRSBuffer �������,���ѯ���Ͷ�Ӧ
	 * @param pRetLen ������ݳ���
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       QueryRemotDevState(long lLoginID, int nType, int nChannelID, Object pRSBuffer, Integer pRetLen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search system info, different info have different data structure
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nSystemType search capacity type,as:
	 * <table>
	 * <tr><td>definition</td><td>capacity type</td><td>pSysInfoBuffer corresponding structure</td></tr>
	 * <tr><td>ABILITY_DYNAMIC_CONNECT</td><td>search dynamic multiple connection capacity</td><td>return one BOOL type,TRUE is support,FALSE is not support</td></tr>
	 * <tr><td>ABILITY_WATERMARK_CFG</td><td>water mark config capacity</td><td>SDK_WATERMAKE_EN </td></tr>
	 * <tr><td>ABILITY_WIRELESS_CFG	</td><td>wireless config capacity</td><td>SDK_WIRELESS_EN </td></tr>
	 * <tr><td>ABILITY_DEVALL_INFO</td><td>device capacity list </td><td>SDK_DEV_ENABLE_INFO </td></tr>
	 * <tr><td>ABILITY_CARD_QUERY</td><td>card No. search capacity</td><td>SDK_CARD_QUERY_EN </td></tr>
	 * <tr><td>ABILITY_MULTIPLAY</td><td>multi-window preview capacity</td><td>SDK_MULTIPLAY_EN </td></tr>
	 * <tr><td>ABILITY_QUICK_QUERY_CFG</td><td>quick search config capacity</td><td>SDK_QUICK_QUERY_CFG_EN </td></tr>
	 * <tr><td>ABILITY_INFRARED</td><td>wireless alarm capacity</td><td>SDK_WIRELESS_ALARM_INFO </td></tr>
	 * <tr><td>ABILITY_TRIGGER_MODE</td><td>alarm output trigger method capacity</td><td>return one int type.0 is support,<0 is not support</td></tr>
	 * <tr><td>ABILITY_DISK_SUBAREA</td><td>network hard disk segmentation capacity</td><td>SDK_DISK_SUBAREA_EN </td></tr>
	 * <tr><td>ABILITY_DSP_CFG</td><td>network DSP capacity</td><td>SDK_DSP_CFG </td></tr>
	 * <tr><td>ABILITY_STREAM_MEDIA</td><td>search SIP,RTSP capacity</td><td>SDK_STREAM_MEDIA_EN </td></tr>
	 * <tr><td>ABILITY_INTELLI_TRACKER</td><td>search intelligent tracking capacity</td><td>SDK_INTELLI_TRACKER_EN </td></tr>
	 * </table>
	 * @param pSysInfoBuffer received protocol buffering area 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ѯϵͳ������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nSystemType ��ѯ��������
	 * <table>
	 * <tr><td>����</td><td>��������	</td><td>pSysInfoBuffer��Ӧ�ṹ�� </td></tr>
	 * <tr><td>ABILITY_DYNAMIC_CONNECT</td><td>��ѯ��̬����������</td><td>����һ��BOOL����,TRUE��ʾ֧��,FALSE��ʾ��֧�� </td></tr>
	 * <tr><td>ABILITY_WATERMARK_CFG</td><td>ˮӡ��������</td><td>SDK_WATERMAKE_EN </td></tr>
	 * <tr><td>ABILITY_WIRELESS_CFG</td><td>wireless��������</td><td>SDK_WIRELESS_EN </td></tr>
	 * <tr><td>ABILITY_DEVALL_INFO</td><td>�豸�������б� </td><td>SDK_DEV_ENABLE_INFO </td></tr>
	 * <tr><td>ABILITY_CARD_QUERY</td><td>���Ų�ѯ����</td><td>SDK_CARD_QUERY_EN </td></tr>
	 * <tr><td>ABILITY_MULTIPLAY</td><td>�໭��Ԥ������ </td><td>SDK_MULTIPLAY_EN </td></tr>
	 * <tr><td>ABILITY_QUICK_QUERY_CFG</td><td>���ٲ�ѯ��������  </td><td>SDK_QUICK_QUERY_CFG_EN </td></tr>
	 * <tr><td>ABILITY_INFRARED</td><td>���߱�������</td><td>SDK_WIRELESS_ALARM_INFO </td></tr>
	 * <tr><td>ABILITY_TRIGGER_MODE</td><td>�������������ʽ���� </td><td>����һ��int����,0��ʾ֧��,<0��ʾ��֧�� </td></tr>
	 * <tr><td>ABILITY_DISK_SUBAREA</td><td>����Ӳ�̷�������</td><td>SDK_DISK_SUBAREA_EN </td></tr>
	 * <tr><td>ABILITY_DSP_CFG</td><td>����DSP���� </td><td>SDK_DSP_CFG </td></tr>
	 * <tr><td>ABILITY_STREAM_MEDIA</td><td>��ѯSIP,RTSP����  </td><td>SDK_STREAM_MEDIA_EN </td></tr>
	 * <tr><td>ABILITY_INTELLI_TRACKER</td><td>��ѯ���ܸ�������</td><td>SDK_INTELLI_TRACKER_EN </td></tr>
	 * </table>
	 * @param pSysInfoBuffer ���յ�Э�黺����
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see Login
	 */
	
	public static native boolean       QuerySystemInfo(long lLoginID, int nSystemType, Object pSysInfoBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search system capacity info,by character string format
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param szCommand command parameter,as ParseData
	 * @param nChannelID channel number 
	 * @param szOutBuffer received protocol buffering area 
	 * @param error wrong number \n
	 * 0 successful\n
	 * 1 failed \n
	 * 2 illegal data \n
	 * 3 temporarily not available \n
	 * 4 not authorized 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * ��ϵͳ������ѯ�ӿ�,��ѯϵͳ������Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param szCommand �������,��� ParseData
	 * @param nChannelID ͨ����
	 * @param szOutBuffer ���յ�Э�黺����
	 * @param error �����\n
	 * 0 �ɹ� \n
	 * 1 ʧ�� \n
	 * 2 ���ݲ��Ϸ� \n
	 * 3 ��ʱ�޷����� \n
	 * 4 û��Ȩ�� 
	 * @param waittime �ȴ�ʱ�� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see ParseData 
	 */
	public static native boolean       QueryNewSystemInfo(long lLoginID, String szCommand, int nChannelID, char szOutBuffer[], Integer error, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set net update program for front end device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType enumeration value,as: EM_UPGRADE_TYPE
	 * @param pchFileName need to update file name	
	 * @param cbUpgrade update progress recall function
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * ��ʼ�����豸����--��չ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType ö��ֵ,���  EM_UPGRADE_TYPE
	 * @param pchFileName Ҫ�������ļ��� 	
	 * @param cbUpgrade �������Ȼص�����
	 * @return �ɹ������������ID,ʧ�ܷ���0
	 * \endif
	 * @see SendUpgrade StopUpgrade
	 */
	public static native long          StartUpgradeEx(long lLoginID, int emType, String pchFileName, CB_fUpgradeCallBack cbUpgrade);
	
	/**
	 * \if ENGLISH_LANG
	 * search LAN device
	 * @param szBuf user open up buffering,used in receiving DEVICE_NET_INFO structure,search out several devices,and return these structures 
	 * @param nRetNum szBuf buffering length 
	 * @param dwSearchTime search waiting time 
	 * @return true:success, false:failed
	 * \else
	 * ������������IPC��NVS���豸
	 * @param szBuf �û����ٻ���,��������DEVICE_NET_INFO�ṹ��,��ѯ�������豸,�ͷ��ؼ��������Ľṹ�� 
	 * @param nRetNum szBuf���泤��
	 * @param dwSearchTime ��ѯ�ȴ�ʱ��
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SearchDevices(DEVICE_NET_INFO szBuf[], Integer nRetNum, int dwSearchTime);
	
	/**
	 * \if ENGLISH_LANG
	 * snapshot request extention interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param par
	 * @return true:success, false:failed
	 * \else
	 * ץͼ����
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param par
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean       SnapPictureEx(long lLoginID, SNAP_PARAMS par);
	
	/**
	 * \if ENGLISH_LANG
	 * real time upload intelligent analyasis data��image
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO. 
	 * @param dwAlarmType alarm type, CB_fAnalyzerDataCallBack
	 * @param cbAnalyzerData  intelligent data analysis recall function
	 * @return intelligent data analysis recall function 
	 * \else
	 * ʵʱ�ϴ����ܷ������ݣ�ͼƬ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����
	 * @param dwAlarmType ��������, �μ� CB_fAnalyzerDataCallBack
	 * @param cbAnalyzerData  �������ݷ����ص�����
	 * @return ʧ�ܷ���0,�ɹ������ϴ����,����Ϊ��غ����Ĳ���
	 * \endif
	 * @see StopLoadPic
	 */
	public static native long          RealLoadPicture(long lLoginID, int nChannelID, int dwAlarmType, CB_fAnalyzerDataCallBack cbAnalyzerData);
	
	/**
	 * \if ENGLISH_LANG
	 * search file by criteria
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType mediafile search criteria 
	 * @param pQueryCondition criteria 
	 * @param waittime waiting time 
	 * @return successful return to search handle,failed return to 0. 
	 * \else
	 * ��ʼ����¼���ļ�������ֵ 0 ʧ��, >0 ���Ҿ��
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType media�ļ���ѯ����
	 * @param pQueryCondition ��ѯ����
	 * @param waittime �ȴ�ʱ�� 
	 * @return �ɹ����ز�ѯ���,ʧ�ܷ���0
	 * \endif
	 * @see Login FindNextFileEx FindCloseEx
	 */
	public static native long          FindFileEx(long lLoginID, int emType, Object pQueryCondition, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search media file
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFileEx() FindFileEx} return value
	 * @param emType mediafile search criteria
	 * @param pMediaFileInfo file record buffering, to export searched media file records
	 * @param waittime waiting time 
	 * @return return value as info items of searched media file return value lower than nFilecount as completion of file search in corresponding time interval. 
	 * \else
	 * ����¼���ļ�������ֵ :�ļ����� < nFilecount ��ѯ����
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFileEx() FindFileEx}�ķ���ֵ 
	 * @param emType ��Ҫ��ѯ������
	 * @param pMediaFileInfo �ļ���¼����,���������ѯ����ý���ļ���¼
	 * @param waittime �ȴ�ʱ�� 
	 * @return ����ֵΪ��ѯ����ý���ļ���Ϣ���� ����ֵС��nFilecount����Ӧʱ����ڵ��ļ���ѯ���
	 * \endif
	 * @see FindFileEx
	 */
	public static native int           FindNextFileEx(long lFindHandle, int emType, Object pMediaFileInfo[], int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * download designated intelligent analysis data
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType  mediafile search criteria
	 * @param lpMediaFileInfo  media file info, in structure MEDIAFILE_TRAFFICCAR_INFO 
	 * @param sSavedFileName  file name to save 
	 * @param cbDownLoadPos download recall function
	 * @return download function handle
	 * \else
	 * ����ָ�������ܷ������� - ͼƬ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param emType  ��ѯ����
	 * @param lpMediaFileInfo  ý���ļ���Ϣ,�����ǽṹ��  MEDIAFILE_TRAFFICCAR_INFO 
	 * @param sSavedFileName  �ļ��������� 
	 * @param cbDownLoadPos ���ػص����� 
	 * @return ���غ������
	 * \endif
	 * @see StopDownloadMediaFile
	 */
	public static native long          DownloadMediaFile(long lLoginID, int emType, Object lpMediaFileInfo, String sSavedFileName, CB_fDownLoadPosCallBack cbDownLoadPos);
	
	/**
	 * \if ENGLISH_LANG
	 * traffic snapshot--net trigger method
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO.
	 * @param pstInParam snapshot parameter
	 * @param pstOutParam snapshot return value
	 * @return true:success, false:failed
	 * \else
	 * ��ͨץ��--���紥����ʽ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nChannelID ͨ����
	 * @param pstInParam ץ�Ĳ���
	 * @param pstOutParam ץ�ķ���ֵ 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		TrafficSnapByNetwork(long lLoginID, int nChannelID, NET_IN_SNAPSHOT pstInParam, NET_OUT_SNAPSHOT pstOutParam);
	
	/**
	 * \if ENGLISH_LANG
	 * traffic snapshot--net trigger method
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nQueryType 		Query Type
	 * @param InObject 			Query In Param
	 * @param OutObject  		Query Out Param
	 * @param ReservedObject    Query Reserved Param
	 * @return true:success, false:failed
	 * \else
	 * ��ѯ�豸��Ϣ
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ���� {@link com.company.NetSDK.INetSDK#Login() Login}�ķ���ֵ 
	 * @param nQueryType 		��ѯ����
	 * @param InObject 			��ѯ�������
	 * @param OutObject  		��ѯ�������
	 * @param ReservedObject	��������
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	public static native boolean 		 	QueryDevInfo(long lLoginID, int nQueryType, Object InObject , Object OutObject, Object ReservedObject  , int nWaitTime );
	
	/**
	 * \if ENGLISH_LANG
	 * start local recording function,recording collected audio data via CLIENT_StartTalkEx recall user,corresponding operation is RecordStop
	 * @return true:success, false:failed
	 * \else
	 * ��������¼������,¼���ɼ���������Ƶ����ͨ�� StartTalkEx �Ļص������ص����û�,��Ӧ������ RecordStop
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see StartTalkEx RecordStop
	 */
	
	public static native boolean		RecordStart();
	/**
	 * \if ENGLISH_LANG
	 * stop local recording,corresponding operation is RecordStart
	 * @return true:success, false:failed
	 * \else
	 * ֹͣ����¼��,��Ӧ������RecordStart
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 * @see RecordStart
	 */
	
	public static native boolean 		RecordStop();
	
	public static native boolean        GetDevCaps(long lLoginID, int nType, NET_IN_ENCODE_CFG_CAPS pInBuf, NET_OUT_ENCODE_CFG_CAPS pOutBuf, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * @param pAudioDataBuf Ҫ��������Ƶ��������
	 * @return true:success, false:failed
	 * \else
	 * ���������Ƶ���ݽ��н���
	 * @param pAudioDataBuf Ҫ��������Ƶ��������
	 * @return ��
	 * \endif
	 */
	
	public static native void 			AudioDec(byte[] pAudioDataBuf);
	/**
	 * \if ENGLISH_LANG
	 * @param src ��������
	 * @param dest ����������
	 * @param srclen �������ݳ��� 
	 * @return true:success, false:failed
	 * \else
	 * �����ɼ�����б���
	 * @param src ��������
	 * @param dest ����������
	 * @param srclen �������ݳ��� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */
	
	public static native int           g711aEncode(byte src[], byte dest[], int srclen);
	
	/**
	 * \if ENGLISH_LANG
	 * @param src ��������
	 * @param dest ����������
	 * @param srclen �������ݳ��� 
	 * @return true:success, false:failed
	 * \else
	 * �����ɼ�����б���
	 * @param src ��������
	 * @param dest ����������
	 * @param srclen �������ݳ��� 
	 * @return true:�ɹ�, false:ʧ��
	 * \endif
	 */

	public static native int           g711uEncode(byte src[], byte dest[], int srclen);
	
	public static native long          AttachVTPCallState(long lLoginID, NET_IN_VTP_CALL_STATE_ATTACH pInParam, CB_fVTPCallStateCallBack dwAttachCb, NET_OUT_VTP_CALL_STATE_ATTACH pOutParam, int nWaitTime);
	
	public static native boolean       DetachVTPCallState(long lCallStateHandle);
	
	public static native boolean       MatrixGetCameras(long lLoginID, SDK_IN_MATRIX_GET_CAMERAS pInParam, SDK_OUT_MATRIX_GET_CAMERAS pOutParam, int nWaitTime);
	
	public static native boolean       LogOpen(LOG_SET_PRINT_INFO pstLogPrintInfo);
	
	public static native boolean       LogClose();
	
	public static native boolean       SetMobilePushNotify(long lLoginID, NET_MOBILE_PUSH_NOTIFY pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	public static native boolean       DelMobilePushNotify(long lLoginID, NET_MOBILE_PUSH_NOTIFY_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);
	
	public static native boolean       SetMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	public static native boolean       DelMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);
}

package com.company.NetSDK;

public class INetSDK
{
	static {
		LoadLibrarys();
	}
	public static void LoadLibrarys() {
		try {
			String strOSType =  System.getProperty("os.name");
			if (strOSType.contains("Window")) {
				System.loadLibrary("dhconfigsdk");
				System.loadLibrary("dhnetsdk");
				System.loadLibrary("jninetsdk");
			} else {
				String strVendor =  System.getProperty("java.vm.specification.vendor");
				if (strVendor.contains("Android")) {
					/*System.loadLibrary("json");
		    		System.loadLibrary("Infra");
		    		System.loadLibrary("Stream");
		    		System.loadLibrary("NetFramework");
		    		System.loadLibrary("StreamSvr");
		    		System.loadLibrary("avnetsdk");*/
		    		System.loadLibrary("netsdk");
		    		System.loadLibrary("configsdk");
		    		System.loadLibrary("jninetsdk");
				} else {
					System.loadLibrary("dhconfigsdk");
					System.loadLibrary("dhnetsdk");
					System.loadLibrary("jninetsdk");
				}
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
	 * 3uJ<;/SDK, TZKySP5DSDK:/J}V.G05wSC
	 * @param cbDisConnect 6TOsJ5OV=S?ZCB_fDisConnect
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see Cleanup
	 */
	public static native boolean 		Init(CB_fDisConnect cbDisConnect);
	
	/**
	 * \if ENGLISH_LANG
	 * empty SDK, release occupied resource,call after all SDK functions
	 * @return 
	 * \else
	 * Ge?USDK, JM7EU<SC5DWJT4,TZKySP5DSDK:/J}V.:s5wSC
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
	 * IhVC6OO_VXA,3I9&;X5w:/J},IhVC:sSDKDZ2?6OO_WT6/VXA,
	 * @param cbAutoConnect 6OO_VXA,3I9&5D;X5w:/J} CB_fHaveReConnect
	 * \endif
	 */ 
	public static native void 			SetAutoReconnect(CB_fHaveReConnect cbAutoConnect);
	
	/**
	 * \if ENGLISH_LANG
	 * Dynamic sub-set link disconnected callback function, the current monitoring and playback equipment SVR is a short connection
	 * @param cbSubDisConnect sub disconnection recall function CB_fSubDisConnect
	 * \else
	 * IhVC6/L,WSA,=S6OO_;X5w:/J},D?G0SVRIh185D<`JS:M;X7EJG6LA,=S5D
	 * @param cbSubDisConnect 6TOsJ5OV=S?Z CB_fSubDisConnect
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
	 * 75;X:/J}V4PPJ'0\4zBk,TZ=S?Z5wSCJ'0\J1J9SC,8y>];q5C5DV5@4H76(5wSC3v4mT-Rr
	 * @return 75;X4mNs4zBk,8qJ=N*#:0x80000000|x
	 * <table>
	 * <tr><td>@`PM</td><td>J}V5 </td><td>4z1m:,Re </td></tr>
	 * <tr><td>NET_NOERROR</td><td>0</td><td>C;SP4mNs</td></tr> 
	 * <tr><td>NET_ERROR</td><td>-1</td><td>N4V*4mNs</td></tr> 
	 * <tr><td>NET_SYSTEM_ERROR</td><td>_EC(1)</td><td>WindowsO5M33v4m</td></tr> 
	 * <tr><td>NET_NETWORK_ERROR</td><td>_EC(2)</td><td>MxBg4mNs</td></tr> 
	 * <tr><td>NET_DEV_VER_NOMATCH</td><td>_EC(3)</td><td>Ih18P-Ri2;F%Ed </td></tr>
	 * <tr><td>NET_INVALID_HANDLE</td><td>_EC(4)</td><td>>d1zN^P' </td></tr>
	 * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>_EC(5)</td><td>4r?*M(5@J'0\</td></tr> 
	 * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>_EC(6)</td><td>9X1UM(5@J'0\</td></tr> 
	 * <tr><td>NET_ILLEGAL_PARAM</td><td>_EC(7)</td><td>SC;'2NJ}2;:O7( </td></tr>
	 * <tr><td>NET_SDK_INIT_ERROR</td><td>_EC(8)</td><td>SDK3uJ<;/3v4m</td></tr> 
	 * <tr><td>NET_SDK_UNINIT_ERROR</td><td>_EC(9)</td><td>SDKGe@m3v4m</td></tr> 
	 * <tr><td>NET_RENDER_OPEN_ERROR</td><td>_EC(10)</td><td>IjGkrenderWJT43v4m</td></tr> 
	 * <tr><td>NET_DEC_OPEN_ERROR</td><td>_EC(11)</td><td>4r?*=bBk?b3v4m</td></tr> 
	 * <tr><td>NET_DEC_CLOSE_ERROR</td><td>_EC(12)</td><td>9X1U=bBk?b3v4m</td></tr> 
	 * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>_EC(13)</td><td>6`;-CfT$@@VP<l2b5=M(5@J}N*0</td></tr> 
	 * <tr><td>NET_TALK_INIT_ERROR</td><td>_EC(14)</td><td>B<Rt?b3uJ<;/J'0\</td></tr> 
	 * <tr><td>NET_TALK_NOT_INIT</td><td>_EC(15)</td><td>B<Rt?bN4>-3uJ<;/ </td></tr>
	 * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>_EC(16)</td><td>7"KMRtF5J}>]3v4m</td></tr> 
	 * <tr><td>NET_REAL_ALREADY_SAVING</td><td>_EC(17)</td><td>J5J1J}>]RQ>-4&SZ1#4fW4L, </td></tr>
	 * <tr><td>NET_NOT_SAVING</td><td>_EC(18)</td><td>N41#4fJ5J1J}>]</td></tr> 
	 * <tr><td>NET_OPEN_FILE_ERROR</td><td>_EC(19)</td><td>4r?*ND<~3v4m</td></tr> 
	 * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>_EC(20)</td><td>Ft6/TFL(?XVF6(J1FwJ'0\</td></tr> 
	 * <tr><td>NET_RETURN_DATA_ERROR</td><td>_EC(21)</td><td>6T75;XJ}>]5DP#Qi3v4m</td></tr> 
	 * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>_EC(22)</td><td>C;SPWc9;5D;:4f </td></tr>
	 * <tr><td>NET_NOT_SUPPORTED</td><td>_EC(23)</td><td>51G0SDKN4V'3V8C9&D\ </td></tr>
	 * <tr><td>NET_NO_RECORD_FOUND</td><td>_EC(24)</td><td>2iQ/2;5=B<Os </td></tr>
	 * <tr><td>NET_NOT_AUTHORIZED</td><td>_EC(25)</td><td>N^2YWwH(O^ </td></tr>
	 * <tr><td>NET_NOT_NOW</td><td>_EC(26)</td><td>T]J1N^7(V4PP </td></tr>
	 * <tr><td>NET_NO_TALK_CHANNEL</td><td>_EC(27)</td><td>N47"OV6T=2M(5@ </td></tr>
	 * <tr><td>NET_NO_AUDIO</td><td>_EC(28)</td><td>N47"OVRtF5 </td></tr>
	 * <tr><td>NET_NO_INIT</td><td>_EC(29)</td><td>MxBgSDKN4>-3uJ<;/ </td></tr>
	 * <tr><td>NET_DOWNLOAD_END</td><td>_EC(30)</td><td>OBTXRQ=aJx </td></tr>
	 * <tr><td>NET_EMPTY_LIST</td><td>_EC(31)</td><td>2iQ/=a9{N*?U </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>_EC(32)</td><td>;qH!O5M3JtPTEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>_EC(33)</td><td>;qH!PrAP:EJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>_EC(34)</td><td>;qH!3#9fJtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>_EC(35)</td><td>;qH!DSPD\A&ChJvJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>_EC(36)</td><td>;qH!MxBgEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>_EC(37)</td><td>;qH!M(5@C{3FJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>_EC(38)</td><td>;qH!JSF5JtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>_EC(39)</td><td>;qH!B<OsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>_EC(40)</td><td>;qH!=bBkFwP-RiC{3FJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>_EC(41)</td><td>;qH!2324.?Z9&D\C{3FJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>_EC(42)</td><td>;qH!=bBkFwJtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_232COM</td><td>_EC(43)</td><td>;qH!2324.?ZEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>_EC(44)</td><td>;qH!Mb2?1(>/JdHkEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>_EC(45)</td><td>;qH!6/L,<l2b1(>/J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>_EC(46)</td><td>;qH!Ih18J1<dJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>_EC(47)</td><td>;qH!T$@@2NJ}J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>_EC(48)</td><td>;qH!WT6/N,;$EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>_EC(49)</td><td>;qH!JSF5>XUsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_COVER</td><td>_EC(50)</td><td>;qH!GxSrUZ52EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>_EC(51)</td><td>;qH!M<OsK.S!EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>_EC(55)</td><td>P^8D3#9fJtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>_EC(56)</td><td>P^8DMxBgEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>_EC(57)</td><td>P^8DM(5@C{3FJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>_EC(58)</td><td>P^8DJSF5JtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>_EC(59)</td><td>P^8DB<OsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>_EC(60)</td><td>P^8D=bBkFwJtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_232COM</td><td>_EC(61)</td><td>P^8D2324.?ZEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>_EC(62)</td><td>P^8DMb2?JdHk1(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>_EC(63)</td><td>P^8D6/L,<l2b1(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>_EC(64)</td><td>P^8DIh18J1<dJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>_EC(65)</td><td>P^8DT$@@2NJ}J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>_EC(66)</td><td>P^8DWT6/N,;$EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>_EC(67)</td><td>P^8DJSF5>XUsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_COVER</td><td>_EC(68)</td><td>P^8DGxSrUZ52EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>_EC(69)</td><td>P^8DM<OsK.S!EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>_EC(70)</td><td>P^8DN^O_MxBgPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>_EC(71)</td><td>Q!TqN^O_MxBgIh18J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>_EC(72)</td><td>P^8DVw6/W"2a2NJ}EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>_EC(73)</td><td>P^8DIcOqM7JtPTEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>_EC(74)</td><td>P^8D:lMb1(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>_EC(75)</td><td>P^8DRtF51(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>_EC(76)</td><td>P^8D4f4"N;VCEdVCJ'0\</td></tr> 
	 * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>_EC(77)</td><td>RtF51`Bk=S?ZC;SP3I9&3uJ<;/ </td></tr>
	 * <tr><td>NET_DATA_TOOLONGH</td><td>_EC(78)</td><td>J}>]9}3$ </td></tr>
	 * <tr><td>NET_UNSUPPORTED</td><td>_EC(79)</td><td>Ih182;V'3V8C2YWw </td></tr>
	 * <tr><td>NET_DEVICE_BUSY</td><td>_EC(80)</td><td>Ih18WJT42;Wc </td></tr>
	 * <tr><td>NET_SERVER_STARTED</td><td>_EC(81)</td><td>7~NqFwRQ>-Ft6/ </td></tr>
	 * <tr><td>NET_SERVER_STOPPED </td><td>_EC(82)</td><td>7~NqFwIPN43I9&Ft6/ </td></tr>
	 * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>_EC(83)</td><td>JdHkPrAP:ESPNs </td></tr>
	 * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>_EC(84)</td><td>;qH!S2ELPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>_EC(85)</td><td>;qH!A,=SSessionPEO" 
	 * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>_EC(86)</td><td>JdHkC\Bk4mNs3,9}O^VF4NJ} </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>_EC(100)</td><td>C\Bk2;U}H7 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_USER</td><td>_EC(101)</td><td>UJ;'2;4fTZ </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>_EC(102)</td><td>5H4}5GB<75;X3,J1 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>_EC(103)</td><td>UJ:ERQ5GB< </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>_EC(104)</td><td>UJ:ERQ1;Kx6( </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>_EC(105)</td><td>UJ:ERQ1;APN*:ZC{5% </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>_EC(106)</td><td>WJT42;Wc,O5M3C& </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107)</td><td>A,=SVw;zJ'0\</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>_EC(108)</td><td>MxBgA,=SJ'0\</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>_EC(109)</td><td>5GB<Ih183I9&,5+N^7(44=(JSF5M(5@,Gk<l2iMxBgW4?v </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>_EC(110)</td><td>3,9}Wn4sA,=SJ}  </td></tr>
	 * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>_EC(120)</td><td>Render?b4r?*RtF53v4m</td></tr> 
	 * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>_EC(121)</td><td>Render?b9X1URtF53v4m</td></tr> 
	 * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>_EC(122)</td><td>Render?b?XVFRtA?3v4m</td></tr> 
	 * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>_EC(123)</td><td>Render?bIhVC;-Cf2NJ}3v4m</td></tr> 
	 * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>_EC(124)</td><td>Render?bT]M#2%7E3v4m</td></tr> 
	 * <tr><td>NET_RENDER_SNAP_ERROR</td><td>_EC(125)</td><td>Render?bW%M<3v4m</td></tr> 
	 * <tr><td>NET_RENDER_STEP_ERROR</td><td>_EC(126)</td><td>Render?b2==x3v4m</td></tr> 
	 * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>_EC(127)</td><td>Render?bIhVCV!BJ3v4m</td></tr> 
	 * <tr><td>NET_GROUP_EXIST</td><td>_EC(140)</td><td>WiC{RQ4fTZ </td></tr>
	 * <tr><td>NET_GROUP_NOEXIST</td><td>_EC(141)</td><td>WiC{2;4fTZ </td></tr>
	 * <tr><td>NET_GROUP_RIGHTOVER</td><td>_EC(142)</td><td>Wi5DH(O^3,3vH(O^AP1m76N' </td></tr>
	 * <tr><td>NET_GROUP_HAVEUSER</td><td>_EC(143)</td><td>WiOBSPSC;',2;D\I>3} </td></tr>
	 * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144)</td><td>Wi5DD38vH(O^1;SC;'J9SC,2;D\3v3} </td></tr>
	 * <tr><td>NET_GROUP_SAMENAME</td><td>_EC(145)</td><td>PBWiC{M,RQSPWiC{VX84 </td></tr>
	 * <tr><td>NET_USER_EXIST</td><td>_EC(146)</td><td>SC;'RQ4fTZ </td></tr>
	 * <tr><td>NET_USER_NOEXIST</td><td>_EC(147)</td><td>SC;'2;4fTZ </td></tr>
	 * <tr><td>NET_USER_RIGHTOVER</td><td>_EC(148)</td><td>SC;'H(O^3,3vWiH(O^ </td></tr>
	 * <tr><td>NET_USER_PWD</td><td>_EC(149)</td><td>1#AtUJ:E,2;H]PmP^8DC\Bk </td></tr>
	 * <tr><td>NET_USER_FLASEPWD</td><td>_EC(150)</td><td>C\Bk2;U}H7 </td></tr>
	 * <tr><td>NET_USER_NOMATCHING</td><td>_EC(151)</td><td>C\Bk2;F%Ed </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>_EC(300)</td><td>;qH!Mx?(EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>_EC(301)</td><td>;qH!N^O_MxBgPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>_EC(302)</td><td>;qH!N^O_MxBgIh18J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>_EC(303)</td><td>;qH!Vw6/W"2a2NJ}J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>_EC(304)</td><td>;qH!IcOqM7JtPTJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>_EC(305)</td><td>;qH!:lMb1(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>_EC(306)</td><td>;qH!RtF51(>/EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>_EC(307)</td><td>;qH!4f4"N;VCEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>_EC(308)</td><td>;qH!SJ<~EdVCJ'0\</td></tr> 
	 * <tr><td>NET_CONFIG_DEVBUSY</td><td>_EC(309)</td><td>T]J1N^7(IhVC </td></tr>
	 * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>_EC(310)</td><td>EdVCJ}>]2;:O7( </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DST</td><td>_EC(311)</td><td>;qH!ODAnJ1EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DST</td><td>_EC(312)</td><td>IhVCODAnJ1EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>_EC(313)</td><td>;qH!JSF5OSD5~<SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>_EC(314)</td><td>IhVCJSF5OSD5~<SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>_EC(315)</td><td>;qH!CDMA!"GPRSMxBgEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>_EC(316)</td><td>IhVCCDMA!"GPRSMxBgEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>_EC(317)</td><td>;qH!IP9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>_EC(318)</td><td>IhVCIP9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>_EC(319)</td><td>;qH!SoRt6T=21`BkEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>_EC(320)</td><td>IhVCSoRt6T=21`BkEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>_EC(321)</td><td>;qH!B<Oq4r0|3$6HEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>_EC(322)</td><td>IhVCB<Oq4r0|3$6HEdVCJ'0\</td></tr> 
	 * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>_EC(323)</td><td>2;V'3VMxBgS2EL7VGx </td></tr>
	 * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>_EC(324)</td><td>;qH!Ih18IOVw6/W"2a7~NqFwPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>_EC(325)</td><td>Vw6/W"2aVX6(OrW"2a4mNs</td></tr> 
	 * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>_EC(326)</td><td>6O?*Vw6/W"2a7~NqFw4mNs</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MMS</td><td>_EC(327)</td><td>;qH!mmsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MMS</td><td>_EC(328)</td><td>IhVCmmsEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>_EC(329)</td><td>;qH!6LPE<$;nN^O_A,=SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>_EC(330)</td><td>IhVC6LPE<$;nN^O_A,=SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>_EC(331)</td><td>;qH!2&:E<$;nN^O_A,=SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>_EC(332)</td><td>IhVC2&:E<$;nN^O_A,=SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>_EC(333)</td><td>2iQ/JSF5Jd3v2NJ}EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>_EC(334)</td><td>IhVCJSF5Jd3v2NJ}EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>_EC(335)</td><td>;qH!osd5~<SJ9D\EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>_EC(336)</td><td>IhVCosd5~<SJ9D\EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>_EC(337)</td><td>IhVCJ}WVM(5@G06K1`Bk=SHkEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>_EC(338)</td><td>;qH!TV5w=ZEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>_EC(339)</td><td>IhVCTV5w=ZEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>_EC(340)</td><td>GkGs=(A"A,=SJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>_EC(341)</td><td>GkGs?LB<ND<~IO4+J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>_EC(342)</td><td>;qH!W%0|EdVCPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>_EC(343)</td><td>IhVCW%0|EdVCPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>_EC(344)</td><td>2iQ/OBTXO^VFPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>_EC(345)</td><td>IhVCOBTXO^VFPEO"J'0\</td></tr> 
	 * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>_EC(346)</td><td>2iQ/4.?Z2NJ}J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_POINT</td><td>_EC(347)</td><td>;qH!T$VF5cPEO"4mNs</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_POINT</td><td>_EC(348)</td><td>IhVCT$VF5cPEO"4mNs</td></tr> 
	 * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>_EC(349)</td><td>SDKC;SPU}3#5G3vIh18 </td></tr>
	 * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>_EC(350)</td><td>;qH!35TXEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>_EC(351)</td><td>IhVC35TXEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>_EC(352)</td><td>;qH!atm5~<SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>_EC(353)</td><td>IhVCatm5~<SEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>_EC(354)</td><td>;qH!atm5~<SD\A&J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>_EC(355)</td><td>;qH!=bBkFw=bBkBVQ2EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>_EC(356)</td><td>IhVC=bBkFw=bBkBVQ2EdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>_EC(357)</td><td>?XVF=bBkFw=bBkBVQ2J'0\</td></tr> 
	 * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>_EC(358)</td><td>3,3vIh18V'3VWn4sSC;'WiJ}D? </td></tr>
	 * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>_EC(359)</td><td>3,3vIh18V'3VWn4sSC;'J}D? </td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>_EC(368)</td><td>;qH!SIPEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>_EC(369)</td><td>IhVCSIPEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>_EC(370)</td><td>;qH!SIPD\A&J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>_EC(371)</td><td>;qH!WIFI apEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>_EC(372)</td><td>IhVCWIFI apEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>_EC(373)</td><td>;qH!=bBk2_BTEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>_EC(374)</td><td>IhVC=bBk2_BTEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_TALK_REJECT</td><td>_EC(375)</td><td>>\>x6T=2 </td></tr>
	 * <tr><td>NET_ERROR_TALK_OPENED</td><td>_EC(376)</td><td>6T=21;FdK{?M;'6K4r?* </td></tr>
	 * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>_EC(377)</td><td>WJT43eM; </td></tr>
	 * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>_EC(378)</td><td>2;V'3V5DSoRt1`Bk8qJ= </td></tr>
	 * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>_EC(379)</td><td>N^H(O^ </td></tr>
	 * <tr><td>NET_ERROR_TALK_FAILED</td><td>_EC(380)</td><td>GkGs6T=2J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>_EC(381)</td><td>;qH!;zFwO`9XEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>_EC(382)</td><td>IhVC;zFwO`9XEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>_EC(383)</td><td>Ih18N^7(;qH!51G0GkGsJ}>] </td></tr>
	 * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>_EC(384)</td><td>MAC5XV7QiV$J'0\</td></tr> 
	 * <tr><td>NET_ERROR_GET_INSTANCE</td><td>_EC(385)</td><td>;qH!7~NqFwJ5@}J'0\</td></tr> 
	 * <tr><td>NET_ERROR_JSON_REQUEST</td><td>_EC(386)</td><td>Iz3I5DjasonWV7{4.4mNs</td></tr> 
	 * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>_EC(387)</td><td>OlS&5DjasonWV7{4.4mNs</td></tr> 
	 * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>_EC(388)</td><td>P-Ri0f1>5MSZ51G0J9SC5D0f1> </td></tr>
	 * <tr><td>NET_SPARE_NO_CAPACITY</td><td>_EC(389)</td><td>HH182YWwJ'0\, H]A?2;Wc</td></tr> 
	 * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>_EC(390)</td><td>OTJ>T41;FdK{Jd3vU<SC </td></tr>
	 * <tr><td>NET_ERROR_REAVE</td><td>_EC(391)</td><td>8_<6SC;'G@U<5M<6SC;'WJT4 </td></tr>
	 * <tr><td>NET_ERROR_NETFORBID</td><td>_EC(392)</td><td>={V9HkMx </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_MACFILTER</td><td>_EC(393)</td><td>;qH!MAC9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MACFILTER</td><td>_EC(394)</td><td>IhVCMAC9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPMACFILTER</td><td>_EC(395)</td><td>;qH!IP/MAC9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPMACFILTER</td><td>_EC(396)</td><td>IhVCIP/MAC9}BKEdVCJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_OPERATION_OVERTIME</td><td>_EC(397)</td><td>51G02YWw3,J1 </td></tr>
	 * <tr><td>NET_ERROR_SENIOR_VALIDATE_FAILED</td><td>_EC(398)</td><td>8_<6P#QiJ'0\</td></tr> 
	 * <tr><td>NET_ERROR_DEVICE_ID_NOT_EXIST</td><td>_EC(399)</td><td>Ih18ID2;4fTZ </td></tr>
	 * <tr><td>NET_ERROR_UNSUPPORTED</td><td>_EC(400)</td><td>2;V'3V51G02YWw </td></tr>
	 * <tr><td>NET_ERROR_SPEAK_FAILED</td><td>_EC(406)</td><td>GkGs:0;0J'0\</td></tr> 
	 * <tr><td>NET_ERROR_NOT_SUPPORT_F6</td><td>_EC(407)</td><td>Ih182;V'3V4KF6=S?Z5wSC </td></tr>
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
	 * IhVCA,=SIh183,J1J1<d:M3"JT4NJ}
	 * @param nWaitTime ?M;'6KSkIh185DA,=S5H4}J1<d,:ACk<6 
	 * @param nTryTimes A,=S4NJ} 
	 * \endif
	 */
	public static native  void  		SetConnectTime(int nWaitTime, int nTryTimes);
	
	/**
	 * \if ENGLISH_LANG
	 * Set log in network environment
	 * @param pNetParam net parameter structure pointer. as NET_PARAM 
	 * @return true:success, false:failed
	 * \else
	 * IhVC5GB=MxBg;7>3
	 * @param pNetParam MxBg2NJ}=a99LeV8Uk,Oj<{ NET_PARAM
	 * \endif
	 */
	public static native  void  		SetNetworkParam(NET_PARAM pNetParam);
	
	/**
	 * \if ENGLISH_LANG
	 * Get SDK version information 
	 * @return version NO. 
	 * \else
	 * ;qH!SDK5D0f1>PEO"
	 * @return 0f1>:E
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
	 * OrIh18W"2a
	 * @param pchDVRIP Ih18IP 
	 * @param wDVRPort Ih186K?Z 
	 * @param pchUserName SC;'C{
	 * @param pchPassword SC;'C\Bk
	 * @param lpDeviceInfo Ih18PEO",JtSZJd3v2NJ}
	 * @param nError 75;X5GB<4mNsBk
	 * <table>
	 * <tr><td>4mNsBk</td><td>4z1m:,Re </td></tr>
	 * <tr><td>1</td><td>C\Bk2;U}H7 </td></tr>
	 * <tr><td>2</td><td>SC;'C{2;4fTZ </td></tr>
	 * <tr><td>3</td><td>5GB<3,J1 </td></tr>
	 * <tr><td>4</td><td>UJ:ERQ5GB< </td></tr>
	 * <tr><td>5</td><td>UJ:ERQ1;Kx6(  </td></tr>
	 * <tr><td>6</td><td>UJ:E1;APN*:ZC{5%  </td></tr>
	 * <tr><td>7</td><td> WJT42;Wc,O5M3C& </td></tr>
	 * <tr><td>8</td><td>WSA,=SJ'0\ </td></tr>
	 * <tr><td>9</td><td>VwA,=SJ'0\ </td></tr>
	 * <tr><td>10</td><td> 3,9}Wn4sSC;'A,=SJ} </td></tr>
	 * </table>
	 * @return J'0\75;X0,3I9&75;XIh18ID,5GB<3I9&V.:s6TIh185D2YWw6<?IRTM(9}4KV5(Ih18>d1z)6TS&5=O`S&5DIh18 
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
	 * @param nSpecCap Ih18V'3V5DD\A&
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
	 * OrIh18W"2a--@)U9
	 * @param pchDVRIP Ih18IP 
	 * @param wDVRPort Ih186K?Z 
	 * @param pchUserName SC;'C{
	 * @param pchPassword SC;'C\Bk
	 * @param nSpecCap Ih18V'3V5DD\A&
	 * @param pCapParam 6TnSpecCap 5D293d2NJ}
	 * @param lpDeviceInfo Ih18PEO",JtSZJd3v2NJ}
	 * @param nError 75;X5GB<4mNsBk
	 * <table>
	 * <tr><td>4mNsBk</td><td>4z1m:,Re</td></tr> 
	 * <tr><td>1</td><td>C\Bk2;U}H7 </td></tr>
	 * <tr><td>2</td><td>SC;'C{2;4fTZ </td></tr>
	 * <tr><td>3</td><td>5GB<3,J1</td></tr>
	 * <tr><td>4</td><td>UJ:ERQ5GB<</td></tr>
	 * <tr><td>5</td><td>UJ:ERQ1;Kx6( </td></tr>
	 * <tr><td>6</td><td>UJ:E1;APN*:ZC{5% </td></tr> 
	 * <tr><td>7</td><td>WJT42;Wc,O5M3C&</td></tr> 
	 * <tr><td>8</td><td>WSA,=SJ'0\ </td></tr>
	 * <tr><td>9</td><td>VwA,=SJ'0\ </td></tr>
	 * <tr><td>10</td><td> 3,9}Wn4sSC;'A,=SJ} </td></tr>
	 * </table>
	 * @return J'0\75;X0,3I9&75;XIh18ID,5GB<3I9&V.:s6TIh185D2YWw6<?IRTM(9}4KV5(Ih18>d1z)6TS&5=O`S&5DIh18 
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
	 * MK3vIh18
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @return true:3I9&, false:J'0\
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
	 * PBEdVC=S?Z,2iQ/EdVCPEO"(RTJson8qJ=)
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5   {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param szCommand C|An2NJ},Oj<{ ParseData 
	 * @param nChannelID M(5@:E 
	 * @param szOutBuffer Jd3v;:3e 
	 * @param dwOutBufferSize Jd3v;:3e4sP! 
	 * @param error 4mNsBk 
	 * <table>
	 * <tr><td>0</td><td>3I9&</td></tr> 
	 * <tr><td>1</td><td>J'0\ </td></tr>
	 * <tr><td>2</td><td>J}>]2;:O7( </td></tr>
	 * <tr><td>3</td><td>T]J1N^7(IhVC</td></tr> 
	 * <tr><td>4</td><td>C;SPH(O^ </td></tr>
	 * </table>
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * PBEdVC=S?Z,IhVCEdVCPEO"(RTJson8qJ=)
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param szCommand  C|An2NJ} Oj<{ ParseData
	 * @param nChannelID M(5@:E 
	 * @param szInBuffer JdHk;:3e 
	 * @param dwInBufferSize JdHk;:3e4sP! 
	 * @param error 4mNsBk
	 * <table>
	 * <tr><td>0</td><td>3I9& </td></tr>
	 * <tr><td>1</td><td>J'0\ </td></tr>
	 * <tr><td>2</td><td> J}>]2;:O7( </td></tr>
	 * <tr><td>3</td><td> T]J1N^7(IhVC </td></tr>
	 * <tr><td>4</td><td> C;SPH(O^ </td></tr>
	 * </table>
	 * @param restart EdVCIhVC:sJG7qPhR*VXFtIh18,11mJ>PhR*VXFt,01mJ>2;PhR*VXFt 
	 * @param waittime 5H4}J1<d  
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see PacketData  ParseData
	 */
	public static native  boolean  	SetNewDevConfig(long lLoginID, String szCommand, int nChannelID, char[] szInBuffer, long dwInBufferSize, Integer error, Integer restart, int waittime);
	
	public static native  boolean  	DeleteDevConfig(long lLoginID, NET_IN_DELETECFG pInParam, NET_OUT_DELETECFG pOutParam, int nWaittime);
	
	/**
	 * \if ENGLISH_LANG
	 * analyze to receive character string config info
	 * @param szCommand command parameter, as follows
	 * GetNewDevConfig :M SetNewDevConfig =S?ZC|An
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
	 * <tr><td>CFG_CMD_AUDIO_SPIRIT</td><td>"AudioSpirit"</td><td>Voice Incentive(Corresponding CFG_AUDIO_SPIRIT)</td></tr>
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
	 * =bNv2iQ/5=5DEdVCPEO"
	 * @param szCommand C|An2NJ}
	 * GetNewDevConfig :M SetNewDevConfig =S?ZC|An
	 * <table>
	 * <tr><td>CFG_CMD_ENCODE</td><td>"Encode"</td><td>M<OqM(5@JtPTEdVC,=a99Le  CFG_ENCODE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD</td><td>"Record"</td><td>6(J1B<OqEdVC,=a99Le  CFG_RECORD_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ALARMINPUT</td><td>"Alarm"</td><td>Mb2?JdHk1(>/EdVC,=a99Le  CFG_ALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETALARMINPUT</td><td>"NetAlarm"</td><td>MxBg1(>/EdVC,=a99Le  CFG_NETALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MOTIONDETECT</td><td>"MotionDetect"</td><td>6/L,<l2b1(>/EdVC,=a99Le  CFG_MOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOLOST</td><td>"LossDetect"</td><td>JSF56*J'1(>/EdVC,=a99Le  CFG_VIDEOLOST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOBLIND</td><td>"BlindDetect"</td><td>JSF5UZ521(>/EdVC,=a99Le  CFG_SHELTER_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGENOEXIST</td><td>"StorageNotExist"</td><td>C;SP4f4"Ih18EdVC,=a99Le  CFG_STORAGENOEXIST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEFAILURE</td><td>"StorageFailure"</td><td>4f4"Ih187CNJ3v4mEdVC,=a99Le  CFG_STORAGEFAILURE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGELOWSAPCE</td><td>"StorageLowSpace"</td><td>4f4"Ih18H]A?5MEdVC,=a99Le  CFG_STORAGELOWSAPCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETABORT</td><td>"NetAbort"</td><td>MxBg6O?*EdVC,=a99Le  CFG_NETABORT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPCONFLICT</td><td>"IPConflict"</td><td>IP3eM;IhVC,=a99Le  CFG_IPCONFLICT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPCAPINFO</td><td>"SnapInfo"</td><td>W%M<D\A&,=a99Le  CFG_SNAPCAPINFO_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NAS</td><td>"NAS"</td><td>MxBg4f4"7~NqFwEdVC,=a99Le  CFG_NAS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_PTZ</td><td>"Ptz"</td><td>TFL(EdVC,=a99Le  CFG_PTZ_INFO</td></tr> 
	 * <tr><td>CFG_CMD_WATERMARK</td><td>"WaterMark"</td><td>JSF5K.S!EdVC,=a99Le CFG_WATERMARK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEGLOBAL</td><td>"VideoAnalyseGlobal"</td><td>JSF57VNvH+>VEdVC,=a99Le  CFG_ANALYSEGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEMODULE</td><td>"VideoAnalyseModule"</td><td>NoLe5D<l2bD#?iEdVC,=a99Le  CFG_ANALYSEMODULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSERULE</td><td>"VideoAnalyseRule"</td><td>JSF57VNv9fTrEdVC,=a99Le  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSESOURCE</td><td>"VideoAnalyseSource"</td><td>JSF57VNvWJT4EdVC,=a99Le  CFG_ANALYSESOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAINBRUSH</td><td>"RainBrush"</td><td>SjK"EdVC  CFG_RAINBRUSH_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICGLOBAL</td><td>"TrafficGlobal"</td><td>VGD\=;M(H+>VEdVC CFG_TRAFFICGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEV_GENERRAL</td><td>"General"</td><td>FUM(EdVC  CFG_DEV_DISPOSITION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ATMMOTION</td><td>"FetchMoneyOverTime"</td><td>ATMH!?n3,J1EdVC  CFG_ATMMOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPSOURCE</td><td>"SnapSource"</td><td>W%M<T4EdVC,=a99Le  CFG_SNAPSOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVICESTATUS</td><td>"DeviceStatus"</td><td>Ih18W4L,PEO"  CFG_DEVICESTATUS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HARDDISKTANK</td><td>"HardDiskTank"</td><td>@)U99qPEO",=a99Le  CFG_HARDISKTANKGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAIDGROUP</td><td>"RaidGroup"</td><td>RaidWiPEO",=a99Le  CFG_RAIDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOOLGROUP</td><td>"StoragePoolGroup"</td><td>4f4"3XWiPEO",=a99Le  CFG_STORAGEPOOLGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOSITIONGROUP</td><td>"StoragePositionGroup"</td><td>ND<~O5M3WiPEO",=a99Le  CFG_STORAGEPOSITIONGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINDEVGROUP</td><td>"VideoInDevGroup"</td><td>G06KIh18WiPEO"  CFG_VIDEOINDEVGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVRECORDGROUP</td><td>"DevRecordGroup"</td><td>M(5@B<OqWiW4L,,=a99Le  CFG_DEVRECORDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPSSERVER</td><td>"IpsServer"</td><td>7~NqW4L,,=a99Le  CFG_IPSERVER_STATUS</td></tr> 
	 * <tr><td>CFG_CMD_MATRIX_SPOT</td><td>"SpotMatrix"</td><td>SpotJSFA>XUs,=a99Le  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>C?8vJ}WVM(5@5DdspPEO",=a99Le  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>C?8vJ}WVM(5@5DdspPEO",=a99Le  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SPLITTOUR</td><td>"SplitTour"</td><td>JSF57V8nBVQ2EdVC,=a99Le  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_VIDEOENCODEROI</td><td>"VideoEncodeROI"</td><td>JSF51`BkROI(Region of Intrest)EdVC,=a99Le  CFG_VIDEOENCODEROI_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEO_INMETERING</td><td>"VideoInMetering"</td><td>2b9bEdVC,=a99Le  CFG_VIDEO_INMETERING_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFIC_FLOWSTAT</td><td>"TrafficFlowStat"</td><td>=;M(AwA?M3<FEdVC,=a99Le  CFG_TRAFFIC_FLOWSTAT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINOPTIONS</td><td>"VideoInOptions"</td><td>JSF5JdHkG06KQ!On,=a99Le  CFG_VIDEO_IN_OPTIONS </td></tr>
	 * <tr><td>CFG_CMD_RTSP</td><td>"RTSP"</td><td>RTSP5DEdVC,=a99Le  CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICSNAPSHOT_MULTI</td><td>"TrafficSnapshotNew"</td><td>VGD\=;M(W%ED CFG_TRAFFICSNAPSHOT_NEW_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MULTICAST</td><td>"Multicast"</td><td>Wi2%5DO`9XEdVC,=a99Le  CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROFILE</td><td>"VideoDiagnosisProfile"</td><td>JSF5Uo6O2NJ}1m,=a99Le  CFG_VIDEODIAGNOSIS_PROFILE </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK</td><td>"VideoDiagnosisTask"</td><td>JSF5Uo6OHNNq1m,=a99Le  CFG_VIDEODIAGNOSIS_TASK</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROJECT</td><td>"VideoDiagnosisProject"</td><td>JSF5Uo6O<F;.1m  CFG_VIDEODIAGNOSIS_PROJECT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GLOBAL</td><td>"VideoDiagnosisGlobal"</td><td>JSF5Uo6OH+>V1m  CFG_VIDEODIAGNOSIS_GLOBAL </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK_ONE</td><td>"VideoDiagnosisTask.x"</td><td>JSF5Uo6OHNNq1m  CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_TRAFFIC_WORKSTATE</td><td>"WorkState"</td><td>Ih189$WwW4L,O`9XEdVC,=a99Le  CFG_TRAFFIC_WORKSTATE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEDEVGROUP</td><td>"StorageDevGroup"</td><td>4EEL4f4"WiEdVC,=a99Le  CFG_STORAGEGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORDTOGROUP</td><td>"RecordToGroup"</td><td>B<Oq4f7E5D4f4"WiEdVC,=a99Le  CFG_RECORDTOGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_INTELLITRACKSCENE</td><td>"IntelliTrackScene"</td><td>VGD\8zWY3!>0EdVC,=a99Le  CFG_INTELLITRACKSCENE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IVSFRAM_RULE</td><td>"IVSFramRule"</td><td>VGD\V!9fTrEdVC,=a99Le  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD_STORAGEPOINT</td><td>"RecordStoragePoint"</td><td>B<Oq4f4"5cS3IdEdVC,=a99Le  CFG_RECORDTOSTORAGEPOINT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MD_SERVER</td><td>"MetaDataServer"</td><td>T*J}>]7~NqFwEdVC,=a99Le  CFG_METADATA_SERVER </td></tr>
	 * <tr><td>CFG_CMD_CHANNELTITLE</td><td>"ChannelTitle"</td><td>M(5@C{3F  AV_CFG_ChannelName </td></tr>
	 * <tr><td>CFG_CMD_RECORDMODE</td><td>"RecordMode"</td><td>B<OqD#J=  AV_CFG_RecordMode </td></tr>
	 * <tr><td>CFG_CMD_VIDEOOUT</td><td>"VideoOut"</td><td>JSF5Jd3vJtPT  AV_CFG_VideoOutAttr </td></tr>
	 * <tr><td>CFG_CMD_REMOTEDEVICE</td><td>"RemoteDevice"</td><td>T63LIh18PEO"  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_REMOTECHANNEL</td><td>"RemoteChannel"</td><td>T63LM(5@  AV_CFG_RemoteChannel </td></tr>
	 * <tr><td>CFG_CMD_MONITORTOUR</td><td>"MonitorTour"</td><td>;-CfBVQ5EdVC  AV_CFG_MonitorTour </td></tr>
	 * <tr><td>CFG_CMD_MONITORCOLLECTION</td><td>"MonitorCollection"</td><td>;-CfJU2XEdVC  AV_CFG_MonitorCollection </td></tr>
	 * <tr><td>CFG_CMD_DISPLAYSOURCE</td><td>"DisplaySource"</td><td>;-Cf7V8nOTJ>T4EdVC  AV_CFG_ChannelDisplaySource </td></tr>
	 * <tr><td>CFG_CMD_RAID</td><td>"Raid"</td><td>4f4">mWiEdVC  AV_CFG_Raid </td></tr>
	 * <tr><td>CFG_CMD_RECORDSOURCE</td><td>"RecordSource"</td><td>B<OqT4EdVC  AV_CFG_RecordSource </td></tr>
	 * <tr><td>CFG_CMD_VIDEOCOLOR</td><td>"VideoColor"</td><td>JSF5JdHkQUI+EdVC  AV_CFG_ChannelVideoColor</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOWIDGET</td><td>"VideoWidget"</td><td>JSF51`BkNo<~EdVC  AV_CFG_VideoWidget </td></tr>
	 * <tr><td>CFG_CMD_STORAGEGROUP</td><td>"StorageGroup"</td><td>4f4"WiPEO"  AV_CFG_StorageGroup </td></tr>
	 * <tr><td>CFG_CMD_LOCALS</td><td>"Locales"</td><td>GxSrEdVC  AV_CFG_Locales </td></tr>
	 * <tr><td>CFG_CMD_LANGUAGE</td><td>"Language"</td><td>SoQTQ!Tq  AV_CFG_Language </td></tr>
	 * <tr><td>CFG_CMD_ACCESSFILTER</td><td>"AccessFilter"</td><td>7CNJ5XV79}BK  AV_CFG_AccessFilter </td></tr>
	 * <tr><td>CFG_CMD_AUTOMAINTAIN</td><td>"AutoMaintain"</td><td>WT6/N,;$  AV_CFG_AutoMaintain </td></tr>
	 * <tr><td>CFG_CMD_REMOTEEVENT</td><td>"RemoteEvent"</td><td>T63LIh18JB<~4&@m   AV_CFG_RemoteEvent </td></tr>
	 * <tr><td>CFG_CMD_MONITORWALL</td><td>"MonitorWall"</td><td>5gJSG=EdVC  AV_CFG_MonitorWall </td></tr>
	 * <tr><td>CFG_CMD_SPLICESCREEN</td><td>"VideoOutputComposite"</td><td>HZ:OFAEdVC  AV_CFG_SpliceScreen </td></tr>
	 * <tr><td>CFG_CMD_TEMPERATUREALARM</td><td>"TemperatureAlarm"</td><td>NB6H1(>/EdVC  AV_CFG_TemperatureAlarm </td></tr>
	 * <tr><td>CFG_CMD_FANSPEEDALARM</td><td>"FanSpeedAlarm"</td><td>7gIHW*KY1(>/EdVC  AV_CFG_FanSpeedAlarm</td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUP</td><td>"RecordBackupRestore.BitrateLimit"</td><td>B<Oq;X4+EdVC  AV_CFG_RecordBackup </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUPDEVICE</td><td>"RecordBackupRestore.BackupDevices"</td><td>B<Oq;X4+18SCIh18EdVC  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_COMM</td><td>"Comm"</td><td>4.?ZEdVC  CFG_COMMGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETWORK</td><td>"Network"</td><td>MxBgEdVC  CFG_NETWORK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NASEX</td><td>"NAS"</td><td>MxBg4f4"7~NqFwEdVC, 6`7~NqFw  CFG_NAS_GROUP_INFO_EX </td></tr>
	 * <tr><td>CFG_CMD_ALARMOUT</td><td>"AlarmOut"</td><td>1(>/Jd3vM(5@EdVC  CFG_ALARMOUT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_COMMGLOBAL</td><td>"CommGlobal"</td><td>1(>/H+>VEdVC  CFG_COMMGLOBAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_MOBILE</td><td>"Mobile"</td><td>RF6/O`9XR5NqEdVC  CFG_MOBILE_INFO</td></tr>  
	 * <tr><td>CFG_CMD_NTP</td><td>"NTP"</td><td>J1<dM,2=7~NqFw  CFG_NTP_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PHONEEVENTNOTIFY</td><td>"PhoneEventNotify"</td><td>5g;0VPPDM(V*EdVC  CFG_PHONEEVENTNOTIFY_INFO</td></tr>  
	 * <tr><td>CFG_CMD_WIRELESS</td><td>"Wireless"</td><td>N^O_MxBgA,=SIhVC  CFG_WIRELESS_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PSTN_ALARM_SERVER</td><td>"PSTNAlarmServer"</td><td>5g;01(>/VPPDEdVC  CFG_PSTN_ALARM_CENTER_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_GENERAL</td><td>"AccessControlGeneral"</td><td>CE={;y1>EdVC  CFG_ACCESS_GENERAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_EVENT</td><td>"AccessControl"</td><td>CE={JB<~EdVC  CFG_ACCESS_EVENT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_AUDIO_SPIRIT</td><td>"AudioSpirit"</td><td>SoRt<$@x(6TS& CFG_AUDIO_SPIRIT)</td></tr>
	 * </table>
	 * QueryNewSystemInfo=S?ZC|An
	 * <table>
	 * <tr><td>CFG_CAP_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.getCaps"</td><td>JSF57VNvD\A&</,=a99Le CFG_CAP_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_NETAPP_REMOTEDEVICE</td><td>"netApp.getRemoteDeviceStatus"</td><td>;qH!:s6KIh185D5DTZO_W4L,,=a99Le  CFG_REMOTE_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.factory.getCollect"</td><td>Ih18VGD\7VNvD\A&,=a99Le  CFG_CAP_DEVICE_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_DEVICE_STATE</td><td>"trafficSnap.getDeviceStatus"</td><td>;qH!Mb=SIh18W4L,PEO",=a99Le  CFG_CAP_TRAFFIC_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEOINPUT</td><td>"devVideoInput.getCaps"</td><td>JSF5JdHkD\A&</,=a99Le  CFG_CAP_VIDEOINPUT_INFO </td></tr>
	 * <tr><td>CFG_USERMANAGER_ACTIVEUSER</td><td>"userManager.getActiveUserInfoAll"</td><td>5C5=KySP;n6/5DSC;'PEO",=a99Le  CFG_ACTIVEUSER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_VIDEOSTAT_SUMMARY</td><td>"videoStatServer.getSummary"</td><td>;qH!JSF5M3<FU*R*PEO",=a99Le  CFG_VIDEOSATA_SUMMARY_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT</td><td>"videoDiagnosisServer.factory.getCollect"</td><td>;qH!JSF5Uo6OM(5@J}D?,=a99Le  CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETSTATE</td><td>"videoDiagnosisServer.getState"</td><td>;qH!JSF5Uo6O=xPPW4L,,=a99Le  CFG_VIDEODIAGNOSIS_STATE_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER</td><td>"videoDiagnosisServer.getCaps"</td><td>;qH!JSF5Uo6O7~NqD\A&,=a99Le  CFG_VIDEODIAGNOSIS_CAPS_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EVENTMANAGER</td><td>"eventManager.getCaps"</td><td>;qH!Ih181(>/A*6/D\A&,@OP-RiRQ7O3},PB?*7"GkJ9SC8CWV6N  CFG_CAP_EVENTMANAGER_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARMBOX</td><td>"alarm.getExAlarmBoxCaps"</td><td>;qH!@)U91(>/:PD\A&</  CFG_CAP_EXALARMBOX_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARM</td><td>"alarm.getExAlarmCaps"</td><td>;qH!@)U91(>/D\A&</  CFG_CAP_EXALARM_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_ACCESSCONTROLMANAGER</td><td>"accessControlManager.getCaps"</td><td>CE={D\A&  CFG_CAP_ACCESSCONTROL </td></tr>
	 * <tr><td>CFG_CAP_CMD_FILEMANAGER</td><td>"FileManager.getCaps"</td><td>;qH!ND<~D\A&  CFG_CAP_FILEMANAGER </td></tr>
	 * <tr><td>CFG_CAP_CMD_RECORDFINDER</td><td>"RecordFinder.getCaps"</td><td>;qH!2iQ/<GB<D\A&</  CFG_CAP_RECORDFINDER_INFO </td></tr>
	 * </table>
	 * @param szInBuffer JdHk;:3e,WV7{EdVC;:3e 
	 * @param stParseData =bNv:s5D=a99Le 
	 * @param pReserved 1#At2NJ} 
	 * @return true:3I9&, false:J'0\
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
	 * Wi3IR*IhVC5DEdVCPEO"
	 * @param szCommand C|An2NJ},Oj<{ ParseData
	 * @param stPacketData 4x=bNv=a99Le
	 * @param szOutBuffer Jd3v;:3e 
	 * @param dwOutBufferSize Jd3v;:3e4sP! 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see SetNewDevConfig
	 * */
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
	 * 2iQ/Ih18W4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5   {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nType 2iQ/PEO"@`PM
	 * <table>
	 * <tr><td>nType</td><td>2iQ/@`PM</td><td>6TS&5D=a99Le</td></tr>
	 * <tr><td>SDK_DEVSTATE_COMM_ALARM</td><td>FUM(1(>/W4L,(0|@(Mb2?1(>/,6/L,<l2b,JSF56*J')</td><td>NET_SDK_STATE V'3V16B7RTOB  NET_SDK_STATE_EX V'3V32RTOB</td></tr>
	 * <tr><td>SDK_DEVSTATE_SHELTER_ALARM</td><td>UZ521(>/W4L,</td><td>6WV=Z </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORDINGB<OsW4L, </td><td>16WV=Z 
	 * <tr><td>SDK_DEVSTATE_RESOURCE</td><td>2iQ/O5M3WJT4W4L,</td><td>38vDWORD,5ZR;8vdword 0 1mJ>P!SZCPU3,9}50% 1 1mJ>4sSZ50%,5Z6~8v1mJ>TV,5ZH}8v1mJ>VGA </td></tr>
	 * <tr><td>SDK_DEVSTATE_BITRATE</td><td>2iQ/M(5@BkAw </td><td> M(5@J}3KRTDWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK</td><td>S2ELW4L,</td><td> SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_PROTOCAL_VER</td><td>MxBgP-Ri0f1>:E </td><td>int </td></tr>
	 * <tr><td>SDK_DEVSTATE_TALK_ECTYPE	</td><td>2iQ/Ih18V'3V5DSoRt6T=28qJ= </td><td>  SDKDEV_TALKFORMAT_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SD_CARD</td><td>2iQ/sd?(PEO"</td><td>SDK_SDCARD_STATE M, SDK_HARDDISK_STATE =a99LeR;Qy </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_DEV	</td><td>2iQ/?LB<;zPEO"</td><td>SDK_BURNING_DEVINFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_PROGRESS</td><td>2iQ/?LB<=x6H</td><td>SDK_BURNING_PROGRESS </td></tr>
	 * <tr><td>SDK_DEVSTATE_CAMERA</td><td>2iQ/IcOqM7JtPTPEO"</td><td>SDKDEV_CAMERA_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SOFTWARE</td><td>Ih18Hm<~PEO" </td><td> SDKDEV_VERSION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_LANGUAGE</td><td>Ih18SoQTV'3VPEO"</td><td> SDK_DEV_LANGUAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP</td><td>2iQ/dspD\A&ChJv </td><td> SDKDEV_DSP_ENCODECAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_OEM</td><td>2iQ/oemPEO"</td><td>SDKDEV_OEM_INFO</td></tr>
	 * <tr><td>SDK_DEVSTATE_NET</td><td>2iQ/MxBgTKPPW4L,PEO"</td><td>SDKDEV_TOTAL_NET_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TYPE</td><td>2iQ/Ih18@`PM</td><td>WV7{4. </td></tr>
	 * <tr><td>SDK_DEVSTATE_SNAP</td><td>2iQ/W%M<9&D\JtPT(IPC@`2zF7)</td><td>SDK_SNAP_ATTR_EN </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORD_TIME</td><td>2iQ/WnTgB<OqJ1<d:MWn=|B<OqJ1<d</td><td>DEV_DISK_RECORD_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET_RSSI</td><td>2iQ/N^O_MxBgPE:EG?6H</td><td>SDKDEV_WIRELESS_RSS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_ATTACH</td><td>2iQ/8=<~?LB<Q!On  </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV</td><td>2iQ/187]Ih18AP1m </td><td> SDKDEV_BACKUP_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV_INFO</td><td>2iQ/187]Ih18OjO8PEO" </td><td> SDKDEV_BACKUP_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_FEEDBACK</td><td>187]=x6H74@!</td><td>SDKDEV_BACKUP_FEEDBACK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ATM_QUERY_TRADE</td><td>2iQ/ATM=;RW@`PM </td><td>SDK_ATM_QUERY_TRADE </td></tr>
	 * <tr><td>SDK_DEVSTATE_SIP</td><td>2iQ/sipW4L,</td><td>SDKDEV_SIP_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VICHILE_STATE</td><td>2iQ/35TXwifiW4L, </td><td>SDKDEV_VEHICLE_WIFI_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_EMAIL</td><td>2iQ/SJ<~EdVCJG7q3I9& </td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SMART_HARD_DISK	</td><td>2iQ/S2ELsmartPEO"</td><td>SDKDEV_SMART_HARDDISK </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_SNAPPICTURE</td><td>2iQ/W%M<IhVCJG7q3I9&</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_STATIC_ALARM</td><td>2iQ/>2L,1(>/W4L, </td><td>DWORD,C?R;N;1mJ>R;8v1(>/M(5@ </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBMODULE_INFO</td><td>2iQ/Ih18WSD#?iPEO" </td><td>SDKDEV_SUBMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISKDAMAGE</td><td>2iQ/S2EL;55@D\A&</td><td>SDKDEV_DISKDAMAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_IPC</td><td>2iQ/Ih18V'3V5DIPCD\A&</td><td>SDK_DEV_IPC_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_ARM_DISARM</td><td>2iQ/1(>/2<377@W4L, </td><td>ALARM_ARM_DISARM_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACC_POWEROFF_ALARM</td><td>2iQ/ACC6O5g1(>/W4L, </td><td>75;XR;8vDWORD, 11mJ>6O5g,01mJ>M(5g </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_FTP_SERVER	</td><td>2bJTFTP7~NqFwA,=S</td><td>SDKDEV_FTP_SERVER_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_EXCEED</td><td>2iQ/3GAwA?3,3vcPV5W4L,</td><td>SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_INFO	</td><td>2iQ/3GMxBgAwA?PEO"</td><td>SDK_DEV_3GFLOW_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIHICLE_INFO_UPLOAD</td><td>35TXWT6(RePEO"IO4+</td><td>ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_DEVSTATE_SPEED_LIMIT</td><td>2iQ/O^KY1(>/W4L,</td><td> ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP_EX</td><td>2iQ/DSP@)U9D\A&ChJv</td><td>SDKDEV_DSP_ENCODECAP_EX </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GMODULE_INFO</td><td>2iQ/3GD#?iPEO"</td><td>SDK_DEV_3GMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MULTI_DDNS</td><td>2iQ/6`DDNSW4L,PEO"</td><td>SDK_DEV_MULTI_DDNS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_CONFIG_URL</td><td>2iQ/Ih18EdVCURLPEO"</td><td>SDK_DEV_URL_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_HARDKEY</td><td>2iQ/HardKey</td><td>SDKDEV_HARDKEY_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_ISCSI_PATH</td><td>2iQ/ISCSIB7>6AP1m </td><td>SDKDEV_ISCSI_PATHLIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP</td><td>2iQ/Ih181>5XT$@@V'3V5D7V8nD#J=	</td><td>DEVICE_LOCALPREVIEW_SLIPT_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_WIFI_ROUTE_CAP</td><td>2iQ/N^O_B7SID\A&PEO" </td><td>SDKDEV_WIFI_ROUTE_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_ONLINE</td><td>2iQ/Ih185DTZO_W4L,</td><td> 75;XR;8vDWORD, 11mJ>TZO_, 01mJ>6OO_ </td></tr>
	 * <tr><td>SDK_DEVSTATE_PTZ_LOCATION</td><td>2iQ/TFL(W4L,PEO" </td><td>SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MONITOR_INFO</td><td>;-Cf<`?X8(VzPEO"</td><td>SDKDEV_MONITOR_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBDEVICE</td><td>2iQ/WSIh18</td><td>CFG_DEVICESTATUS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_RAID_INFO</td><td>2iQ/RAIDW4L,</td><td>ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_DDNSDOMAIN</td><td>2bJTDDNSSrC{JG7q?ISC  </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIRTUALCAMERA</td><td>2iQ/PiDbIcOqM7W4L, </td><td>SDKDEV_VIRTUALCAMERA_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TRAFFICWORKSTATE</td><td>;qH!Ih189$WwJSF5/O_H&D#J=W4L,5H</td><td>SDKDEV_TRAFFICWORKSTATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_CAMERA_MOVE</td><td>;qH!IcOq;zRFN;1(>/JB<~W4L, </td><td>ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM</td><td>;qH!Mb2?1(>/W4L,</td><td>NET_SDK_ALARM_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOLOST</td><td>;qH!JSF56*J'1(>/W4L, N</td><td>ET_SDK_VIDEOLOST_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_MOTIONDETECT</td><td>;qH!6/L,<`2b1(>/W4L,</td><td> NET_SDK_MOTIONDETECT_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_DETAILEDMOTION</td><td>;qH!OjO85D6/L,<`2b1(>/W4L,	</td><td>NET_SDK_DETAILEDMOTION_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VEHICLE_INFO</td><td>;qH!35TXWTIm8wVVS2<~PEO" </td><td>SDKDEV_VEHICLE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOBLIND</td><td>;qH!JSF5UZ521(>/W4L,</td><td>NET_SDK_VIDEOBLIND_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GSTATE_INFO</td><td>2iQ/3GD#?iO`9XPEO"</td><td>SDKDEV_VEHICLE_3GMODULE </td></tr>
	 * <tr><td>SDK_DEVSTATE_NETINTERFACE</td><td>2iQ/MxBg=S?ZPEO"</td><td> SDKDEV_NETINTERFACE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_PICINPIC_CHN</td><td>2iQ/;-VP;-M(5@:E </td><td>DWORDJ}Wi  </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMPOSITE_CHN</td><td>2iQ/HZ:OFAM(5@PEO"</td><td>SDK_COMPOSITE_CHANNELJ}Wi </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_RECORDING	</td><td>2iQ/Ih18U{LeB<OqW4L, </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_ENCODING</td><td>2iQ/Ih18U{Le1`BkW4L, </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK_RECORDE_TIME</td><td>2iQ/Ih18S2ELB<OqJ1<dPEO"	</td><td>DEV_DISK_RECORD_TIMEJ}Wi </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNER_DOOR</td><td>JG7qRQ5/3v?LB<;z9bG}</td><td>NET_DEVSTATE_BURNERDOOR</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_DATA_CHECK</td><td>2iQ/9bELJ}>]P#Qi=x6H </td><td>NET_DEVSTATE_DATA_CHECK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE</td><td>2iQ/1(>/M(5@W4L,</td><td>NET_SDK_ALARM_CHANNELS_STATE</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_BYPASS</td><td>2iQ/M(5@ETB7W4L, </td><td>NET_DEVSTATE_GET_BYPASS</td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARMKEYBOARD_COUNT</td><td>2iQ/4.?ZIOA,=S5D1(>/<|ELJ}</td><td>NET_ALARMKEYBOARD_COUNT</td></tr>
	 * <tr><td>SDK_DEVSTATE_ACTIVATEDDEFENCEAREA</td><td>;qH!<$;n5D7@GxPEO" </td><td>NET_ACTIVATEDDEFENCEAREA</td></tr>
	 * <tr><td>SDK_DEVSTATE_DEV_RECORDSET</td><td>2iQ/Ih18<GB<</PEO" </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_DEVSTATE_DOOR_STATE</td><td>2iQ/CE={W4L, </td><td>NET_DOOR_STATUS_INFO</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_UPGRADE_STATE</td><td>;qH!Ih18I}<6W4L, </td><td>SDKDEV_UPGRADE_STATE_INFO</td></tr>
	 * </table> 
	 * @param pDevState SCSZ=SJU2iQ/75;X5DJ}>]5D;:4f
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * ?*J<J5J1<`JS
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param nChannelID J5J1<`JSM(5@:E(M(5@:E4S0?*J<) 
	 * @return J'0\75;X0,3I9&75;XJ5J1<`JSID(J5J1<`JS>d1z),=+WwN*O`9X:/J}5D2NJ} 
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
	 * J<J5J1<`JS--@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param nChannelID J5J1<`JSM(5@:E,\n
	 * Hg9{rTypeN*RType_Multiplay8C2NJ}1#At\n
	 * 51rTypeN*RType_Multiplay_1~RType_Multiplay_16J1,nChannelID>v6(AKT$@@5D;-Cf,\n
	 * Hg51RType_Multiplay_4J1,nChannelIDN*4!"5!"6!"7FdVPR;8vV51mJ>T$@@5Z55=5Z7M(5@5DKD;-CfT$@@ 
	 * @param rType C6>Y@`PM Oj<{  SDK_RealPlayType
	 * @return J'0\75;X0,3I9&75;XJ5J1<`JSID(J5J1<`JS>d1z),=+WwN*O`9X:/J}5D2NJ} 
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
	 * IhVCJ5J1<`JSJ}>];X5w,8xSC;'La9)Ih18Aw3v5DJ}>],51cbRealDataN*NULLJ1=aJx;X5wJ}>]
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5 
	 * @param cbRealData ;X5w:/J},SCSZ4+3vIh18Aw3v5DJ5J1J}>] 
	 * @return true:3I9&, false:J'0\
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
	 * IhVCJ5J1<`JSJ}>];X5w--@)U9
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5 
	 * @param cbRealData ;X5w:/J},SCSZ4+3vIh18Aw3v5DJ5J1J}>] 
	 * @param dwFlag J}>]@`PM,JG04N;@45D,?IRTWi:O,N*0x1fJ1NeVVJ}>]@`PM6<;X5w
	 * <table>
	 * <tr><td>dwFlag</td><td>J}>]@`PM </td></tr>
	 * <tr><td>0x00000001</td><td>5HM,T-@45DT-J<J}>] </td></tr>
	 * <tr><td>0x00000002</td><td>JGMPEG4/H2641jW<J}>] </td></tr>
	 * <tr><td>0x00000004</td><td>YUVJ}>] </td></tr>
	 * <tr><td>0x00000008</td><td>PCMJ}>] </td></tr>
	 * <tr><td>0x00000010</td><td>T-J<RtF5J}>] </td></tr>
	 * <tr><td>0x0000001f</td><td>RTIONeVVJ}>]@`PM </td></tr>
	 * </table>
	 * @return true:3I9&, false:J'0\
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
	 * IhVCO{O";X5w:/J}
	 * @param user O{O";X5w:/J},?IRT;X5wIh185DW4L,,Hg1(>/W4L,?IRTM(9}4K;X5w;qH!; 51IhVCN*0J11mJ>={V9;X5w 
	 * @return N^
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
	 * 04ND<~7=J=;X7E
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param recordFile B<OqND<~PEO",5104J1<d2%7EJ1V;PhLn3dFpJ<J1<d:M=aJxJ1<d,FdK{OnLn0 
	 * @param posUser =x6H;X5w:/J}
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0
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
	 * 04ND<~7=J=;X7E-@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param recordFile B<OqND<~PEO" 
	 * @param posUser =x6H;X5w:/J}
	 * @param dataUser J}>];X5w:/J} 
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0 
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
	 * 04J1<d7=J=;X7E 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param nChannelID M<OqM(5@:E,4S0?*J<,1XPkV86( 
	 * @param startTime ?*J<J1<d 
	 * @param stopTime =aJxJ1<d
	 * @param posUser =x6H;X5w:/J}
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native long          PlayBackByTime(long lLoginID, int nChannelID, NET_TIME startTime, NET_TIME stopTime, CB_fDownLoadPosCallBack posUser);
	
	/**
	 * \if ENGLISH_LANG
	 * extension interface with data recall and playback by time.
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID image channel number, must be assigned
	 * @param startTime start time 
	 * @param stopTime =aend time 
	 * @param posUser progess recall function, as: SDK_PlayBackByRecordFile 
	 * @param dataUser data recall function, as: SDK_PlayBackByRecordFileEx 
	 * @return successful return to network playback ID,failed return to 0.
	 * \else
	 * 04J1<d7=J=;X7E-@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param nChannelID M<OqM(5@:E,4S0?*J<,1XPkV86( 
	 * @param startTime ?*J<J1<d 
	 * @param stopTime =aJxJ1<d
	 * @param posUser =x6H;X5w:/J}
	 * @param dataUser J}>];X5w:/J}
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0 
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
	 * 04ND<~7=J=OBTX
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param recordFile B<OqND<~PEO"V8Uk
	 * @param sSavedFileName R*1#4f5DB<OqND<~C{,H+B7>6
	 * @param posUser OBTX=x6H;X5w:/J}
	 * @return 3I9&75;XOBTXID,J'0\75;X0
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
	 * 04J1<dOBTX
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelId M<OqM(5@:E,4S0?*J< 
	 * @param nRecordFileType B<OqND<~@`PM, QueryRecordFile =S?ZVP9XSZ nRecordFileType 5DK5Cw 
	 * @param startTime ?*J<J1<d 
	 * @param stopTime =aJxJ1<d
	 * @param sSavedFileName R*1#4f5DB<OqND<~C{,H+B7>6
	 * @param userData OBTX=x6H;X5w:/J}OBTX=x6H;X5w:/J}
	 * @return 3I9&75;XOBTXID,J'0\75;X0
	 * \endif
	 * @see StopDownload GetDownloadPos 
	 */
	public static native long          DownloadByTime(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME startTime, NET_TIME stopTime, String sSavedFileName, CB_fTimeDownLoadPosCallBack userData);
	
	public static native long          DownloadByTimeEx2(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String sSavedFileName, CB_fTimeDownLoadPosCallBack cbTimeDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, int scType, Object pReserved);
	
	public static native long          DownloadByTimeEx(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String sSavedFileName, CB_fTimeDownLoadPosCallBack cbTimeDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, Object pReserved);
	
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
	 * 2iQ/Ih18HUV>,RT7VR37=J=2iQ/
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param queryParam  2iQ/HUV>5D2NJ}75;XHUV>;:3eGx,75;X5DHUV>JGR;8v8v SDK_DEVICE_LOG_ITEM ;r SDK_DEVICE_LOG_ITEM_EX =a99Le 
	 * @param logBuffer pLogBuffer;:3eGx5D4sP!
	 * @param recLogNum 75;X=SJU5=5DHUV>LuJ}
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       QueryDeviceLog(long lLoginID, QUERY_DEVICE_LOG_PARAM queryParam, Object logBuffer[], Integer recLogNum, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitoring
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * M#V9J5J1<`JS
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5  
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see RealPlay
	 */
	public static native boolean       StopRealPlay(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitring or multi-image preview
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * M#V9J5J1<`JS--@)U9
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5   
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see RealPlay
	 */
	public static native boolean 	    StopRealPlayEx(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * open audio, currently only support self-occupied method/ If before calling this function, audio has been turned on and hPlayHandle is different, then turn off original audio and open new audio#;function is effective only when hWnd is effective.
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * 4r?*IyRt
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5   
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see RealPlay
	 */
	public static native boolean 		OpenSound(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * audio off
	 * @return true:success, false:failed
	 * \else
	 * 9X1UIyRt
	 * @return true:3I9&, false:J'0\
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
	 * IhVCRtA?
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5   
	 * @param nVolume RtA?V5,76N'0~100,0RtA?WnP!
	 * @return true:3I9&, false:J'0\
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
	 * M#V9B<OqOBTX
	 * @param lFileHandle  DownloadByRecordFile5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * M#V9B<Oq;X7E
	 * @param lPlayHandle  ;X7E>d1z,Hg PlayBackByRecordFile 5D75;XV5 
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
	 * =bBkW%M<
	 * @param lPlayHandle  AP3v5DKySP=S?Z5D75;XV5 
	 * @param strPicFileName
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/B<OqOBTX=x6H
	 * @param lFileHandle DownloadByRecordFile5D75;XV5 
	 * @param nTotalSize  OBTX5DW\3$6H,5%N;:KB 
	 * @param nDownLoadSize  RQOBTX5D3$6H,5%N;:KB 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see DownloadByRecordFile StopDownload DownloadByTime 
	 */
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
	 * 2iURB<OqND<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelId M(5@ID,4S0?*J< 
	 * @param nRecordFileType  B<OqND<~@`PM
	 * <table>
	 * <tr><td>J}V5</td><td>B<OsND<~@`PM </td></tr>
	 * <tr><td>0</td><td>KySPB<OqND<~  </td></tr>
	 * <tr><td>1</td><td>Mb2?1(>/ </td></tr>
	 * <tr><td>2</td><td>6/L,<l2b1(>/ </td></tr>
	 * <tr><td>3</td><td>KySP1(>/ </td></tr>
	 * <tr><td>4</td><td>?(:E2iQ/  </td></tr>
	 * <tr><td>5</td><td>Wi:OLu<~2iQ/ </td></tr>
	 * <tr><td>6</td><td>B<OqN;VCSkF+RFA?3$6H </td></tr>
	 * <tr><td>8</td><td>04?(:E2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V) </td></tr>
	 * <tr><td>9</td><td>2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V)  </td></tr>
	 * <tr><td>10</td><td>04WV6N2iQ/ </td></tr>
	 * <tr><td>15</td><td>75;XMxBgJ}>]=a99(=pGEMx0I) </td></tr>
	 * <tr><td>16</td><td>2iQ/KySPM8Cw4.J}>]B<OqND<~ </td></tr>
	 * </table>
	 * @param stTimeStart  B<Oq?*J<J1<d 
	 * @param stTimeEnd  B<Oq=aJxJ1<d
	 * @param cardID ?(:E
	 * @param stFileInfo 75;X5DB<OqND<~PEO"
	 * @param nFileCount  nriFileinfo;:3e5DWn4s3$6H(5%N;WV=Z,=(RiTZ(100~200)*sizeof(NET_RECORDFILE_INFO)V.<d)
	 * @param nWaitTime  5H4}J1<d 
	 * @param bTime  JG7q04J1<d2i(D?G0N^P') 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see Login PlayBackByRecordFile PlayBackByRecordFileEx PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native boolean		QueryRecordFile(long lLoginID , int nChannelId , int nRecordFileType, NET_TIME stTimeStart , NET_TIME stTimeEnd , String cardID ,  NET_RECORDFILE_INFO stFileInfo[], Integer nFileCount , int nWaitTime , boolean bTime);
	
	/**
	 * \if ENGLISH_LANG
	 * start to save real time monitoring data,save data for frong end device's monitored image,forming record file,this data is original video data sent from device terminal
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay} return value
	 * @param strFileName  real time monitor and save file name 
	 * @return true:success, false:failed
	 * \else
	 * 1#4fJ}>]N*ND<~
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5 
	 * @param strFileName  J5J1<`JS1#4fND<~C{ 
	 * @return true:3I9&, false:J'0\
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
	 * =aJx1#4fJ}>]N*ND<~
	 * @param lRealHandle  {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5   
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see SaveRealData RealPlay RealPlayEx
	 */
	public static native boolean 		StopSaveRealData(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * start to update device program
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pchFileName uodate file name 
	 * @param cbUpgrade progress recall fcuntion
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * ?*J<I}<6Ih183LPr
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pchFileName I}<6ND<~C{ 
	 * @param cbUpgrade =x6H;X5w:/J}
	 * @return 3I9&75;XI}<6>d1zID,J'0\75;X0
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
	 * 7"KMJ}>]
	 * @param lUpgradeID  I}<6>d1zID 
	 * @return true:3I9&, false:J'0\
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
	 * =aJxI}<6Ih183LPr
	 * @param lUpgradeID I}<6>d1zID 
	 * @return true:3I9&, false:J'0\
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
	 * ;qH!EdVC3IT1C{3F=S?Z
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ} 
	 * @param pOutParam Jd3v2NJ} 
	 * @param waittime 5H4}J1<d 
	 * @return 3I9&75;XTRUE,J'0\75;XFALSE,JdHk;:3eGx3$6H2;9;R275;XFALSE
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
	 * IhVCRl2=;X5w:/J}
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param cbMessData asynchronous recall function
	 * @return true:3I9&, false:J'0\
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
	 * @return return value#:0 means failed,others are handle.
	 * \else
	 * ?XVF=bBkFwTV;-Cf7V8n,=S?ZN*Rl2=7=J= nSplitType=-1J1,pEncoderChannelN* SDK_CTRL_DECTV_SCREEN @`PM,nBufLenN^P',7qTrN*byteJ}Wi,nBufLenJ}Wi3$6H
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID 
	 * @param bEnable J9D\
	 * @param nSplitType  GP8n7=J=
	 * @param pEncoderChannel  1`BkFwM(5@
	 * @param nBufLen  pEncoderChannel5D3$6H
	 * @return 75;XV5#:01mJ>J'0\,FdK|N*>d1z
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
	 * =bBkFwTV;-CfGP;;,=S?ZN*Rl2=7=J=
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nDecoderID =bBkFwID  
	 * @param lpEncoderInfo  A,=S5D1`BkFwPEO"
	 * @return 01mJ>J'0\,FdK|2;5HSZ05DV5N*3I9&,75;XR;8v>d1z
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
	 * 2iQ/=bBkFwPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param lpDecInfo =bBkFwPEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/=bBkFw51G0TVPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID 
	 * @param lpMonitorInfo A,=S5D1`BkFwPEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/=bBkM(5@PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nDecoderID 1`BkFwid 
	 * @param lpEncoderInfo 1`BkFwPEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IhVC=bBkFwTVJd3vJ9D\
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pDecTVOutEnable J9D\J}Wi
	 * @param nBufLen pDecTVOutEnable5D3$6H 
	 * @param waittime IhVC3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * Tv<S;-CfWi:O
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID 
	 * @param nSplitType GP8n7=J=,1,4,9,16 VPR;V5
	 * @param pEncoderChannnel 1`BkFwM(5@,Tv<S5=BVQ/VP5DM(5@
	 * @param nBufLen pEncoderChannnel5D3$6H
	 * @param waittime 5H4}J1<d
	 * @return 75;XWi:O;-Cf:E,3I9&5DJ1:r75;X0~32V.<d5DR;8vWi:O:E,J'0\75;X-1
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
	 * I>3};-CfWi:O
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID
	 * @param nCombinID Wi:Oid 
	 * @param waittime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * P^8D;-CfWi:O
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID 
	 * @param nCombinID Wi:OID 
	 * @param nSplitType GP8n7=J=
	 * @param pEncoderChannel 1`BkFwM(5@,BVQ/;-Cf5DKySPM(5@ 
	 * @param nBufLen  pEncoderChannnel5D3$6H
	 * @param waittime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/;-CfWi:O,nCombinID76N'0!+32
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID  TV5DID
	 * @param nCombinID Wi:OID 
	 * @param lpDecCombinInfo  =bBkFw;-CfWi:OPEO"
	 * @param waittime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVCBVQ22YWw
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID
	 * @param lpDecTourInfo  =bBkFwBVQ2PEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/BVQ22YWw
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID TV5DID
	 * @param lpDecTourInfo  =bBkFwBVQ2PEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/51G0=bBkM(5@AwPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nDecoderID 1`BkFwid 
	 * @param lpChannelStateInfo =bBkM(5@AwPEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * =bBkFw?XVFBVQ2
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nMonitorID  TV5DID
	 * @param nActionParam =bBkFw;X7E?XVF@`PM
	 * <table>
	 * <tr><td>Dec_Tour_Stop</td><td>M#V9 </td></tr>
	 * <tr><td>Dec_Tour_Start</td><td>?*J< </td></tr>
	 * <tr><td>Dec_Tour_Pause</td><td>T]M# </td></tr>
	 * <tr><td>Dec_Tour_Resume</td><td>;V84</td></tr>
	 * </table>
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IhVC;X7E=x6H;X5w:/J}
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param cbPlaybackPos  ;X7E=x6H;X5w:/J}
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		SetDecPlaybackPos(long lLoginID, CB_fDecPlayBackPosCallBack cbPlaybackPos );

	/**
	 * \if ENGLISH_LANG
	 * decoder TV playback
	 * nPlaybackMode
	 * 0 = front-end device#-by file method   DEC_PLAYBACK_FILE_PARAM  
	 * 1 = front-end device#-by time method  DEC_PLAYBACK_TIME_PARAM
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nDecoderID TV ID
	 * @param nPlaybackMode decoder playback type 
	 * @param objPlayBack playback parameter.by file method is DEC_PLAYBACK_FILE_PARAM , playback by time is  DEC_PLAYBACK_TIME_PARAM
	 * @return true:success, false:failed
	 * \else
	 * =bBkFwTV;-Cf;X7E,=S?ZN*Rl2=7=J=
	 * nPlaybackMode
	 * 0 = G06KIh18#-04ND<~7=J=   DEC_PLAYBACK_FILE_PARAM  
	 * 1 = G06KIh18#-04J1<d7=J=  DEC_PLAYBACK_TIME_PARAM
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nDecoderID TV5DID
	 * @param nPlaybackMode =bBkFw;X7E@`PM
	 * @param objPlayBack ;X7E2NJ},04ND<~7=J=J1N* DEC_PLAYBACK_FILE_PARAM ,04J1<d;X7EJ1N* DEC_PLAYBACK_TIME_PARAM
	 * @return true:3I9&, false:J'0\
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
	 * =bBkFwTV;-Cf;X7E?XVF
	 * nCtrlType\n
	 * 0 = MO6/\n
	 * 1 = 2%7E\n
	 * 2 = T]M#\n
	 * 3 = M#V9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nDecoderID TV5DID
	 * @param nCtrlType =bBkFw;X7E?XVF@`PM,Oj<{ DEC_CTRL_PLAYBACK_TYPE
	 * @param nValue ?XVFV5
	 * @param waittime 5H4}J1<d  
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		CtrlDecPlayback(long lLoginID, int nDecoderID, int nCtrlType, int nValue, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * Stop login
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * M#V9OrIh18W"2a
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * 6`;-CfJ5J1T$@@
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param hWnd 6`;-CfT$@@40?Z,?IRTIhVCN*0,N*2;OTJ>
	 * @return 3I9&75;X6`;-CfT$@@ID,J'0\75;X0
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
	 * M#V96`;-CfJ5J1T$@@
	 * @param lMultiHandle
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/J1<d6NDZJG7qSPB<OqND<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelId  M(5@:E
	 * @param nRecordFileType B<OqND<~@`PM
	 * <table>
	 * <tr><td>J}V5 </td><td>B<OsND<~@`PM</td></tr>  
	 * <tr><td>0</td><td>KySPB<OqND<~</td></tr>  
	 * <tr><td>1</td><td>Mb2?1(>/ </td></tr>
	 * <tr><td>2</td><td>6/L,<l2b1(>/ </td></tr>
	 * <tr><td>3</td><td>KySP1(>/ </td></tr>
	 * <tr><td>4</td><td> ?(:E2iQ/  </td></tr>
	 * <tr><td>5</td><td>Wi:OLu<~2iQ/ </td></tr>
	 * </table>
	 * @param tmStart FpJ<J1<d
	 * @param tmEnd =aJxJ1<d
	 * @param pchCardid ?(:E(2iQ/@`PMN*?(:E2iQ/J1SPP',FdK{Gi?vLnNULL) 
	 * @param bResult Jd3v2NJ},true1mJ>SPB<Oq,false1mJ>C;SPB<Oq 
	 * @param waittime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * ?XVF2%7E7=Or--U}7E;rU_597E
	 * @param lPlayHandle ;X7E>d1z,Hg PlayBackByRecordFile 5D75;XV5 
	 * @param bBackward JG7q597E,TZ bBackward = TRUE J1597E,TZ bBackward = FALSE J1U}7E 
	 * @return true:3I9&, false:J'0\
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
	 * J5J1IO4+VGD\7VNvJ}>]#-M<F,(@)U9=S?Z,bNeedPicFile1mJ>JG7q6)TDM<F,ND<~,Reserved@`PMN*  RESERVED_PARA ) 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E
	 * @param dwAlarmType 1(>/@`PM,2N<{ CB_fAnalyzerDataCallBack
	 * @param bNeedPicFile JG7q6)TDM<F,ND<~,1-6)TDM<F,ND<~,TZ;X5w:/J}VP;a75;XVGD\M<F,PEO",0-2;6)TDM<F,ND<~,TZ;X5w:/J}VP2;;a75;XVGD\M<F,PEO"(TZ2;PhR*M<F,PEO"J1,?I<uIYMxBgAwA?) 
	 * @param cbAnalyzerData VGD\J}>]7VNv;X5w:/J}
	 * @param Reserved 1#At2NJ}
	 * @return J'0\75;X0,3I9&75;XJ5J1>d1z,=+WwN*O`9X:/J}5D2NJ}
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
	 * OBTX@kO_VGD\7VNvJ}>]#-M<F,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID  M(5@:E
	 * @param dwAlarmType  1(>/@`PM,Oj<{:j{@link com.company.NetSDK.FinalVar#EVENT_IVS_ALL EVENT_IVS_ALL}5H:j6(Re
	 * @param lpStartTime  ?*J<J1<d 
	 * @param lpEndTime  =aJxJ1<d
	 * @param cbAnalyzerData  VGD\J}>]7VNv;X5w:/J}
	 * @return 75;XOBTX>d1z
	 * \endif
	 * @see StopLoadPic
	 */
	public static native long  			LoadOffLineFile(long lLoginID, int nChannelID, int dwAlarmType, NET_TIME_EX lpStartTime, NET_TIME_EX lpEndTime, CB_fAnalyzerDataCallBack cbAnalyzerData);

	/**
	 * \if ENGLISH_LANG
	 * stop uploading intelligent analysis data#-image
	 * @param lAnalyzerHandle  RealLoadPicture return value  
	 * @return true:success, false:failed
	 * \else
	 * M#V9IO4+VGD\7VNvJ}>]#-M<F,
	 * @param lAnalyzerHandle  RealLoadPicture 75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * 1(>/84N;
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param dwAlarmType @)U91(>/@`PM
	 * @param nChannel M(5@:E
	 * @param pReserved 1#At
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVCM(5@8(BkAwB<OqW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pRSBuffer B<OqW4L,;:3eGx,W\3$6HN*M(5@8vJ},0:2;B<Oq;1:JV6/B<Oq;2:WT6/B<Oq
	 * @param nRSBufferlen B<OqW4L,8vJ},C?R;8vM(5@N*18vWV=Z
	 * @param pReserved 1#At2NJ} 
	 * @return true:3I9&, false:J'0\
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
	 * >5M7>[=9?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E
	 * @param dwFocusCommand 0N*>[=95w=Z   1N*A,Px>[=95w=Z  2N*WT6/>[=95w=Z,5w=Z=95cVAWn<QN;VCnFocus:MnZoomN^P'
	 * @param dFocus O`6T>[=91d;/KYBJ FdV5N*-1~1,01mJ>M#V9
	 * @param dZoom O`6T1d16KYBJ FdV5N*-1~1,01mJ>M#V9
	 * @param reserved 1#At
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		FocusControl(long lLoginID, int nChannelID, long dwFocusCommand, double dFocus, double dZoom, int reserved , int waittime);

	
	/**
	 * \if ENGLISH_LANG
	 * turn off search handle
	 * @param lFindHandle FindFileEx return value 
	 * @return true:success, false:failed
	 * \else
	 * =aJxB<OqND<~2iUR
	 * @param lFindHandle FindFileEx5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * M#V9OBTXJ}>]
	 * @param lFileHandle  {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * T]M#VGD\7VNvJ}>]OBTX
	 * @param lLoadHadle  TXHk>d1z , DownloadMediaFile
	 * @param bPause  JG7qT]M#OBTX, TRUE1mJ>T]M#OBTX, FALSE1mJ>;V84OBTX
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		PauseLoadPic(long lLoadHadle, boolean bPause);
	
	/**
	 * \if ENGLISH_LANG
	 * special interface,used to send web info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param szInBuffer  data sent to device 
	 * @param szOutBuffer size of data sent to device 
	 * @param waittime overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * webM84+=S?Z
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param szInBuffer  4+KM8xIh185DJ}>]
	 * @param szOutBuffer Ih1875;X8xweb5DJ}>]
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * M(SCTFL(?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID  M(5@:E
	 * @param dwPTZCommand TFL(?XVFC|An 
	 * <table>
	 * <tr><td>2YWw@`PM</td><td>9&D\ </td></tr>
	 * <tr><td>PTZ_UP_CONTROL</td><td>IO </td></tr>
	 * <tr><td>PTZ_DOWN_CONTROL</td><td>OB </td></tr>
	 * <tr><td>PTZ_LEFT_CONTROL	</td><td>Ws </td></tr>
	 * <tr><td>PTZ_RIGHT_CONTROL</td><td>SR </td></tr>
	 * <tr><td>PTZ_ZOOM_ADD_CONTROL	</td><td>1d16+</td></tr>
	 * <tr><td>PTZ_ZOOM_DEC_CONTROL</td><td>1d16-</td></tr>
	 * <tr><td>PTZ_FOCUS_ADD_CONTROL</td><td>5w=9+ </td></tr>
	 * <tr><td>PTZ_FOCUS_DEC_CONTROL</td><td>5w=9-</td></tr> 
	 * <tr><td>PTZ_APERTURE_ADD_CONTROL</td><td>9bH&+</td></tr>
	 * <tr><td>PTZ_APERTURE_DEC_CONTROL</td><td>9bH&-</td></tr>
	 * <tr><td>PTZ_POINT_MOVE_CONTROL</td><td>W*VAT$VC5c </td></tr>
	 * <tr><td>PTZ_POINT_SET_CONTROL</td><td>IhVC </td></tr>
	 * <tr><td>PTZ_POINT_DEL_CONTROL</td><td>I>3} </td></tr>
	 * <tr><td>PTZ_POINT_LOOP_CONTROL</td><td>5c<dBVQ- </td></tr>
	 * <tr><td>PTZ_LAMP_CONTROL</td><td>5F9bSjK" </td></tr>
	 * </table>
	 * @param dwStep 2==x/KY6H,76N'1~8,8?XVFP'9{WnCwOT,2YWwT$VC5cJ1dwStepN*T$VC5cV5
	 * @param dwStop JG7qM#V9,TRUE,1mJ>M#V96TTFL(0K7=Or2YWw<0>5M72YWwC|AnSPP',=xPPFdK{2YWwJ1,1>2NJ}S&Ln3dFALSE
	 * @return true:3I9&, false:J'0\
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
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>leftup</td><td>vertical speed(1#-8)	</td><td>horizontal speed(1#-8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>	rightup</td><td>vertical speed(1#-8)</td><td>horizontal speed(1#-8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>leftdown</td><td>vertical speed(1#-8)</td><td>horizontal speed(1#-8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>rightdown</td><td>vertical speed(1#-8)</td><td>horizontal speed(1#-8)</td><td> </td></tr>
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
	 * 4s;*TFL(?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E
	 * @param dwPTZCommand  Gr;z?XVFC|An,Oj<{  SDK_EXTPTZ_ControlType SDK_PTZ_ControlType SDK_EXTPTZ_ControlType <fH] PTZControl =S?Z,param2O`51SZ2NJ}dwStep,M,J1@)U9V'3VRTOB9&D\ 
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>9&D\</td></tr> 
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>WsIO p1K.F=KY6H, p249V1KY6H </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>SRIO p1K.F=KY6H, p249V1KY6H </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>WsOBp1K.F=KY6H, p249V1KY6H </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>SROBp1K.F=KY6H, p249V1KY6H </td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td><SHkT$VC5c5=Q2:= p1Q2:=O_B7 p2T$VC5cV5 </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>I>3}Q2:=VPT$VC5c p1Q2:=O_B7 p2T$VC5cV5 </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>Ge3}Q2:= p1Q2:=O_B7</td></tr> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>?*J<K.F=P}W* </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>M#V9K.F=P}W* </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>IhVCWs1_=g </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETRIGHTBORDER</td><td>IhVCSR1_=g </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>?*J<O_I( </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>M#V9O_I( </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>IhVCD#J=?*J< D#J=O_B7 </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>IhVCD#J==aJx D#J=O_B7 </td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>TKPPD#J= p1D#J=O_B7 </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>M#V9D#J= p1D#J=O_B7  </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>Ge3}D#J= p1D#J=O_B7 </td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>7-W*C|An </td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>?lKY6(N;,p1K.F=Wx1j,p249V1Wx1j,p31d16 </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>8(Vz?*9X?*,p18(Vz5c;8(Vz5c 23, ?*139b293%;8(Vz5c 24, ?*J}WV1d16D\;8(Vz5c 27, ?*R9JS9&D\;8(Vz5c 41, IcOq;zAA6HTv;8(Vz5c 43, ?*T$VCLbOTJ></td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>8(Vz?*9X9X ,p18(Vz5c;8(Vz5c 23, 9X139b293%;8(Vz5c 24, 9XJ}WV1d16D\;8(Vz5c 27, 9XR9JS9&D\;8(Vz5c 41, IcOq;zAA6H<u;8(Vz5c 43, 9XT$VC1jLbOTJ></td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>4r?*Gr;z2K5% </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>9X1U2K5% </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>2K5%H76( </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>2K5%H!O{ </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>2K5%IO </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>2K5%OB </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>2K5%Ws </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>2K5%SR </td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>1(>/A*6/TFL( </td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>>XUsGP;; </td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>5F9b?XVFFw </td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>H}N,>+H76(N; </td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>H}N,6(N;VXIhAcN; </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>IO + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>OB + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>Ws + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>SR + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>WsIO + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>WsOB + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>SRIO + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>SROB + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>IO + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>OB + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>Ws + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>SR + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>WsIO + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>WsOB + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>SRIO + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>SROB + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>Wn4sC|AnV5 </td></tr>
	 * </table>
	 * <table>
	 * TFL(C|AndwPTZCommand:M2NJ}(param1,param2,param3)V.<d5D9XO51m
	 * <tr><td>dwPTZCommand						9&D\ChJv				param1							param2								param3 </td></tr>
	 * <tr><td>SDK_PTZ_UP_CONTROL</td><td>IO</td><td> </td><td>49V1KY6H(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_DOWN_CONTROL</td><td>OB </td><td> </td><td>49V1KY6H(1-8)</td><td> </td><td>
	 * <tr><td>SDK_PTZ_LEFT_CONTROL</td><td>Ws</td><td> </td><td> K.F=KY6H(1-8) </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_RIGHT_CONTROL</td><td>SR	</td><td> </td><td>K.F=KY6H(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_ZOOM_ADD_CONTROL</td><td>1d16+	</td><td> </td><td>16KY </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_ZOOM_DEC_CONTROL</td><td>1d16-	</td><td> </td><td>16KY  </td><td> </td><td>
	 * <tr><td>SDK_PTZ_FOCUS_ADD_CONTROL</td><td>5w=9+</td><td> </td><td>16KY</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_FOCUS_DEC_CONTROL</td><td>5w=9-</td><td> </td><td>16KY</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_APERTURE_ADD_CONTROL</td><td>9bH&+</td><td> </td><td>16KY </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_MOVE_CONTROL</td><td>W*VAT$VC5c</td><td> </td><td>T$VC5cV5</td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_SET_CONTROL</td><td>IhVC	</td><td> </td><td>T$VC5cV5</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_DEL_CONTROL</td><td>I>3}	</td><td> </td><td>T$VC5cV5</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_LOOP_CONTROL</td><td>5c<dBVQ-</td><td> </td><td> </td><td>76:?*J<,99:WT6/,96:M#V9</td><td> 
	 * <tr><td>SDK_PTZ_LAMP_CONTROL	</td><td>5F9bSjK"</td><td>0x01?*Ft,x009X1U</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>WsIO</td><td>49V1KY6H(1#-8)	</td><td>K.F=KY6H(1#-8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>SRIO</td><td>49V1KY6H(1#-8)</td><td>K.F=KY6H(1#-8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>WsOB </td><td>49V1KY6H(1#-8)</td><td>K.F=KY6H(1#-8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>SROB</td><td>49V1KY6H(1#-8)</td><td>K.F=KY6H(1#-8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td><SHkT$VC5c5=Q2:=</td><td>Q2:=O_B7 </td><td>T$VC5cV5 </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>I>3}Q2:=VPT$VC5c</td><td> Q2:=O_B7	</td><td>T$VC5cV5</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP	</td><td>Ge3}Q2:=</td><td> Q2:=O_B7  </td><td> </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>?*J<K.F=P}W* </td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>M#V9K.F=P}W*</td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>IhVCWs1_=g  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTBORDER</td><td>IhVCSR1_=g </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN	</td><td>?*J<O_I(  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN	</td><td>M#V9O_I(</td><td> </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>IhVCD#J=?*J<</td><td>D#J=O_B7   </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>IhVCD#J==aJx</td><td>D#J=O_B7</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>TKPPD#J=	</td><td>D#J=O_B7 </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>M#V9D#J=</td><td>D#J=O_B7 </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>Ge3}D#J=</td><td>D#J=O_B7</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>7-W*C|An </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>?lKY6(N;</td><td>K.F=Wx1j</td><td>49V1Wx1j </td><td>1d16 
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>8(Vz?*9X?*</td><td> 8(Vz5c</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>8(Vz?*9X9X</td><td>8(Vz5c</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>4r?*Gr;z2K5%</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>9X1U2K5%</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>2K5%H76(</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>2K5%H!O{</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>2K5%IO  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>2K5%OB </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>2K5%Ws </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>2K5%SR</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>1(>/A*6/TFL( </td><td>1(>/JdHkM(5@ </td><td>1(>/A*6/@`PM1-T$VC5c2-O_I(3-Q2:=</td><td>A*6/V5,HgT$VC5c:E 
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>>XUsGP;;</td><td><`JSFw:E(JSF5Jd3v:E)</td><td>JSF5JdHk:E</td><td>>XUs:E 
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>5F9b?XVFFw</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>H}N,>+H76(N;</td><td>K.F==G6H(0~3600)</td><td>49V1Wx1j(0~900)</td><td>1d16(1~128) 
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>H}N,6(N;VXIhAcN;  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>IO + TELE</td><td>KY6H(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>OB + TELE</td><td>KY6H(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>Ws + TELE	</td><td>KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>SR + TELE</td><td>KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>WsIO + TELE</td><td>KY6H(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>WsOB + TELE</td><td> KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>SRIO + TELE	</td><td>KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>SROB + TELE</td><td>KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>IO + WIDE</td><td> KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>OB + WIDE</td><td> KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>Ws + WIDE</td><td>KY6H(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>SR + WIDE</td><td>KY6H(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>WsIO + WIDE</td><td>KY6H(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>WsOB + WIDE</td><td> KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>SRIO + WIDE</td><td>KY6H(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>SROB + WIDE</td><td>KY6H(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>Wn4sC|AnV5 </td><td> </td><td> </td><td> </td><td>   
	 * </table>
	 * @param param1 2NJ}1
	 * @param param2 2NJ}2
	 * @param param3 2NJ}3
	 * @param dwStop  JG7qM#V9,6TTFL(0K7=Or2YWw<0>5M72YWwC|AnSPP',=xPPFdK{2YWwJ1,1>2NJ}S&Ln3dFALSE 
	 * @return true:3I9&, false:J'0\
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
	 * ?*J<2iURB<OqND<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E,4S0?*J<
	 * @param nRecordFileType  B<OqND<~@`PM
	 * <table>
	 * <tr><td>V5</td><td>4z1mB<OsND<~@`PM </td></tr>
	 * <tr><td><tr><td>0</td><td>KySPB<OqND<~ </td></tr>
	 * <tr><td>1</td><td>Mb2?1(>/  </td></tr>
	 * <tr><td>2</td><td>6/L,<l2b1(>/ </td></tr>
	 * <tr><td>3</td><td>KySP1(>/ </td></tr>
	 * <tr><td>4</td><td>?(:E2iQ/ </td></tr>
	 * <tr><td>5</td><td>Wi:OLu<~2iQ/ </td></tr>
	 * <tr><td>6</td><td>B<OqN;VCSkF+RFA?3$6H </td></tr>
	 * <tr><td>8</td><td>04?(:E2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V) </td></tr>
	 * <tr><td>9</td><td>2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V)  </td></tr>
	 * <tr><td>10</td><td>04WV6N2iQ/ </td></tr>
	 * <tr><td>15</td><td>75;XMxBgJ}>]=a99(=pGEMx0I)</td></tr> 
	 * <tr><td>16</td><td>2iQ/KySPM8Cw4.J}>]B<OqND<~ </td></tr>
	 * </table>
	 * @param cardid ?(:E,V;Uk6T?(:E2iQ/SPP',FdK{5DGi?vLnNULL 
	 * @param time_start 2iQ/B<Oq?*J<J1<d
	 * @param time_end 2iQ/B<Oq=aJxJ1<d
	 * @param bTime JG7q04J1<d2iQ/(D?G0N^P',Lnfalse)
	 * @param waittime 5H4}J1<d 
	 * @return 3I9&75;X2iQ/>d1z,J'0\75;X0
	 * \endif
	 * @see Login FindNextFile FindClose
	 */
	public static native long          FindFile(long lLoginID, int nChannelID, int nRecordFileType, String cardid, NET_TIME time_start, NET_TIME time_end, boolean bTime, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search next video file record
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFile() FindFile}return value 
	 * @param lpFindData video file record buffering, for exporting searched video file records 
	 * @return 1#:successfully teke back one video record,0:video record exporting completes,-1:wrong parameter. 
	 * \else
	 * 2iURB<OqND<~
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFile() FindFile}5D75;XV5 
	 * @param lpFindData B<OqND<~<GB<;:3e,SCSZJd3v2iQ/5=5DB<OqND<~<GB<
	 * @return 1#:3I9&H!;XR;LuB<Oq<GB<,0#:B<Oq<GB<RQH!Mj,-1#:2NJ}3v4m
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
	 * =aJxB<OqND<~2iUR
	 * @param lFindHandle FindFile5D75;XV5 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see FindFile
	 */
	public static native boolean       FindClose(long lFindHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * change play location, as drag to play
	 * @param lPlayHandle  playback handle,as PlayBackByRecordFilereturn value 
	 * @param offsettime relative start shift time, unit second, its value is 0xffffffffJ1,invlia.
	 * @param offsetbyte relative start shift size, unit k, its value is 0xffffffffJ1,invlia.when offsettime valid,parameter invalid. offsetbyte=progress ratio*progress recall total file size 
	 * @return true:success, false:failed
	 * \else
	 * 6(N;B<Oq;X7EFpJ<5c
	 * @param lPlayHandle  ;X7E>d1z,HgPlayBackByRecordFile5D75;XV5 
	 * @param offsettime O`6T?*J<4&F+RFJ1<d,5%N;N*Ck,51FdV5N*0xffffffffJ1,8C2NJ}N^P'
	 * @param offsetbyte O`6TND<~?*J<4&F+RF4sP!,5%N;N*K,51FdV5N*0xffffffffJ1,8C2NJ}N^P'#;51offsettimeSPP'5DJ1:r,4K2NJ}N^RbReoffsetbyte==x6HLu1H@}*=x6H;X5w5DW\ND<~4sP!
	 * @return true:3I9&, false:J'0\
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
	 * T]M#;r;V84B<Oq;X7E
	 * @param lPlayHandle ;X7E>d1z,HgPlayBackByRecordFile5D75;XV5 
	 * @param bPause MxBg;X7ET]M#Sk;V842%7E2NJ} 1:T]M#,0:;V84 
	 * @return true:3I9&, false:J'0\
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
	 * ?l=xB<Oq;X7E
	 * @param lPlayHandle ;X7E>d1z,HgPlayBackByRecordFile5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * B}=xB<Oq;X7E 
	 * @param lPlayHandle ;X7E>d1z,HgPlayBackByRecordFile5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * ;V84U}3#;X7EKY6H 
	 * @param lPlayHandle ;X7E>d1z,HgPlayBackByRecordFile5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * ?*J<<`L}1(>/
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * OrIh186)TD1(>/
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * M#V96TD38vIh18UlL}O{O"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * ?*Ft<`L}
	 * @param ip DbFt6/7~Nq5Dip,Hg9{V;SPR;8vMx?(,TrLn0,1mJ>6T1>;zip=xPPUlL}
	 * @param port  DbFt6/7~Nq5D6K?Z:E
	 * @param timeOut  4K2NJ}RQN^P',N*HNRbV5
	 * @param cbListen 7~Nq;X5w,HgSPIh18U}3#A,=S2"7"FpW"2a,TrM(9}8C;X5wM(V*SC;'
	 * @return 7G03I9&,0J'0\,;qH!>_Le4mNsT-Rr?I5wSCGetLastError
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
	 * M#V9<`L}
	 * @param lServerHandle  ListenServer5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * 1(>/IO4+9&D\,Ft6/7~Nq
	 * @param port  Ft6/<`L}5D6K?Z
	 * @param ip 0s6(5DIP,N*NULLJ10s6(1>;zKySP:O7(IP 
	 * @param timeOut 7~NqFwN,;$A,=S5D3,J1J1<d
	 * @param pfscb 7~NqFw5DO{O";X5w=S?Z 
	 * @return 3I9&75;X7~NqFw>d1z,J'0\75;X0
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
	 * M#V97~Nq 
	 * @param lHandle  R*9X1U5D7~NqFw5D>d1z,{@link com.company.NetSDK.INetSDK#StartService() StartService}5D75;XV5 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see StartService
	 */
	public static native boolean       StopService(long lHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Set work pattern about talk mode!"playback!"power and so on
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param emType  enumeration value,as EM_USEDEV_MODE
	 * @param pValue when type is SDK_TALK_ENCODE_TYPE,this value is structure SDKDEV_TALKDECODE_INFOdata \n
	 * when type is SDK_TALK_SPEAK_PARAM,this value is structure NET_SPEAK_PARAMdata \n
	 * when type is SDK_TALK_SPEAK_PARAM,this value is structure NET_SPEAK_PARAMdata \n
	 * when type is SDK_TALK_MODE3,this value is structure NET_TALK_EXdata \n
	 * @return true:success, false:failed
	 * \else
	 * IhVCSoRt6T=2D#J=,?M;'6K7=J=;9JG7~NqFw7=J=
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType  C6>YV5,Oj<{ EM_USEDEV_MODE
	 * @param pValue 51@`PMN* SDK_TALK_ENCODE_TYPE J1,4KV5N*=a99Le SDKDEV_TALKDECODE_INFO J}>] \n
	 * 51@`PMN* SDK_TALK_SPEAK_PARAM J1,4KV5N*=a99Le NET_SPEAK_PARAM J}>] \n
	 * 51@`PMN* SDK_RECORD_TYPE J1,4KV5N*=a99Le NET_RECORD_TYPE J}>]\n
	 * 51@`PM SDK_TALK_MODE3 J1,4KV5N*=a99Le NET_TALK_EX J}>]\n
	 * @return true:3I9&, false:J'0\
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
	 * 4r?*SoRt6T=2
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pfcb SC;'WT6(Re5DJ}>];X5w=S?Z
	 * @return 3I9&75;X:MIh186T=25D>d1z,J'0\75;X0
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
	 * 7"KMSoRtJ}>]5=Ih18
	 * @param lTalkHandle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}5D75;XV5 
	 * @param pSendBuf R*7"KM5DRtF5J}>]
	 * @return 3I9&J175;XJ5<J4+Jd8xIh185DJ}>]3$6H,J'0\75;X-1
	 * \endif
	 */
	public static native int           TalkSendData(long lTalkHandle, byte pSendBuf[]);
	
	/**
	 * \if ENGLISH_LANG
	 * stop bidirectional talk
	 * @param lTalkHandle  bidirectional talk handle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx} return value
	 * @return true:success, false:failed
	 * \else
	 * M#V9SoRt6T=2
	 * @param lTalkHandle  SoRt6T=2>d1z,{@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}5D75;XV5 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see StartTalkEx
	 */
	public static native boolean       StopTalkEx(long lTalkHandle);
	
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
	 * 2iQ/Ih18HUV>, @)U9=S?Z,?IQ!TqHUV>@`PM
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param logType HUV>@`PM,<{C6>Y SDK_LOG_QUERY_TYPE
	 * @param pLogBuffer  HUV>;:3eGx,Hg9{ reserved N*?U,=a99Le SDK_LOG_ITEM ,reserved 2;N*?U,75;X SDK_NEWLOG_ITEM 
	 * @param nLogBufferlen 75;X5DHUV>3$6H(5%N;WV=Z) 
	 * @param reserved 51DWORD dwType = 1, reserved = &dwTypeJ1,RTXML8qJ=2iQ/HUV>PEO"(D?G0=vLB-UVP5DIh18PM:EV'3V) 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2i5@M(5@B<OqW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pRSBuffer B<OqW4L,;:3eGx,W\3$6H2;D\P!SZM(5@J}, 0#:2;B<Oq#;1#:JV6/B<Oq#;2#:WT6/B<Oq
	 * @param nRSBufferlen 75;XB<OqW4L,PEO"3$6H,C?R;8vM(5@N*18vWV=Z
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * ;qH!M(5@BkAw
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param lPlayHandle  2%7EID,?IRTJGJ5J12%7EID,T$@@ID;rU_JGMxBg;X7EID,51N*0J15C5=Ih185DW\AwA? 
	 * @return 3I9&75;XAwA?V5,J'0\75;X-1
	 * \endif
	 * @see Login
	 */
	public static native int           GetStatiscFlux(long lLoginID, long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * reboot front end device
	 * @return true:success, false:failed
	 * \else
	 * VXFtIh18
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       RebootDev(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * turn off front end device
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @return true:success, false:failed
	 * \else
	 * 9X1UIh18
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * Ih18?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param type ?XVF@`PM\n
	 * ?XVF2NJ},8y>]type2;M,6x2;M,:
	 * <table>
	 * <tr><td>type</td><td>ChJv  </td><td>=a99Le         </td></tr>
	 * <tr><td>SDK_CTRL_REBOOT</td><td>VXFtIh18</td><td>  N^</td></tr>
	 * <tr><td>SDK_CTRL_SHUTDOWN</td><td>9X1UIh18 </td><td> N^</td></tr>
	 * <tr><td>SDK_CTRL_DISK</td><td>S2EL9\@m </td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_KEYBOARD_POWER<-->SDK_KEYBOARD_JMPUP</td><td>MxBg<|EL</td><td>N^</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_IN</td><td>4%7"1(>/JdHk</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_OUT</td><td>4%7"1(>/Jd3v </td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_MATRIX</td><td>>XUs?XVF </td><td>MATRIXCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SDCARD</td><td>SD?(?XVF(IPC2zF7)2NJ}M,S2EL?XVF</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_BURNING_START</td><td>?LB<;z?XVF,?*J<?LB< </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_STOP</td><td>?LB<;z?XVF,=aJx?LB<</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_ADDPWD</td><td>?LB<;z?XVF,5~<SC\Bk(RT'\0'N*=aN25DWV7{4.,Wn4s3$6H8N;)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDHEAD</td><td>?LB<;z?XVF,5~<SF,M7(RT'\0'N*=aN25DWV7{4.,Wn4s3$6H1023WV=Z,V'3V7VPP,PP7V8t7{)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDSIGN</td><td>?LB<;z?XVF,5~<S4r5c5=?LB<PEO" </td><td>N^   </td></tr>
	 * <tr><td>SDK_BURNING_ADDCURSTOMINFO</td><td>?LB<;z?XVF,WT6(Re5~<S(RT'\0'N*=aN25DWV7{4.,Wn4s3$6H1023WV=Z,V'3V7VPP,PP7V8t7{)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ATTACH</td><td>?LB<;z?XVF,8=<~?LB<</td><td> BURNING_PARM_ATTACH</td></tr>
	 * <tr><td>SDK_BURNING_PAUSE</td><td>B<T]M#</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_CONTINUE</td><td>?LB<<LPx  </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_POSTPONE</td><td>?LB<K3QS </td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_CTRL_OEMCTRL</td><td>1(M#?XVF</td><td>BOOL*</td></tr>
	 * <tr><td>SDK_CTRL_RESTOREDEFAULT</td><td>;V84Ih185DD,HOIhVC </td><td>DWORD*</td></tr>
	 * <tr><td>SDK_CTRL_CAPTURE_START</td><td>4%7"Ih18W%M<</td><td> NET_SNAP_COMMANDINFO</td></tr>
	 * <tr><td>SDK_CTRL_CLEARLOG</td><td>Ge3}HUV></td><td>SDK_LOG_QUERY_TYPE</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_WIRELESS</td><td>4%7"N^O_1(>/(IPC2zF7)</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_MARK_IMPORTANT_RECORD</td><td>1jJ6VXR*B<OqND<~</td><td>NET_RECORDFILE_INFO</td></tr>
	 * <tr><td>SDK_CTRL_DISK_SUBAREA</td><td>MxBgS2EL7VGx</td><td>DISKCTRL_SUBAREA</td></tr>
	 * <tr><td>SDK_BACKUP_START</td><td> Ih18187]?*J<</td><td>BACKUP_RECORD</td></tr>
	 * <tr><td>SDK_BACKUP_STOP</td><td> Ih18187]M#V9</td><td>char*</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_ADD</td><td>35TXJV6/Tv<SWIFIEdVC </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_DEC </td><td> 35TXJV6/I>3}WIFIEdVC  </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_BUZZER_START</td><td> 7dCyFw?XVF?*J<  </td><td> N^</td></tr>
	 * <tr><td>SDK_BUZZER_STOP</td><td>7dCyFw?XVF=aJx </td><td>  N^</td></tr>
	 * <tr><td>SDK_REJECT_USER</td><td>L^3}SC;'</td><td>SDKDEV_REJECT_USER</td></tr>
	 * <tr><td>SDK_SHIELD_USER</td><td> FA1NSC;'</td><td>SDKDEV_SHIELD_USER</td></tr>
	 * <tr><td>SDK_RAINBRUSH</td><td>VGD\=;M(, SjK"?XVF</td><td>N^</td></tr>
	 * <tr><td>SDK_MANUAL_SNAP</td><td>VGD\=;M(, JV6/W%ED </td><td> MANUAL_SNAP_PARAMETER</td></tr>
	 * <tr><td>SDK_MANUAL_NTP_TIMEADJUST</td><td>JV6/NTPP#J1</td><td> N^ </td></tr>     
	 * <tr><td>SDK_NAVIGATION_SMS</td><td> 5<:=PEO":M6LO{O"</td><td>SDKDEV_NAVIGATION_SMSS</td></tr>
	 * <tr><td>SDK_CTRL_ROUTE_CROSSING</td><td>B7O_5cN;PEO"</td><td> ROUTE_CROSSING_INFO</td></tr>
	 * <tr><td>SDK_BACKUP_FORMAT</td><td>8qJ=;/187]Ih18,187]Ih18C{3FWV7{4. </td><td>char*</td></tr>
	 * <tr><td>SDK_DEVICE_LOCALPREVIEW_SLIPT</td><td>?XVFIh186K1>5XT$@@7V8n</td><td>  DEVICE_LOCALPREVIEW_SLIPT_PARAMETER</td></tr>
	 * <tr><td>SDK_CTRL_INIT_RAID</td><td>RAID3uJ<;/,RaidC{3FWV7{4. </td><td>char*</td></tr>
	 * <tr><td>SDK_CTRL_RAID RAID</td><td>2YWw</td><td>CTRL_RAID_INFO</td></tr>
	 * <tr><td>SDK_CTRL_SAPREDISK</td><td>HH18EL2YWw  </td><td> CTRL_SPARE_DISK_INFO_A</td></tr>
	 * <tr><td>SDK_WIFI_CONNECT</td><td>JV6/7"FpWIFIA,=S </td><td> WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_WIFI_DISCONNECT</td><td>JV6/6O?*WIFIA,=S </td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN </td><td>CE={?XVF-?*CE </td><td> NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_INSERT</td><td>Lm<S<GB<,;q5C<GB<</1`:E</td><td>  NET_CTRL_RECORDSET_INSERT_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_UPDATE</td><td>8|PBD3<GB<</1`:E5D<GB<  </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_REMOVE</td><td>8y>]<GB<</1`:EI>3}D3<GB<</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_CLEAR</td><td>Ge3}KySP<GB<</PEO"</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_CLOSE</td><td>CE={?XVF-9XCE</td><td>NET_CTRL_ACCESS_CLOSE</td></tr>
	 * <tr><td>SDK_CTRL_STOP_ALARMBELL</td><td>JV6/9X1U>/:E</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>JV6/?*Ft>/:E</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>?*J<2%7ERtF5ND<~  </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_STOP_PLAYAUDIO</td><td>M#V92%7ERtF5ND<~ </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>CE={?XVF-G?VF?*CE </td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_CLEAR_ALARM </td><td>O{>/ </td><td>NET_CTRL_CLEAR_ALARM</td></tr>
	 * <tr><td>SDK_CTRL_ARMED</td><td>2<7@377@</td><td>CTRL_ARM_DISARM_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SET_BYPASS</td><td>IhVCETB7 </td><td>NET_CTRL_SET_BYPASS</td></tr>
	 * </table>
	 * @param param
	 * @param waittime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       ControlDevice(long lLoginID, int type, Object param, int waittime);
	
	public static native boolean       ControlDeviceEx(long lLoginID, int emType, Object pInBuf, Object pOutBuf, int nWaitTime);
	
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
	 * IhVCM(5@B<OqW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pRSBuffer B<OqW4L,;:3eGx,W\3$6HN*M(5@8vJ},  0#:2;B<Oq#;1#:JV6/B<Oq#;2#:WT6/B<Oq
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/IOW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType IO@`PM,2N<{ IOControl
	 * @param objArr W4L,;:3eGx,8y>]2;M,5DIO@`PM?IRTJG2;M,5DJ}>]=a99J}Wi
	 * @param nIOCount Jd3v2NJ},H!5CW4L,5DIOJ}A?
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IO?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType IO@`PM
	 * <table>
	 * <tr><td>emType</td><td>2iQ/@`PM</td><td>  6TS&=a99Le </td></tr>
	 * <tr><td>SDK_ALARMINPUT</td><td>2iQ/1(>/JdHkJG7qRQ>-4r?*</td><td>ALARM_CONTROL</td></tr> 
	 * <tr><td>SDK_ALARMOUTPUT</td><td>2iQ/1(>/Jd3vJG7qRQ>-4r?*</td><td>ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_DECODER_ALARMOUT</td><td>?XVF1(>/=bBkFwJd3v	</td><td>DECODER_ALARM_CONTROL</td></tr> 
	 * <tr><td>SDK_ALARM_TRIGGER_MODE</td><td>Q/1(>/4%7"7=J= </td><td>RIGGER_MODE_CONTROL </td></tr>
	 * </table>
	 * @param objArr W4L,;:3eGx,8y>]2;M,5DIO@`PM?IRTJG2;M,5DJ}>]=a99J}Wi
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see Login
	 */
	public static native boolean       IOControl(long lLoginID, int emType, Object[] objArr);
	
	/**
	 * \if ENGLISH_LANG
	 * forced I frame interface
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel id
	 * @param nSubChannel stream type,0-main stream 1-1 2-extra stream2 3 (Cextra stream 3
	 * @return true:success, false:failed
	 * \else
	 * G?VFIV!
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@id 
	 * @param nSubChannel BkAw@`PM,0-VwBkAw 1-8(BkAw1 2-8(BkAw2 3 (C8(BkAw3
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       MakeKeyFrame(long lLoginID, int nChannelID, int nSubChannel);
	
	/**
	 * \if ENGLISH_LANG
	 * search user info
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param info user info buffering,should be sent into one USER_MANAGE_INFO structure pointer with allocated memory#;return each user info USER_INFO password text is encrypted 
	 * @param waittime waiting time  
	 * @return true:success, false:failed
	 * \else
	 * 2iQ/SC;'PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param info SC;'PEO";:4f,S&4+=xR;8vRQ7VEd:CDZ4f5DUSER_MANAGE_INFO=a99V8Uk#;75;X8wSC;'PEO"USER_INFOVP5DpasswordWV6NJG<S9}C\5D
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		QueryUserInfo(long lLoginID, USER_MANAGE_INFO info, int waittime);
		
	/**
	 * \if ENGLISH_LANG
	 * search user info, extension interface, support 16 bit password length#;as well as 8 bit username and 8 bit password length
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param info user info buffering,should send into an allocated memory USER_MANAGE_INFO_EX structure pointer, return to user info USER_INFO_EX password text is encrypted 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 2iQ/SC;'PEO"--@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param info SC;'PEO";:4f,S&4+=xR;8vRQ7VEd:CDZ4f5D USER_MANAGE_INFO_EX =a99V8Uk, 75;X8wSC;'PEO" USER_INFO_EX VP5DpasswordWV6NJG<S9}C\5D 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/SC;'PEO"--Wn4sV'3V64M(5@Ih18
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param info SC;'PEO";:4f,S&4+=xR;8vRQ7VEd:CDZ4f5D USER_MANAGE_INFO_NEW =a99V8Uk, 75;X8wSC;'PEO" USER_MANAGE_INFO_NEW VP5DpasswordWV6NJG<S9}C\5D 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * @param opParam set user info's input buffering,>_detaield as above nOperateType 
	 * @param subParam set user info's assist input buffering,when setting type is editing info, here should send original user info,details as above nOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 2YWwIh18SC;'
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nOperateType 2YWw@`PM
	 * <table>
	 * <tr><td>J}V5 </td><td>2YWw@`PM </td><td>opParam6TS&=a99Le@`PM</td><td>subParam6TS&=a99Le@`PM </td></tr>
	 * <tr><td>0</td><td>Tv<SSC;'Wi</td><td>USER_GROUP_INFO</td><td>   </td></tr>
	 * <tr><td>1</td><td>I>3}SC;'Wi</td><td>USER_GROUP_INFO</td><td>  </td></tr>
	 * <tr><td>2</td><td>P^8DSC;'Wi</td><td>USER_GROUP_INFO</td><td>USER_GROUP_INFO </td></tr>
	 * <tr><td>3</td><td>Tv<SSC;'</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>4</td><td>I>3}SC;'</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>5</td><td>P^8DSC;'</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * <tr><td>6</td><td>P^8DSC;'C\Bk</td><td> USER_INFO	</td><td>USER_INFO </td></tr>
	 * </table>
	 * @param opParam IhVCSC;'PEO"5DJdHk;:3e
	 * @param subParam IhVCSC;'PEO"5D8(VzJdHk;:3e,51IhVC@`PMN*P^8DPEO"5DJ1:r,4K4&S&4+=x@42?7VT-J<SC;'PEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2YWwIh18SC;'--@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nOperateType 2YWw@`PM,M, OperateUserInfo
	 * @param opParam VCSC;'PEO"5DJdHk;:3e
	 * @param subParam IhVCSC;'PEO"5D8(VzJdHk;:3e,51IhVC@`PMN*P^8DPEO"5DJ1:r,4K4&S&4+=x@42?7VT-J<SC;'PEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2YWwIh18SC;'--Wn4sV'3V64M(5@Ih18
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nOperateType 2YWw@`PM,M, OperateUserInfo
	 * @param opParam VCSC;'PEO"5DJdHk;:3e
	 * @param subParam IhVCSC;'PEO"5D8(VzJdHk;:3e,51IhVC@`PMN*P^8DPEO"5DJ1:r,4K4&S&4+=x@42?7VT-J<SC;'PEO"
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 44=(M8Cw4.?ZM(5@
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param TransComType 4.?Z@`PM 0:4.?Z1:485?Z 
	 * @param baudrate 4.?Z5D2(LXBJ,1~87V1p1mJ>1200,2400,4800,9600,19200,38400,57600,115200
	 * @param databits  4.?Z5DJ}>]N;4~81mJ>4N;~8N; 
	 * @param stopbits 4.?Z5DM#V9N;11mJ>1N;,21mJ>1.5N;,31mJ>2N;
	 * @param parity 4.?Z5DM#V9N;11mJ>1N;,21mJ>1.5N;,31mJ>2N;
	 * @param cbTransCom 4.?ZJ}>];X5w,;X5w3vG06KIh187"9}@45DPEO"
	 * @return true:3I9&, false:J'0\
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
	 * M8Cw4.?Z7"KMJ}>]
	 * @param lTransComChannel M8Cw4.?ZID,=S?Z CreateTransComChannel 75;XV5
	 * @param pBuffer R*7"KM5DM8Cw4.?ZJ}>]V8Uk 
	 * @param dwBufSize R*7"KM5DM8J14.?ZJ}>]3$6H(5%N;:WV=Z)
	 * @return true:3I9&, false:J'0\
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
	 * JM7EM(Cw4.?ZM(5@
	 * @param lTransComChannel M8Cw4.?ZID,=S?ZCreateTransComChannel75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/M8Cw4.?ZW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param TransComType 4.?Z@`PM0:232;485
	 * @param pCommState 4.?ZW4L,=S?ZLe
	 * @param nWaitTime 5H4}3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/EdVCPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param dwCommand Ih18EdVCC|An,2;M,dwCommand,lpOutBuffer6TS&5D=a99Le=+;a2;M,,>_LeHgOB
	 * <table>
 	 * <tr><td>dwCommand</td><td>dwCommand:,Re </td><td>6TS&=a99Le </td></tr>
 	 * <tr><td>SDK_DEV_DEVICECFG</td><td>;qH!Ih182NJ}</td><td>SDKDEV_SYSTEM_ATTR_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG</td><td>;qH!MxBg2NJ} </td><td>SDKDEV_NET_CFG </td></tr>
	 * <tr><td>SDK_DEV_CHANNELCFG</td><td>;qH!M<OsM(5@2NJ}</td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;XSDKDEV_CHANNEL_CFG[channel_num] Hg9{lChannelN*05=Wn4sM(5@V.<d,75;X<SDKDEV_CHANNEL_CFG 
	 * <tr><td>SDK_DEV_RECORDCFG</td><td>;qH!6(J1B<Oq2NJ}	Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;XSDKDEV_RECORD_CFG[channel_num] Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;XSDKDEV_RECORD_CFG 
	 * <tr><td>SDK_DEV_COMMCFG</td><td>;qH!4.?Z2NJ}	</td><td>SDKDEV_COMM_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARMCFG</td><td>;qH!1(>/2<7@2NJ}</td><td>SDKDEV_ALARM_SCHEDULE </td></tr>
	 * <tr><td>SDK_DEV_TIMECFG</td><td>;qH!DVRJ1<d</td><td>NET_TIME </td></tr>
	 * <tr><td>SDK_DEV_PREVIEWCFG</td><td>;qH!T$@@2NJ}</td><td>SDKDEV_PREVIEW_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUTOMTCFG</td><td>;qH!WT6/N,;$EdVC	</td><td>SDKDEV_AUTOMT_CFG </td></tr>
	 * <tr><td>SDK_DEV_VEDIO_MARTIX</td><td>;qH!1>;z>XUs2_BTEdVC</td><td>SDKDEV_VIDEO_MATRIX_CFG </td></tr>
	 * <tr><td>SDK_DEV_MULTI_DDNS</td><td>;qH!6`ddns7~NqFwEdVC</td><td>SDKDEV_MULTI_DDNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG</td><td>;qH!W%M<O`9XEdVC	</td><td>SDKDEV_SNAP_CFG </td></tr>
	 * <tr><td>SDK_DEV_WEB_URL_CFG</td><td>;qH!httpB7>6EdVC	</td><td>SDKDEV_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG</td><td>ftpIO4+EdVC</td><td>SDKDEV_FTP_PROTO_CFG </td></tr>
	 * <tr><td>SDK_DEV_INTERVIDEO_CFG</td><td>F=L(=iHkEdVC,lchannel4z1mF=L(=iHk@`PM</td><td>lchannel=4,1mJ>146{F=L(,SDKDEV_INTERVIDEO_BELL_CFG!#lchannel=10,1mJ>VPPKA&N,F=L(,SDKDEV_INTERVIDEO_NSS_CFG lchannel=11,1mJ>uMxM(,SDKDEV_INTERVIDEO_UCOM_CFG!#</td></tr> 
	 * <tr><td>SDK_DEV_VIDEO_COVER</td><td>GxSrUZ52EdVC	</td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;X</td><td>SDKDEV_VIDEOCOVER_CFG[channel_num]!# Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;XSDKDEV_VIDEOCOVER_CFG!# </td></tr>
	 * <tr><td>SDK_DEV_TRANS_STRATEGY</td><td>4+Jd2_BTEdVC</td><td>SDKDEV_TRANSFER_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_STRATEGY</td><td>B<OsOBTX2_BTEdVC	</td><td>SDKDEV_DOWNLOAD_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_WATERMAKE_CFG</td><td>M<OsK.S!EdVC</td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;XSDKDEV_WATERMAKE_CFG[channel_num]!# Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;XSDKDEV_WATERMAKE_CFG!# </td></tr>
	 * <tr><td>SDK_DEV_WLAN_CFG</td><td>EdVCN^O_MxBgPEO"</td><td>SDKDEV_WLAN_INFO </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG</td><td>KQKwN^O_Ih18</td><td>SDKDEV_WLAN_DEVICE_LIST </td></tr>
	 * <tr><td>SDK_DEV_REGISTER_CFG</td><td>Vw6/W"2a2NJ}EdVC</td><td>SDKDEV_REGISTER_SERVER </td></tr>
	 * <tr><td>SDK_DEV_CAMERA_CFG</td><td>IcOqM7JtPTEdVC</td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;XSDKDEV_CAMERA_CFG[channel_num]!# Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;XSDKDEV_CAMERA_CFG!# </td></tr>
	 * <tr><td>SDK_DEV_INFRARED_CFG</td><td>:lMb1(>/2NJ}</td><td>SDK_INFRARED_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAIL_CFG</td><td>SJ<~EdVC	</td><td>SDKDEV_MAIL_CFG </td></tr>
	 * <tr><td>SDK_DEV_DNS_CFG</td><td>DNS7~NqFwEdVC</td><td>SDKDEV_DNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_NTP_CFG</td><td>NTPEdVC</td><td>SDKDEV_NTP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG</td><td>SnifferW%0|EdVC</td><td>SDKDEV_SNIFFER_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUDIO_DETECT_CFG</td><td>RtF5<l2b1(>/2NJ}</td><td>SDK_AUDIO_DETECT_CFG </td></tr>
	 * <tr><td>SDK_DEV_STORAGE_STATION_CFG</td><td>4f4"N;VCEdVC</td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;X SDK_STORAGE_STATION_CFG[channel_num]!# Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;X SDK_STORAGE_STATION_CFG!#</td></tr> 
	 * <tr><td>SDK_DEV_DST_CFG</td><td>ODAnJ1EdVC </td><td>SDKDEV_DST_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEO_OSD_CFG</td><td>JSF5OSD5~<SEdVC </td><td>Hg9{lChannelN*-1,1mJ>;qH!H+2?M(5@,75;X SDK_DVR_VIDEOOSD_CFG[channel_num]!# Hg 9{lChannelN*05=Wn4sM(5@V.<d,75;X SDK_DVR_VIDEOOSD_CFG!# </td></tr>
	 * <tr><td>SDK_DEV_ALARM_CENTER_CFG</td><td>1(>/VPPDEdVC </td><td>ALARMCENTER_UP_CFG </td></tr>
	 * <tr><td>SDK_DEV_CDMAGPRS_CFG</td><td>CDMA!"GPRSMxBgEdVC</td><td>SDKDEV_CDMAGPRS_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFGIP</td><td>9}BKEdVC	</td><td>SDKDEV_IPIFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TALK_ENCODE_CFG</td><td>SoRt6T=21`BkEdVC</td><td>SDKDEV_TALK_ENCODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_RECORD_PACKET_CFG</td><td>B<Oq4r0|3$6HEdVC</td><td>SDKDEV_RECORD_PACKET_CFG </td></tr>
	 * <tr><td>SDK_DEV_MMS_CFG</td><td>6LPEMMSEdVC	</td><td>SDKDEV_MMS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SMSACTIVATION_CFG</td><td>6LPE<$;nN^O_A,=SEdVC</td><td>SDKDEV_SMSACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_DIALINACTIVATION_CFG	</td><td>2&:E<$;nN^O_A,=SEdVC</td><td>SDKDEV_DIALINACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG_EX</td><td>MxBgW%0|EdVC</td><td>SDK_ATM_SNIFFER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_RATE_CFG</td><td>OBTXKY6HO^VF</td><td>int </td></tr>
	 * <tr><td>SDK_DEV_PANORAMA_SWITCH_CFG</td><td>H+>0GP;;1(>/EdVCALARM_PANORAMA_SWITCH_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOST_FOCUS_CFG</td><td>J'H%=95c1(>/EdVCALARM_LOST_FOCUS_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARM_DECODE_CFG</td><td>1(>/=bBkFwEdVC</td><td>SDK_ALARMDEC_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEOOUT_CFG</td><td>JSF5Jd3v2NJ}EdVC	</td><td>DEV_VIDEOOUT_INFO </td></tr>
	 * <tr><td>SDK_DEV_POINT_CFG</td><td>T$VF5cJ9D\EdVC </td><td>SDKDEV_POINT_CFG </td></tr>
	 * <tr><td>SDK_DEV_IP_COLLISION_CFG</td><td>Ip3eM;<l2b1(>/EdVC</td><td>ALARM_IP_COLLISION_CFG</td></tr> 
	 * <tr><td>SDK_DEV_OSD_ENABLE_CFGOSD</td><td>5~<SJ9D\EdVC</td><td>SDKDEV_OSD_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_CFG</td><td>1>5X1(>/EdVC</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETALARM_CFG</td><td>MxBg1(>/EdVC	</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_MOTIONALARM_CFG</td><td>6/<l1(>/EdVC</td><td>SDK_MOTION_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_VIDEOLOSTALARM_CFG</td><td>JSF56*J'1(>/EdVC </td><td>SDK_VIDEO_LOST_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_BLINDALARM_CFG</td><td>JSF5UZ521(>/EdVC </td><td>SDK_BLIND_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DISKALARM_CFG</td><td>S2EL1(>/EdVC </td><td>SDK_DISK_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETBROKENALARM_CFG</td><td>MxBgVP6O1(>/EdVC</td><td>SDK_NETBROKEN_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG</td><td>J}WVM(5@5DG06K1`BkFwPEO"</td><td>DEV_ENCODER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TV_ADJUST_CFGTV</td><td>5w=ZEdVC </td><td>SDKDEV_TVADJUST_CFG </td></tr>
	 * <tr><td>SDK_DEV_ABOUT_VEHICLE_CFG</td><td>35TXO`9XEdVC,11>)9+=;J9SC	</td><td>SDKDEV_ABOUT_VEHICLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_ABILITY</td><td>;qH!atm5~<SV'3VD\A&PEO"</td><td>SDKDEV_ATM_OVERLAY_GENERAL </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG</td><td>atm5~<SEdVC,PBatmLXSP	</td><td>SDKDEV_ATM_OVERLAY_CONFIG </td></tr>
	 * <tr><td>SDK_DEV_DECODER_TOUR_CFG</td><td>=bBkFw=bBkBVQ2EdVC 	</td><td>SDKDEV_DECODER_TOUR_CFG </td></tr>
	 * <tr><td>SDK_DEV_SIP_CFG</td><td>SIPEdVC	</td><td>SDKDEV_SIP_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG</td><td>WIFI APEdVC</td><td>SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG </td></tr>
	 * <tr><td>SDK_DEV_STATICALARM_CFG</td><td>>2L,1(>/EdVC</td><td>SDK_STATIC_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODE_POLICY_CFG</td><td>Ih185D=bBk2_BTEdVC</td><td>SDKDEV_DECODEPOLICY_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACHINE_CFG</td><td>;zFwO`9X5DEdVC</td><td>SDKDEV_MACHINE_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAC_COLLISION_CFG</td><td>MAC3eM;<l2bEdVC	</td><td>ALARM_MAC_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RTSP_CFG	RTSP</td><td>EdVC	</td><td>SDKDEV_RTSP_CFG </td></tr>
	 * <tr><td>SDK_DEV_232_COM_CARD_CFG</td><td>2324.?Z?(:EPE:EJB<~EdVC</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_485_COM_CARD_CFG</td><td>4854.?Z?(:EPE:EJB<~EdVC	</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG_EX</td><td>FTPIO4+@)U9EdVC	</td><td>SDKDEV_FTP_PROTO_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_SYSLOG_REMOTE_SERVER</td><td>YSLOG T63L7~NqFwEdVC</td><td>SDKDEV_SYSLOG_REMOTE_SERVER </td></tr>
	 * <tr><td>SDK_DEV_COMMCFG_EX</td><td>@)U94.?ZJtPTEdVC</td><td>SDKDEV_COMM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETCARD_CFG</td><td>?(?ZPEO"EdVC	</td><td>SDKDEV_NETCARD_CFG </td></tr>
	 * <tr><td>SDK_DEV_BACKUP_VIDEO_FORMAT</td><td>JSF5187]8qJ=EdVC</td><td>SDKDEV_BACKUP_VIDEO_FORMAT </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_CFG</td><td>BkAw<SC\EdVC	SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFG_EXIP</td><td>9}BKEdVC@)U9</td><td>SDKDEV_IPIFILTER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_CUSTOM_CFG</td><td>SC;'WT6(ReEdVC</td><td>SDKDEV_CUSTOM_CFG </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG_EX</td><td>KQKwN^O_Ih18@)U9EdVC</td><td>SDKDEV_WLAN_DEVICE_LIST_EX </td></tr>
	 * <tr><td>SDK_DEV_ACC_POWEROFF_CFG</td><td>ACC6OO_JB<~EdVC	</td><td>SDKDEV_ACC_POWEROFF_CFG </td></tr>
	 * <tr><td>SDK_DEV_EXPLOSION_PROOF_CFG</td><td>7@1,:P1(>/JB<~EdVC</td><td>SDKDEV_EXPLOSION_PROOF_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG_EX</td><td>MxBg@)U9EdVC</td><td>SDKDEV_NET_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_LIGHTCONTROL_CFG</td><td>5F9b?XVFEdVC	</td><td>SDKDEV_LIGHTCONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_3GFLOW_CFG</td><td>3GAwA?PEO"EdVC	</td><td>SDKDEV_3GFLOW_INFO_CFG</td></tr> 
	 * <tr><td>SDK_DEV_IPV6_CFG</td><td>IPv6EdVC	</td><td>SDKDEV_IPV6_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNMP_CFG</td><td>SnmpEdVC	</td><td>SDKDEV_NET_SNMP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CONTROL_CFG</td><td>W%M<?*9XEdVC </td><td>SDKDEV_SNAP_CONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_GPS_MODE_CFGGPS</td><td>6(N;D#J=EdVC</td><td>SDKDEV_GPS_MODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_UPLOAD_CFG</td><td>M<F,IO4+EdVCPEO" </td><td>SDKDEV_SNAP_UPLOAD_CFG </td></tr>
	 * <tr><td>SDK_DEV_SPEED_LIMIT_CFG</td><td>O^KYEdVCPEO" </td><td>SDKDEV_SPEED_LIMIT_CFG </td></tr>
	 * <tr><td>SDK_DEV_ISCSI_CFG</td><td>iSCSIEdVC </td><td>SDKDEV_ISCSI_CFG </td></tr>
	 * <tr><td>SDK_DEV_WIRELESS_ROUTING_CFG</td><td>N^O_B7SIEdVC </td><td>SDKDEV_WIRELESS_ROUTING_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_CFG</td><td>5gWSN'@8EdVC </td><td>SDKDEV_ENCLOSURE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_VERSION_CFG</td><td>5gWSN'@80f1>:EEdVC </td><td>SDKDEV_ENCLOSURE_VERSION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RIAD_EVENT_CFG</td><td>RaidJB<~EdVC </td><td>SDKDEV_RAID_EVENT_CFG </td></tr>
	 * <tr><td>SDK_DEV_FIRE_ALARM_CFG</td><td>;p>/1(>/EdVC </td><td>SDKDEV_FIRE_ALARM_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_NAME_CFG</td><td>1>5XC{3F1(>/EdVC </td><td>Name1&&name2&&name3...8qJ=WV7{4. </td></tr>
	 * <tr><td>SDK_DEV_URGENCY_RECORD_CFG</td><td>=t<14f4"EdVC </td><td>SDKDEV_URGENCY_RECORD_CFG </td></tr>
	 * <tr><td>SDK_DEV_ELEVATOR_ATTRI_CFG</td><td>5gL]TKPP2NJ}EdVC</td><td>SDKDEV_ELEVATOR_ATTRI_CFG</td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG_EX</td><td>atm5~<SEdVC </td><td>SDKDEV_ATM_OVERLAY_CONFIG_EX</td></tr>
	 * <tr><td>SDK_DEV_MACFILTER_CFGMAC</td><td>9}BKEdVC </td><td>SDKDEV_MACFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_MACIPFILTER_CFG</td><td>MAC,IP9}BK	</td><td>SDKDEV_MACIPFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_TIME_CFG</td><td>BkAw<SC\(<SC\<F;.)EdVC DHEDV_STREAM_ENCRYPT</td></tr>
	 * <tr><td>SDK_DEV_LIMIT_BIT_RATE_CFG</td><td>O^BkAwEdVC </td><td>SDKDEV_LIMIT_BIT_RATE</td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG_EX</td><td>W%M<O`9XEdVC@)U9 </td><td>SDKDEV_SNAP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_DECODER_URL_CFG</td><td>=bBkFwurlEdVC </td><td>SDKDEV_DECODER_URL_CFG</td></tr>
	 * <tr><td>SDK_DEV_TOUR_ENABLE_CFG</td><td>BVQ2J9D\EdVC </td><td>SDKDEV_TOUR_ENABLE_CFG</td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG_EX</td><td>wifi apEdVC@)U9 </td><td>SDKDEV_VEHICLE_WIFI_AP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG_EX</td><td>J}WVM(5@5DG06K1`BkFwPEO"@)U9 </td><td>DEV_ENCODER_CFG_EX</td></tr>
	 * </table>
	 * @param lChannel M(5@:E,Hg9{;qH!H+2?M(5@J}>]N*0xFFFFFFFF,Hg9{C|An2;PhR*M(5@:E,8C2NJ}N^P' 
	 * @param lpOutBuffer =SJ\J}>];:3eV8Uk
	 * @param lpBytesReturned J5<JJU5=J}>]5D3$6H 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IhVCEdVCPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param dwCommand Ih18EdVCC|,Oj<{ GetDevConfig
	 * @param lChannel M(5@:E,Hg9{;qH!H+2?M(5@J}>]N*0xFFFFFFFF,Hg9{C|An2;PhR*M(5@:E,8C2NJ}N^P' 
	 * @param lpInBuffer J}>];:3eV8Uk 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/Ih18M(5@C{3F
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pChannelName  M(5@C{;:3eGx(R;0cC?8vM(5@C{JG32WV=Z3$,Ub@oPh7VEd>=16*32WV=Z3$6H5D;:3e) 
	 * @param nChannelCount ;:3eGx3$6H,(5%N;WV=Z)
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IhVCIh18M(5@C{3F
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pbuf  M(5@C{3F5D;:3e
	 * @return true:3I9&, false:J'0\
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
	 * IhVCIh18M(5@WV7{5~<S
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelNo  M<OqM(5@:E
	 * @param struOsdString WVD;DZH]
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/Ih1851G0J1<d
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pDeviceTime  =SJU5DIh18J1<dV8Uk
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * IhVCIh1851G0J1<d
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pDeviceTime IhVC5DIh18J1<dV8Uk
	 * @return true:3I9&, false:J'0\
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
	 * IhVCIh18O^VFBkAw
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param wFlux R*IhVC5DO^VFBkAw
	 * @return true:3I9&, false:J'0\
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
	 * M(9}Ih18C{WV;rU_Ih18PrAP:EOrDDNS7~NqFw2iQ/Ih18IP
	 * @param pchDVRIP DDNS7~NqFw5DIP 
	 * @param wDVRPort DDNS7~NqFw5D6K?Z:E
	 * @param sDVRName Ky2iQ/5DIh18C{
	 * @param sDVRSerialNumber  Ih18C{5D3$6H,(5%N;WV=Z)
	 * @param sGetIP 4"4fIP5XV75DV8Uk( S&SC3LPrVP7VEd,32WV=Z3$) 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       GetDVRIPByResolveSvr(String pchDVRIP, short wDVRPort, byte sDVRName[], byte sDVRSerialNumber[], char sGetIP[]);
	
	/**
	 * \if ENGLISH_LANG
	 * asynchronism search IPC, NVS and etc in LAN, start to search device
	 * @param cbSearchDevices recall function
	 * @return successful return to handle,failed return to 0
	 * \else
	 * Rl2=KQKw>VSrMxDZIPC!"NVS5HIh18
	 * @param cbSearchDevices ;X5w:/J}
	 * @return 3I9&75;X>d1z,J'0\75;X0
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
	 * M#V9Rl2=KQKw>VSrMxDZIPC!"NVS5HIh18
	 * @param lSearchHandle {@link com.company.NetSDK.INetSDK#StartSearchDevices() StartSearchDevices}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * P^8DIh18IP 
	 * @param pDevNetInfo P^8DIh185DJdHk=a99LePEO" 
	 * @param dwWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * M(9}IP2iURIh18
	 * @param pIpSearchInfo Ih18KQKwPEO"
	 * @param cbSearchDevices ;X5w:/J}
	 * @param dwWaitTime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       SearchDevicesByIPs(DEVICE_IP_SEARCH_INFO pIpSearchInfo, CB_fSearchDevicesCB cbSearchDevices, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set snapshot recall function
	 * @param OnSnapRevMessage snapshot data recall function
	 * @return true:success, false:failed
	 * \else
	 * IhVCW%M<;X5w 
	 * @param OnSnapRevMessage W%M<J}>];X5w:/J}
	 * @return N^
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
	 * W%M<GkGs
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param par W%M<=a99Le
	 * @return true:3I9&, false:J'0\
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
	 * ?LB<IO4+?*J< 75;X4K4NIO4+2YWw>d1z, W"Rb2;D\TZ fAttachBurnStateCB ;X5w:/J}@oCf5wSC
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pstInParam JdHk2NJ},Oj<{  NET_IN_FILEBURNED_START
	 * @param pstOutParam Jd3v2NJ},Oj<{ NET_OUT_FILEBURNED_START
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native long          StartUploadFileBurned(long lLoginID, NET_IN_FILEBURNED_START pstInParam, NET_OUT_FILEBURNED_START pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading file, please note cannot fAttachBurnStateCB  call function
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned} return value  
	 * @return true:successful, false: failed 
	 * \else
	 * ?LB<IO4+ND<~,W"Rb2;D\TZ fAttachBurnStateCB ;X5w:/J}@oCf5wSC
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * ?LB<IO4+M#V9,4K=S?Z2;D\TZ fBurnFileCallBack ;X5w:/J}VP5wSC
	 * @param lUploadHandle {@link com.company.NetSDK.INetSDK#StartUploadFileBurned() StartUploadFileBurned}5D75;XV5 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see StartUploadFileBurned
	 */
	public static native boolean       StopUploadFileBurned(long lUploadHandle);
	

	/**
	 * \if ENGLISH_LANG
	 * Listen writing calibration status
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login} return value  
	 * @param pstInParam input parameter,see NET_IN_ATTACH_BURN_CHECK
	 * @param pstOutParam output parameter,see NET_OUT_ATTACH_BURN_CHECK
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * <`L}?LB<P#QiW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pstInParam JdHk2NJ},Oj<{ NET_IN_ATTACH_BURN_CHECK
	 * @param pstOutParam Jd3v2NJ},Oj<{ NET_OUT_ATTACH_BURN_CHECK
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * H!O{<`L}?LB<P#QiW4L,,
	 * @param lAttachHandle {@link com.company.NetSDK.INetSDK#AttachBurnCheckState() AttachBurnCheckState}5D75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/2zF76(Re
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pstuProdDef Ih182zF76(Re
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/>XUsWS?(PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pstuCardInfo JdHk2NJ}
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/7V8nD\A&
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannel Jd3vM(5@:E 
	 * @param pstuCaps M(5@7V8nD\A&
	 * @param nWaitTime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/OTJ>T4
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannel Jd3vM(5@:E
	 * @param nWindow 40?Z:E 
	 * @param pstuSplitSrc OTJ>T4J}Wi,SC;'IjGkDZ4f 
	 * @param pnRetCount 75;X5DOTJ>T4J}A?
	 * @param nWaitTime  5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVCOTJ>T4, V'3VJd3v2NJ}
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannel Jd3vM(5@:E
	 * @param nWindow 40?Z:E
	 * @param pstuSplitSrc OTJ>T4J}Wi
	 * @param nSrcCount IhVC5DOTJ>T4J}A? 
	 * @param nWaitTime  5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/7V8nD#J=
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannel Jd3vM(5@:E
	 * @param pstuSplitSrc 7V8nD#J=PEO",SC;'7VEdDZ4f
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVC7V8nD#J=
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannel Jd3vM(5@:E
	 * @param pstuSplitSrc  7V8nD#J=PEO"
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVC40?ZN;VC
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam IhVC40?ZN;VCJdHk2NJ} 
	 * @param pOutParam IhVC40?ZN;VCJd3v2NJ}
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       SetSplitWindowRect(long lLoginID, SDK_IN_SPLIT_SET_RECT pInParam, SDK_OUT_SPLIT_SET_RECT pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get window position
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam get window input 
	 * @param pOutParam get window output 
	 * @param nWaitTime wait 
	 * @return true:success, false:failed
	 * \else
	 * ;qH!40?ZN;VC
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam ;qH!40?ZN;VCJdHk2NJ} 
	 * @param pOutParam ;qH!40?ZN;VCJd3v2NJ}
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       GetSplitWindowRect(long lLoginID, SDK_IN_SPLIT_GET_RECT pInParam, SDK_OUT_SPLIT_GET_RECT pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam open input
	 * @param pOutParam open output
	 * @param nWaitTime wait
	 * @return true:success, false:failed
	 * \else
	 * ?*40
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam ?*40JdHk2NJ}
	 * @param pOutParam ?*40Jd3v2NJ}
	 * @param nWaitTime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * ;qH!TFL(PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param dwProtocolIndex TFL(P-Ri:E
	 * @param lpOutBuffer 75;XTFL(JtPT=a99Le( PTZ_OPT_ATTR )5D;:4fGx 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 9X40
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam 9X40JdHk2NJ}
	 * @param pOutParam 9X40Jd3v2NJ}
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVC40?Z4NPr
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam Jd3vM(5@:E
	 * @param pOutParam 40?Z:E 
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * ;qH!51G0OTJ>5D40?ZPEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam ;qH!51G0OTJ>5D40?ZPEO"JdHk2NJ}
	 * @param pOutParam ;qH!51G0OTJ>5D40?ZPEO"Jd3v2NJ}
	 * @param nWaitTime 5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 5gT4?XVF
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ SDK_IN_WM_POWER_CTRL
	 * @param pOutParam Jd3v2NJ},Oj<{ SDK_OUT_WM_POWER_CTRL
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * TXHkT$08
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ SDK_IN_WM_LOAD_COLLECTION
	 * @param pOutParam Jd3v2NJ},Oj<{ SDK_OUT_WM_LOAD_COLLECTION
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 1#4fT$08
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ SDK_IN_WM_SAVE_COLLECTION
	 * @param pOutParam Jd3v2NJ},Oj<{ SDK_OUT_WM_SAVE_COLLECTION
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * ;qH!5gJSG=T$08
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ SDK_IN_WM_GET_COLLECTIONS
	 * @param pOutParam Jd3v2NJ},Oj<{ SDK_OUT_WM_GET_COLLECTIONS
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 5gJSG=T$08VXC|C{
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ SDK_IN_WM_RENAME_COLLECTION
	 * @param pOutParam Jd3v2NJ},Oj<{ SDK_OUT_WM_RENAME_COLLECTION
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START </td><td>0x0000 ?*start update file uploading(corresponding structure SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
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
	 * ND<~IO4+=S?Z
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nTransType =S?Z4+JdND<~@`PM
	 * <table>
	 * <tr><td>C6>Y@`PM</td><td>RbRe </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START</td><td>0x0000 ?*J<I}<6ND<~IO4+(6TS&=a99Le SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_SEND</td><td>0x0001 7"KMI}<6ND<~ </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_STOP</td><td>0x0002 M#V97"KMI}<6ND<~ </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STOP 0x002B</td><td>M#V9ND<~IO4+ </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN 0x002C</td><td>?LB<ND<~IO4+ </td></tr>
	 * </table>
	 * @param szInBuf nInBufLen4sSZ5HSZszInBuf=a99Le5D4sP!
	 * <table>
	 * <tr><td>C6>Y@`PM</td><td>1mJ>:,Re</td><td>szInBuf </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>8=<~?LB<ND<~IO4+ </td><td>SDKDEV_BURNFILE_TRANS_CFG </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STO</td><td>M#V9ND<~IO4+</td><td>LONG,>_LeN*?*J<ND<~IO4+:s75;X5D>d1z </td></tr>
	 * </table>
	 * @param dwUserData ;X5w:/J}
	 * @param nWaitTime 5H4}3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * IhVCOTJ>T4, V'3VJd3v2NJ}
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pInParam JdHk2NJ},Oj<{ NET_IN_SET_SPLIT_SOURCE
	 * @param pOutParam Jd3v2NJ},Oj<{ NET_OUT_SET_SPLIT_SOURCE
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * Rl2=OrIh18W"2a , nSpecCap = 0N*TCP7=J=OB5D5GHk,nSpecCap = 6N*V;=(VwA,=SOB5D5GHk
	 * @param pchDVRIP Ih18IP 
	 * @param wDVRPort Ih186K?Z
	 * @param pchUserName SC;'C{
	 * @param pchPassword SC;'C\Bk
	 * @param nSpecCap Ih18V'3V5DD\A&
	 * @param pCapParam 6TnSpecCap 5D293d2NJ},nSpecCap = 2J1,pCapParamLn3dIh18PrAP:EWV4.(35TXdvr5GB<) 
	 * @param cbLogin Rl2=W"2aIh18;X5w:/J}
	 * @return true:3I9&, false:J'0\
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
	 * 4r?*J5J1<`JS--M,2==S?Z, 8CdwUserPhR*M,J1J5OVfRealDataCallBackEx:MfRealPlayDisConnect
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID J5J1<`JSM(5@:E,Hg9{rTypeN*RType_Multiplay8C2NJ}1#At51rTypeN*RType_Multiplay_1~RType_Multiplay_16J1,nChannelID>v6(AKT$@@5D;-Cf,Hg51RType_Multiplay_4J1,nChannelIDN*4!"5!"6!"7FdVPR;8vV51mJ>T$@@5Z55=5Z7M(5@5DKD;-CfT$@@
	 * @param rType C6>Y@`PM,Oj<{  SDK_RealPlayType
	 * @param dwUser J5J1<`JSJ}>];X5w:/J}
	 * @param dwWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/D3TB5D8wLlJG7q4fTZB<OqND<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelId M(5@:E
	 * @param nRecordFileType B<OqND<~@`PM
	 * <table>
	 * <tr><td>0 </td><td>KySPB<OqND<~  </td></tr>
	 * <tr><td>1</td><td> Mb2?1(>/ </td></tr>
	 * <tr><td>2</td><td> 6/L,<l2b1(>/ </td></tr>
	 * <tr><td>3 </td><td>KySP1(>/ </td></tr>
	 * <tr><td>4</td><td> ?(:E2iQ/  </td></tr>
	 * <tr><td>5</td><td> Wi:OLu<~2iQ/</td></tr>
	 * </table> 
	 * @param tmMonth TB7] 
	 * @param pchCardid ?(:E(2iQ/@`PMN*?(:E2iQ/J1SPP',FdK{Gi?vLnNULL) 
	 * @param pRecordStatus D3TB5D8wLlJG7q4fTZB<Oq5DW4L,PEO" 
	 * @param waittime 3,J1J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * ?lKY2iQ/J1<d6NDZ5DB<OqND<~,Hg9{J1<d6NDZB<Oq3,9}16LuJ1,V;75;XJ1<dWnTg5D166NB<Oq
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelId M(5@ID,4S0?*J<
	 * @param nRecordFileType B<OqND<~@`PM\n
	 * 0 KySPB<OqND<~  \n
	 * 1 Mb2?1(>/ \n
	 * 2 6/L,<l2b1(>/ \n
	 * 3 KySP1(>/ \n
	 * 4 ?(:E2iQ/  \n
	 * 5 Wi:OLu<~2iQ/\n
	 * 6 B<OqN;VCSkF+RFA?3$6H\n
	 * 8 04?(:E2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V)\n
	 * 9 2iQ/M<F,(D?G0=vHB-U:MNVSLXJbPM:E5DIh18V'3V)\n
	 * 10 04WV6N2iQ/ \n
	 * 15 75;XMxBgJ}>]=a99(=pGEMx0I) \n
	 * 16 2iQ/KySPM8Cw4.J}>]B<OqND<~ 
	 * @param time_start B<Oq?*J<J1<d
	 * @param time_end B<Oq=aJxJ1<d
	 * @param cardid ?(:E,V;Uk6T?(:E2iQ/SPP',FdK{Gi?vOB?IRTLnNULL 
	 * @param fileinfo 75;X5DB<OqND<~PEO",JGR;8vLPNET_RECORDFILE_INFO=a99J}Wi
	 * @param filecount 75;X5DND<~8vJ},JtSZJd3v2NJ}Wn4sV;D\2i5=;:3eBzN*V95DB<Oq<GB<
	 * @param waittime 5H4}J1<d  
	 * @param bTime JG7q04J1<d2i(D?G0N^P')
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/WnTgB<OqJ1<d
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nRecordFileType B<Oq@`PM,Oj<{ QueryRecordFile
	 * @param pchCardid ?(:E,V;Uk6T?(:E2iQ/SPP',FdK{Gi?vOB?IRTLnNULL 
	 * @param pFurthrestTime 75;XWnTgB<OqPEO"=a99Le 
	 * @param nWaitTime 3,J1J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 04ND<~7=J=;X7E--;X5w;X7EVP6OJB<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param lpRecordFile B<OqND<~PEO"
	 * @param cbDownLoadPos =x6H;X5w:/J}
	 * @param fDownLoadDataCallBack  J}>];X5w:/J}
	 * @param fDisConnectCallBack JSF5<`JS6O?*;X5w:/J}
	 * @param dwWaitTime 5H4}J1<d 
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0
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
	 * 04J1<d7=J=;X7E--;X5w;X7EVP6OJB<~
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M<OqM(5@:E,1XPkV86(
	 * @param lpStartTime ?*J<J1<d
	 * @param lpStopTime =aJxJ1<d
	 * @param cbDownLoadPos =x6H;X5wSC;'2NJ}
	 * @param fDownLoadDataCallBack  J}>];X5w:/J}
	 * @param fDisConnectCallBack  JSF5<`JS6O?*;X5w:/J}
	 * @param dwWaitTime 5H4}J1<d
	 * @return 3I9&75;XMxBg;X7EID,J'0\75;X0
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
	 * JSF5E(KuND<~;X7E 
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param lpRecordFile JdHk2NJ},Oj<{ NET_SYNOPSISFILE_INFO
	 * @param cbDownLoadPos ;X7E=x6H;X5w:/J}
	 * @param fDownLoadDataCallBack ;X7EJ}>];X5w:/J}
	 * @param dwUser SC;'PEO"
	 * @return true:3I9&, false:J'0\
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
	 * 2i5@8(BkAwM(5@B<OqW4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param pRSBuffer B<OqW4L,;:3eGx,W\3$6H2;D\P!SZM(5@J}
	 * <table>
	 * <tr><td>J}V5</td><td>RbRe </td></tr>
	 * <tr><td>0</td><td>N*2;B<Oq </td></tr>
	 * <tr><td>1</td><td>JV6/B<Oq </td></tr>
	 * <tr><td>2</td><td>N*WT6/B<Oq </td></tr>
	 * </table>
	 * @param nRSBufferlen 75;XpRSBuffer;:3eVPB<OqW4L,PEO"3$6H,C?R;8vM(5@N*18vWV=Z 
	 * @param waittime 5H4}J1<d  
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/T63LIh18W4L,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nType 2iQ/@`PM
	 * <table>
	 * <tr><td>J}V5</td><td>B<OsND<~@`PM </td></tr>
	 * <tr><td>0</td><td>KySPB<OqND<~  </td></tr>
	 * <tr><td>1</td><td>Mb2?1(>/ </td></tr>
	 * <tr><td>2</td><td>6/L,<l2b1(>/ </td></tr>
	 * <tr><td>3</td><td>KySP1(>/ </td></tr>
	 * <tr><td>4</td><td>?(:E2iQ/  </td></tr>
	 * <tr><td>5</td><td>Wi:OLu<~2iQ/ </td></tr>
	 * </table>
	 * @param nChannelID M(5@:E
	 * @param pRSBuffer Jd3v2NJ},Sk2iQ/@`PM6TS&
	 * @param pRetLen Jd3vDZH]3$6H
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * 2iQ/O5M3D\A&PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nSystemType 2iQ/D\A&@`PM
	 * <table>
	 * <tr><td>6(Re</td><td>D\A&@`PM	</td><td>pSysInfoBuffer6TS&=a99Le </td></tr>
	 * <tr><td>ABILITY_DYNAMIC_CONNECT</td><td>2iQ/6/L,6`A,=SD\A&</td><td>75;XR;8vBOOL@`PM,TRUE1mJ>V'3V,FALSE1mJ>2;V'3V </td></tr>
	 * <tr><td>ABILITY_WATERMARK_CFG</td><td>K.S!EdVCD\A&</td><td>SDK_WATERMAKE_EN </td></tr>
	 * <tr><td>ABILITY_WIRELESS_CFG</td><td>wirelessEdVCD\A&</td><td>SDK_WIRELESS_EN </td></tr>
	 * <tr><td>ABILITY_DEVALL_INFO</td><td>Ih185DD\A&AP1m </td><td>SDK_DEV_ENABLE_INFO </td></tr>
	 * <tr><td>ABILITY_CARD_QUERY</td><td>?(:E2iQ/D\A&</td><td>SDK_CARD_QUERY_EN </td></tr>
	 * <tr><td>ABILITY_MULTIPLAY</td><td>6`;-CfT$@@D\A& </td><td>SDK_MULTIPLAY_EN </td></tr>
	 * <tr><td>ABILITY_QUICK_QUERY_CFG</td><td>?lKY2iQ/EdVCD\A&  </td><td>SDK_QUICK_QUERY_CFG_EN </td></tr>
	 * <tr><td>ABILITY_INFRARED</td><td>N^O_1(>/D\A&</td><td>SDK_WIRELESS_ALARM_INFO </td></tr>
	 * <tr><td>ABILITY_TRIGGER_MODE</td><td>1(>/Jd3v4%7"7=J=D\A& </td><td>75;XR;8vint@`PM,01mJ>V'3V,<01mJ>2;V'3V </td></tr>
	 * <tr><td>ABILITY_DISK_SUBAREA</td><td>MxBgS2EL7VGxD\A&</td><td>SDK_DISK_SUBAREA_EN </td></tr>
	 * <tr><td>ABILITY_DSP_CFG</td><td>MxBgDSPD\A& </td><td>SDK_DSP_CFG </td></tr>
	 * <tr><td>ABILITY_STREAM_MEDIA</td><td>2iQ/SIP,RTSPD\A&  </td><td>SDK_STREAM_MEDIA_EN </td></tr>
	 * <tr><td>ABILITY_INTELLI_TRACKER</td><td>2iQ/VGD\8zWYD\A&</td><td>SDK_INTELLI_TRACKER_EN </td></tr>
	 * </table>
	 * @param pSysInfoBuffer =SJU5DP-Ri;:3eGx
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * PBO5M3D\A&2iQ/=S?Z,2iQ/O5M3D\A&PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param szCommand C|An2NJ},Oj<{ ParseData
	 * @param nChannelID M(5@:E
	 * @param szOutBuffer =SJU5DP-Ri;:3eGx
	 * @param error 4mNs:E\n
	 * 0 3I9& \n
	 * 1 J'0\ \n
	 * 2 J}>]2;:O7( \n
	 * 3 T]J1N^7(IhVC \n
	 * 4 C;SPH(O^ 
	 * @param waittime 5H4}J1<d 
	 * @return true:3I9&, false:J'0\
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
	 * ?*J<I}<6Ih183LPr--@)U9
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType C6>YV5,Oj<{  EM_UPGRADE_TYPE
	 * @param pchFileName R*I}<65DND<~C{ 	
	 * @param cbUpgrade I}<6=x6H;X5w:/J}
	 * @return 3I9&75;XI}<6>d1zID,J'0\75;X0
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
	 * KQKw>VSrMxDZIPC!"NVS5HIh18
	 * @param szBuf SC;'?*1Y;:4f,SC@4=SJUDEVICE_NET_INFO=a99Le,2iQ/5=<88vIh18,>M75;X<88vUbQy5D=a99Le 
	 * @param nRetNum szBuf;:4f3$6H
	 * @param dwSearchTime 2iQ/5H4}J1<d
	 * @return true:3I9&, false:J'0\
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
	 * W%M<GkGs
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param par
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       SnapPictureEx(long lLoginID, SNAP_PARAMS par);
	
	/**
	 * \if ENGLISH_LANG
	 * real time upload intelligent analyasis data#-image
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param nChannelID channel NO. 
	 * @param dwAlarmType alarm type, CB_fAnalyzerDataCallBack
	 * @param cbAnalyzerData  intelligent data analysis recall function
	 * @return intelligent data analysis recall function 
	 * \else
	 * J5J1IO4+VGD\7VNvJ}>]#-M<F,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E
	 * @param dwAlarmType 1(>/@`PM, 2N<{ CB_fAnalyzerDataCallBack
	 * @param cbAnalyzerData  VGD\J}>]7VNv;X5w:/J}
	 * @return J'0\75;X0,3I9&75;XIO4+>d1z,=+WwN*O`9X:/J}5D2NJ}
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
	 * ?*J<2iURB<OqND<~#:75;XV5 0 J'0\, >0 2iUR>d1z
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType mediaND<~2iQ/Lu<~
	 * @param pQueryCondition 2iQ/Lu<~
	 * @param waittime 5H4}J1<d 
	 * @return 3I9&75;X2iQ/>d1z,J'0\75;X0
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
	 * 2iURB<OqND<~#:75;XV5 :ND<~LuJ} < nFilecount 2iQ/=aJx
	 * @param lFindHandle {@link com.company.NetSDK.INetSDK#FindFileEx() FindFileEx}5D75;XV5 
	 * @param emType PhR*2iQ/5DLuJ}
	 * @param pMediaFileInfo ND<~<GB<;:3e,SCSZJd3v2iQ/5=5DC=LeND<~<GB<
	 * @param waittime 5H4}J1<d 
	 * @return 75;XV5N*2iQ/5=5DC=LeND<~PEO"LuJ} 75;XV5P!SZnFilecountTrO`S&J1<d6NDZ5DND<~2iQ/Mj1O
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
	 * OBTXV86(5DVGD\7VNvJ}>] - M<F,
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param emType  2iQ/Lu<~
	 * @param lpMediaFileInfo  C=LeND<~PEO",4+5DJG=a99Le  MEDIAFILE_TRAFFICCAR_INFO 
	 * @param sSavedFileName  ND<~1#4fC{3F 
	 * @param cbDownLoadPos OBTX;X5w:/J} 
	 * @return OBTX:/J}>d1z
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
	 * =;M(W%ED--MxBg4%7"7=J=
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nChannelID M(5@:E
	 * @param pstInParam W%ED2NJ}
	 * @param pstOutParam W%ED75;XV5 
	 * @return true:3I9&, false:J'0\
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
	 * @param nWaitTime         waiting time
	 * @return true:success, false:failed
	 * \else
	 * 2iQ/Ih18PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5 
	 * @param nQueryType 		2iQ/@`PM
	 * @param InObject 			2iQ/JdHk2NJ}
	 * @param OutObject  		2iQ/Jd3v2NJ}
	 * @param ReservedObject	1#At2NJ}
	 * @param nWaitTime         5H4}J1<d 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		 	QueryDevInfo(long lLoginID, int nQueryType, Object InObject , Object OutObject, Object ReservedObject  , int nWaitTime );
	
	/**
	 * \if ENGLISH_LANG
	 * start local recording function,recording collected audio data via CLIENT_StartTalkEx recall user,corresponding operation is RecordStop
	 * @return true:success, false:failed
	 * \else
	 * Ft6/1>5XB<Rt9&D\,B<Rt2I</3v@45DRtF5J}>]M(9} StartTalkEx 5D;X5w:/J};X5w8xSC;',6TS&2YWwJG RecordStop
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see StartTalkEx RecordStop
	 */
	public static native boolean		RecordStart();
	
	/**
	 * \if ENGLISH_LANG
	 * stop local recording,corresponding operation is RecordStart
	 * @return true:success, false:failed
	 * \else
	 * M#V91>5XB<Rt,6TS&2YWwJGRecordStart
	 * @return true:3I9&, false:J'0\
	 * \endif
	 * @see RecordStart
	 */
	public static native boolean 		RecordStop();
	
	public static native boolean        GetDevCaps(long lLoginID, int nType, Object pInBuf, Object pOutBuf, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * @param pAudioDataBuf R*Gs=bBk5DRtF5J}>]DZH]
	 * @return true:success, false:failed
	 * \else
	 * 6TJdHk5DRtF5J}>]=xPP=bBk
	 * @param pAudioDataBuf R*Gs=bBk5DRtF5J}>]DZH]
	 * @return N^
	 * \endif
	 */
	public static native void 			AudioDec(byte[] pAudioDataBuf);
	
	/**
	 * \if ENGLISH_LANG
	 * @param src SoRtJ}>]
	 * @param dest 1`Bk:s5DJ}>]
	 * @param srclen SoRtJ}>]3$6H 
	 * @return true:success, false:failed
	 * \else
	 * SoRt2I</:s=xPP1`Bk
	 * @param src SoRtJ}>]
	 * @param dest 1`Bk:s5DJ}>]
	 * @param srclen SoRtJ}>]3$6H 
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native int           g711aEncode(byte src[], byte dest[], int srclen);
	
	/**
	 * \if ENGLISH_LANG
	 * @param src SoRtJ}>]
	 * @param dest 1`Bk:s5DJ}>]
	 * @param srclen SoRtJ}>]3$6H 
	 * @return true:success, false:failed
	 * \else
	 * SoRt2I</:s=xPP1`Bk
	 * @param src SoRtJ}>]
	 * @param dest 1`Bk:s5DJ}>]
	 * @param srclen SoRtJ}>]3$6H 
	 * @return true:3I9&, false:J'0\
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
	/**
	 * \if ENGLISH_LANG
	 * set mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @param login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * JV;z6)TDMFKMPEO", J9SCRegisterID+AppID1jJ6EdVCOn#,AppIDDZH]2;D\4x5c:E#,5c:E?IRTSCOB;.O_4zLf
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuCfg  EdVCHk2N6TOs
	 * @param nError   4mNsBk
	 * @param nRestart JG7qPhR*VXFtIh18IzP'
	 * @param nWaitTime 5H4}3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       SetMobileSubscribeCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	/**   
	 * \if ENGLISH_LANG
	 * set mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @deprecated deprecated
	 * @param login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * JV;z6)TDMFKMPEO", J9SCRegisterID+AppID1jJ6EdVCOn#,AppIDDZH]2;D\4x5c:E#,5c:E?IRTSCOB;.O_4zLf
	 * @deprecated 7OFz,SI SetMobileSubscribeCfg Lf4z
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuCfg  EdVCHk2N6TOs
	 * @param nError   4mNsBk
	 * @param nRestart JG7qPhR*VXFtIh18IzP'
	 * @param nWaitTime 5H4}3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       SetMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * delete mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuIn registerid and appid
	 * @param pstuOut error code and restart flag
	 * @param nWaitTime waiting time
	 * @returntrue:success, false:failed
	 * \else
	 * I>3}JV;z6)TDMFKMPEO", J9SCRegisterID+AppID1jJ6EdVCOn#,AppIDDZH]2;D\4x5c:E#,5c:E?IRTSCOB;.O_4zLf
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuIn registerid :M  appid
	 * @param pstuOut 4mNsBk:MVXFt1jJ6
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean       DelMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);
	
	public static native boolean       SetOptimizeMode(int emType, Object pParam);
	
	/**
	 * \if ENGLISH_LANG
	 * Set GPS subscription callback function 
	 * @param cbGPSCallBack function#,  for callBack gps info

	 * \else
	 * IhVCGPS;X5w:/J}
	 * @param cbGPSCallBack ;X5w:/J}, ;X5wGPSPEO"
	 * \endif
	 */
	public static native void		  SetSubcribeGPSCallBack(CB_fSubcribeGPSCallBack cbGPSCallBack);

	/**
	 * \if ENGLISH_LANG
	 * GPS message subscription 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param bStart start or stop
	 * @param keepTime 
	 * @param interTime
	 * @returntrue:success, false:failed
	 * \else
	 * GPSPEO"6)TD
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param bStart ?*Ft;rU_M#V9
	 * @param keepTime
	 * @param interTime
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 	 	SubcribeGPS(long lLoginID, boolean bStart, int keepTime, int interTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Set Device Position
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuIn position info
	 * @param pstuOut
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * IhVCIh185XV7PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuIn R*IhVC5DN;VCPEO"
	 * @param pstuOut
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean        SetDevicePosition(long lLoginID, NET_IN_SET_DEVICE_POSITION pstuIn, NET_OUT_SET_DEVICE_POSITION pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get Device Position
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuIn 
	 * @param pstuOut position info
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * IhVCIh185XV7PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuIn
	 * @param pstuOut R*IhVC5DN;VCPEO"
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean        GetDevicePosition(long lLoginID, NET_IN_GET_DEVICE_POSITION pstuIn, NET_OUT_GET_DEVICE_POSITION pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Snap picture by event, cooperate with RealLoadPictureEx when start with "Manaul"
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstuIn event info
	 * @param pstuOut 
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * IhVCIh185XV7PEO"
	 * @param lLoginID {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param pstuIn JB<~5DM(5@!"@`PM5HPEO"
	 * @param pstuOut
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean        SnapPictureByEvent(long lLoginID, NET_IN_SNAP_BY_EVENT pstuIn, NET_OUT_SNAP_BY_EVENT pstuOut, int nWaitTime);
	
	//
	/**
	 * \if ENGLISH_LANG
	 * attach camera state
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam input param
	 * @param pstOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 6)TDIcOqM7W4L,
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam JdHk2NJ}
	 * @param pstOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return > 03I9&#,7qTrJ'0\
	 * \endif
	 */
	public static native long           AttachCameraState(long lLoginID, NET_IN_CAMERASTATE pstInParam, NET_OUT_CAMERASTATE pstOutParam, int nWaitTime);
	

	
	/**
	 * \if ENGLISH_LANG
	 * stop detach camera state
	 * @param lAttachHandle, return from {AttachCameraState}
	 * @return true:success, false:failed
	 * \else
	 * M#V96)TDIcOqM7W4L,
	 * @param lAttachHandle  JGAttachCameraState5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean        DetachCameraState(long lAttachHandle);
	 
	/**
	 * \if ENGLISH_LANG
	 * get operator name
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * ;qH!2YWwT1SC;'C{
	 * @param lLoginID return value of{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		GetOperatorName(long lLoginID,  NET_IN_GET_OPERATOR_NAME pInParam, NET_OUT_GET_OPERATOR_NAME pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open burning session, return to burning session handle
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam input param
	 * @param pstOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return burning session handle, > 0 success, else failed
	 * \else
	 * 4r?*?LB<;a;0
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam JdHk2NJ}
	 * @param pstOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return ?LB<;a;0>d1z > 03I9&#,7qTrJ'0\
	 * \endif
	 */
	
	public static native long  			StartBurnSession(long lLoginID, NET_IN_START_BURN_SESSION pstInParam, NET_OUT_START_BURN_SESSION pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * close burning session
	 * @param lBurnSession, return from {StartBurnSession}
	 * @return true:success, false:failed
	 * \else
	 * 9X1U?LB<;a;0
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 		StopBurnSession(long lBurnSession);
	
	/**
	 * \if ENGLISH_LANG
	 * start burning
	 * @param lBurnSession, return from {StartBurnSession}
	 * @param pstInParam, 	input param
	 * @param pstOutParam,	output param
	 * @param nWaitTime,    elapse time
	 * @return true:success, false:failed
	 * \else
	 * // ?*J<?LB<
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	 * @param pstInParam,	JdHk2NJ}
	 * @param pstOutParam,	Jd3v2NJ}
	 * @param nWaitTime,	3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean 	 StartBurn(long lBurnSession, NET_IN_START_BURN pstInParam, NET_OUT_START_BURN pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop burning
	 * @param lBurnSession, return from {StartBurnSession}
	 * @return true:success, false:failed
	 * \else
	 * M#V9?LB<
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean   StopBurn(long lBurnSession);

	/**
	 * \if ENGLISH_LANG
	 * pause/recover burning
	 * @param lBurnSession, return from {StartBurnSession}
	 * @param bPause,		true-pause, false-restore
	 * @return true:success, false:failed
	 * \else
	 * T]M#/;V84?LB<
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	 * @param bPause,		true-T]M#, false-;V84
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean	   PauseBurn(long lBurnSession, boolean bpause);
	
	
	/**
	 * \if ENGLISH_LANG
	 * key mark
	 * @param lBurnSession, return from {StartBurnSession}
	 * @param pstInParam, 	input param
	 * @param pstOutParam,	output param
	 * @param nWaitTime,    elapse time
	 * @return true:success, false:failed
	 * \else
	 * VX5c1j<G
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	  * @param pstInParam,	JdHk2NJ}
	 * @param pstOutParam,	Jd3v2NJ}
	 * @param nWaitTime,	3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean	  BurnMarkTag(long lBurnSession, NET_IN_BURN_MARK_TAG pstInParam, 
												  NET_OUT_BURN_MARK_TAG pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get burning status
	 * @param lBurnSession, return from {StartBurnSession}
	 * @param pstInParam, 	input param
	 * @param pstOutParam,	output param
	 * @param nWaitTime,    elapse time
	 * @return true:success, false:failed
	 * \else
	 * ;qH!?LB<W4L,
	 * @param lBurnSession  JGStartBurnSession5D75;XV5
	  * @param pstInParam,	JdHk2NJ}
	 * @param pstOutParam,	Jd3v2NJ}
	 * @param nWaitTime,	3,J1J1<d
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean	BurnGetState(long lBurnSession, NET_IN_BURN_GET_STATE pstInParam, NET_OUT_BURN_GET_STATE pstOutParam, int nWaitTime);
	
	
	/**
	 * \if ENGLISH_LANG
	 * a attach burn state
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam input param
	 * @param pstOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * <`L}?LB<W4L,
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam JdHk2NJ}
	 * @param pstOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return > 03I9&#,7qTrJ'0\
	 * \endif
	 */
	public static native long		AttachBurnState(long lLoginID, NET_IN_ATTACH_STATE pstInParam, NET_OUT_ATTACH_STATE pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cancel listening burning status lAttachHandle is AttachBurnState return value
	 * @param lAttachHandle, return from {AttachBurnState}
	 * @return true:success, false:failed
	 * \else
	 * H!O{<`L}?LB<W4L,#,lAttachHandleJGAttachBurnState75;XV5
	 * @param lAttachHandle  JGAttachBurnState5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean    DetachBurnState(long lAttachHandle);


	/**
	 * \if ENGLISH_LANG
	 * serial data switch port,async get data
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaittime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 4.?ZJ}>]=;;%=S?Z,Rl2=;qH!J}>]
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaittime 3,J1J1<d
	 * @return > 03I9&#,7qTrJ'0\
	 * \endif
	 */
	public static native  long  	    ExChangeData(long lLoginId, NET_IN_EXCHANGEDATA pInParam,  NET_OUT_EXCHANGEDATA pOutParam, int nWaittime); 

	
	/**
	 * \if ENGLISH_LANG
	 * a attach burn state
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam input param
	 * @param cbAttachCAN callback param
	 * @param pstOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * <`L}CANW\O_J}>]
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam JdHk2NJ}
	 * @param cbAttachCAN ;X5w2NJ}
	 * @param pstOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return > 03I9&#,7qTrJ'0\
	 * \endif
	 */
    public static native  long  		AttachCAN(long lLoginID, NET_IN_ATTACH_CAN pstInParam, CB_fAttachCANCB cbAttachCAN, NET_OUT_ATTACH_CAN pstOutParam, int nWaitTime);
    
    
	/**
	 * \if ENGLISH_LANG
	 * cancel listen CAN bus data#, lAttachHandle is AttachCAN return value
	 * @param lAttachHandle, return from {AttachCAN}
	 * @return true:success, false:failed
	 * \else
	 * H!O{<`L}CANW\O_J}>]#,lAttachHandleJGAttachCAN75;XV5
	 * @param lAttachHandle  JGAttachCAN5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native  boolean  		DetachCAN(long lAttachHandle);
	
	
	/**
	 * \if ENGLISH_LANG
	 * listen transparent serial data
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam input param
	 * @param jfAttachCOMCB callback param
	 * @param pstOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * <`L}M8Cw4.?ZJ}>]
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pstInParam JdHk2NJ}
	 * @param jfAttachCOMCB ;X5w2NJ}
	 * @param pstOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return > 03I9&#,7qTrJ'0\
	 * \endif
	 */
	public static native long           AttachDevComm(long lLoginID, NET_IN_ATTACH_DEVCOMM pstInParam, CB_fAttachDevCommCB jfAttachCOMCB, NET_OUT_ATTACH_DEVCOMM pstOutParam, int nWaitTime);
	
	
	/**
	 * \if ENGLISH_LANG
	 * cancel listen transparent serial data#, lAttachHandle is AttachDevComm return value
	 * @param lAttachHandle, return from {AttachDevComm}
	 * @return true:success, false:failed
	 * \else
	 * H!O{<`L}M8Cw4.?ZJ}>]#,lAttachHandleJGAttachDevComm75;XV5
	 * @param lAttachHandle  JGAttachDevComm5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean        DetachDevComm(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 *  set display source, support multiple window at same time
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  IhVCOTJ>T4, V'3VM,J1IhVC6`8v40?Z
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   SplitSetMultiSource(long lLoginID, NET_IN_SPLIT_SET_MULTI_SOURCE pInParam, NET_OUT_SPLIT_SET_MULTI_SOURCE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 *  low matrix switch
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  OBN;>XUsGP;;
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean       MatrixSwitch(long lLoginID, NET_IN_MATRIX_SWITCH pInParam, NET_OUT_MATRIX_SWITCH pOutParam, int nWaitTime);

	public static native boolean       ControlSpecialDevice(long lLoginID, int emType, Object pInBuf, Object pOutBuf, int nWaitTime);
	
	public static native boolean       GetSelfCheckInfo(long lLoginID, NET_IN_GET_SELTCHECK_INFO pInParam, NET_SELFCHECK_INFO pOutParam, int nWaitTime);
	
	public static native long          AttachBusState(long lLoginID, NET_IN_BUS_ATTACH pstuInBus, CB_fBusStateCallBack cbBusState, NET_OUT_BUS_ATTACH pstuOutBus, int nWaitTime);
	
	public static native boolean       DetachBusState(long lAttachHandle);
	
	public static native boolean       BusConfirmEvent(long lLoginID, NET_IN_BUS_CONFIRM_EVENT pInParam, NET_OUT_BUS_CONFIRM_EVENT pOutParam, int nWaitTime);
	
	public static native boolean       AttachMission(long lLoginID, NET_IN_ATTACH_MISSION_PARAM pInParam, CB_fMissionInfoCallBack cbMissionInfofunc, NET_OUT_ATTACH_MISSION_PARAM pOutParam, int nWaitTime);
	
	public static native boolean       DetachMission(long lAttachHandle);
	
	public static native boolean       AttachVideoAnalyseState(long lLoginID, NET_IN_ATTACH_VIDEOANALYSE_STATE pstInParam, CB_fVideoAnalyseState cbVideoAnalyseState, NET_OUT_ATTACH_VIDEOANALYSE_STATE pstOutParam, int nWaitTime);
	
	public static native boolean       DetachVideoAnalyseState(long lAttachHandle);
	
	public static native long          StartFindNumberStat(long lLoginID, NET_IN_FINDNUMBERSTAT pstInParam, NET_OUT_FINDNUMBERSTAT pstOutParam);
	
	public static native int           DoFindNumberStat(long lFindHandle, NET_IN_DOFINDNUMBERSTAT pstInParam, NET_OUT_DOFINDNUMBERSTAT pstOutParam);
	
	public static native boolean       StopFindNumberStat(long lFindHandle);
	
	public static native boolean       SnapPictureToFile(long lLoginID, NET_IN_SNAP_PIC_TO_FILE_PARAM pInParam, NET_OUT_SNAP_PIC_TO_FILE_PARAM pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  Set Mode of Course Record
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  IhVC?N3LB<OqD#J=
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   SetCourseRecordMode(long lLoginID, NET_IN_SET_COURSE_RECORD_MODE pInBuf, NET_OUT_SET_COURSE_RECORD_MODE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  Get Mode of Course Record
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  ;qH!?N3LB<OqD#J=
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   GetCourseRecordMode(long lLoginID, NET_IN_GET_COURSE_RECORD_MODE pInBuf, NET_OUT_GET_COURSE_RECORD_MODE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  Get chanel of Composite Preview
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  ;qH!5<2%T$@@M(5@:E
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   GetCompositePreviewChannel(long lLoginID, NET_IN_GET_COMPOSITE_PREVIEW_CHANNEL pInBuf, NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  start or stop record
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  ?*Ft/9X1UV86(M(5@B<Oq
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   SetCourseRecordState(long lLoginID, NET_IN_SET_COURSE_RECORD_STATE pInBuf, NET_OUT_SET_COURSE_RECORD_STATE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  open find coursemedia record 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  ?*J<2iQ/?N3LJSF5PEO"
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   OpenQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILEOPEN pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILEOPEN pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  find coursemedia record 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  2iQ/?N3LJSF5PEO"
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   DoQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILE pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * close find coursemedia record
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf input param
	 * @param pOutBuf outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  9X1U?N3LJSF52iQ/
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInBuf JdHk2NJ}
	 * @param pOutBuf Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native boolean 	   CloseQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILECLOSE pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILECLOSE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * order tour status
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  6)TDBVQ2W4L,
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native long			AttachSplitTour(long lLoginID, NET_IN_ATTACH_SPLIT_TOUR pInParam, NET_OUT_ATTACH_SPLIT_TOUR pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * stop detach tour status
	 * @param lAttachHandle, return from {AttachSplitTour}
	 * @return true:success, false:failed
	 * \else
	 * M#V96)TDBVQ2W4L,
	 * @param lAttachHandle  JGAttachSplitTour5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean		DetachSplitTour(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * attach scheme tour status 
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} or {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam input param
	 * @param pOutParam outpur param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  6)TDT$08BVQ2W4L,
	 * @param lLoginID return value of {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx} ;rU_ {@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pInParam JdHk2NJ}
	 * @param pOutParam Jd3v2NJ}
	 * @param nWaitTime 3,J1J1<d
	 * @return true:3I9&, false: J'0\
	 * \endif
	 */
	public static native long			MonitorWallAttachTour(long lLoginID, NET_IN_WM_ATTACH_TOUR pInParam, NET_OUT_WM_ATTACH_TOUR pOutParam, int nWaitTime);
		
	/**
	 * \if ENGLISH_LANG
	 * stop detach scheme tour status 
	 * @param lAttachHandle, return from {MonitorWallAttachTour}
	 * @return true:success, false:failed
	 * \else
	 * M#V96)TDT$08BVQ2W4L,
	 * @param lAttachHandle  JGMonitorWallAttachTour5D75;XV5
	 * @return true:3I9&, false:J'0\
	 * \endif
	 */
	public static native boolean		MonitorWallDetachTour(long lAttachHandle);
	
	public static native boolean 		MonitorWallGetScene(long lLoginID, SDK_IN_MONITORWALL_GET_SCENE pInParam, SDK_OUT_MONITORWALL_GET_SCENE pOutParam, int nWaitTime);
	public static native boolean 		MonitorWallSetScene(long lLoginID, SDK_IN_MONITORWALL_SET_SCENE pInParam, SDK_OUT_MONITORWALL_SET_SCENE pOutParam, int nWaitTime);

	/**
	 * 
	 * @param lLoginID
	 * @param emType
	 * @return
	 * @see NET_MONITORWALL_OPERATE_TYPE
	 */
	public static native boolean		OperateMonitorWall(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);

	/**
	 * 
	 * @param lLoginID
	 * @return
	 * @see NET_SPLIT_OPERATE_TYPE
	 */
	public static native boolean		OperateSplit(long lLoginID,  int emType, Object pInParam, Object pOutParam, int nWaitTime);
	

	public static native boolean 		GetTourSource(long lLoginID, NET_IN_GET_TOUR_SOURCE pInParam, NET_OUT_GET_TOUR_SOURCE pOutParam, int nWaitTime);

	public static native boolean 		SetTourSource(long lLoginID, NET_IN_SET_TOUR_SOURCE pInParam, NET_OUT_SET_TOUR_SOURCE pOutParam, int nWaitTime);

	public static native boolean		GetSplitAudioOuput(long lLoginID, SDK_IN_GET_AUDIO_OUTPUT pInParam, SDK_OUT_GET_AUDIO_OUTPUT pOutParam, int nWaitTime);

	public static native boolean		SetSplitAudioOuput(long lLoginID, SDK_IN_SET_AUDIO_OUTPUT pInParam, SDK_OUT_SET_AUDIO_OUTPUT pOutParam, int nWaitTime);

	/**
	 * 
	 * @param lLoginID
	 * @param emType : NET_FIND
	 * @param pInBuf
	 * @param pOutBuf
	 * @param nWaitTime
	 * @return
	 */
	public static native boolean		StartFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * 
	 * @param lLoginID
	 * @param emType : NET_FIND
	 * @param pInBuf
	 * @param pOutBuf
	 * @param nWaitTime
	 * @return
	 */
	public static native boolean		DoFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * 
	 * @param lLoginID
	 * @param emType : NET_FIND
	 * @param pInBuf
	 * @param pOutBuf
	 * @param nWaitTime
	 * @return
	 */
	public static native boolean		StopFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);	

}

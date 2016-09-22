package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS status info
 * \else
 * GPSW4L,PEO"
 * \endif
 */
public class NET_GPS_STATUS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 6(N;J1<d
	 * \endif
	 */
	public NET_TIME            revTime = new NET_TIME();                        
 	/**
	 * \if ENGLISH_LANG
	 * device number
	 * \else
	 * Ih18PrAP:E
	 * \endif
	 */
	public byte                DvrSerial[] = new byte[50];                  
 	/**
	 * \if ENGLISH_LANG
	 * longitude(1/1000000,range[0-360])
	 * \else
	 * >-6H(5%N;JG0YMr7VV.6H#,76N'0-3606H)
	 * \endif
	 */
	public double              longitude;                      
 	/**
	 * \if ENGLISH_LANG
	 * latitude(1/1000000,range[0-180])
	 * \else
	 * N36H(5%N;JG0YMr7VV.6H#,76N'0-1806H)
	 * \endif
	 */
	public double              latidude;                       
 	/**
	 * \if ENGLISH_LANG
	 * highness(m)
	 * \else
	 * 8_6H(CW)
	 * \endif
	 */
	public double              height;                         
 	/**
	 * \if ENGLISH_LANG
	 * angle(north is source point,clockwise is positive)
	 * \else
	 * 7=Or=G(U}117=OrN*T-5c#,K3J1UkN*U})
	 * \endif
	 */
	public double              angle;                          
 	/**
	 * \if ENGLISH_LANG
	 * speed(sea mile,speed/1000*1.852km/h)
	 * \else
	 * KY6H(5%N;JG:#@o#,speed/1000*1.8529+@o/P!J1)
	 * \endif
	 */
	public double              speed;                          
 	/**
	 * \if ENGLISH_LANG
	 * star count
	 * \else
	 * 6(N;PGJ}
	 * \endif
	 */
	public boolean                starCount;                      
 	/**
	 * \if ENGLISH_LANG
	 * antenna state(true good, false bad)
	 * \else
	 * LlO_W4L,(true :C#,false ;5)
	 * \endif
	 */
	public boolean                antennaState;                   
 	/**
	 * \if ENGLISH_LANG
	 * orientation state(true orientation, false not)
	 * \else
	 * 6(N;W4L,(true 6(N;#,false 2;6(N;)
	 * \endif
	 */
	public boolean                orientationState;               
 	/**
	 * \if ENGLISH_LANG
	 * working state(true normal, false abnormity)
	 * \else
	 * 9$WwW4L,(0=N46(N;#,1=7G2n7V6(N;#,2=2n7V6(N;#,3=N^P'PPS#,6=U}TZ9@Kc 
	 * \endif
	 */
	public boolean                workStae;                       
 	/**
	 * \if ENGLISH_LANG
	 * alarm count
	 * \else
	 * 7"Iz5D1(>/N;VC8vJ}
	 * \endif
	 */
	public int                 nAlarmCount;                    
 	/**
	 * \if ENGLISH_LANG
	 * alarm type
	 * \else
	 * 7"Iz5D1(>/N;VC#,V5?ID\6`8v
	 * \endif
	 */
	public int                 nAlarmState[] = new int[128];               
 	/**
	 * \if ENGLISH_LANG
	 * 0- real time 1-fill 
	 * \else
	 * 0-J5J1 1-294+ 
	 * \endif
	 */
	public byte                bOffline;                       
}

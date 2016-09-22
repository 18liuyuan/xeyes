package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record info
 * \else
 * JSF5PEO"
 * \endif
 */
public class NET_COURSEMEDIA_FILE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 2iQ/?*J<J1<d
	 * \endif
	 */
    public NET_TIME                 stuStartTime = new NET_TIME(); 
  
    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * 2iQ/=aJxJ1<d
     * \endif
     */
    public NET_TIME                 stuEndTime = new NET_TIME(); 
    
    /**
     * \if ENGLISH_LANG
     * course name
     * \else
     * ?N3LC{3F
     * \endif
     */
    public byte[]                   szCourseName = new byte[FinalVar.SDK_COMMON_STRING_64];                 
    
    /**
     * \if ENGLISH_LANG
     *  teacher's name
     * \else
     * =LJ&PUC{
     * \endif
     */
    public byte[]                   szTeacherName = new byte[FinalVar.SDK_COMMON_STRING_64];               
    
    /**
     * \if ENGLISH_LANG
     * record introduction
     * \else
     * JSF5<r=i
     * \endif
     */
    public byte[]                   szIntroduction = new byte[FinalVar.SDK_COMMON_STRING_128];              
    
    /**
     * \if ENGLISH_LANG
     * record info id#,-1#: have not record info
     * \else
     * JSF5PEO"ID,-11mJ>N^4K<GB<
     * \endif
     */
    public int                      nID; 
    
    /**
     * \if ENGLISH_LANG
     * representation channel file info
     * \else
     *  S3IdM(5@ND<~PEO"#,5ZR;N,OB1jN*S3IdM(5@:E#,5Z6~N,N*B<Oq7V6NJ}
     * \endif
     */
    public NET_CHANNEL_INFO[][]     stuChannelInfo = new NET_CHANNEL_INFO[64][16];
 
    public NET_COURSEMEDIA_FILE_INFO() {
    	for (int i = 0; i < 64; ++i) {
    		for (int j = 0; j < 16; ++j) {
    			stuChannelInfo[i][j] = new NET_CHANNEL_INFO();
    		}
    	}
    }
}

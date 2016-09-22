package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * person info
 * \else
 * HKT1PEO"
 * \endif
 */
public class FACERECOGNITION_PERSON_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  name
	 * \else
	 * PUC{#,4K2NJ}Ww7O
	 * \endif
	 */
	public byte           	szPersonName[] 		= new byte[FinalVar.SDK_MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth year
	 * \else
	 * 3vIzDj#,WwN*2iQ/Lu<~J1#,4K2NJ}Ln0#,Tr1mJ>4K2NJ}N^P'
	 * \endif
	 */
	public int				wYear; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth month
	 * \else
	 * 3vIzTB#,WwN*2iQ/Lu<~J1#,4K2NJ}Ln0#,Tr1mJ>4K2NJ}N^P'
	 * \endif
	 */
	public byte				byMonth; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth day
	 * \else
	 * 3vIzHU#,WwN*2iQ/Lu<~J1#,4K2NJ}Ln0#,Tr1mJ>4K2NJ}N^P'
	 * \endif
	 */
	public byte				byDay; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unicle ID for the person
	 * \else
	 * HKT1N(R;1jJ>(Im7]V$:EBk#,9$:E#,;rFdK{1`:E)
	 * \endif
	 */
	public byte      		szID[] 				= new byte[FinalVar.SDK_MAX_PERSON_ID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * importance level,1~10,the higher value the higher level
	 * \else
	 * HKT1VXR*5H<6,1~10#,J}V5T=8_T=VXR*#,WwN*2iQ/Lu<~J1#,4K2NJ}Ln0#,Tr1mJ>4K2NJ}N^P'
	 * \endif
	 */
	public byte          	bImportantRank; 
	
	/**
	 * \if ENGLISH_LANG
	 * sex, 0-man, 1-female
	 * \else
	 * PT1p#,1-DP#,2-E.#,WwN*2iQ/Lu<~J1#,4K2NJ}Ln0#,Tr1mJ>4K2NJ}N^P'
	 * \endif
	 */
	public byte          	bySex; 
	
	/**
	 * \if ENGLISH_LANG
	 * picture number
	 * \else
	 * M<F,UEJ}
	 * \endif
	 */
	public int           	wFacePicNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * picture info
	 * \else
	 * 51G0HKT16TS&5DM<F,PEO"
	 * \endif
	 */
	public SDK_PIC_INFO  	szFacePicInfo[] 	= new SDK_PIC_INFO[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Personnel types, see EM_PERSON_TYPE
	 * \else
	 * HKT1@`PM#,Oj<{ EM_PERSON_TYPE
	 * \endif
	 */
	public byte          	byType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Document types, see EM_CERTIFICATE_TYPE
	 * \else
	 * V$<~@`PM#,Oj<{ EM_CERTIFICATE_TYPE
	 * \endif
	 */
	public byte            	byIDType; 
	
	/**
	 * \if ENGLISH_LANG
	 * province
	 * \else
	 * J!7]
	 * \endif
	 */
	public byte         	szProvince[] 		= new byte[FinalVar.SDK_MAX_PROVINCE_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * city
	 * \else
	 * 3GJP
	 * \endif
	 */
	public byte          	szCity[] 			= new byte[FinalVar.SDK_MAX_CITY_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Name, the name is too long due to the presence of 16 bytes can not be Storage problems, the increase in this parameter
	 * \else
	 * PUC{#,Rr4fTZPUC{9}3$#,16WV=ZN^7(4f7ENJLb#,9JTv<S4K2NJ}#,
	 * \endif
	 */
	public byte          	szPersonNameEx[] 	= new byte[FinalVar.SDK_MAX_PERSON_NAME_LEN];
	
	public FACERECOGNITION_PERSON_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
			szFacePicInfo[i] = new SDK_PIC_INFO();
		}
	}
}

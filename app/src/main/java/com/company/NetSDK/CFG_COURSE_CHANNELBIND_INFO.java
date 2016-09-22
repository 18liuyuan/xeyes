package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of course media channel bind
 * \else
 *  B<2%Vw;zNo@mM(5@:E0s6(9XO5EdVC
 * \endif
 */
public class CFG_COURSE_CHANNELBIND_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * physical channel of PPT bind#,-1 express have no physical channel
	 * \else
	 *  PPT0s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
	 * \endif
	 */
	public int                             nPPT; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of Blackboard bind#,-1 express have no physical channel
     * \else
     *  :Z0e0s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nBlackboard; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFeature bind#,-1 express have no physical channel
     * \else
     *  Q'IzLXP40s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nStudentFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFullview bind#,-1 express have no physical channel
     * \else
     * Q'IzH+>00s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nStudentFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFeature bind#,-1 express have no physical channel
     * \else
     *  =LJ&LXP40s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nTeacherFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFullview bind#,-1 express have no physical channel
     * \else
     *  =LJ&H+>00s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nTeacherFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherDetect bind#,-1 express have no physical channel
     * \else
     *  =LJ&<l2b0s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nTeacherDetect;                 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of BlackboardDetect bind#,-1 express have no physical channel
     * \else
     * 0eJi<l2b0s6(5DNo@mM(5@:E#,-11mJ>C;SP0s6(
     * \endif
     */
	public int                             nBlackboardDetect;              
}

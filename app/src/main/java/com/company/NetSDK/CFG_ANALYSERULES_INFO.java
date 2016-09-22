package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The Video Analysis Rule Configuration Corresponding To Every Video Input
 * \else
 * C?8vJSF5JdHkM(5@6TS&5DKySPJB<~9fTr#:;:3eGxpRuleBufLn3d6`8vJB<~9fTrPEO"#,C?8vJB<~9fTrPEO"DZH]N*CFG_RULE_INFO+"JB<~@`PM6TS&5D9fTrEdVC=a99Le"!#
 * \endif
 */
public class CFG_ANALYSERULES_INFO
{
 	/**
	 * \if ENGLISH_LANG
	 * Event Rule Count 
	 * \else
	 * JB<~9fTr8vJ}
	 * \endif
	 */
	public int 						nRuleCount;
	
 	/**
	 * \if ENGLISH_LANG
	 * The Event Analysis Rule Configuration Corresponding To Each Video Input 
	 * \else
	 * C?8vJSF5JdHkM(5@6TS&5DJSF57VNvJB<~9fTrEdVC;:3e
	 * \endif
	 */
	public int						nRuleLen;
	
 	/**
	 * \if ENGLISH_LANG
	 * Cache Size 
	 * \else
	 * ;:3e4sP!
	 * \endif
	 */
	public byte[]					pRuleBuf;
	
	public CFG_ANALYSERULES_INFO(int nRuleLen) {
		this.nRuleLen = nRuleLen;
		this.pRuleBuf = new byte[nRuleLen];
	}
}

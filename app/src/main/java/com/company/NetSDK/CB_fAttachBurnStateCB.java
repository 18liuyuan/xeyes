package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * burning device callback function original
 * \else
 * ?LB<Ih18;X5w:/J}T-PM, lAttachHandle
 * \endif
 */

public interface CB_fAttachBurnStateCB {
	public void invoke(long lLoginID, long lAttachHandle,  long lBurnSession,  NET_OUT_BURN_GET_STATE burnState);
}
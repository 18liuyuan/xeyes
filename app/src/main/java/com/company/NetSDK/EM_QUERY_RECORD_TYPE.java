package com.company.NetSDK;

import java.io.Serializable;

public class EM_QUERY_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int EM_RECORD_TYPE_ALL              = 0;            // KySPB<Oq
	public final static int EM_RECORD_TYPE_ALARM            = 1;            // Mb2?1(>/B<Oq
	public final static int EM_RECORD_TYPE_MOTION_DETECT    = 2;            // 6/L,<l2b1(>/B<Oq
	public final static int EM_RECORD_TYPE_ALARM_ALL        = 3;            // KySP1(>/B<Oq
	public final static int EM_RECORD_TYPE_CARD             = 4;            // ?(:E2iQ/
	public final static int EM_RECORD_TYPE_CONDITION        = 5;            // 04Lu<~2iQ/
	public final static int EM_RECORD_TYPE_JOIN             = 6;            // Wi:O2iQ/
	public final static int EM_RECORD_TYPE_CARD_PICTURE     = 8;            // 04?(:E2iQ/M<F,,HB-U!"NVS5HJ9SC
	public final static int EM_RECORD_TYPE_PICTURE          = 9;            // 2iQ/M<F,,HB-U!"NVS5HJ9SC
	public final static int EM_RECORD_TYPE_FIELD            = 10;           // 04WV6N2iQ/
	public final static int EM_RECORD_TYPE_INTELLI_VIDEO   = 11;           // VGD\B<Oq2iQ/
	public final static int EM_RECORD_TYPE_NET_DATA         = 15;           // 2iQ/MxBgJ}>],=pGEMx0I5HJ9SC
	public final static int EM_RECORD_TYPE_TRANS_DATA       = 16;           // 2iQ/M8Cw4.?ZJ}>]B<Oq
	public final static int EM_RECORD_TYPE_IMPORTANT        = 17;           // 2iQ/VXR*B<Oq
	public final static int EM_RECORD_TYPE_TALK_DATA        = 18;           // 2iQ/B<RtND<~
	    
	public final static int EM_RECORD_TYPE_INVALID          = 256;          // N^P'5D2iQ/@`PM
}

package com.company.NetSDK;

import java.io.Serializable;

public class NET_VIDEOANALYSE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int            dwProgress;                        // 7VNv=x6H#,0-100
	public byte             szState[] = new byte[FinalVar.SDK_COMMON_STRING_64];      // M(5@W4L,,Running"#:TKPP#,"Stop"#:M#V9#,"NoStart"#:N4Ft6/#,"Failed"#:J'0\#,"Successed"#:3I9&
	public byte             szFailedCode[] = new byte[FinalVar.SDK_COMMON_STRING_64]; // 4mNsBk
}

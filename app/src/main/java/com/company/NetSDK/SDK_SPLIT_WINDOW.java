package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * split scene
 * \else
 * 7V8n40?ZPEO"
 * \endif
 */
public class SDK_SPLIT_WINDOW implements Serializable {
	private static final long serialVersionUID = 1L;
	
    public boolean                 bEnable;                        // 40?ZJG7qSPJSF5T4
    public int                     nWindowID;                      // 40?ZID
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     // ?XVFID
    public SDK_RECT                stuRect = new SDK_RECT();                        // 40?ZGxSr, WTSI7V8nD#J=OBSPP'
    public boolean                 bDirectable;                    // Wx1jJG7qBzWcV1M(Lu<~
    public int                     nZOrder;                        // 40?ZZ4NPr
    public SDK_SPLIT_WND_SOURCE    stuSource = new SDK_SPLIT_WND_SOURCE();                      	// OTJ>PEO"
}

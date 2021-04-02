package com.example.configuredprint;

import com.example.configuredprint.exception.ConfiguredPrintManagerException;
import com.example.configuredprint.jna.library.Gdi32;
import com.example.configuredprint.jna.structure.DocInfo;

public class ConfiguredPrintManager {

    public static void helloWorld(String deviceName) {
        int hdc = Gdi32.INSTANCE.CreateDC(null, deviceName, null, null);
        if (hdc == 0) {
            throw new ConfiguredPrintManagerException("Failed to find device: deviceName=" + deviceName);
        }

        DocInfo docInfo = new DocInfo();
        docInfo.cbSize = docInfo.size();
        docInfo.lpszDocName = deviceName;
        int isDocStarted = Gdi32.INSTANCE.StartDoc(hdc, docInfo);
        if (isDocStarted <= 0) {
            throw new ConfiguredPrintManagerException("Failed to start doc: deviceName=" + deviceName);
        }

        int isPageStarted = Gdi32.INSTANCE.StartPage(hdc);
        System.out.println(isPageStarted);
        if (isPageStarted <= 0) {
            throw new ConfiguredPrintManagerException("Failed to start page: deviceName=" + deviceName);
        }

        String text = "Hello, World";
        Gdi32.INSTANCE.TextOut(hdc, 0, 0, text, text.length());

        Gdi32.INSTANCE.EndPage(hdc);
        Gdi32.INSTANCE.EndDoc(hdc);
    }
}

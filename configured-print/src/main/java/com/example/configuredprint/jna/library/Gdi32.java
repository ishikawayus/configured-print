package com.example.configuredprint.jna.library;

import com.example.configuredprint.jna.structure.DevMode;
import com.example.configuredprint.jna.structure.DocInfo;
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

public interface Gdi32 extends StdCallLibrary {

    Gdi32 INSTANCE = Native.load("gdi32", Gdi32.class, W32APIOptions.UNICODE_OPTIONS);

    int CreateDC(String pwszDriver, String pwszDevice, String pszPort, DevMode pdm);

    int StartDoc(int hdc, DocInfo lpdi);

    int StartPage(int hdc);

    int EndPage(int hdc);

    int EndDoc(int hdc);

    int TextOut(int hdc, int x, int y, String lpString, int c);
}

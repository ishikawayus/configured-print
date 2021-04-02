package com.example.configuredprint.demo;

import com.example.configuredprint.ConfiguredPrintManager;

public class ConfiguredPrintDemoApplication {

    public static void main(String[] args) {
        String deviceName = "Microsoft Print to PDF";
        ConfiguredPrintManager.helloWorld(deviceName);
    }
}

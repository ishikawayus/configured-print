package com.example.configuredprint.jna.structure;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({ "dmDeviceName" })
public class DevMode extends Structure {

    public byte[] dmDeviceName;
}

package com.example.configuredprint.jna.structure;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({ "cbSize", "lpszDocName", "lpszOutput", "lpszDatatype", "fwType" })
public class DocInfo extends Structure {

    public int cbSize;
    public String lpszDocName;
    public String lpszOutput;
    public String lpszDatatype;
    public int fwType;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MsgUserData.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;
import javax.swing.JTextField;

public class MsgUserData extends JTextField
{

    public MsgUserData()
    {
        setColumns(20);
    }

    public String getValue()
    {
        return StringUtils.pad(getText(), 32);
    }

    public void setValue(String s)
    {
        setText(s.trim());
    }

    public static String toString(String s)
    {
        return s.trim();
    }
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreationDate.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class CreationDate extends JTextField
{

    public CreationDate()
    {
        setColumns(20);
    }

    public String getValue()
    {
        return getText();
    }

    public void setValue(String s)
    {
        setText(s);
    }
}

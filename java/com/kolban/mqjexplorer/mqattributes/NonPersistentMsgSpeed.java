// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NonPersistentMsgSpeed.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class NonPersistentMsgSpeed extends JComboBox
{

    public NonPersistentMsgSpeed()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 1;

        case 1: // '\001'
            return 2;
        }
        return 0;
    }

    private void init()
    {
        addItem("Normal");
        addItem("Allowed");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            setSelectedIndex(0);
            return;

        case 2: // '\002'
            setSelectedIndex(1);
            return;
        }
    }

    public static String toString(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            return "Normal";

        case 2: // '\002'
            return "Fast";
        }
        return "** Unknown **";
    }
}

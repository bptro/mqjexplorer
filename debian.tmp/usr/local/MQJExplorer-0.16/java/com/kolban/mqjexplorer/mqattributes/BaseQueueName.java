// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BaseQueueName.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            QNameComboBox

public class BaseQueueName extends QNameComboBox
{

    public BaseQueueName()
    {
    }

    public String getValue()
    {
        return StringUtils.pad((String)getSelectedItem(), 48);
    }

    public void init(String as[])
    {
        setEditable(true);
        for(int i = 0; i < as.length; i++)
            addItem(as[i].trim());

    }

    public void setValue(String s)
    {
        setSelectedItem(s.trim());
    }
}

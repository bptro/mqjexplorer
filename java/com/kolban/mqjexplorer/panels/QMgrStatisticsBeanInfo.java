// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrStatisticsBeanInfo.java

package com.kolban.mqjexplorer.panels;

import java.awt.ComponentOrientation;
import java.beans.*;
import java.lang.reflect.Method;

public class QMgrStatisticsBeanInfo extends SimpleBeanInfo
{

    public QMgrStatisticsBeanInfo()
    {
    }

    public MethodDescriptor alterationDateGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("alterationDateGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "alterationDateGetValue", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor alterationDateSetValue_javalangStringMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String.class
                };
                method = getBeanClass().getMethod("alterationDateSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "alterationDateSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("text");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor alterationTimeGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("alterationTimeGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "alterationTimeGetValue", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor alterationTimeSetValue_javalangStringMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String.class
                };
                method = getBeanClass().getMethod("alterationTimeSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "alterationTimeSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("text");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public PropertyDescriptor componentOrientationPropertyDescriptor()
    {
        PropertyDescriptor propertydescriptor = null;
        try
        {
            try
            {
                Method method = null;
                try
                {
                    Class aclass[] = new Class[0];
                    method = getBeanClass().getMethod("getComponentOrientation", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "getComponentOrientation", 0);
                }
                Method method1 = null;
                try
                {
                    Class aclass1[] = {
                        java.awt.ComponentOrientation.class
                    };
                    method1 = getBeanClass().getMethod("setComponentOrientation", aclass1);
                }
                catch(Throwable throwable3)
                {
                    handleException(throwable3);
                    method1 = findMethod(getBeanClass(), "setComponentOrientation", 1);
                }
                propertydescriptor = new PropertyDescriptor("componentOrientation", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("componentOrientation", getBeanClass());
            }
            propertydescriptor.setValue("enumerationValues", ((Object) (new Object[] {
                "UNKNOWN", ComponentOrientation.UNKNOWN, "java.awt.ComponentOrientation.UNKNOWN", "LEFT_TO_RIGHT", ComponentOrientation.LEFT_TO_RIGHT, "java.awt.ComponentOrientation.LEFT_TO_RIGHT", "RIGHT_TO_LEFT", ComponentOrientation.RIGHT_TO_LEFT, "java.awt.ComponentOrientation.RIGHT_TO_LEFT"
            })));
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }

    public MethodDescriptor creationDateGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("creationDateGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "creationDateGetValue", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor creationDateSetValue_javalangStringMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String.class
                };
                method = getBeanClass().getMethod("creationDateSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "creationDateSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("text");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor creationTimeGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("creationTimeGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "creationTimeGetValue", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor creationTimeSetValue_javalangStringMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String.class
                };
                method = getBeanClass().getMethod("creationTimeSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "creationTimeSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("text");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public static Method findMethod(Class class1, String s, int i)
    {
        try
        {
            Method amethod[] = class1.getMethods();
            for(int j = 0; j < amethod.length; j++)
            {
                Method method = amethod[j];
                if(method.getParameterTypes().length == i && method.getName().equals(s))
                    return method;
            }

        }
        catch(Throwable _ex)
        {
            return null;
        }
        return null;
    }

    public BeanInfo[] getAdditionalBeanInfo()
    {
        BeanInfo beaninfo = null;
        Class class1;
        try
        {
            class1 = getBeanDescriptor().getBeanClass().getSuperclass();
        }
        catch(Throwable _ex)
        {
            return null;
        }
        try
        {
            beaninfo = Introspector.getBeanInfo(class1);
        }
        catch(IntrospectionException _ex) { }
        if(beaninfo != null)
        {
            BeanInfo abeaninfo[] = new BeanInfo[1];
            abeaninfo[0] = beaninfo;
            return abeaninfo;
        } else
        {
            return null;
        }
    }

    public static Class getBeanClass()
    {
        return com.kolban.mqjexplorer.panels.QMgrStatistics.class;
    }

    public static String getBeanClassName()
    {
        return "com.kolban.mqjexplorer.panels.QMgrStatistics";
    }

    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor beandescriptor = null;
        try
        {
            beandescriptor = new BeanDescriptor(com.kolban.mqjexplorer.panels.QMgrStatistics.class);
        }
        catch(Throwable _ex) { }
        return beandescriptor;
    }

    public EventSetDescriptor[] getEventSetDescriptors()
    {
        try
        {
            EventSetDescriptor aeventsetdescriptor[] = new EventSetDescriptor[0];
            return aeventsetdescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public MethodDescriptor[] getMethodDescriptors()
    {
        try
        {
            MethodDescriptor amethoddescriptor[] = {
                alterationDateGetValueMethodDescriptor(), alterationDateSetValue_javalangStringMethodDescriptor(), alterationTimeGetValueMethodDescriptor(), alterationTimeSetValue_javalangStringMethodDescriptor(), creationDateGetValueMethodDescriptor(), creationDateSetValue_javalangStringMethodDescriptor(), creationTimeGetValueMethodDescriptor(), creationTimeSetValue_javalangStringMethodDescriptor(), main_javalangString__MethodDescriptor(), QMgrIdentifierGetValueMethodDescriptor(), 
                QMgrIdentifierSetValue_javalangStringMethodDescriptor()
            };
            return amethoddescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor apropertydescriptor[] = {
                componentOrientationPropertyDescriptor()
            };
            return apropertydescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    private void handleException(Throwable throwable)
    {
    }

    public MethodDescriptor main_javalangString__MethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String[].class
                };
                method = getBeanClass().getMethod("main", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "main", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("args");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor QMgrIdentifierGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("QMgrIdentifierGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "QMgrIdentifierGetValue", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor QMgrIdentifierSetValue_javalangStringMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String.class
                };
                method = getBeanClass().getMethod("QMgrIdentifierSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "QMgrIdentifierSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("text");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }
}

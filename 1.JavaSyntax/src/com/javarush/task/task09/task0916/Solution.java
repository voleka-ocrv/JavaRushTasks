package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RemoteException e) {                         //method3()
//            e.printStackTrace();
            System.out.println(e);
        }
        catch (IOException e) {                             //method1()
//            e.printStackTrace();
            System.out.println(e);
//            throw new RemoteException();
        }
        catch (NoSuchFieldException e) {                    //method2()
//            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void method1() throws IOException {              //IOException
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {     //ReflectiveOperationException\Exception
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {          //RemoteException\IOException
        throw new RemoteException();
    }
}

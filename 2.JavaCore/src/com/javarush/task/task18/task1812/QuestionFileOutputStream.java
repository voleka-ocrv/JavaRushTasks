package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream outputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.outputStream =  amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {

    }

//    @Override
    public void write() throws IOException {

    }

    @Override
    public void write(int b) throws IOException {

    }


    @Override
    public void write(byte[] b) throws IOException {
        outputStream.write();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (answer.equals("Д"));
        outputStream.close();
    }
}


package com.child.sale.utils;

import lombok.SneakyThrows;

import java.io.*;

public class SerializeUtil {

    /**
     * 对象转字节数组
     */
    public static byte[] objectToBytes(Object obj) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream sOut = new ObjectOutputStream(out);
            sOut.writeObject(obj);
            sOut.flush();
            byte[] bytes = out.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * 字节数组转对象
     */
    public static Object bytesToObject(byte[] bytes) throws IOException, ClassNotFoundException {
        ObjectInputStream sIn = null;
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            sIn = new ObjectInputStream(in);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IOException("dfd");
        }
        return sIn.readObject();
    }
}

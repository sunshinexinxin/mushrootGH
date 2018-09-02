package com.hyx.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anke
 * @date 2018/4/18
 */
public class ImageUtil {

    public static void main(String[] args) throws IOException {
        String imagePath = "/Users/anke/learn/coding/mushrootGH/src/main/resources/data/imgs/图片_1524022405000.png";
        byte[] bytes = null;

//        将图片转化为二进制流
        bytes = imageToByte(imagePath);

        for (byte byte1 : bytes) {
            System.out.print(byte1);
        }

//      将二进制图片转化为字符串

//      String string = new String(bytes);
//      System.out.println(string);

        String path = "/Users/anke/learn/coding/mushrootGH/src/main/resources/data/imgs/图片_1524022405001.png";
//      将二进制流转化为图片
        byteToImage(bytes, path);

    }

    /**
     * 将图片转化为二进制流
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static byte[] imageToByte(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(path));
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        return bytes;
    }

    /**
     * 将二进制流转化为图片
     *
     * @param bytes
     * @param newPath
     * @throws IOException
     */
    public static void byteToImage(byte[] bytes, String newPath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(newPath));
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}

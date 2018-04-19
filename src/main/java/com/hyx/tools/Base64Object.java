package com.hyx.tools;

/**
 *  * 转换编码
 *  
 */
public class Base64Object {

    /**
     *  * 把base64的String码转换成正常显示的字符串
     *  
     */
    public static String base64ToString(String base64) {
        byte[] decode = Base64Util.decode(base64);
        String s = new String(decode);
        return s;
    }


    /**
     *  * 把String的转换成base64码
     *  
     */
    public static String stringToBase64(String ss) {
        byte[] bytes = ss.getBytes();
        String encode = Base64Util.encode(bytes);
        return encode;
    }

    public static byte[] base64Tobyte(String str){
        return Base64Util.decode(str);
    }


    /**
     *  * bitmap转为base64
     *  * @param bitmap
     *  * @return
     *  
     */
//    public static String bitmapToBase641(Bitmap bitmap) {
//        String result = null;
//        ByteArrayOutputStream baos = null;
//        try {
//            if (bitmap != null) {
//                baos = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
//                baos.flush();
//                baos.close();
//                byte[] bitmapBytes = baos.toByteArray();
//                result = Base64.encodeToString(bitmapBytes, Base64.DEFAULT);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (baos != null) {
//                    baos.flush();
//                    baos.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }


    /**
     *  * base64转为bitmap
     *  * @param base64Data
     *  * @return
     *  
     */
//    public static Bitmap base64ToBitmap(String base64Data) {
//        byte[] bytes = Base64.decode(base64Data, Base64.DEFAULT);
//        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
//    }

    public static void main(String[] args){
        String str = "我正在test!";
        String s = stringToBase64(str);
        System.out.println(s);
        String s2 = base64ToString(s);
        System.out.println(s2);

    }
}
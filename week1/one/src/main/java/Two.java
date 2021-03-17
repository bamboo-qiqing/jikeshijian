package main.java;


import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Two extends ClassLoader {


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Class aClass = new Two().findClass("src/main/java/Hello.xlass");
        Object o = aClass.newInstance();
        Method hello = aClass.getDeclaredMethod("hello", null);
        hello.invoke(o);
    }

    @Override
    public Class findClass(String name) {
        byte[] b = readFile(name);
        return defineClass(null, b, 0, b.length);
    }

    private static byte[] readFile(String name) {
        byte[] result = null;
        File file = new File(name);
        try {
            InputStream inputStream = new FileInputStream(file);
            int available = inputStream.available();
            byte[] bytes = new byte[available];
            result = new byte[available];
            inputStream.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                result[i] = (byte) (255 - bytes[i]);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

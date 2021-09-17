package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtil {

    public static String readFile2String(String filepath) throws ReadStringException{

        String str = "";
        File file = new File(filepath);

        if (!file.exists()) {
            throw new ReadStringException(filepath + "  此路径不存在！");
        }

        try {
            FileInputStream in = new FileInputStream(file);
            int size = in.available();
            byte[] buffer = new byte[size];
            int bufferCount = in.read(buffer);
            if (bufferCount == 0) {
                throw new ReadStringException("内容为空！");
            }
            in.close();

            str = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static void writeTxt(String str, String txtPath){

        File file = new File(txtPath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str);
            fileWriter.write("\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtil {

    /**
     * @description 读取txt文件
     * @param filepath: 文件路径
     * @return String
     * @author HiROKi
     * @date 2021/9/18
     */
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

    /**
     * @description 将文本写入文件
     * @param str: 文本
     * @param txtPath: 写入文件路径
     * @return void
     * @author HiROKi
     * @date 2021/9/18
     */
    public static void writeStr2File(String str, String txtPath){

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

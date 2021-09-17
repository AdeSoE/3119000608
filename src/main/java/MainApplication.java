import utils.DuplicateRateCalculator;
import utils.FileUtil;
import utils.ReadStringException;

import java.text.DecimalFormat;

public class MainApplication {

    /**
     * @param args:
     * @description main方法
     * @author HiROKi
     * @date 2021/9/18
     */
    public static void main(String[] args) {
        process(args[0],args[1],args[2]);
    }

    /**
     * @param orgTextPath: 原文txt路径
     * @param newTextPath: 抄袭文章txt路径
     * @param ansFilePath: 答案txt路径
     * @description: 执行程序
     * @author HiROKi
     * @date 2021/9/18
     */
    public static void process(String orgTextPath, String newTextPath, String ansFilePath) {
        try {
            String orgTxt = FileUtil.readFile2String(orgTextPath);
            String newTxt = FileUtil.readFile2String(newTextPath);

            //计算
            double ansPer = DuplicateRateCalculator.calculateDuplicateRateCos(orgTxt, newTxt) * 100;

            //打印
            DecimalFormat df = new DecimalFormat("###.00");
            FileUtil.writeStr2File(df.format(ansPer) + "%", ansFilePath);

        } catch (ReadStringException e) {
            e.printStackTrace();
        }
    }

}

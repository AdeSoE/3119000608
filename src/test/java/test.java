import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import com.hankcs.hanlp.tokenizer.SpeedTokenizer;
import org.junit.Test;
import utils.*;


public class test {

    @Test
    public void test1() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig_0.8_add.txt");

            System.out.println("1 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig_0.8_del.txt");

            System.out.println("2 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test3() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig_0.8_dis_1.txt");

            System.out.println("3 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test4() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig_0.8_dis_10.txt");

            System.out.println("4 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test5() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig_0.8_dis_15.txt");

            System.out.println("5 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test6() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/orig.txt");

            System.out.println("6 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test7() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("C:\\测试文本\\empty.txt");

            System.out.println("7 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test8() {

        try {

            String str1 = FileUtil.readFile2String("src/test/testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("src/test/testdoc/notexist.txt");

            System.out.println("8 " + CalculateDuplicateRateCos.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

}

import org.junit.Test;
import utils.*;


public class test {

    @Test
    public void test1() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_add.txt");

            System.out.println("1 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_del.txt");

            System.out.println("2 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test3() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_1.txt");

            System.out.println("3 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test4() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_10.txt");

            System.out.println("4 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test5() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_15.txt");

            System.out.println("5 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test6() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig.txt");

            System.out.println("6 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test7() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/empty.txt");

            System.out.println("7 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test8() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/notexist.txt");

            System.out.println("8 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test9() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig_piece.txt");
            String str2 = FileUtil.readFile2String("testdoc/无关.txt");

            System.out.println("8 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

}

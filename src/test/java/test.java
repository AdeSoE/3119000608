import org.junit.Test;
import utils.*;


public class test {

    @Test
    public void test1_orig_add() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_add.txt");

            System.out.println("1 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2_add_orig() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig_0.8_add.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig.txt");

            System.out.println("2 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test3_orig_del() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_del.txt");

            System.out.println("3 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test4_orig_dis1() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_1.txt");

            System.out.println("4 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test5_orig_dis10() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_10.txt");

            System.out.println("5 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test6_orig_dis15() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig_0.8_dis_15.txt");

            System.out.println("6 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test7_orig_orig() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/orig.txt");

            System.out.println("7 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test8_orig_empty() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/empty.txt");

            System.out.println("8 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test9_orig_notExitFile() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/not_exist_path.txt");

            System.out.println("9 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test10_orig_irrelevant() {

        try {

            String str1 = FileUtil.readFile2String("testdoc/orig.txt");
            String str2 = FileUtil.readFile2String("testdoc/irrelevant.txt");

            System.out.println("10 " + DuplicateRateCalculator.calculateDuplicateRateCos(str1, str2));
        } catch (ReadStringException e) {
            e.printStackTrace();
        }

    }

}

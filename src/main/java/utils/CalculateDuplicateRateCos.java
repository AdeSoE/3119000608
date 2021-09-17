package utils;

import java.math.BigDecimal;
import java.util.*;

public class CalculateDuplicateRateCos {

    public static double calculateDuplicateRateCos(String str1, String str2) {

        //str -> list
        List<String> wordList1 = WordUtil.txtStr2WordList(str1);
        List<String> wordList2 = WordUtil.txtStr2WordList(str2);


        //得到所有词的HashSet
        Set<String> allWordsSet = new HashSet<>();
        allWordsSet.addAll(wordList1);
        allWordsSet.addAll(wordList2);

        //得到词频map
        Map<String, Integer> freq1 = WordUtil.getWordFreq(wordList1);
        Map<String, Integer> freq2 = WordUtil.getWordFreq(wordList2);

        //创建向量
        Vector<Integer> vector1 = new Vector<>(allWordsSet.size());
        Vector<Integer> vector2 = new Vector<>(allWordsSet.size());

        //计算向量
        allWordsSet.forEach(word -> {
            vector1.add(freq1.getOrDefault(word, 0));
            vector2.add(freq2.getOrDefault(word, 0));
        });

        return getVectorsCosValue(vector1, vector2);
    }

    public static double getVectorsCosValue(
            Vector<Integer> vector1, Vector<Integer> vector2) {

        //向量的模（norm）
        double norm1 = vector1.stream().mapToDouble(i -> i * i).sum();
        double norm2 = vector2.stream().mapToDouble(i -> i * i).sum();

        norm1 = Math.sqrt(norm1);
        norm2 = Math.sqrt(norm2);

        //向量乘积
        double vecMulti = 0;
        for (int i = 0; i < vector1.size(); i++) {
            vecMulti += vector1.elementAt(i) * vector2.elementAt(i);
        }

        //模的乘积
//        double normMulti = norm1 * norm2;
        BigDecimal normMulti = BigDecimal.valueOf(norm1).multiply(BigDecimal.valueOf(norm2));

        //cos = (a*b)/(|a|*|b|)
        return BigDecimal.valueOf(vecMulti).divide(normMulti, 9, BigDecimal.ROUND_HALF_UP).doubleValue();
    }



}

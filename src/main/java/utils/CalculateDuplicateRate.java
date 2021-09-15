package utils;

import com.hankcs.hanlp.corpus.document.sentence.word.Word;

import java.math.BigDecimal;
import java.util.*;

public class CalculateDuplicateRate {

    public static double calculateDuplicateRate(String str1, String str2) {

        //str -> list
        List <Word> wordList1 = WordUtil.txtStr2WordList(str1);
        List <Word> wordList2 = WordUtil.txtStr2WordList(str2);

        //得到所有词
        Set<String> wholeWordsSet = new HashSet<>();
        wordList1.forEach(word -> wholeWordsSet.add(word.getValue()));
        wordList2.forEach(word -> wholeWordsSet.add(word.getValue()));

        //得到词频map
        Map<String, Integer> freq1 = WordUtil.getWordFreq(wordList1);
        Map<String, Integer> freq2 = WordUtil.getWordFreq(wordList2);

        //创建向量
        Vector<Integer> vector1 = new Vector<>(wholeWordsSet.size());
        Vector<Integer> vector2 = new Vector<>(wholeWordsSet.size());

        //计算向量
        wholeWordsSet.forEach(wordStr -> {
            vector1.add(freq1.getOrDefault(wordStr, 0));
            vector2.add(freq2.getOrDefault(wordStr, 0));
        });

        System.out.println(vector1);
        System.out.println(vector2);

        return getVectorsCosValue(vector1, vector2);
    }

    public static double getVectorsCosValue(
            Vector<Integer> vector1, Vector<Integer> vector2) {

        //向量的模（norm）
        double norm1 = vector1.stream().mapToDouble(i -> i * i).sum();
        double norm2 = vector1.stream().mapToDouble(i -> i * i).sum();

        norm1 = Math.sqrt(norm1);
        norm2 = Math.sqrt(norm2);

        //向量乘积
        double vecMulti = 0;
        for (int i = 0; i < vector1.size(); i++) {
            vecMulti += vector1.elementAt(i) * vector2.elementAt(i);
        }

        //模的乘积
        double normMulti = norm1*norm2;

        //cos = (a*b)/(|a|*|b|)
        return BigDecimal.valueOf(vecMulti).divide(BigDecimal.valueOf(normMulti), 9, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}

package utils;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.util.*;
import java.util.stream.Collectors;

public class WordUtil {

    //字符串分词为List
    public static List<String> txtStr2WordList(String text) {
        //HanLP标准分词得到Term的List
        List<Term> termList = HanLP.segment(text);

        eliminateNonKeyword(termList);


        return termList.stream().map(term ->
                term.word).collect(Collectors.toList());
    }

    public static List<String> txtStr2KeywordStrList(String text) {
        return HanLP.extractKeyword(text, text.length());
    }

//    剔除非关键字
    public static void eliminateNonKeyword(List<Term> wordList) {
        wordList.removeIf(term -> (term.nature.toString().charAt(0) == 'w' || //标点
                term.nature.toString().charAt(0) == 'y' || //语气词
                term.nature.toString().charAt(0) == 'd' || //语气词
                term.nature.toString().charAt(0) == 'u' || //助词
                term.nature.toString().charAt(0) == 'p' || //介词
                term.nature.toString().charAt(0) == 'r' || //代词
                term.nature.toString().charAt(0) == 'c' || //连词
                term.nature.toString().charAt(0) == 'm' || //数词
                term.nature.toString().charAt(0) == 'f' || //方位词
                term.nature.toString().equals("vg") || //动词性惯用语
                term.word.equals("是") || //是
                term.word.equals("就") || //就
                term.word.equals("有"))); //有
    }

    public static Map<String, Integer> getKeywordFreq(List<String> allWords, List<String> keywords) {

        Map<String, Integer> freqMap = new HashMap<>();

        for (String s : keywords) {
            freqMap.put(s, Collections.frequency(allWords, s));
        }

        return freqMap;

    }

    public static Map<String, Integer> getWordFreq(List<String> wordList) {

        Map<String, Integer> freq = new HashMap<>();
        //words.forEach(i -> freq.computeIfAbsent(i.getLabel(), k -> 1);
        wordList.forEach(word ->
                freq.put(word, freq.computeIfAbsent(word, k -> 0) + 1)
        );

//        sort(freq);

        return freq;
    }

}

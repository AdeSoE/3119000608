package utils;

import com.hankcs.hanlp.corpus.document.sentence.word.Word;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordUtil {

    //字符串分词为List
    public static List<Word> txtStr2WordList(String text) {
        //HanLP标准分词得到Term的List
        List<Term> termList = StandardTokenizer.segment(text);
        //构造wordList
        List<Word> wordList = termList.stream().map(term ->
                new Word(term.word, term.nature.toString())).collect(Collectors.toList());

        eliminateNonKeyword(wordList);

        return wordList;
    }

    //剔除非关键字
    public static void eliminateNonKeyword(List<Word> wordList) {
        wordList.removeIf(word -> word.getLabel().charAt(0) == 'w');
    }

    public static Map<String, Integer> getWordFreq(List<Word> words) {
        Map<String, Integer> freq = new HashMap<>();
        //words.forEach(i -> freq.computeIfAbsent(i.getLabel(), k -> 1);
        words.forEach(word ->
            freq.put(word.getValue(), freq.computeIfAbsent(word.getValue(), k -> 0) + 1)
        );
        return freq;
    }

}

package utils;

import com.hankcs.hanlp.corpus.document.sentence.word.Word;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.List;
import java.util.stream.Collectors;

public class WordUtil {

    public static List<Word> txtStr2WordList(String text) {
        //HanLP标准分词得到Term的List
        List<Term> termList = StandardTokenizer.segment(text);
        //构造wordList
        List<Word> wordList = termList.stream().map(term ->
                new Word(term.word, term.nature.toString())).collect(Collectors.toList());

        return wordList;
    }

}

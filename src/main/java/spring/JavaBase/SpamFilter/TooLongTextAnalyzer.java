package spring.JavaBase.SpamFilter;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {/////////////
        this.maxLength = maxLength;
    }

    public TooLongTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        else
        return Label.OK;
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for (TextAnalyzer analyzer : analyzers)
            if (analyzer.processText(text) != Label.OK)
                return analyzer.processText(text);
        /*for (int i = 0; i < analyzers.length; i++) //////АНАЛОГ
            //for (TextAnalyzer analyzer : analyzers)
                if (analyzers[i].processText(text) != Label.OK)
                    return analyzers[i].processText(text);*/
            return Label.OK;
    }
}
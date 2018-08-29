package spring.JavaBase.SpamFilter;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    //реализуем абстрактные методы

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}
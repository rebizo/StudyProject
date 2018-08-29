package spring.JavaBase.SpamFilter;

class NegativeTextAnalyzer extends KeywordAnalyzer  {

    //Негативное содержание будем определять по наличию одного из трех смайликов
    private final String[] keywords = {":(", "=(", ":|"};

    //реализуем абстрактные методы

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}

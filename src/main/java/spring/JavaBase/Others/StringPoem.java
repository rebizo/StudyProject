package spring.JavaBase.Others;

public class StringPoem {

    public static void main(String[] args) {

        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static StringBuilder printTextPerRole (String[] roles, String[] textLines) {

        StringBuilder answer = new StringBuilder();
        String subString;
        String subRole;

        for (String role : roles) {
            answer.append(role + ":\n");

            int i = 1;

            for (String textLine : textLines) {
                if (textLine.startsWith(role + ":")) {
                    subString = textLine.substring(role.length() + 2);
                    subRole = textLine.split(":")[0];

                    if(role.equals(subRole)) {
                    answer.append(i).append(") ").append(subString).append( "\n" );
                    }
                }
                i++;
            }
            answer.append("\n");
        }
        return answer.append("\n");
    }
}


/*
    private static String printTextPerRole (String[] roles, String[] textLines) {

        for (int i = 0; i < roles.length; i++) {
            System.out.println(roles[i]+":");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    System.out.println((j + 1) + ")" + textLines[j].substring(roles[i].length() + 1));
                }
            }
            System.out.print("\n");
        }
        return "";

    }*/

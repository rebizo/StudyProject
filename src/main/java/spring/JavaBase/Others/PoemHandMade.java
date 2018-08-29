package spring.JavaBase.Others;

public class PoemHandMade {

    private static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            result.append('\n'+ role).append(":").append("" + '\n');

            for (int j = 0; j < textLines.length; j++) {

                if (textLines[j].startsWith(role + ":")) {
                    result.append(j + 1).append(")").append(textLines[j].replaceFirst((role) + ":", "")).append('\n');

                    //textLines[j].substring(0, Integer.parseInt(roles[i].length() + ":"));
                    //textLines[j].replaceFirst(valueOf(roles[i])+":", "");
                    //textLines[j].toString().delete(Integer.parseInt(valueOf(roles[i]) + ":"), roles.length);
                    //result.delete(Integer.parseInt(valueOf(roles[i]) + ":"), roles.length);
                    //return ss.substring(Integer.parseInt(String.valueOf(roles[i]))).indexOf(textLines[j]);//"Пронумерованная строка"

                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Лука Лукич"};

        String[] textLines = new String[] {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем!",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.print(printTextPerRole(roles, textLines));
    }
 }

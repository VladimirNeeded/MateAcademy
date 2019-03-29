package Homework3;

public class Scenario {
    public static String printTextLine(String role, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(role + ":")) {
                result.append((i + 1));
                result.append(")");
                result.append(textLines[i].substring(role.length() + 1));
                result.append("\n");
            }
        }
        return result.toString();
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role);
            result.append(":\n");
            result.append(printTextLine(role, textLines));
            result.append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] roles = {
                "Герцог",
                "Граф",
                "Графиня",
                "Гость"};
        String[] textLines = {"Графиня: Кто вы?!",
                "Гость: Я… Я тот, которого вы видите перед собой.",
                "Графиня: Очень остроумно. Что-нибудь случилось?",
                "Гость: Ничего особенного, но… Дело в том, что… Позвольте сказать вам пару слов по секрету.",
                "Графиня: Вы?",
                "Гость: Так уж получилось",
                "Графиня: Но почему в таком виде?",
                "Гость: Здесь не время и не место объяснять это.",
                "Графиня: Вы правы.Садитесь, дорогой герцог"};
        System.out.println(printTextPerRole(roles, textLines));
    }
}


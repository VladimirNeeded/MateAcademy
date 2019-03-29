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
}


package javatask;

public class HQ {
    public static String HQ9(char code) {
        StringBuilder result = new StringBuilder();

        if ('H' == code) {
            result = new StringBuilder("Hello World!");
        } else if ('Q' == code) {
            result = new StringBuilder("Q");
        } else if ('9' == code) {
            for (int i = 99; i > 0; i--) {
                if (i > 2) {
                    result.append(i).append(" bottles of beer on the wall, ")
                            .append(i)
                            .append(" bottles of beer.\n")
                            .append("Take one down and pass it around, ")
                            .append(i - 1)
                            .append(" bottles of beer on the wall.\n");
                } else if (i == 2) {
                    result.append(i).append(" bottles of beer on the wall, ")
                            .append(i)
                            .append(" bottles of beer.\n")
                            .append("Take one down and pass it around, ")
                            .append(i - 1)
                            .append(" bottle of beer on the wall.\n");
                } else {
                    result.append(i).append(" bottle of beer on the wall, ")
                            .append(i)
                            .append(" bottle of beer.\n")
                            .append("Take one down and pass it around, no more bottles of beer on the wall.\n");
                }
            }
            result.append("No more bottles of beer on the wall, no more bottles of beer.\n" + "Go to the store and buy some more, 99 bottles of beer on the wall.");
        } else {
            return null;
        }

        return result.toString();
    }
}
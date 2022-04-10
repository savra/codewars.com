package javatask;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        return 0;
    }

    public static void main(String[] args) {
        //Примем 0 за (, 1 за ) и сформируем всевозможные комбинации
        //Примем 0 за + и 1 за * и сформируем всевозможные комбинации, т.к. операции две, то будем pow(2, n) вариантов
        int n = 3;
        String[] result = new String[n];
        String[] operations = new String[] {"+", "*", "(", ")"};

    }

    private static void rec(int n) {

    }
}

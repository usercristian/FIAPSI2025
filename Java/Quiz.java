public class Quiz {
    public static void main(String[] args)
    {
        int i, j;
        int r = 1;
        for (i = 1; i < 4; i++)
            for (j = 2; j < 9; j = j+2)
                System.out.print(("!") + r++);
    }
    
}

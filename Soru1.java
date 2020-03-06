// https://www.geeksforgeeks.org/sudoku-backtracking-7/ adresindeki backtracking algoritmasindan yararlanilmistir.

public class Soru1 {
    public static boolean isSafe(int[][][] kup,int row, int col, int layer, int num)
    {

        for (int l = 0; l < kup.length; l++)
        {
            // yerlestirmeye calistigimiz rakam bu satir ve sutunda mi kontrolu, rakam mevcutsa false doner
            if (kup[row][col][l] == num)
            {
                return false;
            }
        }

        for (int c = 0; c < kup.length; c++)
        {
            // yerlestirmeye calistigimiz rakam bu satir ve katmanda mı kontrolu, rakam mevcutsa false doner
            if (kup[row][c][layer] == num)
            {
                return false;
            }
        }


        for (int r = 0; r < kup.length; r++)
        {
            // yerlestirmeye calistigimiz rakam bu sutun ve katmanda mı kontrolu, rakam mevcutsa false doner
            if (kup[r][col][layer] == num)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean kupu_doldur(int[][][] kup)
    {
        int row = -1;
        int col = -1;
        int lay = -1;
        boolean isEmpty = true;
        for (int k = 0; k < 5; k++)
        {
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if (kup[i][j][k] == 0)
                    {
                        row = i;
                        col = j;
                        lay = k;
                        isEmpty = false;
                        break;
                    }
                }
                if (!isEmpty)
                {
                    break;
                }
            }
        }

        if (isEmpty)
        {
            return true;
        }

        // geriye donuk kontrol yapiliyor
        for (int num = 1; num <= 5; num++)
        {
            if (isSafe(kup, row, col, lay, num))
            {
                kup[row][col][lay] = num;
                if (kupu_doldur(kup))
                {
                   // print(kup, 5); //konrol amacli yazilmisti, comment-out yapinca her adimda ekrana basiyor
                    return true;
                }
                else
                {
                    kup[row][col][lay] = 0; //ayni olan deger bulunca yeniden yerlestirme yapiyor
                }
            }
        }
        return false;
    }

    public static void print(int[][][] kup, int N)
    {

        for (int l = 0; l < N; l++)
        {
            for (int r = 0; r < N; r++)
            {
                for (int d = 0; d < N; d++)
                {
                    System.out.print(kup[r][d][l]);
                    System.out.print(" ");
                }
                System.out.print("\n");

                if ((r + 1) % (int) Math.sqrt(N) == 0)
                {
                    System.out.print("");
                }
            }
            System.out.println("---------");
        }
    }

}
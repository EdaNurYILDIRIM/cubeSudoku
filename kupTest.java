public class kupTest {

    public static void main(String args[])
    {
        Soru1 s = new Soru1();
        int[][][] kup = new int[][][]
                {
                        {{1, 0, 3, 4, 0}, {0, 0, 0, 0, 0}, {3, 0, 5, 1, 2}, {4, 5, 1, 2, 3}, {0, 1, 2, 3, 4}},
                        {{0, 3, 0, 0, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 0, 3}, {5, 1, 0, 3, 4}, {1, 0, 3, 4, 5}},
                        {{3, 0, 5, 1, 0}, {4, 0, 1, 2, 3}, {0, 1, 2, 3, 0}, {0, 2, 3, 0, 0}, {2, 3, 0, 5, 1}},
                        {{0, 5, 0, 0, 3}, {5, 1, 0, 3, 4}, {1, 2, 3, 4, 5}, {2, 0, 4, 5, 1}, {3, 4, 5, 0, 2}},
                        {{5, 0, 2, 3, 0}, {1, 2, 3, 4, 0}, {2, 0, 4, 0, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 0}}
                };

        if (s.kupu_doldur(kup))
        {
            s.print(kup, 5);
        }
        else
        {
            System.out.println("Dizi bu kurallara uygun doldurulamaz");
        }
    }
}

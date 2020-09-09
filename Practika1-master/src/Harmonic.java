public class Harmonic {
    public static void main(String[] agr)
    {
        double sum = 0, j, l;
        for(int i = 1; i < 11; i++){
            j = i;
            l = 1/j;
            System.out.println(l);
            sum += l;
        }
        System.out.println(sum);
    }
}

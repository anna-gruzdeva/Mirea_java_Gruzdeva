public class Generator {
    public static void main(String[] agr)
    {
        int[] array;
        array = new int[10];
        int t;
        int i;
        for (i = 0; i < array.length; i++)
        {
            array[i] = ((int) (Math.random() * 301-150));
            System.out.println(array[i]);
        }

        for (i = 0; i < array.length - 1; i++)
        {
            for (int j = i; j < array.length; j++)
            {
                    if(array[i] < array[j])
                    {
                        t = array [i];
                        array[i] = array[j];
                        array[j] = t;
                    }
            }
            for (i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
        }
    }
}

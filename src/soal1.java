public class soal1 {
    public static void uts_no1(){
        int random_array[] = {22,10,5,14,16,2,10,19,8,29,15,20,11,25,4};
        for(int i = 0; i < random_array.length; i++) {
            if(random_array[i] % 2 == 0)
            {
                System.out.println(random_array[i] + " --> Bilangan Genap");
            }else
            {
                System.out.println(random_array[i] + " --> Bilangan Ganjil");
            }
        }
        return;
    }
}

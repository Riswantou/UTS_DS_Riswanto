import java.util.Iterator;
import java.util.LinkedList;

public class soal4 {

    public static void uts_no4(){
        Mahasiswa Agus = new Mahasiswa ("Agus","Teknik Jaringan", 112, 21);
        Mahasiswa Asep = new Mahasiswa ("Asep", "Teknik Sipil", 224, 3);
        Mahasiswa Agung = new Mahasiswa ("Agung", "Teknik audio",133, 11);
        Mahasiswa Ahmad = new Mahasiswa ("Ahmad", "Teknik Video", 244, 24);
        Mahasiswa Aang = new Mahasiswa ("Aang", "Teknik Mesin", 111, 9);

        LinkedList<Mahasiswa> list = new LinkedList<>();
        list.addFirst(Agus);
        list.addFirst(Asep);
        list.addFirst(Agung);
        list.addFirst(Ahmad);
        list.addFirst(Aang);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print("<=>");
        }

        System.out.println("null");

        list.addLast(Aang);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        //for(Mahasiswa mahasiswa: list) {
        //System.out.println(employee);
        // }
    }


}

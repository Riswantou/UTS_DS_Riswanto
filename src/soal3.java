import java.util.ArrayList;
import java.util.List;

public class soal3 {
  public static void uts_no3(){


      List<Mahasiswa> MahasiswaList = new ArrayList<>();
      MahasiswaList.add(new Mahasiswa ("Agus","Teknik Jaringan", 112, 21));
      MahasiswaList.add(new Mahasiswa ("Asep", "Teknik Sipil", 224, 3));
      MahasiswaList.add(new Mahasiswa ("Agung", "Teknik audio",133, 11));
      MahasiswaList.add(new Mahasiswa ("Ahmad", "Teknik Video", 244, 24));
      MahasiswaList.add(new Mahasiswa ("Aang", "Teknik Mesin", 111, 9));

      //MahasiswaList.forEach(Mahasiswa -> System.out.println(mahasiswa));
      //
      //System.out.println(MahasiswaList.get(1));
      //
      //System.out.println(MahasiswaList.isEmpty());

      MahasiswaList.remove(0);
      MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));
      System.out.println("Banyak Data = " + MahasiswaList.size());


  }

}

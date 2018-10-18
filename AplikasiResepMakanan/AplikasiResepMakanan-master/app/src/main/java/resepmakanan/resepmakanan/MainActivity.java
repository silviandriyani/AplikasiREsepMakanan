package resepmakanan.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);

        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("kareudang", "Mantap Soul",
                "<b>Bahan Dasar :</b><br>" +
                        "750 gram udang segar berukuran sedang <br>" +
                        "1 sachet santan instan<br>" +
                        "1 batang serai, memarkan<br>" +
                        "2 cm lengkuas, dikeprek<br>" +
                        "1 sendok teh gula<br>" +
                        "Minyak untuk menumis<br>" +
                         "<b>Langkah Pembuatan :</b><br>" +
                        "1.Langkah pertama yang harus dilakukan yaitu dibersihkan terlebih dahulu kulit dan kotoran udang hingga bersih.<br>" +
                        "2.Siapkan panci untuk merebus udang tersebut. Setelah mendidih masukan santan. Kecilkan api.<br>" +
                        "3.Ditempat berbeda, tumis bumbu yang sudah dihaluskan dan masukan lengkuas, daun jeruk, daun salam dan lengkuas. Masak sampai tercium aroma harum.<br>" +
                        "4.Masukan udang ke dalam kaldu santan beserta tumisan yang sudah di buat tadi.<br>" +
                        "5.Tambahkan gula dan garam sesuai dengan selera anda. Aduk agar santan tidak pecah. Setelah sekitar 30 menit, angkat.<br>" +
                        "6.Soto udang siap dinikmati.<br>"
                , "kareudang"));

        dataResep.add(new Resep("kuahcekerpedas", "Mantap Jiwa",
                "<b>Bahan Dasar :</b><br>" +
                        "1 kg ceker ayam, siangi kulitnya dan rebus sebentar<br>" +
                        "1 buah batang serai.<br>" +
                        "1 ruas jari lengkuas<br>" +
                        "1 ruas jari jahe<br>" +
                        "4 lembar daun jeruk<br>" +
                        "300 gram tauge<br>" +
						"1 kilogram cabai setan<br>" +
                        "2 lembar daun salam<br>" +
                        "2 batang daun bawang<br>" +
                        "garam secukupnya<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Setelah ceker direbus sebentar, siapkan panci dan masukan air untuk merebus kembali ceker ayam tersebut.<br>" +
                        "2.Masukan daun salam, lengkuas, dan serai. Tunggu hingga air mendidih.<br>" +
                        "3.Sembari menunggu mendidih, anda bisa menyiapkan untuk menghaluskan beberapa bahan bumbu halus. Ada baiknya cara menghaluskannya dengan cara manual atau dengan teknik uleg agar aroma dari bumbu tersebut bisa keluar.<br>" +
                        "4.Siapkan wajan dan tumis bumbu halus hingga tercium aroma harus. Tambahkan duan jeruk dan jahe dan tunggu sampai semua bumbu meresap sempurna., Setelah semua bahan bumbu halus matang, masukan bahan tersebut ke dalam air rebusan ceker dan aduk sampai merata<br>" +
                        "5.Tunggu hingga matang"
						"6.Siap dinikmati"


                , "kuahcekerpedas"));


    }
}

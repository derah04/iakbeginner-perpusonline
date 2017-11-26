package id.indonesiaandroidkerjar.perpusonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView listBook;
    List<String> arrayBook = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listBook = (ListView) findViewById(R.id.listBuku);

        //variable array;
        final String[] staticBookTitle = new String[]{
                "Buku 1", //0
                "Buku 2", //1
                "Buku 3", //2
                "Buku 4", //3
                "Buku 5" //4
        };

        for (int i = 0; i < 10; i++){
            Log.e("Loop", String.valueOf(i));
        }

        //statement
        //looping / perulangan
        // index dimulai dari 0
        for (int i = 0; i < staticBookTitle.length; i++)
        {
            // staticBookTitle[i] --> mengambil nilai sesuai dengan no urut valuenya
            arrayBook.add(staticBookTitle[i]);
        }

        ArrayAdapter<String> adapter  = new ArrayAdapter<String>
        (
                this,android.R.layout.simple_list_item_1, arrayBook
        );

        listBook.setAdapter(adapter);

    }
}

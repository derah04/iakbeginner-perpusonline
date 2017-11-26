package id.indonesiaandroidkerjar.perpusonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView listBuku;
    List<String> arrayBook = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listBuku = (ListView) findViewById(R.id.listBuku);

        final String[] staticBookTitle = new String[]{
                "Bali",
                "Jogja",
                "Bandung",
                "Lombok",
                "Jakarta"
        };

        for (String book : staticBookTitle) {
            arrayBook.add(book);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayBook);
        listBuku.setAdapter(adapter);

        listBuku.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String name = arrayBook.get(i);
                Toast.makeText(ListActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

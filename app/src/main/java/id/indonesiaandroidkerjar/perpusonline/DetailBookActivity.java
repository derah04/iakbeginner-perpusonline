package id.indonesiaandroidkerjar.perpusonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailBookActivity extends AppCompatActivity {

    TextView txtNamaBuku;
    TextView txtPenulis;
    TextView txtHarga;
    TextView txtDescription;
    Button btnPinjam;
    String namaPenulis = "Anonymous";
    String hrgSewa = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        txtNamaBuku = (TextView) findViewById(R.id.txtNamaBuku);
        txtPenulis = (TextView) findViewById(R.id.txtPenulis);
        txtDescription = (TextView) findViewById(R.id.txtDescription);
        txtHarga = (TextView) findViewById(R.id.txtHargaSewa);
        btnPinjam = (Button) findViewById(R.id.btnPinjam);

        String bookTitle = getIntent().getStringExtra("book_title");

        if (bookTitle.equals("Buku 1")){
            namaPenulis = "Eko";
            hrgSewa = "10.000";
        }else if(bookTitle.equals("Buku 2")){
            namaPenulis = "Budi";
            hrgSewa = "20.000";
        }

        txtNamaBuku.setText(bookTitle);
        txtPenulis.setText(namaPenulis);
        txtHarga.setText(hrgSewa);

        String descriptions = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        for (int i = 0; i < 5; i++){
            descriptions += descriptions; // description = description + description;
        }

        txtDescription.setText(descriptions);

        btnPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookIntent = new Intent(
                        DetailBookActivity.this,
                        PinjamActivity.class);

                bookIntent.putExtra("hrg_sewa", hrgSewa);
                startActivity(bookIntent);
            }
        });
    }
}

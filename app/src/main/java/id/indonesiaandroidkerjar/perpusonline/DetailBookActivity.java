package id.indonesiaandroidkerjar.perpusonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailBookActivity extends AppCompatActivity {

    TextView txtNamaBuku;
    TextView txtPenulis;
    TextView txtHarga;
    TextView txtDescription;
    Button btnPinjam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        txtNamaBuku = (TextView) findViewById(R.id.txtNamaBuku);
        txtPenulis = (TextView) findViewById(R.id.txtPenulis);
        txtDescription = (TextView) findViewById(R.id.txtDescription);
        txtHarga = (TextView) findViewById(R.id.txtHargaSewa);
        btnPinjam = (Button) findViewById(R.id.btnPinjam);
    }
}

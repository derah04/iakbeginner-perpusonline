package id.indonesiaandroidkerjar.perpusonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PinjamActivity extends AppCompatActivity {

    EditText txtName;
    EditText txtPhone;
    Button btnPinjam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam);

        txtName = (EditText) findViewById(R.id.txtNama);
        txtPhone = (EditText) findViewById(R.id.txtPhone);
        btnPinjam = (Button) findViewById(R.id.btnSimpanPinjam);
    }
}

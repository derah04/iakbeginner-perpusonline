package id.indonesiaandroidkerjar.perpusonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PinjamActivity extends AppCompatActivity {

    EditText txtName;
    EditText txtPhone;
    Button btnPinjam;
    TextView hrgSewa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam);

        txtName = (EditText) findViewById(R.id.txtNama);
        txtPhone = (EditText) findViewById(R.id.txtPhone);
        btnPinjam = (Button) findViewById(R.id.btnSimpanPinjam);
        hrgSewa = (TextView) findViewById(R.id.txtPrice);

        String getPrice = getIntent().getStringExtra("hrg_sewa");
        hrgSewa.setText(getPrice);

        btnPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString();
                String phone = txtPhone.getText().toString();
                validateOrder(name, phone);
            }
        });
    }

    //method
    private void validateOrder(String name, String phone)
    {
        if (name.equals("")){
            //Jika name kosong
            Toast.makeText(this, "Name is required!", Toast.LENGTH_SHORT).show();
        }else if(phone.equals("")){
            //jika phone kosong
            Toast.makeText(this, "Phone is required!", Toast.LENGTH_SHORT).show();
        }else{
            //jika name dan phone TIDAK kosong
            Toast.makeText(this, "Thanks", Toast.LENGTH_LONG).show();
            shareItem(name,phone,hrgSewa.getText().toString());
        }
    }

    private void shareItem(String name, String phone, String price){
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        String message = "Nama saya : "+ name +" dengan no. telp " + phone +
                " meminjam buku dengan total harga : " + price;

        shareIntent.putExtra(Intent.EXTRA_TEXT,message);
        shareIntent.setType("text/plain");
        startActivity(shareIntent);

    }
}

  package mx.edu.tesoem.isc.p2pmap2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnsig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsig = (Button) findViewById(R.id.btnsiguiente1);
        btnsig.setOnClickListener(this);
    }

      @Override
      public void onClick(View v) {
          Intent frm2 = new Intent(this,Frm2Activity.class);
          startActivity(frm2);
          finish();
      }
  }

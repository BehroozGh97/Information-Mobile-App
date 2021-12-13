package ir.behrooz.information.Episodes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import app.app;
import android.view.View;
import android.widget.LinearLayout;

import ir.behrooz.information.R;

public class nokiaActivity extends AppCompatActivity implements View.OnClickListener {
    AppCompatImageView back;
    LinearLayout nokia1280;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nokia);
        init();
    }

    private void init (){
        back      = findViewById(R.id.back);
        nokia1280 = findViewById(R.id.nokia1280);

        back      .setOnClickListener(this);
        nokia1280 .setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v== back){
            finish();
        }
        else {
            app.t("S O L T A N  ☺ ");
        }
    }
}
package ir.behrooz.information.Episodes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;

import ir.behrooz.information.R;

public class xiaomi_activity extends AppCompatActivity  {
AppCompatImageView back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi);
        init();
    }

    private void init (){
    back = findViewById(R.id.back);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v== back){
                finish();
            }
        }
    });
    }


}
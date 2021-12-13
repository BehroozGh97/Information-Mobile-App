package ir.behrooz.information.Episodes;

import  androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import java.util.concurrent.Delayed;

import app.app;
import ir.behrooz.information.R;
//
public class StartActivity extends AppCompatActivity implements View.OnClickListener {
LinearLayout xiaomi , samsung,apple,nokia, huawei, motorola ,l1 , l2 , l3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setTitle(this.getClass().getSimpleName());
        init();
        startAnimating();
    }

private void init (){

    xiaomi          = findViewById(R.id.xiaomi);
    samsung         = findViewById(R.id.samsung);
    apple           = findViewById(R.id.apple);
    nokia           = findViewById(R.id.nokia);
    huawei          = findViewById(R.id.huawei);
    motorola        = findViewById(R.id.motorola);
    l1              = findViewById(R.id.l1);
    l2              = findViewById(R.id.l2);
    l3              = findViewById(R.id.l3);

    xiaomi          .setOnClickListener(this);
    samsung         .setOnClickListener(this);
    apple           .setOnClickListener(this);
    nokia           .setOnClickListener(this);
    huawei          .setOnClickListener(this);
    motorola        .setOnClickListener(this);



}

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.xiaomi:
                Intent intent1 = new Intent(this , xiaomi_activity.class);
                startActivity(intent1);
                break;
            case  R.id.samsung:
                Intent intent2 = new Intent(this , samsungActivity.class);
                startActivity(intent2);
            break;

            case R.id.apple:
                Intent intent3 = new Intent(this , appleActivity.class);
               startActivity(intent3);
            break;
            case R.id.nokia:
                Intent intent4 = new Intent(this , nokiaActivity.class);
                startActivity(intent4);
                break;
            case R.id.huawei:
                Intent intent5 = new Intent(this , huaweiActivity.class);
                startActivity(intent5);
                break;
            case R.id.motorola:
                Intent intent6 = new Intent(this , motorolaActivity.class);
                startActivity(intent6);
                break;



        }
    }



    private void startAnimating() {
/*
        int startL1 = l1.getTop();
        int endL1 = l1.getBottom();
        ObjectAnimator animatorL1 = ObjectAnimator.ofInt(l1,"bottom" , startL1,endL1);

        int startL2 = l2.getTop();
        int endL2 = l2.getBottom();
        ObjectAnimator animatorL2 = ObjectAnimator.ofInt(l2,"bottom" , startL2,endL2);

        int startL3 = l3.getTop();
        int endL3 = l3.getBottom();
        ObjectAnimator animatorL3 = ObjectAnimator.ofInt(l3,"bottom" , startL3,endL3);

        l1.setBottom(startL1);
        l2.setBottom(startL1);
        l3.setBottom(startL1);

              AnimatorSet set = new AnimatorSet();
              set.playSequentially(animatorL1 , animatorL2 , animatorL3 );

              set.start();
              l1.setVisibility(View.INVISIBLE);
              l2.setVisibility(View.INVISIBLE);
              l3.setVisibility(View.INVISIBLE);
*/
        Animation animation ;
        animation=AnimationUtils.loadAnimation(this, R.anim.maks2);
        l1.startAnimation(animation);
        l2.startAnimation(animation);
        l3.startAnimation(animation);

    }

}
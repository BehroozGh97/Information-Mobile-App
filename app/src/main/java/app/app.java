package app;

import android.util.Log;
import android.widget.Toast;

public class app {

    public static class main{
        public static final String TAG = "Information";
        public static final  int DB_VERSION = 1 ;
        public static final  String DB_NAME = TAG + ".db" ;




    }

    public static void t(String message){
        Toast.makeText(application.getContext(),message,Toast.LENGTH_SHORT).show();
    }
    public static void l(String message){
        Log.e(main.TAG , message);
    }

}

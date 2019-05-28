package com.example.alex.buildstockfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        //System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("executeCommandLine", "start");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());

        try {
            //ProcessBuilder pbuilder = new ProcessBuilder("stockfish_exe");
            //Process p = pbuilder.start();

            String path = getApplicationInfo().nativeLibraryDir + "/libnative-lib.so";
            File f = new File(path);
            Log.d("executeCommandLine", path);
            Log.d("executeCommandLine", Boolean.toString(f.exists()));
        }
        catch (Exception e)
        {
            Log.d("executeCommandLine", e.toString());
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}

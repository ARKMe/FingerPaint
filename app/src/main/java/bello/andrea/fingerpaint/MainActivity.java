package bello.andrea.fingerpaint;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    DrawingView dv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dv = new DrawingView(this);
        setContentView(dv);
    }

}

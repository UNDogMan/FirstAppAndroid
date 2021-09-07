package zru.fit.bstu.by;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import zru.fit.bstu.by.test.TestFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LogI();

        SetText();
    }

    private void SetText() {
        TestFunction tf = new TestFunction();
        TextView tv = findViewById(R.id.newtest);
        tv.setText(tf.getValue());
    }

    private void LogI() {
        for (int i = 0; i < 10; i++) {
            Log.d("MainActivity", String.format("onCreate: counter = %d", i));
        }
    }
}
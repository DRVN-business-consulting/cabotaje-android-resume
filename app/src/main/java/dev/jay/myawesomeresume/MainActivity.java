package dev.jay.myawesomeresume;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.cbProfile).setOnClickListener(cbView -> toggleVisibility(findViewById(R.id.tvProfile)));
        findViewById(R.id.cbContact).setOnClickListener(cbView -> toggleVisibility(findViewById(R.id.viewSocials)));
        findViewById(R.id.cbEducation).setOnClickListener(cbView -> toggleVisibility(findViewById(R.id.viewEducation)));
        findViewById(R.id.cbWorkExp).setOnClickListener(cbView -> toggleVisibility(findViewById(R.id.viewWork)));
        findViewById(R.id.cbCompetency).setOnClickListener(cbView -> toggleVisibility(findViewById(R.id.viewCompetency)));

        disabledView(findViewById(R.id.seekLaravel));
        disabledView(findViewById(R.id.seekMySQL));
        disabledView(findViewById(R.id.seekAndroidDev));
    }

    private void toggleVisibility(View view) {
        int visibility = view.getVisibility();
        view.setVisibility(visibility == View.GONE? View.VISIBLE: View.GONE);
    }

    private void disabledView(View view) {
        view.setEnabled(false);
    }
}

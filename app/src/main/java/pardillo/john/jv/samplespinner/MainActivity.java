package pardillo.john.jv.samplespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner cboCourse;
    private Button btnSubmit;
    private String course = "Select";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cboCourse = this.findViewById(R.id.spinner);
        this.btnSubmit = this.findViewById(R.id.button);

        this.cboCourse.setOnItemSelectedListener(this);
        this.btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        course = this.cboCourse.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Selected Course: " +course, Toast.LENGTH_LONG).show();
    }
}

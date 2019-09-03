package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView myTextView = new TextView(this);

        myTextView.setText("Some Help Text");
        setContentView(myTextView);
        Bundle b = new Bundle();
        String helpText = b.getString("Help String");
        myTextView.setText(helpText);
        setContentView(myTextView);
    }

}

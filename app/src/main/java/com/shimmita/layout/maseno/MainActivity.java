package com.shimmita.layout.maseno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText editTextUsername, editTextPassword;
    public Button button_Login;
    public ImageView masenoImage;
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        editTextPassword = (EditText) findViewById(R.id.editTextTextPassword);

        button_Login = (Button) findViewById(R.id.button);
        masenoImage = (ImageView) findViewById(R.id.imageView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "Shimmita";
                String password = "1234";
                String returnsUsername, returnsPassword;

                returnsUsername = editTextUsername.getText().toString();
                returnsPassword = editTextPassword.getText().toString();

                if (returnsUsername.equals(username) && returnsPassword.equals(returnsPassword)) {
                    if (progressBar.getVisibility() == View.INVISIBLE) {
                        progressBar.setVisibility(View.VISIBLE);


                    }

                }
                Toast.makeText(MainActivity.this, "WRONG CREDENTIALS ENTRED!", Toast.LENGTH_LONG).show();
                progressBar.setVisibility(View.VISIBLE);
            }
        });

    }
}
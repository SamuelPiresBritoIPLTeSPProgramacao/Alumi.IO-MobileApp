package com.example.alumiio.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.alumiio.R;
import com.example.alumiio.models.AlumioSingleton;
import com.example.alumiio.models.Tpc;

public class ViewDetailsTpcActivity extends AppCompatActivity {

    private long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details_tpc);
         id = getIntent().getLongExtra("ID_DO_TPC",0);

       Tpc auxTpc = AlumioSingleton.getInstance(getApplicationContext()).getTpcById(id);


    }

    public void editarOnClick(View view) {



    }

    public void eliminarOnClick(View view) {

        AlumioSingleton.getInstance(getApplicationContext()).removeTpcDB(id);
        finish();

    }
}

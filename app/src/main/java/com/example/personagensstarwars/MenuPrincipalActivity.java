package com.example.personagensstarwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }


    public void abrirPersonagem(View view) {
        switch (view.getId()){
            case R.id.idAnakin:
                Intent intent = new Intent(MenuPrincipalActivity.this, AnakinActivity.class);
                startActivity(intent);
                break;
            case R.id.idLuke:
                Intent intent1 = new Intent(MenuPrincipalActivity.this, LukeActivity.class);
                startActivity(intent1);
        }
    }
}

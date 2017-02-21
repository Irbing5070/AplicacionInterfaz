package com.desarrollodeaplicaciones.filalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String operadoresR6[]=new String[]{"Blackbeard","Frost","Fuze","Hibana","Kapkan","Mute",
            "Sledge","Tachanka","Twitch"};

    private Integer[] imgid={
            R.drawable.blackicon,
            R.drawable.frosticon,
            R.drawable.fuzeicon,
            R.drawable.hibanaicon,
            R.drawable.kapkanicon,
            R.drawable.muteicon,
            R.drawable.sledgeicon,
            R.drawable.tachankaicon,
            R.drawable.twitchicon
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,operadoresR6,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, final long id) {
                final String Slecteditem= operadoresR6[+ position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                new Thread(new Runnable() {

                    @Override
                    public void run() {

                        try {
                            if(position == 0) {
                                Intent Operator = new Intent(MainActivity.this, Blackbeard.class);
                                startActivity(Operator);
                            }else if (position == 1){
                                Intent operador1 = new Intent(MainActivity.this, Frost.class);
                                startActivity(operador1);
                            }else if (position == 2){
                                Intent operador2 = new Intent(MainActivity.this, Fuze.class);
                                startActivity(operador2);
                            }else if (position == 3){
                                Intent operador3 = new Intent(MainActivity.this, Hibana.class);
                                startActivity(operador3);
                            }else if (position == 4){
                                Intent operador4 = new Intent(MainActivity.this, Kapkan.class);
                                startActivity(operador4);
                            }else if (position == 5){
                                Intent operador5 = new Intent(MainActivity.this, Mute.class);
                                startActivity(operador5);
                            }else if (position == 6){
                                Intent operador6 = new Intent(MainActivity.this, Sledge.class);
                                startActivity(operador6);
                            }else if (position == 7){
                                Intent operador7 = new Intent(MainActivity.this, Tachanka.class);
                                startActivity(operador7);
                            }else if (position == 8){
                                Intent operador8 = new Intent(MainActivity.this, Twitch.class);
                                startActivity(operador8);
                            }
                        } catch (Exception e) {
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {


                            }
                        });
                    }
                }).start();

            }
        });
    }
}
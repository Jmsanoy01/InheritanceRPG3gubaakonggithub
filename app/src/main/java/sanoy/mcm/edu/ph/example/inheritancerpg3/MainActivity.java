package sanoy.mcm.edu.ph.example.inheritancerpg3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Spinner tank,mage,marksman,rogue,support,monster;
    Spinner HeroClass;
    String tankstrng,magestrng,marksstring,roguestrng,supportstrng;
    String hroclassstrng;

    ImageView archerimage,barbarianimage,knightimage,riflemanimage;

    EditText lvl;
    TextView cls;
    TextView mainclass;
    TextView gerome;
    TextView Manapoints;
    TextView pAtk;
    TextView mAtk;
    TextView pDef;
    TextView mDef;
    TextView baseSTR;
    TextView baseAGI;
    TextView baseINT;
    TextView strGrowth;
    TextView basedex;
    TextView Healthpoints;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Healthpoints=findViewById(R.id.Hp);
        Manapoints=findViewById(R.id.Mp);

        lvl=findViewById(R.id.lvl);
        button=findViewById(R.id.button);

        mage=findViewById(R.id.magesubclass);
        marksman=findViewById(R.id.marksmansubclass);
        rogue=findViewById(R.id.roguesubclass);
        support=findViewById(R.id.supportsubclass);
        tank=findViewById(R.id.tanksubclass);
        HeroClass=findViewById(R.id.Heroclass);

        archerimage=findViewById(R.id.archerimage);
        barbarianimage=findViewById(R.id.barbarianimage);
        knightimage=findViewById(R.id.knightimage);
        riflemanimage=findViewById(R.id.riflemanimage);


        archerimage.setVisibility(View.GONE);
        riflemanimage.setVisibility(View.GONE);
        barbarianimage.setVisibility(View.GONE);
        knightimage.setVisibility(View.GONE);


        HeroClass.setOnItemSelectedListener(

                new AdapterView.OnItemSelectedListener() {


                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        hroclassstrng=HeroClass.getSelectedItem().toString();

                        if (hroclassstrng.equals("tank")) {

                            marksman.setVisibility(View.GONE);
                            support.setVisibility(View.GONE);
                            tank.setVisibility(View.VISIBLE);
                            rogue.setVisibility(View.GONE);
                            mage.setVisibility(View.GONE);


                        }
                        else if (hroclassstrng.equals("marksman")) {
                            marksman.setVisibility(View.VISIBLE);
                            support.setVisibility(View.GONE);
                            tank.setVisibility(View.GONE);
                            rogue.setVisibility(View.GONE);
                            mage.setVisibility(View.GONE);


                        }
                        else if (hroclassstrng.equals("mage")) {
                            marksman.setVisibility(View.GONE);
                            support.setVisibility(View.GONE);
                            tank.setVisibility(View.GONE);
                            rogue.setVisibility(View.GONE);
                            mage.setVisibility(View.VISIBLE);
                        }
                        else if (hroclassstrng.equals("rogue")) {
                            marksman.setVisibility(View.GONE);
                            support.setVisibility(View.GONE);
                            tank.setVisibility(View.GONE);
                            rogue.setVisibility(View.VISIBLE);
                            mage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("support")) {
                            marksman.setVisibility(View.GONE);
                            support.setVisibility(View.VISIBLE);
                            tank.setVisibility(View.GONE);
                            rogue.setVisibility(View.GONE);
                            mage.setVisibility(View.GONE);
                        }

                        else if (hroclassstrng.equals("monster")) {
                            marksman.setVisibility(View.GONE);
                            support.setVisibility(View.VISIBLE);
                            tank.setVisibility(View.GONE);
                            rogue.setVisibility(View.GONE);
                            mage.setVisibility(View.GONE);
                        }


                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


        tank.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tankstrng=tank.getSelectedItem().toString();

                        if (tankstrng.equals("barbarian")) {
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.VISIBLE);
                            knightimage.setVisibility(View.GONE);


                        }
                        else if (tankstrng.equals("knight")) {

                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.VISIBLE);
                        }

                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );

        marksman.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        marksstring=marksman.getSelectedItem().toString();


                        if (marksstring.equals("archer")) {

                            archerimage.setVisibility(View.VISIBLE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                        }
                        else if (marksstring.equals("rifleman")) {
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.VISIBLE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
    mage.setOnItemSelectedListener(
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    magestrng=mage.getSelectedItem().toString();

                    if (magestrng.equals("priest")) {
                        archerimage.setVisibility(View.VISIBLE);
                        riflemanimage.setVisibility(View.GONE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                    else if (magestrng.equals("necromancer")) {
                        archerimage.setVisibility(View.GONE);
                        riflemanimage.setVisibility(View.VISIBLE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            }
    );

    rogue.setOnItemSelectedListener(
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    roguestrng=rogue.getSelectedItem().toString();
                    if (roguestrng.equals("assassin")) {
                        archerimage.setVisibility(View.VISIBLE);
                        riflemanimage.setVisibility(View.GONE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                    else if (roguestrng.equals("ninja")) {
                        archerimage.setVisibility(View.GONE);
                        riflemanimage.setVisibility(View.VISIBLE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            }
    );

    support.setOnItemSelectedListener(
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    supportstrng=support.getSelectedItem().toString();

                    if (supportstrng.equals("assassin")) {
                        archerimage.setVisibility(View.VISIBLE);
                        riflemanimage.setVisibility(View.GONE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                    else if (roguestrng.equals("ninja")) {
                        archerimage.setVisibility(View.GONE);
                        riflemanimage.setVisibility(View.VISIBLE);
                        barbarianimage.setVisibility(View.GONE);
                        knightimage.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            }
    );



        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent (MainActivity.this,Main2Activity.class);
                        String lvlstring =String.valueOf(lvl.getText());
                        String tnk=tankstrng;
                        String mrks=marksman.getSelectedItem().toString();
                        String mige = mage.getSelectedItem().toString();
                        String roug = rogue.getSelectedItem().toString();
                        String sprt = support.getSelectedItem().toString();


                        i.putExtra("Level",lvlstring);

                        i.putExtra("barbarian", tankstrng);
                        i.putExtra("archer", marksstring);
                        i.putExtra("priest",magestrng);
                        i.putExtra("assassin",roguestrng);
                        i.putExtra("enchanter",supportstrng);
                        i.putExtra("monster",hroclassstrng);

                        startActivity(i);


                    }
                }
        );
    }
}

package sanoy.mcm.edu.ph.example.inheritancerpg3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    ImageView archerimage,barbarianimage,knightimage,riflemanimage;

    TextView lvl;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Healthpoints=findViewById(R.id.Hp);
        Manapoints=findViewById(R.id.Mp);
        pAtk=findViewById(R.id.pAtk);
        mAtk=findViewById(R.id.mAtk);
        pDef=findViewById(R.id.pDef);
        mDef=findViewById(R.id.mDef);
        cls=findViewById(R.id.cls);



        String lebel = getIntent().getStringExtra("Level");
        lvl=findViewById(R.id.lvl);
        lvl.setText(lebel);



        Hero barbarian = new Hero(01,100,0,90,0,90,0,
                "tank",1,0,50,0,1,1,1,4);


        barbarian.getBaseHP();
        barbarian.getBaseMP();
        barbarian.getpAtk();
        barbarian.getpDef();
        barbarian.getmDef();
        barbarian.getClass();
        barbarian.getXp();
        barbarian.getBaseSTR();
        barbarian.getBaseAGI();
        barbarian.getBaseINT();
        barbarian.getstrGrowth();
        barbarian.getAgiGrowth();
        barbarian.getIntgrowth();



        Healthpoints.setText(String.valueOf(barbarian.getBaseHP()+"HP"));
        Manapoints.setText(String.valueOf(barbarian.getBaseMP()+"MP"));
        pAtk.setText(String.valueOf(barbarian.getpAtk()+"Physical atk"));
        mAtk.setText(String.valueOf(barbarian.getmAtk()+"Magical atk"));
        pDef.setText(String.valueOf(barbarian.getpDef()+"Physical def"));
        mDef.setText(String.valueOf(barbarian.getmDef()+"Magical def"));

    }
}

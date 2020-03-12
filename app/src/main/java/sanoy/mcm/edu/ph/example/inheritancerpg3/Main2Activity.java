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
        String barbsub = getIntent().getStringExtra("barbarian");
        String mrksmn=getIntent().getStringExtra("archer");
        String maje=getIntent().getStringExtra("priest");
        String roug=getIntent().getStringExtra("assassin");
        String suport=getIntent().getStringExtra("enchanter");

        lvl=findViewById(R.id.lvl);
        lvl.setText(lebel);

        if(barbsub.equals("barbarian")){
            Hero barbarian = new Hero(01, 100, 0, 90, 0, 90, 0,
                    "tank", 1, 0, 50, 0, 1, 1, 1, 4);

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

            Healthpoints.setText(String.valueOf(barbarian.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(barbarian.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(barbarian.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(barbarian.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(barbarian.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(barbarian.getmDef() + "Magical def"));

        }

      else if (barbsub.equals("knight")){

            Knight knght = new Knight(01, 100, 0, 80, 0, 90, 0,
                    "tank", 1, 0, 50, 0, 1, 1, 1, 4);

            knght.getBaseHP();
            knght.getBaseMP();
            knght.getpAtk();
            knght.getpDef();
            knght.getmDef();
            knght.getClass();
            knght.getXp();
            knght.getBaseSTR();
            knght.getBaseAGI();
            knght.getBaseINT();
            knght.getstrGrowth();
            knght.getAgiGrowth();
            knght.getIntgrowth();

            Healthpoints.setText(String.valueOf(knght.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(knght.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(knght.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(knght.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(knght.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(knght.getmDef() + "Magical def"));
        }

         if (mrksmn.equals("archer")){

            Archer archr = new Archer(01, 100, 0, 70, 0, 40, 0,
                    "marksman", 1, 0, 50, 0, 1, 1, 1, 4);

            archr.getBaseHP();
            archr.getBaseMP();
            archr.getpAtk();
            archr.getpDef();
            archr.getmDef();
            archr.getClass();
            archr.getXp();
            archr.getBaseSTR();
            archr.getBaseAGI();
            archr.getBaseINT();
            archr.getstrGrowth();
            archr.getAgiGrowth();
            archr.getIntgrowth();

            Healthpoints.setText(String.valueOf(archr.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(archr.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(archr.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(archr.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(archr.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(archr.getmDef() + "Magical def"));
        }

        else if (mrksmn.equals("rifleman")){

            Assassin riflemn = new Assassin(01, 100, 0, 70, 0, 45, 0,
                    "marksman", 1, 0, 50, 0, 1, 1, 1, 4);

            riflemn.getBaseHP();
            riflemn.getBaseMP();
            riflemn.getpAtk();
            riflemn.getpDef();
            riflemn.getmDef();
            riflemn.getClass();
            riflemn.getXp();
            riflemn.getBaseSTR();
            riflemn.getBaseAGI();
            riflemn.getBaseINT();
            riflemn.getstrGrowth();
            riflemn.getAgiGrowth();
            riflemn.getIntgrowth();

            Healthpoints.setText(String.valueOf(riflemn.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(riflemn.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(riflemn.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(riflemn.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(riflemn.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(riflemn.getmDef() + "Magical def"));
        }
          if (maje.equals("priest")){

             Priest pari = new Priest(01, 100, 100, 50, 80, 45, 80,
                     "mage", 1, 0, 50, 0, 1, 1, 1, 4);

             pari.getBaseHP();
             pari.getBaseMP();
             pari.getpAtk();
             pari.getpDef();
             pari.getmDef();
             pari.getClass();
             pari.getXp();
             pari.getBaseSTR();
             pari.getBaseAGI();
             pari.getBaseINT();
             pari.getstrGrowth();
             pari.getAgiGrowth();
             pari.getIntgrowth();

             Healthpoints.setText(String.valueOf(pari.getBaseHP() + "HP"));
             Manapoints.setText(String.valueOf(pari.getBaseMP() + "MP"));
             pAtk.setText(String.valueOf(pari.getpAtk() + "Physical atk"));
             mAtk.setText(String.valueOf(pari.getmAtk() + "Magical atk"));
             pDef.setText(String.valueOf(pari.getpDef() + "Physical def"));
             mDef.setText(String.valueOf(pari.getmDef() + "Magical def"));
         }
          else if (maje.equals("priest")){

              Necromancer necro = new Necromancer(01, 100, 100, 40, 60, 45, 70,
                      "mage", 1, 0, 50, 0, 1, 1, 1, 4);

              necro.getBaseHP();
              necro.getBaseMP();
              necro.getpAtk();
              necro.getpDef();
              necro.getmDef();
              necro.getClass();
              necro.getXp();
              necro.getBaseSTR();
              necro.getBaseAGI();
              necro.getBaseINT();
              necro.getstrGrowth();
              necro.getAgiGrowth();
              necro.getIntgrowth();

              Healthpoints.setText(String.valueOf(necro.getBaseHP() + "HP"));
              Manapoints.setText(String.valueOf(necro.getBaseMP() + "MP"));
              pAtk.setText(String.valueOf(necro.getpAtk() + "Physical atk"));
              mAtk.setText(String.valueOf(necro.getmAtk() + "Magical atk"));
              pDef.setText(String.valueOf(necro.getpDef() + "Physical def"));
              mDef.setText(String.valueOf(necro.getmDef() + "Magical def"));
          }

          if (roug.equals("assassin")){

              Assassin ass = new Assassin(01, 80, 00, 25, 20, 15, 50,
                      "rogue", 1, 0, 50, 0, 1, 1, 1, 4);

              ass.getBaseHP();
              ass.getBaseMP();
              ass.getpAtk();
              ass.getpDef();
              ass.getmDef();
              ass.getClass();
              ass.getXp();
              ass.getBaseSTR();
              ass.getBaseAGI();
              ass.getBaseINT();
              ass.getstrGrowth();
              ass.getAgiGrowth();
              ass.getIntgrowth();

              Healthpoints.setText(String.valueOf(ass.getBaseHP() + "HP"));
              Manapoints.setText(String.valueOf(ass.getBaseMP() + "MP"));
              pAtk.setText(String.valueOf(ass.getpAtk() + "Physical atk"));
              mAtk.setText(String.valueOf(ass.getmAtk() + "Magical atk"));
              pDef.setText(String.valueOf(ass.getpDef() + "Physical def"));
              mDef.setText(String.valueOf(ass.getmDef() + "Magical def"));
          }

        else if (roug.equals("assassin")){

            Ninja nnja = new Ninja(01, 50, 00, 20, 10, 15, 50,
                    "rogue", 1, 0, 50, 0, 1, 1, 1, 4);

            nnja.getBaseHP();
            nnja.getBaseMP();
            nnja.getpAtk();
            nnja.getpDef();
            nnja.getmDef();
            nnja.getClass();
            nnja.getXp();
            nnja.getBaseSTR();
            nnja.getBaseAGI();
            nnja.getBaseINT();
            nnja.getstrGrowth();
            nnja.getAgiGrowth();
            nnja.getIntgrowth();

            Healthpoints.setText(String.valueOf(nnja.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(nnja.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(nnja.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(nnja.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(nnja.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(nnja.getmDef() + "Magical def"));
        }

        if (suport.equals("enchanter")){

            Enchanter ench = new Enchanter(01, 80, 100, 20, 40, 15, 50,
                    "support", 1, 0, 50, 0, 1, 1, 1, 4);

            ench.getBaseHP();
            ench.getBaseMP();
            ench.getpAtk();
            ench.getpDef();
            ench.getmDef();
            ench.getClass();
            ench.getXp();
            ench.getBaseSTR();
            ench.getBaseAGI();
            ench.getBaseINT();
            ench.getstrGrowth();
            ench.getAgiGrowth();
            ench.getIntgrowth();

            Healthpoints.setText(String.valueOf(ench.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(ench.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(ench.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(ench.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(ench.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(ench.getmDef() + "Magical def"));
        }
        if (suport.equals("enchanter")){

            Healer heal = new Healer(01, 80, 100, 15, 90, 15, 100,
                    "support", 1, 0, 50, 0, 1, 1, 1, 4);

            heal.getBaseHP();
            heal.getBaseMP();
            heal.getpAtk();
            heal.getpDef();
            heal.getmDef();
            heal.getClass();
            heal.getXp();
            heal.getBaseSTR();
            heal.getBaseAGI();
            heal.getBaseINT();
            heal.getstrGrowth();
            heal.getAgiGrowth();
            heal.getIntgrowth();

            Healthpoints.setText(String.valueOf(heal.getBaseHP() + "HP"));
            Manapoints.setText(String.valueOf(heal.getBaseMP() + "MP"));
            pAtk.setText(String.valueOf(heal.getpAtk() + "Physical atk"));
            mAtk.setText(String.valueOf(heal.getmAtk() + "Magical atk"));
            pDef.setText(String.valueOf(heal.getpDef() + "Physical def"));
            mDef.setText(String.valueOf(heal.getmDef() + "Magical def"));
        }


    }
}

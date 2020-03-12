package sanoy.mcm.edu.ph.example.inheritancerpg3;

public class Monsters extends Characters {
    private String desc;

    public Monsters (int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef){

        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef);
        this.desc=desc;
    }
}

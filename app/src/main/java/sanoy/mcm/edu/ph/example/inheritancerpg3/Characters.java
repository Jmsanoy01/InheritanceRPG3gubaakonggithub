package sanoy.mcm.edu.ph.example.inheritancerpg3;

public class Characters {
    private int id;
    private double baseHP, baseMP, pAtk, mAtk, pDef, mDef;
    private boolean attackable = true;


    public Characters(int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef) {
        this.id = id;
        this.baseHP = baseHP;
        this.baseMP = baseMP;
        this.pAtk = pAtk;
        this.mAtk = mAtk;
        this.pDef = pDef;
        this.mDef = mDef;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBaseHP(double baseHP){
        this.baseHP=baseHP;
    }
    public void setBaseMP(double baseMP){
        this.baseMP=baseMP;
    }
    public void setpAtk(double pAtk ){
        this.pAtk=pAtk;
    }
    public void setmAtk(double mAtk){
        this.mAtk=mAtk;
    }
    public void setpDef(double pDef){
        this.pDef=pDef;
    }
    public void setmDef(double mDef){
        this.mDef=mDef;
    }


    //getters
    public int getId(){
        return id;
    }
    public double getBaseHP() {
        return baseHP;
    }

    public double getBaseMP() {
        return baseMP;
    }

    public double getmAtk() {
        return mAtk;
    }

    public double getmDef() {
        return mDef;
    }

    public double getpAtk() {
        return pAtk;
    }

    public double getpDef() {
        return pDef;
    }



}

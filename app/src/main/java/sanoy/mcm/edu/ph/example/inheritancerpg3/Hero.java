package sanoy.mcm.edu.ph.example.inheritancerpg3;

public class Hero extends Characters {
    private String cls;
    String name;
    private int id;
    int level;
    private double xp;
    private double baseSTR, baseAGI, baseINT;
    private double strGrowth,agiGrowth,intGrowth;
    private double evasion;


    public Hero(int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef,
                String cls,double xp, double baseAGI, double baseSTR,double baseINT,double strGrowth,double agiGrowth,double intGrowth,
                double evasion)
    {
        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef);
        this.cls=cls;
        this.baseAGI=baseAGI;
        this.baseINT=baseINT;
        this.baseSTR=baseSTR;
        this.xp=xp;
        this.strGrowth=strGrowth;
        this.agiGrowth=agiGrowth;
        this.intGrowth=intGrowth;

        this.evasion=evasion;
    }



    //foreign setters
    public void setId(int id){
        this.id=id;
    }
    public void setBaseHP(double baseHP){
        super.setBaseHP(baseHP);
    }
    public void setBaseMP(double baseMP){
        super.setBaseMP(baseMP);
    }
    public void setpAtk(double pAtk ){
        super.setpAtk(pAtk);
    }
    public void setmAtk(double mAtk){
        super.setmAtk(mAtk);
    }
    public void setpDef(double pDef){
        super.setpDef(pDef);
    }
    public void setmDef(double mDef){
        super.setmDef(mDef);
    }



    //foreign getters
    @Override
    public double getBaseHP() {
        return super.getBaseHP();
    }
    @Override
    public double getBaseMP() {
        return super.getBaseMP();
    }
    @Override
    public double getmAtk() {
        return super.getmAtk();
    }
    @Override
    public double getmDef() {
        return super.getmDef();
    }
    @Override
    public double getpAtk() {
        return super.getpAtk();
    }
    @Override
    public double getpDef() {
        return super.getpDef();
    }



//local getters and setters

    public void setXp(double xp){this.xp=xp;}
    public void setCls(String cls) {
        this.cls = cls;
    }
    public void setBaseAGI(double baseAGI) {
        this.baseAGI = baseAGI;
    }
    public void setBaseINT(double baseINT) {
        this.baseINT = baseINT;
    }
    public void setBaseSTR(double baseSTR) {
        this.baseSTR = baseSTR;
    }


    public double getBaseAGI() {
        return baseAGI;
    }
    public double getBaseINT() {
        return baseINT;
    }
    public double getBaseSTR() {
        return baseSTR;
    }
    public double getXp() {
        return xp;
    }



    // methods
    public double baseHPwSTR(){
        return super.getBaseHP() + (20*baseSTR);
    }
    public double baseMPwINT(){return super.getBaseMP() + (20+baseINT);}
    public double strwithGrowth(){return baseSTR+ (strGrowth*level);}
    public double intwithGrowth(){return baseINT+ (intGrowth*level);}
    public double agiwithGrowth(){return baseAGI+ (agiGrowth*level);}

    // number 2
    public double agiwithpdef(){return super.getpDef() +(.1*agiGrowth);}
    //number 3
    public double agiwithpAtk(){return super.getpAtk() +(.2+agiGrowth);}
    //number 4
    public double strwithpAtk(){return super.getpAtk() +(.2+strGrowth);}
    //number 5
    public double intwithmDef(){return super.getpDef() +(.2+intGrowth);}
    //number 6
    public double agiwithevasion(){return evasion+(.0004+agiGrowth);}

    //number 7
    public double intwithaTk(){return super.getmAtk() +(.3+intGrowth);}


    //methods??
    public double getstrGrowth() {return strGrowth;
    }

    public double getAgiGrowth() {return agiGrowth;
    }

    public double getIntgrowth() {return intGrowth;
    }
}

package sanoy.mcm.edu.ph.example.inheritancerpg3;

public class MagicKnight extends Hero {
    public MagicKnight (int id, double baseHP, double baseMP, double pAtk, double mAtk, double pDef, double mDef,
                        String cls,double xp, double baseAGI, double baseSTR,double baseINT,double strGrowth,double agiGrowth,double intGrowth,
                        double evasion) {
        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef,cls,xp,baseAGI,baseSTR,baseINT,strGrowth,agiGrowth,intGrowth,evasion);
    }
    public double baseHPwSTR(){
        return super.getBaseHP() + (20*strwithGrowth()+5*intwithGrowth());
    }
}

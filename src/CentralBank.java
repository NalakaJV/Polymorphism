public class CentralBank {
    void LeasingRate() {
        System.out.println("30% Below");
    }
}
class CommercialBank extends CentralBank {
    void housingLoneRate() {
        System.out.println("25%");
    }
    @Override
    void LeasingRate() {
        System.out.println("30%");
    }
}
class CommercialLeasing extends CommercialBank {
    @Override
    void LeasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank {
    void housingLoneRate() {
        System.out.println("20%");
    }
    @Override
    void LeasingRate() {
        System.out.println("22%");
    }
}
class RateResult {
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.LeasingRate();
        cb.LeasingRate();
        cl.LeasingRate();
        cc.LeasingRate();
        CommercialBank clb, ccl;
        ccl = new CommercialCredit();
        clb = new CommercialBank();
        clb.housingLoneRate();
        ccl.housingLoneRate();
    }
}
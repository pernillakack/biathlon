package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Podiums")
public class Podiums {
    @JacksonXmlProperty(localName = "ALL_I_P")
    private int ALL_I_P;
    @JacksonXmlProperty(localName = "WC_I_P")
    private int WC_I_P;
    @JacksonXmlProperty(localName = "WCH_I_P")
    private int WCH_I_P;
    @JacksonXmlProperty(localName = "OWG_I_P")
    private int OWG_I_P;
    @JacksonXmlProperty(localName = "ALL_I_P_G")
    private int ALL_I_P_G;
    @JacksonXmlProperty(localName = "WC_I_P_G")
    private int WC_I_P_G;
    @JacksonXmlProperty(localName = "WCH_I_P_G")
    private int WCH_I_P_G;
    @JacksonXmlProperty(localName = "OWG_I_P_G")
    private int OWG_I_P_G;
    @JacksonXmlProperty(localName = "ALL_I_P_S")
    private int ALL_I_P_S;
    @JacksonXmlProperty(localName = "WC_I_P_S")
    private int WC_I_P_S;
    @JacksonXmlProperty(localName = "WCH_I_P_S")
    private int WCH_I_P_S;
    @JacksonXmlProperty(localName = "OWG_I_P_S")
    private OWG_I_P_S OWG_I_P_S;
    @JacksonXmlProperty(localName = "ALL_I_P_B")
    private int ALL_I_P_B;
    @JacksonXmlProperty(localName = "WC_I_P_B")
    private int WC_I_P_B;
    @JacksonXmlProperty(localName = "WCH_I_P_B")
    private int WCH_I_P_B;
    @JacksonXmlProperty(localName = "OWG_I_P_B")
    private OWG_I_P_B OWG_I_P_B;
    @JacksonXmlProperty(localName = "ALL_T_P")
    private int ALL_T_P;
    @JacksonXmlProperty(localName = "WC_T_P")
    private int WC_T_P;
    @JacksonXmlProperty(localName = "WCH_T_P")
    private int WCH_T_P;
    @JacksonXmlProperty(localName = "OWG_T_P")
    private int OWG_T_P;
    @JacksonXmlProperty(localName = "ALL_T_P_G")
    private int ALL_T_P_G;
    @JacksonXmlProperty(localName = "WC_T_P_G")
    private int WC_T_P_G;
    @JacksonXmlProperty(localName = "WCH_T_P_G")
    private WCH_T_P_G WCH_T_P_G;
    @JacksonXmlProperty(localName = "OWG_T_P_G")
    private int OWG_T_P_G;
    @JacksonXmlProperty(localName = "ALL_T_P_S")
    private int ALL_T_P_S;
    @JacksonXmlProperty(localName = "WC_T_P_S")
    private int WC_T_P_S;
    @JacksonXmlProperty(localName = "WCH_T_P_S")
    private int WCH_T_P_S;
    @JacksonXmlProperty(localName = "OWG_T_P_S")
    private int OWG_T_P_S;
    @JacksonXmlProperty(localName = "ALL_T_P_B")
    private int ALL_T_P_B;
    @JacksonXmlProperty(localName = "WC_T_P_B")
    private int WC_T_P_B;
    @JacksonXmlProperty(localName = "WCH_T_P_B")
    private int WCH_T_P_B;
    @JacksonXmlProperty(localName = "OWG_T_P_B")
    private OWG_T_P_B OWG_T_P_B;
    @JacksonXmlProperty(localName = "ALL_O_P")
    private int ALL_O_P;
    @JacksonXmlProperty(localName = "WC_O_P")
    private int WC_O_P;
    @JacksonXmlProperty(localName = "WCH_O_P")
    private int WCH_O_P;
    @JacksonXmlProperty(localName = "OWG_O_P")
    private int OWG_O_P;
    @JacksonXmlProperty(localName = "ALL_O_P_G")
    private int ALL_O_P_G;
    @JacksonXmlProperty(localName = "WC_O_P_G")
    private int WC_O_P_G;
    @JacksonXmlProperty(localName = "WCH_O_P_G")
    private int WCH_O_P_G;
    @JacksonXmlProperty(localName = "OWG_O_P_G")
    private int OWG_O_P_G;
    @JacksonXmlProperty(localName = "ALL_O_P_S")
    private int ALL_O_P_S;
    @JacksonXmlProperty(localName = "WC_O_P_S")
    private int WC_O_P_S;
    @JacksonXmlProperty(localName = "WCH_O_P_S")
    private int WCH_O_P_S;
    @JacksonXmlProperty(localName = "OWG_O_P_S")
    private int OWG_O_P_S;
    @JacksonXmlProperty(localName = "ALL_O_P_B")
    private int ALL_O_P_B;
    @JacksonXmlProperty(localName = "WC_O_P_B")
    private int WC_O_P_B;
    @JacksonXmlProperty(localName = "WCH_O_P_B")
    private int WCH_O_P_B;
    @JacksonXmlProperty(localName = "OWG_O_P_B")
    private OWG_O_P_B OWG_O_P_B;
    @JacksonXmlProperty(localName = "IC_I_P_G")
    private IC_I_P_G IC_I_P_G;
    @JacksonXmlProperty(localName = "ECH_I_P_G")
    private int ECH_I_P_G;
    @JacksonXmlProperty(localName = "ICECH_I_P_G")
    private int ICECH_I_P_G;

    @Override
    public String toString() {
        return "Podiums{" +
                "ALL_I_P=" + ALL_I_P +
                ", WC_I_P=" + WC_I_P +
                ", WCH_I_P=" + WCH_I_P +
                ", OWG_I_P=" + OWG_I_P +
                ", ALL_I_P_G=" + ALL_I_P_G +
                ", WC_I_P_G=" + WC_I_P_G +
                ", WCH_I_P_G=" + WCH_I_P_G +
                ", OWG_I_P_G=" + OWG_I_P_G +
                ", ALL_I_P_S=" + ALL_I_P_S +
                ", WC_I_P_S=" + WC_I_P_S +
                ", WCH_I_P_S=" + WCH_I_P_S +
                ", OWG_I_P_S=" + OWG_I_P_S +
                ", ALL_I_P_B=" + ALL_I_P_B +
                ", WC_I_P_B=" + WC_I_P_B +
                ", WCH_I_P_B=" + WCH_I_P_B +
                ", OWG_I_P_B=" + OWG_I_P_B +
                ", ALL_T_P=" + ALL_T_P +
                ", WC_T_P=" + WC_T_P +
                ", WCH_T_P=" + WCH_T_P +
                ", OWG_T_P=" + OWG_T_P +
                ", ALL_T_P_G=" + ALL_T_P_G +
                ", WC_T_P_G=" + WC_T_P_G +
                ", WCH_T_P_G=" + WCH_T_P_G +
                ", OWG_T_P_G=" + OWG_T_P_G +
                ", ALL_T_P_S=" + ALL_T_P_S +
                ", WC_T_P_S=" + WC_T_P_S +
                ", WCH_T_P_S=" + WCH_T_P_S +
                ", OWG_T_P_S=" + OWG_T_P_S +
                ", ALL_T_P_B=" + ALL_T_P_B +
                ", WC_T_P_B=" + WC_T_P_B +
                ", WCH_T_P_B=" + WCH_T_P_B +
                ", OWG_T_P_B=" + OWG_T_P_B +
                ", ALL_O_P=" + ALL_O_P +
                ", WC_O_P=" + WC_O_P +
                ", WCH_O_P=" + WCH_O_P +
                ", OWG_O_P=" + OWG_O_P +
                ", ALL_O_P_G=" + ALL_O_P_G +
                ", WC_O_P_G=" + WC_O_P_G +
                ", WCH_O_P_G=" + WCH_O_P_G +
                ", OWG_O_P_G=" + OWG_O_P_G +
                ", ALL_O_P_S=" + ALL_O_P_S +
                ", WC_O_P_S=" + WC_O_P_S +
                ", WCH_O_P_S=" + WCH_O_P_S +
                ", OWG_O_P_S=" + OWG_O_P_S +
                ", ALL_O_P_B=" + ALL_O_P_B +
                ", WC_O_P_B=" + WC_O_P_B +
                ", WCH_O_P_B=" + WCH_O_P_B +
                ", OWG_O_P_B=" + OWG_O_P_B +
                ", IC_I_P_G=" + IC_I_P_G +
                ", ECH_I_P_G=" + ECH_I_P_G +
                ", ICECH_I_P_G=" + ICECH_I_P_G +
                '}';
    }
    public Podiums() {}

    public int getALL_I_P() {
        return ALL_I_P;
    }

    public void setALL_I_P(int ALL_I_P) {
        this.ALL_I_P = ALL_I_P;
    }

    public int getWC_I_P() {
        return WC_I_P;
    }

    public void setWC_I_P(int WC_I_P) {
        this.WC_I_P = WC_I_P;
    }

    public int getWCH_I_P() {
        return WCH_I_P;
    }

    public void setWCH_I_P(int WCH_I_P) {
        this.WCH_I_P = WCH_I_P;
    }

    public int getOWG_I_P() {
        return OWG_I_P;
    }

    public void setOWG_I_P(int OWG_I_P) {
        this.OWG_I_P = OWG_I_P;
    }

    public int getALL_I_P_G() {
        return ALL_I_P_G;
    }

    public void setALL_I_P_G(int ALL_I_P_G) {
        this.ALL_I_P_G = ALL_I_P_G;
    }

    public int getWC_I_P_G() {
        return WC_I_P_G;
    }

    public void setWC_I_P_G(int WC_I_P_G) {
        this.WC_I_P_G = WC_I_P_G;
    }

    public int getWCH_I_P_G() {
        return WCH_I_P_G;
    }

    public void setWCH_I_P_G(int WCH_I_P_G) {
        this.WCH_I_P_G = WCH_I_P_G;
    }

    public int getOWG_I_P_G() {
        return OWG_I_P_G;
    }

    public void setOWG_I_P_G(int OWG_I_P_G) {
        this.OWG_I_P_G = OWG_I_P_G;
    }

    public int getALL_I_P_S() {
        return ALL_I_P_S;
    }

    public void setALL_I_P_S(int ALL_I_P_S) {
        this.ALL_I_P_S = ALL_I_P_S;
    }

    public int getWC_I_P_S() {
        return WC_I_P_S;
    }

    public void setWC_I_P_S(int WC_I_P_S) {
        this.WC_I_P_S = WC_I_P_S;
    }

    public int getWCH_I_P_S() {
        return WCH_I_P_S;
    }

    public void setWCH_I_P_S(int WCH_I_P_S) {
        this.WCH_I_P_S = WCH_I_P_S;
    }

    public OWG_I_P_S getOWG_I_P_S() {
        return OWG_I_P_S;
    }

    public void setOWG_I_P_S(OWG_I_P_S OWG_I_P_S) {
        this.OWG_I_P_S = OWG_I_P_S;
    }

    public int getALL_I_P_B() {
        return ALL_I_P_B;
    }

    public void setALL_I_P_B(int ALL_I_P_B) {
        this.ALL_I_P_B = ALL_I_P_B;
    }

    public int getWC_I_P_B() {
        return WC_I_P_B;
    }

    public void setWC_I_P_B(int WC_I_P_B) {
        this.WC_I_P_B = WC_I_P_B;
    }

    public int getWCH_I_P_B() {
        return WCH_I_P_B;
    }

    public void setWCH_I_P_B(int WCH_I_P_B) {
        this.WCH_I_P_B = WCH_I_P_B;
    }

    public perni.com.biathlon.models.ibubios.OWG_I_P_B getOWG_I_P_B() {
        return OWG_I_P_B;
    }

    public void setOWG_I_P_B(perni.com.biathlon.models.ibubios.OWG_I_P_B OWG_I_P_B) {
        this.OWG_I_P_B = OWG_I_P_B;
    }

    public int getALL_T_P() {
        return ALL_T_P;
    }

    public void setALL_T_P(int ALL_T_P) {
        this.ALL_T_P = ALL_T_P;
    }

    public int getWC_T_P() {
        return WC_T_P;
    }

    public void setWC_T_P(int WC_T_P) {
        this.WC_T_P = WC_T_P;
    }

    public int getWCH_T_P() {
        return WCH_T_P;
    }

    public void setWCH_T_P(int WCH_T_P) {
        this.WCH_T_P = WCH_T_P;
    }

    public int getOWG_T_P() {
        return OWG_T_P;
    }

    public void setOWG_T_P(int OWG_T_P) {
        this.OWG_T_P = OWG_T_P;
    }

    public int getALL_T_P_G() {
        return ALL_T_P_G;
    }

    public void setALL_T_P_G(int ALL_T_P_G) {
        this.ALL_T_P_G = ALL_T_P_G;
    }

    public int getWC_T_P_G() {
        return WC_T_P_G;
    }

    public void setWC_T_P_G(int WC_T_P_G) {
        this.WC_T_P_G = WC_T_P_G;
    }

    public WCH_T_P_G getWCH_T_P_G() {
        return WCH_T_P_G;
    }

    public void setWCH_T_P_G(WCH_T_P_G WCH_T_P_G) {
        this.WCH_T_P_G = WCH_T_P_G;
    }

    public int getOWG_T_P_G() {
        return OWG_T_P_G;
    }

    public void setOWG_T_P_G(int OWG_T_P_G) {
        this.OWG_T_P_G = OWG_T_P_G;
    }

    public int getALL_T_P_S() {
        return ALL_T_P_S;
    }

    public void setALL_T_P_S(int ALL_T_P_S) {
        this.ALL_T_P_S = ALL_T_P_S;
    }

    public int getWC_T_P_S() {
        return WC_T_P_S;
    }

    public void setWC_T_P_S(int WC_T_P_S) {
        this.WC_T_P_S = WC_T_P_S;
    }

    public int getWCH_T_P_S() {
        return WCH_T_P_S;
    }

    public void setWCH_T_P_S(int WCH_T_P_S) {
        this.WCH_T_P_S = WCH_T_P_S;
    }

    public int getOWG_T_P_S() {
        return OWG_T_P_S;
    }

    public void setOWG_T_P_S(int OWG_T_P_S) {
        this.OWG_T_P_S = OWG_T_P_S;
    }

    public int getALL_T_P_B() {
        return ALL_T_P_B;
    }

    public void setALL_T_P_B(int ALL_T_P_B) {
        this.ALL_T_P_B = ALL_T_P_B;
    }

    public int getWC_T_P_B() {
        return WC_T_P_B;
    }

    public void setWC_T_P_B(int WC_T_P_B) {
        this.WC_T_P_B = WC_T_P_B;
    }

    public int getWCH_T_P_B() {
        return WCH_T_P_B;
    }

    public void setWCH_T_P_B(int WCH_T_P_B) {
        this.WCH_T_P_B = WCH_T_P_B;
    }

    public perni.com.biathlon.models.ibubios.OWG_T_P_B getOWG_T_P_B() {
        return OWG_T_P_B;
    }

    public void setOWG_T_P_B(perni.com.biathlon.models.ibubios.OWG_T_P_B OWG_T_P_B) {
        this.OWG_T_P_B = OWG_T_P_B;
    }

    public int getALL_O_P() {
        return ALL_O_P;
    }

    public void setALL_O_P(int ALL_O_P) {
        this.ALL_O_P = ALL_O_P;
    }

    public int getWC_O_P() {
        return WC_O_P;
    }

    public void setWC_O_P(int WC_O_P) {
        this.WC_O_P = WC_O_P;
    }

    public int getWCH_O_P() {
        return WCH_O_P;
    }

    public void setWCH_O_P(int WCH_O_P) {
        this.WCH_O_P = WCH_O_P;
    }

    public int getOWG_O_P() {
        return OWG_O_P;
    }

    public void setOWG_O_P(int OWG_O_P) {
        this.OWG_O_P = OWG_O_P;
    }

    public int getALL_O_P_G() {
        return ALL_O_P_G;
    }

    public void setALL_O_P_G(int ALL_O_P_G) {
        this.ALL_O_P_G = ALL_O_P_G;
    }

    public int getWC_O_P_G() {
        return WC_O_P_G;
    }

    public void setWC_O_P_G(int WC_O_P_G) {
        this.WC_O_P_G = WC_O_P_G;
    }

    public int getWCH_O_P_G() {
        return WCH_O_P_G;
    }

    public void setWCH_O_P_G(int WCH_O_P_G) {
        this.WCH_O_P_G = WCH_O_P_G;
    }

    public int getOWG_O_P_G() {
        return OWG_O_P_G;
    }

    public void setOWG_O_P_G(int OWG_O_P_G) {
        this.OWG_O_P_G = OWG_O_P_G;
    }

    public int getALL_O_P_S() {
        return ALL_O_P_S;
    }

    public void setALL_O_P_S(int ALL_O_P_S) {
        this.ALL_O_P_S = ALL_O_P_S;
    }

    public int getWC_O_P_S() {
        return WC_O_P_S;
    }

    public void setWC_O_P_S(int WC_O_P_S) {
        this.WC_O_P_S = WC_O_P_S;
    }

    public int getWCH_O_P_S() {
        return WCH_O_P_S;
    }

    public void setWCH_O_P_S(int WCH_O_P_S) {
        this.WCH_O_P_S = WCH_O_P_S;
    }

    public int getOWG_O_P_S() {
        return OWG_O_P_S;
    }

    public void setOWG_O_P_S(int OWG_O_P_S) {
        this.OWG_O_P_S = OWG_O_P_S;
    }

    public int getALL_O_P_B() {
        return ALL_O_P_B;
    }

    public void setALL_O_P_B(int ALL_O_P_B) {
        this.ALL_O_P_B = ALL_O_P_B;
    }

    public int getWC_O_P_B() {
        return WC_O_P_B;
    }

    public void setWC_O_P_B(int WC_O_P_B) {
        this.WC_O_P_B = WC_O_P_B;
    }

    public int getWCH_O_P_B() {
        return WCH_O_P_B;
    }

    public void setWCH_O_P_B(int WCH_O_P_B) {
        this.WCH_O_P_B = WCH_O_P_B;
    }

    public perni.com.biathlon.models.ibubios.OWG_O_P_B getOWG_O_P_B() {
        return OWG_O_P_B;
    }

    public void setOWG_O_P_B(perni.com.biathlon.models.ibubios.OWG_O_P_B OWG_O_P_B) {
        this.OWG_O_P_B = OWG_O_P_B;
    }

    public perni.com.biathlon.models.ibubios.IC_I_P_G getIC_I_P_G() {
        return IC_I_P_G;
    }

    public void setIC_I_P_G(perni.com.biathlon.models.ibubios.IC_I_P_G IC_I_P_G) {
        this.IC_I_P_G = IC_I_P_G;
    }

    public int getECH_I_P_G() {
        return ECH_I_P_G;
    }

    public void setECH_I_P_G(int ECH_I_P_G) {
        this.ECH_I_P_G = ECH_I_P_G;
    }

    public int getICECH_I_P_G() {
        return ICECH_I_P_G;
    }

    public void setICECH_I_P_G(int ICECH_I_P_G) {
        this.ICECH_I_P_G = ICECH_I_P_G;
    }
}

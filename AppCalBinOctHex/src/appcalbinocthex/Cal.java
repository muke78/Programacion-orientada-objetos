package appcalbinocthex;
/**
 *
 * @author Muke
 */
public class Cal {

    private int num, num2, num3;
    private int resi;
    private String resiBin;
    private String resiCot;
    private String resiHex;
    

    public Cal() {
        num2 = num3 = num = resi = 0;
        this.resiBin = "";
        this.resiCot = "";
        this.resiHex = "";
   }
    public void setNum(int num) {
        num2 = num;
        num3 = num;
        this.num = num;
    }
    
    public void Bin() {
        while (num > 0) {
            resi = num % 2;
            num = num / 2;
            this.resiBin = String.valueOf(resi)+resiBin;
        }
    }
    public void Oct() {
        while (num2 > 0) {
            resi = num2 % 8;
            num2 = num2 / 8;
            this.resiCot = String.valueOf(resi) + resiCot;
        }
    }
    public void Hex() {
        char[] hexa =  {'0','1','2','3','4','5','6','7','8','9','A','B',
            'C','D','E','F'};
        String hexaValor = "";
        while (num3 > 0) {
            resi = num3 % 16;
            hexaValor = hexa [resi] + hexaValor;
            num3 = num3 /16;
            this.resiHex = String.valueOf(hexaValor);
        }
    }
    public String getResiBin() {
        return resiBin;
    }
    public String getResiCot() {
        return resiCot;
    }
    public String getResiHex() {
        return resiHex;
    }
}

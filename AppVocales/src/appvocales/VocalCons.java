/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvocales;
/**
 *
 * @author Muke
 */
public class VocalCons {
    
    private String letStr;
    private char letChar;
    private String msg;

    public VocalCons() {
        letStr = msg = "";
        letChar = ' ';
    }
    public void setLetStr(String letStr) {
        this.letStr = letStr;
    }
    public void setLetChar(char letChar) {
        this.letChar = letChar;
    }
    public void evaluaVocalChar(){
        if (letChar ==  'a'||letChar == 'e'||letChar == 'i'||letChar == 'o'||letChar == 'u'||letChar ==  'A'||letChar == 'E'||letChar == 'I'||letChar == 'O'||letChar == 'U') 
            msg = "Vocal";
        else
             msg = "Consonante";
    }
    public void evaluaVocalStr(){
        
       String auxletra = this.letStr.toUpperCase();
       
        if (auxletra.equals("A")||auxletra.equals("E")||auxletra.equals("I")||auxletra.equals("O")||auxletra.equals("U")) 
            msg = "Vocal";
        else
             msg = "Consonante";
    }
    public String getLetStr() {
        return letStr;
    }
    public char getLetChar() {
        return letChar;
    }
    public String getMsg() {
        return msg;
    }
    
}

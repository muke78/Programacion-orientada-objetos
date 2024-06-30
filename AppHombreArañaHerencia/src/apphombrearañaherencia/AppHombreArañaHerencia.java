
package apphombrearañaherencia;


public class AppHombreArañaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HombreAraña ha = new HombreAraña();
        ha.datosHombre("Erick","Masculino",20,1.66,60);
        ha.metHombre();
        ha.metHombre();
        ha.Poder();
        ha.Trepar();
        ha.Valiente();
        System.out.println(ha.toString());
    }
}

package apphoycircula;

public class Placas {

    private int placa;
    private String color;
    private String dia;

    public Placas() {
        placa = 0;
        color = dia = "";
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void detCircula() {
        switch (placa) {
            case 5:
            case 6:
                color = "Amarillo";
                dia = "Lunes";
                break;
            case 7:
            case 8:
                color = "Rosa";
                dia = "Martes";
                break;
            case 3:
            case 4:
                color = "Naranja";
                dia = "Miercoles";
                break;
            case 1:
            case 2:
                color = "Verde";
                dia = "Jueves";
                break;
            case 9:
            case 0:
                color = "Azul";
                dia = "Viernes";
                break;

            default:
                color = "No hay para ese dia ";
                dia = "No existe ese dia";
        }
        
    }

    public String getColor() {
        return color;
    }

    public String getDia() {
        return dia;
    }

}

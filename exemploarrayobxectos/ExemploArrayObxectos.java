package exemploarrayobxectos;

public class ExemploArrayObxectos {

    
    public static void main(String[] args) {
        Xogador[] futbol = new Xogador[Metodos.elementos()];
        Metodos obx = new Metodos();
        futbol = obx.crearArray(futbol);
        obx.amosaArray(futbol);
        /*obx.ordenarDorsal(futbol);
        obx.amosaArray(futbol);*/
        obx.ordenarNombre(futbol);
        obx.amosaArray(futbol);
    }
    
}

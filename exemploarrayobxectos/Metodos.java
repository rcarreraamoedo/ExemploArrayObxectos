package exemploarrayobxectos;

import java.util.Arrays;

public class Metodos {

//Xogador[] xogadores = new Xogador[elementos()];

    public static int elementos() {
        return PedirDatos.pedirInt("Numero de Elementos: ");
    }

    public Xogador[] crearArray(Xogador[]xogadores) {
        String nom;
        int dor;
        for (int i = 0; i < xogadores.length; i++) {
            nom = PedirDatos.pedirString("Nome: ");
            dor = PedirDatos.pedirInt("Dorsal: ");
            xogadores[i] = new Xogador(nom, dor);
            //Tamén se pode facer deste xeito
            //xogadores[i]=new Xogador(PedirDatos.pedirString(),PedirDatos.pedirInt());
        }
        return xogadores;
    }
    public void amosaArray(Xogador[]lista) {
        for(Xogador elemento:lista)
            System.out.println(elemento);
    }
    
    public void ordenarDorsal(Xogador[]lista) {
        Arrays.sort(lista);
    }
    public void ordenarNombre(Xogador[]lista){
        Arrays.sort(lista);
    }
}

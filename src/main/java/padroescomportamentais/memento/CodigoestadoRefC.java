package padroescomportamentais.memento;


public class CodigoestadoRefC implements CodigoEstadoRefatorado {

    private CodigoestadoRefC() {};
    private static CodigoestadoRefC instance = new CodigoestadoRefC();
    public static CodigoestadoRefC getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Console.WriteLine";
    }
    
}


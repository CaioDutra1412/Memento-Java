package padroescomportamentais.memento;


public class CodigoestadoRefJava implements CodigoEstadoRefatorado {

    private CodigoestadoRefJava() {};
    private static CodigoestadoRefJava instance = new CodigoestadoRefJava();
    public static CodigoestadoRefJava getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "System.out.println";
    }

}

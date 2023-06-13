package padroescomportamentais.memento;


public class CodigoestadoRefPython implements CodigoEstadoRefatorado {

    private CodigoestadoRefPython() {};
    private static CodigoestadoRefPython instance = new CodigoestadoRefPython();
    public static CodigoestadoRefPython getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "print";
    }

}

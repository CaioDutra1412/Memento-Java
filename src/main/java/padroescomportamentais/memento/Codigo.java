package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Codigo {

    private CodigoEstadoRefatorado estado;
    private List<CodigoEstadoRefatorado> memento = new ArrayList<CodigoEstadoRefatorado>();

    public CodigoEstadoRefatorado getEstado() {
        return this.estado;
    }

    public void setEstado(CodigoEstadoRefatorado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Escolha um indice válido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CodigoEstadoRefatorado> getEstados() {
        return this.memento;
    }
}

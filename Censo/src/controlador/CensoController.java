/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.interfazDAO.DataAccessObject;
import controlador.listas.LinkedList;
import controlador.listas.exception.VacioException;
import java.io.IOException;
import modelo.Censo;

/**
 *
 * @author santiago
 */

public class CensoController extends DataAccessObject<Censo> {

    private Censo censo = new Censo();

    public CensoController() {
        super(Censo.class);
    }

    public Censo getCenso() {
        if (censo == null) {
            censo = new Censo();
        }
        return censo;
    }

    public void setCenso(Censo censo) {
        this.censo = censo;
    }

    public Boolean save() {
        censo.setId(generated_id());
        return save(censo);
    }

    public void update(Integer pos) throws IOException{
        this.update(censo, pos);
    }

    public String generatedCode() {
        StringBuilder code = new StringBuilder();
        Integer length = listAll().getSize() + 1;
        Integer pos = length.toString().length();
        for (int i = 0; i < (10 - pos); i++) {
            code.append("0");
        }
        code.append(length.toString());
        return code.toString();
    }
    
    public int contarPorMotivo(String Estado) throws VacioException {
        int contador = 0;
        LinkedList<Censo> censos = listAll();

        for (int i = 0; i < censos.getSize(); i++) {
            Censo censo = censos.get(i);
            if (Estado.equals(censo.getEstadoCivil())) {
                contador++;
            }
        }

        return contador;
    }

    public int contarDivorciados() throws VacioException {
        return contarPorMotivo("Divorciado");
    }

    public int contarSeparados() throws VacioException {
        return contarPorMotivo("Separado");
    }
}

package estado.teste;

import estado.bean.EstadoBean;
import estado.dao.EstadoDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteListar {
    public static void main(String[] args) {
        ArrayList<EstadoBean> estados = new ArrayList<>();

        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            estados = (ArrayList<EstadoBean>) ed.listar();
            
            for (EstadoBean estado: estados){
                System.out.println(estado.getCodigo());
                System.out.println(estado.getDescricao());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

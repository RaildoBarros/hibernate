package estado.teste;

import estado.bean.EstadoBean;
import estado.dao.EstadoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteExcluir {
    public static void main(String[] args) {
        EstadoBean estado = new EstadoBean();
        
        estado.setCodigo(2);
        
        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            ed.excluir(estado);
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

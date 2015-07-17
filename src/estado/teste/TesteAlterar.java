package estado.teste;

import estado.bean.EstadoBean;
import estado.dao.EstadoDao;
import estado.dao.EstadoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author Raildo
 */
public class TesteAlterar {
    public static void main(String[] args) {
        EstadoBean estado = new EstadoBean();
        
        estado.setCodigo(2);
        estado.setDescricao("Amazon");
        
        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            ed.alterar(estado);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlterar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

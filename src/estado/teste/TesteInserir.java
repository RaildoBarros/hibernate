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
public class TesteInserir {
    public static void main(String[] args) {
        EstadoBean estado = new EstadoBean();
        
        estado.setDescricao("Amapá");
        
        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            ed.inserir(estado);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
public class TesteSelecionar {
    public static void main(String[] args) {
        EstadoBean estado = new EstadoBean();

        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            estado = (EstadoBean) ed.selecionar(1);
            System.out.println(estado.getCodigo()); 
            System.out.println(estado.getDescricao()); 
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

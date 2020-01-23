/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.util.Collections.list;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author ine-1
 */
public interface crud {
    
    
    public List listar();
    public Cliente list(int id);
    public boolean add(Cliente c);
    public boolean edit(Cliente c);
    public boolean eliminar(int id);
    
    
    
}

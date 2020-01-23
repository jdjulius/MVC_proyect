/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.conexion;
import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author ine-1
 */
public class ClienteDAO implements crud {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente c = new Cliente();

    @Override
    public List listar() {

        ArrayList<Cliente> list = new ArrayList<>();
        String sql = "Select * from cliente;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cc = new Cliente();
                cc.setId(rs.getInt("id"));
                cc.setNombre(rs.getString("nombre"));
                cc.setCorreo(rs.getString("correo"));
                list.add(cc);

            }
        } catch (Exception e) {

        }
        return list;

    }

    @Override
    public Cliente list(int id) {
        String sql = "Select * from cliente where id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setCorreo(rs.getString("correo"));

            }
        } catch (Exception e) {

        }
        return c;
    }

    @Override
    public boolean add(Cliente c) {
        String sql = "INSERT INTO cliente(nombre, correo) values ('" + c.getNombre() + "','" + c.getCorreo() + "');";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Cliente c) {
        String sql = "UPDATE cliente SET nombre = '" + c.getNombre() + "', correo='" + c.getCorreo() + "' WHERE id = " + c.getId() + ";";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE id = " + id + ";";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

}

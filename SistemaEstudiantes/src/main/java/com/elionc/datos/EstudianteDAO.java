package com.elionc.datos;

import com.elionc.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static com.elionc.conexion.Conexion.getConexion;


public class EstudianteDAO {
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiante ORDER BY id_estudiante";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){var estudiante = new Estudiante();
               estudiante.setId_estudiante(rs.getInt("id_estudiante"));
               estudiante.setNombre(rs.getString("nombre"));
               estudiante.setApellido(rs.getString("apellido"));
               estudiante.setTelefono(rs.getString("telefono"));
               estudiante.setEmail(rs.getString("email"));
               estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion");
            }
        }
        return estudiantes;
    }

    public boolean buscarEstudiantesPorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql =  "SELECT * FROM estudiante WHERE id_estudiante = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,estudiante.getId_estudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;

            }
        }catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error cerrando la base de datos");
            }
        }
        return false;
    }
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO estudiante(nombre, apellido, telefono, email) " +
                " VALUE(?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println("Error al agregar estudiante: "+ e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE estudiante SET nombre=?, apellido=?, telefono=?, email=? WHERE id_estudiante =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setInt(5,estudiante.getId_estudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar estudiante: " +  e.getMessage());

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM estudiante WHERE id_estudiante = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,estudiante.getId_estudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
       var estudianteDao = new EstudianteDAO();
       // System.out.println("Listado de estudiantes: " );
       // List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
       // estudiantes.forEach(System.out::println);

      //  var estudiante1 = new Estudiante(1);
      //  System.out.println("Estudiante antes de la busqueda");
       // var encontrado = estudianteDao.buscarEstudiantesPorId(estudiante1);
      //  if (encontrado)
       //     System.out.println("Estudiante encontrado: " + estudiante1);
       // else
       //     System.out.println("No se encontro al estudiante: " + estudiante1.getId_estudiante());

        //var nuevoEstudiante = new Estudiante("Jose Maria","Garcia","55465445", "gar@gmasd.com");
        //var agregado= estudianteDao.agregarEstudiante(nuevoEstudiante);
        //if (agregado) System.out.println("Estudiante agregado: " + nuevoEstudiante);
        //else System.out.println("Estudiante no agregado");

        //var estudianteModificar = new Estudiante(1,"Juan carlos", "Juarez",
                //"65485265", "jua@mail.com");
        //var modificado = estudianteDao.modificarEstudiante(estudianteModificar);
        //if (modificado) System.out.println("Estudiante modificado" + estudianteModificar);
       // else System.out.println("No se pudo modificar " +  estudianteModificar);

        var estudianteEliminar = new Estudiante(3);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        if (eliminado) System.out.println("Estudiante eliminador: "+ estudianteEliminar);
        else System.out.println("No se elimino el estudiante: " +  estudianteEliminar);
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);
    }
}

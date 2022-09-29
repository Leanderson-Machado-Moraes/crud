package br.ulbra.dao;

import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDao {

    Connection con;

    public UsuarioDao() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("select * FROM tbusuario"
                    + " WHERE emailUsu = ? and senhaUsu = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            } else {

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void delete(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbusuario WHERE idUsu = ?");
            stmt.setInt(1, u.getIdUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "
                    + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void create(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbusuario"
                    + "(nomeUsu, emailUsu, senhaUsu, foneUsu, sexoUsu, cep, logradouro, bairro, cidade, estado, numero)"
                    + " VALUES(  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?, ?)");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCep());
            stmt.setString(7, u.getLogradouro());
            stmt.setString(8, u.getBairro());
            stmt.setString(9, u.getCidade());
            stmt.setString(10, u.getEstado());
            stmt.setString(11, u.getNumero());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void update(Usuario u) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbusuario SET nomeUsu = ?, emailUsu = ?, senhaUsu = ?, foneUsu = ?, sexoUsu = ?, cep = ?, logradouro = ?, bairro = ?, cidade = ?, estado = ?, numero = ? WHERE idUsu = ?");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCep());
            stmt.setString(7, u.getLogradouro());
            stmt.setString(8, u.getBairro());
            stmt.setString(9, u.getCidade());
            stmt.setString(10, u.getEstado());
            stmt.setString(11, u.getNumero());
            stmt.setInt(12, u.getIdUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Usuario> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu(rs.getString("emailUsu"));
                usuario.setSenhaUsu(rs.getString("senhaUsu"));
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setCep(rs.getString("cep"));
                usuario.setLogradouro(rs.getString("logradouro"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero(rs.getString("numero"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }

    public List<Usuario> readForDesc(String nome, int tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();

        String script = null;
        try {
            System.out.println("tipo:" + tipo);
            stmt = con.prepareStatement("SELECT idUsu, nomeUsu, emailUsu, cidade, estado  FROM tbUsuario where nomeUsu LIKE '%" + nome + "%'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu(rs.getString("emailUsu"));
                usuario.setSenhaUsu(rs.getString("senhaUsu"));
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setCep(rs.getString("cep"));
                usuario.setLogradouro(rs.getString("logradouro"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero(rs.getString("numero"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public List<Usuario> ordemDandC(String nome, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String script = null;
        try {
            System.out.println("tipo:" + tipo);
            if (tipo == 0) {
                stmt = con.prepareStatement("SELECT *  FROM tbUsuario order by nomeUsu ASC");
            } else {
                stmt = con.prepareStatement("SELECT *  FROM tbUsuario order by nomeUsu DESC");
            }
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu(rs.getString("emailUsu"));
                usuario.setSenhaUsu(rs.getString("senhaUsu"));
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setCep("");
                usuario.setLogradouro(rs.getString("logradouro"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero(rs.getString("numero"));
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public List<Usuario> filtroCidade(String nome, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String script = null;
        try {
            System.out.println("tipo:" + tipo);

            stmt = con.prepareStatement("SELECT idUsu, nomeUsu, foneUsu, cidade, estado  FROM tbUsuario where cidade LIKE '%" + nome + "%'");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu("");
                usuario.setSenhaUsu("");
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(0);
                usuario.setCep("");
                usuario.setLogradouro("");
                usuario.setBairro("");
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero("numero");
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public List<Usuario> filtroEstado(String nome, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();       
        String script = null;
        try {
            System.out.println("tipo:" + tipo);

            stmt = con.prepareStatement("SELECT idUsu, nomeUsu, emailUsu, cidade, estado  FROM tbUsuario where estado LIKE '%" + nome + "%'");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu(rs.getString("emailUsu"));
                usuario.setSenhaUsu("");
                usuario.setFoneUsu("");
                usuario.setSexoUsu(0);
                usuario.setCep("");
                usuario.setLogradouro("");
                usuario.setBairro("");
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero("numero");
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

    public List<Usuario> filtroTelefone(String nome, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String script = null;
        try {
            System.out.println("tipo:" + tipo);

            stmt = con.prepareStatement("SELECT idUsu, nomeUsu, foneUsu, estado, cidade  FROM tbUsuario where foneUsu LIKE '%" + nome + "%'");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setEmailUsu("");
                usuario.setSenhaUsu("");
                usuario.setFoneUsu(rs.getString("foneUsu"));
                usuario.setSexoUsu(0);
                 usuario.setCep("");
                usuario.setLogradouro("");
                usuario.setBairro("");
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setNumero("numero");
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }

}

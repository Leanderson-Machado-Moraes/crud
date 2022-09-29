package br.ulbra.dao;

import br.ulbra.entity.Filme;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FilmeDao {

    Connection con;

    public FilmeDao() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public void delete(Filme f) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbfilme WHERE id = ?");
            stmt.setInt(1, f.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Filme excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "
                    + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void create(Filme f) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbfilme(titulo ,genero, lancamento, tematica, sinopse, duracao, diretor) VALUES( ?,  ?,  ?,  ?,  ?, ?, ?)");
            stmt.setString(1, f.getTitulo());
            stmt.setString(2, f.getGenero());
            stmt.setString(3, f.getLancamento());
            stmt.setString(4, f.getTematica());
            stmt.setString(5, f.getSinopse());
            stmt.setString(6, f.getDuracao());
            stmt.setString(7, f.getDiretor());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Filme favorito adicionado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void update(Filme f) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbFilme SET titulo = ?, genero = ?, lancamento = ?, tematica = ?, sinopse = ?, duracao = ?, diretor = ? WHERE id = ?");
            stmt.setString(1, f.getTitulo());
            stmt.setString(2, f.getGenero());
            stmt.setString(3, f.getLancamento());
            stmt.setString(4, f.getTematica());
            stmt.setString(5, f.getSinopse());
            stmt.setString(6, f.getDuracao());
            stmt.setString(7, f.getDiretor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Filme> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filme> filmes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbfilme");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setLancamento(rs.getString("lancamento"));
                filme.setTematica(rs.getString("tematica"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getString("duracao"));
                filme.setDiretor(rs.getString("diretor"));
                filmes.add(filme);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Filme>) filmes;
    }

    public List<Filme> readForDesc(String titulo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Filme> filmes = new ArrayList<>();
        try {
            stmt = con.prepareStatement(
                    "SELECT * FROM tbFilme WHERE titulo LIKE ?");
            stmt.setString(1, "%" + titulo + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setLancamento(rs.getString("lancamento"));
                filme.setTematica(rs.getString("tematica"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getString("duracao"));
                filme.setDiretor(rs.getString("diretor"));
                filmes.add(filme);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return filmes;
    }

    public List<Filme> filtroGenero(String genero, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Filme> filmes = new ArrayList<>();
        String script = null;
        try {

            String s = "SELECT id, titulo, genero, tematica, duracao, diretor  FROM tbFilme where genero LIKE '%" + genero + "%'";
          //  System.out.println(s);
            stmt = con.prepareStatement(s);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setLancamento("");
                filme.setTematica(rs.getString("tematica"));
                filme.setSinopse("");
                filme.setDuracao(rs.getString("duracao"));
                filme.setDiretor(rs.getString("diretor"));
                filmes.add(filme);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return filmes;

    }

    public List<Filme> filtroTematica(String tematica, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Filme> filmes = new ArrayList<>();
        String script = null;
        try {
            System.out.println("tipo:" + tipo);

            stmt = con.prepareStatement("SELECT id, titulo, genero, lancamento, tematica  FROM tbFilme where tematica LIKE '%" + tematica + "%'");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setLancamento(rs.getString("lancamento"));
                filme.setTematica(rs.getString("tematica"));
                filme.setSinopse("");
                filme.setDuracao("");
                filme.setDiretor("");
                filmes.add(filme);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return filmes;

    }
}

package DAO;

import conexao.Conexao;
import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public void cadastrarUsuario (Usuario usuario){
        String sql = "INSERT INTO USUARIO (nome, login, senha, email) VALUES (?,?,?,?)";
        System.out.println("Conectando...");
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            System.out.println("Dados Inseridos com sucesso");
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Não foi possivel conetar");
            e.printStackTrace();
        }

    }
}

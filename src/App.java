import DAO.UsuarioDAO;
import entity.Usuario;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Usuario u = new Usuario();
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome ");
        String nomeC = ler.nextLine();
        u.setNome(nomeC);
        System.out.print("Login ");
        String loginC = ler.nextLine();
        u.setLogin(loginC);
        System.out.print("Senha ");
        String senhaC = ler.nextLine();
        u.setSenha(senhaC);
        System.out.print("Email: ");
        String emailC = ler.nextLine();
        u.setEmail(emailC);

        new UsuarioDAO().cadastrarUsuario(u);
    }
}

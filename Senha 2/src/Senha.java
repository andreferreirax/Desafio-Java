import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


		public class Senha {

		
			
			public static boolean validaSenha(String senha) {

		        String regex = "^(?=.*[0-9])"
		                + "(?=.*[a-z])(?=.*[A-Z])"
		                + "(?=.*[!@#$%^&*()-+])"
		                + "(?=\\S+$).{6}$";

		        Pattern p = Pattern.compile(regex);


		        if(senha.length() < 6)

		        {
		        	int sum = 6 - senha.length();

		        	System.out.print(sum);

		        }



		        Matcher m = p.matcher(senha);

		        return m.matches();
		    }

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Nome");
		        String nome = scanner.next();
		        System.out.println("Senha");
		        String senha = scanner.next();



		        System.out.println(validaSenha(senha));
		    }


		
		
		}
		

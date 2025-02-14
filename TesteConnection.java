/**
 * 
 */
package singletonProject1;

/**
 * 
 */
public class TesteConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//obter uma conexão ~ instancia
		DatabaseConnection conexaoRH= DatabaseConnection.getInstance();
		DatabaseConnection conexaoTI= DatabaseConnection.getInstance();
		DatabaseConnection conexaoVendas= DatabaseConnection.getInstance();
	}

}

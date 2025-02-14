
package singletonProject1;

/**
 * 
 */
public class DatabaseConnection {
	//instancia unica do Singleton
	private static DatabaseConnection instance;
	
	//Construtor private
	private DatabaseConnection(){
		System.out.println("Conexão com o banco de dados estabelecida");
	}
	//Metodo publico para Obter a instancia unica
	public static DatabaseConnection getInstance() {
		if(instance==null) {
			instance = new DatabaseConnection();
		}
		System.out.println("Método getInstance Executado");
		return instance;
	}
	//Metodo que simula uma operação no banco de dados
	public void executeQuery(String query){
		System.out.println("Executando query: "+query);
	}
}

/**
 * 
 */
package singletonProject1;

/**
 * 
 */
public class TesteConfigManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obter instancia unica do gerenciador
		ConfigManager config = ConfigManager.getInstance();
		ConfigManager confixg = ConfigManager.getInstance();

		ConfigManager confxcig = ConfigManager.getInstance();

		System.out.println(config.getProperties()); 
	}

}

/**
 * 
 */
package singletonProject1;

/**
 * 
 */
public class ConfigManager {
	//Atributos instancia ConfigManager
	private static ConfigManager instance;
	// Atributo para armazenar as configurações
	private String properties="\n app.name=Sistema Empresarial \n app.version=1.0 \n app.language=pt-BR \ncurrency=BRL \n timeout=300 segundos";

	//Construtor privado
	private ConfigManager() {
		
	}
	//Metodo publico getInstance
	public static ConfigManager getInstance() {
		if(instance==null) {
			instance = new ConfigManager();
		}
		System.out.println("Método getInstance Executado");

		return instance;
	}
	
	public String getProperties() {
		return properties;
	}
}

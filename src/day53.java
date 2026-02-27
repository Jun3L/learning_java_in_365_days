import java.io.*;
import java.util.Properties;
public class day53 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try{
            //It will open the file of config.properties
            FileInputStream fils = new FileInputStream("config.properties");
            properties.load(fils);
            
            // it will get the settings to the .properties file
            String appName = properties.getProperty("app.name");
            String appVersion = properties.getProperty("app.version");
            String dbURL = properties.getProperty("db.url");
            String dbUser = properties.getProperty("db.user");
            String dbPassword = properties.getProperty("db.password");

            //Displaying  the setting or info

            System.out.println("App name: " + appName);
            System.out.println("Version: " + appVersion);
            System.out.println("DB URL: " + dbURL);
            System.out.println("DB USER: " + dbUser);
            System.out.println("DB PASSWORD: " + dbPassword);
            System.out.println(System.getProperty("user.dir"));
            fils.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ActorExportApp {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get("db.properties"))){
            prop.load(input);
        } catch(IOException e){
            System.err.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
            return;
        }
        
        String url = prop.getProperty("url");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        String csvPath = prop.getProperty("csv.path", "actors.csv");

        // 1. Properly declared the ArrayList here
        ArrayList<File> generatedFiles = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("=== Exportando Atores Registrados ===");
            try(Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT actor_id, first_name, last_name FROM actor ORDER BY actor_id LIMIT 20");
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(csvPath))) {

                writer.write("actor_id,first_name,last_name\n");
                
                // 2. Cleaned up the while loop so it ONLY handles writing the data
                while(rs.next()){
                    int id = rs.getInt("actor_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    
                    writer.write(String.format("%d,%s,%s\n", id, firstName, lastName));
                }
                
                // 3. Created the File object correctly AFTER the file is finished writing
                File tabela = new File(csvPath);
                
                // 4. Added the File to the ArrayList
                generatedFiles.add(tabela);
                
                System.out.println("Exportação para CSV concluída com sucesso (" + csvPath + ")!");
                System.out.println("Arquivos armazenados na lista: " + generatedFiles.size());
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
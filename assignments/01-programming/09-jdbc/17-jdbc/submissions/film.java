import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class film {
    public static void main(String[] args) {
        Properties prop = new Properties;
        try (InputStream input = Files.newInputStream(Paths.get("properties.db"))){
            props.load(input);
        } catch (IOException e) {
            System.out.print("Erro ao carregar arquivo!: " + IOException e);
            return;
        }
        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String txtPath = props.getProperty("txt.path");

        ArrayList<File> films = new ArrayList<>();

       try (Connection conn =  DriverManager.getConnection(url, user, password)){
        conn.setAutoCommit = false;
        System.out.println("=== Filmes para Alugar ===");
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title, rental_rate FROM film WHERE rent_duration = 99");
            BufferedWriter writer = Files.newBufferedWritter(Paths.get(txtPath))) {

                writer.write("title,rental_rate,rental_duration\n");
                while(rs.next){
                    System.out.println(" Titulos e Tempo de Aluguel: \n",
                    rs.getString("title"));
                    rs.getInt("rental_rate");

                    writer.write(String.format("%s, %d\n", title, rental_rate));
                }
                file registroFilmes = new File(txtPath);
                films.add(registroFilmes);
                System.out.print("O resgistro de filmes foi salvo com sucesso (" + txtPath + ")!");
                System.out.println("Arquivo armazenado em" + films.size());
            }
        }
        System.out.println("=== Inserir Mais Filmes ===");
        try(PreparedStatement ps = conn.PreparedStatement("INSERT INTO film (title, language_id, rental_duration, rental_rate, replacement_cost) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1, "TEMP_CATEGORY");
            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) {
                        int newId = keys.getInt(1);
                        System.out.println("Categoria inserida com ID: " + newId);
                    }
                }
            }
            conn.rollback();
        } catch(SQLException | IOException e) {
            System.out.print(IOException e);
        }
    }

}



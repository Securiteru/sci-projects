import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {

    private Reader productReader;

    public ProductReader(Reader reader){
        this.productReader=reader;
    }

    public List<Product> getProdcutsFromCsv() throws IOException {
        try (BufferedReader br = new BufferedReader(productReader)){
            ArrayList<Product> players = new ArrayList<Product>();
            String line = br.readLine();
            while (line != null) {
                players.add(getOrder(line));
                line = br.readLine();
            }
            return players;
        }
    }

    private Product getOrder(String line) {
        String[] tokens = line.split(",");
        return new Product(Integer.parseInt(tokens[0]) , tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
    }
}

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("products.csv");
        if (!f.exists()) {
            System.out.println("File " + f.getName() + " does not exist.");
            return;
        }
        FileReader fr = new FileReader(f);
        List<Product> products = new ProductReader(fr).getProdcutsFromCsv();

        ProductStatistics prodstati = new ProductStatistics();

        prodstati.populateList(products);

        ProductWriter pw=new ProductWriter();

        pw.writeStatsToFile(prodstati);
    }
}
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProductWriter {

    public void writeStatsToFile(ProductStatistics statis) throws IOException {
        File f = new File("statisticsOutput.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            Map<String, Integer> prods = statis.getTopProducts();
            Map<String, Integer> topBuy = statis.getTopBuyers();
            Map<String, Integer> topSpend = statis.getBiggestSpenders();

            bw.append("Best Selling Products:\n");
            int countTopProd=0;
            for (Map.Entry<String, Integer> entry : prods.entrySet()) {
                bw.append((countTopProd) + ". " + entry.getKey()+ " - " + entry.getValue());
                bw.newLine();
                countTopProd++;

            }
            bw.append("\nTop Customers\n");

            int countgetTopBuyers=0;
            for (Map.Entry<String, Integer> entry : topBuy.entrySet()) {
                bw.append((countgetTopBuyers) + ". " + entry.getKey()+ " - " + entry.getValue());
                bw.newLine();
                countgetTopBuyers++;

            }


            bw.append("\nTop Returning Customers:\n");
            int countTopSpenders=0;
            for (Map.Entry<String, Integer> entry : topSpend.entrySet()) {
                bw.append((countTopSpenders) + ". " + entry.getKey()+ " - " + entry.getValue());
                bw.newLine();
                countTopSpenders++;

            }

        }
    }

}

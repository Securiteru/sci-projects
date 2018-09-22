import java.util.*;

public class ProductStatistics {

    private ArrayList<Product> productSales = new ArrayList<>();

    public void populateList(List<Product> prod) {

        Iterator<Product> indexProduct = prod.iterator();
        while (indexProduct.hasNext()) {
            this.productSales.add(indexProduct.next());
        }
    }

    public ArrayList<Product> getInternalList() {
        return this.productSales;
    }

    public Map<String, Integer> getTopProducts() {
        ArrayList<Product> list = this.productSales;

        HashMap<String, Integer> topProductCount = new HashMap<>();

        for(Product p: list){
            if(topProductCount.containsKey(p.getName())){
                topProductCount.put(p.getName(),topProductCount.get(p.getName())+1);
            }else{
                topProductCount.put(p.getName(),1);
            }
        }

        Map<String, Integer> map = sortByValues(topProductCount);

        return map;
    }

    public Map<String, Integer> getBiggestSpenders() {
        ArrayList<Product> list = this.productSales;

        HashMap<String, Integer> topBuyers = new HashMap<>();

        for(Product p: list){
            if( topBuyers .containsKey(p.getProductOwner())){
                topBuyers .put(p.getProductOwner(), topBuyers.get(p.getProductOwner())+p.getPrice());
            }else{
                topBuyers .put(p.getProductOwner(),p.getPrice());
            }
        }

        Map<String, Integer> map = sortByValues(topBuyers);

        return map;
    }

    public Map<String, Integer> getTopBuyers() {

        ArrayList<Product> list = this.productSales;

        HashMap<String, Integer> topBuyersCount = new HashMap<>();

        for(Product p: list){
            if(topBuyersCount.containsKey(p.getProductOwner())){
                topBuyersCount.put(p.getProductOwner(),topBuyersCount.get(p.getProductOwner())+1);
            }else{
                topBuyersCount.put(p.getProductOwner(),1);
            }
        }

        Map<String, Integer> map = sortByValues(topBuyersCount);

        return map;
    }

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o2, Object o1) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}

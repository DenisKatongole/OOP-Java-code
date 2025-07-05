public class VATCalculator {
    public static void main(String[] args) {
        TaxCategory[] categories = {
            new Retailer(), new Wholesaler(), new Importer()
        };
        double[] amounts = {100, 200, 300};

        for (TaxCategory category : categories) {
            for (double amount : amounts) {
                System.out.println(category.getClass().getSimpleName() + " VAT: " + 
                                   category.calculateVAT(amount));
            }
        }
    }
}

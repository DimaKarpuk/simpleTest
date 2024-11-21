public class ProductsModel {
    private String nameProduct;
    private int cost;
    private boolean coll;

    public ProductsModel(String nameProduct, int cost, boolean coll) {
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.coll = coll;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isColl() {
        return coll;
    }

    public void setColl(boolean coll) {
        this.coll = coll;
    }
}

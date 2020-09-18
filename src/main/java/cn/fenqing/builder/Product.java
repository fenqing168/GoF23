package cn.fenqing.builder;

/**
 * @author fenqing
 */
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    static class Builder{
        private Product product;

        public Builder() {
            this.product = new Product();
        }

        public Builder partA(String partA){
            product.partA = partA;
            return this;
        }

        public Builder partB(String partB){
            product.partB = partB;
            return this;
        }

        public Builder partC(String partC){
            product.partC = partC;
            return this;
        }

        public Product builder(){
            return product;
        }
    }

}

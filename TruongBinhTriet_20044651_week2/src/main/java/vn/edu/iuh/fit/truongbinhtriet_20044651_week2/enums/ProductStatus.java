package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.enums;

public enum ProductStatus {
    ACTIVE(1),
    IN_ACTIVE(0);
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

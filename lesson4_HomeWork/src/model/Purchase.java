package model;

public interface Purchase {
    public void buy(Product product, int price);
    public void showBalanceBeforePurchase();
    public void showBalanceAfterPurchase();
}

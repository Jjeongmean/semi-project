package customer.project;

public class VIPCustomerOther extends Customer {
    private int agentID; //상담원ID
    double saleRatio; // 할인률

    public VIPCustomerOther(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        super.customerGrade = "VIP";
        super.bonusRatio = 0.03;
        this.saleRatio = 0.2;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; // 보너스 적립
        return price - (int)(price * saleRatio); //지불할 금액(할인율 적용)
    }

}

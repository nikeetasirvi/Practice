public class RowHouse extends Property implements RentCalculator{

  private int storeys;
  private int backyard;
  private int frontyard;
  
  public RowHouse(Address address, int storeys, int backyard, int frontyard){
    super(address);
    this.storeys = storeys;
    this.backyard = backyard;
    this.frontyard = frontyard;
  }
  public double calculatePropertyTax(float pricePerSqFeet){
    return (frontyard + backyard) * storeys * 0.15;
  }
  public double calculateRent(float pricePerSqFeet){
    return (frontyard + backyard) * storeys;
  }
}
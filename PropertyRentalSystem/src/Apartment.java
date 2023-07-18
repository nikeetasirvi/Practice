class Apartment extends Property implements RentCalculator{

  private int superArea;
  private int coveredArea;
  
  Apartment(Address address,int superArea, int coveredArea){
    super(address);
    this.superArea = superArea;
    this.coveredArea = coveredArea;
  }
  public double calculatePropertyTax(float pricePerSqFeet){
    return (pricePerSqFeet + coveredArea) * 500;
  }
  public double calculateRent(float pricePerSqFeet){
    return (pricePerSqFeet + superArea) * 100;
  }
  
}
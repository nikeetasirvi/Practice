public abstract class Property{

  private Address address;
  
  Property(Address address){
    this.address = address;
  }
  
  public Address getAddress(){
    return address;
  }
  
  public abstract double calculatePropertyTax(float pricePerSqFeet);
  
}

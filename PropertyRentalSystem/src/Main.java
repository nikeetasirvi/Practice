import java.time.LocalDate;

public class Main{

  public static void main(String[] args){
  
    try{
      Resident resident = new Resident(001,"Nikeeta");
      
      Address apartmentAddress = new Address("aai mata road","surat");
      Property apartment = new Apartment(apartmentAddress,2000,3000);
      
      Address rowHouseAddress = new Address("vesu","surat");
      Property rowHouse = new RowHouse(rowHouseAddress,2,3000,1000);
      
      LocalDate moveInDate = LocalDate.of(2021, 2, 1);
      LocalDate moveOutDate = LocalDate.of(2021, 3, 1);
      
      //resident.setTenant(true);
      //moveInDate = null;
      Lease lease = new Lease(resident,1, moveInDate, moveOutDate, apartment);
      
      System.out.println("everything is running properly");
      
    } catch(IllegalTenantException e){
      System.out.println("caught IllegalTenantException: " +e.getMessage());
    } catch(EmptyDateException e){
      System.out.println("caught EmptyDateException: " +e.getMessage());
    } catch(IllegalDateException e){
      System.out.println("caught IllegalDateException: " +e.getMessage());
    }
    
  }
}
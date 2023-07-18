import java.time.LocalDate;

public class Lease{

  private Resident resident;
  private int id;
  private LocalDate moveInDate;
  private LocalDate moveOutDate;
  private Property property;
  
  public Lease(Resident resident, int id, LocalDate moveInDate, LocalDate moveOutDate, Property property){
    if (resident.isTenant()) {
      throw new IllegalTenantException("Already a tenant");
    }
    if (moveInDate == null || moveOutDate == null){
      throw new EmptyDateException("The date cannot be empty");
    }
    if (moveInDate.compareTo(moveOutDate) > 0){
      throw new IllegalDateException("Move in date cannot be later than move out date");
    }
    this.resident = resident;
    this.id = id;
    this.moveInDate = moveInDate;
    this.moveOutDate = moveOutDate;
    this.property = property;
  }
  
}
public class Resident{

  private int socialId;
  private String name;
  private boolean tenant;
  
  Resident(int socialId, String name){
    this.socialId = socialId;
    this.name = name;
  }
  
  public void setSocialId(int socialId){
    this.socialId = socialId;
  }
  public int getSocialId(){
    return socialId;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public boolean isTenant() {
  return tenant;
 }
 public void setTenant(boolean tenant) {
  this.tenant = tenant;
 }
}
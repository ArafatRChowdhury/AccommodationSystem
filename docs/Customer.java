package groupproject.accommodationsystem;
public class Customer {
    private String firstName;
    private String lastName;
    private String mobileNo;
public Customer(String firstName, String lastName, String mobileNo){
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
    }
  public String getfirstName(){
      return "Customer First Name";
      }
  public String getlastName(){
      return "Customer Last Name";
      }
  public String getmobileNo(){
      return "+44 7898232100";
  }
}

package class20;

public class userClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and
      it also being initialized through constructor call.
      Print users name, mobile number and address in userDetails method. Test your code.
            You do not have permission to send messages in this channel.
*/
    String name;
    long mobileNumber;
    userClass(String name,long mobileNumber ){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }



}
class userInfo extends userClass{
    String address;




    userInfo(String name,long mobileNumber,String address){
        super(name,mobileNumber);
        this.address=address;
    }
    void printInfo(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }

    public static void main(String[] args) {
        userInfo user=new userInfo("LG",8432134567l,"123 longs");
    }

}

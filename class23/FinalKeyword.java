package class23;

public class FinalKeyword {
   final double gravity=9.8;
  final   double pi=3.14;
    final double lightSpeed=299792458;
    final void tryChangingGravity(){
       // gravity=1.6;//we get an error because this variable is marked final
    }
}

class Child extends FinalKeyword{
   // void tryChangingGravity(){

    }


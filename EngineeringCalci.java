class Calculator{
	
 public static double Add( double num1,double num2){
   double result=num1+num2;
   return result;
   }
  public static double Sub(double num1,double num2){
   double result=num1-num2;
   return result;
  }
  
 public static double Multiplication(double num1,double num2){
   double result=num1*num2;
   return result;
   }
  public static double Division(double num1,double num2){
  if(num2 != 0){
  double result = num1/num2;
  return result;
  }
  else{
  return -1;
  }
  }
  public static double square(double num1) {
        return num1 * num1;    //square
    }

    public static double cube(double num1) {
        return num1 * num1 * num1;      //cube
    }
     public static double squareRoot(double num1) {
        if (num1 >= 0) {
            return Math.sqrt(num1);        // sq.root
        } }

    public static double cubeRoot(double num1) {
        return Math.cbrt(num1);        //cuberoot
    }
public static void main(String[] args){


}
}

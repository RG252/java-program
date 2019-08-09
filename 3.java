class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
	
	double a = 9.78;//variable was already used//
    int b = (int) a; // Manual casting: double to int and variable was already used

    System.out.println(a);   // Outputs 9.78 and variable was already used//
    System.out.println(b);      // Outputs 9 and variable was already used//
	
  }
}

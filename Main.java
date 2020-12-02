class Main {
  public static void main(String[] args) {
    String[] roster1 = new String[3];
    String[] roster2 = {"sally","John","sam"};
   
    roster1[0] = "John";
    System.out.println(roster1[0]);
    
    for (int index = 1; index < 5; index++){
      roster1[index] = roster2[index];
      System.out.println(roster1[index]);
    }
  }
}
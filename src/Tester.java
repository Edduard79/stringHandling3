public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        String[] array1 = new String[]{" I want ", " to learn ", " how to code! "};
        //Trim method removes white spaces
        String[] array2 = new String[]{array1[0].trim(),array1[1].trim(), array1[2].trim()};

        int i = array2[0].compareTo("I want");
        int j = array2[1].compareToIgnoreCase("To learn");

        System.out.println(!(i > j));

        //2nd method
        System.out.println(!((array2[0].compareTo("I want")) > (array2[1].compareToIgnoreCase("To learn"))));





    }
}

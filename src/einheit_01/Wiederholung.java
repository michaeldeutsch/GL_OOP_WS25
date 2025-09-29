package einheit_01;

public class Wiederholung {

    public static void main(String[] args) {


    String [] namen = {"Michael", "Peter", "Paul", "Lisa"};
    int paulPosition = -1;

    for (int i = 0; i < namen.length; i++){
        if (namen[i].equals("Paul")){
            paulPosition = i;
            break;
        }
        System.out.println(namen[i]);
    }

        System.out.println("Paul befindet sich auf Position " + (paulPosition+1));
        System.out.println("+".repeat(20));

        int pos = 0;
        for (String name : namen){
            System.out.println(name);
        }






    }


}

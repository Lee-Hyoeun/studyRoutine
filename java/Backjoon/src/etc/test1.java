package etc;

	class Car implements Runnable{

        int a;

        public void run(){

                System.out.println("메시지"); 

        }

}

public class test1{

        public static void main(String args[]){

                Thread t1 = new Thread(new Car());

                t1.start();

        }


}




import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	       
		   String str = "a.b.c";
		   
	        String[] strArr1 = str.split("[.]");
	        String[] strArr2 = str.split("\\.");
	 
	        System.out.println(Arrays.toString(strArr1));  // [a, b, c]
	        System.out.println(Arrays.toString(strArr2));  // [a, b, c]
	}
}

		
//1번
//		Scanner sc = new Scanner(System.in);
//	    
//		String a = sc.next();	    
//		String[] arr = a.split("\\.");
//	    
//		int A = Integer.valueOf(arr[0]);	    
//		int B = Integer.valueOf(arr[1]);
//		int C = Integer.valueOf(arr[2]);
//	    
//		System.out.printf("%04d.%02d.%02d", A, B, C);
//내가한 좆망코드
//		Scanner sc = new Scanner(System.in);
//		String date[] = sc.next().split(".");
//		System.out.println(date[0]+"."+date[1]+"."+date[2]);
		

//18. 시간입력받아 그대로 출력(3:15->3/15;
//Scanner sc = new Scanner(System.in);
//String time[] = sc.next().split(":");
//System.out.println(time[0]+":"+time[1]);
//
//내가한거 -,,-;
//int a, b;
//
//a = sc.nextInt();
//b = sc.nextInt();
//
//System.out.printf("%d시 %d분",a,b);


//17. 정수 1개 입력받아 3번 출력
//Scanner sc = new Scanner(System.in);
//
//int a;
//
//a = sc.nextInt();
//
//System.out.println(a+" "+a+" "+a);
//System.out.printf("%d %d %d",a,a,a);

//15. 실수 입력받아 둘째자리까지 출력
//Scanner sc = new Scanner(System.in);
//Float a;
//
//a = sc.nextFloat();
//System.out.printf("%.2f",a);

//14. 문자 두개 입력받아 순서 바꿔 출력
//Scanner sc = new Scanner(System.in);
//
//String a, b;
//
//a = sc.next();
//b = sc.next();
//
//System.out.print(b+" "+a);


//13. 정수 두개 입력받아 출력
//int i, j;
//
//Scanner sc = new Scanner(System.in);
//i = sc.nextInt();
//j = sc.nextInt();
//
//System.out.println(i);
//System.out.println(j);
//
//System.out.println(i+" "+j);


//12. 실수형 입출력
//        float f;
//        String s;
//
//        Scanner input = new Scanner(System.in);
//        f=input.nextFloat();
//        //s=input.next();
//        
//        //System.out.println(f+s);
//        System.out.println(f);
//        System.out.printf("%f",f);

//11. 문자형 입출력
//		String c;
//		Scanner input = new Scanner(System.in);
//		c=input.next();
//		System.out.print(c);

//10. 정수형 입출력
//		int i;
//		Scanner input = new Scanner(System.in);
//		i=input.nextInt();
//		
//		System.out.print(i);


/*1번대*/
//3.  Hello
//    World 
//System.out.print("Hello\nWorld");

//4. 'Hello'
//System.out.print("\'Hello\'");

//5. "Hello"
//System.out.print("\"Hello\"");

//6. "!@#$%^&*()" (큰따옴표 포함!)
//System.out.print("\"!@#$%^&*()\"");

//7. "C:\Download\hello.java"
//System.out.print("\"C:\\Download\\hello.cpp\"");

//8. 유니코드로 특수문자출력
//System.out.print("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518");
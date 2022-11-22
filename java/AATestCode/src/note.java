
public class note {
}

/**
 * 기초 입출력 28~83번
 * 
 * */

////1083번 3 6 9의 왕
//Scanner sc = new Scanner(System.in);
//
//int num = sc.nextInt();
//
//for(int i=1; i<10; i++) {
//if(i%3==0) {
//	System.out.print('x'); 
//
//} else 
//	System.out.printf(" %d ", i);
//}

////1082번 16진수 구구단
//Scanner sc = new Scanner(System.in);
//
//int num = sc.nextInt(16);
//int mul;
//for(int i=0; i<=num; i++) {
//mul=i*num;
//System.out.printf("%o ", mul);
//}

////1081번 n,m 주사위 2개던져서 나올 수 있는 경우의 수
//Scanner sc = new Scanner(System.in);
//
//int n = sc.nextInt();
//int m = sc.nextInt();
//
//for(int i=1;i<=n;i++) {
//for(int j=1; j<=m; j++) {
//	System.out.printf("%d x %d \n", i,j);
//}
//}

////1080번 1,2,3계속 더할 떄 입력한 정수 n까지더하기
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int hap=0;
//int i=1;
//for(i=1; i<n;i++) {
//hap +=i;
//
//if(hap>=n) {
//	break;
//}
//}
//System.out.println(i);

//1079번 'q'가 입력될때까지 입력한 문자 계속 출력
//	Scanner sc = new Scanner(System.in);
//	
//	while(true) {
//		char c = sc.nextLine().charAt(0);
//		System.out.println(c);
//		if(c=='q')
//			break;
//	}


////1078번 정수입력받아 그 수 까지 짝수의 합
//for 버전
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int hap=0;
//
//for(int i=0; i<=n;i++) {
//	
//	if(i%2==0) {
//		hap+=i;		
//	}
//}
//System.out.printf("%d \n",hap);	
//do while버전
//Scanner sc = new Scanner(System.in);
//int n=sc.nextInt();
//int a=0, hap=0;
//
//do {
//	hap+=a;
//	a+=2;
//	System.out.printf("%d, %d, %d\n", a, hap, n);
//} while(a<=n);
//
//System.out.printf("최종: %d, %d, %d \n", a, hap, n);

//while문 테스트
//int a=0, hap=0;
//while(a<5) {
//a++;
//hap+=a;
//System.out.printf("%d, %d\n", a, hap);
//
//}
//
//System.out.printf("최종: %d, %d", a, hap);

//76번		
//Scanner sc = new Scanner(System.in);
//
//char value = sc.nextLine().charAt(0);
//
//for(char i='a'; i<=value; i++) {
//System.out.println(i);
//} 
//방법2
//Scanner sc = new Scanner(System.in);
//char s = sc.nextLine().charAt(0);
//char a = 'a';
//
//do {
//System.out.print(a+ " ");
//a+=1;
//} while(a<=s);

////74번 정수1개입력받아 카운트다운하기
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	
//		for(int i=n; i>0; i--) {
//			System.out.println(i);
//		}
//		
//	    //for(int i=n; i>0; i--)
//	      //  System.out.println(i);

////72번 정수 입력받아 계속 출력하기
//Scanner sc = new Scanner(System.in);
//
//int n = sc.nextInt();
//int arr[] = new int[n];
//
//for(int i=0; i<n; i++) {
//arr[i]=sc.nextInt();
//}
//
//for(int i=0; i<n; i++) {
//System.out.println(arr[i]);
//}

////71번 0이 입력될때까찌 반복실행(자바는 while사용 가능)
//Scanner sc = new Scanner(System.in);
//
//while(true) {
//int n = sc.nextInt();
//
//if(n==0) {
//	break;
//}
//
//System.out.println(n);
//}

////69번 평가 입력받아 다르게 출력
//Scanner sc = new Scanner(System.in);
//String a = sc.nextLine();
//
//if(a=="A")	System.out.println("best!");
//else if(a=="B") System.out.println("good!");
//else if(a=="C") System.out.println("run!");
//else if(a=="D") System.out.println("slowy~");
//else System.out.println("What!!!");

//
////67번 정수 1개 입력받아 음/양, 짝/홀 출력
//Scanner sc = new Scanner(System.in);
//
//int value = sc.nextInt();
//
//if (value < 0) {
//System.out.println("minus");
//if (value % 2 == 0)
//System.out.println("even");
//else 
//System.out.println("odd");
//} else {
//System.out.println("plus");
//if (value % 2 == 0)
//System.out.println("even");
//else
//System.out.println("odd");
//}  
//int a = sc.nextInt();
//
//if(a>0) System.out.println("양");
//else System.out.println("음");
//
//if(a%2==0) System.out.println("짝");
//else System.out.println("홀");


////42번 정수 2개 입력받아 나눈 몫으로 출력하기
//Scanner sc = new Scanner(System.in);
//
//int a = sc.nextInt();
//int b = sc.nextInt();
//
//System.out.printf("%d",a/b);

////41번 문자 1개 입력받아 다음 문자 출력하기
//Scanner sc = new Scanner(System.in);
//
//char ch = sc.next().charAt(0);
//char nextCh = (char)((int)ch+1);
//
//System.out.printf("%c",nextCh);

////40번 정수 1개 입력받아 부호바꿔 출력하기
//Scanner sc = new Scanner(System.in);
//
//long a = sc.nextLong();
//
//System.out.printf("-%d",a);

//	//38,39번 정수 2개 입력받아 합 출력하기
//	Scanner sc = new Scanner(System.in);
//	
//	long a = sc.nextLong();
//	long b = sc.nextLong();
//	long c = a+b;
//	System.out.println(c);


////31번 10진정수 1개 입력받아 8진수로 출력하기
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
//
//System.out.printf("%o",num);

////30번 정수 1개 입력받아 그대로 출력하기(단, 입력되는 정수 범위 -9223372036854775808 ~ +9223372036854775807)
//Scanner sc = new Scanner(System.in);
//long lNum = sc.nextLong();
//
//System.out.printf("%d", lNum);
//

////29번 실수 1개 입력받아 그대로 출력하기
////(단, 실수범위 +-1.7*10-308~+-1.7*10308, 소숫점 이하 11자리까지 반올림하여 출력)
//Scanner sc = new Scanner(System.in);
//double num = sc.nextDouble();
//
//System.out.printf("%.11f",num);

////28번 정수 1개 입력받아 그대로 출력하기(단, 입력되는 정수의 범위 0~4,294,967,295)
//Scanner sc = new Scanner(System.in);
//
//long num = sc.nextLong();
//
//System.out.println(num);


/**
 * 기초 입출력 1~27번
 * 
 * */

////27번 년월일(yyyy.mm.dd)입력받아, 일월년(dd-mm-yyyy)로 출력하기
//Scanner sc = new Scanner(System.in);
//
//String date = sc.next();
//String strDate[] = date.split(":");
//
//System.out.println(strDate[2]+"-"+strDate[1]+"-"+strDate[0]);

////26번 시:분:초 입력받아 분만 출력하기
//Scanner sc = new Scanner(System.in);
//
//String time = sc.next();
//
//String str[] = time.split("\\:");
//
//System.out.println(str[1]);

////25번 다섯자리의 정수1개 입력받아 각 자리별로 나누어 출력
//내가 한거
//Scanner sc = new Scanner(System.in);
//
//int numStr = sc.nextInt();
//
//String str = String.valueOf(numStr);
//String arr[] = str.split("");
//
//int num;
//int mul = 10000;
//
//for(int i=0; i<str.length(); i++) {
//num = Integer.valueOf(arr[i]);
//System.out.println(num*mul);
//
//mul/=10;
//}
//방법1
//Scanner sc = new Scanner(System.in);
//String numStr = sc.next();
//String[] arr = new String[numStr.length()];
//arr = numStr.split("");
//int digit = 1;
//int num;
//
//for(int i = 1; i < numStr.length(); i++) {
//digit *= 10;
//}
//
//for(int i = 0 ; i < numStr.length(); i++) {
//num = (Integer.parseInt(arr[i])) * digit;
//System.out.println("[" + num + "]");
//digit /= 10;
//}
//방법2
//Scanner sc = new Scanner(System.in);
//
//String value = sc.next();
//int data[] = new int[value.length()];
//
//for (int i=0; i<value.length(); i++)
//// char - '0'을 이용하면 아스키코드 값을 알 필요없이 int형으로 변환이 가능하다. 
//data[i] = value.charAt(i) - '0';
//
//int number = 10000;
//
//for (int i=0; i<5; i++) {
//System.out.println("[" + data[i] * number + "]");
//number /= 10;
//}

//24번 영문단어 1개 입력받아 각 문자를 한 줄에 분리출력
//Scanner sc = new Scanner(System.in);
//
//String str = sc.next();
//
//for(int i=0; i<str.length();i++) {
//System.out.println(str.charAt(i));
//}

//23번 실수 입력받아 정수와 실수 나누어 출력
//Scanner sc = new Scanner(System.in);
//double data = sc.nextDouble();
//
//String s = String.valueOf(data);
//
//String[] str = s.split("\\.");
//	
//System.out.println("정수:"+str[0]+" 실수:"+str[1]);

//22번 문장 입력해서 그대로 출력
//Scanner sc = new Scanner(System.in);
//
//String str = sc.nextLine();
//System.out.println(str);

//21번 문자 입혁해서 그대로 출력
//Scanner sc = new Scanner(System.in);
//
//String str = sc.next();
//
//System.out.printf("%s",str);
//
//방법1)
//Scanner sc = new Scanner(System.in);
//String str = sc.next();
//if(str.length() >= 50) {
//str = str.substring(0, 50);
//}
//System.out.println(str);
//방법2)
//Scanner sc = new Scanner(System.in);
//String str = sc.next();
//String[] data = str.split(" ");
//for(int i=0; i<data.length; i++) {
//System.out.print(data[i]);
//}

//20번 주민번호 입력해서 -빼기
//Scanner sc = new Scanner(System.in);
//
//String str = sc.next();
//	
//String[] arr = str.split("-");
//
//System.out.print(arr[0]+arr[1]);


//19번 연월일 입력받아 형식대로 출력
//2번학습
//String str = "a.b.c";
//
//String[] strArr1 = str.split("[.]");
//String[] strArr2 = str.split("\\.");
//
//System.out.println(Arrays.toString(strArr1));  // [a, b, c]
//System.out.println(Arrays.toString(strArr2));  // [a, b, c]

//1번학습
//	Scanner sc = new Scanner(System.in);
//    
//	String a = sc.next();	    
//	String[] arr = a.split("\\.");
//    
//	int A = Integer.valueOf(arr[0]);	    
//	int B = Integer.valueOf(arr[1]);
//	int C = Integer.valueOf(arr[2]);
//    
//	System.out.printf("%04d.%02d.%02d", A, B, C);
//내가한 좆망코드
//	Scanner sc = new Scanner(System.in);
//	String date[] = sc.next().split(".");
//	System.out.println(date[0]+"."+date[1]+"."+date[2]);
	

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
//    float f;
//    String s;
//
//    Scanner input = new Scanner(System.in);
//    f=input.nextFloat();
//    //s=input.next();
//    
//    //System.out.println(f+s);
//    System.out.println(f);
//    System.out.printf("%f",f);

//11. 문자형 입출력
//	String c;
//	Scanner input = new Scanner(System.in);
//	c=input.next();
//	System.out.print(c);

//10. 정수형 입출력
//	int i;
//	Scanner input = new Scanner(System.in);
//	i=input.nextInt();
//	
//	System.out.print(i);


/*1번대*/
//3.  Hello
//World 
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
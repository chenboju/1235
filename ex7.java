import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入密碼 :　");
		int a = in.nextInt();
		System.out.print("請確認密碼 : ");
		int b = in.nextInt();
		if(a==b) {

		System.out.print("輸入成功");
	} 
		if (a!=b) {
			for(int i =1 ;i<=3;i++){
				System.out.print("請確認密碼 : ");
				int c = in.nextInt();
				if(i>=3) {
					System.out.print("錯誤資訊");
				}
				}
			
			
			
		}
		
	
		
	
		
	}

}

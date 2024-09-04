package testpractice;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("google");
		int l=a.length();
		int index=-1,maxlength=0;
		for(int i=0;i<l;i++) {
			for(int j=i;j<l;j++) {int ispalindrome=1;
				for(int k=i;k<=j;k++) {
					if(a.charAt(k)!=a.charAt(j-(k-i))) {
						ispalindrome=0;
					}
				}if(ispalindrome==1 && j-i+1>maxlength) {
					index=i;
					maxlength=j-i+1;
				}
			} 
				
		}String ans="";
		for(int i=index;i<index+maxlength;i++) {
			ans+=a.charAt(i);
		}
		System.out.println(ans);
	}

}

package testpractice;
public class BinarySearch {
static int Searching(int a[],int t) {
	int l=0;
	int r=a.length;
	while(l<=r) {
		int mid;
		mid=l+(r-l)/2;
		if(a[mid]==t) {
			return a[mid];
		}
		else if(a[mid]<t) {
			l=mid+1;
		}
		else {
			r=mid-1;
	    }
		}
	return -1;
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int t=7;
	int result=Searching(a,t);
	if(result!=-1)
		System.out.println(result);
	else
		System.out.println("Element not found");
}
}

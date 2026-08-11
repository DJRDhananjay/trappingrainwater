public class Main
{
	public static void main(String[] args) {
		int height[]={3,0,2,0,4};
		int n=height.length;
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		leftmax[0]=height[0];
		for(int i=1;i<n;i++){
		    if(leftmax[i-1]>height[i]){
		        leftmax[i]=leftmax[i-1];
		    }else{
		        leftmax[i]=height[i];
		    }
		}
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--){
		    if(rightmax[i+1]>height[i]){
		        rightmax[i]=rightmax[i+1];
		    }else{
		        rightmax[i]=height[i];
		    }
		}
		int total=0;
		for(int i=0;i<n;i++){
		    int smaller;
		    if(leftmax[i]<rightmax[i]){
		        smaller=leftmax[i];
		    }else{
		        smaller=rightmax[i];
		    }
		    total=total+smaller-height[i];
		}
		System.out.print(total);
	}
}

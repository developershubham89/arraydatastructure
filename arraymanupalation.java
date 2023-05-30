package Array;

public class arraymanupalation {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>ans){
                ans=a[i];
            }
        }
        System.out.println(ans);
    }
}

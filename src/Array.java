import java.util.Scanner;

public class Array {
    static int a[]={1,1,6,5,2,3,1,6,3,2,7,4,7,4};
    public static void main(Strings[] args) {
        Scanner sc= new Scanner(System.in);
        int temp=-1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=temp)
            System.out.print("\s"+a[i]);
        }
        

        
        
    }
    static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    static void bubbleSortASC(int[] a){
        int n=a.length;
        //Array array=new Array()
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    static void bubbleSortDESC(int[] a){
        int n=a.length;
        //Array array=new Array()
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    static void dupplicateArray(int b[]){
         b=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("Original array:");
        for(int x : a){
            System.out.print(x);
        }
        System.out.println();
        System.out.println("copy array:");
        for(int y : b){
            System.out.print(y);
        }
    }

    static void FreqArray(){
        System.out.println("enter the number to check frequency");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        for(int i=0;i<a.length;i++){
            if(num==a[i]){
                count++;
            }
        }
        System.out.println("frequency:"+count);

    }
    static void displayFreq(){
        int fr[]=new int[a.length];
        int visited=-1;
        
        for (int i =0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }

        System.out.println("    Element       |     Frequency   ");
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited){
                System.out.println(" "+a[i]+ "   |   "+fr[i]);
            }
        }

    }

    static void rotateLeft(int[] a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many times you want to rotate left : ");
        int n;
        n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            int first,j;
            first=a[0];
            for(j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[j]=first;
        }
        
    }
    static void rotateRight(int[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate right : ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int j;
            int last =a[a.length-1];
            for( j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[j]=last;
        }
    }

    static void reverseArray(int[] a){
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
    static void removeDuplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                }
            }
        }
        System.out.println("after removing: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.println("\t"+ arr[i]);
            }
        }
    }
}

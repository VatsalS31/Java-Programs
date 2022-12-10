package practise;


	import java.nio.channels.SelectableChannel;
	import java.util.Arrays;
	import java.util.Random;
	public class demo {
	    static void Insertionsort(int arr[],int length){
	        for(int i = 1;i<length;i++){
	            int j = i - 1;
	            int temp = arr[i];
	            while(j>= 0 && temp<arr[j]){
	                arr[j+1] = arr[j];
	                j--;
	            }
	            arr[j+1] = temp;
	        }
	    }
	    static void selctionSort(int arr[],int length){
	        for(int i = 0;i<length-1;i++){
	            int min_pointer = i;
	            int min = arr[i];
	            for(int j = i+1;j<length;j++){
	                if(arr[min_pointer] > arr[j]){
	                    min_pointer = j;
	                    min = arr[j];
	                }
	            }
	            if(min_pointer != i){
	                int temp = arr[i];
	                arr[i] = min;
	                arr[min_pointer] = temp;
	            }
	        }
	    }
	    static void bubleSort(int arr[],int length){
	        for(int i = 0;i<length - 1;i++){
	            for(int j = i+1;j<length;j++){
	                if(arr[i] > arr[j]){
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }
	    static void merge(int arr[],int l,int m,int r){
	        int n1 = m-l+1;
	        int n2 = r-m;
	        int left[] = new int[n1+1],right[] = new int[n2+1];
	        for(int i = 0;i<n1;i++){
	            left[i] = arr[l+i];
	        }
	        for(int i = 0;i<n2;i++){
	            right[i] = arr[m+1+i];
	        }
	        left[n1] = right[n2] = Integer.MAX_VALUE;
	        int i,j,k;
	        i = j = 0;
	        k = l;
	        while(k<= r){
	            if(left[i] < right[j]){
	                arr[k++] = left[i++];
	            }
	            else{
	                arr[k++] = right[j++];
	            }
	        }
	    }
	    static void mergesort(int arr[],int l,int r){
	        if(l<r){
	            int m = (l+r)/2;
	            mergesort(arr,l,m);
	            mergesort(arr,m+1,r);
	            merge(arr,l,m,r);
	        }
	    }
	    static int partition(int arr[],int l,int r){
	        int temp = arr[r];
	        int p = l -1;
	        for(int i = l;i<r;i++){
	            if(arr[i]<temp){
	                p++;
	                int o = arr[i];
	                arr[i] = arr[p];
	                arr[p] = o;
	             }
	        }
	        p++;
	        arr[r] = arr[p];
	        arr[p] = temp;
	        return p;
	    }
	    static void quicksort(int arr[],int l,int r){
	        if(l<r){
	            int q = partition(arr,l,r);
	            quicksort(arr,l,q-1);
	            quicksort(arr,q+1,r);
	        }
	    }
	    static void MaxHeapify(int arr[],int length,int index){
	        int l = 2*index+1;
	        int r = 2*index+2;
	        int max_index = index;
	        if(l<length && arr[l] > arr[max_index]){
	            max_index = l;
	        }
	        if(r<length && arr[r] > arr[max_index]){
	            max_index = r;
	        }
	        if(max_index != index ){
	            int temp = arr[max_index];
	            arr[max_index] = arr[index];
	            arr[index] = temp;
	            MaxHeapify(arr,length,max_index);
	        }
	    }
	    static void MaxHeap(int arr[],int length){
	        for(int i = length/2;i>=0;i--){
	            MaxHeapify(arr,length,i);
	        }
	    }
	    static void heapSort(int arr[],int length){
	        MaxHeap(arr,length);
	        for(int i = length -1;i>=0;i--){
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	            MaxHeapify(arr,i,0);
	        }
	    }
	    static void countSort(int arr[],int length){
	        int max = arr[0];
	        for(int i = 0;i<length;i++){
	            if(arr[i] > max){
	                max = arr[i];
	            }
	        }
	        int ar[] = new int[max+1];
	        int output[] = new int[length];
	        for(int i = 0;i<max+1;i++){
	            ar[i] = 0;
	        }
	        for(int i = 0;i<length;i++){
	            ar[arr[i]]++;
	        }
	        for(int i = 1;i<ar.length;i++){
	            ar[i] += ar[i-1]; 
	        }
	        for (int i = output.length - 1; i >= 0; i--) {
	            output[ar[arr[i]] - 1] = arr[i];
	            ar[arr[i]]--;
	        }
	        for (int i = 0; i < output.length; i++) {
	            arr[i] = output[i];
	        }
	    }
	    public static void main(String arg[])throws Exception{
	        long arr[][] = new long[7][6];
	        for(int i = 0;i<7;i++){
	            for(int j = 0;j<6;j++){
	                int size = 0;
	                switch(j){
	                    case 0: size = 10;break;
	                    case 1: size =100;break;
	                    case 2: size = 1000;break;
	                    case 3: size =10000;break;
	                    case 4: size = 100000;break;
	                    case 5: size =200000;break;
	                }
	                int input[] = new int[size];
	                Random rd = new Random();
	                for(int k = 0;k<size;k++){
	                    input[k] = rd.nextInt(1000);
	                }
	                switch(i){
	                    case 0: {
	                        Long start = System.nanoTime();
	                        bubleSort(input, size);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 1: {
	                        Long start = System.nanoTime();
	                        selctionSort(input, size);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 3: {
	                        Long start = System.nanoTime();
	                        Insertionsort(input, size);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 4: {
	                        Long start = System.nanoTime();
	                        mergesort(input, 0, size-1);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 5: {
	                        Long start = System.nanoTime();
	                        quicksort(input,0,size-1);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 6: {
	                        Long start = System.nanoTime();
	                        heapSort(input, size);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                    case 7: {
	                        Long start = System.nanoTime();
	                        countSort(input, size);
	                        Long end = System.nanoTime();
	                        arr[i][j] = end - start;
	                        break;
	                    }
	                }
	            }
	        }
	        for(int i = 0;i<7;i++){
	            System.out.println(Arrays.toString(arr[i]));
	        }
	    }
	}


	
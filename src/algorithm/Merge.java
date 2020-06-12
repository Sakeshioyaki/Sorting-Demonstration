package algorithm;

import element.Element;
import element.ElementArray;

public class Merge extends Algorithm {
    private static Merge Mer = new Merge();
    public static long timeS;

    public static Merge getInstance() {
        return Mer;
    }

    private Merge() {
    }

    public void sort(ElementArray array) {
    	long start,end;
    	start = System.currentTimeMillis();
    	
        sort(array, 0, (int) (array.length() - 1));

        for (Element e: array.getAll()) {
            array.steps.addDoneStep(e);
        }
        end = System.currentTimeMillis();
        timeS = end - start;
    }


    private void sort(ElementArray arr,int min,int f){
        if(f-min==0){//only one element.
            //no swap
        }
        else if(f-min==1){//only two elements and swaps them
            if(arr.compare(min, f) < 0)
                arr.swap(min, f);
        }
        else{
            int mid=((int) Math.floor((min+f)/2));//The midpoint

            sort(arr,min,mid);//sort the left side
            sort(arr,mid+1,f);//sort the right side

            merge(arr, min, f, mid);//combines them
        }


    }


    private void merge(ElementArray arr, int min,int max,int mid){
        int i=min;
        while(i<=mid){
            if(arr.compare(i, mid+1) < 0){
                arr.swap(i,mid+1);

                push(arr,mid+1,max);
            }
            i++;
        }

    }

    private void push(ElementArray arr,int s,int e){
        for(int i=s;i<e;i++){
            if(arr.compare(i, i+1)<0) {

                arr.swap(i,i+1);

            }

        }

    }


    @Override
    public String toString() {
        return "Merge Sort";
    }
	public long thoiGianThucHien() {
		
		return timeS;
	}
}

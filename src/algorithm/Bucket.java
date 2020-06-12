package algorithm;

import element.Element;
import element.ElementArray;

public class Bucket extends Algorithm {
    private static Bucket Buc = new Bucket();
    public static long timeS;

    public static Bucket getInstance() {
        return Buc;
    }

    private Bucket() {
    }

    private void sort(ElementArray arr, Element maxVal) {
        int [] bucket = new int[(int) (maxVal.getValue()+1)];
        Element [][] bucketElement = new Element[(int) (maxVal.getValue()+1)][(int) (maxVal.getValue()+1)];

        for (int i=0; i<bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i=0; i<arr.length(); i++) {
            bucketElement[(int)arr.getElementAt(i).getValue()][bucket[ (int) arr.getElementAt(i).getValue()]] = arr.getElementAt(i);
            bucket[(int) arr.getElementAt(i).getValue()] = bucket[(int) arr.getElementAt(i).getValue()] + 1;

            arr.moveToBufferArray(i, (int) (maxVal.getValue() - arr.getElementAt(i).getValue()));
        }

        int outPos=0;

        for (int i=0 ; i<bucket.length; i++) {

            if (bucket[i] != 0) {
                for (int j=0; j<bucket[i]; j++) {
                    arr.swap((bucketElement[i][j]).getIndex(), outPos);

                    arr.moveFromBufferArray((bucketElement[i][j]).getIndex(), (int) (-maxVal.getValue() + arr.getElementAt((bucketElement[i][j]).getIndex()).getValue()));

                    // Sorted Point
                    arr.steps.addDoneStep(arr.getElementAt(outPos));

                    outPos++;
                }

            }
        }

    }

    public void sort(ElementArray array) {
    	long start,end;
    	start = System.currentTimeMillis();
        sort(array, array.getMax());
        end = System.currentTimeMillis();
        timeS = end - start;
    }


    @Override
    public String toString() {
        return "Bucket Sort";
    }
	public long thoiGianThucHien() {
		
		return timeS;
	}
}

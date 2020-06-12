package algorithm;

import element.ElementArray;

public class Selection extends Algorithm {
    private static Selection Sel = new Selection();
    public static long timeS;


    public static Selection getInstance() {
        return Sel;
    }

    private Selection() {
    }

    public void sort(ElementArray array) {
    	long start,end;
    	start = System.currentTimeMillis();
    	
        int length = (int) array.length();
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array.compare(j, minIndex) > 0)
                    minIndex = j;
            }
            array.swap(i, minIndex);
            // Sorted Point
            array.steps.addDoneStep(array.getElementAt(i));
        }
        end = System.currentTimeMillis();
        timeS = end - start;
    }

    @Override
    public String toString() {
        return "Selection Sort";
    }
	public long thoiGianThucHien() {
		
		return timeS;
	}
}

package algorithm;

import element.ElementArray;

public class Bubble extends Algorithm {
    private static Bubble ourInstance = new Bubble();
  public static long timeS;

    public static Bubble getInstance() {
        return ourInstance;
    }


    private Bubble() {
    }

    public void sort(ElementArray array) {
    	long start,end;
    	start = System.currentTimeMillis();
    	
        for (int i = 0; i < (int) array.length(); i++) {
            for (int j = 0; j < (int) array.length()-i - 1; j++)
                array.compareAndSwap(j, j + 1);
            // Sorted Point
            array.steps.addDoneStep(array.getElementAt((int)array.length()-i-1));
        }
        end = System.currentTimeMillis();
        timeS = end - start;
        
    }
    
    


    @Override
    public String toString() {
        return "Bubble Sort";
    }


	@Override
	public long thoiGianThucHien() {
		
		return timeS;
	}
}

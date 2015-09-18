class Solution01 {
	public static void main (String[] args) {
		array2stack stack = new array2stack();
		stack.push(0, 1);
		stack.push(1, 2);
		stack.push(2, 3);
		stack.push(0, 4);

		System.out.println(stack.pop(0));
		System.out.println(stack.peek(1));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(1));
		System.out.println((stack.isEmpty(1) == true)? "true": "false");
	}
}

	class array2stack {
		public int size = 1000;
		public int[] array = new int[size * 3];
		public int[] index = {-1, -1, -1};

    	public void push(int stackid, int val) {
    		if (index[stackid] >= size - 1) {
    			System.out.println("out of boundary");
    			return;
    		}
    		int id = stackid * size + index[stackid] + 1;
    		array[id] = val;
    		index[stackid] ++;
    	}

    	public int pop (int stackid) {
    		if (index[stackid] < 0) {
    			System.out.println("out of boundary");
    			return -1;    		
    		}
    		int id = stackid * size + index[stackid];
    		index[stackid] --;
    		return array[id];
    	}

    	public boolean isEmpty(int stackid) {
    		return index[stackid] < 0;
    	} 

    	public int peek(int stackid) {
    		if (index[stackid] < 0) {
    			System.out.println("out of boundary");
    			return -1;    		
    		}
    		int id = stackid * size + index[stackid];
    		return array[id];    		
    	}
	}
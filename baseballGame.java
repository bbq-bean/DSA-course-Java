class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) System.out.println(op);

        for (String op : operations) {
            if (op.equals("+")) {
                int tmp2 = stack.pop();
                int tmp1 = stack.pop();
                int sum = tmp1 + tmp2;

                stack.push(tmp1);
                stack.push(tmp2);
                stack.push(sum); 
            
            } else if (op.equals("D")) {
                int product = 2 * stack.peek();

                stack.push(product);
            
            } else if (op.equals("C")) {
                //System.out.println("saw C");
                stack.pop();

            } 
            
            else {
                //System.out.println(op);
                stack.push(Integer.parseInt(op));

            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }
}

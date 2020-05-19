// 901.Online Stock Span
// Approach 1: Similar to Sequence DP

class StockSpanner {
    private List<Integer> prices;
    private List<Integer> dp;

    public StockSpanner() {
        prices = new ArrayList<>();
        dp = new ArrayList<>();
    }

    public int next(int price) {
        if (prices.isEmpty() || price < prices.get(prices.size() - 1)) {
            dp.add(1);
        } else {
            int i = prices.size() - 1;
            while (i >= 0 && prices.get(i) <= price) {
                i -= dp.get(i);
            }
            dp.add(prices.size() - i);
        }
        prices.add(price);
        return dp.get(dp.size() - 1);
    }
}


// Approach 2: Monotonic Stack

class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}

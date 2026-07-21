class Solution {
    public int maxProfit(int[] prices) {
//pointer l stays, r expands until rule breaks, l move to next index

int leftPointer = 0; //buy
int rightPointer = 1;//sell
int maxProfit=0;

//loops 
for(rightPointer=1;rightPointer<prices.length;rightPointer++){

//if sell>buy, update currentprofit
    if(prices[leftPointer]<prices[rightPointer]){
        int currProfit = prices[rightPointer]-prices[leftPointer];
        maxProfit=Math.max(maxProfit,currProfit);

    }
//if sell<=buy, set pointer left(sell)
    else{
        leftPointer = rightPointer;

    }


}




return maxProfit;


        
    }

}
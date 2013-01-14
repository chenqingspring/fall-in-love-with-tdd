package com.test.countoff;

public class CountOff {
    int totalNum;
    int countNum;

    public CountOff(int countNum,int totalNum) {
        this.countNum = countNum;
        this.totalNum = totalNum;
    }

    public String count(){
        StringBuilder output = new StringBuilder();

        for(int i=0; i<totalNum; i=i+countNum){

            int count = (i+countNum - totalNum)<=0? countNum:(countNum-(i+countNum-totalNum));

            for(int j=0;j<count;j++){
                output.append(Integer.toString(j+1));
            }
        }
        return output.toString();
    }
}
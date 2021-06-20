package com.company;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution {

    Logger logger = LoggerFactory.getLogger(Solution.class);

    public static void main(String[] args) {
        Solution s = new Solution();
        s.run();
    }

    public void run(){
        logger.info("test:{}", 123);
    }


}

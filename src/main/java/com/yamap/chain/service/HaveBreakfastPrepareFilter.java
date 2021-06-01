package com.yamap.chain.service;

import com.yamap.chain.FilterChain;
import com.yamap.chain.PreparationList;
import com.yamap.chain.StudyPrepareFilter;

/**
 * @author yicong
 * @date 2021-06-01 15:44
 */
public class HaveBreakfastPrepareFilter  implements StudyPrepareFilter {
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isHaveBreakfast()){
            System.out.println("吃早餐..");
        }
        filterChain.doFilter(preparationList,filterChain);

    }
}

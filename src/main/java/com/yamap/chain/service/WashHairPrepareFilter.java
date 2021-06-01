package com.yamap.chain.service;

import com.yamap.chain.FilterChain;
import com.yamap.chain.PreparationList;
import com.yamap.chain.StudyPrepareFilter;

/**
 * @author yicong
 * @date 2021-06-01 15:39
 */
public class WashHairPrepareFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashHair()){
            System.out.println("洗头..");
        }
        filterChain.doFilter(preparationList,filterChain);

    }
}

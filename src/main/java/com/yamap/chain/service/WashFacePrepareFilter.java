package com.yamap.chain.service;

import com.yamap.chain.FilterChain;
import com.yamap.chain.PreparationList;
import com.yamap.chain.StudyPrepareFilter;

/**
 * @author yicong
 * @date 2021-06-01 15:36
 */
public class WashFacePrepareFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashFace()){
            System.out.println("洗脸...");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}

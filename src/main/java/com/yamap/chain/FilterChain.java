package com.yamap.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yicong
 * @date 2021-06-01 15:02
 */
public class FilterChain implements StudyPrepareFilter{

    private int pos = 0 ;

    private List<StudyPrepareFilter> chainList = new ArrayList<>();

    private Study study = new Study();

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain){

        if(chainList.size() == pos ){
            study.study();
            return ;
        }

        chainList.get(pos++).doFilter(preparationList,filterChain);

    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter){
        chainList.add(studyPrepareFilter);
    }
}

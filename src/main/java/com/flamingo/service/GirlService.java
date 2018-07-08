package com.flamingo.service;

import com.flamingo.enums.ResultEnum;
import com.flamingo.exception.GirlException;
import com.flamingo.repository.GirlRepository;
import com.flamingo.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setName("chenxd");
        girlA.setAge(23);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setName("liwb");
        girlB.setAge(23);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10){
            //返回“还在上小学” code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16){
            //返回“还在上初中” code=101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 通过Id查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.getOne(id);
    }
}

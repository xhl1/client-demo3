package com.example.clientdemo3.dao;

import com.example.clientdemo3.entity.Loan;
import com.mdl.common.mapper.MdlMapper;
import org.springframework.stereotype.Component;

/**
 * @author lxh
 * @ClassName: LoanDao
 * @Package com.mdl.cts.dao
 * @Description: TODO 放款Dao
 * @date 2018/5/16下午 2:05
 */
@Component
public interface LoanDao extends MdlMapper<Loan> {
}

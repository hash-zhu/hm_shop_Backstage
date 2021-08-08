package com.ityunjie.dao;

import com.ityunjie.domain.Test;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

public interface TestIDao extends Repository<Test,Integer>, JpaSpecificationExecutor<Test> {

}

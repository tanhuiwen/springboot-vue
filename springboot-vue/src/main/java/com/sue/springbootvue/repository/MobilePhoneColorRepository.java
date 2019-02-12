package com.sue.springbootvue.repository;

import com.sue.springbootvue.entity.MobilePhoneColor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import java.util.List;

@Repository
public interface MobilePhoneColorRepository extends JpaRepository<MobilePhoneColor,Integer> {
    /**
     * 手机关联查询
     * @param id
     * @return
     */
    @Query(value = "select * from mobilephone_color where mobilephone_id=?1",nativeQuery = true)
    List<MobilePhoneColor> getMobilePhoneColorByMobilePhoneId(Integer id);

    /**
     * 颜色关联查询
     * @param id
     * @return
     */
    @Query(value = "select * from mobilephone_color where color_id=?1",nativeQuery = true)
    List<MobilePhoneColor> getMobilePhoneColorByColorId(Integer id);

    /**
     * 2.1、通过颜色 id 删除关系
     * ① 在 dao 层中加上@Modifying
     * ② 注意添加 @Transactional，否则 TransactionRequiredException
     * ③ @Transactional 建议还是在 Service 层中加上，不要在 Controller 层中
     */
    @Modifying
    @Query(value="delete from mobilephone_color where color_id=?1",nativeQuery=true)
    void deleteConnectionByColorId(Integer ColorId);

    /**
     * 2.2、通过手机 id 删除关系
     * ① 在 dao 层中加上@Modifying，否则 SQLException
     * ② 注意添加 @Transactional，否则 TransactionRequiredException
     * ③ @Transactional 建议还是在 Service 层中加上，不要在 Controller 层中
     */
    @Modifying
    @Query(value="delete from mobilephone_color where  mobilephone_id=?1",nativeQuery=true)
    void deleteConnectionByMobilePhoneId(Integer mobilephoneId);
}

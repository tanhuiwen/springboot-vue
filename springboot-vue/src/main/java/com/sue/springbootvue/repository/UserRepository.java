package com.sue.springbootvue.repository;

import com.sue.springbootvue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 根据用户名查找用户对象信息
     *
     * @param username
     * @return 用户对象信息
     */
    User getByUsernameIs(String username);

    /**
     * 根据手机号码查找用户对象信息
     *
     * @param phoneNumber
     * @return 用户对象信息
     */
    User getByPhoneNumberIs(String phoneNumber);

    /**
     * 根据用户名查找对象并更改该对象的密码
     *
     * @param id
     * @param password
     * @return 修改密码后的对象信息
     */
    @Transactional
    @Modifying
    @Query("update User user set user.password=:password where user.id=:id")
    void updatePassword(@Param("id") Integer id, @Param("password") String password);

    @Transactional
    @Modifying
    @Query("update User user set user.email=:email where user.id=:id")
    void updateEmail(@Param("id") Integer id, @Param("email") String email);

    @Transactional
    @Modifying
    @Query("update User user set user.phoneNumber=:phoneNumber where user.id=:id")
    void updatephoneNumber(@Param("id") Integer id, @Param("phoneNumber") String phoneNumber);

    /**
     * 根据id“删除”该用户（修改用户状态）
     *
     * @param id
     * @return
     */
    @Transactional
    @Modifying
    @Query("update User user set user.status=1 where user.id=:id")
    void delete(@Param("id") Integer id);
}

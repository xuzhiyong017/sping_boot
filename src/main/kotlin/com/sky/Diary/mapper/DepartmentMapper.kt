package com.sky.Diary.mapper

import com.sky.Diary.bean.Greet
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface DepartmentMapper {
    @Select("select id,username from sc_sys_user where id=#{id}")
    public fun getGreet(id:Int) : Greet
}
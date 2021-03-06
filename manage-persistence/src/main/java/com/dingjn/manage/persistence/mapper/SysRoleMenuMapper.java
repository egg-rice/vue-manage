package com.dingjn.manage.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dingjn.manage.persistence.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色菜单权限关系表 Mapper 接口
 * </p>
 *
 * @author dingjn
 * @since 2020-06-13
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    List<Integer> getCheckKeys(Integer roleId);

    int saveMenuPerm(@Param("roleId") Integer roleId, @Param("menuIds") List<Integer> menuIds);

}

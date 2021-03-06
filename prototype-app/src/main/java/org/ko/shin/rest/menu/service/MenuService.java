package org.ko.prototype.rest.menu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.ko.prototype.data.entity.Menu;
import org.ko.prototype.rest.menu.condition.QueryMenuCondition;
import org.ko.prototype.rest.menu.dto.MenuDTO;

import java.util.List;

public interface MenuService extends IService<Menu> {

    /**
     * <p>查询菜单列表</p>
     * @param condition
     * @return
     */
    IPage<MenuDTO> queryMenuList(QueryMenuCondition condition);

    /**
     * <p>通过主键查询菜单</p>
     * @param id
     * @return
     */
    Menu queryMenuInfo(Long id);


    List<MenuDTO> queryMenuByParentId(Long parentId);

    /**
     * <p>创建新的菜单</p>
     * @param menu
     */
    Long createMenu(Menu menu);

    /**
     * <p>通过ID更新菜单</p>
     * @param id Menu Id
     * @param menu 菜单对象
     * @return
     */
    Menu updateMenu(Long id, Menu menu);

    /**
     * <p>删除菜单</p>
     * @param id Menu主键id
     * @return
     */
    Long deleteMenu(Long id);


    /**
     * 通过权限ID查询菜单列表
     * @param roleCode
     * @return
     */
    List<MenuDTO> queryMenuByRoleCode(String roleCode);
}

package com.chinasoft.controller;


import com.chinasoft.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {


    /**
     * springmvc中对于参数的绑定
     *      1.支持的数据类型
     *          1.基本数据类型和String类型的
     *          2.实体类型
     *          3.集合类型（List,Map集合等）
     *      2.绑定机制
     *          1.以表单提交数据的形式 k=v
     *          2.以url中传参的 形式
     * @param account
     * @return
     */
    @RequestMapping("addAccount")
    public String addAccount(Account account){
        System.out.println(account.getName());
        System.out.println(account.getMoney());
        System.out.println(account.getCreateTime());
        System.out.println(account.getMap());
        return "success";
    }
}

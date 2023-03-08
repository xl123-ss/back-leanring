package com.xxx.controller.t10表单数据验证;

import com.xxx.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 功能描述
 *
 * @author: xl
 * @date: 2023年02月11日 18:44
 */
public class UserValidator implements Validator {
    /**
     * 是否支持这种类型，true就验证，false就不去验证
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        /**
         * name为空就提示报错信息，姓名不能为空
         * errors: Errors
         * username:实体字段名  filed
         * errorCode:可以为"",但必须存在
         * defaultMessage：错误的内容
         */
        ValidationUtils.rejectIfEmpty(errors,"username","","姓名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"age","","年龄不能为空");

    }
}

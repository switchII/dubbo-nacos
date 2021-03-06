package com.dubbo.nacos.provider.framework.id;

import com.dubbo.nacos.api.enums.DnTableEnum;

/**
 * get unique id
 * @author 胡桃夹子
 * @date 2019-08-04 14:04
 */
public interface IdGenerator {

    /**
     * get unique id
     *
     * @param DNTableEnum TableEnum
     * @return 全局唯一ID
     */
    Long nextUniqueId(DnTableEnum DNTableEnum);

}

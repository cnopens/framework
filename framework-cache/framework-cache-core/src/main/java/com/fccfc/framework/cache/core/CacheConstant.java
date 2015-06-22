/**
 * 
 */
package com.fccfc.framework.cache.core;

/**
 * <Description> <br>
 * 
 * @author xgf<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年11月2日 <br>
 * @since V7.3<br>
 * @see com.fccfc.framework.common.constant <br>
 */

public interface CacheConstant {

    /**
     * 缓存模式:redis
     */
    String CACHE_MODEL_REDIS = "REDIS";

    /**
     * 数据库配置缓存
     */
    String CACHE_KEY_CONFIGITEM = "/CACHE_KEY_CONFIGITEM";

    /**
     * 缓存日志
     */
    String CACHE_LOGS = "/CACHE_LOGS";

    /** sql模板目录 */
    String SQL_DIR = "/SQL_TEMPLATE";

    /** dao 参数目录 */
    String SQL_PARAM_DIR = "/SQL_PARAM";

    /** 系统目录 */
    String SYSTEM_MENU_DIR = "/SYSTEM_MENU";

    /** 普通字符串目录 */
    String COMMON_DIR = "/COMMON_DIR";

    /** 模块代码 */
    String LOCAL_MODULE_CODE = "MODULE_CODE";

    /** 缓存时间 */
    String CONFIG_CACHE_TIME = "CONFIG_CACHE_TIME";

    /** 静态资源 */
    String RESOURCE = "/RESOURCE";

    /** 操作员 */
    String OPERATOR = "/OPERATOR";

    /** 区域 */
    String AREA = "/AREA";
}

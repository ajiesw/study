package com.kuer.study.utils;

import org.apache.ibatis.cache.Cache;

/**
 * 自定义缓存 实现Cache接口
 * @author kuer
 */
public class MyCache implements Cache {
    public String getId() {
        return null;
    }

    public void putObject(Object key, Object value) {

    }

    public Object getObject(Object key) {
        return null;
    }

    public Object removeObject(Object key) {
        return null;
    }

    public void clear() {

    }

    public int getSize() {
        return 0;
    }
}

package demo1.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试Collection接口的公共方法
 *      boolean add();添加元素,根据返回结果判断是否成功
 *      boolean remove();移除元素
 *      void clear();清除所有元素,根据返回结果判断是否成功
 *      boolean container(Object obj);判断是否存在某个元素
 *      int size();获取集合的大小（1-n）
 *      boolean isEmpty();判断集合是否为空
 *      Object[] toArray();集合转为Object类型的数组
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        coll.add("hello");
        coll.add("world");
        coll.add("milk");
        coll.add("sunshine");

        System.out.println(coll);

        // 移除某个元素
        /*coll.remove("hello");
        System.out.println(coll);*/

        // 清除全部元素
        /*coll.clear();
        System.out.println(coll);*/

        // 判断是否存在某个元素
        /*boolean flag = coll.contains("milk");
        System.out.println(flag);*/

        // 判断是否为空
        /*boolean flag = coll.isEmpty();
        System.out.println(flag);*/

        // 获取集合的大小（1-n）
        /*int size = coll.size();
        System.out.println(size);*/

        // 集合转换为数组
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}

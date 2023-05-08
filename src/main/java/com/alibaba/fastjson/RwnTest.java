package com.alibaba.fastjson;

import lombok.Data;

/**
 * @author wenan.ren
 * @date 2023/5/8 10:50
 * @Description
 */
public class RwnTest {

    public static void main(String[] args) {
        Person p1 = new Person("tom", "12", "shanxi");
        String json1 = JSONObject.toJSONString(p1);

        System.out.println(JSONObject.parse(json1));
        System.out.println(JSONObject.parseObject(json1));
        System.out.println(JSONObject.parseObject(json1, Person.class));

//        System.out.println(json1);
    }


    @Data
    static class Person {
        private String name;
        private String age;
        private String address;

        public Person() {
        }

        public Person(String name, String age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}

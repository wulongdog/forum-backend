package com.fwf_bbs.forumgenerator;

import com.fwf_bbs.forumgenerator.generators.Generator;

/**
 * @className DemoGenerator
 * @description demo 代码生成器
 * @auther wulongdog
 * @date 2022/10/3  19:57
 */
public class DemoGenerator {

    public static void main(String[] args) {

        new Generator("","","",new String[]{"forum-provider","forum-provider-admin"},new String[]{"t_note"}).action();
    }
}

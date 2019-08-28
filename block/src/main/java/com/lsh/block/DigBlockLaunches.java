package com.lsh.block;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;

/**
 * @知识星球  火星架构
 * @website https://www.fireflyi.com
 * @date 2019/8/28
 * DESC 挖区块操作
 */
public class DigBlockLaunches {

    public static ArrayList<Block> blockLink = new ArrayList<Block>();

    public static void main(String[] ad){
        int lv = 5;

        System.out.println("挖矿开始....");
        blockLink.add(new Block("0", "block1",lv));
        System.out.println("第一个区块");

        blockLink.add(new Block(blockLink.get(blockLink.size()-1).sign, "block2", lv));
        System.out.println("第"+blockLink.size()+"个区块check->"+BlockLinkUtil.checkBlockLink(blockLink));

        blockLink.add(new Block(blockLink.get(blockLink.size()-1).sign, "block3", lv));;
        System.out.println("第"+blockLink.size()+"个区块check->"+BlockLinkUtil.checkBlockLink(blockLink));

        String jstr = JSON.toJSONString(blockLink, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
        System.out.println("blockLink-> " + jstr);
    }


}

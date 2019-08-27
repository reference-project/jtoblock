package com.lsh.block;

/**
 * @author by fireflyi (6025606@qq.com)
 * @知识星球 火星架构
 * @website https://www.fireflyi.com
 * @date 2019/8/27
 * DESC 定义一个区块类
 */
public class Block {

    /**
     * 上一个区块签名
     */
    public String preSign;

    public String sign;

    public String data;

    /**
     * 生成一个区块
     * @param preSign1
     * @param data1
     */
    public Block(String preSign1, String data1){
        this.preSign = preSign1;
        this.data =  data1;
        this.sign = createSign();
    }


    public String createSign(){
        return Sha256Util.getSHA256(this.preSign+this.data);
    }

}

package com.lsh.block;

/**
 * @知识星球  火星架构
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

    public int wkc;

    /**
     * 生成一个区块
     * @param preSign1
     * @param data1
     */
    public Block(String preSign1, String data1, int lv){
        this.preSign = preSign1;
        this.data =  data1;
        this.sign = createSign();
        wkc(lv);
    }


    public String createSign(){
        return BlockLinkUtil.getSHA256(this.preSign+this.data+wkc);
    }

    public boolean wkc(int lv) {
        String target = new String(new char[lv]).replace('\0', '0');
        while(!sign.substring( 0, lv).equals(target)) {
            wkc ++;
            sign = createSign();
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new char[3]);
    }

}

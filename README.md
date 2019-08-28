###一个java实现的简单区块链源码
>可以用来参考学习区块链

### 2.功能实现
* [x] 定义区块链
* [x] 挖矿,检查区块链完整性
* [x] 区块链防篡改
* [] 钱包
* [] 交易

### 3.功能展示

#### 1.挖矿
```
挖矿开始....
第一个区块
第2个区块check->true
第3个区块check->true
blockLink-> [
	{
		"data":"block1",
		"preSign":"0",
		"sign":"000004b63b4170f0c1088a0d300570bac54e5109154312efafb9a07c561dd312",
		"wkc":2031324
	},
	{
		"data":"block2",
		"preSign":"000004b63b4170f0c1088a0d300570bac54e5109154312efafb9a07c561dd312",
		"sign":"0000099a324fe0a7343caa63947bb22b4fd07b7671e8d9958d73df75a6a7f88a",
		"wkc":41270
	},
	{
		"data":"block3",
		"preSign":"0000099a324fe0a7343caa63947bb22b4fd07b7671e8d9958d73df75a6a7f88a",
		"sign":"000008492aef8361981e0f7ec755bc81745d4637c916925aae5fa3df5d710dde",
		"wkc":12568
	}
]
```
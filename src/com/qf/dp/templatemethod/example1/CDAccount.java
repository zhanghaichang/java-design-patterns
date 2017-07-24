
package com.qf.dp.templatemethod.example1;

/**   
* @Title: CDAccount.java 
* @Package com.qf.dp.templatemethod.example1 
* @Description: TODO
* @author haichangzhang   
* @date 2017年7月24日 下午3:16:37 
* @version V1.0   
*/
public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		 return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterestRate() {
        return 0.06;
	}

}

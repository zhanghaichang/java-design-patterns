package com.qf.dp.builder;

/**
 * @Title: InsuranceContract.java
 * @Package com.qf.db.builder
 * @Description: 保险合同对象
 * @author haichangzhang
 * @date 2017年7月17日 下午2:45:35
 * @version V1.0
 */
public class InsuranceContract {

	private String contractId;

	private String personName;
	
	private String companyName;

	private long beginDate;

	private long endDate;

	private String otherData;

	private InsuranceContract(ConcreteBuilder builder) {
	    this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
	}

	public void someOperation() {
		System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");
	}

	/**
     * 构造方法，传入必须要有的参数
     * @param contractId     保险合同编号
     * @param beginDate        保险合同开始生效日期
     * @param endDate        保险合同失效日期
     */
	public static class ConcreteBuilder {
		private String contractId;
		private String personName;
		private String companyName;
		private long beginDate;
		private long endDate;
		private String otherData;

		public ConcreteBuilder(String contractId, long beginDate, long endDate) {
			this.contractId = contractId;
			this.beginDate = beginDate;
			this.endDate = endDate;
		}
		
	 //被保险人员的名称
	 public ConcreteBuilder setPersonName(String personName) {
	            this.personName = personName;
	            return this;
	        }
	 //被保险公司的名称
	 public ConcreteBuilder setCompanyName(String companyName) {
	            this.companyName = companyName;
	            return this;
	        }
	 //其他数据
	 public ConcreteBuilder setOtherData(String otherData) {
	            this.otherData = otherData;
	            return this;
	        }
	  /**
      * 构建真正的对象并返回
      * @return    构建的保险合同对象
      */
     public InsuranceContract build(){
         if(contractId == null || contractId.trim().length()==0){
             throw new IllegalArgumentException("合同编号不能为空");
         }
         boolean signPerson = (personName != null && personName.trim().length() > 0);
         boolean signCompany = (companyName != null && companyName.trim().length() > 0);
         if(signPerson && signCompany){
             throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
         }
         if(signPerson == false && signCompany == false){
             throw new IllegalArgumentException("一份保险合同不能没有签订对象");
         }
         if(beginDate <= 0 ){
             throw new IllegalArgumentException("一份保险合同必须有开始生效的日期");
         }
         if(endDate <=0){
             throw new IllegalArgumentException("一份保险合同必须有失效的日期");
         }
         if(endDate < beginDate){
             throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
         }
         return new InsuranceContract(this);
     }
	}
}

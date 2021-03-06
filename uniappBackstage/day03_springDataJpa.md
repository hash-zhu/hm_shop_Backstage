回顾
	i.springDatajpa，jpa规范，hibernate三者之间的关系
		code  -- > springDatajpa  --> jpa规范的API --> hibernate
	ii.符合springDataJpa规范的dao层接口的编写规则
		1.需要实现两个接口（JpaRepository，JapSpecificationExecutor）
		2.提供响应的泛型
	iii.运行过程
		* 动态代理的方式：动态代理对象
	iiii.查询

第一 Specifications动态查询

	JpaSpecificationExecutor 方法列表
	
		T findOne(Specification<T> spec);  //查询单个对象

		List<T> findAll(Specification<T> spec);  //查询列表

		//查询全部，分页
		//pageable：分页参数
		//返回值：分页pageBean（page：是springdatajpa提供的）
		Page<T> findAll(Specification<T> spec, Pageable pageable);

		//查询列表
		//Sort：排序参数
		List<T> findAll(Specification<T> spec, Sort sort);

		long count(Specification<T> spec);//统计查询
		
	* Specification ：查询条件
		自定义我们自己的Specification实现类
			实现
				//root：查询的根对象（查询的任何属性都可以从根对象中获取）
				//CriteriaQuery：顶层查询对象，自定义查询方式（了解：一般不用）
				//CriteriaBuilder：查询的构造器，封装了很多的查询条件
				Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb); //封装查询条件
		
第二 多表之间的关系和操作多表的操作步骤

	表关系
		一对一
		一对多：
			一的一方：主表
			多的一方：从表
			外键：需要在从表上新建一列作为外键，他的取值来源于主表的主键
		多对多：
			中间表：中间表中最少应该由两个字段组成，这两个字段做为外键指向两张表的主键，又组成了联合主键

	讲师对学员：一对多关系
			
	实体类中的关系
		包含关系：可以通过实体类中的包含关系描述表关系
		继承关系
	
	分析步骤
		1.明确表关系
		2.确定表关系（描述 外键|中间表）
		3.编写实体类，再实体类中描述表关系（包含关系）
		4.配置映射关系

第三 完成多表操作

	i.一对多操作
		案例：客户和联系人的案例（一对多关系）
			客户：一家公司
			联系人：这家公司的员工
		
			一个客户可以具有多个联系人
			一个联系人从属于一家公司
			
		分析步骤
			1.明确表关系
				一对多关系
			2.确定表关系（描述 外键|中间表）
				主表：客户表
				从表：联系人表
					* 再从表上添加外键
			3.编写实体类，再实体类中描述表关系（包含关系）
				客户：再客户的实体类中包含一个联系人的集合
				联系人：在联系人的实体类中包含一个客户的对象
			4.配置映射关系
				* 使用jpa注解配置一对多映射关系
	
		级联：
			操作一个对象的同时操作他的关联对象
			
			级联操作：
				1.需要区分操作主体
				2.需要在操作主体的实体类上，添加级联属性（需要添加到多表映射关系的注解上）
				3.cascade（配置级联）
			
			级联添加，
				案例：当我保存一个客户的同时保存联系人
			级联删除
				案例：当我删除一个客户的同时删除此客户的所有联系人
				
	ii.多对多操作
		案例：用户和角色（多对多关系）
			用户：
			角色：
	
		分析步骤
			1.明确表关系
				多对多关系
			2.确定表关系（描述 外键|中间表）
				中间间表
			3.编写实体类，再实体类中描述表关系（包含关系）
				用户：包含角色的集合
				角色：包含用户的集合
			4.配置映射关系
			
	iii.多表的查询
		1.对象导航查询
			查询一个对象的同时，通过此对象查询他的关联对象
			
			案例：客户和联系人
			
			从一方查询多方
				* 默认：使用延迟加载（****）
				
			从多方查询一方
				* 默认：使用立即加载
		
		
		
		
		
		
		
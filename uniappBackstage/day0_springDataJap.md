springdatajpa
day1:orm思想和hibernate以及jpa的概述和jpd的基本操作
day2：springdatajpa的运行原理以及基本操作
day3：多表操作，复杂查询

第一 orm思想
主要目的：操作实体类就相当于操作数据库表
建立两个映射关系：
实体类和表的映射关系
实体类中属性和表中字段的映射关系
不再重点关注：sql语句

	实现了ORM思想的框架：mybatis，hibernate

第二 hibernate框架介绍
Hibernate是一个开放源代码的对象关系映射框架，
它对JDBC进行了非常轻量级的对象封装，
它将POJO与数据库表建立映射关系，是一个全自动的orm框架

第三 JPA规范
jpa规范，实现jpa规范，内部是由接口和抽象类组成

第四 jpa的基本操作
案例：是客户的相关操作（增删改查）
客户：就是一家公司
客户表：

	jpa操作的操作步骤
		1.加载配置文件创建实体管理器工厂
			Persisitence：静态方法（根据持久化单元名称创建实体管理器工厂）
				createEntityMnagerFactory（持久化单元名称）
			作用：创建实体管理器工厂
			
		2.根据实体管理器工厂，创建实体管理器
			EntityManagerFactory ：获取EntityManager对象
			方法：createEntityManager
			* 内部维护的很多的内容
				内部维护了数据库信息，
				维护了缓存信息
				维护了所有的实体管理器对象
				再创建EntityManagerFactory的过程中会根据配置创建数据库表
			* EntityManagerFactory的创建过程比较浪费资源
			特点：线程安全的对象
				多个线程访问同一个EntityManagerFactory不会有线程安全问题
			* 如何解决EntityManagerFactory的创建过程浪费资源（耗时）的问题？
			思路：创建一个公共的EntityManagerFactory的对象
			* 静态代码块的形式创建EntityManagerFactory
			
		3.创建事务对象，开启事务
			EntityManager对象：实体类管理器
				beginTransaction : 创建事务对象
				presist ： 保存
				merge  ： 更新
				remove ： 删除
				find/getRefrence ： 根据id查询
				
			Transaction 对象 ： 事务
				begin：开启事务
				commit：提交事务
				rollback：回滚
		4.增删改查操作
		5.提交事务
		6.释放资源
	
	i.搭建环境的过程
		1.创建maven工程导入坐标
		2.需要配置jpa的核心配置文件
			*位置：配置到类路径下的一个叫做 META-INF 的文件夹下
			*命名：persistence.xml
		3.编写客户的实体类
		4.配置实体类和表，类中属性和表中字段的映射关系
		5.保存客户到数据库中
	ii.完成基本CRUD案例
		persist ： 保存
		merge ： 更新
		remove ： 删除
		find/getRefrence ： 根据id查询
		
	iii.jpql查询
		sql：查询的是表和表中的字段
		jpql：查询的是实体类和类中的属性
		* jpql和sql语句的语法相似
		
		1.查询全部
		2.分页查询
		3.统计查询
		4.条件查询
		5.排序
		
		
package top.suroot.base.datasource;

public class DataSourceContextHolder {

	public static final String DATA_SOURCE_A = "dataSourceA";
	public static final String DATA_SOURCE_B = "dataSourceB";
	public static final String DATA_SOURCE_C = "dataSourceC";
	public static final String DATA_SOURCE_D = "dataSourceD";
	// 线程本地环境
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	// 设置数据源类型
	public static void setDbType(String dbType) {
		// System.out.println("此时切换的数据源为："+dbType);
		contextHolder.set(dbType);
	}
	// 获取数据源类型 
	public static String getDbType() {
		return (contextHolder.get());
	}
	// 清除数据源类型 
	public static void clearDbType() {
		System.out.println("DataSource Aop Remove ====>"+contextHolder.get());
		contextHolder.remove();
	}
}
package top.suroot.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// Properties pps = System.getProperties();
		// pps.list(System.out);
//		Properties pps = new Properties();
//		pps.load(new FileInputStream("configure/config.properties"));
//		Enumeration enum1 = pps.propertyNames();// 得到配置文件的名字
//		while (enum1.hasMoreElements()) {
//			String strKey = (String) enum1.nextElement();
//			String strValue = pps.getProperty(strKey);
//			System.out.println(strKey + "=" + strValue);
//		}
//		//获取runtime对象（单例模式）  
//        Runtime run = Runtime.getRuntime();  
//        //在单独的进程中执行指定的字符串命令  
//        Process pro = run.exec("notepad.exe");  
//        //线程休息4秒  
//        Thread.sleep(4000);  
//        //销毁进程  
//        pro.destroy();  
		 Runtime r = Runtime.getRuntime(); 
		 
         long mem1,mem2; 
         Integer someints[] = new Integer[1000]; 
         System.out.println("Total memory is ：" + r.totalMemory()); 
         mem1 = r.freeMemory(); 
         System.out.println("Initial free is : " + mem1); 
         r.gc(); 
         mem1 = r.freeMemory(); 
         System.out.println("Free memory after garbage collection : " + mem1); 
         //allocate integers 
         for(int i=0; i<1000; i++) someints[i] = new Integer(i);    
         mem2 = r.freeMemory(); 
         System.out.println("Free memory after allocation : " + mem2); 
         System.out.println("Memory used by allocation : " +(mem1-mem2));    
         //discard Intergers 
         for(int i=0; i<1000; i++) someints[i] = null; 
         r.gc(); //request garbage collection 
         mem2 = r.freeMemory(); 
         System.out.println("Free memory after collecting " + "discarded integers : " + mem2);

	}

}

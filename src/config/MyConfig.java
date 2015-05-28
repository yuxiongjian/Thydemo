package config;

import com.jt.pojo.MobileLocation;
import com.jt.pojo.PODetail;
import com.jt.pojo.RecordCopy;
import com.jt.pojo.WorkOrder;
import com.jt.pojo.WorkRequest;

import project.config.Config;
import project.config.DebugSetting;
import project.config.DebugSetting.DEBUG;



public class MyConfig extends Config {
	//http://112.74.94.163/api
	//static String mainUrl = "http://lulu324.xicp.net";
	//static String testUrl = "http://lulu324.xicp.net";
	
	static String mainUrl = "http://112.74.94.163";
	static String testUrl = "http://112.74.94.163";
	public static String mainurls[]= new String[]{"",mainUrl+"/api/wo/workRequest!findWorkOrder.action"
	,mainUrl+"/api/wo/workRequest!findDelivery.action"
	,mainUrl+"/api/wo/repairHelp!find.action"
	,mainUrl+"/api/wo/repairHelp!find.action"
	,mainUrl+"/api/wo/workRequest!findTomorrowWorkOrder.action"};
	public static  Class<?>[] DBCLASS ={ MobileLocation.class, WorkOrder.class,WorkRequest.class, RecordCopy.class, PODetail.class};
	;
	public static String testurls[]= new String[]{"",testUrl+"/api/wo/workRequest!findWorkOrder.action"
		,testUrl+"/api/wo/workRequest!findDelivery.action"
		,testUrl+"/api/wo/repairHelp!find.action"
		,testUrl+"/api/wo/repairHelp!find.action"
		,testUrl+"/api/wo/workRequest!findTomorrowWorkOrder.action"};
	public static void init() {
		
		
		DebugSetting.debug = DEBUG.RELEASE; 真实模拟id = null;
		//DebugSetting.debug = DEBUG.LOCALDEBUG; 真实模拟id = null;
		SHAREDPREFERENCES = "thydemo";	
		String TAG = "Config";
		Config.mainUrl = mainUrl;
		Config.testUrl = testUrl;
		Config.UPDATE_SERVER = "http://"; 
		Config.UPDATE_APKNAME = "Thydemo.apk";
		Config.UPDATE_VERJSON = "Thydemo.json";
		Config.UPDATE_SAVENAME = "Thydemo.apk";
		Config.DBCLASS =DBCLASS;
		Config.DBNAME = "com_Thydemo";
		Config.DBVERSION = 30;

		mobileType="mobile";
		Config.ServiceUrl = mainUrl+"/api/jsonrpc/"+ mobileType;
		Config._diServiceUrl = "";
		Config._doServiceUrl = testUrl+"/api/jsonrpc/"+ mobileType;
		Config.mainUrl = mainUrl;
		Config.testUrl = testUrl;
		Config.testurls = testurls;
		Config.mainurls = mainurls;
		
		 

		
	}



	
}

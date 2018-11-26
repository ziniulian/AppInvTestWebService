package tk.ziniulian.until.test.testwebservice;

/**
 * webservice 测试
 * Created by LZR on 2018/11/26.
 */

public class TestWs {
	public static void main (String[] args) {
		WebSrv ws = new WebSrv("http://192.169.0.35:8888/room/DataWebServicePort?wsdl", "http://192.169.0.35:8888/");
		System.out.println(ws.qry("hello"));
		System.out.println(ws.qry("login_json"));
//		System.out.println(ws.qry("login_jsonResponse"));
		System.out.println(ws.qry("getrksqlist_json"));
	}
}

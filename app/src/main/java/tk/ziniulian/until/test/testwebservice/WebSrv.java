package tk.ziniulian.until.test.testwebservice;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * 访问WebService
 * Created by LZR on 2018/11/26.
 */

public class WebSrv {
	private String url;		// 服务地址
	private String npc;		// 命名空间

	public WebSrv (String u, String n) {
		this.url = u;
		this.npc = n;
	}

	public WebSrv setUrl(String url) {
		this.url = url;
		return this;
	}

	public String qry (String mnam) {
		return qry(mnam, null, null);
	}

	public String qry (String mnam, String[] ks, Object[] vs) {
		String r = null;

		SoapObject req = new SoapObject(npc, mnam);
		if (vs != null) {
			for (int i = 0; i < ks.length; i ++) {
				req.addProperty(ks[i], vs[i]);
			}
		}

		SoapSerializationEnvelope msg = new SoapSerializationEnvelope(SoapEnvelope.VER12);
		msg.bodyOut = req;
//		msg.dotNet = true;
		HttpTransportSE ht = new HttpTransportSE(url);
//		String soapAction = npc + mnam;
		try {
//			ht.call(soapAction, msg);
			ht.call(null, msg);
			SoapPrimitive res = (SoapPrimitive) msg.getResponse();
//			Object res = msg.getResponse();
			if (res != null) {
				r = res.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}
}
